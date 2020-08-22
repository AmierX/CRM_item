$(function () {

    $('#usersTable').bootstrapTable({
        columns: [{
            field: 'b2crId',
            title: '序号'
        }, {
            field: 'b2crOrderNum',
            title: '订单编号'
        }, {
            field: 'b2cSaleorder.b2cService',
            title: '订单类型'
        }, {
            field: 'b2cSaleorder.b2cOrderHandle',
            title: '订单动作'
        }, {
            field: 'b2crOrderType',
            title: '订单状态'
        }, {
            field: 'b2crReason',
            title: '原因'
        }, {
            title: '操作',
            formatter:function(value,row,index,field){
                return "<button><a href='B2cSaleDetails.html?b2cNum="+row.b2crOrderNum+"'>查看</a></button><button><a href='B2cReturnOneDetails.html?b2cNum="+row.b2crOrderNum+"'>生成退货单</a></button>"
            }
        }],
        url: "../B2C/returnorder",//get请求
        queryParamsType:'',
        dataField:"list",
        pageSize:5,
        sidePagination:"server",
        toolbar: '#usersTableToolBar',
        pagination:'true',
        queryParams:function(params) {
            var queryParmas = $("#selectUserCondition").serializeJSON();//得到查询参数，目的为了分页带着参数
            return Object.assign(params,queryParmas);//json对象组合
        }
    });

    $("#conditionSelectBtn").click(function () {
        var params = $("#selectUserCondition").serializeJSON();
        $('#usersTable').bootstrapTable('refresh',{query: params});
    });
});