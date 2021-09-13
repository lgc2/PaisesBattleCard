package game;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Jogo {

    private Paises p1 = new Paises("Brasil", 1, 8510345.538, 213317639, 23.8,
            14563.00);
    private Paises p2 = new Paises("Canadá", 2, 9984670.0, 38005238, 3.92,
            47569.00);
    private Paises p3 = new Paises("EUA", 3, 9371175.0, 331449281, 33.0,
            65112);
    private Paises p4 = new Paises("Nova Zelândia", 4, 268680.0, 4908420, 17.9,
            40118.00);

    private Paises[] paisesArray = {p1, p2, p3, p4};
    private int posicaoDoUltimoId = paisesArray.length - 1;


    public void jogar() {
        Random aleatorio = new Random();
        Scanner in = new Scanner(System.in);
        String opcao = null;
        String opcaoDaCategoria = null;

        do {
            System.out.println("[1] Jogar!");
            System.out.println("[2] Sair do jogo!");
            opcao = in.next();

            switch (opcao) {
                case "1":
                    int sorteioDeCartaJogador1 = aleatorio.nextInt(4);
                    int sorteioDeCartaJogador2 = aleatorio.nextInt(4);
                    Paises cartaDoJogador1 = paisesArray[sorteioDeCartaJogador1];
                    Paises cartaDoJogador2 = paisesArray[sorteioDeCartaJogador2];

                    System.out.println("Digite o número da categoria escolhida:");
                    System.out.println("1 --> Área(km²).");
                    System.out.println("2 --> Número de habitantes.");
                    System.out.println("3 --> Densidade demográfica(hab/km²).");
                    System.out.println("4 --> Renda percapta(USD).");
                    opcaoDaCategoria = in.next();

                    System.out.println("Carta do Jogador1: {País: " + cartaDoJogador1.getPais() +
                            ", Área: " + cartaDoJogador1.getArea() + " km², Número de habitantes: " +
                            cartaDoJogador1.getNumeroHabitantes() + ", Densidade: " +
                            cartaDoJogador1.getOcupacao() + " hab/km², Renda Percapta: " +
                            cartaDoJogador1.getRendaPerCapta() + " USD}");

                    System.out.println("Carta do Jogador2: {País: " + cartaDoJogador2.getPais() +
                            ", Área: " + cartaDoJogador2.getArea() + " km², Número de habitantes: " +
                            cartaDoJogador2.getNumeroHabitantes() + ", Densidade: " +
                            cartaDoJogador2.getOcupacao() + " hab/km², Renda Percapta: " +
                            cartaDoJogador2.getRendaPerCapta() + " USD}");

                    switch (opcaoDaCategoria) {
                        case "1":
                            if(cartaDoJogador1.getArea() > cartaDoJogador2.getArea()) {
                                System.out.println("Jogador 1 é o vencedor!!! Área: " + cartaDoJogador1.getArea() +
                                        " km².");
                            } else if(cartaDoJogador1.getArea() < cartaDoJogador2.getArea()) {
                                System.out.println("Jogador 2 é o vencedor!!! Área: " + cartaDoJogador2.getArea() +
                                        " km².");
                            } else {
                                System.out.println("Jogadores 1 e 2 empataram!!! Área: " + cartaDoJogador1.getArea() +
                                        " km².");
                            }
                            break;

                        case "2":
                            if(cartaDoJogador1.getNumeroHabitantes() > cartaDoJogador2.getNumeroHabitantes()) {
                                System.out.println("Jogador 1 é o vencedor!!! Número de habitantes: "
                                        + cartaDoJogador1.getNumeroHabitantes() + ".");
                            } else if(cartaDoJogador1.getNumeroHabitantes() < cartaDoJogador2.getNumeroHabitantes()) {
                                System.out.println("Jogador 2 é o vencedor!!! Número de habitantes: "
                                        + cartaDoJogador2.getNumeroHabitantes() + ".");
                            } else {
                                System.out.println("Jogadores 1 e 2 empataram!!! Número de habitantes: "
                                        + cartaDoJogador1.getNumeroHabitantes() + ".");
                            }
                            break;

                        case "3":
                            if(cartaDoJogador1.getOcupacao() < cartaDoJogador2.getOcupacao()) {
                                System.out.println("Jogador 1 é o vencedor!!! Densidade demográfica: "
                                        + cartaDoJogador1.getOcupacao() + " hab/km².");
                            } else if(cartaDoJogador1.getOcupacao() > cartaDoJogador2.getOcupacao()) {
                                System.out.println("Jogador 2 é o vencedor!!! Densidade demográfica: "
                                        + cartaDoJogador2.getOcupacao() + " hab/km².");
                            } else {
                                System.out.println("Jogadores 1 e 2 empataram!!! Densidade demográfica: "
                                        + cartaDoJogador1.getOcupacao() + " hab/km².");
                            }
                            break;

                        case "4":
                            if(cartaDoJogador1.getRendaPerCapta() > cartaDoJogador2.getRendaPerCapta()) {
                                System.out.println("Jogador 1 é o vencedor!!! Renda Percapta: "
                                        + cartaDoJogador1.getRendaPerCapta() + " USD.");
                            } else if(cartaDoJogador1.getRendaPerCapta() < cartaDoJogador2.getRendaPerCapta()) {
                                System.out.println("Jogador 2 é o vencedor!!! Renda Percapta: "
                                        + cartaDoJogador2.getRendaPerCapta() + " USD.");
                            } else {
                                System.out.println("Jogadores 1 e 2 empataram!!! Renda Percapta: "
                                        + cartaDoJogador1.getRendaPerCapta() + " USD.");
                            }
                            break;
                    }
                    break;

                case "2":
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!!!");
                    break;

            }

        } while(!"2".equals(opcao));

    }

}
