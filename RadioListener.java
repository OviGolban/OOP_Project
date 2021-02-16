import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RadioListener implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Ati selectat:" + e.getActionCommand());
		
	}

}
