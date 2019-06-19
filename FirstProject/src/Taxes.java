
public class Taxes {
	private String name;
	private int salary;
	
	public Taxes(String name, int salary) {
		this.name=name;
		this.salary=salary;
	}
	
	public String getName() {
		return name;
	}
	
	public String PercentTax() {
		double totalTax=0;
		double percentageTax=0;
		double taxBand=0;
		if(salary>45000) {
			taxBand=(double)(salary-45000);
			totalTax+=taxBand*0.25;
		}
		if(salary<45000 && salary>=30000)
		{
			taxBand=(double)(45000-30000);
			totalTax+=taxBand*0.20;
		}
		
		if(salary<30000 && salary>=20000) {
			taxBand=(double)(30000-20000);
			totalTax+=taxBand*0.15;
		}
		
		if(salary>20000 && salary>=15000) {
			taxBand=(double)(20000-15000);
			totalTax+=taxBand*0.10;
	}
		
			percentageTax=100*totalTax/(double)salary;
		return Double.toString(percentageTax)+"%";
	
}
	
	public String amountTax() {
		double totalTax=0;

		double taxBand=0;
		if(salary>45000) {
			taxBand=(double)(salary-45000);
			totalTax+=taxBand*0.25;
		}
	 if(salary<45000 && salary>=30000)
		{
			taxBand=(double)(45000-30000);
			totalTax+=taxBand*0.20;
		}
		
	if(salary<30000 && salary>=20000) {
			taxBand=(double)(30000-20000);
			totalTax+=taxBand*0.15;
		}
		
	if(salary>20000 && salary>=15000) {
			taxBand=(double)(20000-15000);
			totalTax+=taxBand*0.10;
	}
		return "£"+Double.toString(totalTax);
}
}

