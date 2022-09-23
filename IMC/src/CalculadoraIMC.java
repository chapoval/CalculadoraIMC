import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {

        double peso;
        double altura;
        double imc;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá! Bem vindo a calculadora de IMC\n");

        System.out.println("Informe o seu peso: ");
        peso = scanner.nextDouble();

        System.out.println("Informe a sua altura: ");
        altura = scanner.nextDouble();

        imc = calcularIMC(peso, altura);

        System.out.println("\nCalculando IMC...\nO seu IMC é: " + imc);
    }

    public static double calcularIMC(double a, double b){

        if(b == 0){
            throw new IllegalArgumentException("Altura inválida.");
        }

        return a / (b * b);

    }
}
