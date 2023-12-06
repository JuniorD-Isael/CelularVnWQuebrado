package br.com.vainaweb;

import java.util.ArrayList;
import java.util.Scanner;

public class BlocoDeNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> notaSalvo1 = new ArrayList<>();
        ArrayList<String> notaSalvo2 = new ArrayList<>();
        int alt = 0, escolha = 0, criarNota = 0;

        do {
            exibirOpcoes();
            System.out.printf("Digite uma opção: ");
            alt = sc.nextInt();
            if (alt == 1) {
                notaSalvo1 = CriarNota1();
                System.out.println("Você deseja escrever outra nota? [1] Sim / [2] Não");
                criarNota = sc.nextInt();
                if (criarNota == 1) {
                    notaSalvo2 = CriarNota2();
                }
            } else if (alt == 2) {
                System.out.println("Qual nota você quer visualizar? [1] ou [2]?");
                escolha = sc.nextInt();
                if (escolha == 1 && !notaSalvo1.isEmpty()) {
                    System.out.println("Aqui está a nota numero 1: ");
                    for (String nota : notaSalvo1) {
                        System.out.println(nota);
                    }
                } else if (escolha == 2 && !notaSalvo2.isEmpty()) {
                    System.out.println("Aqui está a nota numero 2: ");
                    for (String nota : notaSalvo2) {
                        System.out.println(nota);
                    }
                } else if (escolha == 2 && notaSalvo2.isEmpty()) {
                    System.out.println("A segunda nota está vazia.");
                } else if (escolha == 1 && notaSalvo1.isEmpty()) {
                    System.out.println("A primeira nota está vazia.");
                }
            }
        } while (alt > 0 && alt < 3);

        OpcoesIniciais.main(args);
    }

    public static ArrayList<String> CriarNota1() {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> nota1 = new ArrayList<>();

        System.out.println("Escreva a sua nota[1] aqui:");
        nota1.add(sc.nextLine());

        return nota1;
    }

    public static ArrayList<String> CriarNota2() {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> nota2 = new ArrayList<>();

        System.out.println("Escreva a sua nota[2] aqui:");
        nota2.add(sc.nextLine());

        return nota2;
    }

    public static void exibirOpcoes() {
        System.out.println(" [1] Criar uma Nota"
                + "\n [2] Visualizar notas escritas." + "\n [3] Sair");
    }

    public static void mainUS(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> notaSalvo1 = new ArrayList<>();
        ArrayList<String> notaSalvo2 = new ArrayList<>();
        int alt = 0, escolha = 0, criarNota = 0;

        do {
            exibirOpcoesUS();
            System.out.printf("Enter an option: ");
            alt = sc.nextInt();

            if (alt == 1) {
                notaSalvo1 = CriarNota1US();
                System.out.println("Do you want to write another note? [1] Yes / [2] No");
                criarNota = sc.nextInt();
                if (criarNota == 1) {
                    notaSalvo2 = CriarNota2();
                }
            } else if (alt == 2) {
                System.out.println("Which note do you want to view? [1] or [2]?");
                escolha = sc.nextInt();
                if (escolha == 1 && !notaSalvo1.isEmpty()) {
                    System.out.println("Here is note number 1: ");
                    for (String nota : notaSalvo1) {
                        System.out.println(nota);
                    }
                } else if (escolha == 2 && !notaSalvo2.isEmpty()) {
                    System.out.println("Here is note number 2: ");
                    for (String nota : notaSalvo2) {
                        System.out.println(nota);
                    }
                } else if (escolha == 2 && notaSalvo2.isEmpty()) {
                    System.out.println("The second note is empty.");
                } else if (escolha == 1 && notaSalvo1.isEmpty()) {
                    System.out.println("The first note is empty.");
                }
            }

        } while (alt > 0 && alt < 3);

        OpcoesIniciais.mainUS(args);
    }

    public static ArrayList<String> CriarNota1US() {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> nota1 = new ArrayList<>();

        System.out.println("Write your note [1] here:");
        nota1.add(sc.nextLine());

        return nota1;
    }

    public static ArrayList<String> CriarNota2US() {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> nota2 = new ArrayList<>();

        System.out.println("Write your note [2] here:");
        nota2.add(sc.nextLine());

        return nota2;
    }

    public static void exibirOpcoesUS() {
        System.out.println(" [1] Create a Note" + "\n [2] View written notes."
                + "\n [3] Exit");
    }
}