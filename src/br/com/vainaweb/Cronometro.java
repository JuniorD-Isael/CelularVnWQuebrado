package br.com.vainaweb;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Cronometro {
    private int tempoFinal, tempoPassado;
    private boolean pausado, running;
    Timer timer = new Timer(true);

    public Cronometro(int tempoFinal) {
        this.tempoPassado = 0;
        this.tempoFinal = tempoFinal;
        this.pausado = false;
        this.running = false;
    }

    public void iniciar() {
        running = true;
        TimerTask task = new TimerTask() {
            public void run() {
                while (tempoPassado <= tempoFinal && running) {
                    if (!pausado) {
                        exibirTempo();
                        tempoPassado += 1;
                    }

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        timer.scheduleAtFixedRate(task, 0, 1000);
        capturarEntradaTeclado();
    }

    public void capturarEntradaTeclado() {
        Thread thread = new Thread(() -> {
            Scanner sc = new Scanner(System.in);
            while (tempoPassado <= tempoFinal && running) {
                if (sc.hasNextLine()) {
                    String input = sc.nextLine();
                    if (input.isEmpty()) {
                        pausado = !pausado;
                        if (pausado) {
                            System.out.println("Cronômetro pausado. Pressione Enter para continuar...");
                        } else {
                            System.out.println("Cronômetro retomado. Pressione Enter para pausar...");
                        }
                    } else if (input.equalsIgnoreCase("q")) {
                        running = false;
                        System.out.println("Cronômetro parado.");
                        parar();
                        break;
                    }
                }
            }
        });
        thread.start();
    }

    public void parar() {
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
        boolean entradaInvalida = false;

        do {
            System.out.printf("Digite o limite do cronômetro (em segundos): ");
            if (sc.hasNextInt()) {
                entradaInvalida = false;
                tempoFinal = sc.nextInt();
            } else {
                System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
                entradaInvalida = true;
                sc.nextLine();
            }
        } while(entradaInvalida);

        Cronometro cronometro = new Cronometro(tempoFinal);
        cronometro.iniciar();
    }

    public static void mainUS(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tempoFinal = 0;
        boolean entradaInvalida = false;

        do {
            System.out.printf("Enter the timer limit (in seconds): ");
            if (sc.hasNextInt()) {
                entradaInvalida = false;
                tempoFinal = sc.nextInt();
            } else {
                System.out.println("Invalid input. Please enter an integer.");
                entradaInvalida = true;
                sc.nextLine();
            }
        } while(entradaInvalida);

        Cronometro cronometro = new Cronometro(tempoFinal);
        cronometro.iniciar();
    }
}
