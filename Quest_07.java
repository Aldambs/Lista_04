package Lista_04;

import java.util.*;

public class Quest_07 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Entre com a quantidade de jogadores:");
        int qtdJ = ler.nextInt();
        System.out.println("Entre com a quantidade de time:");
        int qtdT = ler.nextInt();        
        String nome[] = new String[qtdJ];
        int nivelJ[] = new int[qtdJ];
        
        for (int i = 0; i < qtdJ; i++) {
            System.out.println("Digite o nome do " +i+ " jogador:");
            nome[i] = ler.next();
            System.out.println("Digite a habilidade do " +i+ " jogador:");
            nivelJ[i] = ler.nextInt();
        }
        Arrays.sort(nome);
        int n = qtdJ;
        int temp = 0;
        String temp2 = null;
        
         for (int i = 0; i < n; i++) {
            if(nivelJ[i] <= nivelJ[i+1]){
               temp = nivelJ[i];  
               nivelJ[i] = nivelJ[i+1];
               nivelJ[i+1] = temp;
               
               temp2 = nome[i];  
               nome[i] = nome[i+1];
               nome[i+1] = temp2;              
            }
        }
        for (int i = 0; i < qtdT; i++) {
            for (int j = 0; j < qtdJ; j++) {
                System.out.println("Time: " +temp+ "Nome:" +temp2);
                j = j+1;
            }
        }
    }
    
}
