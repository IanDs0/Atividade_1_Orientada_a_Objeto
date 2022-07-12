package enums;

public enum Tcc {
    
    Monografias("Monografia"), Dissertacoes("Disertacao"), Teses("Tese");
    
    private final String descrição;
    
    private Tcc(String descricao){
        this.descrição = descricao;
    }
    
    public String getDescrição(){
        return descrição;
    }
    
}
