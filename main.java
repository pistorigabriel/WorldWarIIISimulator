import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] Args) {
        //System.in--------------------------------------------------------------------------------------------
        Scanner scanf = new Scanner(System.in);
        //-----------------------------------------------------------------------------------------------------
        //VETORES DE PAÍSES------------------------------------------------------------------------------------
        Paises Todos[] = Paises.values();
        //-----------------------------------------------------------------------------------------------------
        //PRÉ-CRIAÇÃO DOS VEÍCULOS DESTE CASO-TESTE/JOGO-------------------------------------------------------
        ForcasArmadas Bismarck = new Navios("Bismarck", 125, 1, 15);
        ForcasArmadas Zumwalt = new Navios("Zumwalt", 310, 3, 25);

        ForcasArmadas Akagi = new PortaAvioes("Akagi", 110, 1, 2);
        ForcasArmadas FordClass = new PortaAvioes("Ford-Class", 280, 3, 3);

        ForcasArmadas Uboot = new Submarinos("Uboot", 140, 1, 10);
        ForcasArmadas Belgorod = new Submarinos("Belgorod", 350, 3, 20);

        ForcasArmadas BA27 = new Blindados("BA-27", 140, 2, 15);
        ForcasArmadas Boxer = new Blindados("Boxer", 230, 4, 25);

        ForcasArmadas MackNOG532 = new Caminhoes("MackNO-G532", 120, 2, 2);
        ForcasArmadas XH81 = new Caminhoes("XH-81", 200, 4, 3);

        ForcasArmadas PanzerIV = new Tanques("Panzer-IV", 160, 2, 10);
        ForcasArmadas M1 = new Tanques("M-1", 250, 4, 20);

        ForcasArmadas B17 = new Bombardeiros("B-17", 240, 2, 15);
        ForcasArmadas B21 = new Bombardeiros("B-21", 500, 5, 25);

        ForcasArmadas Me323 = new Cargueiros("Me-323", 230, 2, 2);
        ForcasArmadas Antonov225 = new Cargueiros("Antonov-225", 480, 5, 4);

        ForcasArmadas MKV = new Jatos("MK-V", 270, 2, 10);
        ForcasArmadas F22 = new Jatos("F-22", 550, 5, 20);
        //-----------------------------------------------------------------------------------------------------

        //Fase Inicial (Criação da Aliança)--------------------------------------------------------------------
        System.out.println("Bem-vindo ao World War III Simulator!\n");
        System.out.println("Aperte a tecla ENTER para começar.");
        scanf.nextLine();
        System.out.println("Bom, a primeira coisa que você precisa fazer é dar um nome ao seu novo Império. /ENTER/");
        scanf.nextLine();
        System.out.println("Como você deseja nomear a sua Aliança?");
        Alianca al = new Alianca(scanf.nextLine());
        System.out.println("Bela escolha! Agora que a aliança " + al.getBloco() + " já tem um líder, precisamos saber qual país servirá como sua sede. /ENTER/");
        scanf.nextLine();
        System.out.println("Primeiro de tudo, precisamos saber em qual continente você deseja que sua sede esteja localizada. /ENTER/");
        scanf.nextLine();
        System.out.println("Digite o número que corresponde ao seu continente de preferência. /ENTER/");
        scanf.nextLine();
        System.out.println("1. África\n2. América\n3. Ásia\n4. Europa\n5. Oceania");
        int numContinenteSede = scanf.nextInt();
        if (numContinenteSede==1)
            System.out.println("Ótimo, dentro da África temos os seguintes países: \n");
        else if (numContinenteSede==2)
            System.out.println("Ótimo, dentro da América temos os seguintes países: \n");
        else if (numContinenteSede==3)
            System.out.println("Ótimo, dentro da Ásia temos os seguintes países: \n");
        else if (numContinenteSede==4)
            System.out.println("Ótimo, dentro da Europa temos os seguintes países: \n");
        else if (numContinenteSede==5)
            System.out.println("Ótimo, dentro da Oceania temos os seguintes países: \n");
        for (Paises p : Todos)
            if (p.getContinente()==numContinenteSede)
                if (!al.coligacao.contains(p))
                    System.out.println(Arrays.asList(Todos).indexOf(p) + ". Nome: " + p.getNome() +  " (" + p.getSigla() + ")");
        System.out.println("Escolha seu país-sede digitando SEU NÚMERO ÚNICO:");
        System.out.println("---(Dica: Pense na sua sede de forma estratégica, seja por localização, tamanho ou outros motivos)---");
        al.adicionaPais(Todos[scanf.nextInt()]);
        System.out.println("Agora é com você, ataque países inimigos e use sua reserva para fortalecer sua Aliança! Boa Sorte!\n");
        //-----------------------------------------------------------------------------------------------------

        //O JOGO (Parada indeterminada, dada via solicitação do usuário)---------------------------------------
        while (true){
            System.out.println("-------------------------------------------------------------------------------");
            System.out.println("\n");
            System.out.println("Qual ação você deseja tomar agora? /ENTER/\n");
            scanf.nextLine();
            System.out.println("1. Atacar outro país\n");
            System.out.println("2. Comprar armamento\n");
            System.out.println("3. Checar informações da Aliança\n");
            System.out.println("(QUALQUER OUTRO NÚMERO). Encerrar o jogo\n");
            int tarefa = scanf.nextInt();
            if (tarefa==1) {
                System.out.println("Por qual meio você deseja fazer sua investida?\n");
                scanf.nextLine();
                System.out.println("1. Água\n ---(Dica: é possível atacar qualquer país do globo usando sua Marinha, porém o custo da frota é moderado e a chance de êxito é baixa.");
                System.out.println("2. Terra\n ---(Dica: só é possível atacar países do MESMO continente do seu país-SEDE usando o Exército, porém o custo da frota é baixo porém a chance de êxito é alta.");
                System.out.println("3. Ar\n ---(Dica: é possível atacar qualquer país do globo usando sua Aeronáutica, porém o custo da frota é alto e a chance de êxito é moderada.");
                int atak = scanf.nextInt();
                if (atak==1) {
                    System.out.println("Pelos mares, é possível atacar qualquer país da lista abaixo:\n");
                    for (Paises p : Todos)
                        if (!al.coligacao.contains(p))
                            System.out.println(Arrays.asList(Todos).indexOf(p) + ". Nome: " + p.getNome() +  " (" + p.getSigla() + ")");
                    al.atacaPais(Todos[scanf.nextInt()], atak);
                }
                else if (atak==2) {
                    System.out.println("Pelo solo, é possível atacar qualquer país da lista abaixo:\n");
                    for (Paises p : Todos)
                        if (!al.coligacao.contains(p) && p.getContinente()==numContinenteSede)
                            System.out.println(Arrays.asList(Todos).indexOf(p) + ". Nome: " + p.getNome() +  " (" + p.getSigla() + ")");
                    al.atacaPais(Todos[scanf.nextInt()], atak);
                }
                else if (atak==3) {
                    System.out.println("Pelos ceús, é possível atacar qualquer país da lista abaixo:\n");
                    for (Paises p : Todos)
                        if (!al.coligacao.contains(p))
                            System.out.println(Arrays.asList(Todos).indexOf(p) + ". Nome: " + p.getNome() +  " (" + p.getSigla() + ")");
                    al.atacaPais(Todos[scanf.nextInt()], atak);
                }
            }
            else if (tarefa==2) {
                System.out.println("Qual front você deseja fortalecer?\n");
                scanf.nextLine();
                System.out.println("1. Marinha");
                System.out.println("2. Exército");
                System.out.println("3. Aeronáutica");
                int compra = scanf.nextInt();
                System.out.println("Agora precisamos saber qual tipo de veículo você deseja comprar.\n");
                System.out.println("É importante frisar que cada veículo tem uma função diferente.\n");
                scanf.nextLine();
                if (compra==1) {
                    System.out.println("1. Navio (Aumenta o poder da Aliança.)");
                    System.out.println("2. Porta-Avião (Aumenta a capacidade de tropas.)");
                    System.out.println("3. Submarino (Aumenta a probabilidade de êxito no ataque.)");
                    int compraEsp = scanf.nextInt();
                    if (compraEsp==1) {
                        Bismarck.imprimeInfo();
                        Zumwalt.imprimeInfo();
                        int escolhaCompraF = scanf.nextInt();
                        if (escolhaCompraF==1)
                            al.executaCompra(Bismarck, compraEsp);
                        else if (escolhaCompraF==2)
                            al.executaCompra(Zumwalt, compraEsp);
                    }
                    else if (compraEsp==2) {
                        Akagi.imprimeInfo();
                        FordClass.imprimeInfo();
                        int escolhaCompraF = scanf.nextInt();
                        if (escolhaCompraF==1)
                            al.executaCompra(Akagi, compraEsp);
                        else if (escolhaCompraF==2)
                            al.executaCompra(FordClass, compraEsp);
                    }
                    else if (compraEsp==3) {
                        Uboot.imprimeInfo();
                        Belgorod.imprimeInfo();
                        int escolhaCompraF = scanf.nextInt();
                        if (escolhaCompraF==1)
                            al.executaCompra(Uboot, compraEsp);
                        else if (escolhaCompraF==2)
                            al.executaCompra(Belgorod, compraEsp);
                    }
                }
                else if (compra==2) {
                    System.out.println("1. Blindado (Aumenta o poder da Aliança.)");
                    System.out.println("2. Caminhão (Aumenta a capacidade de tropas.)");
                    System.out.println("3. Tanque (Aumenta a probabilidade de êxito no ataque.)");
                    int compraEsp = scanf.nextInt();
                    if (compraEsp==1) {
                        BA27.imprimeInfo();
                        Boxer.imprimeInfo();
                        int escolhaCompraF = scanf.nextInt();
                        if (escolhaCompraF==1)
                            al.executaCompra(BA27, compraEsp);
                        else if (escolhaCompraF==2)
                            al.executaCompra(Boxer, compraEsp);
                    }
                    else if (compraEsp==2) {
                        MackNOG532.imprimeInfo();
                        XH81.imprimeInfo();
                        int escolhaCompraF = scanf.nextInt();
                        if (escolhaCompraF==1)
                            al.executaCompra(MackNOG532, compraEsp);
                        else if (escolhaCompraF==2)
                            al.executaCompra(XH81, compraEsp);
                    }
                    else if (compraEsp==3) {
                        PanzerIV.imprimeInfo();
                        M1.imprimeInfo();
                        int escolhaCompraF = scanf.nextInt();
                        if (escolhaCompraF==1)
                            al.executaCompra(PanzerIV, compraEsp);
                        else if (escolhaCompraF==2)
                            al.executaCompra(M1, compraEsp);
                    }
                }
                else if (compra==3) {
                    System.out.println("1. Bombardeiro (Aumenta o poder da Aliança.)");
                    System.out.println("2. Cargueiro (Aumenta a capacidade de tropas.)");
                    System.out.println("3. Jato (Aumenta a probabilidade de êxito no ataque.)");
                    int compraEsp = scanf.nextInt();
                    if (compraEsp==1) {
                        B17.imprimeInfo();
                        B21.imprimeInfo();
                        int escolhaCompraF = scanf.nextInt();
                        if (escolhaCompraF==1)
                            al.executaCompra(B17, compraEsp);
                        else if (escolhaCompraF==2)
                            al.executaCompra(B21, compraEsp);
                    }
                    else if (compraEsp==2) {
                        Me323.imprimeInfo();
                        Antonov225.imprimeInfo();
                        int escolhaCompraF = scanf.nextInt();
                        if (escolhaCompraF==1)
                            al.executaCompra(Me323, compraEsp);
                        else if (escolhaCompraF==2)
                            al.executaCompra(Antonov225, compraEsp);

                    }
                    else if (compraEsp==3) {
                        MKV.imprimeInfo();
                        F22.imprimeInfo();
                        int escolhaCompraF = scanf.nextInt();
                        if (escolhaCompraF==1)
                            al.executaCompra(MKV, compraEsp);
                        else if (escolhaCompraF==2)
                            al.executaCompra(F22, compraEsp);
                    }
                }
            }
            else if (tarefa==3) {
                al.checaGeral();
                System.out.println("\n");
            }
            else
                break;
        }
        System.out.println("Seu SCORE FINAL foi de: " + al.scoreFinal() + " pontos\n");
        System.out.println("Obrigado por jogar o World War III Simulator!\n");
    }
}


