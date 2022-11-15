import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Alianca {
    private String bloco;
    private double reserva = 1000;
    private int poder = 0;
    private int capacidadeBelica = 0;
    public List<Paises> coligacao = new ArrayList<>();
    Alianca (String nomeBloco) {
        bloco = nomeBloco;
    }
    public String getBloco(){
        return bloco;
    }
    public String getSede(){
        Paises sede = coligacao.get(0);
        return sede.getNome();
    }
    public int getPoder(){
        return poder;
    }
    public double getReserva(){
        return reserva;
    }
    public void imprimePaisesAliados(){
        for (int n=0;n<coligacao.size(); n++){
            Paises A = coligacao.get(n);
            if (n==0)
                System.out.println("--- " + A.getNome() + " (Sede)");
            else
                System.out.println("--- " + A.getNome());
        }
    }
    public void checaGeral(){
        System.out.println("Nome do Bloco: " + bloco);
        System.out.println("Reserva Total em $USD: " + reserva);
        System.out.println("Poder Bélico: " + poder );
        System.out.println("Países que fazem parte da Aliança: ");
        imprimePaisesAliados();
    }
    public double scoreFinal(){
        double f = 0;
        f += reserva*1.5;
        f += coligacao.size()*3;
        f += poder*2;
        return f;
    }
    public void adicionaPais(Paises Nacao) {
            coligacao.add(Nacao);
            reserva +=300;
    }
    public void atacaPais(Paises p, int tipoAtaque){
        int chances = 0;
        if (tipoAtaque==1) //Marítimo
            chances = 2 + poder + capacidadeBelica;
        else if (tipoAtaque==2) //Terrestre
            chances = 6 + poder + capacidadeBelica;
        else if (tipoAtaque==3) //Aéreo
            chances = 4 + poder + capacidadeBelica;
        
        Random rand = new Random();
        int n = rand.nextInt(chances+10);
        if (n+1<=chances) {
            adicionaPais(p);
            System.out.println("Seu ataque foi um SUCESSO! " + p.getNome() + " agora faz parte da sua Aliança!");
        }
        else {
            int z = rand.nextInt(3);
            if (poder<z)
                poder = 0;
            else
                poder -= z;
            System.out.println("Infelizmente seu ataque fracassou e sua Aliança foi enfraquecida :(");
            System.out.println("Poder atual: " + poder + "(-" + z + ")");
        }
    }
    public void executaCompra(ForcasArmadas Veiculo, int tipoCompra){
        reserva -= Veiculo.getCusto();
        poder += Veiculo.getPoder();
        if (tipoCompra==1) // Padrão (Poder)
            poder *= 1 + 20/100;
        else if (tipoCompra==2) // Cargueiro (Capacidade)
            capacidadeBelica += 2;
        else if (tipoCompra==3) // Destroyer (Chance de Êxito)
            poder *= 1 + 15/50;
    }
}

