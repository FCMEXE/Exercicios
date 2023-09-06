package Exercicio03_04;


public class Vendedor {
        private int codigo;
        private String nome;
        private double percentualComissao;

        public Vendedor(){

        }

        public Vendedor(int codigo, String nome, double percentualComissao){
            this.codigo = codigo;
            this.nome = nome;
            this.percentualComissao = percentualComissao;
        }

        public void setCodigo(int codigo){
            this.codigo = codigo;
        }

        public int getCodigo(){
            return codigo;
        }

        public void setNome(String nome){
            this.nome = nome;
        }

        public String getNome(){
            return nome;
        }

        public void setPercentualComissao(double percentualComissao){
            this.percentualComissao = percentualComissao;
        }

        public double getPercentualComissao(){
            return percentualComissao;
        }

        public double calcularPagamentoComissao(double valorVenda){
            return valorVenda * percentualComissao / 100;
        }

        public double calcularPagamentoComissao(double valorVenda, double desconto){
            return calcularPagamentoComissao(valorVenda) - desconto;
        }


        public static double calcularPagamentoComissao(double valorVenda, float percentualComissao){

            return valorVenda * percentualComissao / 100;
        }


        public String imprimir(double valorVenda, double desconto){
            return "Código: \n " + codigo +
                    "Nome:z\n " + nome +
                    "Valor Venda: \n " + valorVenda +
                    "% Comissão: \n " + percentualComissao +
                    "Desconto: \n " + desconto +
                    "Valor a Pagar: \n "+ calcularPagamentoComissao(valorVenda, desconto);
        }
    }

