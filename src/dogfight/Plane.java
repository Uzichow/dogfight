package dogfight;

public class Plane extends Mobile {
	
	public static int SPEED=2;
	public static int WIDTH=100;
	public static int HEIGHT=30;
	public int player;
	
//Constructeur
	public Plane(int player, Direction direction, Position position, String image) {
		super(direction, position, null, SPEED, image);
		// TODO Auto-generated constructor stub
	}
	//Method
	public boolean isPlayer(int player) {
		return false;
		
	}
	
	public boolean hit() {
		return false;
	}
}
