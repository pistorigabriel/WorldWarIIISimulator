package TrabalhoLPOO;

class Alianca {
    String bloco;
    String sede;
    String[] coligacao;
    Alianca (String nomeBloco) {
        bloco = nomeBloco;
    }
}

class Nacao extends Alianca {
    String nome;
    int numTropas = 3;
    double reserva;
    Nacao (boolean ehSede, char nSede) {
        /*
        Só é possível criar uma sede em um pais com: 
        - PIB Nominal superior à 1,2 trilhões de dólares (FMI) 
        */
        if (ehSede==true) {
            reserva = 500;
            if (nSede=='a') {
                super.sede = "Estados Unidos";
                nome = "Estados Unidos";
            }
            else if (nSede=='b') {
                super.sede = "Rússia";
                nome = "Rússia";
            }
            else if (nSede=='c') {
                super.sede = "França";
                nome = "França";
            }   
            else if (nSede=='d') {
                super.sede = "Reino Unido";
                nome = "Reino Unido";
            }
            else if (nSede=='e') {
                super.sede = "Alemanha";
                nome = "Alemanha";
            }
            else if (nSede=='f') {
                super.sede = "Italia";
                nome = "Italia";
            }
            else if (nSede=='g') {
                super.sede = "Japao"; 
                nome = "Japao"; 
            }
            else if (nSede=='h') {
                super.sede = "China"; 
                nome = "China"; 
            }
            else if (nSede=='i') {
                super.sede = "Índia"; 
                nome = "Índia"; 
            }
            else if (nSede=='j') {
                super.sede = "Canadá"; 
                nome = "Canadá"; 
            }
            else if (nSede=='k') {
                super.sede = "Coreia do Sul"; 
                nome = "Coreia do Sul"; 
            }
            else if (nSede=='l') {
                super.sede = "Brasil"; 
                nome = "Brasil"; 
            }
            else if (nSede=='m') {
                super.sede = "Austrália"; 
                nome = "Austrália"; 
            }
            else if (nSede=='n') {
                super.sede = "Espanha"; 
                nome = "Espanha"; 
            }
        }
        else {
            reserva = 100;
        }     
    }
}

class Arsenal extends Nacao {

}

class Aeronautica extends Arsenal {
    int Bombardeiro_FW_200 = 1;
    int Jato_MiG_29 = 2;
    int Caca_F22 = 3;
}

class Exercito extends Arsenal {
    int Blindado_Guarani = 1;
    int Tanque_Panzer_III = 2;
    int Tanque_T34 = 3;
}

class Marinha extends Arsenal {
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
