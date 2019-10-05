package commandPattern;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

public class PositionChangeCommand extends Command {
	
	private Circle circle;
	private Graphics g;

	
	public PositionChangeCommand(Circle circle, Graphics g) {
		this.circle = circle;
		this.g = g;
	}

	public void execute() {

		circle.draw(g);
		//drawnList.add(circle.x);
		//drawnList.add(circle.y);
	}
	
	public Circle getCircle() {
		return circle;
	}
	
	/*
	public void undo() {
		int x = drawnList.get(drawnList.size() - 1);
		int y = drawnList.get(drawnList.size() - 2);
		drawnList.remove(x);
		removedList.add(x);		
		drawnList.remove(y);
		removedList.add(y);
		
		if(drawnList.size() == 0) {
			drawnList.add(220);
			drawnList.add(200);
		}
		x = drawnList.get(drawnList.size() - 1);
		y = drawnList.get(drawnList.size() - 2);
		circle.setPosition(x, y);
		circle.draw(g);
	}


	public void redo() {
		if(removedList.size() >= 1) {
			int x = removedList.get(removedList.size() - 1);
			int y = removedList.get(removedList.size() - 2); 
			drawnList.add(x);
			removedList.remove(x);
			drawnList.add(y);
			removedList.remove(y);
			
			x = drawnList.get(drawnList.size() - 1);
			y = drawnList.get(drawnList.size() - 2);
			circle.setPosition(x, y);
			circle.draw(g);
		}
	}

	/*
	public void setGraphics(Graphics g) {
		Command.g = g;
		
	}
	*/
}
