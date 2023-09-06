package Exercicio03_04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Vendedor vendedor = new Vendedor();
        int opc;
        double valorVenda = 0;
        double desconto = 0;

        do{
            System.out.println("Menu:");
            System.out.println("1. Cadastrar Vendedor");
            System.out.println("2. Calcular Comissão");
            System.out.println("3. Sair");
            System.out.println("->");
            opc = Integer.parseInt(teclado.next());

            switch(opc){
                case 1:
                    System.out.print("Digite o código do vendedor: ");
                    vendedor.setCodigo(Integer.parseInt(teclado.next()));
                    System.out.print("Digite o nome do vendedor: ");
                    vendedor.setNome(teclado.next());
                    System.out.print("Digite o percentual de comissão : ");
                    vendedor.setPercentualComissao(Double.parseDouble(teclado.next()));
                    break;

                case 2:
                    System.out.print("Digite o valor total vendido : ");
                    valorVenda = Double.parseDouble(teclado.next());
                    System.out.print("Digite o valor a ser descontado : ");
                    desconto = Double.parseDouble(teclado.next());

                    System.out.println(vendedor.imprimir(valorVenda, desconto));
                    break;

                case 3:
                    System.out.println("Programa Encerrado!");
                    break;

                default:
                    System.out.println("O número digitado não é válido");
                    break;
            }
        }while(opc != 3);
    }
}

