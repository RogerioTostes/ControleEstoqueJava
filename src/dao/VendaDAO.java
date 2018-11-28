/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import classes.Estoque;
import classes.Estoque;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rogério e Octavio
 */
public class VendaDAO {
    
    private List<Estoque> lista = null;

    public VendaDAO() {
        lista = new ArrayList<Estoque>();
    }
    
    public void inserirVenda(Estoque venda)
    {
        lista.add(venda);
    }
    
    public Estoque buscarVenda(int numero)
    {
        Estoque vd = null;
        for(Estoque venda: lista)
        {
            if(venda.getNumero()== numero)
                vd = venda;
        }
        
        return vd;
        
       
     
    }
    
    public void removerVenda(int numero)
    {
        Estoque venda = buscarVenda(numero);
        if(venda != null)
        {
            lista.remove(venda);
        }
    }
    
    public void alterarVenda(Estoque venda)
    {
        Estoque ven = buscarVenda(venda.getNumero());
        int num = lista.indexOf(ven);
        lista.set(num,venda);
//        if(venda != null)
//        {
//            int pos = lista.indexOf(venda);
//            lista.set(pos, venda);
//        }
    }
    
    public List<Estoque> todasVendas()
    {
        return lista;
    }
    
    public int Proximo(){
    
    return lista.size()+1;
}
            
}
