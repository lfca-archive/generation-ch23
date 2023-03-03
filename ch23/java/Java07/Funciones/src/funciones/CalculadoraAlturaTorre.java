package funciones;

public class CalculadoraAlturaTorre {
    public static void main(String[] args) {
        double alturaPersona = 1.50;
        double distanciaTorre = 100;
        double anguloElevacion = 30;

        Torre torre = new Torre(
            Math.tan(Math.toRadians(anguloElevacion)) * distanciaTorre,
            distanciaTorre
        );

        double altura = alturaPersona + torre.getAltura();

        System.out.println("Altura de la torre: " + torre.getAltura() + " metros");
        System.out.println("Distancia a la torre: " + torre.getDistancia() + " metros");
        System.out.println("Altura total: " + altura + " metros");
    }
}
