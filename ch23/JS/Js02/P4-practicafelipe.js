division (14, 5);

//para pensar a futuro
agregarCarritoCompra();
borrarCarrito();
agregarProducto();
pagar();


//Funciones

function suma (a,b){
    let sum1 = a + b
    console.log(sum1);
}

/*
¿Por qué son importantes las funciones?
    - Nos permite reutilizar codigo en lugar de escribirlo varias veces. Podemos llamar nuestra funcion en distintos lugares de nuestro programa, y así lo usamos cuando lo necesitamos sin necesidad de escribirlo de nuevo.
    - Nos permite modularizar nuestro codigo, esto es, dividir nuestra aplicacion en partes mas pequeñas e independientes. Así mejoramos el entendimiento y comprensión del código.
    - Mantienen su propio espacio, y las variable que se encuentran dentro de una funcion no se pueden acceder fuera de ella (scope).
    - Por que podemos probar pequeñas partes de nuestro programa de forma aislada. (Debugging)
*/


//Función directa 
function agregarCarritoCompra(){
    //lo que hace mi función 
}

// invocar function 
agregarCarritoCompra


//funcion anónima 
//se pueden utilizar, pero no se pueden invocar antes de poner las variables, no se pueden redeclarar las variables con función anónima

//funcion anónima 
let x= functionAnonima= function(){
    let valor1= 5;
    let valor2=7;
    let suma = valor1 + valor2;
    console.log ("Esta función anónima:  ", suma)

}

funcionAnonima

// scope hace refereir al alcance o contexto, todas las funciones tienen un scope global.

//Hay variables globales y locales.


//function. 

function dividion (parametro1, parametro2){
    let resultado = parametro1 / parametro2;
    console.log(resultado);
}

division(88,10);

/*
tipos de funciones



+ funciones flecha:
-refactorizar: 
*/