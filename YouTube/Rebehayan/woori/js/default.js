  $(document).ready(function(){
  var swiper = new Swiper('.slide1', {
    slidesPerView: 1,
    spaceBetween: 30,
    loop: true,
    pagination: {
      el: '.paging1',
      clickable: true,
    },
    navigation: {
      nextEl: '.slide1 .slide_btn_next',
      prevEl: '.slide1 .slide_btn_prev',
    },
  });

  var swiper2 = new Swiper('.slide2', {
    slidesPerView: 1,
    loop: true,
    navigation: {
      nextEl: '.slide2 .next',
      prevEl: '.slide2 .prev',
    },
  });
});