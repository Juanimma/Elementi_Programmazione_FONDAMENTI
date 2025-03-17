//ARRAY - Contenitori ordinati di elementi simili tra loro (stesso tipo). 0 - based
//ATT: in JS posso avere array "misti" cioè con tipi diversi tra loro ma NON HA SENSO

//indice          0         1       2       3       4
let colori = ["rosso", "giallo", "blu", "verde", "rosa"];

console.log(colori[0]); //rosso
console.log(colori[3]); //verde

//Quanto misura l'array
console.log(colori.length);

//Stampo tutto l'array
console.log(colori);

//Stampo un singolo colore alla volta. Scorro l'array
for(let i = 0; i < colori.length; i++){
    console.log(colori[i]);
}

//Array Misti - consesso solo perché abbiamo un linguaggio debolmente tipizzato
//NON HA SENSO l'array sotto
let mioArr = ["Dario", "Mennillo", 35, true, "docente"];


//STAMPO tutti i colori nella lista ul
let listaColori = document.getElementById("listaColori");
// listaColori.innerHTML = "<li>" + colori[0] + "</li> <li> " + colori[1] + " </li>";
// listaColori.innerHTML = "<li>" + colori[0] + "</li>";
// listaColori.innerHTML += "<li>" + colori[1] + "</li>"
// listaColori.innerHTML += "<li>" + colori[2] + "</li>"
// listaColori.innerHTML += "<li>" + colori[3] + "</li>"
// listaColori.innerHTML += "<li>" + colori[4] + "</li>"

for(let i = 0; i < colori.length; i++){
    listaColori.innerHTML += "<li class='cRed'>" + colori[i] + "</li>";
}