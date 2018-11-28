/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import classes.Peça;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rogério e Octavio
 */
public class PeçaDAO {
    
    private List<Peça> lista = null;

    public PeçaDAO() {
        lista = new ArrayList<Peça>();
    }
    
    public void adicionarPeça (Peça peça){
        
        lista.add(peça);
    }
    
    public void removerPeça (String codigo){
        
        Peça livro = this.buscarPeça(codigo);
        
        if(livro != null){
            lista.remove(livro);
        }
    }
    
    public void alterarPeça (Peça peça){
        
        Peça liv = this.buscarPeça(peça.getCodigo());
        
        int idx = lista.indexOf(liv);
        lista.set(idx, peça);
    }
    
    public Peça buscarPeça (String codigo){
        
        Peça peça = null;
        
        for(Peça liv: lista){
            if(liv.getCodigo().equals(codigo))
            peça = liv;
        }
        return peça;
    }
    

    public List<Peça> todosPeça(){
    
        return lista;
    }
}
