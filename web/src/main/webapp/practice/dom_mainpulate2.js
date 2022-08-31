let back = document.querySelector('button');
back.setAttribute('onclick', 'location.href="dom.html"');

let btn = document.querySelector('#on');
btn.setAttribute('onclick', 'liston()');

function liston() {
    let tr = document.createElement('tr');
    let tdid = document.createElement('td');
    let tdpw = document.createElement('td');
    let tdtel = document.createElement('td');

    let id1 = document.getElementById('mid').value;
    tdid.innerText = id1;

    let name1 = document.getElementById('mname').value;
    tdpw.innerText = name1;

    let tel1 = document.getElementById('mtel').value;
    tdtel.innerText = tel1;

    if (!id1 || !name1 || !tel1) {
        alert('값을 입력하세요')
        return; // 함수종료
    } else {
        tr.appendChild(tdid);
        tr.appendChild(tdpw);
        tr.appendChild(tdtel);
    }

    document.getElementById('list').appendChild(tr);

    // 초기화
    mid.value = '';
    mname.value = '';
    mtel.value = '';
    mid.focus();
};

let btn2 = document.querySelector('#on1');
btn2.onclick = function () {
    let tr = document.createElement('tr');
    let id1 = document.getElementById('mid').value;
    let name1 = document.getElementById('mname').value;
    let tel1 = document.getElementById('mtel').value;

    const mValues = [id1, name1, tel1];

    if (!id1 || !name1 || !tel1) {
        alert('값을 입력하세요')
        return; // 함수종료
    } else {
        mValues.forEach(val => {
            let td = document.createElement('td');
            let txt = document.createTextNode(val);
            td.appendChild(txt);
            tr.appendChild(td);
        });
        document.getElementById('list').appendChild(tr);
    }

    // 초기화
    mid.value = '';
    mname.value = '';
    mtel.value = '';
    mid.focus();
};