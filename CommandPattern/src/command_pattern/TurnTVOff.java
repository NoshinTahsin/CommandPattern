package command_pattern;

public class TurnTVOff implements Command {
	
	 ElectronicDevice theDevice;

	 public TurnTVOff(ElectronicDevice newDevice){
		 theDevice = newDevice;
	 }
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		 theDevice.off();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		theDevice.on();
	}
	 

}
