/**
 * Created by 30947 on 2018/7/20.
 */
$(function () {
    nav();
});

//导航条点击添加样式
function nav() {
    $(".nav>ul>li").hover(function () {
        $(this).find(".li_ul").stop(true, true).slideDown("slow");
        stop();
    }, function () {
        $(this).find(".li_ul").slideUp("slow");
    })
}