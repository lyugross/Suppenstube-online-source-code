


function openModal() {
    document.querySelector('.galerie-modal').classList.add("isVisible");
    var source = event.target;
    let image = new Image();
    image.src=source;
    image.setAttribute("class", "modal-image");
}
