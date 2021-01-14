import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.io.File;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JProgressBar;
import javax.swing.UIManager;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class StatTrakTeams extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StatTrakTeams frame = new StatTrakTeams();
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
	public StatTrakTeams() {
		setTitle("Team Graphs");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 320, 537);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Metric");
		lblNewLabel.setFont(new Font("Exo 2 Light", Font.PLAIN, 18));
		lblNewLabel.setBounds(10, 11, 124, 22);
		contentPane.add(lblNewLabel);
		
		JComboBox type = new JComboBox();
		type.setModel(new DefaultComboBoxModel(new String[] {"Average Team Runs Scored (Overs)", "Average Team Runs Scored (Matches)", "Average Team Balls Faced (Wickets)", "Average Team Balls Faced (Matches)", "Average Team Wickets Taken (Overs)", "Average Team Wickets Taken (Matches)", "Average Team Fours (Overs)", "Average Team Fours (Matches)", "Average Team Sixes (Overs)", "Average Team Sixes (Matches)", "Average Team Boundaries (Overs)", "Average Team Boundaries (Matches)"}));
		type.setFont(new Font("Exo 2 Light", Font.PLAIN, 14));
		type.setBounds(10, 37, 279, 25);
		contentPane.add(type);
		
		JLabel lblNewLabel_1 = new JLabel("Teams");
		lblNewLabel_1.setFont(new Font("Exo 2 Light", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(10, 73, 111, 30);
		contentPane.add(lblNewLabel_1);
		
		JComboBox T = new JComboBox();
		T.setBounds(10, 102, 141, 22);
		contentPane.add(T);
		
		JComboBox T_1 = new JComboBox();
		T_1.setBounds(10, 135, 141, 22);
		contentPane.add(T_1);
		
		JComboBox T_2 = new JComboBox();
		T_2.setBounds(10, 168, 141, 22);
		contentPane.add(T_2);
		
		JComboBox T_3 = new JComboBox();
		T_3.setBounds(10, 201, 141, 22);
		contentPane.add(T_3);
		
		JComboBox T_4 = new JComboBox();
		T_4.setBounds(10, 234, 141, 22);
		contentPane.add(T_4);
		
		JComboBox T_5 = new JComboBox();
		T_5.setBounds(10, 267, 141, 22);
		contentPane.add(T_5);
		
		JComboBox T_6 = new JComboBox();
		T_6.setBounds(10, 300, 141, 22);
		contentPane.add(T_6);
		
		JComboBox T_7 = new JComboBox();
		T_7.setBounds(10, 333, 141, 22);
		contentPane.add(T_7);
		
		JComboBox T_8 = new JComboBox();
		T_8.setBounds(10, 366, 141, 22);
		contentPane.add(T_8);
		
		JComboBox[] Teams = {T, T_1, T_2, T_3, T_4, T_5, T_6, T_7, T_8};
		
		String[] Tlist = new File("C:\\PowerPlay\\Players\\").list();
		
		for (int i = 0; i< Teams.length;i++) {	
			Teams[i].setModel(new DefaultComboBoxModel(Tlist));	
			Teams[i].setSelectedIndex(-1);
		}
		
		int count =0;
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setFont(new Font("Exo 2 Light", Font.BOLD, 14));
		progressBar.setStringPainted(true);
		progressBar.setValue(count);
		progressBar.setForeground(Color.BLACK);
		progressBar.setMaximum(9);
		progressBar.setBounds(10, 420, 279, 22);
		UIManager.put("progressBar.selectionForeground", Color.black);
		UIManager.put("progressBar.selectionBackground", Color.GREEN);
		contentPane.add(progressBar);
		
		JPanel cp = new JPanel();
		cp.setBackground(new Color(255, 255, 255));
		cp.setBounds(178, 102, 111, 22);
		contentPane.add(cp);
		cp.setLayout(null);
		
		JLabel cb = new JLabel("Clear");
		cb.setForeground(new Color(220, 20, 60));
		cb.setFont(new Font("Exo 2 Light", Font.PLAIN, 18));
		cb.setHorizontalAlignment(SwingConstants.CENTER);
		cb.setBounds(0, 0, 111, 22);
		cp.add(cb);
		
		JLabel lblNewLabel_1_1 = new JLabel("Resources Used");
		lblNewLabel_1_1.setForeground(new Color(128, 128, 128));
		lblNewLabel_1_1.setFont(new Font("Exo 2 Light", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(10, 399, 279, 22);
		contentPane.add(lblNewLabel_1_1);
		
		JPanel cp_1 = new JPanel();
		cp_1.setBackground(new Color(255, 255, 255));
		cp_1.setBounds(178, 135, 111, 22);
		contentPane.add(cp_1);
		cp_1.setLayout(null);
		
		JLabel cb_1 = new JLabel("Clear");
		cb_1.setHorizontalAlignment(SwingConstants.CENTER);
		cb_1.setForeground(new Color(220, 20, 60));
		cb_1.setFont(new Font("Exo 2 Light", Font.PLAIN, 18));
		cb_1.setBounds(0, 0, 111, 22);
		cp_1.add(cb_1);
		
		JPanel cp_2 = new JPanel();
		cp_2.setBackground(new Color(255, 255, 255));
		cp_2.setBounds(178, 168, 111, 22);
		contentPane.add(cp_2);
		cp_2.setLayout(null);
		
		JLabel cb_2 = new JLabel("Clear");
		cb_2.setHorizontalAlignment(SwingConstants.CENTER);
		cb_2.setForeground(new Color(220, 20, 60));
		cb_2.setFont(new Font("Exo 2 Light", Font.PLAIN, 18));
		cb_2.setBounds(0, 0, 111, 22);
		cp_2.add(cb_2);
		
		JPanel cp_3 = new JPanel();
		cp_3.setBackground(new Color(255, 255, 255));
		cp_3.setBounds(178, 201, 111, 22);
		contentPane.add(cp_3);
		cp_3.setLayout(null);
		
		JLabel cb_3 = new JLabel("Clear");
		cb_3.setHorizontalAlignment(SwingConstants.CENTER);
		cb_3.setForeground(new Color(220, 20, 60));
		cb_3.setFont(new Font("Exo 2 Light", Font.PLAIN, 18));
		cb_3.setBounds(0, 0, 111, 22);
		cp_3.add(cb_3);
		
		JPanel cp_4 = new JPanel();
		cp_4.setBackground(new Color(255, 255, 255));
		cp_4.setBounds(178, 234, 111, 22);
		contentPane.add(cp_4);
		cp_4.setLayout(null);
		
		JLabel cb_4 = new JLabel("Clear");
		cb_4.setHorizontalAlignment(SwingConstants.CENTER);
		cb_4.setForeground(new Color(220, 20, 60));
		cb_4.setFont(new Font("Exo 2 Light", Font.PLAIN, 18));
		cb_4.setBounds(0, 0, 111, 22);
		cp_4.add(cb_4);
		
		JPanel cp_5 = new JPanel();
		cp_5.setBackground(new Color(255, 255, 255));
		cp_5.setBounds(178, 267, 111, 22);
		contentPane.add(cp_5);
		cp_5.setLayout(null);
		
		JLabel cb_5 = new JLabel("Clear");
		cb_5.setHorizontalAlignment(SwingConstants.CENTER);
		cb_5.setForeground(new Color(220, 20, 60));
		cb_5.setFont(new Font("Exo 2 Light", Font.PLAIN, 18));
		cb_5.setBounds(0, 0, 111, 22);
		cp_5.add(cb_5);
		
		JPanel cp_6 = new JPanel();
		cp_6.setBackground(new Color(255, 255, 255));
		cp_6.setBounds(178, 300, 111, 22);
		contentPane.add(cp_6);
		cp_6.setLayout(null);
		
		JLabel cb_6 = new JLabel("Clear");
		cb_6.setHorizontalAlignment(SwingConstants.CENTER);
		cb_6.setForeground(new Color(220, 20, 60));
		cb_6.setFont(new Font("Exo 2 Light", Font.PLAIN, 18));
		cb_6.setBounds(0, 0, 111, 22);
		cp_6.add(cb_6);
		
		JPanel cp_7 = new JPanel();
		cp_7.setBackground(new Color(255, 255, 255));
		cp_7.setBounds(178, 333, 111, 22);
		contentPane.add(cp_7);
		cp_7.setLayout(null);
		
		JLabel cb_7 = new JLabel("Clear");
		cb_7.setHorizontalAlignment(SwingConstants.CENTER);
		cb_7.setForeground(new Color(220, 20, 60));
		cb_7.setFont(new Font("Exo 2 Light", Font.PLAIN, 18));
		cb_7.setBounds(0, 0, 111, 22);
		cp_7.add(cb_7);
		
		JPanel cp_8 = new JPanel();
		cp_8.setBackground(new Color(255, 255, 255));
		cp_8.setBounds(178, 366, 111, 22);
		contentPane.add(cp_8);
		cp_8.setLayout(null);
		
		JLabel cb_8 = new JLabel("Clear");
		cb_8.setHorizontalAlignment(SwingConstants.CENTER);
		cb_8.setForeground(new Color(220, 20, 60));
		cb_8.setFont(new Font("Exo 2 Light", Font.PLAIN, 18));
		cb_8.setBounds(0, 0, 111, 22);
		cp_8.add(cb_8);
		
		JPanel dp = new JPanel();
		dp.setBounds(10, 453, 185, 47);
		contentPane.add(dp);
		dp.setLayout(null);
		
		JLabel db = new JLabel("Draw");
		db.setForeground(new Color(47, 79, 79));
		db.setFont(new Font("Exo 2 Light", Font.PLAIN, 24));
		db.setHorizontalAlignment(SwingConstants.CENTER);
		db.setBounds(0, 0, 185, 47);
		dp.add(db);
		
		JPanel bp = new JPanel();
		bp.setBounds(205, 453, 84, 47);
		contentPane.add(bp);
		bp.setLayout(null);
		
		JLabel bb = new JLabel("Back");
		bb.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				bb.setForeground(Color.WHITE);
				bp.setBackground(new Color(220,20,60));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				
				bb.setForeground(new Color(220,20,60));
				bp.setBackground(Color.WHITE);
				
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				
				dispose();
				
			}
		});
		bb.setForeground(new Color(220, 20, 60));
		bb.setHorizontalAlignment(SwingConstants.CENTER);
		bb.setFont(new Font("Exo 2 Light", Font.PLAIN, 24));
		bb.setBounds(0, 0, 84, 47);
		bp.add(bb);
		
		JPanel[] panel = {cp, cp_1, cp_2, cp_3, cp_4, cp_5, cp_6, cp_7, cp_8 };
		JLabel[] labels = {cb,cb_1,cb_2,cb_3,cb_4,cb_5,cb_6,cb_7,cb_8};
		
		labels[0].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				panel[0].setBackground(new Color(220, 20, 60));
				labels[0].setForeground(Color.WHITE);
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel[0].setBackground(Color.WHITE);
				labels[0].setForeground(new Color(220, 20, 60));
			}
			@Override
			public void mouseClicked(MouseEvent e) {				

				Teams[0].setSelectedIndex(-1);
				
			}
		});
		labels[1].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				panel[1].setBackground(new Color(220, 20, 60));
				labels[1].setForeground(Color.WHITE);
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel[1].setBackground(Color.WHITE);
				labels[1].setForeground(new Color(220, 20, 60));
			}
			@Override
			public void mouseClicked(MouseEvent e) {				

				Teams[1].setSelectedIndex(-1);
				
			}
		});
		labels[2].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				panel[2].setBackground(new Color(220, 20, 60));
				labels[2].setForeground(Color.WHITE);
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel[2].setBackground(Color.WHITE);
				labels[2].setForeground(new Color(220, 20, 60));
			}
			@Override
			public void mouseClicked(MouseEvent e) {				

				Teams[2].setSelectedIndex(-1);
				
			}
		});
		labels[4].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				panel[4].setBackground(new Color(220, 20, 60));
				labels[4].setForeground(Color.WHITE);
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel[4].setBackground(Color.WHITE);
				labels[4].setForeground(new Color(220, 20, 60));
			}
			@Override
			public void mouseClicked(MouseEvent e) {				

				Teams[4].setSelectedIndex(-1);
				
			}
		});
		labels[5].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				panel[5].setBackground(new Color(220, 20, 60));
				labels[5].setForeground(Color.WHITE);
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel[5].setBackground(Color.WHITE);
				labels[5].setForeground(new Color(220, 20, 60));
			}
			@Override
			public void mouseClicked(MouseEvent e) {				

				Teams[5].setSelectedIndex(-1);
				
			}
		});
		labels[6].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				panel[6].setBackground(new Color(220, 20, 60));
				labels[6].setForeground(Color.WHITE);
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel[6].setBackground(Color.WHITE);
				labels[6].setForeground(new Color(220, 20, 60));
			}
			@Override
			public void mouseClicked(MouseEvent e) {				

				Teams[6].setSelectedIndex(-1);
				
			}
		});
		labels[7].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				panel[7].setBackground(new Color(220, 20, 60));
				labels[7].setForeground(Color.WHITE);
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel[7].setBackground(Color.WHITE);
				labels[7].setForeground(new Color(220, 20, 60));
			}
			@Override
			public void mouseClicked(MouseEvent e) {				

				Teams[7].setSelectedIndex(-1);
				
			}
		});
		labels[8].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				panel[8].setBackground(new Color(220, 20, 60));
				labels[8].setForeground(Color.WHITE);
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel[8].setBackground(Color.WHITE);
				labels[8].setForeground(new Color(220, 20, 60));
			}
			@Override
			public void mouseClicked(MouseEvent e) {				

				Teams[8].setSelectedIndex(-1);
				
			}
		});
		labels[3].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				panel[3].setBackground(new Color(220, 20, 60));
				labels[3].setForeground(Color.WHITE);
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel[3].setBackground(Color.WHITE);
				labels[3].setForeground(new Color(220, 20, 60));
			}
			@Override
			public void mouseClicked(MouseEvent e) {				

				Teams[3].setSelectedIndex(-1);
				
			}
		});
		
		Thread pg = new Thread(){
			public void run() {
				
				while(true) {
					int c = 0;
					for (int i = 0; i < Teams.length; i++) {
					  if(Teams[i].getSelectedIndex()>-1) {
						  c++;
					  }
					}
					progressBar.setValue(c);
					c=0;					
				}
			
			}};
			
			pg.start();
			
			db.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent e) 
				{
					db.setForeground(Color.WHITE);
					dp.setBackground(new Color(47, 79, 79));
				}
				@Override
				public void mouseExited(MouseEvent e) {
					
					dp.setBackground(Color.WHITE);
					db.setForeground(new Color(47, 79, 79));
					
				}
				@Override
				public void mouseClicked(MouseEvent e) {
					
					int count = 0;
					
					for (int i = 0; i < Teams.length; i++) {
						if(Teams[i].getSelectedIndex()>-1) {
							count++;
						}
					}
					String[] List = new String[count];
					int placer = 0;
					
					for (int i = 0; i < Teams.length; i++) {
                     
						if(Teams[i].getSelectedIndex()>-1) {
						List[placer] =(String)Teams[i].getSelectedItem();
						placer++;
						}
					}
					
					int mode = 8 + type.getSelectedIndex();
					
					Grapher LetsPlotEt = new Grapher(List, mode);
					LetsPlotEt.setVisible(true);
					
				}
			});
			
		
	}
}

