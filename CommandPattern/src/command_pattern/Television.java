package command_pattern;

public class Television implements ElectronicDevice {

	private int volume = 0;
	@Override
	public void on() {
		// TODO Auto-generated method stub
		System.out.println("TV is on");
	}

	@Override
	public void off() {
		// TODO Auto-generated method stub
		System.out.println("TV is off");
	}

	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		volume++;
		System.out.println("TV Volume is at: " + volume);
	}

	@Override
	public void volumenDown() {
		// TODO Auto-generated method stub
		volume--;
		System.out.println("TV Volume is at: " + volume);
		
	}

}
