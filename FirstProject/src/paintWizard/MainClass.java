package paintWizard;

public class MainClass {

	public MainClass() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Paint can = new Paint("CheapoMax", 19.07, 21, 10);
		
		Room room = new Room(200);
		
		AmountOfPaint  amountOfPaint = new AmountOfPaint(can, room);
		
		
		
System.out.println(amountOfPaint.calculatePrice());
	}

}
