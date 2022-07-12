package classe;

import enums.Tipo_Relatorio;

public class Relatorios extends Livro {
    
    private String Titulo_Obra;
    private Tipo_Relatorio Relatorio_tipo;
    
    public Relatorios(){
    }
    
    public Relatorios(String Titulo_Obra, Tipo_Relatorio Relatorio_tipo){
        this.Titulo_Obra = Titulo_Obra;
        this.Relatorio_tipo = Relatorio_tipo;
    }

    public Relatorios(String Titulo_Obra, Tipo_Relatorio Relatorio_tipo, String[] Autor, int N_ediçao, String Cidade, String Editora, int Ano, int Pag, float Cm, String ISBN, String CDU, String[][] Assunto_x_Palavra_chave, int Exemplares) {
        super(Autor, N_ediçao, Cidade, Editora, Ano, Pag, Cm, ISBN, CDU, Assunto_x_Palavra_chave, Exemplares);
        this.Titulo_Obra = Titulo_Obra;
        this.Relatorio_tipo = Relatorio_tipo;
    }
   
    public String getTitulo_Obra() {
        return Titulo_Obra;
    }
    
    public Tipo_Relatorio getTipo_Relatorio(){
        return Relatorio_tipo;
    }
    
     public void setTitulo_Obra(String Titulo_Obra) {
        this.Titulo_Obra = Titulo_Obra;
    }
     
     public void setTipo_Relatorio(Tipo_Relatorio Relatorio_tipo){
         this.Relatorio_tipo = Relatorio_tipo;
     }
     
     @Override
    public String toString() {
        String ret = super.toString();
        
        ret += "\nTitulo da Obra:  " + Titulo_Obra;
        ret += "\nTipo de Relatorio:  " + Relatorio_tipo;
        
        return ret;
    }
    
    @Override
    public void imorimir_Livro() {
        super.imorimir_Livro();
    }
}
