$(function () {

    window.onload = function () {
        $.get("../smum/smuminit",function (data) {
            console.log(data.datas);
            $.each(data.datas.smSysdepts,function (i,d) {
                var deptAppend = "<option value='"+d.dname+"'>"+d.dname+"</option>";
                $("#udept").append(deptAppend);
                $("#addudept").append(deptAppend);
                $("#updateudept").append(deptAppend);
            })
            $.each(data.datas.smSysduties,function (i,d) {
                var dutyAppend = "<option value='"+d.duname+"'>"+d.duname+"</option>";
                $("#upost").append(dutyAppend);
                $("#addupost").append(dutyAppend);
                $("#updateupost").append(dutyAppend);
            })
            $.each(data.datas.smSysroles,function (i,d) {
                var roleAppend = "<option value='"+d.rname+"'>"+d.rname+"</option>";
                $("#urole").append(roleAppend);
                $("#addurole").append(roleAppend);
                $("#updateurole").append(roleAppend);
            })
        })
    }

    //进行table表格初始化
    $('#smumTable').bootstrapTable({
        columns: [{
            checkbox:true
        },{
            field: 'uid',
            title: '序号'
        }, {
            field: 'uacc',
            title: '用户登录名'
        }, {
            field: 'uname',
            title: '用户姓名'
        }, {
            field: 'udept',
            title: '归属部门'
        }, {
            field: 'status',
            title: '用户状态'
        }, {
            field: 'upost',
            title: '用户职务'
        }, {
            field: 'uphone',
            title: '手机号码'
        }, {
            field: 'urole',
            title: '角色'
        }],
        url: "../smum",//get请求
        queryParamsType:'mina',
        dataField:"list",
        pageSize:3,
        sidePagination:"server",
        toolbar: '#smumTableToolbar',
        pagination:'true',
        queryParams:function(params) {
            console.log(params);
            var queryParmas = $("#searchForm").serializeJSON();//得到查询参数，目的为了分页带着参数
            return Object.assign(params,queryParmas);//json对象组合
        }
    });

    $(".searchBtn").click(function () {
        var params = $("#searchForm").serializeJSON();
        $('#smumTable').bootstrapTable('refresh',{query: params});
    });

    //用户信息添加
    $("#addBtn").click(function () {
        $("#addModal").modal('show');
    })
    $("#addSaveBtn").click(function () {
        $('#addModal').modal('hide');
//      document.getElementById("addForm").reset();
        $.get("../smum/adduser",$("#addForm").serialize(),function (data) {
            if(data.status==20003){
                layer.msg("用户信息添加成功");
                $('#smumTable').bootstrapTable('refresh');
            }else{
                layer.msg("用户信息添加失败");
            }
        })
    });

    //用户信息修改
    $("#updateBtn").click(function () {
        var rows = $('#smumTable').bootstrapTable('getSelections');

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
            url: "../smum",
            data: $("#updateForm").serialize(),
            success: function(data){
                if(data.status==20004){
                    layer.msg("用户信息修改成功");
                    $('#smumTable').bootstrapTable('refresh');
                }else{
                    layer.msg("用户信息修改失败");
                }
            }
        });
    })


    //用户信息删除
    $("#delBtn").click(function () {
        var rows = $('#smumTable').bootstrapTable('getSelections');
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
            url: "../smum",
            data: "uids="+uids.join(","),
            success: function(data){
                if(data.status==20005){
                    layer.msg('删除用户成功！');
                    $('#smumTable').bootstrapTable('refresh');
                }else{
                    layer.msg('删除用户失败！');
                }
            }
        });
    })


});