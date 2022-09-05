// mysource.js
// 등록
document.addEventListener('DOMContentLoaded', function() {

	let addBtn = document.getElementById('addBtn');
	addBtn.addEventListener('click', addBoardFcn);

	let checkall = document.querySelector('#allcheck');
	checkall.addEventListener('change', allChecked);

	let chks = document.querySelectorAll('tbody input[type="checkbox"]');
	chks.forEach(check => {
		check.addEventListener('change', disChecked)
	})

});


function addBoardFcn() {
	let title = document.getElementById('title').value;
	let content = document.getElementById('content').value;
	let writer = document.getElementById('writer').value;
	let param = 'title=' + title + '&content=' + content + '&writer=' + writer + '&select=insert';
	console.log(param);
	let addAjax = new XMLHttpRequest();
	addAjax.open('post', './board');
	addAjax.setRequestHeader('Content-type', 'application/x-www-form-urlencoded');
	addAjax.send(param);
	addAjax.onload = addBoardCallback;
}

function addBoardCallback() {
	console.log(this.responseText);
	let result = JSON.parse(this.responseText);
	console.log(this.reponseText);
	if (result.retCode == 'success') {
		let list = document.getElementById('list');
		list.append(makeTr(result));
	} else {
		alert('에러')
	}
}

let xhtp = new XMLHttpRequest();
xhtp.open('get', './board');
xhtp.send();
xhtp.onload = function() {
	let data = JSON.parse(xhtp.response);

	let list = document.getElementById('list');
	data.forEach(data => {
		let tr = makeTr(data);
		list.append(tr);
	});
}

function makeTr(data) {
	console.log(data);
	let tr = document.createElement('tr');

	let td = document.createElement('td');
	let check = document.createElement('input');
	check.setAttribute('type', 'checkbox');
	td.appendChild(check);
	check.onclick = function(event) {
		if (event.target.checked) {
			let bno = this.parentElement.parentElement.firstElementChild.nextElementSibling.textContent
			let delBtn = document.getElementById('delBtn');
			delBtn.addEventListener('click', delbutton);
			function delbutton() {
				let param = 'bno=' + bno + '&select=delete';
				let delAjax = new XMLHttpRequest();
				delAjax.open('post', './board');
				delAjax.setRequestHeader('Content-type', 'application/x-www-form-urlencoded');
				delAjax.send(param);
				delAjax.onload = function(e) {
					let result = delAjax.responseText;
					if (result == 'success') {
						but.parentElement.parentElement.remove();
					} else {
						alert('에러 발생');
					}
				}
			}
		}
	}

	let td0 = document.createElement('td');
	let txt0 = document.createTextNode(data.bno);
	td0.appendChild(txt0);

	let td1 = document.createElement('td');
	let txt = document.createTextNode(data.title);
	td1.appendChild(txt);

	let td2 = document.createElement('td');
	let txt1 = document.createTextNode(data.content);
	td2.appendChild(txt1);

	let td3 = document.createElement('td');
	let txt2 = document.createTextNode(data.writer);
	td3.appendChild(txt2);

	let td4 = document.createElement('td');
	let txt3 = document.createTextNode(data.date);
	td4.appendChild(txt3);

	let td5 = document.createElement('td');
	let but = document.createElement('button');
	but.addEventListener('click', function() {
		let param = 'bno=' + this.parentElement.parentElement.firstElementChild.nextElementSibling.textContent + '&select=delete';
		console.log(param);
		let delAjax = new XMLHttpRequest();
		delAjax.open('post', './board');
		delAjax.setRequestHeader('Content-type', 'application/x-www-form-urlencoded');
		delAjax.send(param);
		delAjax.onload = function(e) {
			let result = delAjax.responseText;
			if (result == 'success') {
				but.parentElement.parentElement.remove();
			} else {
				alert('에러 발생');
			}
		}
	})
	let txt4 = document.createTextNode('삭제');
	but.appendChild(txt4);
	td5.appendChild(but);

	tr.append(td, td0, td1, td2, td3, td4, td5);
	return tr;
}

function allChecked() {
	let chks = document.querySelectorAll('tbody input[type="checkbox"]');
	chks.forEach(check => {
		check.checked = this.checked
	})
}

function disChecked() {
	let checkProp = document.querySelectorAll('tbody input[type="checkbox"]');
	// [...chechProp] checkProp값을 배열로 담겠다.
	// 배열의 값이 모두(every()) true면 true.
	document.getElementById('allcheck').checked = [...checkProp].every(item => item.checked);
}
