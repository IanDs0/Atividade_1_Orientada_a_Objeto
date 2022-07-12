package classe;

import enums.Tipo_Cartazes;

public class Cartazes extends Livro{
    
    private String Titulo_Obra;
    private Tipo_Cartazes Cartazes_tipo;
    
    public Cartazes(){
    }
    
    public Cartazes(String Titulo_Obra, Tipo_Cartazes Cartzaes_tipo){
        this.Titulo_Obra = Titulo_Obra;
        this.Cartazes_tipo = Cartzaes_tipo;
    }

    public Cartazes(String Titulo_Obra, Tipo_Cartazes Cartazes_tipo, String[] Autor, int N_ediçao, String Cidade, String Editora, int Ano, int Pag, float Cm, String ISBN, String CDU, String[][] Assunto_x_Palavra_chave, int Exemplares) {
        super(Autor, N_ediçao, Cidade, Editora, Ano, Pag, Cm, ISBN, CDU, Assunto_x_Palavra_chave, Exemplares);
        this.Titulo_Obra = Titulo_Obra;
        this.Cartazes_tipo = Cartazes_tipo;
    }
    
    public String getTitulo_Obra() {
        return Titulo_Obra;
    }
    
    public Tipo_Cartazes getCartazes_tipo(){
        return Cartazes_tipo;
    }
    
    public void setTitulo_Obra(String Titulo_Obra) {
        this.Titulo_Obra = Titulo_Obra;
    }
    
    public void setCartazes_tipo(Tipo_Cartazes Cartazes_tipo){
        this.Cartazes_tipo = Cartazes_tipo;
    }
    
    @Override
    public String toString() {
        String ret = super.toString();
        
        ret += "\nTitulo da Obra:  " + Titulo_Obra;
        ret += "\nTipo de Cartazes:  " + Cartazes_tipo;
        
        return ret;
    }
    
    @Override
    public void imorimir_Livro() {
        super.imorimir_Livro();
    }
}
