package islands;

import java.util.Scanner;

public class VowCommandTest {
	
	
	
	public void VowCommandTest() {
		
		VowControl vowControl;
	
		vowControl = new VowControl();
		boolean loop=true;
		
		while(loop)
		{
			System.out.println("Want to Take A Vow? y/n");
			Scanner input = new Scanner(System.in);
			String inp=input.nextLine();

		if(inp.equals("y"))
		{
			System.out.println("Enter BrideID, BridegroomID, Bride name, Bridegroom name: ");
			
			int BrideID=input.nextInt();
			int BridegroomID=input.nextInt();
			String Bride=input.nextLine();
			String Bridegroom=input.nextLine();
			
			Vow vow = new Vow(BrideID, BridegroomID, Bride, Bridegroom);
		//Command command = new ColorChangeCommand(circle, getGraphics());
		//vowControl.press(command);
		
		 
		 
		System.out.println("Want to Undo Previous Vow? y/n");
		//Scanner input = new Scanner(System.in);
	    inp=input.nextLine();

		if(inp.equals("y"))
			vowControl.undo();

		System.out.println("Want to Redo Previous Vow? y/n");
		//Scanner input = new Scanner(System.in);
		inp=input.nextLine();

		if(inp.equals("y"))
			vowControl.redo();
		 
		
		
		}
		
		System.out.println("End vow? y/n");
		inp=input.nextLine();

		if(inp.equals("y"))
			loop=false;
		
		
		
		}
		
	}
		
		

	 
		
	}


