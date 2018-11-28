/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import classes.Venda;
import classes.Venda;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rogério e Octavio
 */
public class VendaDAO {
    
    private List<Venda> lista = null;

    public VendaDAO() {
        lista = new ArrayList<Venda>();
    }
    
    public void inserirVenda(Venda venda)
    {
        lista.add(venda);
    }
    
    public Venda buscarVenda(int numero)
    {
        Venda vd = null;
        for(Venda venda: lista)
        {
            if(venda.getNumero()== numero)
                vd = venda;
        }
        
        return vd;
        
       
     
    }
    
    public void removerVenda(int numero)
    {
        Venda venda = buscarVenda(numero);
        if(venda != null)
        {
            lista.remove(venda);
        }
    }
    
    public void alterarVenda(Venda venda)
    {
        Venda ven = buscarVenda(venda.getNumero());
        int num = lista.indexOf(ven);
        lista.set(num,venda);
//        if(venda != null)
//        {
//            int pos = lista.indexOf(venda);
//            lista.set(pos, venda);
//        }
    }
    
    public List<Venda> todasVendas()
    {
        return lista;
    }
    
    public int Proximo(){
    
    return lista.size()+1;
}
            
}
