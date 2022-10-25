package TrabalhoLPOO;
import java.util.Scanner;

public class main {
    public static void main(String[] Args) {
        Scanner scanf = new Scanner(System.in);
        System.out.println("Bem-vindo ao WorldWarRPG!");
        System.out.println("Aperte a tecla ENTER para começar.");
        scanf.readLine();
        System.out.println("Bom, a primeira coisa que você precisa fazer é dar um nome ao seu novo Império.");
        scanf.readLine();
        System.out.println("Como você deseja nomear essa gigante Aliança?");
        String nomeAlianca = scanf.next();
        System.out.println("Bela escolha! Agora que a aliança " + nomeAlianca + " já tem um líder, precisamos saber qual país servirá como sua sede.");
        scanf.readLine();
        System.out.println("Primeiro de tudo, precisamos saber em qual continente você deseja que sua sede esteja localizada.");
        scanf.readLine();
        System.out.println("1. África\n2. América\n3. Ásia\n4. Europa\n5. Oceania");
        System.out.println("Digite o número que corresponde ao seu continente de preferência.");
        int numContinente = scanf.nextInt();
        if (numContinente==1)
            String SelContinente = África;
        else if (numContinente==2)
            String SelContinente = América;
        else if (numContinente==3)
            String SelContinente = Ásia;
        else if (numContinente==4)
            String SelContinente = Europa;
        else if (numContinente==5)
            String SelContinente = Oceania;
        System.out.println("Ótimo, dentro da " + SelContinente + " temos os seguintes países:");
        for (Paises p : Paises.values())
            if (p.getContinente()==numContinente)
                System.out.println("Nome: " + getNome() + " --- " + "Sigla: " + getSigla());
        System.out.println("Escolha seu país-sede digitando a sigla dele:");
        System.out.println("Dica: Pense na sua sede de forma estratégica, seja por localização, tamanho ou outros motivos");
        }
}
}
