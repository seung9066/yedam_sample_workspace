function check() {
    var id = document.getElementById("id").value;
    var pw = document.getElementById("pw").value;
    var pw1 = document.getElementById("pw1").value;
    if (id == "") {
        alert("아이디를 입력하세요!")
    } else if (pw == "") {
        alert("비밀번호를 입력하세요!")
    } else if (pw != pw1) {
        alert("비밀번호가 일치하지 않습니다!")
    } else {
        document.getElementById("a").style.display = "none";
        document.getElementById("b").style.display = "block";
    }
}

function menu() {

    console.log(document.getElementById("c").style.display)
    
    if(document.getElementById("c").style.display == "none"){
        console.log('if')
        document.getElementById("c").style.display = "block";
    } else{
        console.log('else')
        document.getElementById("c").style.display = "none";
    }

}

function enter_key() {
    if (window.event.keyCode == 13) {
        document.getElementById("next").click();
    }
}