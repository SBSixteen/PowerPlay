import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.Timer;

import java.awt.Font;

public class splash extends JFrame implements ActionListener {

	/**
	 * 
	 */
	JPanel panel = new JPanel();	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					splash frame = new splash();
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
	JLabel progress = new JLabel("0%");
	int sum =0;
	int x =1;
	Timer perform = new Timer(25,this);
	JLabel lblNewLabel = new JLabel("");
	JLabel ls = new JLabel("Now Loading");
	public void actionPerformed(ActionEvent e) {
		
		if(sum<100) {
        sum = sum + x;
        progress.setText(sum + "%");
    	panel.setBounds(10, 190, panel.getWidth()+3, 10);
    	
    	if(sum == 99) {
			ls.setText("Almost Done!");
    	}
		}else {
			try {
			Thread.sleep(1500);
			}catch(InterruptedException x){
			System.out.println("Something wrong nigg");
			}
			MainMenu start = new MainMenu();
	        start.setVisible(true);
	        perform.stop();
			dispose();
		}
		
	}
	
	public splash() {
		setTitle("PowerPlay Splash");
		setType(Type.UTILITY);
		setResizable(false);
        
        perform.start();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 300, 342, 250);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel.setBackground(Color.GREEN);
		panel.setBounds(10, 195, 4, 10);
		contentPane.add(panel);
		
	
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\label1.png"));
		lblNewLabel.setBounds(10, 11, 306, 74);
		contentPane.add(lblNewLabel);
		
		ls.setFont(new Font("Exo 2 Light", Font.PLAIN, 21));
		ls.setHorizontalAlignment(SwingConstants.CENTER);
		ls.setBounds(10, 93, 306, 42);
		contentPane.add(ls);
		progress.setHorizontalAlignment(SwingConstants.CENTER);
		progress.setVerticalAlignment(SwingConstants.TOP);
		progress.setFont(new Font("Exo 2 Light", Font.PLAIN, 50));
		
		progress.setBounds(10, 126, 306, 74);
		contentPane.add(progress);
		

	}
}
