window.onload = function(){
	var item = document.getElementsByClassName("item");
	var it = item[0].getElementsByTagName("div");
	
	var content = document.getElementsByClassName("content");
	var con = content[0].getElementsByTagName("div");
	
	for(let i=0;i<it.length;i++){
		it[i].onclick = function(){
			for(let j=0;j<it.length;j++){
				it[j].className = '';
				con[j].style.display = "none";
			}
			this.className = "active";
			it[i].index=i;
			con[i].style.display = "block";
		}
	}
}
