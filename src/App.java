/*
 * Tempo de Viagem: Escreva um programa que calcule o tempo 
 * de viagem com base na distância e na velocidade média inseridas pelo usuário.
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Para calcular o tempo de viagem digite a distancia: ");
        double distance = scanner.nextDouble();

        System.out.println("E agora digite a velocidade média: ");
        double speed = scanner.nextDouble();

        double result = distance / speed;

        System.out.println("O tempo de viagem é de: " + result);

        scanner.close();
    }
}
