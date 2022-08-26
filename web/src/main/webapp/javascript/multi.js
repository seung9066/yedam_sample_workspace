function gugu1() {
    let num = document.getElementById('gugu').value;
    let gugudan = '';
    if (num != "") {
        document.write(num + '단<br>')
        for (let i = 1; i < 10; i++) {
            document.write('<p>' + num + ' * ' + i + ' = ' + num * i + '</p>')
        }
        document.write('<button onclick="reload()">새로고침</button>')
    } else {
        alert("값을 넣으세요")
    }
}

function reload() {
    location.href = '';
}

// num1과 num2를 초기값을 0으로 지정해두어야 sum()으로 값이 들어오지 않을 때 undefined 처리가 되지 않고 0이 되어 NaN이 일어나지 않음
// function sum(num1 = 0, num2 = 0) {
//     return num1 + num2;
// }
function sum(num1, num2) {
    if (!num1 && !num2) {
        return 0;
    } else {
        return num1 + num2;
    }
}
// 위에 것과 같이 작동함
// sum = function (num1, num2) {
//     if (!num1 && !num2) {
//         return 0;
//     } else {
//         return num1 + num2;
//     }
// }

console.log(sum() + sum(2, 3));

let showInfo1 = function (name) {
    return `안녕하세요 ${name}님`;
}
console.log(showInfo1('김민수'));
let welcome = showInfo1;
console.log(welcome('홍길동'));

let members = ['가', '나', '다'];
for (let member of members) {
    console.log(welcome(member));
}