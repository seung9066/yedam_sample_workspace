console.log('-------------variable.js-------------')

let fname = 'hwang';
fname = 'choi';
console.log(fname)

// const - 상수선언 : 재할당 불가
const pi = 3.14;

// var - 호이스팅
// 전역변수, 지역변수
console.log(age);
var age = 20;

function localfnc() {
    var age = 30;
    console.log('지역변수 : ' + age);
}

localfnc();

console.log('전역변수 : ' + age);

// 원시형, 참조형
let stri = 'hello'; // string
let stri1 = new String('hello'); // object(객체)

console.log(stri == stri1); // 데이터 값 비교 -> true
console.log(stri === stri1); // 데이터 타입 + 값 비교 -> false

let num = 20;
let num1 = new Number(20);
console.log(num == num1); // true
console.log(num === num1); // false

let obj; // undefined
obj = null; // null

let sym = Symbol('symbol'); // unique 키 값 생성
let sym1 = Symbol('symbol');
console.log(sym == sym1); // 내용이 같아도 키 값이 다르다 -> false

// 객체(object) == 자바의 class
obj = {
    sname: 'hong', // 속성: '속성값'
    age: 20,
    showAge: function () { // 메소드
        console.log('나이는 ' + this.age + '입니다.')
    }
}
console.log(obj.sname);
console.log(obj['age']);
obj.showAge();

obj.sname = 'choi'; // 값 할당
console.log(obj.sname);

// 배열
const numbers1 = [1, 2, 3]; // new Array();
numbers1[numbers1.length] = 10; // 추가
numbers1[numbers1.length] = 20;
numbers1[numbers1.length] = 30;

numbers1.forEach(function (val, ind, arr) { // 메소드(콜백함수(값, 인덱스, 배열))
    console.log('foreach : ' + ind + ' / ' + val + ' / ' + arr);
});
console.log(numbers1);

const randomVals = [];
for (let i = 0; i < 5; i++) {
    let val = Math.ceil(Math.random() * 10); // ceil : 소수점 이하 올림, randam : 0 ~ 1사이 임의의 수
    randomVals[i] = val;
}
randomVals.forEach(function (val) {
    if (val > 5) {
        console.log('5보다 큰 randomVals : ' + val);
    }
});

randomVals.splice(0, randomVals.length); // 배열 값 지우기 0 인덱스부터 배열 길이 인덱스까지

// console.clear(); 콘솔 메세지 초기화

// 21 ~ 50 사이 값 넣기
const maran = [];
for (let i = 0; i < 5; i++) {
    maran[i] = Math.ceil(Math.random() * 30) + 20;
}
console.log('maran : ' + maran);
maran.forEach(showEven);

// 콜백함수(callback function)
function showEven(val) {
    if (val % 2 == 0) {
        console.log('짝수 : ' + val);
    }
};

console.log('///// 형변환 /////')
console.log('3' + 4); // 34
console.log(-'3' + 4); // 1
console.log((3).toString() + 4); // 34
console.log(-(3).toString() + 4); // 1

console.log('///// abs, sign /////')
console.log(Math.abs(-20)); // abs = 절대값 return. 음수 넣어도 양수로 나옴
console.log(Math.sign(30)); // sign = -1, 0, 1 로만 나타냄

console.log('///// map /////');
const arr2 = [-3, 2, -45, 0, 4, 7];
const arr3 = arr2.map(function(val) { // 배열의 갯수만큼 콜백함수 실행 -> 새로운 배열 반환
    return Math.sign(val);
});
console.log(arr3);

console.log('///// NaN, Infinity /////');
console.log(3 / 'five');
console.log(-1 / 0);