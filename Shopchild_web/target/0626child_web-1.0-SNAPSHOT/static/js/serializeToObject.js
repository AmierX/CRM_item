//封装原生jquery方法 把[{name:aaa,value:"aaa"},{name:aaa,value:"aaa"}]  转换成[aaa:"aaa",aaa:"aaa",aaa:"aaa"]的形式
//解决因为使用@requestBody,严格要求json格式造成请求进不去控制器
function serializeToObject(jsonArray){
    var o = {};
    $.each(jsonArray, function() {
        if (o[this.name] !== undefined) {
            if (!o[this.name].push) {
                o[this.name] = [o[this.name]];
            }
            o[this.name].push(this.value || '');
        } else {
            o[this.name] = this.value || '';
        }
    });
    return o;
}
