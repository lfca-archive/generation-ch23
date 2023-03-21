let num;

// Solicitar al usuario un número hasta que se ingrese un valor válido
do {
  num = prompt('Ingrese un número entero positivo');
} while (isNaN(num) || num <= 0);

// Calcular el factorial del número
let factorial = 1;
for (let i = 1; i <= num; i++) {
  factorial *= i;
}

// Imprimir el resultado
console.log(`El factorial de ${num} es ${factorial}`);
