// Exercise #1
// You have a list of names: var names = ["Maria", "Antony", "Joy", "Juan"]

let varnames=["Maria", "Antony", "Joy", "Juan"]

console.log(varnames)

// Part 1
// Write a function to insert a name to the end of the list. Add your own name to the end of the list.

function agregar_nombre(){
    varnames.push("Luisa");
}

agregar_nombre();

console.log(varnames);


// Part 2
// Write a function that takes in a name and checks if the list has that name. It should return back a boolean - true/false.


var nombre = prompt("Por favor, ingresa tu nombre:");
var indicador = false;

function verificar_nombre(){
    for (var i = 0; i < 4; i++) {
        if (nombre == varnames[i]) {
            indicador = true;
        }
    }
}
verificar_nombre();

console.log(indicador);

// Part 3
// Write a function that takes in a list of names. This function should compare the list taken into the names list you currently have. The function should pass back an array with the names that are in both lists.

let varnames2=["Maria","Enrique", "Luis", "Joy"]
let varnames3=[]

function compara_lista(){
    for (var i = 0; i < 4; i++) {
        for (var j = 0; j < 4; j++) {
            if(varnames[i]==varnames2[j]){
                varnames3.push(varnames[i]);
            }
        }
    }
}

compara_lista();

console.log(varnames3);

// Part 4
// Write a function that takes in a list of names and returns a list of Integers with the length of the names in the same order as received. Hint use the push function

longitudes=[]

function largo_nombres(){
    for(let i=0; i<varnames.length;i++){
        longitudes.push(varnames[i].length);
    }
}

largo_nombres();

console.log(longitudes);


// Exercise #2
// What do the following expressions evaluate to?

// && (AND) || (OR) !(NOT)

// false || (true && false); False
// true || (11 + 12); True
// (31 + 22) || true; True
// true && (1 + 7); True
// false && (3 + 4); False
// (1 + 2) && true; True
// (32 * 4) >= 129; False
// false !== !true; False 
// true === 4; False
// false === (847 === '847'); True
// false === (887 == '887');False
// (!true || (!(100 / 5) === 20) || ((328 / 4) === 82)) || false; True



// Exercise #3
// Write a function that logs whether a number is between 0 and 25 (inclusive), between 26 and 100 (inclusive), greater than 100, or less than 0.

// numberRange(25);   // '25 is between 0 and 25'
// numberRange(75);   // '75 is between 26 and 100'
// numberRange(125);  // '125 is greater than 100'
// numberRange(-25);  // '-25 is less than 0'



function comparador(){
    let numero = parseInt(prompt("Por favor, ingresa un número: "));
    if(numero<=25){
        console.log(numero, "is between 0 and 25");
    }else if(numero>25 && numero<=100){
        console.log(numero, "is between 26 and 100");        
    }else if(numero>100){
        console.log(numero,"is greater than 100");
    }else{
        console.log(numero,"is less than 0");
    }
}

comparador(-25);

if (AcumulativeGPA > 2.0 && Totalunits >= 120) {
    console.log("You can graduate!");
  }


  if (notecsp >= 75 && noteprog >= 75) {
  console.log("You're eligible to graduate!");
}

let text = "Hello World";
let messaje = " ";
let anterior = "";

for (let index=0; index < text.length; index++){
    if (msj != ""){
        anterior= text [index-1];
        if(anterior != " " && texto [index] != " "){
            msj += ".";
        }
    }
    msj += texto[index];
}
console.log(msj);