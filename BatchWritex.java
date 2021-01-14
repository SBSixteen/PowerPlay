import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.io.*;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.LineBorder;

import java.awt.Canvas;
import java.awt.Label;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class BatchWritex implements Serializable {

	private JFrame frmPowerplayDbStats;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BatchWritex window = new BatchWritex();
					window.frmPowerplayDbStats.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public BatchWritex() {
		initialize();
		start();
		
	}
	
	public void start() {
		frmPowerplayDbStats.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		
		Color RB = new Color(25,25,112);
		Color CR = new Color(220,20,60);
		
		String[] TList = (new File("C:\\PowerPlay\\Players\\").list());
		
		frmPowerplayDbStats = new JFrame();
		frmPowerplayDbStats.setAlwaysOnTop(true);
		frmPowerplayDbStats.setTitle("PowerPlay DB Stats v0.1");
		frmPowerplayDbStats.setResizable(false);
		frmPowerplayDbStats.getContentPane().setBackground(Color.WHITE);
		frmPowerplayDbStats.getContentPane().setLayout(null);
		
		JPanel updatep = new JPanel();
		updatep.setBackground(Color.WHITE);
		updatep.setBorder(null);
		updatep.setBounds(0, 0, 278, 86);
		frmPowerplayDbStats.getContentPane().add(updatep);
		updatep.setLayout(null);
		
		JLabel udb = new JLabel("Update DB");
		udb.setForeground(new Color(25, 25, 112));
		udb.setFont(new Font("Exo 2 Light", Font.PLAIN, 36));
		udb.setHorizontalAlignment(SwingConstants.CENTER);
		udb.setBounds(0, 0, 278, 86);
		updatep.add(udb);
		
		JPanel fetchp = new JPanel();
		fetchp.setLayout(null);
		fetchp.setBorder(null);
		fetchp.setBackground(Color.WHITE);
		fetchp.setBounds(0, 88, 278, 86);
		frmPowerplayDbStats.getContentPane().add(fetchp);
		
		JLabel fstats = new JLabel("Fetch Stats");

		fstats.setHorizontalAlignment(SwingConstants.CENTER);
		fstats.setForeground(new Color(25, 25, 112));
		fstats.setFont(new Font("Exo 2 Light", Font.PLAIN, 36));
		fstats.setBounds(0, 0, 278, 86);
		fetchp.add(fstats);
		
		JLabel lblDbStats = new JLabel("DB Stats");
		lblDbStats.setFont(new Font("Exo 2 Light", Font.PLAIN, 24));
		lblDbStats.setBounds(10, 185, 258, 34);
		frmPowerplayDbStats.getContentPane().add(lblDbStats);
		
		JLabel lblPlayers = new JLabel("Players");
		lblPlayers.setFont(new Font("Exo 2 Light", Font.PLAIN, 20));
		lblPlayers.setBounds(10, 238, 136, 24);
		frmPowerplayDbStats.getContentPane().add(lblPlayers);
		
		JLabel lblTeams = new JLabel("Teams");
		lblTeams.setFont(new Font("Exo 2 Light", Font.PLAIN, 20));
		lblTeams.setBounds(10, 273, 136, 24);
		frmPowerplayDbStats.getContentPane().add(lblTeams);
		
		JLabel lblMatches = new JLabel("Matches");
		lblMatches.setFont(new Font("Exo 2 Light", Font.PLAIN, 20));
		lblMatches.setBounds(10, 308, 136, 24);
		frmPowerplayDbStats.getContentPane().add(lblMatches);
		
		JLabel lblTournaments = new JLabel("Tournaments");
		lblTournaments.setFont(new Font("Exo 2 Light", Font.PLAIN, 20));
		lblTournaments.setBounds(10, 343, 136, 24);
		frmPowerplayDbStats.getContentPane().add(lblTournaments);
		
		Canvas canvas = new Canvas();
		canvas.setBackground(new Color(169, 169, 169));
		canvas.setForeground(new Color(128, 128, 128));
		canvas.setBounds(152, 238, 1, 130);
		frmPowerplayDbStats.getContentPane().add(canvas);
		
		JPanel exitp = new JPanel();
		exitp.setBackground(new Color(255, 255, 255));
		exitp.setBounds(0, 381, 215, 34);
		frmPowerplayDbStats.getContentPane().add(exitp);
		exitp.setLayout(null);
		
		JLabel exitb = new JLabel("x");
		exitb.setBounds(0, 0, 215, 32);
		exitp.add(exitb);
		exitb.setHorizontalAlignment(SwingConstants.CENTER);
		exitb.setFont(new Font("Exo 2 Light", Font.PLAIN, 30));
		exitb.setForeground(new Color(255, 0, 0));
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Exo 2 Light", Font.PLAIN, 20));
		lblNewLabel.setBounds(156, 238, 122, 24);
		frmPowerplayDbStats.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Exo 2 Light", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(156, 273, 122, 24);
		frmPowerplayDbStats.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Exo 2 Light", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(156, 308, 122, 24);
		frmPowerplayDbStats.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Exo 2 Light", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(156, 343, 122, 24);
		frmPowerplayDbStats.getContentPane().add(lblNewLabel_3);
		
		Canvas status = new Canvas();

		status.setBackground(CR);
		status.setBounds(215, 381, 63, 34);
		frmPowerplayDbStats.getContentPane().add(status);
		
		JLabel apphelper = new JLabel("-");
		apphelper.setForeground(Color.GRAY);
		apphelper.setFont(new Font("Exo 2 Light", Font.PLAIN, 12));
		apphelper.setBounds(10, 426, 258, 24);
		frmPowerplayDbStats.getContentPane().add(apphelper);
		
		fstats.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				int sump = 0;
				int summ = 0;
				int sumt = 0;
				int sumT = 0;
				
				String[] use = new File("C:\\PowerPlay\\Tournament").list();
				
				sumT = use.length;
				
				for(int i =0;i<use.length;i++) {
					
					String[] use_2 = new File("C:\\PowerPlay\\Tournament\\"+use[i]).list();
					summ = summ + use_2.length;
					
				}
				
				use = new File("C:\\PowerPlay\\Players").list();
				
				sumt = use.length;
				
				for(int i =0;i<use.length;i++) {
					
					String[] use_2 = new File("C:\\PowerPlay\\Players\\"+use[i]).list();
					sump = sump + use_2.length;
					
				}
		
				lblNewLabel.setText(Integer.toString(sump));
				lblNewLabel_1.setText(Integer.toString(sumt));
				lblNewLabel_2.setText(Integer.toString(summ));
				lblNewLabel_3.setText(Integer.toString(sumT));
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				
				fstats.setForeground(Color.WHITE);
				fetchp.setBackground(RB);
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				
				fstats.setForeground(RB);
				fetchp.setBackground(Color.WHITE);
				
			}
		});
		
		udb.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
             
				BatchWrite x = new BatchWrite();
				x.updatePlayerDB();
				status.setBackground(Color.green);
				exitb.setForeground(Color.green);
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				
				udb.setForeground(Color.WHITE);
				updatep.setBackground(RB);
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				
				udb.setForeground(RB);
				updatep.setBackground(Color.WHITE);
				
			}
		});
		
		exitb.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				if(status.getBackground() == CR ){
				exitb.setForeground(Color.WHITE);
				exitp.setBackground(CR);
				}else {
					exitb.setForeground(Color.WHITE);
					exitp.setBackground(Color.green);
				}
			}
			@Override
			public void mouseExited(MouseEvent e) {
				
			if(status.getBackground() != CR ){
				exitb.setForeground(Color.green);
				exitp.setBackground(Color.WHITE);
				}else {
					exitb.setForeground(CR);
					exitp.setBackground(Color.WHITE);
				}
				
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				
				frmPowerplayDbStats.dispose();
				
			}

		});
		
		status.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				if(status.getBackground() == CR) 
				apphelper.setText("Database not updated");
				else if(status.getBackground() == Color.green) {
			apphelper.setText("Database Updated!");
			}
			}
			@Override
			public void mouseExited(MouseEvent e) {
				apphelper.setText("-");
			}
		});
		
		frmPowerplayDbStats.setBounds(100, 100, 284, 458);
		frmPowerplayDbStats.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
}
