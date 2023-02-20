//clasificación Abstracta, las clases se escriben en mayuscula.
//Adentro van a estar características, atributos y objetos. 
class OperacionesAritmeticas{
    numero0 = 0;
    numero1 = 0;

    sumar(a, b){
        return a+b;
    }
    constructor (valor0, valor1){
        this.numero0 = valor0;
        this.numero1 = valor1;
    }
    sumar(){
        return this.numero0+this.numero1;
    }
}

let obj1;
obj1 = new OperacionesAritmeticas();
console.log(obj1.numero0);

let obj2 = new OperacionesAritmeticas();
console.log(obj2.sumar(5,6));

let obj3= new OperacionesAritmeticas();
obj3.numero0= 8;
obj3.numero1= 5;
console.log(obj3.sumar(obj3.numero0, obj3.numero1));

let obj4= new OperacionesAritmeticas(8,6);
console.log ("---->" + obj4.sumar());