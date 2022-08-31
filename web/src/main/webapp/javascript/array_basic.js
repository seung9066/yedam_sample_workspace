const names = [];

names[0] = '정다슬';
names[names.length] = '백진희'; // 마지막 인덱스에 추가
names[names.length] = '황용주';
names[names.length] = '손정빈';

document.write('<br><br>')
document.write('# names[names.length] / names.push() = 마지막 인덱스에 추가')
document.write('<br>&nbsp;&nbsp; names.unshift() = 첫번째 인덱스에 추가')

names.push('김아현'); // 마지막 인덱스에 추가
names.unshift('김두영'); // 첫번째 인덱스에 추가

document.write('<br><br>')
names.forEach(name => document.write(name + '. '));

document.write('<br><br>')
document.write('# names.pop() = 마지막 인덱스 삭제')
document.write('<br>&nbsp;&nbsp; names.shift() = 첫번째 인덱스 삭제')

names.pop();
names.shift();

document.write('<br><br>')
names.forEach(name => document.write(name + '. '));

document.write('<br><br>')
document.write('# newNames.slice(0,2) = 특정 위치 값 가져오기')

const newNames = names.slice(0, 2);
document.write('<br><br>')
newNames.forEach(name => document.write(name + '. '));

document.write('<br><br>')
document.write('# names.splice(위치, 대체할 갯수, 대체할 값...) = 추가, 수정, 삭제')
document.write('<br><br>&nbsp;&nbsp; names.splice(0, 0, "김민지") = 추가')
names.splice(0, 0, '김민지')
document.write('<br>')
names.forEach(name => document.write(name + '. '));

document.write('<br><br>&nbsp;&nbsp; names.splice(0, 3, "김민지", "진정욱", "전성하") = 수정')
names.splice(1, 3, '김상영', '진정욱', '전성하')
document.write('<br>')
names.forEach(name => document.write(name + '. '));

document.write('<br><br># names.length = 0; = 크기 지정을 통한 삭제')
names.length = 0;
document.write('<br>')
names.forEach(name => document.write(name + '. '));

document.write('<br><br># const otherName = names.concat(newNames); = 두 배열을 합쳐 새 배열로')
const otherName = names.concat(newNames);
document.write('<br>')
otherName.forEach(name => document.write(name + '. '));