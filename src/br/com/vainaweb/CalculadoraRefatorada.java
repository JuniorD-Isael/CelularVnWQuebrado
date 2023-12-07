package br.com.vainaweb;

import java.util.Scanner;

public class CalculadoraRefatorada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1 = 0, n2 = 0, resultado = 0;
        int opcao = 0;
        boolean entradaInvalida = false;

        do {
            exibirOpcoesCalculadora();
            System.out.printf("Escolha uma operação matemática: ");

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
                        System.out.println("Digite o primeiro número: ");
                        if (sc.hasNextDouble()) {
                            n1 = sc.nextDouble();
                        } else {
                            entradaInvalida = true;
                            System.out.println("Entrada inválida. Por favor, digite um número decimal.");
                            sc.next();
                        }
                    } while (entradaInvalida);

                    do {
                        entradaInvalida = false;
                        System.out.println("Digite o segundo número: ");
                        if (sc.hasNextDouble()) {
                            n2 = sc.nextDouble();
                            resultado = somar(n1, n2);
                            System.out.println("Resultado da soma: " + resultado);
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
                        System.out.println("Digite o primeiro número: ");
                        if (sc.hasNextDouble()) {
                            n1 = sc.nextDouble();
                        } else {
                            entradaInvalida = true;
                            System.out.println("Entrada inválida. Por favor, digite um número decimal.");
                            sc.next();
                        }
                    } while (entradaInvalida);

                    do {
                        entradaInvalida = false;
                        System.out.println("Digite o segundo número: ");
                        if (sc.hasNextDouble()) {
                            n2 = sc.nextDouble();
                            resultado = subtrair(n1, n2);
                            System.out.println("Resultado da subtração: " + resultado);
                        } else {
                            entradaInvalida = true;
                            System.out.println("Entrada inválida. Por favor, digite um número decimal.");
                            sc.next();
                        }
                    } while (entradaInvalida);

                    break;
                case 3:
                    do {
                        entradaInvalida = false;
                        System.out.println("Digite o primeiro número: ");
                        if (sc.hasNextDouble()) {
                            n1 = sc.nextDouble();
                        } else {
                            entradaInvalida = true;
                            System.out.println("Entrada inválida. Por favor, digite um número decimal.");
                            sc.next();
                        }
                    } while (entradaInvalida);

                    do {
                        entradaInvalida = false;
                        System.out.println("Digite o segundo número: ");
                        if (sc.hasNextDouble()) {
                            n2 = sc.nextDouble();
                            resultado = multiplicar(n1, n2);
                            System.out.println("Resultado da multiplicação: " + resultado);
                        } else {
                            entradaInvalida = true;
                            System.out.println("Entrada inválida. Por favor, digite um número decimal.");
                            sc.next();
                        }
                    } while (entradaInvalida);

                    break;
                case 4:
                    do {
                        entradaInvalida = false;
                        System.out.println("Digite o primeiro número: ");
                        if (sc.hasNextDouble()) {
                            n1 = sc.nextDouble();
                        } else {
                            entradaInvalida = true;
                            System.out.println("Entrada inválida. Por favor, digite um número decimal.");
                            sc.next();
                        }
                    } while (entradaInvalida);

                    do {
                        entradaInvalida = false;
                        System.out.println("Digite o segundo número: ");
                        if (sc.hasNextDouble()) {
                            n2 = sc.nextDouble();
                            resultado = dividir(n1, n2);
                            System.out.println("Resultado da divisão: " + resultado);
                        } else {
                            entradaInvalida = true;
                            System.out.println("Entrada inválida. Por favor, digite um número decimal.");
                            sc.next();
                        }
                    } while (entradaInvalida);

                    break;
                case 5:
                    OpcoesIniciais.main(args);
                    break;
                default:
                    System.err.println("Opcão inválida. Por favor, digite novamente.");
                    break;
            }
        } while (opcao != 5);
    }

    public static void exibirOpcoesCalculadora() {
        System.out.println(" [1] ADIÇÃO" + "\n [2] SUBTRAÇÃO" + "\n [3] MULTIPLICAÇÃO" + "\n [4] DIVISÃO" + "\n [5] VOLTAR");
    }

    static double somar(double n1, double n2) {
        return n1 + n2;
    }

    static double subtrair(double n1, double n2) {
        return n1 - n2;
    }

    static double multiplicar(double n1, double n2) {
        return n1 * n2;
    }

    static double dividir(double n1, double n2) {
        return n1 / n2;
    }

    public static void mainUS(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1 = 0, n2 = 0, resultado = 0;
        int opcao = 0;
        boolean entradaInvalida = false;

        do {
            exibirOpcoesCalculadoraUS();
            System.out.println("Choose a mathematical operation: ");

            if (sc.hasNextInt()) {
                opcao = sc.nextInt();
            } else {
                System.err.println("Invalid input. Please, enter an integer.");
                sc.next();
                continue;
            }

            switch (opcao) {
                case 1:
                    do {
                        entradaInvalida = false;
                        System.out.println("Enter the first number: ");
                        if (sc.hasNextDouble()) {
                            n1 = sc.nextDouble();
                        } else {
                            entradaInvalida = true;
                            System.err.println("Invalid input. Please, enter a decimal number.");

                            sc.next();
                        }
                    } while (entradaInvalida);

                    do {
                        entradaInvalida = false;
                        System.out.println("Enter the second number: ");
                        if (sc.hasNextDouble()) {
                            n2 = sc.nextDouble();
                            resultado = somar(n1, n2);
                            System.out.println("Addition result: " + resultado);
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
                        System.out.println("Enter the first number: ");
                        if (sc.hasNextDouble()) {
                            n1 = sc.nextDouble();
                        } else {
                            entradaInvalida = true;
                            System.err.println("Invalid input. Please, enter a decimal number.");

                            sc.next();
                        }
                    } while (entradaInvalida);

                    do {
                        entradaInvalida = false;
                        System.out.println("Enter the second number: ");
                        if (sc.hasNextDouble()) {
                            n2 = sc.nextDouble();
                            resultado = subtrair(n1, n2);
                            System.out.println("Subtraction result: " + resultado);
                        } else {
                            entradaInvalida = true;
                            System.err.println("Invalid input. Please, enter a decimal number.");

                            sc.next();
                        }
                    } while (entradaInvalida);
                    break;
                case 3:
                    do {
                        entradaInvalida = false;
                        System.out.println("Enter the first number: ");
                        if (sc.hasNextDouble()) {
                            n1 = sc.nextDouble();
                        } else {
                            entradaInvalida = true;
                            System.err.println("Invalid input. Please, enter a decimal number.");

                            sc.next();
                        }
                    } while (entradaInvalida);

                    do {
                        entradaInvalida = false;
                        System.out.println("Enter the second number: ");
                        if (sc.hasNextDouble()) {
                            n2 = sc.nextDouble();
                            resultado = multiplicar(n1, n2);
                            System.out.println("Multiplication result: " + resultado);
                        } else {
                            entradaInvalida = true;
                            System.err.println("Invalid input. Please, enter a decimal number.");

                            sc.next();
                        }
                    } while (entradaInvalida);
                    break;
                case 4:
                    do {
                        entradaInvalida = false;
                        System.out.println("Enter the first number: ");
                        if (sc.hasNextDouble()) {
                            n1 = sc.nextDouble();
                        } else {
                            entradaInvalida = true;
                            System.err.println("Invalid input. Please, enter a decimal number.");

                        }
                    } while (entradaInvalida);

                    do {
                        entradaInvalida = false;
                        System.out.println("Enter the second number: ");
                        if (sc.hasNextDouble()) {
                            n2 = sc.nextDouble();
                            resultado = dividir(n1, n2);
                            System.out.println("Division result: " + resultado);
                        } else {
                            entradaInvalida = true;
                            System.err.println("Invalid input. Please, enter a decimal number.");

                            sc.next();
                        }
                    } while (entradaInvalida);
                    break;
                case 5:
                    OpcoesIniciais.mainUS(args);
                    break;
                default:
                    System.err.println("Invalid option. Please, enter the option again.");
                    break;
            }
        } while (opcao != 5);
    }

    public static void exibirOpcoesCalculadoraUS() {
        System.out.println(" [1] ADDITION" + "\n [2] SUBTRACTION" + "\n [3] MULTIPLICATION" + "\n [4] DIVISION" + "\n [5] BACK");
    }
}
