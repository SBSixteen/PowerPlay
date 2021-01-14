import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.text.DecimalFormat;

import javax.swing.SwingConstants;

public class wowboxes extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					wowboxes frame = new wowboxes();
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
	public wowboxes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(54, 64, 160, 64);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel real = new JLabel("000.0");
		real.setHorizontalAlignment(SwingConstants.CENTER);
		real.setForeground(Color.WHITE);
		real.setFont(new Font("Exo 2 Medium", Font.PLAIN, 49));
		real.setBounds(0, 0, 160, 64);
		panel.add(real);
		

		
		Thread creatives = new Thread(new Runnable(){
			
			@Override
			public void run() {
				boolean checker = true;
				double use = 144.56;
				int a = (int)(144.56*10);
			    
				double sum= 0;
				DecimalFormat x = new DecimalFormat("###.#");
				
				while(true) {
					if(sum<use) {
					sum = sum+0.2;
					real.setText(x.format(sum));
					
					if(sum>50.0) {
						panel.setBackground(Color.RED);
					}
					if(sum>80.0) {
						panel.setBackground(Color.YELLOW);
					}
					if(sum>110.0) {
						panel.setBackground(Color.GREEN);
					}
					if(sum>140.0) {
						panel.setBackground(Color.BLUE);
					}
					}else {
						sum = use;
					}
					
					try {
					Thread.sleep(1);
					}catch(Exception e){
						
					}
					
				}
				
			}
			
		});
		
		creatives.start();
	}
}
