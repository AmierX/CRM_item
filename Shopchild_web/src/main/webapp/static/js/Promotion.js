$(function () {

    $('#usersTable').bootstrapTable({
        columns: [{
            checkbox:true
        },{
            field: 'sid',
            title: '序号'
        }, {
            field: 'sname',
            title: '活动名称'
        }, {
            field: 'sprice',
            title: '价格'
        }, {
            field: 'sstime',
            title: '开始时间'
        }, {
            field: 'sotime',
            title: '结束时间'
        }, {
            field: 'sapproval',
            title: '审核状态'
        }, {
            title: '操作',
            formatter:function(value,row,index,field){
                return "<button class='btn btn-default'><a href='B2cSaleDetails.html?b2cNum="+row.sid+"'>查看</a></button>" +
                    "<button class='btn btn-default'><a href='B2cSaleDetails.html?b2cNum="+row.sid+"'>审核跟踪</a></button>"
            }
        }],
        url: "../promotion",//get请求
        queryParamsType:'',
        dataField:"list",
        pageSize:5,
        sidePagination:"server",
        toolbar: '#usersTableToolBar',
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

    $(".debtn").click(function () {
        var rows = $('#usersTable').bootstrapTable('getSelections');

        $.ajax({
            type: "DELETE",
            url: "../promotion",
            data: "sid="+rows[0].sid,
            success: function(data){
                if(data.status==20005){
                    layer.msg("删除成功!");
                }else{
                    layer.msg("删除失败！");
                }
            }
        });
    })

    $(".updatebtn").click(function () {
        var rows = $('#usersTable').bootstrapTable('getSelections');
        $("#formtype").val("update");
        if(rows.length!=1){
            layer.msg('请选中一行进行编辑操作');
        }else{
            var selected =rows[0]
            console.log(selected)
            //得到选中行的数据.
            for(key in selected){
                $(`#addForm input[name=${key}]`).val(selected[key]);
            }
            $('#myModal').modal('show')
        }
    })

    $(".add").click(function () {
        $('#myModal').modal('show');
        $("#formtype").val("add");
    })

    $("#SaveBtn").click(function () {
        $('#myModal').modal('hide');
        var formtype=$("#formtype").val();
        if(formtype=="add"){
            $.ajax({
                type: "POST",
                url: "../promotion",
                data: $("#addForm").serialize(),
                success: function(data){
                    if(data.status==20003){
                        layer.msg("添加成功!");
                    }else{
                        layer.msg("添加失败！");
                    }
                }
            });
        }else{
            $.ajax({
                type: "PUT",
                url: "../promotion",
                data: $("#addForm").serialize(),
                success: function(data){
                    if(data.status==20004){
                        layer.msg("修改成功!");
                    }else{
                        layer.msg("修改失败！");
                    }
                }
            });
        }
    });
});