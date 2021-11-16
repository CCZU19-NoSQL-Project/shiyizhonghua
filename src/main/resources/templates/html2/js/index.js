window.onload = function () {

    //默认的显示图片索引位置
    var index = 0;
    //获取导航点
    var oPoints = document.querySelectorAll(".point");
    //给默认索引位置的导航点添加样式
    oPoints[index].style.backgroundColor = "black";
    //获取图片列表
    var oListImg = document.querySelectorAll("li");


    /*
        为每一个超链添加事件，实现图片跳转
    */


    //刷新导航点函数
    function upDatePoint(obj) {

        if(index >= oListImg.length - 1){
            index = 0;
            oUl.style.left = -1010*index +"px";
        }

        for (var i = 0; i < obj.length; i++) {
            obj[i].style.backgroundColor = "";
        }
        obj[index].style.backgroundColor = "black";
    }



    //获取图片的父元素对象。
    var oUl = document.querySelector("ul");

    for (var i = 0; i < oPoints.length; i++) {
        oPoints[i].num = i;
        oPoints[i].onclick = function () {
            clearInterval(timer);
            //将触发的索引值赋值给index
            index = this.num;
            //切换图片
            // oUl.style.left = -1010*index +"px";
            //使用动效函数来实现切换图片动画效果
            move(oUl, "left", 30, -1010 * index,setTimer());
            //自动修改导航点位置
            upDatePoint(oPoints);
            
        }
    }


    //设置个自切换定时器函数
    var timer;
    function setTimer() {

       timer = setInterval(() => {
            //索引自变化。
            index++;
            index %= oListImg.length;
            //执行切换图片动效
            move(oUl, "left", 30, -1010 * index, function () {
                upDatePoint(oPoints);
            });
        }, 1000);
    }

    setTimer();



}