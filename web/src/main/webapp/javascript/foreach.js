document.write('<br>-------------------foreach.js에서 가져온 글들-------------------<br>')

const memberss = [{
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

document.write('<br><div style="border: 1px solid black; padding: 10px"><p><span><</span>for반복문 배열메소드(forEach)<span>></span></p>')

// a = val, b = index, c = array
memberss.forEach(function (a, b, c) {
    document.write('<span>value : </span>');
    document.write(a);
    document.write('<br><span>index : </span>');
    document.write(b);
    document.write('<br><span>array : </span>');
    document.write(c + '<br>');
});

document.write('<p><span><</span>foreach 같은 출력 다른 문법<span>></span></p>')

memberss.forEach(callBackFnc);

function callBackFnc(a, b, c) {
    document.write('<br><span>value : </span>');
    document.write(a);
    document.write('<br><span>index : </span>');
    document.write(b);
    document.write('<br><span>array : </span>');
    document.write(c);
}

document.write('<p></p></div>')

document.write('<br>-------------------foreach.js에서 가져온 글들-------------------<br><br>')