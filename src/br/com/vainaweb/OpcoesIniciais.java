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
        exibirOpcoesIniciais();
        int opcao = sc.nextInt();

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
                mainUS();
                break;
            default:
                System.err.println("Opção Inválida!");
                break;
        }

        sc.close();

    }


    public static void exibirOpcoesIniciais() {
        System.out.println("Celular Vai na Web: " + "\n Escolha um APP abaixo");
        System.out.println(" [1] Calculadora" + "\n [2] Conversor de temperaturas" + "\n [3] Bloco de Notas\n" + " [4] Conversor de Moeda" + "\n [5] Idioma Inglês");
    }


    public static void mainUS() {
        System.out.println();
        Scanner sc = new Scanner(System.in);
        exibirOpcoesIniciaisUS();
        int opcaoUS = sc.nextInt();
        switch (opcaoUS) {

            case 1:
                CalculadoraRefatorada.mainUS();
                break;
            case 2:
                CelciFahrenheit.mainUS();
                break;
            case 3:
                BlocoDeNotas.mainUS();
                break;
            case 4:
                ConversorMoeda.mainUS();
                break;
            case 5:
                exibirOpcoesIniciais();
                break;
            default:
                System.err.println("Invalid Option!");
                break;
        }

        sc.close();

    }

    public static void exibirOpcoesIniciaisUS() {
        System.out.println("Mobile Vai na Web: " + "\n Choose an APP below");
        System.out.println(" [1] Calculator" + "\n [2] Temperature Converter" + "\n [3] Notepad" + "\n [4] Currency Converter" + "\n [5] Change to Portuguese");
    }
}
	


