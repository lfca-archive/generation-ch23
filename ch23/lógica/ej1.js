// Solicitar al usuario 3 números y guardarlos en variables
let num1 = Number(prompt("Ingrese el primer número:"));
let num2 = Number(prompt("Ingrese el segundo número:"));
let num3 = Number(prompt("Ingrese el tercer número:"));

// Identificar el número mayor, el número del centro y el número menor
let mayor = Math.max(num1, num2, num3);
let menor = Math.min(num1, num2, num3);
let centro = (num1 + num2 + num3) - mayor - menor;

// Imprimir los números ordenados de mayor a menor
console.log(mayor + ", " + centro + ", " + menor);

// Imprimir los números ordenados de menor a mayor
console.log(menor + ", " + centro + ", " + mayor);

// Identificar si los números son iguales e imprimir un mensaje correspondiente
if (num1 === num2 && num2 === num3) {
console.log("Los tres números son iguales.");
} else if (num1 === num2 || num1 === num3 || num2 === num3) {
console.log("Hay dos números iguales.");
} else {
console.log("Los tres números son diferentes.");
}
