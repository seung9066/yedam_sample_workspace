document.write('<br><br>')
const members = [
    {name: "황병걸", age: 25},
    {name: "김창식", age: 26},
    {name: "김효인", age: 27},
    {name: "이상욱", age: 28}
];


document.write('# 이름 검색해서 나이 찾기')
document.write('<br><br>')
let searchKey = prompt('황별걸, 김창식, 김효인, 이상욱');

members.forEach(mem => {
    if (mem.name.indexOf(searchKey) != -1) {
        document.write(searchKey + '님의 나이 : ' + mem.age);
    }
})
