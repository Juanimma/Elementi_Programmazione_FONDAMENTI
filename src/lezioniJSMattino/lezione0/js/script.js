// alert("Hello, world!!");
// alert("Ciao, Dario!")
/**
 * Commento multiriga o JSdoc
 */

console.log("Ciao Mondo, questa è la console del browser");

// JS è un linguaggio DEBOLMENTE TIPIZZATO
let mioNum = 35;
let piGreco = 3.14;
let mioNome = "Dario";
let presenza = true;

var mioCognome = "Mennillo";

console.log("Ciao, mi chiamo " + mioNome + " " + mioCognome + " ho " + mioNum + " anni ");

let num1 = "4";
let num2 = "6";

// let somma = num1 + num2;
let somma = Number(num1) + Number(num2);

console.log(somma);

let prodotto = num1 * num2;
console.log(prodotto);
// let prodottoStringhe = mioNome * mioCognome; //NaN
// console.log(prodottoStringhe);

let divisione = num1 / num2;
console.log(divisione);

let sottrazione = num1 - num2;
console.log(sottrazione);

console.log(Math.sqrt(num1));


let num3 = Number( prompt("Inserisci il tuo numero fortunato. Gli sommerò 10") ) ;

let somma2 = num3 + 10;

console.log(somma2);
