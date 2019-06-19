import java.util.*;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
calculatePrimes();
		
		

	}
	
	public static void calculatePrimes() {
		boolean [] nums = new boolean[3000];
		
		for (boolean b : nums) {
			b=true;
		}
		
		for (int i = 0; i < nums.length; i++) {
			if(i==2 || i==3 || i==5 || i==7)
				continue;
			if(i%2==0 || i%3==0 || i%5==0 || i%7==0)
				nums[i]=true;
		}
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]==true) {
			System.out.println(i);
		}
		}
		
	}
	
	
	
	private static int sumInts(int foo, int bar, boolean sum) {
		
		if(foo%2==0 || bar%2==0)
				return 0;
		else if(sum)
			return foo+bar;
		else
			return foo*bar;
		

	}
	
	private static int blackJackMethod(int foo, int bar) {
		// TODO Auto-generated method stub
		int fooDiff=21-foo;
		int barDiff=21-bar;
		
		if(barDiff<0 && fooDiff<0)
			return 0;
		else if (Math.abs(fooDiff)<Math.abs(barDiff))
			return foo;
		else if(Math.abs(barDiff)<Math.abs(fooDiff))
			return bar;
		
		else
			return 0;

	}
	
	private static int addDigit(int N) {
		
		if(N>9)
			return addDigit(N/10)+N%10;
		else return N;
	}
	
	private static String numberWord(int N) {
		// TODO Auto-generated method stub
	
		int secondDigit=N%100/10;
		int thirdDigit=N%10;
		
		List<String> units= Arrays.asList("", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine");
		List<String> teens=Arrays.asList("ten","eleven,", "twelve", "thirteen", "forteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen");
		List<String> tens= Arrays.asList("", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety");
		
		List<String> hundreds= Arrays.asList("", "one-hundred", "two-hundred", "three-hundred", "four-hundred", "five-hundred", "six-hundred", "seven-hundred", "eight-hundred", "nine-hundred");
		
		
					
			switch(secondDigit) {
			case 1:
				return ""+hundreds.get(N/100)+" "+teens.get(N%100-10);
			case 0:
				return ""+hundreds.get(N/100)+" "+units.get(N%10);
			default:
				return ""+hundreds.get(N/100)+" "+tens.get(N%100/10)+" "+units.get(N%10);
			}
				

	}
	
	private static String name(float cost, float amount) {
		int costInt=(int)(cost*100);
		int amountInt=(int)(amount*100);
		int changeInt=amountInt-costInt;
		int twenties=0;
		int tens=0;
		int fives=0;
		int pounds=0;
		while(changeInt>=2000) {
			changeInt-=200;
			++twenties;
			
		}
		
		while (changeInt>=10) {
			changeInt-=10;
			++tens;
		}
		while (changeInt>=5) {
			changeInt-=5;
			++fives;
		}
		
		while (changeInt>=1) {
			changeInt-=1;
		}
		cost=((float)costInt)/100;
		amount=((float)amountInt)/100;
		float change=((float)changeInt)/100;
		return String.format("", twenties, tens, fives, pounds)
	}
}
	
	
		
		
	

