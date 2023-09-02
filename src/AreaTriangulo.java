

	import java.util.Scanner;

	public class AreaTriangulo {
		public static void main(String [] args) {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Digite o valor do lado: ");
			float lado = sc.nextInt();
			
			System.out.print("Digite o valor da base: ");
			float base = sc.nextInt();
			sc.close();
			
			System.out.print("A area do triangulo é:" + lado * base / 2);
	
	}

}
