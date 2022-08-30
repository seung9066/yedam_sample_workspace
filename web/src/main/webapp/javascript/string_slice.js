let str = '# good, morning!';
document.write(str)

document.write('<br><br>')
document.write('str.slice(2,7)')
document.write(' >> ')
document.write(str.slice(2, 7));

document.write('<br><br>')
document.write('str.slice(2)')
document.write(' >> ')
document.write(str.slice(2));

document.write('<br><br>')
document.write('str.slice(2, -2)')
document.write(' >> ')
document.write(str.slice(2, -2));

document.write('<br><br>')
document.write('str.slice(2, 7)')
document.write(' >> ')
document.write(str.slice(2, 7));

document.write('<br><br>')
document.write('str.substring(0,7)')
document.write(' >> ')
document.write(str.substring(0, 7));

document.write('<br><br>')
document.write('str.indexOf("mor")')
document.write(' >> ')
document.write(str.indexOf("mor"));

str += ' good afternoon!';

document.write('<br><br><br>')
document.write(str);

document.write('<br><br>')
document.write('str.lastIndexOf("good")')
document.write(' >> ')
document.write(str.lastIndexOf('good'));

str += ' good evening!';
document.write('<br><br><br>')

document.write(str);

document.write('<br><br>')
document.write('str.lastIndexOf("good", 10)')
document.write(' >> ')
document.write(str.indexOf('good', 10));

document.write('<br><br>')
document.write('str.indexOf("good", str.indexOf("good") + 1)')
document.write(' >> ')
document.write(str.indexOf('good', str.indexOf('good') + 1));

document.write('<br><br>')
document.write('str.charAt(3)')
document.write(' >> ')
document.write(str.charAt(3));

document.write('<br><br><br>')
document.write('# 문자열에서 반복되는 구문 횟수 찾기')
let cnt = 0;
let pos = str.indexOf('good');

while (pos != -1) {
    cnt++;
    pos = str.indexOf('good', pos + 1);
}
document.write('<br><br>')
document.write(cnt + '회');

document.write('<br><br><br>')
document.write('# 남자 여자 구분')
document.write('<br><br>')

function checkGender(no) {
    // let gender = no.replace('-', '').charAt(6);
    // if gender == 1
    if (no.charAt(6) == 1 || no.charAt(7) == 1 && no.charAt(6) == '-') {
        document.write(no + ' : 남자입니다.<br>')
    } else if (no.charAt(6) == 2 || no.charAt(7) == 2 && no.charAt(6) == '-'){
        document.write(no + ' : 여자입니다.<br>')
    } else {
        document.write('잘못된 번호입니다.<br>')
    }
}

checkGender('970301-2345678');
checkGender('950301-1345678');
checkGender('9603011345678');
checkGender('9603012345678');
checkGender('9603017345678');
checkGender('960301-7345678');