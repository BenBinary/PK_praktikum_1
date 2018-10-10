package aufg1_bk;

import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int max = 50;
		int input = s.nextInt();
		
		if (input > 0)
			max = input;

		for (int i = 1;  i <= max; i++)
		{
			if ((i % 3)== 0 && (i % 5)==0)
			{
				System.out.println("PingPomg");
			}
			else if ((i % 3)==0)
				System.out.println("Ping");
			else if ((i % 5)==0)
				System.out.println("Pong");
			else
				System.out.println(i);
		}

		
		s.close();
		
	}
	

}
