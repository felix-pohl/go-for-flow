// TODO bitte modularisieren!

var historieKey = "gameHistory";

// { "schritte": [] }
function ladeHistorie() {
    let history = localStorage.getItem(historieKey);
    if (history) {
        return JSON.parse(history);
    } else {
        return {"schritte": []};
    }
}

function speichereHistorie(historie) {
    localStorage.setItem(historieKey, JSON.stringify(historie));
}

function speichereSchritt(schritt) {
    let historie = ladeHistorie();
    historie.schritte.push(schritt);
    speichereHistorie(historie);
}

function speichern(){
    let historie = ladeHistorie();
    let input = document.getElementById("historie");
    input.value = JSON.stringify(historie);
    let form = document.getElementById("saveForm");
    form.submit();
}