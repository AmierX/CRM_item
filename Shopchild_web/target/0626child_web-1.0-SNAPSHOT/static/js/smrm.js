$(function () {

    window.onload = function () {
        $.get("../smrm/smrminit",function (data) {
            console.log(data.datas);
            $.each(data.datas.smSysdepts,function (i,d) {
                var deptAppend = "<option value='"+d.dname+"'>"+d.dname+"</option>";
                $("#rdept").append(deptAppend);
                $("#addrdept").append(deptAppend);
                $("#updaterdept").append(deptAppend);
            })
            $.each(data.datas.smAuthorities,function (i,d) {
                var rauthorityAppend = "<input type='checkbox' name='rauthority' value='d.aname'>"+d.aname;
                $("#addrauthority").append(rauthorityAppend);
                $("#updaterauthority").append(rauthorityAppend);
            })
            $.each(data.datas.smSysroles,function (i,d) {
                var roleAppend = "<option value='"+d.rname+"'>"+d.rname+"</option>";
                $("#addrname").append(roleAppend);
                $("#updatername").append(roleAppend);
            })
        })
    }

    //进行table表格初始化
    $('#smrmTable').bootstrapTable({
        columns: [{
            checkbox:true
        },{
            field: 'rid',
            title: '序号'
        }, {
            field: 'rencod',
            title: '角色编码'
        }, {
            field: 'rname',
            title: '角色名称'
        }, {
            field: 'rdec',
            title: '角色描述'
        }, {
            field: 'rstatus',
            title: '角色状态'
        }, {
            field: 'rdept',
            title: '角色部门'
        }, {
            field: 'rauthority',
            title: '权限设定'
        }],
        url: "../smrm",//get请求
        queryParamsType:'mina',
        dataField:"list",
        pageSize:3,
        sidePagination:"server",
        toolbar: '#smrmTableToolbar',
        pagination:'true',
        queryParams:function(params) {
            console.log(params);
            var queryParmas = $("#searchForm").serializeJSON();//得到查询参数，目的为了分页带着参数
            return Object.assign(params,queryParmas);//json对象组合
        }
    });

    $(".searchBtn").click(function () {
        var params = $("#searchForm").serializeJSON();
        $('#smrmTable').bootstrapTable('refresh',{query: params});
    });

    //角色信息添加
    $("#addBtn").click(function () {
        $("#addModal").modal('show');
    })
    $("#addSaveBtn").click(function () {
        $('#addModal').modal('hide');
//      document.getElementById("addForm").reset();
        $.get("../smrm/addRole",$("#addForm").serialize(),function (data) {
            if(data.status==20003){
                layer.msg("角色信息添加成功");
                $('#smrmTable').bootstrapTable('refresh');
            }else{
                layer.msg("角色信息添加失败");
            }
        })
    });

    //角色信息修改
    $("#updateBtn").click(function () {
        var rows = $('#smrmTable').bootstrapTable('getSelections');

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
            url: "../smrm",
            data: $("#updateForm").serialize(),
            success: function(data){
                if(data.status==20004){
                    layer.msg("角色信息修改成功");
                    $('#smrmTable').bootstrapTable('refresh');
                }else{
                    layer.msg("角色信息修改失败");
                }
            }
        });
    })


    //角色信息删除
    $("#delBtn").click(function () {
        var rows = $('#smrmTable').bootstrapTable('getSelections');
        if(rows.length==0){
            layer.msg('请选中记录进行删除');
            return;
        }
        var rids=[];
        for(row in rows){
            rids.push(rows[row].rid);
        }

        $.ajax({
            type: "DELETE",
            url: "../smrm",
            data: "rids="+rids.join(","),
            success: function(data){
                if(data.status==20005){
                    layer.msg('删除角色成功！');
                    $('#smrmTable').bootstrapTable('refresh');
                }else{
                    layer.msg('删除角色失败！');
                }
            }
        });
    })

});