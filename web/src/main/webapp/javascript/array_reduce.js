const numbers = [2, 3, 8, 5, 1];
let sum = 0;
let sum2 = 0;
let sum3 = 0;

numbers.forEach(a => {
    sum += a;
    if (a % 2 == 0) {
        sum2 += a;
    } else if (a % 3 == 0) {
        sum3 += a;
    }
})

document.write('<p>### foreach() 배열 합 구하기 ###</p>')
document.write('배열: ' + numbers + '<br>');
document.write('합: ' + sum + '<br>');
document.write('짝수 합: ' + sum2 + ' | 홀수 합: ' + sum3);

document.write('<p>### .reduce() 배열 합 구하기 ###</p>')
document.write('<p>numbers.reduce(function (acc(초기값+누적), val, index, array){<br>&nbsp;return acc + val<br>}, 0(초기값))</p>')
let result = numbers.reduce(function (a, b, c, d) { // 초기값, val, index, array
    console.log(a, b, c, d);
    return a + b;
}, 0); // 0 = 초기값
document.write('합: ' + result);

document.write('<p>### 각 배열값에 2 추가하기 ###</p>')
document.write('<p>numbers.reduce((acc, val, idx, ary) => {<br>&nbsp;acc.push(val + 2);<br>&nbsp;return acc;<br>}, [])</p>')
result = numbers.reduce((acc, val, idx, ary) => {
    acc.push(val + 2);
    return acc;
}, [])
document.write('배열: ' + result);

document.write('<p>### ul, li 넣기 ###</p>')
document.write('<p> numbers.reduce((acc, val, idx, ary) => {<br>&nbsp;if (idx == 0) {<br>&nbsp;&nbsp;acc = <span><</span>ul<span>></span><br>&nbsp;}<br>&nbsp;acc += <span><</span>li<span>></span> + val + <span><</span>/li<span>></span>;<br>&nbsp;if (idx == nembers.length - 1) {<br>&nbsp;&nbsp; acc += <span><</span>/ul<span>></span>;<br>&nbsp;}<br>&nbsp;return acc;<br>}, "")')
result = numbers.reduce((acc, val, idx, ary) => {
    if (idx == 0) {
        acc = '<ul>'
    }
    acc += '<li>' + val + '</li>';
    if (idx == numbers.length - 1) {
        acc += '</ul>'
    }
    return acc;
}, '')
document.write('<br><br>결과: ' + result);

document.write('<p>### 배열 최대값 ###</p>')
document.write('<p> let max1 = numbers.reduce((acc, val, idx, ary) => {<br>&nbsp;if (val > acc) {<br>&nbsp;&nbsp;acc = val;<br>&nbsp;}<br>&nbsp;return acc;<br>}, numbers[0]);')
let max = numbers.reduce((acc, val, idx, ary) =>{
    if (val > acc) {
        acc = val;
    }
    return acc;
}, numbers[0]);
document.write('<p>배열: ' + numbers + '<br>')
document.write('최대값(max): ' + max + '</p>')

document.write('<p>### 배열 최소값 MAX_SAFE_INTEGER, 삼항연산자 ###</p>')
document.write('<p> let min = numbers.reduce((acc, val, idx, ary) => {<br>&nbsp; return acc < val ? acc : val;<br>}, Number.MAX_SAFE_INTEGER);')
let min = numbers.reduce((acc, val, idx, ary) =>{
    return acc < val ? acc : val;
}, Number.MAX_SAFE_INTEGER);
document.write('<p>배열: ' + numbers + '<br>')
document.write('최소값(min): ' + min + '</p>')