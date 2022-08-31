const data = `[{"id":1,"first_name":"Karlik","last_name":"Barratt","email":"kbarratt0@hp.com","gender":"Male","salary":5731},
{"id":2,"first_name":"Currey","last_name":"Pidduck","email":"cpidduck1@patch.com","gender":"Male","salary":1691},
{"id":3,"first_name":"Giselle","last_name":"Pardal","email":"gpardal2@yellowbook.com","gender":"Female","salary":4445},
{"id":4,"first_name":"Betsy","last_name":"Scoone","email":"bscoone3@cocolog-nifty.com","gender":"Female","salary":7967},
{"id":5,"first_name":"Fawne","last_name":"Avrahm","email":"favrahm4@taobao.com","gender":"Female","salary":8591},
{"id":6,"first_name":"Yul","last_name":"Eringey","email":"yeringey5@omniture.com","gender":"Male","salary":6027},
{"id":7,"first_name":"Freddie","last_name":"Rummins","email":"frummins6@harvard.edu","gender":"Male","salary":7245},
{"id":8,"first_name":"Erin","last_name":"Leynton","email":"eleynton7@cpanel.net","gender":"Male","salary":6411},
{"id":9,"first_name":"Abigael","last_name":"Chisnell","email":"achisnell8@naver.com","gender":"Female","salary":6105},
{"id":10,"first_name":"Hugo","last_name":"Sindle","email":"hsindle9@google.ru","gender":"Male","salary":7426},
{"id":11,"first_name":"Sigismundo","last_name":"Mollen","email":"smollena@feedburner.com","gender":"Male","salary":1872},
{"id":12,"first_name":"Dalton","last_name":"Rickets","email":"dricketsb@reference.com","gender":"Male","salary":3120},
{"id":13,"first_name":"Margalo","last_name":"MacGiolla Pheadair","email":"mmacgiollapheadairc@craigslist.org","gender":"Female","salary":7930},
{"id":14,"first_name":"Eleni","last_name":"Sponer","email":"esponerd@engadget.com","gender":"Female","salary":6565},
{"id":15,"first_name":"Trix","last_name":"Bavage","email":"tbavagee@mapquest.com","gender":"Female","salary":3768}]`;

let result = JSON.parse(data); // string -> object

document.write('<p>### 배열 ###</p>')
result.forEach((val) => {
    document.write('{' + val.id + ' ' + val.first_name + ' ' + val.last_name + ' ' + val.email + ' ' + val.gender + ' ' + val.salary + '}<br>');
})

document.write('<br><p>### foreach() 여성, 연봉 5000 이상만 출력 ###</p>')
let str = '<ul>';
result.forEach((val) => {
    if (val.gender == 'Female' && val.salary > 5000) {
        str += '<li>' + Object.values(val) + '</li>';
    }
})
str += '</ul>'
document.write('<p>' + str + '</p>')


document.write('<br><p>### .reduce() 여성, 연봉 5000 이상만 출력2 ###</p>')

let str1 = result.reduce((acc, val, idx) => {
    if (idx == 0) {
        acc = '<ul>'
    }
    if (val.gender == 'Female' && val.salary > 5000) {
        acc += `<li>${Object.values(val)}</li>`
    }
    if (idx == result.length - 1) {
        acc += '</ul>'
    }
    return acc;
}, '')

document.write('<p>' + str1 + '</p>')
