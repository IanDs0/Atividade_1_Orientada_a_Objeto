package enums;


public enum Tipo_Cartazes {
    Culturais("Cultural"), Diversos("Diverso");
    
    private final String descrição;
    
    private Tipo_Cartazes(String descricao){
        this.descrição = descricao;
    }
    
    public String getDescrição(){
        return descrição;
    }
}
