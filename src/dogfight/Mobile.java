package dogfight;

import java.awt.Image;

public class Mobile implements IMobile {

	public int speed;
	public Direction direction;
	public Position position;
	public Dimension dimension;
	public Image images;
	
	//Constructeur
	public Mobile(Direction direction, Position position, Dimension dimension, int speed, String image) {
		//this.images = new Image();
	
	}
	
	//Get set
	
	
	public int getSpeed() {
		return speed;
	}

	public Image getImages() {
		return images;
	}

	public void setImages(Image images) {
		this.images = images;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public Direction getDirection() {
		return direction;
	}

	public void setDirection(Direction direction) {
		this.direction = direction;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public Dimension getDimension() {
		return dimension;
	}

	public void setDimension(Dimension dimension) {
		this.dimension = dimension;
	}
	
	
	
}