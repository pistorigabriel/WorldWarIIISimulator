//FORÇAS ARMADAS--------------------------------------------------------------------------------------------
public abstract class ForcasArmadas{
    private String nomeVeiculo;
    private double custo;
    private int poder;
    public String getNomeV(){
        return nomeVeiculo;
    }
    public double getCusto(){
        return custo;
    }
    public int getPoder(){
        return poder;
    }
    public abstract void imprimeInfo();
    ForcasArmadas(String nome, double cost, int power){
        this.nomeVeiculo = nome;
        this.custo = cost;
        this.poder = power;
    }
}
//---------------------------------------------------------------------------------------------------------

//AERONÁUTICA----------------------------------------------------------------------------------------------
abstract class Aeronautica extends ForcasArmadas{
    //public abstract void AtaqueAereo();
    public Aeronautica(String nome, double cost, int power){
        super(nome,cost,power);
    }
}
final class Bombardeiros extends Aeronautica{
    private int boostPoder;
    public int getBoostP(){
        return boostPoder;
    }
    public void imprimeInfo(){
        System.out.println("Nome: " + getNomeV() + " / Custo: $" + getCusto() + " / Poder: " + getPoder() + " / Boost: +" + getBoostP() + "% de Poder");
    }
    Bombardeiros(String nome, double cost, int power, int boost){
        super(nome,cost,power);
        this.boostPoder = boost;
    }
}
final class Cargueiros extends Aeronautica{
    private int Capacidade;
    public int getCapacidade(){
        return Capacidade;
    }
    public void imprimeInfo(){
        System.out.println("Nome: " + getNomeV() + " / Custo: $" + getCusto() + " / Poder: " + getPoder() + " / Capacidade: " + getCapacidade());
    }
    Cargueiros(String nome, double cost, int power, int capacity){
        super(nome,cost,power);
        this.Capacidade = capacity;
    }
}
final class Jatos extends Aeronautica{
    private int boostChances;
    public int getBoostC(){
        return boostChances;
    }
    public void imprimeInfo(){
        System.out.println("Nome: " + getNomeV() + " / Custo: $" + getCusto() + " / Poder: " + getPoder() + " / AumentoDeChance: +" + getBoostC() + "% de chances de êxito");
    }
    Jatos(String nome, double cost, int power, int chance){
        super(nome,cost,power);
        this.boostChances = chance;
    }
}
//---------------------------------------------------------------------------------------------------------

//EXÉRCITO-------------------------------------------------------------------------------------------------
abstract class Exercito extends ForcasArmadas {
    //public abstract void AtaqueTerrestre();
    public Exercito(String nome, double cost, int power){
        super(nome,cost,power);
    }
}
final class Blindados extends Exercito{
    private int boostPoder;
    public int getBoostP(){
        return boostPoder;
    }
    public void imprimeInfo(){
        System.out.println("Nome: " + getNomeV() + " / Custo: $" + getCusto() + " / Poder: " + getPoder() + " / Boost: +" + getBoostP() + "% de Poder");
    }
    Blindados(String nome, double cost, int power, int boost){
        super(nome,cost,power);
        this.boostPoder = boost;
    }
}
final class Caminhoes extends Exercito{
    private int Capacidade;
    public int getCapacidade(){
        return Capacidade;
    }
    public void imprimeInfo(){
        System.out.println("Nome: " + getNomeV() + " / Custo: $" + getCusto() + " / Poder: " + getPoder() + " / Capacidade: " + getCapacidade());
    }
    Caminhoes(String nome, double cost, int power, int capacity){
        super(nome,cost,power);
        this.Capacidade = capacity;
    }
}
final class Tanques extends Exercito{
    private int boostChances;
    public int getBoostC(){
        return boostChances;
    }
    public void imprimeInfo(){
        System.out.println("Nome: " + getNomeV() + " / Custo: $" + getCusto() + " / Poder: " + getPoder() + " / AumentoDeChance: +" + getBoostC() + "% de chances de êxito");
    }
    Tanques(String nome, double cost, int power, int chance){
        super(nome,cost,power);
        this.boostChances = chance;
    }
}
//---------------------------------------------------------------------------------------------------------

//MARINHA--------------------------------------------------------------------------------------------------
abstract class Marinha extends ForcasArmadas{
    //public abstract void AtaqueMaritimo();
    public Marinha(String nome, double cost, int power){
        super(nome,cost,power);
    }
}
final class Navios extends Marinha{
    private int boostPoder;
    public int getBoostP(){
        return boostPoder;
    }
    public void imprimeInfo(){
        System.out.println("Nome: " + getNomeV() + " / Custo: $" + getCusto() + " / Poder: " + getPoder() + " / Boost: +" + getBoostP() + "% de Poder");
    }
    Navios(String nome, double cost, int power, int boost){
        super(nome,cost,power);
        this.boostPoder = boost;
    }
}
final class PortaAvioes extends Marinha{
    private int Capacidade;
    public int getCapacidade(){
        return Capacidade;
    }
    public void imprimeInfo(){
        System.out.println("Nome: " + getNomeV() + " / Custo: $" + getCusto() + " / Poder: " + getPoder() + " / Capacidade: " + getCapacidade());
    }
    PortaAvioes(String nome, double cost, int power, int capacity){
        super(nome,cost,power);
        this.Capacidade = capacity;
    }
}
final class Submarinos extends Marinha{
    private int boostChances;
    public int getBoostC(){
        return boostChances;
    }
    public void imprimeInfo(){
        System.out.println("Nome: " + getNomeV() + " / Custo: $" + getCusto() + " / Poder: " + getPoder() + " / AumentoDeChance: +" + getBoostC() + "% de chances de êxito");
    }
    Submarinos(String nome, double cost, int power, int chance){
        super(nome,cost,power);
        this.boostChances = chance;
    }
}
//---------------------------------------------------------------------------------------------------------   
