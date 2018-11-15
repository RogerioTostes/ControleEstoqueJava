/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author professor
 */
public class Usuario {
    private String matricula;
    private String nome;
    private String senha;

    public Usuario() {
        nome = "Admin";
        matricula = "ac2018";
        senha = "s1234";
    }
    
    public boolean validarSenha(String senha)
    {
        if(senha.length() == 5 && !senha.isEmpty())
            return true;
        else
            return false;
    }
    
    public boolean validarMatricula(String matricula)
    {
        if(matricula.length() == 6)
            return true;
        else
            return false;
    }
    
    public boolean efetuarLogin(String matricula, String senha)
    {
        if(this.matricula.equals(matricula) && this.senha.equals(senha))
            return true;
        else
            return false;
    }
    
}
