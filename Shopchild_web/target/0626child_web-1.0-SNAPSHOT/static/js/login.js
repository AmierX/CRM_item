$(function () {

    window.onload = function () {
        $.get("user/userinit",function (data) {
            console.log(data.datas);
            $.each(data.datas.smSysdepts,function (i,d) {
                var deptAppend = "<option value='"+d.dname+"'>"+d.dname+"</option>";
                $("#addudept").append(deptAppend);
            })
            $.each(data.datas.smSysduties,function (i,d) {
                var dutyAppend = "<option value='"+d.duname+"'>"+d.duname+"</option>";
                $("#addupost").append(dutyAppend);
            })
            $.each(data.datas.smSysroles,function (i,d) {
                var roleAppend = "<option value='"+d.rname+"'>"+d.rname+"</option>";
                $("#addurole").append(roleAppend);
            })
        })
    }

    $("#loginOK").click(function() {
        $.post("user",$("#loginForm").serialize(),
            function(data) {
                if (data.status == 20001) {
                    location.href = "page/index.html";
                } else if(data.status == 50001){
                    $("#showRes").html(data.ms);
                }
            });
    })

    //用户信息添加
    $("#registerBtn").click(function () {
        console.log("sadsfsdf");
        $("#addModal").modal('show');
    })
    $("#addSaveBtn").click(function () {
        $('#addModal').modal('hide');
        $.get("user/addUser",$("#addForm").serialize(),function (data) {
            if(data.status==20003){
                layer.msg("用户信息添加成功");
            }else{
                layer.msg("用户信息添加失败");
            }
        })
    });

})