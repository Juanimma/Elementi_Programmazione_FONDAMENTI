// Script per gli statement
//If statement
let etaUser = 25;
let password = "Pluto25";

if(etaUser >= 18 && password == "Pluto25"){
    console.log("Benvenuto, puoi entrare!");
}else{
    console.log("Mi spiace, non puoi entrare!");
}

console.log(typeof etaUser);
console.log(typeof password);

//FOR STATEMENT
for(let i = 0; i < 5; i++){

    if(i%2 == 0){
        console.log(i + " è pari");
        
    }else{
        console.log(i + " è dispari");
        
    }

}


//SWITCH
let msg = ""; 
let level = 3;

switch(level){
    case 1:
        msg = "Buona fortuna per il primo livello";
        break;
    case 2:
        msg = "Ci sei quasi, dopo questo c'è ancora un altro livello";
        break;
    case 3:
        msg = "Questo è l'ultimo livello, anche il più difficile";
        break;
    default:
        msg = "Ciao giocatore";
        break
}

console.log(msg);


// WHILE
// while(condizione){
// questo codice è eseguito fin tanto che è valida la condizione
// }

let i = 1; //sentinella
let msg2 = "";

while(i <= 10){
    msg2 = i + " x 5 = " + (i*5);
    console.log(msg2);
    i++;
}

//DO - WHILE
// prima eseguo qualcosa poi controllo con il while

let l = 1;
let msg3 = "";

do{
    msg3 = l + " x 6 = " + (l * 6);
    console.log(msg3);
    l++;
}while(l <= 10)



