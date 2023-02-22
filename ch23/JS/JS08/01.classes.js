class Persona {

    constructor(nombre, apellido) {
        this._nombre = nombre;
        this._apellido = apellido;
    }
    set nombre(nombre) {
        this._nombre = nombre;
    }

    get nombre() {
        return this._nombre;
    }

    set apellido(apellido) {
        this._apellido = apellido;
    }
    get apellido() {
        return this._apellido;
    }
    nombreCompleto(){
        return this._nombre + ' ' + this._apellido;
    }
//sobreescribir el metodo de la clase Padre Object
    toString(){
        return this.nombreCompleto();
    }

}
//ejemplos de herencia(?) con «extends» 
//En JavaScript, la palabra clave "super" se utiliza para llamar a los métodos de la clase padre desde una clase hija. En otras palabras, "super" es una referencia al objeto padre y se utiliza para acceder a sus propiedades y métodos desde la clase hija. Por ejemplo, si una clase hija tiene un método con el mismo nombre que un método en la clase padre, se puede utilizar "super" para llamar al método de la clase padre en lugar del método de la clase hija.
class empleado extends Persona{
    constructor(nombre, apellido, departamento){
        super (nombre, apellido);
        this._departamento = departamento;
    }
    set departamento(departamento){
        this._departamento = departamento;
    }
    get departamento(){
        return this._departamento;
    }
    //sobreescritura
    nombreCompleto(){
        return super.nombreCompleto() + ", " + this._departamento;
    }   
}

let persona1 = new Persona("Seokjin","Kim");
console.log(persona1.nombreCompleto);

let empleado1 = new Empleado ("Maria", "Perez", "Sistemas");
console.log(empleado1);
console.log(empleado1.nombre);
console.log(empleado1.toString());


//Ejemplo de clases 
//let persona1 = new Persona ("Juan", "Perez");
//console.log(persona1);

//let persona2 = new Persona ("Maria", "Jimenez");
//console.log(persona2);

//let persona3 = new Persona ("Namjoon", "Kim");
//persona3.nombre = "Jimin";
//persona3.apellido = "Park";
//console.log (persona3.nombre);
//console.log (persona3.apellido);//