
$(function (){

    $("td,th").addClass("text-center");

    $('.btn-danger').click(function (){
        // console.log($(this).parent().siblings());
        var id =  parseInt($(this).parent().siblings().eq(0).text());
        // console.log(id,typeof(id));
        if (confirm("确定删除id:"+id+"用户?")) {
            //点击确定后操作
            $.ajax({
                type: 'get',
                url: 'deleteUser.action?id=' + id,
                success: function (data) {
                    if (data===1){
                        window.location.reload()
                        alert("删除成功")
                    }else{
                        alert("删除失败")
                    }
                }
            })
        }
    })


})