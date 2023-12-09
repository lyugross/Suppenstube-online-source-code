
  const nav = document.querySelector('#nav');
  let topOfNav = nav.offsetTop;

  function fixNav() {
    if (window.scrollY >= topOfNav) {
      nav.classList.add('fixed-nav');
    } else {
      nav.classList.remove('fixed-nav');
    }
  }

  window.addEventListener('scroll', fixNav);
// while (window.innerWidth<=600) {
//     window.removeEventListener('scroll', fixNav);
// }
