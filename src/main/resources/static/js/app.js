/**
 * Created by josh on 4/11/17.
 */
$(document).ready(function () {
	let count = 0;
	let match = "";

	$(".flippable").click(function (e) {
		$(this).toggleClass("flipme");

		const imgPath = this.querySelectorAll("img")[0].src;
		const index = imgPath.lastIndexOf("/");
		const img = imgPath.substring(index + 1, imgPath.length - 4);

		if(match === ""){
			match = img;
			console.log(match)
		}
		else{
			if(match === img){
				const x = this.querySelectorAll("img").src;
				match = "";
				console.log(match)
			}else{
				setTimeout(function() {
					$(this).toggleClass("flipme");
				}, 500 * 5);

			}
		}

		//console.log(img);

	});

});

function newHead(id) {

	if(id === 'head'){
		const x = document.getElementById(id);
		x.style.background ='green';
	}else {
		const x = document.getElementsByTagName('h2')[0];
		x.style.background ='red';

	}

}