package enums;

public enum Periódicos {
 
    Revistas("Revista"), Jornais("Jornal");
    
    private final String descrição;
    
    private Periódicos(String descricao){
        this.descrição = descricao;
    }
    
    public String getDescrição(){
        return descrição;
    }
    
}
