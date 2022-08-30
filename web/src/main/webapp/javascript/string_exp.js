// document.write('<br><br>')
// document.write('str.slice(2,7)')
// document.write(' >> ')
// document.write(str.slice(2, 7));
document.write('<br><br>')

let now = new Date();
document.write('toDateString() >> ')
document.write(now.toDateString());
document.write('<br><br>')

document.write('toLocaleDateString() >> ')
document.write(now.toLocaleDateString());
document.write('<br><br>')

document.write('toLocaleTimeString() >> ')
document.write(now.toLocaleTimeString());
document.write('<br><br>')

document.write('${now.getFullYear()}년 ${now.getMonth()}월 ${now.getDate()}일 >> ')
document.write(`${now.getFullYear()}년 ${now.getMonth()}월 ${now.getDate()}일`)
document.write('<br><br>')

document.write('${now.getHours()}시 ${now.getMinutes()}분 ${now.getSeconds()}초 >> ')
document.write(`${now.getHours()}시 ${now.getMinutes()}분 ${now.getSeconds()}초`)
document.write('<br><br>')

let now1 = new Date();
if (now1.getMonth() < 10) {
    document.write(`0${now1.getMonth()}월<br><br>`)
}

document.write('초 앞에 0 붙이기 삼항식 >> ')
document.write(`${now.getSeconds()<10?'0'+now.getSeconds():now.getSeconds()}초`);
document.write('<br><br>')

document.write('초 앞에 0 붙이기 slice(-3) >> ')
document.write(`0${now.getSeconds()}초`.slice(-3))
document.write('<br><br>')

document.write('"abc".toUpperCase() >> ')
document.write('abc'.toUpperCase());
document.write('<br><br>')

document.write('"abc".toLowerCase() >> ')
document.write('abc'.toLowerCase());
document.write('<br><br>')

Date.prototype.hhmiss = function() {
    document.write(`0${now.getHours()}:`.slice(-3))
    document.write(`0${now.getMinutes()}:`.slice(-3))
    document.write(`0${now.getSeconds()}`.slice(-2))
}

now.hhmiss();