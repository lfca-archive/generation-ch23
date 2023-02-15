var variable1= parseInt(prompt("Ingrese el valor de la variable 1"));
var variable2= parseInt(prompt("Ingrese el valor de la variable 2")); 


function suma(){

let valor1=5;
let valor2=10;
let suma= valor1+valor2;
console.log("la función: ", suma);
}

suma();

let x = function(){
    let valor1=5;
    let valor2=10;
    let suma= valor1+valor2;
    console.log("esta funcion anonima: ", suma)
}

x();

function suma(variable1, variable2){
    return(variable1+variable2)
}

function resta(variable1, variable2){
    return(variable1-variable2)
}

function multiplicacion(variable1, variable2){
    return(variable1*variable2)
}

function division(variable1, variable2){
    return(variable1/variable2)
}