document.write('<br>-------------------calender.js에서 가져온 글들-------------------<br>')

document.write('<br><div style="border: 1px solid black; padding: 10px"><p><span><</span>달력<span>></span></p>')
let cal = '<table border=1>';
cal += '<tr><th style="color: red;">일</th><th>월</th><th>화</th><th>수</th><th>목</th><th>금</th><th>토</th>';
cal += '<tr>'
let empty = 1;
let last = 31;
for (let f = 0; f < empty; f++) {
    cal += '<td></td>';
}
for (let day = 1; day <= last; day++) {
    cal += `<td>${day}</td>`;
    if ((empty + day) % 7 == 0) {
        cal += '<tr></tr>';
    }
}
cal += '</tr></tr>';
cal += '</table>';
document.write(cal);
document.write('</div>')

document.write('<br><div id="calcu" style="border: 1px solid black; padding: 10px"><p><span><</span>function 달력<span>></span></p>')

function getEmptyCnt(month) {
    switch (month) {
        case 1:
            return 6;
        case 2:
            return ((getEmptyCnt(month - 1) + getLastDay(month - 1)) % 7);
        case 3:
            return ((getEmptyCnt(month - 1) + getLastDay(month - 1)) % 7);
        case 4:
            return ((getEmptyCnt(month - 1) + getLastDay(month - 1)) % 7);
        case 5:
            return ((getEmptyCnt(month - 1) + getLastDay(month - 1)) % 7);
        case 6:
            return ((getEmptyCnt(month - 1) + getLastDay(month - 1)) % 7);
        case 7:
            return ((getEmptyCnt(month - 1) + getLastDay(month - 1)) % 7);
        case 8:
            return ((getEmptyCnt(month - 1) + getLastDay(month - 1)) % 7);
        case 9:
            return ((getEmptyCnt(month - 1) + getLastDay(month - 1)) % 7);
        case 10:
            return ((getEmptyCnt(month - 1) + getLastDay(month - 1)) % 7);
        case 11:
            return ((getEmptyCnt(month - 1) + getLastDay(month - 1)) % 7);
        case 12:
            return ((getEmptyCnt(month - 1) + getLastDay(month - 1)) % 7);
    }
}

function getLastDay(month) {
    switch (month) {
        case 1:
            return 31;
        case 2:
            return 28;
        case 3:
            return 31;
        case 4:
            return 30;
        case 5:
            return 31;
        case 6:
            return 30;
        case 7:
            return 31;
        case 8:
            return 31;
        case 9:
            return 30;
        case 10:
            return 31;
        case 11:
            return 30;
        case 12:
            return 31;
    }

}

let cal1 = '<table border=1 style="text-align: center; width: 500px; height: 300px">';
cal1 += '<tr><th style="color: red;">일</th><th>월</th><th>화</th><th>수</th><th>목</th><th>금</th><th style="color: blue;">토</th></tr>';
cal1 += '<tr>'
let month = 12;
document.write(month + '월의 달력')
let empty1 = getEmptyCnt(month);
let last1 = getLastDay(month);
for (let f = 0; f < empty1; f++) {
    cal1 += '<td></td>';
}
for (let day = 1; day <= last1; day++) {
    if ((empty1 + day) % 7 == 1) {
        cal1 += `<td style="color: red;">${day}</td>`;
    } else if ((empty1 + day) % 7 == 0) {
        cal1 += `<td style="color: blue;">${day}</td>`;
    } else {
        cal1 += `<td>${day}</td>`;
    }
    if ((empty1 + day) % 7 == 0) {
        cal1 += '<tr></tr>';
    }
}
cal1 += '</tr>';
cal1 += '</table>';
document.write(cal1);
document.write('</div>')

document.write('<br>-------------------calender.js에서 가져온 글들-------------------<br>')