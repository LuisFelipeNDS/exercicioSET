package aplicacao;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entidade.Aluno;

public class Programa {
	
	public static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("No curso A existem quantos alunos ?");
		int curso = teclado.nextInt();
		
		Set<Aluno> alunoSet = new HashSet<>(); 
		
		for(int i = 0; i< curso; i++) {
			
			System.out.println("Qual o id do aluno " + i + " matriculado no curso A ?");
			int id = teclado.nextInt();
			
			alunoSet.add(new Aluno((id)));
					
		}
		
		System.out.println("No curso B existem quantos alunos ?");
		curso = teclado.nextInt();

		for(int i = 0; i< curso; i++) {
			
			System.out.println("Qual o id do aluno " + i + " matriculado no curso B ?");
			int id = teclado.nextInt();
			
			alunoSet.add(new Aluno((id)));
					
		}
		
		System.out.println("No curso C existem quantos alunos ?");
		curso = teclado.nextInt();

		for(int i = 0; i< curso; i++) {
			
			System.out.println("Qual o id do aluno " + i + " matriculado no curso C ?");
			int id = teclado.nextInt();
			
			alunoSet.add(new Aluno((id)));
		}
		
		System.out.println("A quantidade de alunos matriculados são: " + alunoSet.size());
		
		
		
	}
}
