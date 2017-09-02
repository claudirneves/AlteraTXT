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
import java.util.List;
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
        File caminho = new File("C:\\Users\\aluno.ESTACIOACAD\\Downloads");
        File arquivo = new File(caminho, "ctb1215.txt");
        String linha, registro;

        Registro10 registro10 = new Registro10();
        Registro11 registro11 = new Registro11();

        List<Registro10> listaDeRegistro10 = new ArrayList();
        List<Registro11> listaDeRegistro11 = new ArrayList();

        //Leitura do arquivo e transformação para Objeto
        try {
            FileReader lerArquivo = new FileReader(arquivo);
            BufferedReader lendoArquivo = new BufferedReader(lerArquivo);

            while ((linha = lendoArquivo.readLine()) != null) {
                registro = linha.substring(0, 2);
                linha = linha.replace(",", ".");
                if (registro.equals("10")) {
                    registro10 = leRegistro10(linha);
                    listaDeRegistro10.add(registro10);
                } else if (registro.equals("11")) {
                    registro11 = leRegistro11(linha);
                    listaDeRegistro11.add(registro11);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Lógica
        for (Registro11 umRegistro : listaDeRegistro11) {
            System.out.println("Antes UM- " + umRegistro.toString());
            for (Registro11 todosRegistro : listaDeRegistro11) {
                
                if (!todosRegistro.equals(umRegistro)) {
                    String informacoesBancariasUm = umRegistro.getInformacoesBancarias();
                    
                    String informacoesBancariasTodos = todosRegistro.getInformacoesBancarias();
                    if (informacoesBancariasUm.equals(informacoesBancariasTodos)) {
                        System.out.println("Antes - " + todosRegistro.toString());
                        float saldoInicialUm = Float.parseFloat(umRegistro.getSaldoInicioMes());
                        float saldoInicialTodos = Float.parseFloat(todosRegistro.getSaldoInicioMes());
                        Float saldoInicialFinal = saldoInicialUm + saldoInicialTodos;
                        umRegistro.setSaldoInicioMes(saldoInicialFinal.toString());
                        todosRegistro.setSaldoInicioMes("0000000000-00");
                        System.out.println("ValorFinal- " + umRegistro.getSaldoInicioMes() +"em Float: " +saldoInicialFinal);
                        System.out.println("Depois - " + todosRegistro.toString());
                    }
                }
            }
            System.out.println("Depois UM- " + umRegistro.toString());
            break;
        }
    }

    public static Registro10 leRegistro10(String linha) {
        Registro10 registro = new Registro10();
        registro.setTipoDoRegistro(linha.substring(0, 2));
        registro.setOrgao(linha.substring(2, 4));
        registro.setUnidade(linha.substring(4, 6));
        registro.setInformacoesBancarias(linha.substring(6, 28));
        registro.setSaldoInicioMes(linha.substring(28, 41));
        registro.setValorEntradaMes(linha.substring(41, 54));
        registro.setValorSaidaMes(linha.substring(54, 67));
        registro.setSaldoFinalMes(linha.substring(67, 80));
        registro.setEspacoEmBranco(linha.substring(80, 90));
        registro.setNumeroSequencialDoRegistro(linha.substring(90, 96));
        return registro;
    }

    public static Registro11 leRegistro11(String linha) {
        Registro11 registro = new Registro11();
        registro.setTipoDoRegistro(linha.substring(0, 2));
        registro.setOrgao(linha.substring(2, 4));
        registro.setUnidade(linha.substring(4, 6));
        registro.setInformacoesBancarias(linha.substring(6, 28));
        registro.setFonteDeRecurso(linha.substring(28, 34));
        registro.setSaldoInicioMes(linha.substring(34, 47));
        registro.setValorEntradaMes(linha.substring(47, 60));
        registro.setValorSaidaMes(linha.substring(60, 73));
        registro.setSaldoFinalMes(linha.substring(73, 90));   
        registro.setNumeroSequencialDoRegistro(linha.substring(90, 96));

        return registro;
    }
    /*entrada = linha.substring(48, 60);
                    conta = linha.substring(6, 34);
                    entrada = entrada.replace(",", ".");
                    double testeEntrada = Double.parseDouble(entrada);
                    String vlrAnt = reg11.get(conta);
                    if (vlrAnt != null) {

                        vlrAnt = vlrAnt.replace(",", ".");
                        valorAnterior = Double.parseDouble(vlrAnt);
                        totalEntrada = testeEntrada;

                    }
                    //  reg11.put(conta, String.valueOf(totalEntrada));
                    reg11.put(conta, entrada);*/
 /*    
            for (Map.Entry<String, String> entry : reg11.entrySet()) {
                System.out.println(entry.getKey().toString() + " - " + reg11.get(entry.getKey()).toString());
                //  System.out.println(entry.getKey()+ " - "+entry.getValue());
                // System.out.println(conta+" "+totalEntrada);
            }*/
}
