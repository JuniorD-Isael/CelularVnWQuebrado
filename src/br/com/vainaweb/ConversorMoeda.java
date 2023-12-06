package br.com.vainaweb;

import java.util.Scanner;

public class ConversorMoeda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao = 0;
        double cotacaoDolar = 4.89, valor = 0, resultado = 0;
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
                        System.out.printf("Digite o valor em dólar: ");

                        if (sc.hasNextDouble()) {
                            valor = sc.nextDouble();
                            resultado = (valor * cotacaoDolar);
                            System.out.println("O resultado é: R$" + resultado);
                        } else {
                            entradaInvalida = true;
                            System.out.println("Entrada inválida. Por favor, digite um número decimal.");
                            sc.next();
                        }
                    } while (entradaInvalida);
                    break;
                case 2:
                    do {
                        entradaInvalida = false;
                        System.out.printf("Digite o valor em real: ");

                        if (sc.hasNextDouble()) {
                            valor = sc.nextDouble();
                            resultado = valor / cotacaoDolar;
                            System.out.println("O resultado é: US$" + resultado);
                        } else {
                            entradaInvalida = true;
                            System.out.println("Entrada inválida. Por favor, digite um número decimal.");
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
        System.out.println(" [1] Dólar para Real" + "\n [2] Real para Dólar" + "\n [3] Voltar");
    }

    public static void mainUS(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao = 0;
        double cotacaoDolar = 4.89, valor = 0, resultado = 0;
        boolean entradaInvalida = false;

        do {
            exibirOpcoesConversorUS();
            System.out.printf("Choose a conversion option: ");

            if (sc.hasNextInt()) {
                opcao = sc.nextInt();
            } else {
                System.out.println("Invalid input. Please enter an integer.");
                sc.nextInt();
                continue;
            }

            switch (opcao) {
                case 1:
                    do {
                        entradaInvalida = false;
                        System.out.printf("Enter the value in dollars: ");

                        if (sc.hasNextDouble()) {
                            valor = sc.nextDouble();
                            resultado = (valor * cotacaoDolar);
                            System.out.println("The result is: R$" + resultado);
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
                        System.out.println("Enter the value in Brazilian real: ");
                        if (sc.hasNextDouble()) {
                            valor = sc.nextDouble();
                            resultado = valor / cotacaoDolar;
                            System.out.println("The result is: US$" + resultado);
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
        System.out.println(" [1] Dollar to Real" + "\n [2] Real to Dollar" + "\n [3] Back");
    }
}