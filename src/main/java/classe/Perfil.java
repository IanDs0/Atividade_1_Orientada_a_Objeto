package classe;

import interfasse.OperadoresPerfil;
import java.util.ArrayList;

public class Perfil implements OperadoresPerfil{ //abstract class Perfil implements OperadoresPerfil {
    
    private String Nome;
    private ArrayList<Livro> Emprestimo;
    private boolean Tipo;
    private String Senha;

    public Perfil() {
    }

    public Perfil(String Nome, ArrayList<Livro> Emprestimo, boolean Tipo, String Senha) {
        this.Nome = Nome;
        this.Emprestimo = Emprestimo;
        this.Tipo = Tipo;
        this.Senha = Senha;
    }

    ////////////////////////////////
    public ArrayList<Livro> getEmprestimo() {
        return Emprestimo;
    }

    public String getSenha() {
        return Senha;
    }

    public String getNome() {
        return Nome;
    }

    public boolean getTipo() {
        return Tipo;
    }

    ////////////////////////////////
    public void setEmprestimo(ArrayList<Livro> Emprestimo) {
        this.Emprestimo = Emprestimo;
    }
    
    @Override
    public void addEmprestimo(Livro Emprestimo) {
        this.Emprestimo.add(Emprestimo);
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public void setTipo(boolean Tipo) {
        this.Tipo = Tipo;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }

    @Override
    public String toString() {
        String ret = "\nNome: " + Nome;
        if(Tipo == true){
            ret += "\nTipo de conta: ROOT";
        }else if(Tipo == false){
            ret += "\nTipo de conta: User";
        }
        
        ret += "\nFicha de cada Livro pego: ";
        
        int i=0;
        
        for(Livro livro: Emprestimo){
            i++;
            ret += "Livro [" + i +"]"; 
            ret += livro.toString();
        }
        
        return ret += "\n";
    }

    @Override
    public void imprime_perfil() {
        System.out.printf("\nteste\n");
        System.out.printf(toString());
        
    }
    
}
