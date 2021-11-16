//封装移动函数
//move(需要移动对象)
//speed (数值越大，速度越快)
//target (终止位置)
function move(obj, attr, speed, target, callback) {
    //将timer定义为对象中的属性后，调用时也需要加上对象名。
    obj.timer;
    clearInterval(obj.timer);

    //获取当前元素的位置，用于确定移动方向
    var current = parseInt(getComputedStyle(obj)[attr]);
    //当元素由0~800移动时，速度应为正值， 终点位置 > 当前位置
    //当元素由800 ~ 0 移动时，速度应为负值 ，  终点位置 < 当前位置
    if (current > target) {
        speed = -speed;
    }

    obj.timer = setInterval(() => {
        //获取box原来的left的值。
        var oldValue = parseInt(getComputedStyle(obj)[attr]);
        var newValue = oldValue + speed;
        if (speed < 0 && newValue < target || speed > 0 && newValue > target) {
            newValue = target;
        }
        obj.style[attr] = newValue + "px";

        if (newValue == target) {
            clearInterval(obj.timer);
            //最后才执行回调函数
            //与逻辑实现，有函数才调用，没有就不调用
            callback && callback();
        }
    }, 10);
}

