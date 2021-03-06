package space_despot.Game_Screen_Elements;

import java.awt.Image;
import java.awt.Rectangle;

public abstract class SpaceObject {
	
	// PROPERTIES
    protected Image image;
    protected int x; // x coordinate
    protected int y; // y coordinate
    protected int width;
    protected int height;
    protected int velocityX;
    protected int velocityY;
	
	// CONSTRUCTOR
	public SpaceObject() {
		super();
	}
	
	// ABSTRACT METHODS
	public abstract void move();
	
	// get bounds for collision
	public Rectangle getBounds() {
		return new Rectangle(x, y, width, height);
	}

	// GETTERS AND SETTERS
	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

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

	public int getVelocityX() {
		return velocityX;
	}

	public void setVelocityX(int velocityX) {
		this.velocityX = velocityX;
	}

	public int getVelocityY() {
		return velocityY;
	}

	public void setVelocityY(int velocityY) {
		this.velocityY = velocityY;
	}
}
