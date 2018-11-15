/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Tiago Oliveira
 */
public class Livro {
    
    private String codigo;
    private String titulo;
    private String editora;
    private int estoque;
    private float valor;
    private String dataPublicacao;

    public Livro() {
    }

    public Livro(String codigo, String titulo, String editora, int estoque, float valor, String dataPublicacao) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.editora = editora;
        this.estoque = estoque;
        this.valor = valor;
        this.dataPublicacao = dataPublicacao;
    }

    public String toString(){
    
        String str = "Código: " + codigo;
        str += "\n Título: " + titulo;
        str += "\n Editora: " + editora;
        str += "\n Estoque: " + Integer.toString(estoque);
        str += "\n Valor: " + Float.toString(valor);
        str += "\n Data de Publicação: " + dataPublicacao;
        
        return str;
    }
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(String dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }
    
}
