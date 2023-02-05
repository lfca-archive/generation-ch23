let miVariable = 14; 

let miArreglo = []; //declaración literal 
let miArreglo01 = new Array(); //declaración por instancias

let miArreglo02 = [31,32,33,34];
console.log("dato de miArreglo en el índice 0 - " + miArreglo02[0]);
console.log("dato de miArreglo en el índice 1 - " + miArreglo02[1]);
console.log("dato de miArreglo en el índice 2 - " + miArreglo02[2]);
console.log("dato de miArreglo en el índice 3 - " + miArreglo02[3]);
console.log("el tamaño o número de elementos del arreglo es: " + miArreglo02.length);

let miArreglo03 = ["hola","que","tal"];
console.log (miArreglo03[0]);
console.log (miArreglo03[1]);
console.log (miArreglo03[2]);
console.log("el tamaño o número de elementos del arreglo es: " + miArreglo03.length);


let miArreglo04 = [{nombre:"Hugo"},{apellido: "Fernandez"}, {edad: "23"}];
console.log ("elemento del arreglo de tipo objeto miArreglo04  " + miArreglo04[0].nombre);
console.log ("elemento del arreglo de tipo objeto miArreglo04  " + miArreglo04[1].apellido);
console.log ("elemento del arreglo de tipo objeto miArreglo04  " + miArreglo04[2].edad);
console.log("el tamaño o número de elementos del arreglo es: " + miArreglo04.length);

let nuevoArreglo00 = [3,6,1,4]; // manera desordenada
console.log("orden de mi nuevoArreglo con sort() " + nuevoArreglo00.sort());
console.log("orden de mi nuevoArreglo con pop() " + nuevoArreglo00.pop());
console.log("orden de mi nuevoArreglo con push() " + nuevoArreglo00.push(10));
console.log("orden de mi nuevoArreglo con reverse() " + nuevoArreglo00.reverse());

let matriz =[
                [1,2,3], 
                [4,5,6],
                [7,8,9]
            ]
console.log("tamaño " + matriz.length)
console.log(matriz[1][1])
console.log(matriz[2][1])
console.log(matriz[0][2])