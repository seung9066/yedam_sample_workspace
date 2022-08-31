
function liston() {
    let tr = document.createElement('tr');
    let tdid = document.createElement('td');
    let tdpw = document.createElement('td');
    let tdtel = document.createElement('td');

    let id1 = document.getElementById('mid').value;
    tdid.innerText = id1;

    let name1 = document.getElementById('mname').value;
    tdpw.innerText = name1;

    let tel1 = document.getElementById('mtel').value;
    tdtel.innerText = tel1;

    tr.appendChild(tdid);
    tr.appendChild(tdpw);
    tr.appendChild(tdtel);


    document.getElementById('list').appendChild(tr);
};