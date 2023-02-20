const myURL = document.URL.toString();

// declaración  de una función asíncrona

const promesa = fetch(myURL);
promesa.then(resultado=> console.log(resultado),
e => console.log("error callback $(e)"));