package command_pattern;

import java.util.ArrayList;
import java.util.List;

public class TestVow{
	
	public static void main(String[] args){
		
		Vow newVow = VowTracker.getVow(); //returns new Television()
		
		TakeVow onCommand = new TakeVow(newVow);
		
		Priest onPressed = new Priest(onCommand);
		
		onPressed.press();//execute()
		
		//TurnTVOff offCommand = new TurnTVOff(newDevice);
		
		//onPressed = new DeviceButton(offCommand);
		
		//onPressed.press();

		 
		
		Couple couple = new Couple();
		
	
		List<Vow> allDevices = new ArrayList<Vow>();
		
		allDevices.add(couple);
		 
		
		TurnTVOn turnOffDevices = new TurnItAllOff(allDevices);
		
		DeviceButton turnThemOff = new DeviceButton(turnOffDevices);
		
		turnThemOff.press();
		
		turnThemOff.pressUndo();
		 
	}
	
}