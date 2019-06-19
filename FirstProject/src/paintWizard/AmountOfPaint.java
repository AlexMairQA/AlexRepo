package paintWizard;

public class AmountOfPaint {
	Room room;
	Paint can;
	public AmountOfPaint() {
		// TODO Auto-generated constructor stub
	}
	
	public AmountOfPaint(Paint can, Room room) {
		// TODO Auto-generated constructor stub
		this.can=can;
		this.room=room;
		
	}
	
	public String calculatePrice() {
	int areaPerLitre=can.getAreaPerLitre();
	int sizeOfRooom=room.getSquareMetres();
	float price= ((float)can.getPriceInt()*sizeOfRooom)/100;
	
	
	return "£"+price;
	}
}
