package dogfight;

public class Position {
	
	public double x,y,maxX,maxY;
	
	//Constructeur
	public Position(double x, double y, double maxX, double maxY) {
		
	}
	//Constructeur 2.0
	public Position(Position position) {
		
	}
	//Getter et Setter
	
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public double getMaxX() {
		return maxX;
	}
	protected void setMaxX(double maxX) {
		this.maxX = maxX;
	}
	public double getMaxY() {
		return maxY;
	}
	protected void setMaxY(double maxY) {
		this.maxY = maxY;
	}

}
