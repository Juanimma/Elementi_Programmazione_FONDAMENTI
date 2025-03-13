//IF STATEMENT
let punteggioUser = 55;
let skillUser = 35;
let ricompensa = 0;
let messaggioUser = "";

// if(punteggioUser >= 50){
//     console.log("Complimenti, hai superato il livello");
// }else{
//     console.log("Mi spiace, non hai superato il livello");
// }

// giochino HARD MODE: per poter superare un livello l'utente deve avere un punteggio >= 50 punti e una skill >= 30

console.log("GIOCO modalità HARD MODE");

if(punteggioUser >= 50 && skillUser >= 30){
    console.log("Bravo hai superato il livello");
    messaggioUser = "Bravo hai superato il livello";
    ricompensa += 10;

}else if(punteggioUser >= 50 && skillUser < 30){
    console.log("Mi spiace, le tue skill non sono sufficienti");
    messaggioUser = "Mi spiace, le tue skill non sono sufficienti";
    ricompensa += 2;

}else if(punteggioUser < 50 && skillUser >= 30){
    console.log("Mi spiace, il tuo punteggio non è sufficiente");
    messaggioUser = "Mi spiace, il tuo punteggio non è sufficiente";
    ricompensa += 2;
}else{
    console.log("Caro utente sia il punteggio sia le skill non sono sufficienti");
    messaggioUser = "Caro utente sia il punteggio sia le skill non sono sufficienti";
    ricompensa -= 1;
}

console.log("La tua ricompensa è di " + ricompensa);


//giochino EASY MODE: basta che uno dei due sia sopra la soglia per superare il livello
console.log("GIOCO modalità EASY MODE");

if(punteggioUser >= 50 || skillUser >= 30){
    console.log("Bravo hai superato il livello");
}else{
    console.log("Non hai superato il livello");
} 

 
//Voglio mostrare il risultato ottenuto giocando in hard mode sulla pagina
//1. devo recuperare l'elemento nel quale voglio scrivere. Utilizzo il metodo getElementById()
let boxRes = document.getElementById("boxRes");
console.log(boxRes); //mostro com'è fatto l'oggetto boxRes

//2. voglio cambiare quello che c'è al suo interno. Utilizzo la prop innerHTML
// boxRes.innerHTML = "<h4>" + messaggioUser + "</h4><p>Skill: " + skillUser + "</p><p> Punteggio: " + punteggioUser + "</p><p> Ricompensa: " + ricompensa + "</p>";


    //utilizzo il backtick ` (ALT + 96)
    boxRes.innerHTML = `<h4> ${messaggioUser} </h4>
    <p> Skill: ${skillUser} </p>
    <p> Punteggio: ${punteggioUser} </p>
    <p> Ricompensa: ${ricompensa} </p> `;
    


