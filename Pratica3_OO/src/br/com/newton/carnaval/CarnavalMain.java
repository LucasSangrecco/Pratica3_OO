package br.com.newton.carnaval;

import javax.swing.JOptionPane;

public class CarnavalMain {
    public static void main(String[] args) {

        double valor;
        double valorAdicional;
        String localizacao;
        int opcao;

        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("<1> Ingresso Normal\n<2> Ingresso VIP\n<3> Ingresso Camarote\n<4> Sair"));


            switch (opcao) {
                case 1: {
                    valor = Double.parseDouble(JOptionPane.showInputDialog("Valor do Ingresso"));
                    Normal ingressoNormal = new Normal(valor);
                    JOptionPane.showMessageDialog(null, ingressoNormal.imprimeIngresso(), "Mensagem", JOptionPane.DEFAULT_OPTION);
                    break;
                }
                case 2: {
                    valor = Double.parseDouble(JOptionPane.showInputDialog("Valor do Ingresso"));
                    valorAdicional = Double.parseDouble(JOptionPane.showInputDialog("Valor do adicional Vip"));
                    Vip ingressoVip = new Vip(valor, valorAdicional);
                    JOptionPane.showMessageDialog(null, ingressoVip.imprimeIngresso(), "Mensagem", JOptionPane.DEFAULT_OPTION);
                    break;
                }
                case 3: {
                    valor = Double.parseDouble(JOptionPane.showInputDialog("Valor do Ingresso"));
                    valorAdicional = Double.parseDouble(JOptionPane.showInputDialog("Valor do adicional de Camarote"));
                    localizacao = JOptionPane.showInputDialog("Localização");
                    Camarote ingressoCamarote = new Camarote(valor, valorAdicional, localizacao);
                    JOptionPane.showMessageDialog(null, ingressoCamarote.imprimeIngresso(), "Mensagem", JOptionPane.DEFAULT_OPTION);
                    break;
                }
                case 4:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida", "ERRO", JOptionPane.ERROR_MESSAGE);

            }

        }
        while (opcao != 4);
    }

}
