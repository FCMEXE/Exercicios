package Exercicio01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner Sc = new Scanner(System.in);
        Calculadora c = new Calculadora();
        int opc = 0;
        int resp = 0;



        while(opc != 5) {
            System.out.println("Menu Calculadora \n" +
                    "1. Somar \n" +
                    "2. Subtrair \n" +
                    "3. Dividir   \n" +
                    "4. Multiplicar \n" +
                    "5. Sair  \n" +
                    "-->");
            opc = Sc.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("Digite o valor 1 :");
                    c.setValor1(Sc.nextInt());
                    System.out.println("Digite o valor 2 :");
                    c.setValor2(Sc.nextInt());

                    resp = c.getValor1() + c.getValor2();
                    System.out.println("A Soma da \n " + resp);
                    break;
                case 2:
                    System.out.println("Digite o valor 1 :");
                    c.setValor1(Sc.nextInt());
                    System.out.println("Digite o valor 2 :");
                    c.setValor2(Sc.nextInt());

                    resp = c.getValor1() - c.getValor2();
                    System.out.println("A Subtração da \n " + resp);
                    break;
                case 3:
                    System.out.println("Digite o valor 1 :");
                    c.setValor1(Sc.nextInt());
                    System.out.println("Digite o valor 2 :");
                    c.setValor2(Sc.nextInt());

                    resp = c.getValor1() / c.getValor2();
                    System.out.println("A Divisão da \n " + resp);
                    break;
                case 4:
                    System.out.println("Digite o valor 1 :");
                    c.setValor1(Sc.nextInt());
                    System.out.println("Digite o valor 2 :");
                    c.setValor2(Sc.nextInt());

                    resp = c.getValor1() * c.getValor2();
                    System.out.println("A Multiplicação da \n " + resp);
                    break;
                default:
                    System.out.println("Programa encerrado!");
            }
        }
        Sc.close();
    }
}
