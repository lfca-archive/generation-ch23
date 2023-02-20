/*
¿Qué encontramos en el arbol del DOM?
-Node: cada pedacito del html, cada cambio de color, un elemento, es la unidad más básica dentro del documento. Puede ser un tag, un texto dentro de un tag o un comentario incluso.

<title> Nodo
Manipulación de DOM // <-- es un nodo, pero es hijo del title.
</title>

        -Nodo tipo Document: También es un nodo. 
        <!Doctype html> es un nodo raíz, nodo del tipo documento, apartir del cual salen los demás nodos.
        También es un nodo, del tipo deocumento, es el nodo raíz a partir del cual se desarrollan o generan todos los demás nodos. 
        -Nodo tipo Element:  son todos aquellos definidos por etiquetas
            <div> <img> <h1> <p>
        -Nodo tipo Attribute: son nodos que dan información asociada al tipo de elemento.
            en el arbol, podrían ser las hojitas. 
                en <img> por ejemplo, los atributos que tiene son alt, src, width.
        -Nodo tipo comentario: comentarios y otros elementos que están dentro del HTML, son considerados nodos. 

¿Cómo leer nodos de mi Document Object Model (DOM)

Métodos tradicionales (usados en versiones antiguas de js)
    -document.getElementByID: (boton suma)
    -document.getElementByTagName: (<button>)
    -document.getElementByClassName: (button)

*/
 
/* var elementID = document.getElementById("botonSuma");
console.log(elementID);


var elemetoetiqueta= document.getElementsByTagName("button");
console.log(elementoetiqueta);
console.log("Este es el primero elemento de mi colección de botones", elementoetiqueta[0]);

var elementoClassName=document.getElementsByClassName("button");
console.log(elementoClassName);

/* 
Métodos recientes

    -document.querySelector (#botonSuma)
    -document.querySelectroAll(.botones)
     # para ID . para class
*/

//construir calculadora
const valor0  =document.querySelector("#input1");
const valor1  =document.querySelector("#input2");
console.log(valor1);
console.log(valor2);

const botonsuma = document.querySelector("#botonSuma")
const botonresta = document.querySelector("#botonResta")
const botonmulti = document.querySelector("#botonMultiplicacion")
const botondiv = document.querySelector("#botonDivision")

const resultado = document.querySelector("#resultado");
resultado.textContent = ":P";


const imagen = document.createElement("img");
imagen.src = "https://www.petdarling.com/wp-content/uploads/2021/01/cachorros.jpg";
// imagen.setAttribute("alt","perrito");
imagen.alt = "Foto de un perrito";
imagen.className = "ImgPerr";
imagen.style.width = "300px";
document.body.append(imagen);