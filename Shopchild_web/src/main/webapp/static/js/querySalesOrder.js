$(function () {

    $('#usersTable').bootstrapTable({
        columns: [{
            checkbox:true
        },{
            field: 'id',
            title: '用户id'
        }, {
            field: 'ordernumber',
            title: '用户名'
        }, {
            field: 'ordertype',
            title: '手机号'
        }, {
            field: 'orderaction',
            title: '手机号'
        }, {
            field: 'businesstype',
            title: '手机号'
        }, {
            field: 'payment',
            title: '手机号'
        }, {
            field: 'distribution',
            title: '手机号'
        }, {
            field: 'orderstatus',
            title: '手机号'
        }, {
            title: '操作',
            formatter:function(value,row,index,field){
                return "<a href='javascript:void(0)'>修改</a>"
            }
        }],
        url: "../server/salesorder",//get请求
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




    $("#addSaveBtn").click(function () {
        $('#myModal').modal('hide');
//      document.getElementById("addForm").reset();
        $.post("../user/adduser",$("#addForm").serialize(),function (data) {
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
        }else{
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
        $.post("../user/updateuser",$("#updateForm").serialize(),function (data) {
            if(data.status==20001){
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
            uids.push(rows[row].uid);
        }

        $.ajax({
            type: "DELETE",
            url: "../user/deleteuser",
            data: "uids="+uids.join(","),
            success: function(data){
                if(data.status==20002){
                    layer.msg('删除用户成功！');
                    $('#usersTable').bootstrapTable('refresh');
                }else{
                    layer.msg('删除用户失败！');
                }
            }
        });
    })


});