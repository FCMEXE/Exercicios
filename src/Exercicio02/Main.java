package Exercicio02;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {

            Apolice Apolice = new Apolice();
            Scanner Teclado = new Scanner(System.in);
            int opc = 0;
            while (opc != 3) {
                System.out.println("Menu  \n" +
                        "1.Criar Apólice \n" +
                        "2.Ver Dados Apólice \n" +
                        "3.Sair ");

                opc = Integer.parseInt(String.valueOf(Teclado.nextInt()));

                switch (opc) {

                    case 1:
                        System.out.println("Número apresentado:");
                        Apolice.setNumero(Teclado.nextInt());


                        System.out.println("Qual seu nome:");
                        Apolice.setNome(Teclado.nextLine());
                        Apolice.setNome(Teclado.nextLine());


                        System.out.println("Qual sua idade:");
                        Apolice.setIdade(Integer.parseInt(Teclado.nextLine()));


                        System.out.println("Qual seu sexo? (M/F)");

                        Apolice.setSexo(Teclado.next().charAt(0));


                        System.out.println("Valor do Automovel:");
                        Apolice.setValorAutomovel((int)Double.parseDouble(Teclado.next()));

                        break;
                    case 2:
                        System.out.println(Apolice.Imprimir());
                        break;
                    case 3:
                        System.out.println("Sistema Encerrado!!");
                        break;
                    default:
                        System.out.println("OUT!");
                }
            }
        }
    }



