$(function () {

    $('#usersTable').bootstrapTable({
        columns: [{
            checkbox:true
        },{
            field: 'id',
            title: '序号'
        }, {
            field: 'outkudan',
            title: '出库单编号'
        }, {
            field: 'outkustatus',
            title: '出库状态'
        }, {
            field: 'zhidanren',
            title: '制单人'
        }, {
            field: 'zhidandate',
            title: '制单时间'
        }, {
            field: 'approver',
            title: '审批人'
        }, {
            field: 'approvedate',
            title: '审批时间'
        }, {
            field: 'approvestatus',
            title: '审批状态'
        }, {
            title: '操作',
            formatter:function(value,row,index,field){
                return "<button>审核跟踪</button>"
            }
        }],
        url: "../Returnfactorychuku/show",//get请求
        treeView: true,//是否显示树形视图
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

    $("#addBtn").click(function () {
        window.location.href = 'addChuKu.html';
    });


    $("#exportBtn").click(function () {
        $.post("../Returnfactorychuku/exportexcel","",function (data) {
            if(data.status==20003){
                layer.msg("导出成功");
            }else{
                layer.msg("导出失败");
            }
        })
    });




    $("#updateBtn").click(function () {
        var rows = $('#usersTable').bootstrapTable('getSelections');
        console.log("出库状态---"+rows);
        if(rows.length!=1){
            layer.msg('请选中一行进行编辑操作');
        }else if(rows[0].approvestatus == "已审核"){
            layer.msg('已审核的数据禁止修改');
        } else{
            var selectUserInfo =rows[0];
            //得到选中行的数据.
            for(key in selectUserInfo){
                $(`#updateForm input[name=${key}]`).val(selectUserInfo[key]);
            }
            $('#userInfoModal').modal('show')
        }
    });

    $("#updateSaveBtn").click(function () {
        $('#userInfoModal').modal('hide');
        $.post("../Returnfactorychuku/update",$("#updateForm").serialize(),function (data) {
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
        var uids=[];
        for(row in rows){
            uids.push(rows[row].id);
        }

        $.ajax({
            type: "DELETE",
            url: "../Returnfactorychuku/delete",
            data: "uids="+uids.join(","),
            success: function(data){
                if(data.status==20005){
                    layer.msg('删除用户成功！');
                    $('#usersTable').bootstrapTable('refresh');
                }else{
                    layer.msg('删除用户失败！');
                }
            }
        });
    })


});