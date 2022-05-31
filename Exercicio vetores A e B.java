package exe;
import java.util.Scanner;
public class Exercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int aa,bb;
		int A[]= {4,6,7,1,0};
		int B[]= {7,1,3,1,2};
		
		bb =B.length;
		aa =A.length;

		System.out.print("numero de colunas: "+aa);
		System.out.print("numero de colunas: "+bb);	
		
		for (int a=0;a<aa;a++)
			if(A[a]>4)
			System.out.printf("\n Numero A nessa possicao: "+A[a]);
			
		System.out.print("\n");
		for (int b=0;b<bb;b++) {
			if(B[b]<=5)
			System.out.printf("\n Numero B nessa possicao: "+B[b]);
		
			}
	}}


