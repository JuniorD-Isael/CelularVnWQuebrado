package br.com.vainaweb;

import java.util.Scanner;

public class CalculadoraRefatorada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float n1 = 0, n2 = 0, resultado = 0;
        int opcao = 0;

        exibirOpcoesCalculadora();

        do {
            System.out.println("Escolha uma operação matemática: ");
            if (sc.hasNextInt()) {
                opcao = sc.nextInt();
            } else {
                System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
                opcao = sc.nextInt();
                continue;
            }

            switch (opcao) {
                case 1:
                    System.out.println("Digite o primeiro número: ");
                    n1 = sc.nextFloat();
                    System.out.println("Digite o segundo número: ");
                    n2 = sc.nextFloat();
                    resultado = somar(n1, n2);
                    System.out.println("Resultado da soma: " + resultado);
                    break;
                case 2:
                    System.out.println("Digite o primeiro número: ");
                    n1 = sc.nextFloat();
                    System.out.println("Digite o segundo número: ");
                    n2 = sc.nextFloat();
                    resultado = subtrair(n1, n2);
                    System.out.println("Resultado da subtração: " + resultado);
                    break;
                case 3:
                    System.out.println("Digite o primeiro número: ");
                    n1 = sc.nextFloat();
                    System.out.println("Digite o segundo número: ");
                    n2 = sc.nextFloat();
                    resultado = multiplicar(n1, n2);
                    System.out.println("Resultado da multiplicação: " + resultado);
                    break;
                case 4:
                    System.out.println("Digite o primeiro número: ");
                    n1 = sc.nextFloat();
                    System.out.println("Digite o segundo número: ");
                    n2 = sc.nextFloat();
                    resultado = dividir(n1, n2);
                    System.out.println("Resultado da divisão: " + resultado);
                    break;
                case 5:
                    OpcoesIniciais.main(args);
                    break;
                default:
                    System.out.println("Opcão Inválida!");
            }
        } while (opcao != 5);
    }

    public static void exibirOpcoesCalculadora() {
        System.out.println(" [1] SOMA" + "\n [2] SUBTRAÇÃO" + "\n [3] MULTIPLICAÇÃO" + "\n [4] DIVISÃO" + "\n [5] VOLTAR");
    }

    static float somar(float n1, float n2) {
        return n1 + n2;
    }

    static float subtrair(float n1, float n2) {
        return n1 - n2;
    }

    static float multiplicar(float n1, float n2) {
        return n1 * n2;
    }

    static float dividir(float n1, float n2) {
        return n1 / n2;
    }

    public static void mainUS(String[] args) {
        Scanner sc = new Scanner(System.in);
        float n1 = 0, n2 = 0, resultado = 0;
        int opcaoUS = 0;

        do {
            exibirOpcoesCalculadoraUS();
            System.out.println("Choose a mathematical operation: ");
            if (sc.hasNextInt()) {
                opcaoUS = sc.nextInt();
            } else {
                System.out.println("Invalid input. Please enter an integer.");
                sc.next();
                continue;
            }
            switch (opcaoUS) {
                case 1:
                    System.out.println("Enter the first number: ");
                    n1 = sc.nextFloat();
                    System.out.println("Enter the second number: ");
                    n2 = sc.nextFloat();
                    resultado = somar(n1, n2);
                    System.out.println("Sum result: " + resultado);
                    break;
                case 2:
                    System.out.println("Enter the first number: ");
                    n1 = sc.nextFloat();
                    System.out.println("Enter the second number: ");
                    n2 = sc.nextFloat();
                    resultado = subtrair(n1, n2);
                    System.out.println("Subtraction result: " + resultado);
                    break;
                case 3:
                    System.out.println("Enter the first number: ");
                    n1 = sc.nextFloat();
                    System.out.println("Enter the second number: ");
                    n2 = sc.nextFloat();
                    resultado = multiplicar(n1, n2);
                    System.out.println("Multiplication result: " + resultado);
                    break;
                case 4:
                    System.out.println("Enter the first number: ");
                    n1 = sc.nextFloat();
                    System.out.println("Enter the second number: ");
                    n2 = sc.nextFloat();
                    resultado = dividir(n1, n2);
                    System.out.println("Division result: " + resultado);
                    break;
                case 5:
                    OpcoesIniciais.mainUS(args);
                    break;
                default:
                    System.out.println("Invalid Option!");
            }
        } while (opcaoUS != 5);
    }

    public static void exibirOpcoesCalculadoraUS() {
        System.out.println(" [1] SUM" + "\n [2] SUBTRACTION" + "\n [3] MULTIPLICATION" + "\n [4] DIVISION" + "\n [5] BACK");
    }
}
