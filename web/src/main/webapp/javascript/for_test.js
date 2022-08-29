function for_test() {
    document.write('<a href=""><button>새로고침</button><br></a>')
    document.write('-------------------for_test.js에서 가져온 글들-------------------<br>')
    document.write('<br><div style="border: 1px solid black; padding: 10px"><p><span><</span>배열 최대값 최소값<span>></span></p>')
    const num_ = [];
    max = 0;
    for (let i = 0; i < 5; i++) {
        num_[i] = Math.ceil(Math.random() * 100);
        if (max < num_[i]) {
            max = num_[i]
        }
    }
    min = num_[0];
    for (let i = 0; i < 5; i++) {
        if (min > num_[i]) {
            min = num_[i];
        }
    }
    document.write('배열 : ');
    num_.forEach(val => {
        if (val == max) {
            document.write(`<span style="color: red;">${val}&nbsp;</span>`)
        } else if (val == min) {
            document.write(`<span style="color: blue;">${val}&nbsp;</span>`)
        } else {
            document.write(`${val}&nbsp;`)
        }
    });
    document.write('<br>최대값 : <span style="color: red;">' + max + '</span>');
    document.write(' | 최소값 : <span style="color: blue;">' + min + '</span>');
    document.write('</div>')

    document.write('<br><div style="border: 1px solid black; padding: 10px"><p><span><</span>object에 array 추가<span>></span></p>')
    document.write('<input type="text" id="add"></input><button onclick="objz.addFriend(add.value)">추가</button>')
    let objz = {
        sname: 'Hong',
        age: 20,
        friends: ['Park'],
        addFriend: function (friend) {
            this.friends.push(friend);
            document.write('<br>' + objz.friends);
        },
        friendList: function () {
            console.log(this.friends);
        }
    }

    objz.addFriend('Kim');
    objz.addFriend({
        name: 'choi',
        phone: '010-1111-2222'
    });
    console.log(objz.friends);
    console.log(objz.friends[2].phone);
    objz.friendList();
    document.write('</div>')

    document.write('<br><div style="border: 1px solid black; padding: 10px"><p><span><</span>object에 array 추가<span>></span></p>')
    document.write('<input type="text" id="numm1"></input>')

    document.write('</div>')

    document.write('<br>-------------------for_test.js에서 가져온 글들-------------------')
}

// querySelector('#num1').value