package br.com.vainaweb;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Cronometro {
    private int tempoFinal, tempoPassado;
    Timer timer = new Timer(true);

    public Cronometro(int tempoFinal) {
        this.tempoPassado = 0;
        this.tempoFinal = tempoFinal;
    }

    public void iniciar() {
        while (tempoPassado <= tempoFinal) {
            exibirTempo();
            tempoPassado += 1;

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void parar(Timer timer) {
        timer.cancel();
    }

    private void exibirTempo() {
        int horas = tempoPassado / 3600;
        int minutos = (tempoPassado % 3600) / 60;
        int segundosRestantes = tempoPassado % 60;

        System.out.printf("%02d:%02d:%02d%n", horas, minutos, segundosRestantes);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tempoFinal = 0;
        char iniciar = 'S';
        boolean entradaInvalida = false;

        do {
            System.out.printf("Digite o limite do cronômetro (em segundos): ");
            if (sc.hasNextInt()) {
                entradaInvalida = false;
                tempoFinal = sc.nextInt();
            } else {
                System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
                entradaInvalida = true;
            }
        } while(entradaInvalida);

        Cronometro cronometro = new Cronometro(tempoFinal);

        do {
            entradaInvalida = false;
            System.out.printf("Deseja iniciar o cronômetro? ('S' ou 'N'): ");

            iniciar = sc.next().toUpperCase().charAt(0);
            if (iniciar != 'S' && iniciar != 'N') {
                entradaInvalida = true;
                System.out.println("Entrada inválida. Por favor, 'S' OU 'N'.");
            }
        } while(entradaInvalida);

        if (iniciar == 'S') {
            cronometro.iniciar();
            try {
                Thread.sleep(cronometro.tempoFinal);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            cronometro.parar(cronometro.timer);
        } else {
            System.out.println("Retornando às opções iniciais...");
            OpcoesIniciais.main(args);
        }
    }

    public static void mainUS(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tempoFinal = 0;
        char iniciar = 'Y';
        boolean entradaInvalida = false;

        do {
            System.out.printf("Enter the timer limit (in seconds): ");
            if (sc.hasNextInt()) {
                entradaInvalida = false;
                tempoFinal = sc.nextInt();
            } else {
                System.out.println("Invalid input. Please enter an integer.");
                entradaInvalida = true;
            }
        } while(entradaInvalida);

        Cronometro cronometro = new Cronometro(tempoFinal);

        do {
            entradaInvalida = false;
            System.out.printf("Do you want to start the timer? ('Y' or 'N'): ");

            iniciar = sc.next().toUpperCase().charAt(0);
            if (iniciar != 'Y' && iniciar != 'N') {
                entradaInvalida = true;
                System.out.println("Invalid input. Please enter 'Y' OR 'N'.");
            }
        } while(entradaInvalida);

        if (iniciar == 'Y') {
            cronometro.iniciar();
            try {
                Thread.sleep(cronometro.tempoFinal);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            cronometro.parar(cronometro.timer);
        } else {
            System.out.println("Returning to the initial options...");
            OpcoesIniciais.main(args);
        }
    }
}

