package ej7;
import java.util.Scanner;


public class FinDeSemana {
	public static void main(String[] args) {
        String[] diasSemana = {"lunes", "martes", "miércoles", "jueves", "viernes"};
        Scanner scanner = new Scanner(System.in);
        String dia = "";
        int hora = -1;
        int minutos = -1;
        boolean entradaValida = false;
        while (!entradaValida) {
            System.out.print("Ingresa un día de la semana (lunes a viernes): ");
            dia = scanner.nextLine().toLowerCase();
            if (!isValidDay(dia, diasSemana)) {
                System.out.println("Error: día de la semana no válido.");
                continue;
            }
            System.out.print("Ingresa la hora (0-23): ");
            hora = scanner.nextInt();
            if (hora < 0 || hora > 23) {
                System.out.println("Error: hora no válida.");
                continue;
            }
            System.out.print("Ingresa los minutos (0-59): ");
            minutos = scanner.nextInt();
            if (minutos < 0 || minutos > 59) {
                System.out.println("Error: minutos no válidos.");
                continue;
            }
            entradaValida = true;
        }
        int minutosFaltantes = calcularMinutosFaltantes(dia, hora, minutos);
        System.out.println("Faltan " + minutosFaltantes + " minutos para el fin de semana.");
    }

    public static boolean isValidDay(String dia, String[] diasSemana) {
        for (String d : diasSemana) {
            if (dia.equals(d)) {
                return true;
            }
        }
        return false;
    }

    public static int calcularMinutosFaltantes(String dia, int hora, int minutos) {
        int minutosActuales = hora * 60 + minutos;
        int minutosFinSemana = 15 * 60; // 15:00 horas del viernes
        switch (dia) {
            case "lunes":
                minutosActuales += 24 * 60;
                break;
            case "martes":
                minutosActuales += 24 * 60;
                break;
            case "miércoles":
                minutosActuales += 24 * 60;
                break;
            case "jueves":
                minutosActuales += 24 * 60;
                break;
            case "viernes":
                if (minutosActuales >= minutosFinSemana) {
                    minutosFinSemana += 48 * 60; // sumar 2 días
                }
                break;
        }
        int minutosFaltantes = minutosFinSemana - minutosActuales;
        return minutosFaltantes;
    }

}
