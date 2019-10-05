package command_pattern;

public class Priest {

	Command theCommand;
	
	public Priest(Command newCommand){
		 theCommand = newCommand;
	}
	
	public void press(){
		theCommand.execute();
	}
	
	public void pressUndo(){
		theCommand.undo();
	}
}
