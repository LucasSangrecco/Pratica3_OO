package br.com.newton.pagamento;

import javax.swing.JOptionPane;

public class FuncionarioMain {
    public static void main(String[] args) {

        String nome;
        int matricula;
        double salario;
        double percentual;
        double vendas;
        int producao;
        double valor;
        int opcao;


        do {

            opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha o tipo de provento:\n\n<1> Salário Fixo\n<2> Comissão\n<3> Produtividade\n<4> Sair"));

            switch (opcao) {

                case 1: {
                    nome = JOptionPane.showInputDialog("Digite o nome do funcionário:");
                    matricula = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de matrícula do funcionário:"));
                    salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do salário do funcionário:"));

                    FPadrao fPadrao = new FPadrao(matricula, nome, salario);
                    JOptionPane.showMessageDialog(null, fPadrao.toString(), "Salário Fixo", JOptionPane.DEFAULT_OPTION);
                    break;
                }
                case 2: {
                    nome = JOptionPane.showInputDialog("Digite o nome do funcionário:");
                    matricula = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de matrícula do funcionário:"));
                    salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do salário do funcionário:"));
                    percentual = Double.parseDouble(JOptionPane.showInputDialog("Digite a porcentagem da comissão"));
                    vendas = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da venda: "));

                    FComissionado fComissionado = new FComissionado(matricula, nome, salario, percentual, vendas);
                    JOptionPane.showMessageDialog(null, fComissionado.toString(), "Dados do Funcionário", JOptionPane.DEFAULT_OPTION);
                    JOptionPane.showMessageDialog(null, fComissionado.calculaProvento(), "Comissão", JOptionPane.DEFAULT_OPTION);
                    break;

                }
                case 3: {
                    nome = JOptionPane.showInputDialog("Digite o nome do funcionário:");
                    matricula = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de matrícula do funcionário:"));
                    salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do salário do funcionário:"));
                    producao = Integer.parseInt(JOptionPane.showInputDialog("Digite a produção:"));
                    valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor:"));

                    FProdutividade fProdutividade = new FProdutividade(matricula, nome, salario, valor, producao);
                    JOptionPane.showMessageDialog(null, fProdutividade.toString(), "Dados do Funcionário", JOptionPane.DEFAULT_OPTION);
                    JOptionPane.showMessageDialog(null, fProdutividade.calculaProvento(), "Produtividade", JOptionPane.DEFAULT_OPTION);
                    break;
                }
                case 4:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção Inválida", "ERRO", JOptionPane.ERROR_MESSAGE);

            }

        }
        while (opcao != 4);
    }

}
