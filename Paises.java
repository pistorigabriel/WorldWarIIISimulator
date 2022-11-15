/*
ÁFRICA count= 20
AMÉRICA count= 21
ÁSIA count= 22
EUROPA count= 26
OCEANIA count= 3 
*/

public enum Paises {
    
    AFG("AFG", "Afeganistão", 3),
    ZAF("ZAF", "África do Sul", 1),
    DEU("DEU", "Alemanha", 4),
    AGO("AGO", "Angola", 1),
    SAU("SAU", "Arábia Saudita", 3),
    DZA("DZA", "Argélia", 1),
    ARG("ARG", "Argentina", 2),
    AUS("AUS", "Austrália", 5),
    AUT("AUT", "Áustria", 4),
    BHS("BHS", "Bahamas", 2),
    BLR("BLR", "Belarus", 4),
    BEL("BEL", "Bélgica", 4),
    BOL("BOL", "Bolívia", 2),
    BWA("BWA", "Botswana", 1),
    BRA("BRA", "Brasil", 2),
    BGR("BGR", "Bulgária", 4),
    CMR("CMR", "Camarões", 1),
    CAN("CAN", "Canadá", 2),
    KAZ("KAZ", "Cazaquistão", 3),
    TCD("TCD", "Chade", 1),
    CHL("CHL", "Chile", 2),
    CHN("CHN", "China", 3),
    COL("COL", "Colômbia", 2),
    COG("COG", "Congo", 1),
    PRK("PRK", "Coréia do Norte", 3),
    KOR("KOR", "Coréia do Sul", 3),
    CRI("CRI", "Costa Rica", 2),
    HRV("HRV", "Croácia", 4),
    CUB("CUB", "Cuba", 2),
    DNK("DNK", "Dinamarca", 4),
    EGY("EGY", "Egito", 1),
    SLV("SLV", "El Salvador", 2),
    ARE("ARE", "Emirados Árabes Unidos", 3),
    ECU("ECU", "Equador", 2),
    ESP("ESP", "Espanha", 4),
    USA("USA", "Estados Unidos", 2),
    FIN("FIN", "Finlândia", 4),
    FRA("FRA", "França", 4),
    GAB("GAB", "Gabão", 1),
    GHA("GHA", "Gana", 1),
    GRC("GRC", "Grécia", 4),
    NLD("NLD", "Holanda", 4),
    HND("HND", "Honduras", 2),
    HUN("HUN", "Hungria", 4),
    IND("IND", "índia", 3),
    IDN("IDN", "Indonésia", 3),
    IRN("IRN", "Irã", 1),
    IRQ("IRQ", "Iraque", 3),
    ISR("ISR", "Israel", 3),
    ITA("ITA", "Itália", 4),
    JAM("JAM", "Jamaica", 2),
    JPN("JPN", "Japão", 3),
    LBN("LBN", "Líbano", 3),
    LBY("LBY", "Líbia", 1),
    MDG("MDG", "Madagascar", 1),
    MYS("MYS", "Malásia", 3),
    MAR("MAR", "Marrocos", 1),
    MEX("MEX", "México", 2),
    MOZ("MOZ", "Moçambique", 1),
    MNG("MNG", "Mongólia", 3),
    NAM("NAM", "Namíbia", 1),
    NIC("NIC", "Nicarágua", 2),
    NGA("NGA", "Nigéria", 1),
    NOR("NOR", "Noruega", 4),
    NZL("NZL", "Nova Zelândia", 5),
    PAN("PAN", "Panamá", 2),
    PNG("PNG", "Papua-Nova Guiné", 5),
    PAK("PAK", "Paquistão", 3),
    PRY("PRY", "Paraguai", 2),
    PER("PER", "Peru", 2),
    POL("POL", "Polônia", 4),
    PRT("PRT", "Portugal", 4),
    QAT("QAT", "Qatar", 3),
    UNI("UNI", "Reino Unido", 4),
    CZE("CZE", "República Tcheca", 4),
    ROM("ROM", "Romênia", 4),
    RUS("RUS", "Rússia", 4),
    SEN("SEN", "Senegal", 1),
    SRB("SRB", "Sérvia", 4),
    SYR("SYR", "Síria", 3),
    SOM("SOM", "Somália", 1),
    SDN("SDN", "Sudão", 1),
    SWE("SWE", "Suécia", 4),
    CHE("CHE", "Suíça", 4),
    THA("THA", "Tailândia", 3),
    TWN("TWN", "Taiwan", 3),
    TUN("TUN", "Tunísia", 1),
    TKM("TKM", "Turcomenistão", 3),
    TUR("TUR", "Turquia", 4),
    UKR("UKR", "Ucrânia", 4),
    URY("URY", "Uruguai", 2),
    UZB("UZB", "Uzbequistão", 3),
    VEN("VEN", "Venezuela", 2),
    VNM("VNM", "Vietnã", 3);

    private String nome;
    private String sigla;
    private int continente;
    
    Paises(String nSigla, String nNome, int nContinente) {
        this.sigla = nSigla;
        this.nome = nNome;
        this.continente = nContinente;
    }

    public String getNome() {
        return nome;
    }
    public String getSigla() {
        return sigla;
    }
    public int getContinente(){
        return continente;
    }
}
