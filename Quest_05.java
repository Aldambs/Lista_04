package Lista_04;

import java.util.Scanner;

public class Quest_05 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int estoque = 0;
        
        do{
            System.out.println("Entre com o estoque das mercadorias:");
            estoque = ler.nextInt();
        }while(estoque > 50);
        
        int cod = 1, pedi = 0, num = 0;
        int qtdM[] = new int[estoque];
        int qtdD[] = new int[estoque];
        int result[] = new int[qtdM.length];
        
        for (int i = 0; i < qtdM.length; i++) {
            System.out.println("Entre com a quantidade de mercadoria: " +i);
            qtdM[i] = ler.nextInt();
            cod =+ 1;
        }
        
        do{
            System.out.println("Entre com o pedido do cliente:");
            pedi = ler.nextInt();
            System.out.println("Entre com o número do cliente:");
            num = ler.nextInt();
            System.out.println("Entre com o código do da mercadoria:");
            cod = ler.nextInt();
        }while(pedi < estoque);
        
        for (int i = 0; i < qtdD.length; i++) {
            System.out.println("Entre com a quantidade desejada de mercadoria: " +i);
            qtdD[i] = ler.nextInt();
        }
        
        for (int i = 0; i < result.length; i++) {
            result[i] = qtdM[i] - qtdD[i];
            if(result[i] > 0 || result[i] == 0){
                System.out.println("OK!");
            }else{
                System.out.println("Estoque Insuficiente!");
            }
        }
        System.out.println();
        System.out.print("Mercadoria no estoque = ");
        for (int i = 0; i < qtdM.length; i++) {
            System.out.print(qtdM[i]+ " ");
        }
        System.out.println();
        System.out.print("Quantidade desejada de mercadoria = ");
        for (int i = 0; i < qtdD.length; i++) {
            System.out.print(qtdD[i]+ " ");
        }
        System.out.println();
        System.out.print("Resultado do estoque = ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+ " ");
        }
    }
}

