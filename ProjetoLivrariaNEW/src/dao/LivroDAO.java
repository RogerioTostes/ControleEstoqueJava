/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import classes.Livro;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tiago Oliveira
 */
public class LivroDAO {
    
    private List<Livro> lista = null;

    public LivroDAO() {
        lista = new ArrayList<Livro>();
    }
    
    public void adicionarLivro (Livro livro){
        
        lista.add(livro);
    }
    
    public void removerLivro (String codigo){
        
        Livro livro = this.buscarLivro(codigo);
        
        if(livro != null){
            lista.remove(livro);
        }
    }
    
    public void alterarLivro (Livro livro){
        
        Livro liv = this.buscarLivro(livro.getCodigo());
        
        int idx = lista.indexOf(liv);
        lista.set(idx, livro);
    }
    
    public Livro buscarLivro (String codigo){
        
        Livro livro = null;
        
        for(Livro liv: lista){
            if(liv.getCodigo().equals(codigo))
            livro = liv;
        }
        return livro;
    }
    
    public List<Livro> todosLivros(){
    
        return lista;
    }
}
