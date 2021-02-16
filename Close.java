import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class Close extends JFrame implements ActionListener{
	private JFrame frame;
	
	public Close() {
		this.frame = frame;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
		
	}

}
