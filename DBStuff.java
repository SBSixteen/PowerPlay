import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class DBStuff extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DBStuff frame = new DBStuff();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public DBStuff() {
		setResizable(false);
		setTitle("PowerPlay Database Stuff");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 271, 188);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel MM = new JLabel("MatchMaker");
		MM.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				MM.setForeground(new Color(0,128,128));
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				MM.setForeground(Color.BLACK);		
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				MatchReaderx X = new MatchReaderx();
				String[] args = new String[1];
				X.main(args);
		
			}
		});
		MM.setHorizontalAlignment(SwingConstants.CENTER);
		MM.setFont(new Font("Exo 2 Medium", Font.PLAIN, 20));
		MM.setBounds(10, 11, 245, 47);
		contentPane.add(MM);
		
		JLabel PM = new JLabel("PlayerMaker");
		PM.setHorizontalAlignment(SwingConstants.CENTER);
		PM.setFont(new Font("Exo 2 Medium", Font.PLAIN, 20));
		PM.setBounds(10, 58, 245, 47);
		contentPane.add(PM);
		
		JLabel DBR = new JLabel("Database Refresher");
		DBR.setHorizontalAlignment(SwingConstants.CENTER);
		DBR.setFont(new Font("Exo 2 Medium", Font.PLAIN, 20));
		DBR.setBounds(10, 103, 245, 47);
		contentPane.add(DBR);
		
		PM.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				PM.setForeground(new Color(0,128,128));
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				PM.setForeground(Color.BLACK);		
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				PlayerReaderx X = new PlayerReaderx();
				String[] args = new String[1];
				X.main(args);
		
			}
		});
		
		DBR.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				DBR.setForeground(new Color(0,128,128));
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				DBR.setForeground(Color.BLACK);		
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				BatchWritex X = new BatchWritex();
		
			}
		});
	}

}
