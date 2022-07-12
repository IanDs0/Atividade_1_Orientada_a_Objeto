package classe;

import interfasse.OperadoresLivro;

public class Livro implements OperadoresLivro{

    private String[] Autor;
    private int N_ediçao;
    private String Cidade;
    private String Editora;
    private int Ano;
    private int Pag;
    private float Cm;
    private String ISBN;
    private String CDU;
    private String[][] Assunto_x_Palavra_chave;
    private int Exemplares;

    public Livro() {
    }

    public Livro(String[] Autor, int N_ediçao, String Cidade, String Editora, int Ano, int Pag, float Cm, String ISBN, String CDU, String[][] Assunto_x_Palavra_chave, int Exemplares) {
        this.Autor = Autor;
        this.N_ediçao = N_ediçao;
        this.Cidade = Cidade;
        this.Editora = Editora;
        this.Ano = Ano;
        this.Pag = Pag;
        this.Cm = Cm;
        this.ISBN = ISBN;
        this.CDU = CDU;
        this.Assunto_x_Palavra_chave = Assunto_x_Palavra_chave;
        this.Exemplares = Exemplares;
    }

    public int getExemplares() {
        return Exemplares;
    }
    
    public int getAno() {
        return Ano;
    }

    public String[][] getAssunto_x_Palavra_chave() {
        return Assunto_x_Palavra_chave;
    }

    public String[] getAutor() {
        return Autor;
    }

    public String getCDU() {
        return CDU;
    }

    public String getCidade() {
        return Cidade;
    }

    public float getCm() {
        return Cm;
    }

    public String getEditora() {
        return Editora;
    }

    public String getISBN() {
        return ISBN;
    }

    public int getN_ediçao() {
        return N_ediçao;
    }

    public int getPag() {
        return Pag;
    }

    public void setAno(int Ano) {
        this.Ano = Ano;
    }

    public void setAssunto_x_Palavra_chave(String[][] Assunto_x_Palavra_chave) {
        this.Assunto_x_Palavra_chave = Assunto_x_Palavra_chave;
    }

    public void setAutor(String[] Autor) {
        this.Autor = Autor;
    }

    public void setCDU(String CDU) {
        this.CDU = CDU;
    }

    public void setCidade(String Cidade) {
        this.Cidade = Cidade;
    }

    public void setCm(float Cm) {
        this.Cm = Cm;
    }

    public void setEditora(String Editora) {
        this.Editora = Editora;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setN_ediçao(int N_ediçao) {
        this.N_ediçao = N_ediçao;
    }

    public void setPag(int Pag) {
        this.Pag = Pag;
    }

    public void setExemplares(int Exemplares) {
        this.Exemplares = Exemplares;
    }    
    
    @Override
    public String toString() {
        
        int j=0;
        
        String ret = "\n";
        
        for(int i=0; i < Autor.length; i++){
            
            ret += Autor[i] + ". ";
            
        }
        
        ret += "\n*** ";   
        ret += " - " + N_ediçao;
        ret += " - " + Cidade;
        ret += " : " + Editora;
        ret += ", " + Ano;
        ret += ".\n" + Pag + " pág. : " + Cm + " cm.";
        ret += "\n\nISBN: " + ISBN + "\n";
        
        for(int i=0; i < Assunto_x_Palavra_chave.length; i++){
             
            j=0;
            
            ret += "\n" + (i+1) + Assunto_x_Palavra_chave[i][j] + " ";
            
            for(j=0; j < Assunto_x_Palavra_chave[i].length; j++){
                
                for(int k=0; k < j; k++) ret += "I";
                
                ret += ". " + Assunto_x_Palavra_chave[i][j] + ". ";
                
            }
        }
        
        ret += "\n\t\tCDU: " + CDU;
        
        return ret;
    } 

    @Override
    public boolean emprestimo(boolean Emprestimo) {
        
        if(Exemplares>=1){
            this.Exemplares -=1;
            Emprestimo = true;
            return true;
        }else{
            return false;
        }    
    }

    @Override
    public boolean devolve() {

        this.Exemplares +=1;
        return true;
        
    }

    @Override
    public void imorimir_Livro() {

        System.out.println("\nA dados do livro são\n" + toString() +
            "\nNum de Exemplares:  " + Exemplares);

    }

    @Override
    public void imprime_ficha() {

        System.out.println("\nA ficha é:\n" + toString());
        
    }

}
