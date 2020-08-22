var param;
$(document).ready(function() {
    $.get("../B2C/returnorderdetails?b2cNum="+window.location.href.split("?")[1].split("=")[1],
        function(data){
            console.log(data.datas.Addressee[0]);
            param = data;
            $("#b2cNum").html(param.datas.Saleorder[0].b2cNum);
            $("#b2cInitDate").html(param.datas.Saleorder[0].b2cInitDate);
            $("#b2cService").html(param.datas.Saleorder[0].b2cService);
            $("#b2cOrderHandle").html(param.datas.Saleorder[0].b2cOrderHandle);
            $("#b2cPayType").html(param.datas.Saleorder[0].b2cPayType);
            $("#b2cdorderStatus").html(param.datas.Saleorder[0].b2cdorderStatus);
            $("#b2cOrderType").html(param.datas.Saleorder[0].b2cOrderType);
            $("#adName").html(param.datas.Addressee[0].adName);
            $("#adPCode").html(param.datas.Addressee[0].adPCode);
            $("#adMoblePhone").html(param.datas.Addressee[0].adMoblePhone);
            $("#adAddress").html(param.datas.Addressee[0].adAddress);
            $("#adPostMoney").html(param.datas.Addressee[0].adPostMoney);
            $("#b2crdInitDate").html(param.datas.Returgood[0].b2crdInitDate);
            $("#b2crReason").html(param.datas.B2cReturnorders[0].b2crReason);
        });

});
$(function () {
    $('#table3').bootstrapTable({
        columns: [
            [{
                'title': '订单商品信息', 'colspan':4
            }],[{
                field: 'b2cgCode',
                title: '商品编号'
            },{
                field: 'b2cgName',
                title: '商品名称'
            },{
                field: 'b2cgPrice',
                title: '单价'
            },{
                field: 'b2cgNum',
                title: '数量'
            }]
        ],
        url: "../B2C/selectgoods?b2cNum="+window.location.href.split("?")[1].split("=")[1],//get请求
        queryParamsType:'',
        dataField:"list",
        pageSize:10,
        sidePagination:"server",
        toolbar: '#table3ToolBar',
        pagination:'true',
        queryParams:function(params) {
            var queryParmas = $("#selectUserCondition").serializeJSON();//得到查询参数，目的为了分页带着参数
            return Object.assign(params,queryParmas);//json对象组合
        }
    });
    $("#returnbtn").click(function(){
        window.location.href="javascript:history.go(-1)";
    })
});