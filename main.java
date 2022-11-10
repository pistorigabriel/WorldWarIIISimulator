package TrabalhoLPOO;
import java.util.Scanner;

public class main {
    public static void main(String[] Args) {
        Scanner scanf = new Scanner(System.in);
        System.out.println("Bem-vindo ao WorldWarRPG!");
        System.out.println("Aperte a tecla ENTER para começar.");
        System.out.println("Bom, a primeira coisa que você precisa fazer é dar um nome ao seu novo Império.");
        System.out.println("Como você deseja nomear essa gigante Aliança?");
        String nomeAlianca = scanf.next();
        System.out.println("Bela escolha! Agora que a aliança " + nomeAlianca + " já tem um líder, precisamos saber qual país servirá como sua sede.");
        System.out.println("Primeiro de tudo, precisamos saber em qual continente você deseja que sua sede esteja localizada.");
        System.out.println("1. África\n2. América\n3. Ásia\n4. Europa\n5. Oceania");
        System.out.println("Digite o número que corresponde ao seu continente de preferência.");
        int numContinente = scanf.nextInt();
        if (numContinente==1)
            System.out.println("Ótimo, dentro da África temos os seguintes países:");
        else if (numContinente==2)
            System.out.println("Ótimo, dentro da América temos os seguintes países:");
        else if (numContinente==3)
            System.out.println("Ótimo, dentro da Ásia temos os seguintes países:");
        else if (numContinente==4)
            System.out.println("Ótimo, dentro da Europa temos os seguintes países:");
        else if (numContinente==5)
            System.out.println("Ótimo, dentro da Oceania temos os seguintes países:");
        for (Paises p : Paises.values())
            if (p.getContinente()==numContinente)
                System.out.println("Nome: " + p.getNome() +  " (" + p.getSigla() + ")");
        System.out.println("Escolha seu país-sede digitando a sigla dele:");
        System.out.println("Dica: Pense na sua sede de forma estratégica, seja por localização, tamanho ou outros motivos");
        System.out.println("Agora é com você, ataque países inimigos e use sua reserva para fortalecer sua Aliança! Boa Sorte!");
        while (true){
            System.out.println("Qual ação você deseja tomar agora?\n");
            System.out.println("1. Atacar outro país\n");
            System.out.println("2. Comprar armamento\n");
            System.out.println("3. Checar informações da Aliança\n");
            System.out.println("4. Encerrar o jogo\n");
            int Tarefa = scanf.nextInt();
            if (Tarefa==1)
                atacaPais();
            else if (Tarefa==2)
                compraArmamento();
            else if (Tarefa==3)
                checaGeral();
            else if (Tarefa==4)
                break;
            else
                System.out.println("NÚMERO INVÁLIDO, DIGITE NOVAMENTE!");
        }
        System.out.println("Obrigado por jogar o WorldWarRPG conosco!");
        System.out.println("Seu SCORE FINAL foi de: " + scoreFinal() + " pontos"());
    }
}

