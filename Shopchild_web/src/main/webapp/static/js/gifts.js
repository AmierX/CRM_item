$(function () {

    $('#giftsTable').bootstrapTable({
        columns: [{
            checkbox:true
        },{
            field: 'gid',
            title: '编号'
        }, {
            field: 'gname',
            title: '赠品名称'
        }, {
            field: 'gtype',
            title: '赠品类型'
        }, {
            field: 'gnum',
            title: '赠品库存'
        }, {
            field: 'gprice',
            title: '赠品价格'
        }],
        url: "../gifts/selectAll",//get请求
        queryParamsType:'',
        //如果queryParamsType = 'limit'(默认)，则params对象包含：limit，offset，search，sort，order。
        // 否则，它包含：pageSize，pageNumber， searchText，sortName，sortOrder。返回false停止请求。

        dataField:"list",
        pageSize:3,
        sidePagination:"server",//从服务端获取数据
        toolbar: '#exampleTableEventsToolbar',
        pagination:'true',//设置true为在表格底部显示分页工具栏
        queryParams:function(params) {
            var queryParmas = $("#selectUserCondition").serializeJSON();//得到查询参数，目的为了分页带着参数
            return Object.assign(params,queryParmas);//json对象组合
        }
    });

    $("#conditionSelectBtn").click(function () {
        var params = $("#selectUserCondition").serializeJSON();
        $("#giftsTable").bootstrapTable('refresh',{query: params});
    });



    $("#addSaveBtn").click(function () {
        $('#myModal').modal('hide');
//      document.getElementById("addForm").reset();
        $.post("../gifts/addgift",$("#addForm").serialize(),function (data) {
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
        $.post("../gifts/updateGift",$("#updateForm").serialize(),function (data) {
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
            url: "../gifts/delgift",
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


});