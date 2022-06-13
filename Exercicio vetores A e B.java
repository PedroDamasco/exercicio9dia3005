package exe;
import java.util.Scanner;
public class Exercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// criacao dos valores e vetores.
		int aa,bb,ca=0,cb=0;
		int A[]= {4,6,7,1,0};
		int B[]= {7,1,3,1,2};
		int AC[]= {};
		int BC[]= {};
		int res=0;
		
		// contando tamanho dos vertores
		bb =B.length;
		aa =A.length;

		// criar informar numero de colunas.
		System.out.print("numero de colunas: "+aa);
		System.out.print("numero de colunas: "+bb);	
		
		// Criar condicoes para primeira condicao
		for (int a=0;a<aa;a++)
			if(A[a]>4)
			System.out.printf("\n Numero A nessa possicao: "+A[a]);
			ca++;
			AC[ca]=A[a];
			
			System.out.print("\n");

		// Criando condicoes da segunda Matriz na primeira condicao 
		for (int b=0;b<bb;b++) 
			if(B[b]>4)
			System.out.printf("\n Numero B nessa possicao: "+B[b]);
			
			System.out.print("\n");
		
		// criando condicaes da primeira Matriz na segunda condicao.
		for (int C=0;C<aa;C++)
			if(A[C]<=5)
			System.out.printf("\n Numero AC nessa possicao: "+A[C]);
		
			System.out.print("\n");
		
		// criando condicoes da segunda matriz para segunda condicao.
		for (int c=0;c<bb;c++)
			if(B[c]<=5)
			System.out.printf("\n Numero AC nessa possicao: "+B[c]);
		
			System.out.print("\n");
	
		
		
	}}
