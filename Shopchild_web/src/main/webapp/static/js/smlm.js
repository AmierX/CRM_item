$(function () {

    window.onload = function () {
        $.get("../smlm/smlminit",function (data) {
            console.log(data.datas);
            $.each(data.datas.smSyslogs,function (i,d) {
                var moduleAppend = "<option value='"+d.lmodule+"'>"+d.lmodule+"</option>";
                var contextAppend = "<option value='"+d.lcontext+"'>"+d.lcontext+"</option>";
                $("#lmodule").append(moduleAppend);
                $("#lcontext").append(contextAppend);
            })
        })
    }

    //进行table表格初始化
    $('#smlmTable').bootstrapTable({
        columns: [{
            field: 'lid',
            title: '序号'
        }, {
            field: 'ltime',
            title: '操作时间'
        }, {
            field: 'lname',
            title: '访问用户名'
        }, {
            field: 'lmodule',
            title: '访问模块'
        }, {
            field: 'lcontext',
            title: '操作内容'
        }],
        url: "../smlm",//get请求
        queryParamsType:'mina',
        dataField:"list",
        pageSize:3,
        sidePagination:"server",
        toolbar: '#smlmTableToolbar',
        pagination:'true',
        queryParams:function(params) {
            console.log(params);
            var queryParmas = $("#searchForm").serializeJSON();//得到查询参数，目的为了分页带着参数
            return Object.assign(params,queryParmas);//json对象组合
        }
    });

    $(".searchBtn").click(function () {
        var params = $("#searchForm").serializeJSON();
        $('#smlmTable').bootstrapTable('refresh',{query: params});
    });

});