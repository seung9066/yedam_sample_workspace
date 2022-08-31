// document.write('<br><br># const otherName = names.concat(newNames); = 두 배열을 합쳐 새 배열로')
// const otherName = names.concat(newNames);
// document.write('<br>')
// otherName.forEach(name => document.write(name + '. '));

const members = [
    ['홍길동', 20],
    ['김익수', 21],
    ['손봉호', 22]
]

members.push(['최승현', 28]);

document.write('<br><br># 배열 안에 배열요소')
document.write('<br>')
members.forEach(name => document.write(name + '. '));
console.table(members)

document.write('<br><br># members[0][1] = 22; = 인덱스 기반 값 변경')
document.write('<br>')
members[0][1] = 22;
members.forEach(name => document.write(name + '. '));

document.write('<br><br># "이름: ${name[0]} 나이: ${name[1]}" = 인덱스 기반 출력')
document.write('<br>')
members[0][1] = 22;
members.forEach(name => document.write(`이름: ${name[0]} 나이: ${name[1]}<br>`));

const objMembers = [];
members.forEach(names => {
    let obj = {name: names[0], age: names[1]};
    objMembers.push(obj);
});

document.write('<br># foreach -> .push() = 배열 속 배열을 배열 속 객체로')
document.write('<br>')
document.write(objMembers);

const aryMembers = [];
objMembers.forEach(a => {
    let ary = [a.name, a.age];
    aryMembers.push(ary);
})
document.write('<br><br># foreach -> .push() =  배열 속 객체를 배열 속 배열로')
document.write('<br>')
document.write(aryMembers);