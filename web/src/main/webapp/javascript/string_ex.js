let items = 'Lorem ipsum dolor sit amet consectetur adipisicing elit. Unde maiores culpa perspiciatis? Praesentium molestias, numquam eum libero cum non vel neque ullam, itaque repudiandae odio ab est iusto quas impedit!'

let bdy = document.querySelector('body'); // body 태그를 찾아서 bdy 변수에 담는다
let div = document.createElement('div'); // div 생성
bdy.append(div); // body 안에 div 넣기

let words = items.split(' ');
words.forEach(word => {
    let span = document.createElement('span'); // <span></span>
    span.innerText = word; // <span>items</span>
    
    div.append(span); // div 안에 span 넣기
});

let inp = document.createElement('input');
let btn = document.createElement('button');
btn.innerText = '지우기';
inp.onchange = function() { // 값이 바뀌면(enter키 입력시)
    let findWord = inp.value;
    let spans = document.querySelectorAll('span');
    spans.forEach(function(span){
        if (findWord == span.innerText) {
            span.remove();
        }
    });
    inp.value = '';
    inp.focus();
}

document.querySelector('div').after(inp, btn); // div 뒤에 넣기