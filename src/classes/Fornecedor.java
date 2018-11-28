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
public class Fornecedor {

    private String nome;
    private String cnpj;
    private String telefone;
    private String email;
    private Endereco endereco;
    private String insc;

    public Fornecedor(String nome, String cnpj, String telefone, String email, Endereco endereco, String insc) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
        this.insc = insc;
    }

    public Fornecedor() {
        endereco = new Endereco();
    }

    public String toString() {

        String str = "CNPJ:  " + cnpj;
        str += "\n Nome: " + nome;
        str += "\n Email: " + email;
        str += "\n Telefone: " + telefone;
        str += "\n Inscriçao Municipal: " + insc;
        str += "\n -------- Endereço --------";
        str += "\n Logradouro: " + endereco.getLogradouro();
        str += "\n Cidade: " + endereco.getCidade();
        str += "\n Estado: " + endereco.getEstado();
        str += "\n CEP: " + endereco.getCep();

        return str;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getInsc() {
        return insc;
    }

    public void setInsc(String insc) {
        this.insc = insc;
    }

}
