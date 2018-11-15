/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author alunoces
 */
public class Venda {
    
    private  int numero=0;
    private Cliente cliente;
    private List<Item> lista;
    private float valorTotal;
    private Date data;
     private int cod;
    public Venda() {
    
        lista = new ArrayList<Item>();
      //  numero++;
        data = new Date();
        cod = numero;
    }
    
    public void adicionarItem(Item item)
    {
        lista.add(item);
    }
    
    public Item buscarItem(int codigo)
    {
        Item it = null;
        for(Item i: lista)
        {
            if(codigo == Integer.parseInt(i.getLivro().getCodigo()))
            {
                it = i;
            }
        }
        return it;
    } 
    
    public void removeItem(int codigo)
    {
        Item i = buscarItem(codigo);
        if(i != null)
        {
            lista.remove(i);
        }
    }
    
    public void calcularTotal()
    {
        float soma = 0;
        for(Item i: lista)
        {
            soma += i.getValorItem();
        }
        this.valorTotal = soma;
    }

    @Override
    public String toString()
    {
        String str = "";
               str += "--------- Dados da Venda Nº "+ numero + " ---------";
        str += "\nData Venda: "+ getData();
        str += "\nCPF do Cliente: "+ cliente.getCpf();
        str += "\nNome do Cliente: "+ cliente.getNome();
        for(Item i: lista)
        {
            str += i.toString();
        }
        str += "\nValor Total = R$ "+ valorTotal;
        
        return str;
    }

    public  int getNumero() {
        return numero;
    }

    public  void setNumero(int numero) {
        this.numero = numero;
    }
       
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

     public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }
    public String getData() {
        
        SimpleDateFormat fm = new SimpleDateFormat("dd/MM/yyyy");
        
        return fm.format(data);
        
    }
    
    

//    public void setData(Date data) {
//        this.data = data;
//    }

   
    
}
