package problem04;

import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		int challenge=0;
		int answer[] = new int[3];
		int value[] = new int[3];
		
		
		Random rand = new Random();
		for(int i=0;i < answer.length;i++)
		{
			answer[i]= Math.abs((rand.nextInt()%10));
		}
	
		
		while(true)
		{
		int strike=0;
		int ball=0;
		int n=3;
		
		
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		
		challenge++;
		
		value[0] = num/100;
		value[1] = num%100;
		value[2] = num%10;
		
		for(int i=0;i<answer.length; i++)
		{
			for(int j=0;j<answer.length;j++)
			{
				if(value[i]==answer[j]) {
					if(i==j) strike++;
					else ball++;
				}
			}
			
		}
		
		System.out.println(challenge+" - "+"S:"+strike+", B:"+ball+", O:"+(3-(ball+strike)));
		
		if(strike==3)
		{
			System.out.println("종료");
			break;
		}
			
		
		
	}
	}
}