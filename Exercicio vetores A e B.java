package exe;
import java.util.Scanner;
public class Exercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int aa,bb,ca=0,cb=0;
		int A[]= {4,6,7,1,0};
		int B[]= {7,1,3,1,2};
		int AC[]= {};
		int BC[]= {};
		int res=0;
		
		bb =B.length;
		aa =A.length;

		System.out.print("numero de colunas: "+aa);
		System.out.print("numero de colunas: "+bb);	
		
		for (int a=0;a<aa;a++)
			if(A[a]>4)
			System.out.printf("\n Numero A nessa possicao: "+A[a]);
			ca++;
			AC[ca]=A[a];
			
			System.out.print("\n");
			
		for (int b=0;b<bb;b++) 
			if(B[b]>4)
			System.out.printf("\n Numero B nessa possicao: "+B[b]);
			
			System.out.print("\n");
		
		for (int C=0;C<aa;C++)
			if(A[C]<=5)
			System.out.printf("\n Numero AC nessa possicao: "+A[C]);
		
			System.out.print("\n");
		
		for (int c=0;c<bb;c++)
			if(B[c]<=5)
			System.out.printf("\n Numero AC nessa possicao: "+B[c]);
		
			System.out.print("\n");
	
		
		
	}}