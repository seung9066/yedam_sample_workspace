function function_param() {
    document.write('<a href=""><button>새로고침</button><br></a>')
    document.write('-------------------variable_object.js에서 가져온 글들-------------------')
    document.write('<br><div style="border: 1px solid black; padding: 10px"><p><span><</span>function param1<span>></span></p>')

    document.write('이름을 적으세요<br>')
    document.write('<input type="text" id="funcname" style="height: 30px;"></input>')
    document.write('<button onclick="myFunc(funcname.value)" style="height: 30px;">hello</button>')

    document.write('</div>')

    document.write('<br><div style="border: 1px solid black; padding: 10px"><p><span><</span>문장 합치기<span>></span></p>')

    document.write('<input type="text" id="funcname0" style="height: 30px;"></input>')
    document.write('<input type="text" id="funcname1" style="height: 30px;"></input>')
    document.write('<button onclick="myFunc1(funcname0.value, funcname1.value)" style="height: 30px;">hello</button>')

    document.write('</div>')

    document.write('<br><div style="border: 1px solid black; padding: 10px"><p><span><</span>function param2<span>></span></p>')

    document.write('이름을 적으세요<br>')
    document.write('<input type="text" id="funcname2" style="height: 30px;"></input>')
    document.write('<button onclick="myFunc3(funcname2.value)" style="height: 30px;">welcome</button>')

    document.write('</div>')

    document.write('<br><div style="border: 1px solid black; padding: 10px"><p><span><</span>function param3<span>></span></p>')

    document.write('이름을 적으세요<br>')
    document.write('<input type="text" id="funcname3" style="height: 30px;"></input>')
    document.write('<button onclick="myFunc4(funcname3.value)" style="height: 30px;">welcome</button>')

    document.write('</div>')

    document.write('<br><div style="border: 1px solid black; padding: 10px"><p><span><</span>숫자 더하기<span>></span></p>')

    document.write('숫자를 적으세요<br>')
    document.write('<input type="text" id="funcint" style="height: 30px;"></input>')
    document.write('<input type="text" id="funcint1" style="height: 30px;"></input>')
    document.write('<button onclick="mySum1(funcint.value, funcint1.value)" style="height: 30px;">더하기</button>')

    document.write('</div>')

    setTimeout(function () {
        document.write('<p>느리게 나타나기</p>')
        document.write('<p>setTimeout</p>');
    }, 2000);

    document.write('-------------------variable_object.js에서 가져온 글들-------------------')
};

// 함수 선언식
function myFunc(param) {
    document.write('<p>hello ' + param + '</p>');
};

function myFunc1(param, param1) {
    document.write('<p>' + param + ' ' + param1 + '</p>');
};

// 함수표현식
let myFunc3 = function (param) {
    document.write('<p>welcome ' + param + '</p>');
}
let myFunc4 = myFunc3;

function mySum1(n1, n2) {
    let num1 = parseInt(n1);
    let num2 = parseInt(n2);
    document.write('<p>' + num1 + ' + ' + num2 + ' = ' + (num1 + num2) + '</p>');
}

console.log('----- function_param.js -----')

console.log('///// arguments /////')

function mySum(n1, n2) {
    let sum = 0;
    console.log(arguments);
    for (let num of arguments) {
        sum += num;
    }
    console.log(sum);
};

mySum(1, 2);

['hello', 'world'].forEach((val, idx) => console.log(val, idx));

console.log('///// outerinner /////')
var a = 1;
var b = 5;

function outerFunc() {
    function innerFunc() {
        a = b;
    }
    console.log(a);
    a = 2;
    b = 4;
    innerFunc();
    console.log(a);
    var b = 2;
}

outerFunc();
console.log(b); // function 안에 것은 지역변수라서 값을 가져나오지 못함 -> 전역변수 값 출력