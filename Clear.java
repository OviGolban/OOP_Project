import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;

public class Clear implements ActionListener {
	private ButtonGroup group;
	
	public Clear(ButtonGroup group) {
		this.group = group;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		group.clearSelection();
		
	}
	

}
