console.log('----- object_clone.js -----');

let originObj = {
    sname: 's',
    age: 10,
    changeAge: function () {
        this.age++;
    }
}

let cloneObj = originObj; // originObj 참조값을 cloneObj
console.log(originObj.sname);
console.log(cloneObj.sname);
cloneObj.sname = 'w';
console.log(originObj.sname); // clonObj 값을 바꾸면 originObj 값이 바뀜
console.log(cloneObj.sname);
originObj.changeAge();
console.log(cloneObj.age);

// 복사
let obj1_ = new Object();
let copyObj = Object.assign({}, originObj);
console.log(copyObj.sname);

let newObj = {
    sname: 'k',
    phone: '010',
    age: 10
}

let dupObj = Object.assign(newObj, originObj); // 없는 항목은 유지 같은 항목은 합쳐져서 바뀜
console.log(dupObj);

// 객체의 속성을 지정
let s2_ = {
    sname: 'h'
}

s2_.age = 10;
delete s2_.age;
s2_['phone'] = '010';
s2_.friends = [{
    name: 'a',
    phone: '010-1',
    age: 20
}, {name: 'b', Phone: '010-2', hobbies: ['독서', '수영']}];

console.log(s2_.friends[1].hobbies[0])

class Student1_ {
    constructor(sname, age) {
        this.sname = sname;
        this.age = age;
    }
}

let s3_ = new Student1_('홍', 20);
Object.defineProperty(s3_, 'score', {
    set: function(score) {
        if (score > 100){
            throw '잘못된 값 입력, 100보다 적은 값 입력하세요'
        } else if (score < 0) {
            throw '잘못된 값 입력, 0보다 큰 값 입력하세요'
        } else {
            this._score = score;
        }
    },
    get: function() {
        return this._score
    }
});

s3_.score = 20;

let s4_ = new Student1_('김', 22);

Student1_.prototype.showInfo = function() { // prototype 이용시 s3 s4 다 사용가능
    return `이름은 ${this.sname}이고 나이는 ${this.age}입니다.`
}

console.log(s4_.showInfo());
console.log(s3_.showInfo());