package dogfight;

public class Dimension {

	public int width;
	public int height;
	
	//Constructeur
	public Dimension(int width, int height) {
		
	}
	// Contrusteur 2.0
		public Dimension (Dimension dimension) {
			
		}
		//Get et Set
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

}
