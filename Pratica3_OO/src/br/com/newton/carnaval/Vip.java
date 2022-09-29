package br.com.newton.carnaval;

import java.text.NumberFormat;
import javax.swing.JOptionPane;

public class Vip extends Ingresso {

    private double valorAdicional;

    public Vip(double valorIngresso, double valorAdicional) {
        super(valorIngresso);
        this.valorAdicional = valorAdicional;
    }

    public double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    public String imprimeIngresso() {
        return "Ingresso VIP: " + (getValorIngresso() + getValorAdicional());

    }

}