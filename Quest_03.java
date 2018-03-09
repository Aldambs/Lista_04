package Lista_04;

import java.util.Scanner;

public class Quest_03 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Entre com a quantidade de alunos de plp1: ");
        int plp1 = ler.nextInt();
        System.out.println("Entre com a quantidade de alunos de plp2: ");
        int plp2 = ler.nextInt();
        
        int turma1[] = new int[plp1];
        int turma2[] = new int[plp2];
        int result[] = new int[turma1.length];
        
        for (int i = 0; i < turma1.length; i++) {           
            System.out.println("Entre com a matricula do aluno na turma1 " +i+ ": ");
            turma1[i] = ler.nextInt();
        }
        for (int i = 0; i < turma2.length; i++) {
            System.out.println("Entre com a matricula do aluno na turma2 " +i+ ": ");
            turma2[i] = ler.nextInt();
        }
        for (int i = 0; i < turma1.length; i++) {
            for (int j = 0; j < turma2.length; j++) {
                if(turma1[i] == turma2[j]){
                    result[i] = turma2[j];
                }
            }
        }
        System.out.print(" 1º Turma = ");
        for (int i = 0; i < turma1.length; i++) {
            System.out.print(turma1[i]+ " ");
        }
        System.out.print("\n 2º Turma = ");
        for (int i = 0; i < turma2.length; i++) {
            System.out.print(turma2[i]+ " ");
        }
        System.out.print("\n Matriculas iguais = ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+ " ");
        }
    } 
}
