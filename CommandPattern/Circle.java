package commandPattern;

import java.awt.Color;
import java.awt.Graphics;

public class Circle {
	
	protected int radius;
	protected Color color;
	protected int x, y;
	
	
	public Circle(int x, int y, int radius, Color color) {
		this.x = x;
		this.y = y;
		this.radius = radius;
		this.color = color;
	}
	
	public Color getColor() {
		return color;
	}
	
	public int getSize() {
		return radius;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void draw(Graphics g) {
		
		g.setColor(Color.white);
		g.fillRect(0, 0, 540, 530);
		
		g.setColor(color);
		g.fillOval(x, y, radius, radius);
	}
}
