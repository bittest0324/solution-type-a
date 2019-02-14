package problem01;

public class Main {
	
	
	//알고리즘
	//값을 100,10과 나눈 나머지와  100으로 나눈 나머지에 3이 있으면 각각 두 횟수만큼 박수

	public static void main(String[] args) {
		for( int i = 1; i <= 100; i++ ) {
			int count = countClap(i);

			if( count == 0 ) {
				continue;
			}
			
			System.out.print( i + " " );
			
			for( int j = 0; j < count; j++ ) {
				System.out.print( "짝" );
			}
			
			System.out.println( "" );			
		}
	}
	
	public static int countClap(int number) {
		
		int goal =number/3; //3으로 나는 몫
		int rest; //3으로 나머지
		int a=0;
		
		
		
		if((number%100)==3 )
		{
			a++;
		}
		else if(number%10==3)
		{
			a++;
		}
		
		return a;
	}
}