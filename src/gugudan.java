import java.util.Scanner;

public class gugudan {
	public static void main(String[] a) {
		int i=1;
		System.out.println("���ڸ� �Է��Ͻÿ�:");
		Scanner sc= new Scanner(System.in);
		int number=sc.nextInt();
		while(i<10) {
			int result=number*i;
			System.out.println(result);
			i++;
		}
	}
}
