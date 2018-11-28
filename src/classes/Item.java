/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Rogério e Octavio
 */
public class Item {
    
    private Peça peca;
    private int quantidade;
    private float valorItem;

    public Item() {
    }

    public Item(Peça peca) {
        this.peca = peca;
    }
    
    public void calcularValorItem(){
    
        this.valorItem = quantidade * peca.getValor();
    }
    
    public String toString()
    {
        String str = "";
        str += "--------- Código da Peça "+ peca.getCodigo()+" ----------";
        str += "\nDescrição: "+ peca.getDescricao();
        str += "\nEditora: "+ peca.getFornecedor();
        str += "\nValor Unitário: "+ peca.getValor();
        str += "\nQuantidade = : "+ quantidade + " - Valor Item: R$" + valorItem;
        
        return str;
    }

    public Peça getPeca() {
        return peca;
    }

    public void setPeca(Peça peca) {
        this.peca = peca;
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
