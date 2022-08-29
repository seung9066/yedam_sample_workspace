function table_func() {
    document.write('<a href=""><button>새로고침</button><br></a>')
    document.write('<br>-------------------talbe_func.js에서 가져온 글들-------------------<br>')
    document.write('<br>')
    //table_func.js
    document.write('<div style="border: 1px solid black; padding: 10px"><p><span><</span>테이블 만들기<span>></span></p>')
    const members1 = [{
            id: 'user1',
            name: '홍길동',
            score: 80,
            phone: '010-1234-1234'
        },
        {
            id: 'user2',
            name: '김민식',
            score: 85,
            phone: '010-5645-1234'
        },
        {
            id: 'user3',
            name: '황의겸',
            score: 70,
            phone: '010-1546-1234'
        }
    ];

    //let  변수선언
    //const 상수선언 값을 바꿀 수 없다는 특징
    function makeTr(mem = {}) {
        let tr = '<tr>';
        //`<td>${member.id}</td><td>${member.name}</td><td>${member.score}</td>`
        for (let prop in mem) {
            tr += `<td>${mem[prop]}</td>`;
        }
        tr += '<td><button>확인</button></td>'
        tr += '</tr>';
        return tr;
    }

    function makeHd() {
        let titles = ['아이디', '이름', '점수', '연락처', '버튼'];
        let tr = '<tr>';
        for (let title of titles) {
            tr += `<th>${title}</th>`;
        }
        tr += '</tr>';
        return tr;
    }

    let str3 = '<table border=1>'; //배열에 변수를 읽어올때는 of
    str3 += makeHd();
    //'<tr><th>아이디</th><th>이름</th><th>점수</th></tr>';
    for (let member of members1) { //{id: 'user1', name: '홍길동', score:80}
        str3 += makeTr(member);
    }

    str3 += '</table>';
    document.write(str3);
    document.write('</div>');







    const members2 = [{
            id: 'user1',
            name: '홍길동',
            score: 80,
            phone: '010-1234-1234',
            gender: 'M'
        },
        {
            id: 'user2',
            name: '김민식',
            score: 85,
            phone: '010-5645-1234',
            gender: 'W'
        },
        {
            id: 'user3',
            name: '황의겸',
            score: 70,
            phone: '010-1546-1234',
            gender: 'M'
        },
        {
            id: 'user3',
            name: '최우신',
            score: 55,
            phone: '010-1546-1234',
            gender: 'W'
        }
    ];

    document.write('<br><div style="border: 1px solid black; padding: 10px"><p><span><</span>배열에서 점수가 60점 이하인 사람만 출력<span>></span></p>')
    const passMember = [];
    for (let i = 0; i < members2.length; i++) {
        if (members2[i].score < 60) {
            passMember[passMember.length] = members2[i].name;
        }
    }
    document.write('이름 : ' + passMember + '<br>')

    document.write('<br><배열에서 여자만 출력><br>')
    const women = [];
    for (let i = 0; i < members2.length; i++) {
        if (members2[i].gender == 'W') {
            women[women.length] = members2[i].name;
        }
    }
    document.write('이름 : ' + women)
    document.write('<p></p>')





    document.write('<배열에서 남자는 파란글씨 여자는 빨간 글씨><p></P>')

    function makeHd1() {
        let titles = ['아이디', '이름', '점수', '연락처', '성별'];
        let tr = '<tr>';
        for (let title of titles) {
            tr += `<th>${title}</th>`;
        }
        tr += '</tr>';
        return tr;
    }

    function makeTr1(mem = {}) {
        let tr = '<tr>';
        for (let prop in mem) {
            if (mem.gender == 'W') {
                tr += `<td style="color: red;">${mem[prop]}</td>`
            } else if (mem.gender == 'M') {
                tr += `<td style="color: blue;">${mem[prop]}</td>`
            } else {
                tr += `<td>${mem[prop]}</td>`
            }
        }
        tr += '</tr>';
        return tr;
    }

    let str4 = '<table border=1 style="text-align: center">';
    str4 += makeHd1();
    for (let member of members2) {
        str4 += makeTr1(member);
    }

    str4 += '</table>';
    document.write(str4);

    document.write('</div>');

    document.write('<br>-------------------talbe_func.js에서 가져온 글들-------------------<br>')
};