/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Gerim
 */
public class Item {
    
    private Peça livro;
    private int quantidade;
    private float valorItem;

    public Item() {
    }

    public Item(Peça livro) {
        this.livro = livro;
    }
    
    public void calcularValorItem(){
    
        this.valorItem = quantidade * livro.getValor();
    }
    
    public String toString()
    {
        String str = "";
        str += "--------- Livro de codigo "+ livro.getCodigo()+" ----------";
        str += "\nTitulo: "+ livro.getTitulo();
        str += "\nEditora: "+ livro.getEditora();
        str += "\nValor Unitário: "+ livro.getValor();
        str += "\nQuantidade = : "+ quantidade + " - Valor Item: R$" + valorItem;
        
        return str;
    }

    public Peça getLivro() {
        return livro;
    }

    public void setLivro(Peça livro) {
        this.livro = livro;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public float getValorItem() {
        return valorItem;
    }

    public void setValorItem(float valorItem) {
        this.valorItem = valorItem;
    }
    
    
}
