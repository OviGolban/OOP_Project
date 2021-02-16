
import java.awt.Color;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.event.MenuEvent;

public class Refresh extends JFrame implements ActionListener {
	private JPanel panel;
	private Color color;
	
	public Refresh(JPanel panel,Color color) {
		this.panel = panel;
		this.color = color;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	
		panel.setBackground(color);
		
		
	}
}
