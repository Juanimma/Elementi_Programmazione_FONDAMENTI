// let studenti = new Array(); Dichiarazione con costruttore

let persone = ["Marco", "Nicolò", "Valerio", "Evaluna"];

//prop length
console.log(persone.length); // 4

//Aggiungere un elemento o più elementi con il metodo push()
persone.push("Sharon");
persone.push("Juan", "Francesco", "Leonardo", "Filippo", "Crispin", "Andrea");

let altrePersone = ["Pippo", "Paperino", "Pluto"];
persone.push(...altrePersone); // ... operatore spread, three dots spacchetta in singoli elementi un array

console.log(persone);

//Eliminare l'ultimo elemento pop()
persone.pop();
console.log(persone);

//Ordinare alfabaticamente
persone.sort();
console.log(persone);

//Ordinare AlfaBetico inverso
persone.reverse();
console.log(persone);

//Eliminiamo il primo elemento
persone.shift();
console.log(persone);

//Estraggo degli elementi con slice(inizio, fine)
persone.slice(2,4); //Questo non modifica persone ma ne fa una copia
console.log(persone.slice(2,4));

//Rimuovo o sostituisco uno o più elementi con splice(indice, elementi da rimuovere)
persone.splice(4,1); //Questo modifica persone, l'originale
console.log(persone); 

persone.splice(0,1,"Dario"); //Questo sostituisce un elemento con un altro
console.log(persone);

//cercare un elemento in un array
console.log(persone.indexOf("Andrea")); //restituisce l'indice nel quale si trova quell'elemento alla prima occorrenza

console.log(persone.lastIndexOf("Dario")); //restitusce l'indice dell'elemento all'ultima occorrenza

//Metodo filter
let filtro = persone.filter((nome) => nome.length > 6);
console.log(filtro);


//Unire elementi di un array 
let saluti = ["Ciao", "come", "stai", "?", "Tutto", "bene", "grazie"];
console.log(saluti.join(" ")); //Trasforma l'array in una stringa inserendo qualcosa tra un elemento e l'altro

//Esiste anche il metodo inverso che, partendo da una stringa la trasforma in un array
let parola = "smartphone";
console.log(parola.split("")); //split() è un metodo delle stringhe

///Esempio: inverti il tuo nome
let mioNome = "dario";
let nomeInverso = mioNome.split("").reverse().join(""); //posso concatenare
console.log(nomeInverso);


//Esercizio, dato il seguente array, estrai tutte le parole con una lunghezza >= 8 caratteri. Le parole vanno reinserite in un array
let parola2 = "dario"
console.log(parola2.length);

let paroleCasuali = ["Lorem", "Gennaro", "Smartphone", "Anna", "Monitor", "Cammello", "Case", "pranzo", "Java", "Javascript"];


// Questa è stata l'ultima lezione

<<<<<<< Updated upstream

// Abbiamo risolto accentando entrambe le soluzioni
let mioArr23 = ["Ciao", "Come", "Stai", "?"];
let mioArrayCarino = ["Questo", "è", "un", "array"];


mioArrayCarino.forEach(el =>{
    console.log(el);
})
=======
let mioArrayCarino = ["Questo", "è", "un", "array"];

mioArrayCarino.forEach(el =>{
    console.log(el);
})
>>>>>>> Stashed changes
