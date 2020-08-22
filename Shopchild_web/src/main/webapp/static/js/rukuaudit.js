$(function () {

    $('#usersTable').bootstrapTable({
        columns: [{
            checkbox:true
        },{
            field: 'id',
            title: '序号'
        }, {
            field: 'rukudanhao',
            title: '入库单编号'
        }, {
            field: 'rukustatus',
            title: '入库状态'
        }, {
            field: 'zhidanren',
            title: '制单人'
        }, {
            field: 'zhidandate',
            title: '制单时间'
        }, {
            field: 'approver',
            title: '审批人'
        }, {
            field: 'approveopinion',
            title: '审核意见'
        }, {
            field: 'approvestatus',
            title: '审核状态'
        }, {
            title: '操作',
            formatter:function(value,row,index,field){
                return "<button><a href='rukuaudit1.html?id="+row.id+"'>审核</a></button>"
            }
        }],
        url: "../Returnfactoryruku/show",//get请求
        treeView: true,//是否显示树形视图
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