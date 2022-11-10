package TrabalhoLPOO;

class Alianca {
    private String bloco;
    private double reserva;
    private Nacoes[] coligacao;
    Alianca (String nomeBloco) {
        bloco = nomeBloco;
    }
    public void atacaPais(){
        System.out.println("Por qual meio você deseja fazer sua investida?\n");
        System.out.println("1. Água\n ---(Dica: é possível atacar qualquer país do globo usando sua Marinha, porém o custo da frota é moderado e a chance de êxito é baixa.");
        System.out.println("2. Terra\n ---(Dica: só é possível atacar países do MESMO continente país usando seu Exército, porém o custo da frota é baixo porém a chance de êxito é alta.");
        System.out.println("3. Ar\n ---(Dica: é possível atacar qualquer país do globo usando sua Aeronáutica, porém o custo da frota é alto e a chance de êxito é moderada.");
    }

    private Paises getSede(String AliancaM){
        return AliancaM.coligacao[0];
    }

}

class Nacoes {
    private String nome;
    private String sigla;
    private int continente;
    private double reserva;
    Nacoes(String Sigla, String Nome, int Continente) {
        this.sigla = Sigla;
        this.nome = Nome;
        this.continente = Continente;
        this.reserva = 300;
    }
}

for (Paises p : Paises.values()) {
    Nacoes p.getNome() =  new Nacoes(p.getSigla(),p.getNome(),p.getContinente());
}

public class beta {
    public static void main(String Args[]) {
        for (Paises i : Paises.values()) {
            System.out.println(getNome() + " - " + getSigla());
        }
    }
}
