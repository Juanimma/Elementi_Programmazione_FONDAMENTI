// Commento ctrl + ù
/**
 * Commento multiriga
 */


// JAVASCRIPT è UN LINGUAGGIO DEBOLMENTE TIPIZZATO
//Dichiaro e assegno qualche variabile

let corso = "Elementi di Programmazione, Serale"; //String
let oreCorso = 100; //Number
let studenti = 10;
let presenza = true;
let durataEsame = 4.5;

console.log("Benvenuto al corso di " + corso + "\nore totali: " + oreCorso + "\nNum Studenti: " + studenti);

//voglio cambiare un pezzo di HTML senza modificarlo a mano nell'altra pagina
//1. recupero quella porzione di HTML
let titolo = document.getElementById("titolo");
titolo.innerHTML = "Benvenuto al corso di " + corso + "\nore totali: " + oreCorso + "\nNum Studenti: " + studenti;

//Recupero la sezione commenti per poterci scrivere dentro
let sezioneCommenti = document.getElementById("sezioneCommenti");

let nomeUser = prompt("Come ti chiami ?"); //In questa variabile viene salvata la risposta che l'utente fornisce

let commento = prompt("Scrivi un commento !");

let risultato = "User: " + nomeUser + " - " + commento;

sezioneCommenti.innerHTML = risultato;
