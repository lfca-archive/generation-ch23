 //buscar bifurcar 

//el código se va a ejecutar siempre y cuando sea lógico. Si es verdadera, se ejecuta, de lo contrario, ejecuta alguna de las otras opciones.
// if( condition) {
//  bloque código   
// } else 

//ejemplo 

let edad = parseInt (prompt("Indica tu edad")); 

if (edad >= 18){
    document.write("<h2>eres mayor de edad</h2>");
} else if (edad < 17){
    document.write("<h2>eres menor de edad</h2>");
}else {
 document.write("<h2>Este no es un número válido</h2>");
}
