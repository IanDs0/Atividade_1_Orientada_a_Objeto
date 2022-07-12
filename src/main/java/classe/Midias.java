package classe;

import enums.Tipo_Midia;

public class Midias extends Livro{
    
    private String Titulo_Obra;
    private Tipo_Midia Midia_select;
    
    public Midias(){ 
    }
    
    public Midias(String Titulo_Obra, Tipo_Midia Midia_select){
        this.Titulo_Obra = Titulo_Obra;
        this.Midia_select = Midia_select;
    }

    public Midias(String Titulo_Obra, Tipo_Midia Midia_select, String[] Autor, int N_ediçao, String Cidade, String Editora, int Ano, int Pag, float Cm, String ISBN, String CDU, String[][] Assunto_x_Palavra_chave, int Exemplares) {
        super(Autor, N_ediçao, Cidade, Editora, Ano, Pag, Cm, ISBN, CDU, Assunto_x_Palavra_chave, Exemplares);
        this.Titulo_Obra = Titulo_Obra;
        this.Midia_select = Midia_select;
    }
    
    public String getTitulo_Obra() {
        return Titulo_Obra;
    }
    
    public Tipo_Midia getMidia_select(){
        return Midia_select;
    }
    
    public void setTitulo_Obra(String Titulo_Obra) {
        this.Titulo_Obra = Titulo_Obra;
    }
    
    public void setMidia_select(Tipo_Midia Midia_select){
        this.Midia_select =  Midia_select;
    }
    
    @Override
    public String toString() {
        String ret = super.toString();
        
        ret += "\nTitulo da Obra:  " + Titulo_Obra;
        ret += "\nTipo de Midia:  " + Midia_select;
        
        return ret;
    }
    
    @Override
    public void imorimir_Livro() {
        super.imorimir_Livro();
    }
}
