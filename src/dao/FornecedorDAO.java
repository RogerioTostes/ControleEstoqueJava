/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import classes.Fornecedor;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Gerim
 */
public class FornecedorDAO {
    
    private List<Fornecedor> lista = null;

    public FornecedorDAO() {
        lista = new ArrayList<Fornecedor>();
    }
    
    public void adicionarFornecedor(Fornecedor fornecedor){
        
        lista.add(fornecedor);
    }
    
    public void removerFornecedor(String cpf){
        
        Fornecedor forn = this.buscarFornecedor(cpf);
        if(forn != null){
            lista.remove(forn);
        }
    }
    
    public void alterarFornecedor(Fornecedor fornecedor){
        
        Fornecedor forn = buscarFornecedor(fornecedor.getCpf());
        int ind = lista.indexOf(forn);
        lista.set(ind,fornecedor);
    }
    
    public Fornecedor buscarFornecedor(String cpf){
        
        Fornecedor forn = null;
        for (Fornecedor fornecedor : lista){
            if(fornecedor.getCpf().equals(cpf))
                forn = fornecedor;
        }
        return forn;
    }
    
    public List<Fornecedor> todosFornecedores(){
    
        return lista;
    }
}
