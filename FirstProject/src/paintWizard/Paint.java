package paintWizard;

public class Paint {
	
	private int priceInt;
	private int canSize;
	private int areaPerLitre;
	private String brand;

	public Paint() {
		// TODO Auto-generated constructor stub
	}

	public Paint(String brand, double price, int canSize, int areaPerLitre) {
		super();
		this.brand=brand;
		this.priceInt = (int)(price*100);
		this.canSize = canSize;
		this.areaPerLitre = areaPerLitre;
	}
	public String calculatePrice() {
		float price= (float)priceInt/100;
		
		return "£"+price;
	}

	public int getPriceInt() {
		return priceInt;
	}

	public int getCanSize() {
		return canSize;
	}

	public int getAreaPerLitre() {
		return areaPerLitre;
	}

	public String getBrand() {
		return brand;
	}
	

}
