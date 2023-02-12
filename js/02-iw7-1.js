function Cambiar(){
    var nombre= prompt ("What is your name?");
    const x= document.getElementById("nombre");
    //se nombró una constante para poder aplicar el innerHtml
    //The innerHTML property sets or returns the HTML content (inner HTML) of an element.
    x.innerHTML=nombre;
} 