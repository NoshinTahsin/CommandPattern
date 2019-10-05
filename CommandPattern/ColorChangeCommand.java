package commandPattern;

import java.awt.Color;
import java.awt.Graphics;
import java.util.List;
import java.util.ArrayList;

public class ColorChangeCommand extends Command {
	
	private Circle circle;
	private Graphics g;

	
	public ColorChangeCommand(Circle circle, Graphics g) {
		this.circle = circle;
		this.g = g;
	}

	public void execute() {

		circle.draw(g);
		//drawnList.add(circle.color);
		
	}
	
	public Circle getCircle() {
		return circle;
	}

	/*
	public void undo() {
		Color col = drawnList.get(drawnList.size() - 1);
		drawnList.remove(col);
		removedList.add(col);
		
		if(drawnList.size() == 0) {
			drawnList.add(Color.black);
		}
		col = drawnList.get(drawnList.size() - 1);
		circle.setColor(col);
		circle.draw(g);
	}


	public void redo() {
		if(removedList.size() >= 1) {
			Color col = removedList.get(removedList.size() - 1);
			drawnList.add(col);
			removedList.remove(col);
			
			col = drawnList.get(drawnList.size() - 1);
			circle.setColor(col);
			circle.draw(g);
		}
	}
	*/
	
}