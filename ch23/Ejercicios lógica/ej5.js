// Generamos un número aleatorio entre 1 y 100
const numSecreto = Math.floor(Math.random() * 100) + 1;

// Creamos un array vacío para guardar los números ingresados
const numerosIngresados = [];

// Definimos una función que verifica si un valor es un número
function esNumero(valor) {
return !isNaN(parseFloat(valor)) && isFinite(valor);
}

// Definimos una función que pide un número al usuario y lo devuelve
function pedirNumero() {
let numero = prompt("Ingresa un número del 1 al 100");
while (!esNumero(numero) || numero < 1 || numero > 100) {
    numero = prompt("Ups, el número ingresado no es válido. Ingresa un número del 1 al 100");
}
return parseInt(numero);
}

// Inicializamos la variable para guardar el número ingresado por el usuario
let numeroIngresado;

// Pedimos al usuario que ingrese un número hasta que adivine el número secreto
while (numeroIngresado !== numSecreto) {
numeroIngresado = pedirNumero();
numerosIngresados.push(numeroIngresado);
if (numeroIngresado !== numSecreto) {
    console.log("Ups, el número secreto es incorrecto, vuelve a intentarlo.");
}
}

// Si el usuario adivina el número, mostramos un mensaje de felicitación y los números ingresados
console.log("Felicidades, adivinaste el número secreto.");
console.log(`Los números que ingresaste son: ${numerosIngresados.join(", ")}`);
