package br.com.vainaweb;

import java.util.Scanner;

public class CelciFahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double TC = 0, TF = 0, resultado = 0;
        int opcao = 0;
        boolean entradaInvalida = false;

        do {
            exibirOpcoesConversor();
            System.out.printf("Escolha uma opção de conversão: ");

            if (sc.hasNextInt()) {
                opcao = sc.nextInt();
            } else {
                System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
                sc.next();
                continue;
            }

            switch (opcao) {
                case 1:
                    do {
                        entradaInvalida = false;
                        System.out.printf("Digite a temperatura em Celcius: ");

                        if (sc.hasNextDouble()) {
                            TC = sc.nextDouble();
                            resultado = (TC * 1.8) + 32;
                            System.out.println("O resultado é: " + resultado + "ºF");
                        } else {
                            entradaInvalida = true;
                            System.err.println("Entrada inválida. Por favor, digite um número decimal.");
                            sc.next();
                        }
                    } while (entradaInvalida);
                    break;
                case 2:
                    do {
                        entradaInvalida = false;
                        System.out.printf("Digite a temperatura em Fahrenheit: ");

                        if (sc.hasNextDouble()) {
                            TF = sc.nextDouble();
                            resultado = (TF - 32) / 1.8;
                            System.out.println("O resultado é: " + resultado + "ºC");
                        } else {
                            entradaInvalida = true;
                            System.err.println("Entrada inválida. Por favor, digite um número decimal.");
                            sc.next();
                        }
                    } while (entradaInvalida);
                    break;
                case 3:
                    OpcoesIniciais.main(args);
                    break;
                default:
                    System.err.println("Opcão inválida. Por favor, digite novamente.");
                    break;
            }
        } while (opcao != 3);
    }

    public static void exibirOpcoesConversor() {
        System.out.println(" [1] Celcius para Fahrenheit" + "\n [2] Fahrenheit para Celcius" + "\n [3] Voltar");
    }

    public static void mainUS(String[] args) {
        Scanner sc = new Scanner(System.in);
        double TC = 0, TF = 0, resultado = 0;
        int opcao = 0;
        boolean entradaInvalida = false;

        do {
            exibirOpcoesConversorUS();
            System.out.printf("Choose a conversion option: ");

            if (sc.hasNextInt()) {
                opcao = sc.nextInt();
            } else {
                System.out.println("Invalid input. Please, enter an integer number.");
                sc.next();
                continue;
            }

            switch (opcao) {
                case 1:
                    do {
                        entradaInvalida = false;
                        System.out.printf("Enter the temperature in Celsius: ");
                        if (sc.hasNextDouble()) {
                            TC = sc.nextDouble();
                            resultado = (TC * 1.8) + 32;
                            System.out.println("The result is: " + resultado + "ºF");
                        } else {
                            entradaInvalida = true;
                            System.err.println("Invalid input. Please, enter a decimal number.");
                            sc.next();
                        }
                    } while (entradaInvalida);
                    break;
                case 2:
                    do {
                        entradaInvalida = false;
                        System.out.printf("Enter the temperature in Fahrenheit: ");
                        if (sc.hasNextDouble()) {
                            TF = sc.nextDouble();
                            resultado = (TF - 32) / 1.8;
                            System.out.println("The result is: " + resultado + "ºC");
                        } else {
                            entradaInvalida = true;
                            System.err.println("Invalid input. Please, enter a decimal number.");
                            sc.next();
                        }
                    } while (entradaInvalida);
                    break;
                case 3:
                    OpcoesIniciais.mainUS(args);
                    break;
                default:
                    System.err.println("Invalid option. Please, enter the option again.");
                    break;
            }
        } while (opcao != 3);
    }

    public static void exibirOpcoesConversorUS() {
        System.out.println("[1] Celsius to Fahrenheit" + "\n [2] Fahrenheit to Celsius" + "\n [3] Back");
    }
}