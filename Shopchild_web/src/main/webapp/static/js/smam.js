$(function () {

    window.onload = function () {
        $.get("../smam/smaminit",function (data) {
            console.log(data.datas);
            $.each(data.datas.smOperations,function (i,d) {
                var operationAppend = "<input type='checkbox' name='aoperation' value='"+d.oname+"'>"+d.oname;
                $("#addaoperation").append(operationAppend);
                $("#updateaoperation").append(operationAppend);
            })
            $.each(data.datas.smAuthorities,function (i,d) {
                var rauthorityAppend = "<option value='"+d.aname+"'>"+d.aname+"</option>";
                $("#aname").append(rauthorityAppend);
                $("#addaname").append(rauthorityAppend);
                $("#updateaname").append(rauthorityAppend);
            })
            $.each(data.datas.smSysroles,function (i,d) {
                var roleAppend = "<option value='"+d.rname+"'>"+d.rname+"</option>";
                $("#addrname").append(roleAppend);
                $("#updatername").append(roleAppend);
            })
        })
    }

    //进行table表格初始化
    $('#smamTable').bootstrapTable({
        columns: [{
            checkbox:true
        },{
            field: 'aid',
            title: '序号'
        }, {
            field: 'aname',
            title: '权限名称'
        }, {
            field: 'rname',
            title: '角色名称'
        }, {
            field: 'asec',
            title: '权限描述'
        }, {
            field: 'astatus',
            title: '权限状态'
        }, {
            field: 'aoperation',
            title: '可执行操作'
        }],
        url: "../smam",//get请求
        queryParamsType:'mina',
        dataField:"list",
        pageSize:3,
        sidePagination:"server",
        toolbar: '#smamTableToolbar',
        pagination:'true',
        queryParams:function(params) {
            console.log(params);
            var queryParmas = $("#searchForm").serializeJSON();//得到查询参数，目的为了分页带着参数
            return Object.assign(params,queryParmas);//json对象组合
        }
    });

    $(".searchBtn").click(function () {
        var params = $("#searchForm").serializeJSON();
        $('#smamTable').bootstrapTable('refresh',{query: params});
    });

    //用户信息添加
    $("#addBtn").click(function () {
        $("#addModal").modal('show');
    })
    $("#addSaveBtn").click(function () {
        $('#addModal').modal('hide');
//      document.getElementById("addForm").reset();
        $.get("../smam/addAuthority",$("#addForm").serialize(),function (data) {
            if(data.status==20003){
                layer.msg("用户信息添加成功");
                $('#smamTable').bootstrapTable('refresh');
            }else{
                layer.msg("用户信息添加失败");
            }
        })
    });

    //用户信息修改
    $("#updateBtn").click(function () {
        var rows = $('#smamTable').bootstrapTable('getSelections');

        if(rows.length!=1){
            layer.msg('请选中一行进行编辑操作');
        }else{
            var selectUserInfo = rows[0];
            //得到选中行的数据.
            for(key in selectUserInfo){
                $(`#updateForm input[name=${key}]`).val(selectUserInfo[key]);
            }
            $('#updateModal').modal('show');
        }
    });

    $("#updateSaveBtn").click(function () {
        $('#updateModal').modal('hide');
        $.ajax({
            type: "PUT",
            url: "../smam",
            data: $("#updateForm").serialize(),
            success: function(data){
                if(data.status==20004){
                    layer.msg("用户信息修改成功");
                    $('#smamTable').bootstrapTable('refresh');
                }else{
                    layer.msg("用户信息修改失败");
                }
            }
        });
    })


    //用户信息删除
    $("#delBtn").click(function () {
        var rows = $('#smamTable').bootstrapTable('getSelections');
        if(rows.length==0){
            layer.msg('请选中记录进行删除');
            return;
        }
        var aids=[];
        for(row in rows){
            aids.push(rows[row].aid);
        }

        $.ajax({
            type: "DELETE",
            url: "../smam",
            data: "aids="+aids.join(","),
            success: function(data){
                if(data.status==20005){
                    layer.msg('删除用户成功！');
                    $('#smamTable').bootstrapTable('refresh');
                }else{
                    layer.msg('删除用户失败！');
                }
            }
        });
    })
});