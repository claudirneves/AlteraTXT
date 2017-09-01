/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alteraCTB;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Claudir
 */
public class AlteraCTB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File caminho = new File("C:\\Users\\Suporte 01\\Documents\\Sicom Santa Rita");
        File arquivo = new File(caminho, "ctb1215.txt");
        String orgaoUnidade = "";
        String registro = "";
        String linha = "";
        String conta = "";
        String recurso = "";
        String entrada = "";
        double totalEntrada = 0;
        double valorAnterior = 0;
        String entrada10 = "";
        double saldoEntrada = 0;
        ArrayList<Conta> contas;
        Map<String, String> reg11 = new TreeMap<String, String>();
        ArrayList<String> recursos;

        try {
            FileReader lerArquivo = new FileReader(arquivo);
            BufferedReader lendoArquivo = new BufferedReader(lerArquivo);

            while ((linha = lendoArquivo.readLine()) != null) {
                orgaoUnidade = linha.substring(2, 6);
                registro = linha.substring(0, 2);

                if (registro.equals("11")) {
                    entrada = linha.substring(48, 60);
                    conta = linha.substring(6, 34);
                     entrada = entrada.replace(",", ".");
                    double testeEntrada = Double.parseDouble(entrada);
                    String vlrAnt = reg11.get(conta);
                    if (vlrAnt != null) {
                       
                        vlrAnt = vlrAnt.replace(",", ".");
                        valorAnterior = Double.parseDouble(vlrAnt);
                        totalEntrada = testeEntrada;
                        

                    }
                    reg11.put(conta, String.valueOf(totalEntrada));
                    //reg11.put(conta,entrada);

                }
            }
            for (Map.Entry<String, String> entry : reg11.entrySet()) {
                System.out.println(entry.getKey().toString() + " - " + reg11.get(entry.getKey()).toString());
                //  System.out.println(entry.getKey()+ " - "+entry.getValue());
                // System.out.println(conta+" "+totalEntrada);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
