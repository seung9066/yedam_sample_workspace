document.write('<br>-------------------condition.js에서 가져온 글들-------------------<br><br>')

document.write('<div style="border: 1px solid black; padding: 10px"><함수를 매개값으로 받는 함수><br><br>')

function callFunc(fnc) {
    let name = 'Hong';
    fnc(name);
}

function welcomeFnc(param) {
    document.write('Welcome ' + param);
}
callFunc(welcomeFnc);

document.write('<p></p>')

let helloFnc = function (param) {
    document.write('Hello ' + param);
}
callFunc(helloFnc);

document.write('<p></p>')

let hiFnc = (param) => {
    document.write('Hi ' + param);
}
callFunc(hiFnc);

document.write('<br></div>')

document.write('<br>-------------------condtion.js에서 가져온 글들-------------------<br>')