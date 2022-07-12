package classe;

import enums.Tcc;

public class Trabalhos_Conclusao extends Livro{
    
    private String Titulo_Obra;
    private Tcc Tipo_Tcc;
    
    public Trabalhos_Conclusao(){
    }
    
    public Trabalhos_Conclusao(String Titulo_Obra, Tcc Tipo_Tcc){
        this.Titulo_Obra = Titulo_Obra;
        this.Tipo_Tcc = Tipo_Tcc;
    }

    public Trabalhos_Conclusao(String Titulo_Obra, Tcc Tipo_Tcc, String[] Autor, int N_ediçao, String Cidade, String Editora, int Ano, int Pag, float Cm, String ISBN, String CDU, String[][] Assunto_x_Palavra_chave, int Exemplares) {
        super(Autor, N_ediçao, Cidade, Editora, Ano, Pag, Cm, ISBN, CDU, Assunto_x_Palavra_chave, Exemplares);
        this.Titulo_Obra = Titulo_Obra;
        this.Tipo_Tcc = Tipo_Tcc;
    }
    
    public String getTitulo_Obra() {
        return Titulo_Obra;
    }
    
    public Tcc getTipo_Tcc() {
        return Tipo_Tcc;
    }
    
    public void setTitulo_Obra(String Titulo_Obra) {
        this.Titulo_Obra = Titulo_Obra;
    }

    public void setTipo_Tcc(Tcc Tipo_Tcc) {
        this.Tipo_Tcc = Tipo_Tcc;
    }
    
    @Override
    public String toString() {
        String ret = super.toString();
        
        ret += "\nTitulo da Obra:  " + Titulo_Obra;
        ret += "\nTipo de TCC:  " + Tipo_Tcc;
        
        return ret;
    }
    
    @Override
    public void imorimir_Livro() {
        super.imorimir_Livro();
    }
    
}
