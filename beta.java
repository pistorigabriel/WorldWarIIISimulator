package TrabalhoLPOO;

class Alianca {
    int numPaises;
    String nome;
    String sede;
    double reserva;
    String[] coligacao;
    Alianca(String nome, Nacao sede) {
        this.nome = nome;
        this.sede = sede;
        reserva = 400;
        addPais(sede);
    } 
    public void addPais(Nacao pais)}
    coligacao[numPaises] = pais;
    numPaises+=1;
    reserva+=100;
}

class Nacao extends Alianca {
    String nome;
    Nacao (boolean ehSede, String sigla) {
        if (ehSede==true) {
            super.reserva += 500;
        }
        else {
            reserva += 100;
        }     
    }
}

class Aeronautica extends Nacao {
    int Bombardeiro_FW_200 = 1;
    int Jato_MiG_29 = 2;
    int Caca_F22 = 3;
}

class Exercito extends Nacao {
    int Blindado_Guarani = 1;
    int Tanque_Panzer_III = 2;
    int Tanque_T34 = 3;
}

class Marinha extends Nacao {
    int Submarino_Typhoon = 1;
    int Navio_Nanchang = 2;
    int PortaAvioes_Ford_Class = 3;
}

public class beta {
    public static void main(String Args[]) {
        for (Paises i : Paises.values()) {
            System.out.println(getNome() + " - " + getSigla());
        }
    }
}
