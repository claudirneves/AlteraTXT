/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alteraCTB;



/**
 *
 * @author Suporte 01
 */
public class Conta {
    public String conta;
    public String entrada;
    
    
   
    
    public Conta(String conta, String entrada){
         this.conta = conta;
         this.entrada = entrada;
    }
    
    @Override
    public String toString(){
         return conta + " "+ entrada;
    }
}
