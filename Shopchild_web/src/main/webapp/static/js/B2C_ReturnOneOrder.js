$(function () {

    $('#usersTable').bootstrapTable({
        columns: [{
            field: 'b2crdNum',
            title: '序号'
        }, {
            field: 'b2crdId',
            title: '订单编号'
        }, {
            field: 'b2crdInitName',
            title: '订单类型'
        },{
            field: 'b2crdInitName',
            title: '物流单号'
        }, {
            field: 'b2crdInitDate',
            title: '订单动作'
        }, {
            title: '操作',
            formatter:function(value,row,index,field){
                return "<button><a href='B2cReturnOneDetails.html?b2cNum="+row.b2crdId+"'>查看</a>"
            }
        }],
        url: "../B2C/returnoneorder",//get请求
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