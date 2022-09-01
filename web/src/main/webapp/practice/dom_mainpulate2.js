const members = [{
        id: 'admin',
        name: '홍길동',
        phone: '010-1234-1234'
    },
    {
        id: 'user_1',
        name: '최길동',
        phone: '010-1234-2345'
    },
    {
        id: 'user_2',
        name: '김길동',
        phone: '010-1234-3456'
    }
]

document.addEventListener('DOMContentLoaded', function () {

    console.log(document.querySelector('tr'))

    showMember();

    //등록버튼 이벤트.
    let addBtn = document.querySelector('#on');
    addBtn.addEventListener('click', addMember);

    let findBtn = document.querySelector('#find');
    findBtn.addEventListener('click', find);

    let checkall = document.querySelector('#allcheck');
    checkall.addEventListener('change', allChecked);

    let chks = document.querySelectorAll('tbody input[type="checkbox"]');
    chks.forEach(check => {
        check.addEventListener('change', disChecked)
    })

}); // dom요소에 이벤트 등록.

function showMember() {
    let table = document.getElementById('list');
    members.forEach(mem => {
        let mValues = [];
        // for (let prop in mem) {
        //     mValues.push(mem[prop])
        // }
        mValues = Object.values(mem);
        let tr = makeTr(mValues);
        table.appendChild(tr);
    });
}

function addMember() {
    let mid = document.getElementById('mid');
    let mname = document.getElementById('mname');
    let mphone = document.getElementById('mphone');
    console.log(mid.value, mname.value, mphone.value);

    // 저장값이 없으면 warning.
    if (!mid.value || !mname.value || !mphone.value) {
        alert('필수값을 입력하세요!!!');
        return; // 함수종료.
    }

    const mValues = [mid.value, mname.value, mphone.value]

    let tr = makeTr(mValues);

    document.getElementById('list').appendChild(tr);

    // 초기화.
    mid.value = '';
    mname.value = '';
    mphone.value = '';
    mid.focus();
} // end of addMember().

function makeTr(mValues) {
    let tr = document.createElement('tr');

    tr.addEventListener('click', function () {
        let id = this.firstElementChild.innerText;
        let name = this.firstElementChild.nextElementSibling.innerText;
        let phone = this.children[2].innerText;
        document.getElementById('mid').value = id;
        document.getElementById('mname').value = name;
        document.getElementById('mphone').value = phone;
    }, false) // true = 부모 -> 자식 이벤트 전파 default = false : 자식노드 -> 부모

    mValues.forEach(val => {
        let td = document.createElement('td'); // id위치 <td>user1</td>
        let txt = document.createTextNode(val);
        td.appendChild(txt); // <td>user1</td>
        tr.appendChild(td); // <tr><td>user1</td></tr>
    });

    let btn = document.createElement('button');
    let txt = document.createTextNode('삭제');

    btn.addEventListener('click', function (e) { // e = 들어오는 event
        this.parentElement.parentElement.remove(); // btn < td < tr
        e.stopPropagation(); // 상위 이벤트를 받지 않겠다.
    }, false);

    let td = document.createElement('td');
    btn.appendChild(txt);
    td.appendChild(btn);
    tr.appendChild(td);

    let td1 = document.createElement('td');
    let check = document.createElement('input');
    check.setAttribute('type', 'checkbox');
    td1.appendChild(check);
    tr.appendChild(td1);


    check.addEventListener('click', function (e) {
        e.stopPropagation()
    })

    return tr;
}

function find() {
    // let id = document.getElementsByTagName('tbody')[0].children;// tagname은 컬렉션 값이어서 인덱스 필수
    let id = document.querySelectorAll('tbody>tr')
    let id1 = document.querySelector('#mid').value;
    let name1 = document.querySelector('#mname').value;
    let phone1 = document.querySelector('#mphone').value;

    id.forEach(a => {
        a.removeAttribute('class');
    });

    id.forEach(a => {
        if (a.children[0].textContent == id1) {
            a.setAttribute('class', 'focus')
            if (name1 != '') {
                a.children[1].textContent = name1;
            }
            if (phone1 != '') {
                a.children[2].textContent = phone1;
            }
        }
    });

    for (let i = 0; i < id.length; i++) {
        let id2 = id[i].innerText;
        if (id1 != '' && id2.includes(id1)) {
            id[i].setAttribute('class', 'focus')
        }
    };
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
