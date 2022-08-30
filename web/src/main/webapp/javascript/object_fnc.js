console.log('----- object_fnc.js -----')

function Student_(sno, sname) {
    this.sno = sno;
    this.sname = sname;

    this.showInfo = function() {
        return `학번은 ${sno}, 이름은 ${sname}입니다.`;
    }
}

let s1_ = new Student_('s11', '홍길동');
console.log(`학번은 ${s1_.sno}`);
console.log(s1_.showInfo());