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

    private String tipoDoRegistro; //10 ou 11 - 2 caracteres
    private String orgao; // 2 caracateres
    private String unidade; // 2 caracteres
    private String informacoesBancarias; // tem o banco, agencia, numeroDaConta, Digito, tipo - 22 caracteres
    private String saldoInicioMes; //13 caracteres
    private String valorEntradaMes; // 13 caracteres
    private String valorSaidaMes; // 13 caracacter 
    private String saldoFinalMes; // 13 caracteres
    private String espacoEmBranco; // 10 caracteres

    public String numeroSequencialDoRegistro; // 6 caracteres

    public String getTipoDoRegistro() {
        return tipoDoRegistro;
    }

    public void setTipoDoRegistro(String tipoDoRegistro) {
        this.tipoDoRegistro = tipoDoRegistro;
    }

    public String getOrgao() {
        return orgao;
    }

    public void setOrgao(String orgao) {
        this.orgao = orgao;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public String getInformacoesBancarias() {
        return informacoesBancarias;
    }

    public void setInformacoesBancarias(String informacoesBancarias) {
        this.informacoesBancarias = informacoesBancarias;
    }

    public String getSaldoInicioMes() {
        return saldoInicioMes;
    }

    public void setSaldoInicioMes(String saldoInicioMes) {
        this.saldoInicioMes = saldoInicioMes;
    }

    public String getValorEntradaMes() {
        return valorEntradaMes;
    }

    public void setValorEntradaMes(String valorEntradaMes) {
        this.valorEntradaMes = valorEntradaMes;
    }

    public String getValorSaidaMes() {
        return valorSaidaMes;
    }

    public void setValorSaidaMes(String valorSaidaMes) {
        this.valorSaidaMes = valorSaidaMes;
    }

    public String getSaldoFinalMes() {
        return saldoFinalMes;
    }

    public void setSaldoFinalMes(String saldoFinalMes) {
        this.saldoFinalMes = saldoFinalMes;
    }

    public String getEspacoEmBranco() {
        return espacoEmBranco;
    }

    public void setEspacoEmBranco(String espacoEmBranco) {
        this.espacoEmBranco = espacoEmBranco;
    }

    public String getNumeroSequencialDoRegistro() {
        return numeroSequencialDoRegistro;
    }

    public void setNumeroSequencialDoRegistro(String numeroSequencialDoRegistro) {
        this.numeroSequencialDoRegistro = numeroSequencialDoRegistro;
    }

    @Override
    public String toString() {
        return "Conta{" + "tipoDoRegistro=" + tipoDoRegistro + ", orgao=" + orgao + ", unidade=" + unidade + ", informacoesBancarias=" + informacoesBancarias + ", saldoInicioMes=" + saldoInicioMes + ", valorEntradaMes=" + valorEntradaMes + ", valorSaidaMes=" + valorSaidaMes + ", saldoFinalMes=" + saldoFinalMes + ", espacoEmBranco=" + espacoEmBranco + ", numeroSequencialDoRegistro=" + numeroSequencialDoRegistro + '}';
    }

}
