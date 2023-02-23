// const indexTest =require ("../calculadora/index.js");
//^^este importaba el artefacto de prueba, está dentro de la función require y se le dice a dónde irá a buscarlo.
import { indexTest } from "../calculadora"; //ecma 6
test('test suma', () =>{
    const r = indexTest.suma(3,2);
    expect (r).toBe(5);
}); 
test.todo('test resta');
test.todo('test mult');
test.todo('test div');