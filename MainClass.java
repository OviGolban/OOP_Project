import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JRadioButton;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToggleButton;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Chestionar auto");
		frame.setSize(700, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		//panel.setLayout(new FlowLayout());
		panel.setLayout(new GridLayout(27,1));
		//panel.setLayout(null);
		panel.setBackground(Color.CYAN);
		
		
		/*JScrollBar s = new JScrollBar(JScrollBar.VERTICAL);
		s.setBounds(0, 0, 30, 100);
		panel.add(s);
		s.addAdjustmentListener(new AjustareAscultator());*/
		
		//Intrebarea 1
		JLabel lb1 = new JLabel("Intrebarea 1:Cum veti proceda la schimbarea directiei de mers spre dreapta?");
		ImageIcon photo1 = new ImageIcon("photo1.png");
		JLabel lb2 = new JLabel();
		lb2.setIcon(photo1);
		JRadioButton r1 = new JRadioButton("A.semnalizati schimbarea directiei de mers;pietonii va vor acorda prioritate");
		JRadioButton r2 = new JRadioButton("B.semanlizati schimbarea directiei de mers;acordati prioritate vehiculelor care circula din partea stanga");
		JRadioButton r3 = new JRadioButton("C.Semnalizati schimbarea directiei de mers si acordati prioritate.");
		ButtonGroup bg = new ButtonGroup();
		bg.add(r1);bg.add(r2);bg.add(r3);
		
	
		//System.out.println(r1.getAction());
		
		//Intrebarea 2
		JLabel lb3 = new JLabel("Intrebarea 2:Ce tendinta prezinta un autoturism cu tractiune pe spate, daca accelerati prea puternic in curba?");
		JRadioButton r4 = new JRadioButton("A.autoturismul urmeaza ,fara deviere, cursa volanului");
		JRadioButton r5 = new JRadioButton("B.autoturismul tinde sa derapeze cu spatele spre exteriorul curbei");
		JRadioButton r6 = new JRadioButton("C.rotile din fata se invartesc in gol");
		ButtonGroup bg2 = new ButtonGroup();
		bg2.add(r4);bg2.add(r5);bg2.add(r6);
		
		//Intrebarea 3
		JLabel lb4 = new JLabel("Intrebarea 3:Ce se intelege prin conducerea ecologica a unui auovehicul?");
		JRadioButton r7 = new JRadioButton("A.obligatia de a folosi in permanenta carburant biodegradabil");
		JRadioButton r8 = new JRadioButton("B.deplasari urbane cu bicicleta, pe jos sau cu late mijloace care nu polueaza atmosfera");
		JRadioButton r9 = new JRadioButton("C.un ansamblu de masuri comportamentale, de control sau de verificare a vehiculului, prin care se realizeaza o importanta economie de energie si de protectie a mediului.");
		ButtonGroup bg3 = new ButtonGroup();
		bg3.add(r7);bg3.add(r8);bg3.add(r9);
		
		//Intrebarea 4
		JLabel lb5 = new JLabel("Intrebarea 4:Ce semnificatie are indicatorul din imagine?");
		ImageIcon photo2 = new ImageIcon("photo2.png");
		JLabel lb6 = new JLabel();
		lb6.setIcon(photo2);
		JRadioButton ra = new JRadioButton("A.urmeaza un sector de drum ingustat temporar");
		JRadioButton rb = new JRadioButton("B.este interzisa schimbarea directiei de mers la dreapta in prima intersectie");
		JRadioButton rc = new JRadioButton("C.urmeaza o intersectie cu un drum fara prioritate");
		ButtonGroup bg4 = new ButtonGroup();
		bg4.add(ra);bg4.add(rb);bg4.add(rc);
		
		//Intrebarea 5
		JLabel lb7 = new JLabel("Intrebarea 5:Cand masurati presiunea din pneuri:");
		JRadioButton rd = new JRadioButton("A.Inaintea plecarii in cursa, cand prenurile sunt reci");
		JRadioButton re = new JRadioButton("B.Dupa parcurgerea a cel putin 400-500 de km, cand pneurile sunt calde");
		JRadioButton rf = new JRadioButton("C.Doar atunci cand obsercam ca autovehiculul este inclinat intr-o parte");
		ButtonGroup bg5 = new ButtonGroup();
		bg5.add(rd);bg5.add(re);bg5.add(rf);
		
		
		
		
		JMenuBar mb = new JMenuBar();
		JMenuItem refresh = new JMenuItem("Refresh");
		//refresh.setMnemonic(KeyEvent.VK_N);
		//refresh.setActionCommand("Refresh");
		
		Random r = new Random();
		refresh.addActionListener(new Refresh(panel, new Color(r.nextInt(256), r.nextInt(256), r.nextInt(256) )));
		
		JMenuItem clear = new JMenuItem("Clear");
		clear.addActionListener(new Clear(bg));
		clear.addActionListener(new Clear(bg2));
		clear.addActionListener(new Clear(bg3));
		clear.addActionListener(new Clear(bg4));
		clear.addActionListener(new Clear(bg5));
		
		
		JMenuItem close = new JMenuItem("Close");
		close.addActionListener(new Close());
		
		JMenu menu = new JMenu("Menu");
		menu.add(refresh);
		menu.add(clear);
		menu.add(close);
		
		mb.add(menu);
		frame.setJMenuBar(mb);
		
		r1.setBackground(Color.MAGENTA);r2.setBackground(Color.orange);r3.setBackground(Color.GREEN);
		r4.setBackground(Color.MAGENTA);r5.setBackground(Color.orange);r6.setBackground(Color.GREEN);
		r7.setBackground(Color.MAGENTA);r8.setBackground(Color.orange);r9.setBackground(Color.GREEN);
		ra.setBackground(Color.MAGENTA);rb.setBackground(Color.orange);rc.setBackground(Color.GREEN);
		rd.setBackground(Color.MAGENTA);re.setBackground(Color.orange);rf.setBackground(Color.GREEN);
		
		panel.add(lb1);panel.add(lb2);panel.add(r1);panel.add(r2);panel.add(r3);
		
		panel.add(lb3);panel.add(r4);panel.add(r5);panel.add(r6);
		
		panel.add(lb4);panel.add(r7);panel.add(r8);panel.add(r9);
		
		panel.add(lb5);panel.add(lb6);panel.add(ra);panel.add(rb);panel.add(rc);
		
		panel.add(lb7);panel.add(rd);panel.add(re);panel.add(rf);
		
		RadioListener listener = new RadioListener();
		r1.addActionListener(listener);r2.addActionListener(listener);r3.addActionListener(listener);
		r4.addActionListener(listener);r5.addActionListener(listener);r6.addActionListener(listener);
		r7.addActionListener(listener);ra.addActionListener(listener);rb.addActionListener(listener);
		rc.addActionListener(listener);rd.addActionListener(listener);re.addActionListener(listener);
		
		JButton submit = new JButton("Submit");
		submit.setSize(30, 30);
		panel.add(submit);
		
		JTextField rezultat = new JTextField("Rezultat:");
		panel.add(rezultat);
		
		
		
		//JTextArea area = new JTextArea(panel);
		JScrollPane scrollPane = new JScrollPane(panel);
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		
		
		//scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		//scrollPane.setSize(450, 450);
		
		//JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, panel1, panel2);
		
	
		
		//submit.addActionListener(new ButtonListener(rezultat, count));
		submit.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
			int count = 0;
				if(r3.isSelected()) {
					count++;
				}
				if(r5.isSelected()) {
					count++;
				}
				if(r9.isSelected()) {
					count++;
				}
				if(rc.isSelected()) {
					count++; 
				}
				if(rd.isSelected()) {
					count++;
				}
				if(count > 3) 
				{
					rezultat.setBackground(Color.green);
					rezultat.setText("Ati raspuns la " + count + " intrebari");
				}
				else
				{
					rezultat.setBackground(Color.red);
					rezultat.setText("Ati raspuns la " + count + " intrebari\n Spor la munca!");
				}
			}
		}
				);
		
		
		
		frame.setContentPane(scrollPane);
		frame.setVisible(true);

	}

}
