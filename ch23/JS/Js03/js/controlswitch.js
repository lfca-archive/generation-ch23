let dia = Number(prompt("Intriduce un número de día de la semana"));
switch (dia) {
    case 1:
        document.write("Lunes");
        break;
    case 2:
        document.write("Martes");
        break;
    case 3:
        document.write("Miercoles");
        break;
    case 4:
        document.write("Jueves");
        break;
    case 5:
        document.write("Viernes");
        break;
    case 6:
        document.write("Sábado");
        break;
    case 7:
        document.write("Domingo");
        break;
    default: 
    document.write ("No es un día valido")
    break
}