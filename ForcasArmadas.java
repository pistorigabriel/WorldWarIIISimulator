abstract class Aeronautica{
    private String nomeVeiculo;
    private double custo;
    private int poder;
    void AtaqueAereo(Paises p){
        if (resultado==1)
            adicionaPais(Paises p);
    }
    String getInfo(){

    }
}
final class Bombardeiros extends Aeronautica{
    Bombardeiros(){
        
    }
}
final class Cargueiros extends Aeronautica{
    Cargueiros(){

    }
}
final class Jatos extends Aeronautica{
    Jatos(){

    }
}

abstract class Exercito {
    private String nomeVeiculo;
    private double custo;
    private int poder;
    void AtaqueTerrestre(){
        
    }
    String getInfo(){

    }
}
final class Blindados extends Exercito{
    Blindados(){

    }
}
final class Caminhoes extends Exercito{
    Caminhoes(){

    }
}
final class Tanques extends Exercito{
    Tanques(){

    }
}
abstract class Marinha{
    private String nomeVeiculo;
    private double custo;
    private int poder;
    void AtaqueMaritimo() {
        
    }
    String getInfo(){

    }
}
final class Navios extends Marinha{
    Navios(){

    }
}
final class PortaAvioes extends Marinha{
    PortaAvioes(){

    }
}
final class Submarinos extends Marinha{
    Submarinos(){

    }
}   
