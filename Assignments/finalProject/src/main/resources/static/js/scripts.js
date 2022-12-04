function ajaxCall(){
	fetch('http://localhost:8080/currentcount')
	.then((response) => response.json())
  	.then((data) => $("#count").text(data));
}
$(document).ready(function () {
    setInterval(ajaxCall, 3000);
});