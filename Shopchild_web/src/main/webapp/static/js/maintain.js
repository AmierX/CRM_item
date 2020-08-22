function updateBtn() {
    layer.msg("我只是个装饰品");
};

$(function () {

    var cityidx;
    var countyidx;

    $('#usersTable').bootstrapTable({
        columns: [{
            checkbox:true
        },{
            field: 'id',
            title: '序号'
        }, {
            field: 'companyname',
            title: '公司名称'
        }, {
            field: 'companysite',
            title: '公司地点'
        }, {
            field: 'hotline',
            title: '热线电话'
        }, {
            title: '操作',
            formatter:function(value,row,index,field){
                return "<button onclick='updateBtn()'>修改</button>"
            }
        }],
        url: "../Maintenancepoint/show",//get请求
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


    $.each(temp, function(i,d) {
        var myoption = '<option value="'+d.code+'">'+d.label+'</option>';
        $("#province").append(myoption);// 遍历出所有的省份  添加到省级列表
    });
    $("#province").on("change",function(){
        $("#city").html("<option>------请选择------</option>");//初始化选择框
        $("#county").html("<option>------请选择------</option>");//初始化选择框
        $.each(temp, function(i,d) {
            if(d.code==$("#province").val()) cityidx = i;//找到已经选择的省份,把对应的编号赋值给cityidx
        });
        $.each(temp[cityidx].children, function(i,d) { //根据省份编号找出对应省份下的市
            var myoption = '<option value="'+d.code+'">'+d.label+'</option>';
            $("#city").append(myoption);//把遍历出来的所有城市添加到市级下拉列表
        });
    });
    $("#city").on("change",function(){
        $("#county").html("<option>------请选择------</option>");//初始化选择框
        $.each(temp[cityidx].children, function(i,d){
            if(d.code==$("#city").val()) countyidx = i;//找到已经选择的城市,把对应的编号赋值给countyidx
        });
        $.each(temp[cityidx].children[countyidx].children,function(i,d){//根据城市编号找出对应的县
            var myoption = '<option value="'+d.code+'">'+d.label+'</option>';
            $("#county").append(myoption);//吧遍历到的所有的县添加到县级下拉列表
        })
    });






    $("#addSaveBtn").click(function () {
        $('#myModal').modal('hide');
//      document.getElementById("addForm").reset();
        $.post("../Maintenancepoint/add",$("#addForm").serialize(),function (data) {
            if(data.status==20003){
                layer.msg("添加成功");
                $('#usersTable').bootstrapTable('refresh');
            }else{
                layer.msg("添加失败");
            }
        })
        document.getElementById("addForm").reset();
    });

    $("#updateBtn").click(function () {
        var rows = $('#usersTable').bootstrapTable('getSelections');

        if(rows.length!=1){
            layer.msg('请选中一行进行编辑操作');
        }else{
            var selectUserInfo =rows[0]
            //得到选中行的数据.
            for(key in selectUserInfo){
                $(`#updateForm input[name=${key}]`).val(selectUserInfo[key]);
            }
            $('#userInfoModal').modal('show')
        }
    });

    $("#updateSaveBtn").click(function () {
        $('#userInfoModal').modal('hide');
        $.post("../Maintenancepoint/update",$("#updateForm").serialize(),function (data) {
            if(data.status==20004){
                layer.msg("修改成功");
                $('#usersTable').bootstrapTable('refresh');
            }else{
                layer.msg("修改失败");
            }
        })
    })


    $("#delBtn").click(function () {
        var rows = $('#usersTable').bootstrapTable('getSelections');
        if(rows.length==0){
            layer.msg('请选中记录进行删除');
            return;
        }
        var mids=[];
        for(row in rows){
            mids.push(rows[row].id);
        }

        $.ajax({
            type: "DELETE",
            url: "../Maintenancepoint/delete",
            data: "mids="+mids.join(","),
            success: function(data){
                if(data.status==20005){
                    layer.msg('删除用户成功！');
                    $('#usersTable').bootstrapTable('refresh');
                }else{
                    layer.msg('删除用户失败！');
                }
            }
        });
    })


});