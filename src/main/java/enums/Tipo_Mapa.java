package enums;


public enum Tipo_Mapa {
    Atuais("Atual"), Historicos("Hitorico");
    
    private final String descrição;
    
    private Tipo_Mapa(String descricao){
        this.descrição = descricao;
    }
    
    public String getDescrição(){
        return descrição;
    }
}
