$(function () {
    window.onload = function (){
        $.get("../smdm/init",function (data) {
            $.each(data,function (i,d) {
                var deptTable = " <tr><td><input type='checkbox' name='depttable' value='"+d[0].id+"'></td><td>"+d[0].dname+"</td><td>现有"+d[1]+"人</td></tr>";
                $("#deptshow").append(deptTable);
            })
        })
    }

    //部门添加
    $("#addBtn").click(function () {
        $("#addModal").modal('show');
    })
    $("#addSaveBtn").click(function () {
        $('#addModal').modal('hide');
        $.get("../smdm/addDept",$("#addForm").serialize(),function (data) {
            if(data.status==20003){
                layer.msg("部门添加成功");
                history.go(0);
            }else{
                layer.msg("部门添加失败");
            }
        })
    });

    //部门修改
    $("#updateBtn").click(function () {
        var length = $("input[type='checkbox']:checked").length;

        if(length!=1){
            layer.msg('请选中一行进行编辑操作');
        }else{
            var value = $("input[type='checkbox']:checked").val();
            console.log(value);
            var data = {"id":value};
            $.get("../smdm",data,function (data) {
                console.log(data);
                $("#updateid").val(data.smSysdept.id);
                $("#updatedname").val(data.smSysdept.dname);
                $("#updatedisok").val(data.smSysdept.disok);
            })
            $('#updateModal').modal('show');
        }
    });

    $("#updateSaveBtn").click(function () {
        $('#updateModal').modal('hide');
        $.ajax({
            type: "PUT",
            url: "../smdm",
            data: $("#updateForm").serialize(),
            success: function(data){
                if(data.status==20004){
                    history.go(0);
                    layer.msg("部门信息修改成功");
                }else{
                    layer.msg("部门信息修改失败");
                }
            }
        });
    })

});