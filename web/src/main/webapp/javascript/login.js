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

    if (document.getElementById("c").style.display == "none") {
        console.log('if')
        document.getElementById("c").style.display = "block";
    } else {
        console.log('else')
        document.getElementById("c").style.display = "none";
    }

}

function enter_key() {
    if (window.event.keyCode == 13) {
        document.getElementById("next").click();
    }
}

function account() {
    var name = document.getElementById("name").value;
    var mail = document.getElementById("mail").value;
    var phone1 = document.getElementById("phone1").value;
    var phone2 = document.getElementById("phone2").value;
    var phone3 = document.getElementById("phone3").value;
    var site = document.getElementById("site").value;
    var bd = document.getElementById("bd").value;
    var id = document.getElementById("id").value;
    var pw = document.getElementById("pw").value;
    var pw1 = document.getElementById("pw1").value;
    if (id == "" || pw == "" || pw1 == "") {
        alert("로그인 정보를 입력 후 다음을 눌러주세요!")
    } else if (name == "") {
        alert("이름 입력하세요!")
    } else if (mail == "") {
        alert("메일을 입력하세요!")
    } else if (phone1 == "" || phone2 == "" || phone3 == "") {
        alert("전화번호를 입력하세요!")
    } else if (site == "") {
        alert("블로그 / 홈페이지를 입력하세요!")
    } else if (bd == "") {
        alert("생년월일을 입력하세요!")
    } else {
        alert("회원가입 완료!")
        location.reload();
    }
}