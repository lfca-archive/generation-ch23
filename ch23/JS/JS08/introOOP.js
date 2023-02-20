let persona = {
    nombre: "Juan",
    apellido: "Perez", 
    nombreCompleto: function(){
        return "el nombre es " + this.nombre + " " +this.apellido;
    }
}
//un ojeto tiene propiedades o atributos, funciones o métodos.

console.log(persona);
console.log(persona.nombre);
console.log(persona.nombreCompleto());