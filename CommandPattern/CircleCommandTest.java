package commandPattern;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

import compositePattern.MakeShapes;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;

public class CircleCommandTest extends JPanel implements ActionListener {
	
	private static JFrame frame;
	RemoteControl remote;

	JComboBox comboColor, comboSize, comboPos;
	int X = 200, Y = 200, size = 75;
	Color color = Color.black;

	
	/**
	 * Create the panel.
	 */
	public CircleCommandTest() {

		remote = new RemoteControl();
		
		setBackground(new Color(230, 230, 250));
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(95, 158, 160));
		panel.setBounds(543, 0, 177, 530);
		add(panel);
		panel.setLayout(null);
		
		JButton btnDraw = new JButton("Draw Circle");
		btnDraw.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				Circle circle = new Circle(X, Y, size, color);
				Command command = new ColorChangeCommand(circle, getGraphics());
				remote.press(command);
			}
		});
		btnDraw.setBounds(28, 46, 118, 32);
		panel.add(btnDraw);
		
		JButton btnUndo = new JButton("Undo Previous Command");
		btnUndo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				remote.undo();
			}
		});
		btnUndo.setBounds(0, 293, 177, 32);
		panel.add(btnUndo);
		
		JButton btnRedo = new JButton("Redo Command");
		btnRedo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				remote.redo();
			}
		});
		btnRedo.setBounds(0, 362, 164, 32);
		panel.add(btnRedo);
		
		comboColor = new JComboBox();
		comboColor.setModel(new DefaultComboBoxModel(new String[] {"Change Color", "Black", "Red", "Green", "Blue", "Gray", "Cyan", "Magenta", "Orange"}));
		comboColor.setBounds(28, 103, 118, 32);
		comboColor.setSelectedIndex(0);
		comboColor.addActionListener((ActionListener) this);
		panel.add(comboColor);
		
		comboSize = new JComboBox();
		comboSize.setModel(new DefaultComboBoxModel(new String[] {"Change Size", "Large", "Small"}));
		comboSize.setBounds(28, 166, 118, 32);
		comboSize.setSelectedIndex(0);
		comboSize.addActionListener((ActionListener) this);
		panel.add(comboSize);
		
		comboPos = new JComboBox();
		comboPos.setModel(new DefaultComboBoxModel(new String[] {"Change Position", "Left", "Right", "Up", "Down"}));
		comboPos.setBounds(28, 230, 118, 32);
		comboPos.setSelectedIndex(0);
		comboPos.addActionListener((ActionListener) this);
		panel.add(comboPos);

	}
	
	public static void main(String[] args) {
	    JFrame.setDefaultLookAndFeelDecorated(true);
	    frame = new JFrame("Comman Pattern Test with Circle");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setBackground(Color.white);
	    frame.setSize(720, 530);
	 
	    CircleCommandTest panel = new CircleCommandTest();
	 
	    frame.getContentPane().add(panel);
	 
	    frame.setVisible(true);
	  }

	@Override
	public void actionPerformed(ActionEvent e) {
		Command command; 
		Circle circle;
		
		JComboBox cb = (JComboBox)e.getSource();
		if(cb == comboColor) {
			String color = (String) cb.getSelectedItem();
			this.color = remote.getCircle().color;
			
			if(color.equals("Black")) {
				this.color = Color.black;
			}
			else if(color.equals("Orange")) {
				this.color = Color.orange;
			}
			else if(color.equals("Red")) {
				this.color = Color.red;	
			}
			else if(color.equals("Green")) {
				this.color = Color.green;
			}
			else if(color.equals("Blue")) {
				this.color = Color.blue;
			}
			else if(color.equals("Gray")) {
				this.color = Color.gray;
			}
			else if(color.equals("Cyan")) {
				this.color = Color.cyan;
			}
			else if(color.equals("Magenta")) {
				this.color = Color.magenta;
			}
			X = remote.getCircle().x;
			Y = remote.getCircle().y;
			size = remote.getCircle().radius;
			circle = new Circle(X, Y, size, this.color);
			command = new ColorChangeCommand(circle, getGraphics());
			remote.press(command);
			//drawnList.add(command);
		}
		else if(cb == comboSize) {
			String size = (String) cb.getSelectedItem();
			this.size = remote.getCircle().radius;
			
			if(size.equals("Large")) {
				this.size += 10;
			}
			else if(size.equals("Small")) {
				this.size += -10;
			}
			X = remote.getCircle().x;
			Y = remote.getCircle().y;
			color = remote.getCircle().color;
			circle = new Circle(X, Y, this.size, color);
			command = new SizeChangeCommand(circle, getGraphics());

			remote.press(command);

		}
		else {
			String pos = (String) cb.getSelectedItem();
			X = remote.getCircle().x;
			Y = remote.getCircle().y;
			
			if(pos.equals("Left")) {
				X += -10;
			}
			else if(pos.equals("Right")) {
				X += 10;
			}
			else if(pos.equals("Up")) {
				Y += -10;
			}
			else if(pos.equals("Down")) {
				Y += 10;
			}
			color = remote.getCircle().color;
			size = remote.getCircle().radius;
			circle = new Circle(X, Y, size, color);
			command = new SizeChangeCommand(circle, getGraphics());

			remote.press(command);
		}
		
	}
}
