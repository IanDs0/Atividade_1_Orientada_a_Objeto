package classe;

import enums.Periódicos;


public class Livro_periódico extends Livro {

    private String Título_da_Obra;
    private Periódicos tipo; 

    public Livro_periódico() {
    }

    public Livro_periódico(String Título_da_Obra, Periódicos tipo) {
        this.Título_da_Obra = Título_da_Obra;
        this.tipo = tipo;
    }

    public Livro_periódico(String Título_da_Obra, Periódicos tipo, String[] Autor, int N_ediçao, String Cidade, String Editora, int Ano, int Pag, float Cm, String ISBN, String CDU, String[][] Assunto_x_Palavra_chave, int Exemplares) {
        super(Autor, N_ediçao, Cidade, Editora, Ano, Pag, Cm, ISBN, CDU, Assunto_x_Palavra_chave, Exemplares);
        this.Título_da_Obra = Título_da_Obra;
        this.tipo = tipo;
    }

    public String getTítulo_da_Obra() {
        return Título_da_Obra;
    }

    public Periódicos getTipo() {
        return tipo;
    }

    public void setTítulo_da_Obra(String Título_da_Obra) {
        this.Título_da_Obra = Título_da_Obra;
    }

    public void setTipo(Periódicos tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        String ret = super.toString();
        
        ret += "\nTitulo da Obra:  " + Título_da_Obra;
        ret += "\nTipo de obra:  " + tipo;
        
        
        return ret;
    }

    @Override
    public void imorimir_Livro() {
        super.imorimir_Livro();
    }
    
}
