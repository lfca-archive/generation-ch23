let diaNumero = parseInt (prompt("Indica el día de la semana")); 

if (diaNumero=== 0){
    document.write ("domingo");
} else if (diaNumero ===1){
    document.write ("lunes");
} else if (diaNumero ===2){
 document.write ("martes");
}else if (diaNumero ===3){
    document.write ("miercoles");
}else if (diaNumero ===4){
    document.write ("jueves");
}else if (diaNumero ===5){
    document.write ("viernes");
}else if (diaNumero ===6){
    document.write ("sábado");
}else {
    document.write("Número de día inválido");
}

if (q && p) console.log("true");

let q= false;
let p= false;
if (!(!q || p)) {console.log("true")};