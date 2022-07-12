package com.mycompany.atividade_1;

import classe.Livro;
import classe.Livro_periódico;
import classe.Trabalhos_Conclusao;
import classe.Relatorios;
import classe.Midias;
import classe.Cartazes;
import classe.Mapas;
import classe.Perfil;
import enums.Periódicos;
import enums.Tcc;
import enums.Tipo_Relatorio;
import enums.Tipo_Midia;
import enums.Tipo_Cartazes;
import enums.Tipo_Mapa;
import java.util.ArrayList;
import java.util.Scanner;

public class Atividade_1 {
    
    public static void cadastro_Livro(Livro livro){
        
        int a=0,b=3, j=0;
        
        Scanner ler = new Scanner(System.in);
        
        System.out.printf("Digite o ano de lançamento:  ");
        livro.setAno(ler.nextInt());
        
        System.out.printf("Digite o numero de Assuntos:  ");
        a=ler.nextInt();
        String[][] Assunto_x_Palavra_chave = new String[a][b];
        
        for(int i=0; i < a; i++){
            
            j=0;
            ler = new Scanner(System.in);

            System.out.printf("Digite o Assuntos:  ");
            Assunto_x_Palavra_chave[i][j] = ler.nextLine();
            
            for(j=0; j < b; j++){
                
                ler = new Scanner(System.in);
                
                System.out.printf("Digite a Palavra chave:  ");
                Assunto_x_Palavra_chave[i][j] = ler.nextLine();
                
            }
        }
        
        livro.setAssunto_x_Palavra_chave(Assunto_x_Palavra_chave);
        
        System.out.printf("Digite o numero de Autores:  ");
        a=ler.nextInt();
        String[] Autor = new String[a];
        
        for(int i=0; i < a; i++){
            
            ler = new Scanner(System.in);
            
            System.out.printf("Digite o nome do autor ["+(i+1)+"]:   ");
            Autor[i]=ler.nextLine();
            
        }
        livro.setAutor(Autor);//for
        
        System.out.printf("Digite o CDU:   ");
        livro.setCDU(ler.nextLine());
        
        System.out.printf("Digite a cidade:   ");
        livro.setCidade(ler.nextLine());
        
        System.out.printf("Digite o tamanho em cm:   ");
        livro.setCm(ler.nextFloat());
        
        ler = new Scanner(System.in);
        
        System.out.printf("Digite a Editora:   ");
        livro.setEditora(ler.nextLine());
        
        System.out.printf("Digite o ISBN:   ");
        livro.setISBN(ler.nextLine());
        
        System.out.printf("Digite o numero da edição:   ");
        livro.setN_ediçao(ler.nextInt());
        
        System.out.printf("DIgite o numero de páginas:   ");
        livro.setPag(ler.nextInt());
        
        System.out.printf("DIgite o numero de exemplares:   ");
        livro.setExemplares(ler.nextInt());
        
    }

    public static Livro cadastro_Periódicos(){
        
        Livro_periódico periódico = new Livro_periódico();
        Scanner ler = new Scanner(System.in);
        int op;
        cadastro_Livro(periódico);
        
        System.out.printf("\nDigite o Título da Obrta:  ");
        periódico.setTítulo_da_Obra(ler.nextLine());
        
        do{
            System.out.printf("\nDigite 1 para Jornais 2 para Recistas:  ");
            op=ler.nextInt();

            switch(op){

                case 1 ->{

                    periódico.setTipo(Periódicos.Jornais);

                }
                case 2 ->{

                    periódico.setTipo(Periódicos.Revistas);

                }

            }
        }while(op!=1 && op!=2);
        

        
        return periódico;
    }
    
    public static Livro Cadastro_Tcc(){
        Trabalhos_Conclusao Tccs = new Trabalhos_Conclusao();
        Scanner ler = new Scanner(System.in);
        int op;
        cadastro_Livro(Tccs);
        
        System.out.printf("\nDigite o Título da Obra:  ");
        Tccs.setTitulo_Obra(ler.nextLine());
        
        do{
            System.out.printf("\nDigite 1 para Monografias\n2 para Dissertacoes\n3 para Teses:  ");
            op=ler.nextInt();

            switch(op){

                case 1 ->{

                    Tccs.setTipo_Tcc(Tcc.Monografias);

                }
                case 2 ->{

                   Tccs.setTipo_Tcc(Tcc.Dissertacoes);

                }
                case 3 ->{
                    
                   Tccs.setTipo_Tcc(Tcc.Teses);
                    
                }

            }
        }while(op!=1&& op!=2 && op!=3);
        
        return Tccs;
    }
    
    public static Livro Cadastro_Relatorio(){
        Relatorios Relatorio = new Relatorios();
        Scanner ler = new Scanner(System.in);
        int op;
        cadastro_Livro(Relatorio);
        
        System.out.printf("\nDigite o Título da Obra:  ");
        Relatorio.setTitulo_Obra(ler.nextLine());
        
        do{
            System.out.printf("\nDigite 1 para Cientifico \n2 para Estagio:  ");
            op=ler.nextInt();

            switch(op){

                case 1 ->{

                    Relatorio.setTipo_Relatorio(Tipo_Relatorio.Cientificos);

                }
                case 2 ->{

                    Relatorio.setTipo_Relatorio(Tipo_Relatorio.Estagios);
                }

            }
        }while(op!=1 && op!=2);
        
        return Relatorio;
    }
    
    public static Livro Cadastro_Midia(){
        Midias Midia = new Midias();
        Scanner ler = new Scanner(System.in);
        int op;
        cadastro_Livro(Midia);
        
        System.out.printf("\nDigite o Título da Obra:  ");
        Midia.setTitulo_Obra(ler.nextLine());
        
        do{
            System.out.printf("\nDigite 1 para Fitas\n2 para VHs\n3 para CDs\n4 para DVDs:  ");
            op=ler.nextInt();

            switch(op){

                case 1 ->{

                    Midia.setMidia_select(Tipo_Midia.Fitas);

                }
                case 2 ->{

                   Midia.setMidia_select(Tipo_Midia.Vhss);

                }
                case 3 ->{
                    
                   Midia.setMidia_select(Tipo_Midia.Cds);
                    
                }
                case 4 ->{
                    
                    Midia.setMidia_select(Tipo_Midia.Dvds);
                    
                }

            }
        }while(op!=1 && op!=4);
        
        return Midia;
    }
    
    public static Livro Cadastro_Cartazes(){
        Cartazes Cartaz = new Cartazes();
        Scanner ler = new Scanner(System.in);
        int op;
        cadastro_Livro(Cartaz);
        
        System.out.printf("\nDigite o Título da Obra:  ");
        Cartaz.setTitulo_Obra(ler.nextLine());
        
        do{
            System.out.printf("\nDigite 1 para Cultural \n2 para Diversos:  ");
            op=ler.nextInt();

            switch(op){

                case 1 ->{

                    Cartaz.setCartazes_tipo(Tipo_Cartazes.Culturais);

                }
                case 2 ->{

                    Cartaz.setCartazes_tipo(Tipo_Cartazes.Diversos);
                }

            }
        }while(op!=1 && op!=2);
        
        return Cartaz;
    }
    
    public static Livro Cadastro_Mapas(){
        Mapas Mapa = new Mapas();
        Scanner ler = new Scanner(System.in);
        int op;
        cadastro_Livro(Mapa);
        
        System.out.printf("\nDigite o Título da Obra:  ");
        Mapa.setTitulo_Obra(ler.nextLine());
        
        do{
            System.out.printf("\nDigite 1 para Cultural \n2 para Diversos:  ");
            op=ler.nextInt();

            switch(op){

                case 1 ->{

                    Mapa.setMapa_op(Tipo_Mapa.Atuais);

                }
                case 2 ->{

                    Mapa.setMapa_op(Tipo_Mapa.Historicos);
                }

            }
        }while(op!=1 && op!=2);
        
        return Mapa;
    }
    
    public static Perfil cadastro_Perfil(){
        
        ArrayList<Livro> listaLivro;
        listaLivro = new ArrayList<>();
        Scanner ler = new Scanner(System.in);
        Perfil user = new Perfil();
        int op;
        
        user.setEmprestimo(listaLivro);
        
        System.out.println("Digite o nome do usuario:  ");
        user.setNome(ler.nextLine());
        
        ler = new Scanner(System.in);
        System.out.println("Digite a senha do usuario:  ");
        user.setSenha(ler.nextLine());
        
        do{
            ler = new Scanner(System.in);
            System.out.println("Digite 1 para usuario root ou 0 para normal:  ");
            op = ler.nextInt();

            switch (op) {
                case 1 -> {
                    user.setTipo(true);//root
                }
                case 0 -> {
                    user.setTipo(false);//user
                }
            }
        }while(op!= 1 && op!=0);
        return user;
    }
    
    public static int procura_livro(ArrayList<Livro> listaLivro){
        
        Scanner ler = new Scanner(System.in);
        String CDU_procura;
        int i=0;
        
        System.out.println("Digite o CDU procurado: ");
        CDU_procura = ler.nextLine();
        
        for(Livro livro: listaLivro){
            if(CDU_procura.equals(livro.getCDU())){
                return i;
            }
            i++;
        }
        return -1;
    }

    public static void Cadastro_Acervo(ArrayList<Livro> Livro){
        
        
        System.out.printf("\nDigite \n1 para Periódicos \n2 para Tcc \n3 para "
                + "Relatorio \n4 para Midia \n5 para Cartazes \n6 para Mapas:\n");
        Scanner ler = new Scanner(System.in);
        int op=ler.nextInt();
        
        switch(op){

            case 1->{//cadastrar livros
                Livro.add(cadastro_Periódicos());
            }
            case 2->{
                Livro.add(Cadastro_Tcc());
            }
            case 3->{
                Livro.add(Cadastro_Relatorio());
            }
            case 4->{
                Livro.add(Cadastro_Midia());
            }
            case 5->{
                Livro.add(Cadastro_Cartazes());
            }
            case 6->{
                Livro.add(Cadastro_Mapas());
            }
        }
    }
    
    public static int Login (ArrayList<Perfil> listaUsuarios){
        
        Scanner ler = new Scanner(System.in);
        int i=0;
        String Nome, Senha;
        
        System.out.println("\nDigite o Usuario:");
        Nome = ler.nextLine();
        
        System.out.println("\nDigite a Senha:");
        Senha = ler.nextLine();
        
        for(Perfil perfil: listaUsuarios){
            if(perfil.getSenha().equals(Senha) && perfil.getNome().equals(Nome)){
                return i;
            }
            i++;
        }
        return -1;
        
    }
    
    public static void main(String[] args) {
        
        System.out.println("Hello World!");
        
        Scanner ler = new Scanner(System.in);
        int op,user=-1;
        
        ArrayList<Livro> listaLivro;
        listaLivro = new ArrayList<>();
        
        ArrayList<Perfil> listaUsuarios;
        listaUsuarios = new ArrayList<>();
        
        System.out.println("\nDigite os Usuarios");
        listaUsuarios.add(cadastro_Perfil());
        
        System.out.println("\n\n\n");
        
        for(Perfil perfil: listaUsuarios){
            perfil.imprime_perfil();
        }
        
        System.out.println("\n\n\n");
        
        while (user==-1){
            
            user = Login(listaUsuarios);

            if(user >= 0){

                do{

                    ler = new Scanner(System.in);
                    System.out.printf("\nDigite \n1 para Cadasta User \n2 para "
                            + "cadastrar livros\n3 para procura livro\n4 para empresta"
                            + " livro\n5 para exibir livros do acervo\n6 para exibir "
                            + "ficha do acervo\n7 para exibe todos os usuariosn\n"
                            + "0 para sair:  ");
                    op=ler.nextInt();

                    switch(op){

                        case 0 ->{
                            System.out.println("\n\nSaindo");
                            break;
                        }

                        case 1 ->{//Cadasta User
                            System.out.println("\n\n\nDigite os Usuarios");
                            listaUsuarios.add(cadastro_Perfil());
                        }
                        case 2->{//cadastrar livros
                            Cadastro_Acervo(listaLivro);
                            for(Livro livro: listaLivro){
                                livro.imprime_ficha();
                            }
                        }
                        case 3->{//procura livro

                            System.out.println("\n\n\nProcurar Livro pelo CDU:");


                            int i = procura_livro(listaLivro);

                            listaLivro.get(i).imorimir_Livro();
                        }
                        case 4->{//empresta livro

                            System.out.println("\n\n\nEmprestar Livro pelo CDU:");

                            int i = procura_livro(listaLivro);

                            listaLivro.get(i).imorimir_Livro();

                            listaUsuarios.get(user).addEmprestimo(listaLivro.get(i));
                            listaLivro.get(i).emprestimo(true);
                        }
                        case 5->{//exibir livros do acervo

                            System.out.println("\n\n\n Todos os livros");

                            for(Livro livro: listaLivro){
                                livro.imorimir_Livro();
                            }
                        }
                        case 6->{//exibir ficha do acervo

                            System.out.println("\n\n\n Todas as Fichas");

                            for(Livro livro: listaLivro){
                                livro.imprime_ficha();
                            }
                        }
                        case 7->{//exibe todos os usuarios

                            System.out.println("\n\n\n Todos os usuarios");

                            for(Perfil perfil: listaUsuarios){
                                perfil.imprime_perfil();
                            }
                        }
                    }
                }while(op!=0);
            }else{
                System.out.println("\n\n\n Usuário errado");
            }
        }
    }
}
