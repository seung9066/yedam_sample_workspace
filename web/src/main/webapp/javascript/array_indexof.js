const members = ['진정욱', '노은경', '백나현'];
const newMems = ['김민지', '노은경', '정다슬'];
console.log(members.indexOf('노은경'));

document.write('<p>### indexOf() 중복값 제외 추가 ###</p>')
document.write('<p>newMems.forEach(mem => {<br>&nbsp;if (members.indexOf(mem) == -1) {<br>nbsp;nbsp;members.puch(mem);<br>nbsp;}<br>});')
newMems.forEach(mem => {
    if (members.indexOf(mem) == -1) {
        members.push(mem);
    }
})

document.write('<p>' + members + '</p>');

document.write('<br><p>### .some() 하나의 요소가 만족하면 true ###</p>')
document.write('<p>let result = member.some(mem => mem == "노은경")</p>')
let result = members.some(mem => { // true, false
    return mem == '노은경';
});
document.write('<p>' + result + '</p>')

document.write('<br><p>### .every() 모든 요소가 만족하면 true ###</p>')
document.write('<p>let result = member.every(mem => mem.length == 3)</p>')
result = members.every(mem => mem.length == 3);
document.write('<p>' + result + '</p>')

document.write('<br><p>### .fine() 찾기 ###</p>')
document.write('<p>result = members.find(mem => mem.startsWith("김"))</p>')
result = members.find(mem => mem.startsWith('김'));
document.write('<p>' + result + '</p>')