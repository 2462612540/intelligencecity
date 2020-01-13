var swiper = new Swiper('.swiper-container', {
    pagination: {
      el:'.swiper-pagination',
    },
});
new WOW().init();

//返回顶部
$(function(){
    $("#goTop").hide();
    $(window).scroll(function(){ 
        if ($(window).scrollTop()>100){ 
            $("#goTop").fadeIn(1500); 
        } 
        else{ 
            $("#goTop").fadeOut(1500); 
        } 
    });
    $("#goTopBtn").click(function(){
        $('body,html').animate({scrollTop:0},500); 
        return false; 
    });
});
