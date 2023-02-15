let miVariable= 5;

//¿Cómo se define un dato estucturado? Es una variable que almacena mas info, una variable que almacena muchas variables.
// diferencia entre variable y arreglo, arreglo tiene mas variables y se ponen entre corchetes. un arreglo es dimensional y los arreglos están identificados por un índice. Cuando se declara el arreglo, se declaran con comas para asignarles un "casillero" a cada una de ellas (se les llama tamaño, arreglo).  Ese casillero se le indica un número (se le llama indice) desde el 0 hasta x número. La cantidad lo define la memoria e incluso el lenguaje de programación.

//Arreglo de una sola dimensión
let miArray = [2, 3, 4 , 5, 6, 7]; 

// se pueden hacer arreglos dimensionales, arreglos de arreglos. se le llama matriz.
let miArray1 = [
 /*indice 0*/ [1, 2, 3] //indice 0, 1, 2
 /*indice 1*/   [4, 5, 6] //indice 0, 1, 2
 /*indice 2*/   [7, 8, 9] // indice 0, 1, 2
]
//mostrar un valor en específico, primero fila y luego columna
console.log("miArray1 "+miArray1[][])

//mostrar todo el índice, una sola dimensión. solo fila.
console.log("todo el índice" +miArray1 [])

/*Ciclo for*/
 // los parametros que necesitan for necesitan un punto de partida que se define con una variable, generalmente, siempre, con una i.  se necesita valor inicial, nosecualotro e incremento.
 //definición de iterar, anidar


 for (let i=0; i <=5; i ++){
    console.log("imprimiendo miArray-> " + miArray[i])
 }


 /*ciclo while*/
 //También es un iterador, se dice que la diferencia es que for se usa cuando se sabe cuantas iteraciones se van a hacer mientras que en while no saben cuantas.