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
public class Peça {
    
    private String codigo;
    private String descricao;
    private String fornecedor;
    private int estoque;
    private float valor;
    private String dataCadastro;

    public Peça() {
    }

    public Peça(String codigo, String descricao, String fornecedor, int estoque, float valor, String dataCadastro) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.fornecedor = fornecedor;
        this.estoque = estoque;
        this.valor = valor;
        this.dataCadastro = dataCadastro;
    }

    public String toString(){
    
        String str = "Código: " + codigo;
        str += "\n Descricao: " + descricao;
        str += "\n Fornecedor: " + fornecedor;
        str += "\n Quantidade em estoque: " + Integer.toString(estoque);
        str += "\n Valor: " + Float.toString(valor);
        str += "\n Cadastrado em: " + dataCadastro;
        
        return str;
    }
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
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

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
    
}
