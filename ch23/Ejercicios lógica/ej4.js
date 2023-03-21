let num = prompt("Ingrese un número");

while (isNaN(num)) {
alert("Error: debe ingresar un número.");
num = prompt("Ingrese un número");
}

let fibonacci = [0, 1];

for (let i = 2; i < num; i++) {
fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
}

console.log(fibonacci.slice(0, num));
