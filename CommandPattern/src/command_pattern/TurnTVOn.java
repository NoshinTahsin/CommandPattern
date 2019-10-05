package command_pattern;

public class TakeVow implements Command {

	Vow theDevice;
	
	public TakeVow(Vow newDevice)
	{
		theDevice = newDevice;
	}
	 
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		  theDevice.takeVow();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		  theDevice.breakVow();
	}

}
