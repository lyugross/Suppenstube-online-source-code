

const btn_formular = document.querySelector('.js-form');
const btn_impressum = document.querySelector('.js-impressum');
const btn_datenschutz = document.querySelector('.js-datenschutz');
const impressum = document.querySelector('.impressum');
const datenschutz = document.querySelector('.datenschutz');
const formular = document.querySelector('.form');
const close = document.querySelector('.close');
const dts_close = document.querySelector('.datenschutz-close');
const imp_close = document.querySelector('.impressum-close');
const foot_overlay=document.querySelector(".footer-overlay");
const overlay=document.querySelector(".js-overlay");
const button=document.querySelector('.button');
const drop=document.querySelector('.menu');

button.addEventListener('click', function(){
  drop.classList.add('open');
});
function closeMenue() {
  drop.classList.remove('open');
}


btn_impressum.addEventListener('click',function(){
  impressum.classList.add("isVisible");
  document.querySelector('.overlay-imp').classList.add("isVisible");
  document.body.classList.add("stop-scroll");
});
imp_close.addEventListener('click',function(){
  impressum.classList.remove("isVisible");
  document.querySelector('.overlay-imp').classList.remove("isVisible");
  document.body.classList.remove("stop-scroll");
});



btn_datenschutz.addEventListener('click',function(){
  datenschutz.classList.add("isVisible");
  document.querySelector('.overlay-dts').classList.add("isVisible");
  document.body.classList.add("stop-scroll");
});
dts_close.addEventListener('click',function(){
  datenschutz.classList.remove("isVisible");
  document.body.classList.remove("stop-scroll");
  document.querySelector('.overlay-dts').classList.remove("isVisible");
});



btn_formular.addEventListener('click',function(){
  formular.classList.add("isVisible");
  overlay.classList.add("hasOpacity");
  document.body.classList.add("stop-scroll");
});
close.addEventListener('click',function(){
  formular.classList.remove("isVisible");
  overlay.classList.remove("hasOpacity");
  document.body.classList.remove("stop-scroll");
});
