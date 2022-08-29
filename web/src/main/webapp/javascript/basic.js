function basic() {
    document.write('<a href=""><button>새로고침</button><br></a>')
    document.write('-------------------basic.js에서 가져온 글들-------------------')

    let person = {
        name: "Hong",
        age: 20,
        showInfo: function () {
            console.log("이름 : " + this.name + " 나이 : " + this.age)
        }
    };
    person.showInfo(); // object내의 함수

    document.write('<h1>hello world</h1>');

    document.write('<div style="border: 1px solid black; padding: 10px"><p><span><</span>for문 li<span>></span></p>')
    let fruits = ['apple', 'banana', 'pear', 'peach'];
    let str = '<ul>';
    // for (let i = 0; i < 4; i++) {
    //     str += '<li>' + fruits[i] + '</li>';
    // }

    // 확장 for문 (for of)
    for (let fruit of fruits) {
        str += '<li>' + fruit + '</li>';
    }
    str += '</ul>';
    document.write(str);
    document.write('</div>')

    document.write('<br><div style="border: 1px solid black; padding: 10px"><p><span><</span>object 속성 전체 읽어오는 반복문<span>></span></p>')
    let member = {
        userid: 'hong',
        userName: '홍길동',
        userAge: '20',
        point: 350
    }

    // object의 각각 속성을 전체 읽어오는 반복문
    for (let prop in member) {
        console.log('속성 : ' + prop + ' 값 : ' + member[prop]);
    }

    let student = {}
    student.id = 'st1';
    student.name = '홍길동';
    student['score'] = 80;

    let str1 = '<ul>'
    for (let stu in student) {
        str1 += '<li>' + stu + ' : ' + student[stu] + '</li>';
    }
    str1 += '</ul>';
    document.write(str1);
    document.write('</div>')

    document.write('<br><div style="border: 1px solid black; padding: 10px"><p><span><</span>for문 array<span>></span></p>')
    let number = []; // array
    number[0] = 90;
    number[1] = 80;
    number[2] = 70;
    number[3] = 60;

    for (let num of number) {
        document.write(num);
        document.write(' ')
    }
    document.write('<br>')
    document.write('</div>')

    document.write('<br><div style="border: 1px solid black; padding: 10px"><p><배열 li></p>')
    let students = [];
    let stu1 = {
        sno: '1001',
        sName: '김영희',
        score: 90
    }
    let stu2 = {
        sno: '1002',
        sName: '최희수',
        score: 88
    }
    let stu3 = {
        sno: '1003',
        sName: '박민수',
        score: 80
    }
    students[0] = stu1;
    students[1] = stu2;
    students[2] = stu3;

    let str2 = '<ul>';
    for (let student of students) {
        str2 += '<li>' + student.sno + ' / ' + student.sName + ' / ' + student.score + '</li>';
    }
    str2 += '</ul>'
    document.write(str2)
    document.write('</div>')

    document.write('-------------------basic.js에서 가져온 글들-------------------')
};