function parClicked(event) {
	event.target.innerHTML = "Paragraphe";
}
function buttonClicked(event) {
	console.log("button clicked");
	console.log(event.target);
}
const para = Array.from(document.querySelectorAll(".c1"));
for (const par of para) {
	par.addEventListener("click", parClicked);
}
const btnClear = document.querySelector("#idClear");
btnClear.addEventListener("click", buttonClicked);