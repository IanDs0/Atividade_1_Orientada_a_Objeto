package enums;

public enum Tipo_Midia {
    Fitas("Fita"), Vhss("Vhs"), Cds("Cd"), Dvds("Dvd");
    
    private final String descrição;
    
    private Tipo_Midia(String descricao){
        this.descrição = descricao;
    }
    
    public String getDescrição(){
        return descrição;
    }
}
