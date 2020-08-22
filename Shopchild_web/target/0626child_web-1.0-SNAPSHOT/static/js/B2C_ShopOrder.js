$(function () {

    $('#usersTable').bootstrapTable({
        columns: [{
            field: 'b2cwId',
            title: '序号'
        }, {
            field: 'b2cwNum',
            title: '订单编号'
        }, {
            field: 'b2cwOrderType',
            title: '订单类型'
        }, {
            field: 'b2cwGoods',
            title: '商品清单'
        }, {
            field: 'b2cwService',
            title: '业务类型'
        }, {
            field: 'b2cwPayType',
            title: '支付方式'
        }, {
            field: 'b2cwPost',
            title: '配送方式'
        }, {
            field: 'b2cwPrderStatus',
            title: '订单状态'
        }, {
            title: '操作',
            formatter: function (value, row, index, field) {
                return "<button><a href='B2cSaleDetails.html?b2cNum="+row.b2cwNum+"'>查看</a></button>"
            }
        }],
        url: "../B2C/shoporder",//get请求
        queryParamsType: '',
        dataField: "list",
        pageSize: 5,
        sidePagination: "server",
        toolbar: '#usersTableToolBar',
        pagination: 'true',
        queryParams: function (params) {
            console.log(params);
            var queryParmas = $("#selectUserCondition").serializeJSON();//得到查询参数，目的为了分页带着参数
            return Object.assign(params, queryParmas);//json对象组合
        }
    });

    layui.use('upload', function(){
        var upload = layui.upload;
        //执行实例
        var uploadInst = upload.render({
            anto: 'true'
            ,accept: 'file'
            ,elem: '#test1' //绑定元素
            ,url: '../B2C/inputshoporder' //上传接口
            ,done: function(res){
                layer.msg("ok");
            }
            ,error: function(){
                layer.msg("error");
            }
        });
    });

    $("#conditionSelectBtn").click(function () {
        var params = $("#selectUserCondition").serializeJSON();
        $('#usersTable').bootstrapTable('refresh', {query: params});
    });
});

