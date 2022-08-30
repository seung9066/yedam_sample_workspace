console.log('----- object_closure.js -----')

// 1. 함수는 변수에 대입가능

let fnc = function() {
    console.log('함수호출!!');
}

// 2. 메소드의 매개값으로 사용 가능
// [1, 2].forEach(function(val) {console.log(val);})

// 3. 결과값으로 함수반환
function outerFunc_(name) {
    let saying = name + '안녕!';
    return function() {
        return saying;
    }
}

let closure1 = outerFunc_('홍길동');
console.log(closure1());

function initCnt() {
    let cnt = 10;
    return function addCnt() {
        cnt++;
        console.log(cnt);
    }
    // addCnt();
}

let plusCnt = initCnt();
plusCnt();
plusCnt();