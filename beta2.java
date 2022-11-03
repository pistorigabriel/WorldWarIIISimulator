package TrabalhoLPOO;

class Alianca {
    private String bloco;
    private double reserva;
    private Nacoes[] coligacao;
    Alianca (String nomeBloco) {
        bloco = nomeBloco;
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
