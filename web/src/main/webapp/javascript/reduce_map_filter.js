const names = ['이현성', '이주훈', '황용주', '최승현'];

document.write('<p>### reduce로 map 기능 구현 ###</p>')
document.write('<p>let members = names.reduce((acc, val, idx) => {<br>&nbsp;let obj = {};<br>&nbsp;obj.name = val;<br>&nbsp;obj.sno = idx + 1;<br>&nbsp;acc.push(obj);<br>&nbsp;return acc;<br>}, []);</p>')
let members = names.reduce((acc, val, idx) => {
    let obj = {};
    obj.name = val;
    obj.sno = idx + 1;
    acc.push(obj);
    return acc;
}, []);

members.forEach((val) => {
    document.write(val.sno + val.name + ' ');
})

document.write('<br><br><p>### reduce로 filter 기능 구현 ###</p>')
document.write('<p>let lees = members.reduce((acc, val) => {<br>&nbsp;if (val.name.startsWith("이")) {<br>&nbsp;&nbsp;acc.push(val);<br>&nbsp;}<br>&nbsp;return acc;<br>}, [])</p>')
let lees = members.reduce((acc, val) => {
    if (val.name.startsWith('이')) {
        acc.push(val);
    }
    return acc;
}, [])

lees.forEach((val) => {
    document.write(val.sno + val.name + ' ');
})


document.write('<br><br><p>### 방법2 function 간결화 ###</p>')
document.write('<p>let reduceMapFnc = (acc, val, idx) => {<br>&nbsp;let obj = {};<br>&nbsp;obj.name = val;<br>&nbsp;obj.sno = idx + 1;<br>&nbsp;acc.push(obj);<br>&nbsp;return acc;<br>};</p>')
let reduceMapFnc = (acc, val, idx) => {
    let obj = {}
    obj.name = val;
    obj.sno = idx + 1;
    acc.push(obj);
    return acc;
}

document.write('<p>let reduceFilFnc = (acc, val) => {<br>&nbsp;if (val.name.startsWith("이")) {<br>&nbsp;&nbsp;acc.push(val);<br>&nbsp;}<br>&nbsp;return acc;<br>};</p>')
let reduceFilFnc = (acc, val) => {
    if (val.name.startsWith('이')) {
        acc.push(val);
    }
    return acc;
}

document.write('<p>let result = names.reduce(reduceMapFnc,[]).reduce(reduceFilFnc,[]);</p>');
let result = names.reduce(reduceMapFnc,[]).reduce(reduceFilFnc,[]);

result.forEach((val) => {
    document.write(val.sno + val.name + ' ');
})