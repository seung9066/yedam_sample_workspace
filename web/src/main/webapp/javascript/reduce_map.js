document.write('<p>Array.prototype.map(); -> 매핑(A -> A")')
document.write('<br>Array.prototype.filter(); -> 필터링(A -> a)</p>')

const names = ['이현성', '이주훈', '황용주', '최승현'];

document.write('<p>### map 이름에 번호 추가###</p>')
document.write('<p>let members = names.map((name, idx) => {<br>&nbsp;let obj = {};<br>&nbsp;obj.name = name;<br>&nbsp;obj.sno = idx + 1;<br>&nbsp;return obj;<br>});</p>')
document.write(names + ' >> ')
let members = names.map((name, idx) => {
    let obj = {};
    obj.name = name;
    obj.sno = idx + 1;
    return obj;
});

members.forEach((val) => {
    document.write(val.sno + val.name + ' ');
})


document.write('<br><br><p>### filter 이씨만 출력 ###</p>')
document.write('<p>let lees = names.filter((member) => {<br>&nbsp;return member.name.startsWith("이");<br>});</p>')
let lees = members.filter((member) => {
    return member.name.startsWith('이');
})
lees.forEach((val) => {
    document.write(val.name + ' ');
})


document.write('<br><br><p>### method 체인(map.filter) ###</p>')
document.write('<p>let result = names.map((name, idx) => {<br>&nbsp;let obj = {};<br>&nbsp;obj.name = name;<br>&nbsp;obj.sno = idx + 1;<br>&nbsp;return obj;<br>}).filter((member) => {<br>&nbsp;return member.name.startsWith("이");<br>});</p>')

let result = names.map((name, idx) => {
    let obj = {};
    obj.name = name;
    obj.sno = idx + 1;
    return obj;
}).filter((member) => {
    return member.name.startsWith('이');
})

result.forEach((val) => {
    document.write(val.sno + val.name + ' ');
})


document.write('<br><br><p>### 코드 간결화 function으로 만들고 메소드 체인 ###</p>')
document.write('<p>let mapfnc = (name, idx) => {<br>&nbsp;let obj = {};<br>&nbsp;obj.name = name;<br>&nbsp;obj.sno = idx + 1;<br>&nbsp;return obj;<br>});</p>')
document.write('<p>let filfnc = (member) => {<br>&nbsp;return member.name.startsWith("이");<br>});')
document.write('<p>let result1 = names.map(mapfnc).filter(filfnc);')

let mapfnc = (name, idx) => {
    let obj = {};
    obj.name = name;
    obj.sno = idx + 1;
    return obj;
}

let members1 = names.map(mapfnc);

let filfnc = (member) => {
    return member.name.startsWith('이');
}

let lees1 = members.filter(filfnc);

let result1 = names.map(mapfnc).filter(filfnc);

document.write('<br><br>')

result1.forEach((val) => {
    document.write(val.sno + val.name + ' ');
});