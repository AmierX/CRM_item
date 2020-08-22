$(function () {

    $('#usersTable').bootstrapTable({
        columns: [{
            checkbox:true
        },{
            field: 'id',
            title: '序号'
        }, {
            field: 'outkudan',
            title: '出库单编号'
        }, {
            field: 'outkustatus',
            title: '出库状态'
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
            field: 'approvedate',
            title: '审批时间'
        }, {
            field: 'approvestatus',
            title: '审批状态'
        }, {
            title: '操作',
            formatter:function(value,row,index,field){
                return "<button><a href='chukuaudit1.html?id="+row.id+"'>审核</a></button>";
            }
        }],
        url: "../Returnfactorychuku/show",//get请求
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


    $("#exportBtn").click(function () {
        $.post("../Returnfactorychuku/exportexcel",$("#selectUserCondition").serializeJSON(),function (data) {
            if(data.status==20003){
                layer.msg("导出成功");
            }else{
                layer.msg("导出失败");
            }
        })
    });




});