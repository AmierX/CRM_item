$(function () {

    $('#usersTable').bootstrapTable({
        columns: [{
            checkbox:true
        },{
            field: 'id',
            title: '序号'
        }, {
            field: 'snumber',
            title: '订单编号'
        }, {
            field: 'applyname',
            title: '申请记录名称'
        }, {
            field: 'recorder',
            title: '记录人'
        }, {
            field: 'recorddate',
            title: '记录时间'
        }, {
            field: 'approver',
            title: '审批人'
        }, {
            field: 'approvedate',
            title: '审批时间'
        }, {
            field: 'status',
            title: '审批状态'
        }, {
            title: '操作',
            formatter:function(value,row,index,field){
                return "<button>审核</button>"
            }
        }],
        url: "../salesreturn/show",//get请求
        queryParamsType:'',
        dataField:"list",
        pageSize:10,
        sidePagination:"server",
        toolbar: '#exampleTableEventsToolbar',
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