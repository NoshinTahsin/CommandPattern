package commandPattern;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

public class SizeChangeCommand extends Command {
	
	private Circle circle;
	private Graphics g;

	
	public SizeChangeCommand(Circle circle, Graphics g) {
		this.circle = circle;
		this.g = g;
	}

	public void execute() {

		circle.draw(g);
		//drawnList.add(circle.radius);
	}


	public Circle getCircle() {
		return circle;
	}
	
	/*
	public void undo() {
		int size = drawnList.get(drawnList.size() - 1);
		drawnList.remove(size);
		removedList.add(size);
		
		if(drawnList.size() == 0) {
			drawnList.add(75);
		}
		size = drawnList.get(drawnList.size() - 1);
		circle.setSize(size);
		circle.draw(g);
	}


	public void redo() {
		if(removedList.size() >= 1) {
			int size = removedList.get(removedList.size() - 1);
			drawnList.add(size);
			removedList.remove(size);
			
			size = drawnList.get(drawnList.size() - 1);
			circle.setSize(size);
			circle.draw(g);
		}
	}
	*/

}
