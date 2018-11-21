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
public class Cliente {
    
    private String nome;
    private String cpf;
    private String estadoCivil;
    private String telefone;
    private String email;
    private Endereco endereco;

    public Cliente(String nome, String cpf, String estadoCivil, String telefone, String email, Endereco endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.estadoCivil = estadoCivil;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
    }

    public Cliente() {
        endereco = new Endereco();
    }
    
    public String toString(){
    
        String str = "CPF:  " + cpf;
        str += "\n Nome: " + nome;
        str += "\n Email: " + email;
        str += "\n Telefone: " + telefone;
        str += "\n Estado Civil: " + estadoCivil;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
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
    
}
