$(function () {

    $('#usersTable').bootstrapTable({
        columns: [{
            checkbox:true
        },{
            field: 'b2cId',
            title: '序号'
        }, {
            field: 'b2cNum',
            title: '订单编号'
        }, {
            field: 'b2cOrderType',
            title: '订单类型'
        }, {
            field: 'b2cOrderHandle',
            title: '订单动作'
        }, {
            field: 'b2cService',
            title: '业务类型'
        }, {
            field: 'b2cPayType',
            title: '支付方式'
        }, {
            field: 'b2cPost',
            title: '配送方式'
        }, {
            field: 'b2corderStatus',
            title: '订单状态'
        }, {
            title: '操作',
            formatter:function(value,row,index,field){
                return "<button><a href='B2cSaleDetails.html?b2cNum="+row.b2cNum+"'>查看</a></button>"
            }
        }],
        url: "../B2C/salesorder",//get请求
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

    $("#exportBtn").click(function () {
        $.get("../B2C/exportexcel",function (data) {
            if(data.status==20003){
                layer.msg("导出成功！E:/testExcel/Saleorder.xlsx");
            }
        })
    })

    $(".test").click(function () {
        var param = $('#usersTable').bootstrapTable('getSelections');
        var data=JSON.stringify(param);
        console.log(data);
        $.post("../B2C/exportexcel",data,function (data) {
            if(data.status==20003){
                layer.msg("导出成功！E:/testExcel/Saleorder.xlsx");
            }
        })
    })

});