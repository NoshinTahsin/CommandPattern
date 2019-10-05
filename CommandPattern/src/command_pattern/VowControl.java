package islands;

import java.util.ArrayList;
import java.util.List;

public class VowControl {
	
	private Vow vow;  
	private List <Command> takenVowList = new ArrayList <Command> ();
	private List <Command> breakVowList = new ArrayList <Command> (); 
  
	
	public Vow takeVow() {
		return vow;
	}
  
    public void press(Command command) 
    { 
        command.execute(); 
        
        takenVowList.add(command);
        vow = command.takeVow();
        
    } 
    
    public void undo() 
    { 
    	if(takenVowList.size() <= 1) {
    		System.out.println("Cannot Undo. No previous command.");
    	}
    	else {
    		System.out.println("Here I am!");
    		breakVowList.add(takenVowList.get(takenVowList.size() - 1));
        	takenVowList.remove(takenVowList.size() - 1);
        	
    		takenVowList.get(takenVowList.size() - 1).execute(); 
    		vow = takenVowList.get(takenVowList.size() - 1).takeVow();
    	}
    } 
    
    public void redo() 
    { 
    	if(breakVowList.size() >= 1) {
	    	takenVowList.add(breakVowList.get(breakVowList.size() - 1));
	    	breakVowList.remove(breakVowList.size() - 1);
	    	
	    	takenVowList.get(takenVowList.size() - 1).execute();
	    	vow = takenVowList.get(takenVowList.size() - 1).takeVow();
    	}
    	else {
    		System.out.println("Cannot Redo. No previous Undo command.");
    	}
    }
}




