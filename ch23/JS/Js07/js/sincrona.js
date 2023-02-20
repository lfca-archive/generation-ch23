//Sincrono= se puede entender como un proceso bloqueante. Ejecución secuencial de un proceso y el resultsado se retorna cuando el proceos se completó en su totalidad. 

alert("día del michi");
console.log("Hola, buen día!");
alert(":P");
console.log("Adiós");
 
//Alert bloqueó las acciones de console, hasta que no se le de a aceptar, no procece a hacer otra cosa.

//asíncrono= no bloqueante. Cuando un proceso tiene independencia y el resultado se completa casi en paralelo con otro. Asincorono es un proceso que finaliza una operación y que da una respuesta en algun momento en el futuro/instante de tiempo, no es secuencial. 

/*setTimeout( 
    function() {
    console.log("Hola mundo, con retraso");
}, 1000)
console.log ("sorpresa");

//Aquí, con el settimeout marcó el retraso, y por eso salió "sorpresa" primero que el "Hola mundo, con retraso."
//entendí que no se usa pero es bueno conocerlo */

//Misma función, con funciones flecha, es buena práctica. 
const myCallbabk = () => console.log("Hola mundo con retraso"); 
setTimeout(myCallbabk);