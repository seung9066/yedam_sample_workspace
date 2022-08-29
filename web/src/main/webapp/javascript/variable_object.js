console.log('-------------variable_object.js-------------')

console.log('///// 배열 for of /////')
let strAry = [];
for (let i = 0; i < 10; i++) {
    strAry[i] = 'i' + i;
};

for (let str of strAry) {
    console.log(str);
}

console.log('///// 객체 for in /////');
let objj = {
    fname: '길동',
    lname: '홍',
    age: 20,
    fullName: function () {
        return this.lname + ' ' + this.fname
    }
}

for (let prop in objj) {
    console.log(prop, objj[prop]);
};

function variable_object() {
    document.write('<a href=""><button>새로고침</button><br></a>')
    document.write('-------------------variable_object.js에서 가져온 글들-------------------')
    document.write('<br><div style="border: 1px solid black; padding: 10px"><p><span><</span>배열 안에 객체<span>></span></p>')
    let members0 = [{
            id: 'user1',
            name: '사용자1'
        },
        {
            id: 'user2',
            name: '사용자2'
        },
        {
            id: 'user3',
            name: '사용자3'
        }
    ];

    let str = '<table border=1>'

    for (let member0 of members0) {
        str += '<tr>';
        for (let prop in member0) {
            str += `<td>${member0[prop]}</td>`;
        }
        str += '</tr>';
    };
    str += '</table>'
    document.write(str);
    document.write('</div>');

    document.write('<br><div style="border: 1px solid black; padding: 10px"><p><span><</span>콜백함수 배열 안에 객체<span>></span></p>')
    str = '<table border=1>';
    members0.forEach(createTable); // 콜백함수
    function createTable(val, idx) {
        if (idx == 0) {
            str += '<tr>'
            for (let prop in val) {
                str += `<th>${prop}</th>`
            }
            str += '<th>버튼</th>';
            str += '</tr>';
        }
        str += '<tr>';
        for (let prop in val) {
            str += `<td>${val[prop]}</td>`     
        }
        str += '<td><button>확인</button></td>';
        str += '</tr>';
    }
    str += '</table>';
    document.write(str);
    document.write('</div>')
    document.write('-------------------variable_object.js에서 가져온 글들-------------------')
};