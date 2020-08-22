
function updateBtn() {
    layer.msg("我只是个装饰品");
};

$(function () {

    $('#usersTable').bootstrapTable({
        columns: [{
            checkbox:true
        },{
            field: 'id',
            title: '序号'
        }, {
            field: 'snumber',
            title: '订单编号'
        }, {
            field: 'applyname',
            title: '申请记录名称'
        }, {
            field: 'recorder',
            title: '记录人'
        }, {
            field: 'recorddate',
            title: '记录时间'
        }, {
            field: 'approver',
            title: '审批人'
        }, {
            field: 'approvedate',
            title: '审批时间'
        }, {
            field: 'status',
            title: '审批状态'
        }, {
            title: '操作',
            formatter:function(value,row,index,field){
                return "<a href='javascript:void(0)' onclick='updateBtn()'>修改</a>"
            }
        }],
        url: "../salesreturn/show",//get请求
        queryParamsType:'',
        dataField:"list",
        pageSize:10,
        sidePagination:"server",
        toolbar: '#exampleTableEventsToolbar',
        pagination:'true',
        queryParams:function(params) {
            var queryParmas = $("#selectUserCondition").serializeJSON();//得到查询参数，目的为了分页带着参数
            return Object.assign(params,queryParmas);//json对象组合
        }
    });

    $("#conditionSelectBtn").click(function () {
        var params = $("#selectUserCondition").serializeJSON();
        $('#usersTable').bootstrapTable('refresh',{query: params});
    });




    $("").click(function () {
        $.post("../salesreturn/add",$("#addForm").serialize(),function (data) {
            if(data.status==20003){
                layer.msg("添加成功");
                $('#usersTable').bootstrapTable('refresh');
            }else{
                layer.msg("添加失败");
            }
        })
    });

    $("#updateBtn").click(function () {
        var rows = $('#usersTable').bootstrapTable('getSelections');

        if(rows.length!=1){
            layer.msg('请选中一行进行编辑操作');
        }else if(rows[0].status == "已审核"){
            layer.msg('已审核的数据禁止修改');
        } else{
            var selectUserInfo =rows[0]
            //得到选中行的数据.
            for(key in selectUserInfo){
                $(`#updateForm input[name=${key}]`).val(selectUserInfo[key]);
            }
            $('#userInfoModal').modal('show')
        }
    });

    $("#updateSaveBtn").click(function () {
        $('#userInfoModal').modal('hide');
        $.post("../salesreturn/update",$("#updateForm").serialize(),function (data) {
            if(data.status==20004){
                layer.msg("修改成功");
                $('#usersTable').bootstrapTable('refresh');
            }else{
                layer.msg("修改失败");
            }
        })
    })


    $("#delBtn").click(function () {
        var rows = $('#usersTable').bootstrapTable('getSelections');
        if(rows.length==0){
            layer.msg('请选中记录进行删除');
            return;
        }
        var tids=[];
        for(row in rows){
            tids.push(rows[row].id);
        }

        $.ajax({
            type: "DELETE",
            url: "../salesreturn/delete",
            data: "tids="+tids.join(","),
            success: function(data){
                if(data.status==20005){
                    layer.msg('删除成功！');
                    $('#usersTable').bootstrapTable('refresh');
                }else{
                    layer.msg('删除失败！');
                }
            }
        });
    })


});