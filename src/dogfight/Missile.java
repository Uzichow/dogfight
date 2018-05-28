package dogfight;

public class Missile extends Mobile {
	
	public static int SPEED=2;
	public static int WIDTH=30;
	public static int HEIGHT=10;
	public static int MAX_DISTANCE_TRAVELED=1400;
	public static String IMAGE="missile";
	public int distanceTraveled=0;
	
	//Constructeur
	public Missile(Direction direction, Dimension dimension) {
		super(direction, null, dimension, SPEED, IMAGE);
		// TODO Auto-generated constructor stub
	}
	
	//Getcheloux
	public static int getWidthWithADirection(Direction direction) {
		return 0;
		
	}
	public static int getHeightWithADirection(Direction direction) {
		return 0;
		
	}
	//Method
	
	public void move() {
		
	}
	
	public boolean isWeapon() {
		return false;
	}
}
