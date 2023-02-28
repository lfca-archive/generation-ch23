package tiposDeDatosYVariables;

public class tiposDeDatosYvariables {

    public static void main(String[] args) {
    

        byte centigrados = 1;
        double fahrenheit = (centigrados * 1.8) + 32;
        double kelvin = centigrados + 273.15;

        System.out.println("1 centigrado a fahrenheit es" + fahrenheit);

        System.out.println("1 centigrado a kelvin es" + kelvin);

        /*
         * ºF = ºC x 1.8 + 32 formula para convertir grados centigrados a fahrenheit K =
         * ºC + 273.15
         */
        
        byte horasTrabajadas = 8;
        byte pagoPorHora = 10;
        int multiplicacionb = horasTrabajadas * pagoPorHora;
        System.out.println(multiplicacionb);
        
        //CONVERSIONES CASTING O CASTEO
        double num = 1.61;
        int numInt = (int)num;
        //Aquí ya le estamos diciendo que lo cambie a entero
        long numLong = (long)num;
        //Aqui ya le estamos diciendo que lo cambie a long
        
        System.out.println("double: " + num);
        System.out.println("int: " + numInt);
        System.out.println("long: " + numLong);
        
        //Conversion de string

        String cantidad = "15";
        String precio = "115.20";


        int cantEntero = Integer.parseInt(cantidad);  
        double precioDouble = Double.parseDouble(precio);


        System.out.println("El valor total de la compra es: " + (cantEntero * precioDouble));

         

        int edad = 30;
        double estatura = 1.61;
         

        String edadString = String.valueOf (edad);
        String estaturaString = String.valueOf (estatura); // y ahi mismo te da todos los valores que puedes utilizar para hacer conversion 

        System.out.println("Edad: " + edadString + estatura + estaturaString); 

        //conversiones
        
        
        int numero1 = 5;
        int numero2 = 7;
        int numero3 =12;
        
        int suma = numero1 + numero2 + numero3; //operador +, esperamos un 24
        int resta = numero1 - numero2 - numero3; //esperamos -14
        int multiplicación = numero1 * numero2 * numero3; //operador *, esperamos 420
        int división = numero2 / numero1; //operador /, esperamos 1,4
        int modulo = numero2 % numero1; //operador %, esperamos un 2
        int incremento = ++numero3;
        int decremento= --numero2;
        
        System.out.println("La suma es: "+ suma);
        System.out.println("La resta es: "+ resta);
        System.out.println("La multiplicación es: "+ multiplicación);
        System.out.println("La división es: "+ división);
        System.out.println("La modulo es: "+ modulo);
        System.out.println("El incremento es: "+ incremento);
        System.out.println("El decremento: "+ decremento);
        
        
        //Otro ejemplo
        
        float num1 = 3;
        float num2 = 2;
        float num3 = 2;
        float num4 = 5;
        float sumaf = num1 + num2;
        float multiplicaciónf = num3 * num4;
        float divisiónf = sumaf / multiplicaciónf;

        System.out.println(sumaf);
        System.out.println(multiplicaciónf);
        System.out.println(divisiónf);

        
        //EJERCICIOS
    
        // Ejercicio 1: Declara 3 variables de tipo entero y utiliza el operador * y %
        int var1 = 9;
        int var2 = 20;
        int var3 = 2;
        
        int multiplicacion2 = var1 * var2;
        int modulo2 = multiplicacion2 % var3; 
        
        System.out.println("El resultado es " + multiplicacion2);
        
        if (modulo2 == 0) {
        	System.out.println("El valor es par");
        }
        else {
        	System.out.println("El valor es impar");
        }
        
        //Ejercicio2: Declara dos variables de tipo boolean y utiliza el operador ==
        boolean b1 = true;
        boolean b2 = true;
        
        if (b1 == b2) {
        	System.out.println("El valor es igual");
        }
        else {
        	System.out.println("El valor no es igual");
        }
        
        //Ejercicio 3: Declara dos variables de tipo Double y utiliza el operador <
        double A = 58.29;
        double C = 1.32;
        
        if (A < C) {
        	System.out.println("El valor es A es menor");
        }
        else {
        	System.out.println("El valor A  es mayor");
        }
        
        //Ejercicio 4: Conversión de farenheit a Kelvin y a centigrados
        
        //farenheit a Kelvin
        double far = 50;
        double kel = ((far -32) * 5/9)+ 273.15;
        System.out.println("El resultado es " + kel + "grados kelvin");
        
        //Kelvin a centigrados
        double cen = (kel -273.15);
        System.out.println("El resultado es " + cen + "grados centigrados");
        
        
        //Ejercicio 5: Verificación de si un número es par o es impar
        int var4 = 9;
        
        if ((var4 % 2) == 0) {
        	System.out.println("El valor es par");
        }
        else {
        	System.out.println("El valor es impar");
        }
        
    }
    

}

/*
* datos primitivos
* Los unicos que llevan letra al final son long, float y double
 
byte: Sirve para representar un valor numerico de 8 bits (-128 al 127) 
short:Sirve para representar un valor numerico de 16 bits (-32,768 al 32767)
int: de tipo entero (sirve para representar un valor numerico de 32 bits (-(-2147483648 al 2147483647)
)
long: Sirve para representar un valor numerico ((-9223372036854775808 al 9223372036854775807)
)y se le agrega una l al final
float: Sirve para representar un valor numerico de 23 bits (numeros decimales)al final lleva una f
double: Sirve para representar un valor numerico de 64 bits (numeros decimales) al final lleva una letra d
boolean:Sirve para representar valores booleanos (0 y  1 o true or false)1 bit
char: Sirve para representar un caracter de 16 bits, entre comillas simples.*/
