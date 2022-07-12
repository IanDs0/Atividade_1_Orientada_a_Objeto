package enums;

public enum Tipo_Relatorio {
    Cientificos("Cientifico"), Estagios("Estagio");
    
    private final String descrição;
    
    private Tipo_Relatorio(String descricao){
        this.descrição = descricao;
    }
    
    public String getDescrição(){
        return descrição;
    }
}
