// element생성 : createElement();
// textNode생성 : createTextNode();
// 부모-자식 관계 형성 : appendChild();

let frm = document.createElement('form');
frm.setAttribute('action', 'addMember.jsp');
frm.setAttribute('method', 'POST');

let label_id = document.createElement('label');
label_id.setAttribute('for', 'user_id');
label_id.innerText = '사용자아이디';
frm.appendChild(label_id);

let input_id = document.createElement('input');
input_id.setAttribute('type', 'text');
input_id.setAttribute('name', 'user_id');
input_id.setAttribute('id', 'user_id');
input_id.setAttribute('autofocus', '/');
frm.appendChild(input_id);

let label_pw = document.createElement('label');
label_pw.setAttribute('for', 'user_pw')
label_pw.innerText = '비밀번호';
frm.appendChild(label_pw);

let input_pw = document.createElement('input');
input_pw.setAttribute('type', 'password');
input_pw.setAttribute('name', 'user_pw');
input_pw.setAttribute('id', 'user_pw');
frm.appendChild(input_pw);

let logbutton = document.createElement('button');
logbutton.innerText = '로그인';

let p = document.createElement('p');
frm.appendChild(p);
p.appendChild(logbutton);

console.log(frm)

document.getElementById('show').appendChild(frm);