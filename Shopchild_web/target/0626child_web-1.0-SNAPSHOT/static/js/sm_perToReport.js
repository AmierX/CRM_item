$(function () {

    window.onload = function () {
        $.get("../perToReport/init", function (data) {
            console.log(data.datas);
            $.each(data.datas.smSysduties, function (i, d) {
                var postAppend = "<option value='" + d.duname + "'>" + d.duname + "</option>";
                $("#ppost").append(postAppend);
            })
            $.each(data.datas.smSysdepts, function (i, d) {
                var dnameAppend = "<option value='" + d.dname + "'>" + d.dname + "</option>";
                $("#pdept").append(dnameAppend);
            })
            $.each(data.datas.smSysroles, function (i, d) {
                var roleAppend = "<option value='" + d.rname + "'>" + d.rname + "</option>";
                $("#prole").append(roleAppend);
            })
        })
    }

    //进行table表格初始化
    $('#ptrTable').bootstrapTable({
        columns: [{
            checkbox: true
        }, {
            field: 'pid',
            title: '序号'
        }, {
            field: 'pacc',
            title: '用户登录名'
        }, {
            field: 'pname',
            title: '用户姓名'
        }, {
            field: 'pdept',
            title: '归属部门'
        }, {
            field: 'pstatus',
            title: '用户状态'
        }, {
            field: 'ppost',
            title: '用户职务'
        }, {
            field: 'prole',
            title: '用户角色'
        }, {
            field: 'paname',
            title: '权限名称'
        }, {
            field: 'poperation',
            title: '可执行操作'
        }],
        url: "../perToReport",//get请求
        queryParamsType: 'mina',
        dataField: "list",
        pageSize: 3,
        sidePagination: "server",
        toolbar: '#ptrTableToolbar',
        pagination: 'true',
        queryParams: function (params) {
            console.log(params);
            var queryParmas = $("#searchForm").serializeJSON();//得到查询参数，目的为了分页带着参数
            return Object.assign(params, queryParmas);//json对象组合
        }
    });

    $(".searchBtn").click(function () {
        var params = $("#searchForm").serializeJSON();
        $('#smamTable').bootstrapTable('refresh', {query: params});
    });

    $("#exportBtn").click(function () {
        $.get("../perToReport/exportexcel",function (data) {
            if(data.status==20003){
                layer.msg("导出成功！E:/testExcel/perToReport.xlsx");
            }
        })
    })
})