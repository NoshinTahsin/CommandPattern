package commandPattern;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

public class RemoteControl {
	
	private Circle circle;  
	private List <Command> drawnList = new ArrayList <Command> ();
	private List <Command> removedList = new ArrayList <Command> (); 
  
	
	public Circle getCircle() {
		return circle;
	}
  
    public void press(Command command) 
    { 
        command.execute(); 
        
        drawnList.add(command);
        circle = command.getCircle();
        
        //System.out.println("DrawnList size: " + drawnList.size());
        //System.out.println("RemovedList size: " + removedList.size());
    } 
    
    public void undo() 
    { 
    	if(drawnList.size() <= 1) {
    		System.out.println("Cannot Undo. No previous command.");
    	}
    	else {
    		System.out.println("Here I am!");
    		removedList.add(drawnList.get(drawnList.size() - 1));
        	drawnList.remove(drawnList.size() - 1);
        	
    		drawnList.get(drawnList.size() - 1).execute(); 
    		circle = drawnList.get(drawnList.size() - 1).getCircle();
    	}
    } 
    
    public void redo() 
    { 
    	if(removedList.size() >= 1) {
	    	drawnList.add(removedList.get(removedList.size() - 1));
	    	removedList.remove(removedList.size() - 1);
	    	
	    	drawnList.get(drawnList.size() - 1).execute();
	    	circle = drawnList.get(drawnList.size() - 1).getCircle();
    	}
    	else {
    		System.out.println("Cannot Redo. No previous Undo command.");
    	}
    }
}
