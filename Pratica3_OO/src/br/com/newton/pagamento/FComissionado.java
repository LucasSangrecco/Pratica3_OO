package br.com.newton.pagamento;

public class FComissionado extends Funcionario {

    double percentual;
    double vendas;

    public FComissionado(int matricula, String nome, double salario, double percentual, double vendas) {
        super(matricula, nome, salario);
        this.percentual = percentual;
        this.vendas = vendas;
    }

    public double getPercentual() {
        return percentual;
    }

    public void setPercentual(double percentual) {
        this.percentual = percentual;
    }

    public double getVendas() {
        return vendas;
    }

    public void setVendas(double vendas) {
        this.vendas = vendas;
    }


    public String calculaProvento(){
        double comissão=vendas*(percentual/100);
        return "Comissão: " + comissão;
    }

}
