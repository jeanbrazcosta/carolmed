package br.com.carolmed.grupoestudo;

public class Livro {

    private String Nome, Autor;
    private double Preço;    
       
    public void Imprimir(){
        
        System.out.println("Detalhes dos livros" +getAutor());
        System.out.println("Detalhes dos livros" +getNome());
        
     
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public double getPreço() {
        return Preço;
    }

    public void setPreço(double preço) {
        Preço = preço;
    }
    
}


    
    
