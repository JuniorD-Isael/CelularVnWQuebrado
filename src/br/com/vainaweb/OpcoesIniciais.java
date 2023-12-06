// O programa consite em um simulador de celular, em que a partir do menu inicial possui 4 Apps: uma calculadora das 4 operações matemáticas, um conversor de temperaturas °C e °F,
// e um bloco de notas que permite escrever 2 notas e vizulizar uma ou a outra e por fim um conversor de moeda US$ e R$, todos os apps continuam rodando suas funções até que a saída
// seja selecionada. Os apps estão em classes separadas e são chamados a partir da classe OpcesIniciais. 

package br.com.vainaweb;

import java.util.Scanner;

import br.com.vainaweb.CelciFahrenheit;
import br.com.vainaweb.CalculadoraRefatorada;

public class OpcoesIniciais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao = 0;

        do {
            exibirOpcoesIniciais();
            System.out.printf("Digite o código do aplicativo: ");

            if (sc.hasNextInt()) {
                opcao = sc.nextInt();
            } else {
                opcao = 0;
            }

            switch (opcao) {
                case 1:
                    CalculadoraRefatorada.main(args);
                    break;
                case 2:
                    CelciFahrenheit.main(args);
                    break;
                case 3:
                    BlocoDeNotas.main(args);
                    break;
                case 4:
                    ConversorMoeda.main(args);
                    break;
                case 5:
                    Cronometro.main(args);
                    break;
                case 6:
                    System.out.println("Alterando idioma para inglês...");
                    opcao = OpcoesIniciais.mainUS(args);
                    break;
                case 7:
                    System.out.println("Desligando aparelho...");
                    break;
                default:
                    System.err.println("Opção inválida. Digite novamente.");
                    break;
            }
        } while(opcao != 7);
    }

    public static void exibirOpcoesIniciais() {
        System.out.println("Celular Vai na Web:");
        System.out.println(" [1] Calculadora" + "\n [2] Conversor de temperaturas" + "\n [3] Bloco de Notas\n" + " [4] Conversor de Moeda" + "\n [5] Cronômetro \n [6] Mudar para Inglês \n [7] Desligar aparelho");
    }

    public static int mainUS(String[] args) {
        System.out.println();
        Scanner sc = new Scanner(System.in);
        int opcao = 0;

        do {
            exibirOpcoesIniciaisUS();
            System.out.printf("Enter the APP code: ");

            if (sc.hasNextInt()) {
                opcao = sc.nextInt();
            } else {
                opcao = 0;
            }

            switch (opcao) {
                case 1:
                    CalculadoraRefatorada.mainUS(args);
                    break;
                case 2:
                    CelciFahrenheit.mainUS(args);
                    break;
                case 3:
                    BlocoDeNotas.mainUS(args);
                    break;
                case 4:
                    ConversorMoeda.mainUS(args);
                    break;
                case 5:
                    Cronometro.mainUS(args);
                    break;
                case 6:
                    System.out.println("Changing language to portuguese...");
                    return 0;
                case 7:
                    System.out.println("Turning off the phone...");
                    break;
                default:
                    System.err.println("Invalid option. Enter the option again.");
                    break;
            }
        } while (opcao != 7);

        return opcao;
    }

    public static void exibirOpcoesIniciaisUS() {
        System.out.println("Mobile Vai na Web:");
        System.out.println(" [1] Calculator" + "\n [2] Temperature Converter" + "\n [3] Notepad" + "\n [4] Currency Converter" + "\n [5] Stopwatch \n [6] Change to Portuguese \n [7] Turn Off the Phone");
    }
}