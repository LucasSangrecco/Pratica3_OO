package br.com.newton.carnaval;

public class Camarote extends Ingresso {

    public double valorAdicional;
    public String localizacao;

    public Camarote(double valorIngresso, double valorAdicional, String localizacao) {
        super(valorIngresso);
        this.valorAdicional = valorAdicional;
        this.localizacao = localizacao;
    }

    public double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public String imprimeIngresso() {
        return "Ingresso Camarote: " + (getValorIngresso() + getValorAdicional()) + "\nLocalização:  " + getLocalizacao();
    }

}