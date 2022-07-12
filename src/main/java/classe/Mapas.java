package classe;

import enums.Tipo_Mapa;

public class Mapas extends Livro {
    
    private String Titulo_Obra;
    private Tipo_Mapa Mapa_op;
    
    public Mapas(){
    }
    
    public Mapas(String Titulo_Obra, Tipo_Mapa Mapa_op){
        this.Titulo_Obra = Titulo_Obra;
        this.Mapa_op = Mapa_op;
    }

    public Mapas(String Titulo_Obra, Tipo_Mapa Mapa_op, String[] Autor, int N_ediçao, String Cidade, String Editora, int Ano, int Pag, float Cm, String ISBN, String CDU, String[][] Assunto_x_Palavra_chave, int Exemplares) {
        super(Autor, N_ediçao, Cidade, Editora, Ano, Pag, Cm, ISBN, CDU, Assunto_x_Palavra_chave, Exemplares);
        this.Titulo_Obra = Titulo_Obra;
        this.Mapa_op = Mapa_op;
    }
    
    public String getTitulo_Obra(){
        return Titulo_Obra;
    }
    
    public Tipo_Mapa getMapa_op(){
        return Mapa_op;
    }
    
    public void setTitulo_Obra(String Titulo_Obra) {
        this.Titulo_Obra = Titulo_Obra;
    }
    
    public void setMapa_op(Tipo_Mapa Mapa_op){
        this.Mapa_op = Mapa_op;
    }
    
    @Override
    public String toString() {
        String ret = super.toString();
        
        ret += "\nTitulo da Obra:  " + Titulo_Obra;
        ret += "\nTipo de Mapas:  " + Mapa_op;
        
        return ret;
    }
    
    @Override
    public void imorimir_Livro() {
        super.imorimir_Livro();
    }
    
}
