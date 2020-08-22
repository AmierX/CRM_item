$(function () {
    $("#giftsTable").bootstrapTable({
        columns:[{
            checkbox:true},
            {
                field: "gid",
                title: "编号"
            }, {
                field: "gname",
                title: "赠品名称"
            },{
                field: "gitype",
                title: "赠品类型"
            },{
                field: "gnum",
                title: "赠品数量"
            }, {
                field: "gprice",
                title: "赠品价格"
            },{
                field: "gstaus",
                title: "审核状态"
        }],
        url:"../giftToGood/select",
        queryParamsType:"abc",
        dataField:"list",
        pageSize:3,
        sidePagination:"server",
        toolbar:"#exampleTableEventsToolbar",
        pagination:"true",
        queryParams:function (params) {
            var queryInfo = $("#selectUserCondition").serializeJSON();
            return Object.assign(params,queryInfo);
        }
        });
    $("#conditionSelectBtn").click(function () {
        var params = $("#selectUserCondition").serializeJSON();
        $("#giftsTable").bootstrapTable('refresh',{query: params});
    });
    })

    $("#addSaveBtn").click(function () {
        $('#myModal').modal('hide');
//      document.getElementById("addForm").reset();
        $.post("../giftToGood/add",$("#addForm").serialize(),function (data) {
            if(data.status==20003){
                layer.msg("添加成功");
                $('#giftsTable').bootstrapTable('refresh');
            }else{
                layer.msg("添加失败");
            }
        })
    });

    $("#updateBtn").click(function () {
        var rows = $('#giftsTable').bootstrapTable('getSelections');

        if(rows.length!=1){
            layer.msg('请选中一行进行编辑操作');
        }else{
            var selected =rows[0]
            //得到选中行的数据.
            for(key in selected){
                $(`#updateForm input[name=${key}]`).val(selected[key]);
            }
            $('#userInfoModal').modal('show')
        }
    });

    $("#updateSaveBtn").click(function () {
        $('#userInfoModal').modal('hide');
        $.post("../giftToGood/update",$("#updateForm").serialize(),function (data) {
            if(data.status==20004){
                layer.msg("修改成功");
                $('#giftsTable').bootstrapTable('refresh');
            }else{
                layer.msg("修改失败");
            }
        })
    })


    $("#delBtn").click(function () {
        var rows = $('#giftsTable').bootstrapTable('getSelections');
        if(rows.length==0){
            layer.msg('请选中记录进行删除');
            return;
        }
        var gids=[];
        for(row in rows){
            gids.push(rows[row].gid);
        }

        $.ajax({
            type: "DELETE",
            url: "../giftToGood/delete",
            data: "gids="+gids.join(","),
            success: function(data){
                if(data.status==20005){
                    layer.msg('删除用户成功！');
                    $('#giftsTable').bootstrapTable('refresh');
                }else{
                    layer.msg('删除用户失败！');
                }
            }
        });
    })
