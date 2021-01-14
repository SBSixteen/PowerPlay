import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JInternalFrame;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import java.awt.Font;
import java.io.File;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class StatTrakIndie extends JFrame {
	
	int teamselection = -1;
	int playerselection =-1;
	StringLL[] mkeep = new StringLL[9];
	StringLL[] tkeep = new StringLL[9];
	int[] tsel = new int[9];
	int[] msel = new int[9];
	StringLL MATCH = new StringLL();
	String[] namekeeper = new String[9];

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StatTrakIndie frame = new StatTrakIndie();
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
	public StatTrakIndie() {
		setResizable(false);
		
		for(int i =0; i<9;i++) {
			mkeep[i] = new StringLL();
			tkeep[i] = new StringLL();
		}
		
		PlayerReader Preader = new PlayerReader();
		PlayerLL PLL = new PlayerLL();
		String[] Tlist = new File("C:\\PowerPlay\\Players\\").list();
		MatchLL MLL = new MatchLL();
		MatchReader Read = new MatchReader();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 736);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Team = new JLabel("Team");
		Team.setFont(new Font("Exo 2 Light", Font.PLAIN, 21));
		Team.setBounds(10, 11, 65, 28);
		contentPane.add(Team);
		
		JLabel lblPlayer = new JLabel("Player");
		lblPlayer.setFont(new Font("Exo 2 Light", Font.PLAIN, 21));
		lblPlayer.setBounds(10, 40, 65, 28);
		contentPane.add(lblPlayer);
		
		JComboBox team = new JComboBox();
		team.setFont(new Font("Exo 2 Light", Font.PLAIN, 16));
		team.setBounds(85, 15, 160, 22);
		contentPane.add(team);
		team.setModel(new DefaultComboBoxModel(Tlist));
		
		JComboBox player = new JComboBox();
		player.setFont(new Font("Exo 2 Light", Font.PLAIN, 16));
		player.setBounds(85, 46, 160, 22);
		contentPane.add(player);
		
		JLabel Metric = new JLabel("Metric");
		Metric.setFont(new Font("Exo 2 Light", Font.PLAIN, 21));
		Metric.setBounds(10, 72, 65, 28);
		contentPane.add(Metric);
		
		JComboBox type = new JComboBox();
		type.setModel(new DefaultComboBoxModel(new String[] {"Player Batting Form (Strike Rate)", "Player Batting Form (Fours)", "Player Batting Form (Sixes)", "Player Batting Form (Boundaries)", "Player Batsman Endurance (Balls Faced)", "Player Bowling Form (Economy)", "Player Bowling Form (Wickets)", "Player Bowling Form (Runs Conceded)", "Player Batting Form (Strike Rate) - Best Fit", "Player Batting Form (Fours) - Best Fit", "Player Batting Form (Sixes) - Best Fit", "Player Batting Form (Boundaries) - Best Fit", "Player Batsman Endurance (Balls Faced) - Best Fit", "Player Bowling Form (Economy) - Best Fit", "Player Bowling Form (Wickets) - Best Fit", "Player Bowling Form (Runs Conceded) - Best Fit"}));
		type.setFont(new Font("Exo 2 Light", Font.PLAIN, 14));
		type.setBounds(85, 76, 335, 28);
		contentPane.add(type);
		
		JComboBox t = new JComboBox();
		t.setFont(new Font("Exo 2 Light", Font.PLAIN, 16));
		t.setBounds(10, 111, 222, 22);
		contentPane.add(t);
		
		JPanel cp = new JPanel();
		cp.setBounds(255, 15, 79, 24);
		contentPane.add(cp);
		cp.setLayout(null);
		
		JLabel cl = new JLabel("Check");
		cl.setHorizontalAlignment(SwingConstants.CENTER);
		cl.setFont(new Font("Exo 2 Light", Font.PLAIN, 18));
		cl.setBounds(0, 0, 79, 24);
		cp.add(cl);
		
		JPanel cp_1 = new JPanel();
		cp_1.setLayout(null);
		cp_1.setBounds(255, 44, 79, 24);
		contentPane.add(cp_1);
		
		JLabel cl_1 = new JLabel("Check");
		cl_1.setHorizontalAlignment(SwingConstants.CENTER);
		cl_1.setFont(new Font("Exo 2 Light", Font.PLAIN, 18));
		cl_1.setBounds(0, 0, 79, 24);
		cp_1.add(cl_1);
		
		JPanel cp_2 = new JPanel();
		cp_2.setLayout(null);
		cp_2.setBounds(333, 44, 79, 24);
		contentPane.add(cp_2);
		
		JLabel clear = new JLabel("Clear");
		clear.setHorizontalAlignment(SwingConstants.CENTER);
		clear.setFont(new Font("Exo 2 Light", Font.PLAIN, 18));
		clear.setBounds(0, 0, 79, 24);
		cp_2.add(clear);
		
		JComboBox M = new JComboBox();
		M.setFont(new Font("Exo 2 Light", Font.PLAIN, 16));
		M.setBounds(10, 138, 410, 22);
		contentPane.add(M);
		
		JComboBox t_1 = new JComboBox();
		t_1.setFont(new Font("Exo 2 Light", Font.PLAIN, 16));
		t_1.setBounds(10, 171, 222, 22);
		contentPane.add(t_1);
		
		JComboBox M_1 = new JComboBox();
		M_1.setFont(new Font("Exo 2 Light", Font.PLAIN, 16));
		M_1.setBounds(10, 198, 410, 22);
		contentPane.add(M_1);
		
		JComboBox t_2 = new JComboBox();
		t_2.setFont(new Font("Exo 2 Light", Font.PLAIN, 16));
		t_2.setBounds(10, 231, 222, 22);
		contentPane.add(t_2);
		
		JComboBox M_2 = new JComboBox();
		M_2.setFont(new Font("Exo 2 Light", Font.PLAIN, 16));
		M_2.setBounds(10, 258, 410, 22);
		contentPane.add(M_2);
		
		JComboBox t_3 = new JComboBox();
		t_3.setFont(new Font("Exo 2 Light", Font.PLAIN, 16));
		t_3.setBounds(10, 291, 222, 22);
		contentPane.add(t_3);
		
		JComboBox M_3 = new JComboBox();
		M_3.setFont(new Font("Exo 2 Light", Font.PLAIN, 16));
		M_3.setBounds(10, 318, 410, 22);
		contentPane.add(M_3);
		
		JComboBox t_4 = new JComboBox();
		t_4.setFont(new Font("Exo 2 Light", Font.PLAIN, 16));
		t_4.setBounds(10, 351, 222, 22);
		contentPane.add(t_4);
		
		JComboBox M_4 = new JComboBox();
		M_4.setFont(new Font("Exo 2 Light", Font.PLAIN, 16));
		M_4.setBounds(10, 378, 410, 22);
		contentPane.add(M_4);
		
		JComboBox t_5 = new JComboBox();
		t_5.setFont(new Font("Exo 2 Light", Font.PLAIN, 16));
		t_5.setBounds(10, 411, 222, 22);
		contentPane.add(t_5);
		
		JComboBox M_5 = new JComboBox();
		M_5.setFont(new Font("Exo 2 Light", Font.PLAIN, 16));
		M_5.setBounds(10, 438, 410, 22);
		contentPane.add(M_5);
		
		JComboBox t_6 = new JComboBox();
		t_6.setFont(new Font("Exo 2 Light", Font.PLAIN, 16));
		t_6.setBounds(10, 471, 222, 22);
		contentPane.add(t_6);
		
		JComboBox M_6 = new JComboBox();
		M_6.setFont(new Font("Exo 2 Light", Font.PLAIN, 16));
		M_6.setBounds(10, 498, 410, 22);
		contentPane.add(M_6);
		
		JComboBox t_7 = new JComboBox();
		t_7.setFont(new Font("Exo 2 Light", Font.PLAIN, 16));
		t_7.setBounds(10, 531, 222, 22);
		contentPane.add(t_7);
		
		JComboBox M_7 = new JComboBox();
		M_7.setFont(new Font("Exo 2 Light", Font.PLAIN, 16));
		M_7.setBounds(10, 558, 410, 22);
		contentPane.add(M_7);
		
		JComboBox t_8 = new JComboBox();
		t_8.setFont(new Font("Exo 2 Light", Font.PLAIN, 16));
		t_8.setBounds(10, 591, 222, 22);
		contentPane.add(t_8);
		
		JComboBox M_8 = new JComboBox();
		M_8.setFont(new Font("Exo 2 Light", Font.PLAIN, 16));
		M_8.setBounds(10, 618, 410, 22);
		contentPane.add(M_8);
		
		JPanel dp = new JPanel();
		dp.setLayout(null);
		dp.setBackground(Color.WHITE);
		dp.setBounds(10, 651, 322, 39);
		contentPane.add(dp);
		
		JLabel draw = new JLabel("Draw");
		draw.setHorizontalAlignment(SwingConstants.CENTER);
		draw.setForeground(new Color(47, 79, 79));
		draw.setFont(new Font("Exo 2 Light", Font.PLAIN, 25));
		draw.setBounds(0, 0, 322, 39);
		dp.add(draw);
		
		JPanel tcheckp = new JPanel();
		tcheckp.setLayout(null);
		tcheckp.setBounds(242, 109, 79, 24);
		contentPane.add(tcheckp);
		
		JLabel tcheckb = new JLabel("Check");
		tcheckb.setHorizontalAlignment(SwingConstants.CENTER);
		tcheckb.setFont(new Font("Exo 2 Light", Font.PLAIN, 18));
		tcheckb.setBounds(0, 0, 79, 24);
		tcheckp.add(tcheckb);
		
		JPanel tcheckp_1 = new JPanel();
		tcheckp_1.setLayout(null);
		tcheckp_1.setBounds(242, 169, 79, 24);
		contentPane.add(tcheckp_1);
		
		JLabel tcheckb_1 = new JLabel("Check");
		tcheckb_1.setHorizontalAlignment(SwingConstants.CENTER);
		tcheckb_1.setFont(new Font("Exo 2 Light", Font.PLAIN, 18));
		tcheckb_1.setBounds(0, 0, 79, 24);
		tcheckp_1.add(tcheckb_1);
		
		JPanel tcheckp_2 = new JPanel();
		tcheckp_2.setLayout(null);
		tcheckp_2.setBounds(242, 229, 79, 24);
		contentPane.add(tcheckp_2);
		
		JLabel tcheckb_2 = new JLabel("Check");
		tcheckb_2.setHorizontalAlignment(SwingConstants.CENTER);
		tcheckb_2.setFont(new Font("Exo 2 Light", Font.PLAIN, 18));
		tcheckb_2.setBounds(0, 0, 79, 24);
		tcheckp_2.add(tcheckb_2);
		
		JPanel tcheckp_3 = new JPanel();
		tcheckp_3.setLayout(null);
		tcheckp_3.setBounds(242, 289, 79, 24);
		contentPane.add(tcheckp_3);
		
		JLabel tcheckb_3 = new JLabel("Check");
		tcheckb_3.setHorizontalAlignment(SwingConstants.CENTER);
		tcheckb_3.setFont(new Font("Exo 2 Light", Font.PLAIN, 18));
		tcheckb_3.setBounds(0, 0, 79, 24);
		tcheckp_3.add(tcheckb_3);
		
		JPanel tcheckp_4 = new JPanel();
		tcheckp_4.setLayout(null);
		tcheckp_4.setBounds(242, 349, 79, 24);
		contentPane.add(tcheckp_4);
		
		JLabel tcheckb_4 = new JLabel("Check");
		tcheckb_4.setHorizontalAlignment(SwingConstants.CENTER);
		tcheckb_4.setFont(new Font("Exo 2 Light", Font.PLAIN, 18));
		tcheckb_4.setBounds(0, 0, 79, 24);
		tcheckp_4.add(tcheckb_4);
		
		JPanel tcheckp_5 = new JPanel();
		tcheckp_5.setLayout(null);
		tcheckp_5.setBounds(242, 409, 79, 24);
		contentPane.add(tcheckp_5);
		
		JLabel tcheckb_5 = new JLabel("Check");
		tcheckb_5.setHorizontalAlignment(SwingConstants.CENTER);
		tcheckb_5.setFont(new Font("Exo 2 Light", Font.PLAIN, 18));
		tcheckb_5.setBounds(0, 0, 79, 24);
		tcheckp_5.add(tcheckb_5);
		
		JPanel tcheckp_6 = new JPanel();
		tcheckp_6.setLayout(null);
		tcheckp_6.setBounds(242, 469, 79, 24);
		contentPane.add(tcheckp_6);
		
		JLabel tcheckb_6 = new JLabel("Check");
		tcheckb_6.setHorizontalAlignment(SwingConstants.CENTER);
		tcheckb_6.setFont(new Font("Exo 2 Light", Font.PLAIN, 18));
		tcheckb_6.setBounds(0, 0, 79, 24);
		tcheckp_6.add(tcheckb_6);
		
		JPanel tcheckp_7 = new JPanel();
		tcheckp_7.setLayout(null);
		tcheckp_7.setBounds(242, 529, 79, 24);
		contentPane.add(tcheckp_7);
		
		JLabel tcheckb_7 = new JLabel("Check");
		tcheckb_7.setHorizontalAlignment(SwingConstants.CENTER);
		tcheckb_7.setFont(new Font("Exo 2 Light", Font.PLAIN, 18));
		tcheckb_7.setBounds(0, 0, 79, 24);
		tcheckp_7.add(tcheckb_7);
		
		JPanel tcheckp_8 = new JPanel();
		tcheckp_8.setLayout(null);
		tcheckp_8.setBounds(242, 589, 79, 24);
		contentPane.add(tcheckp_8);
		
		JLabel tcheckb_8 = new JLabel("Check");
		tcheckb_8.setHorizontalAlignment(SwingConstants.CENTER);
		tcheckb_8.setFont(new Font("Exo 2 Light", Font.PLAIN, 18));
		tcheckb_8.setBounds(0, 0, 79, 24);
		tcheckp_8.add(tcheckb_8);
		
		JLabel[] tcb = {tcheckb, tcheckb_1, tcheckb_2, tcheckb_3, tcheckb_4, tcheckb_5, tcheckb_6, tcheckb_7, tcheckb_8 };
		JPanel[] tcp = {tcheckp, tcheckp_1, tcheckp_2, tcheckp_3, tcheckp_4, tcheckp_5, tcheckp_6, tcheckp_7, tcheckp_8 };
		JComboBox[] tour = {t, t_1, t_2, t_3, t_4, t_5, t_6, t_7, t_8};
		JComboBox[] MM = {M, M_1, M_2, M_3, M_4, M_5, M_6, M_7, M_8 };
		
		tcb[0].addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseEntered(MouseEvent e) {
				tcp[0].setBackground(Color.BLACK);
				tcb[0].setForeground(Color.WHITE);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				tcp[0].setBackground(Color.WHITE);
				tcb[0].setForeground(Color.BLACK);
			}
					
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if(teamselection > -1 && playerselection>-1) {
			   mkeep[0].head = null;
				Player P = Preader.read((String)team.getItemAt(teamselection), (String)(player.getItemAt(playerselection)));
				String fp = "C:\\PowerPlay\\Tournament\\" + tour[0].getSelectedItem()+ "\\";
				System.out.println(fp);
				String[] insertion = (new File(fp).list());
				System.out.println(insertion[0]);
				MatchLL MList = new MatchLL();
				StringLL Mcombo = new StringLL();
		         
				for (int i = 0; i < insertion.length; i++) {
					System.out.println(insertion[i]);
				}
				
				for (int i = 0; i < insertion.length; i++) {
					
					Match X = Read.read(fp+insertion[i]);
						
						for (int k = 0; k < 11; k++) {
							
							if(X.teamA.equals(P.team) && X.A[k].equals(P.name)) {
                                 
								MList.insert(X);
								break;
								
							}else if(X.teamB.equals(P.team) && X.B[k].equals(P.name)) {
								MList.insert(X);
								break;
							}
							
						}
						
					
					
				 }
				
				for(int i =0; i<MList.length();i++) {
					Mcombo.insert(MList.search(i).date + " | " + MList.search(i).stage +" | " + MList.search(i).teamA + " vs. " + MList.search(i).teamB);
					mkeep[0].insert(MList.search(i).stage + ".txt");
				}
				
				String[] usage = new String[MList.length()];
				for (int i = 0; i < usage.length; i++) {
					usage[i] = Mcombo.search(i);
				}
				
				M.setModel(new DefaultComboBoxModel(usage));
				
				}
			}
		});
		
		tcb[1].addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseEntered(MouseEvent e) {
				tcp[1].setBackground(Color.BLACK);
				tcb[1].setForeground(Color.WHITE);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				tcp[1].setBackground(Color.WHITE);
				tcb[1].setForeground(Color.BLACK);
			}
					
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if(teamselection > -1 && playerselection>-1) {
					mkeep[1].head = null;
				Player P = Preader.read((String)team.getItemAt(teamselection), (String)(player.getItemAt(playerselection)));
				String fp = "C:\\PowerPlay\\Tournament\\" + tour[1].getSelectedItem()+ "\\";
				String[] insertion = (new File(fp).list());
				MatchLL MList = new MatchLL();
				StringLL Mcombo = new StringLL();

				for (int i = 0; i < insertion.length; i++) {
					
					Match X = Read.read(fp+insertion[i]);
						
						for (int k = 0; k < 11; k++) {
							
							if(X.teamA.equals(P.team) && X.A[k].equals(P.name)) {
                                 
								MList.insert(X);
								break;
								
							}else if(X.teamB.equals(P.team) && X.B[k].equals(P.name)) {
								MList.insert(X);
								break;
							}
							
						}
						
					
					
				 }
				
				for(int i =0; i<MList.length();i++) {
					Mcombo.insert(MList.search(i).date + " | " + MList.search(i).stage +" | " + MList.search(i).teamA + " vs. " + MList.search(i).teamB);
					mkeep[1].insert(MList.search(i).stage + ".txt");
				}
				
				String[] usage = new String[MList.length()];
				for (int i = 0; i < usage.length; i++) {
					usage[i] = Mcombo.search(i);
				}
				
				MM[1].setModel(new DefaultComboBoxModel(usage));
				tsel[1] = tour[1].getSelectedIndex();
				msel[1] = MM[1].getSelectedIndex();
				
				}
			}
		});
		tcb[2].addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseEntered(MouseEvent e) {
				tcp[2].setBackground(Color.BLACK);
				tcb[2].setForeground(Color.WHITE);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				tcp[2].setBackground(Color.WHITE);
				tcb[2].setForeground(Color.BLACK);
			}
					
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if(teamselection > -1 && playerselection>-1) {
					mkeep[2].head = null;
				Player P = Preader.read((String)team.getItemAt(teamselection), (String)(player.getItemAt(playerselection)));
				String fp = "C:\\PowerPlay\\Tournament\\" + tour[2].getSelectedItem()+ "\\";
				String[] insertion = (new File(fp).list());
				MatchLL MList = new MatchLL();
				StringLL Mcombo = new StringLL();

				for (int i = 0; i < insertion.length; i++) {
					
					Match X = Read.read(fp+insertion[i]);
						
						for (int k = 0; k < 11; k++) {
							
							if(X.teamA.equals(P.team) && X.A[k].equals(P.name)) {
                                 
								MList.insert(X);
								break;
								
							}else if(X.teamB.equals(P.team) && X.B[k].equals(P.name)) {
								MList.insert(X);
								break;
							}
							
						}
						
					
					
				 }
				
				for(int i =0; i<MList.length();i++) {
					Mcombo.insert(MList.search(i).date + " | " + MList.search(i).stage +" | " + MList.search(i).teamA + " vs. " + MList.search(i).teamB);
					mkeep[2].insert(MList.search(i).stage + ".txt");
				}
				
				String[] usage = new String[MList.length()];
				for (int i = 0; i < usage.length; i++) {
					usage[i] = Mcombo.search(i);
				}
				
				MM[2].setModel(new DefaultComboBoxModel(usage));

				
				}
			}
		});
		tcb[3].addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseEntered(MouseEvent e) {
				tcp[3].setBackground(Color.BLACK);
				tcb[3].setForeground(Color.WHITE);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				tcp[3].setBackground(Color.WHITE);
				tcb[3].setForeground(Color.BLACK);
			}
					
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if(teamselection > -1 && playerselection>-1) {
					
					tsel[3] = tour[3].getSelectedIndex();
					msel[3] = MM[3].getSelectedIndex();
					mkeep[3].head = null;
				Player P = Preader.read((String)team.getItemAt(teamselection), (String)(player.getItemAt(playerselection)));
				String fp = "C:\\PowerPlay\\Tournament\\" + tour[3].getSelectedItem()+ "\\";
				String[] insertion = (new File(fp).list());
				MatchLL MList = new MatchLL();
				StringLL Mcombo = new StringLL();
				
				for (int i = 0; i < insertion.length; i++) {
					
					Match X = Read.read(fp+insertion[i]);
						
						for (int k = 0; k < 11; k++) {
							
							if(X.teamA.equals(P.team) && X.A[k].equals(P.name)) {
                                 
								MList.insert(X);
								break;
								
							}else if(X.teamB.equals(P.team) && X.B[k].equals(P.name)) {
								MList.insert(X);
								break;
							}
							
						}
						
					
					
				 }
				
				for(int i =0; i<MList.length();i++) {
					Mcombo.insert(MList.search(i).date + " | " + MList.search(i).stage +" | " + MList.search(i).teamA + " vs. " + MList.search(i).teamB);
					mkeep[3].insert(MList.search(i).stage + ".txt");
				}
				
				String[] usage = new String[MList.length()];
				for (int i = 0; i < usage.length; i++) {
					usage[i] = Mcombo.search(i);
				}
				
				MM[3].setModel(new DefaultComboBoxModel(usage));
				
				}
			}
		});
		tcb[4].addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseEntered(MouseEvent e) {
				tcp[4].setBackground(Color.BLACK);
				tcb[4].setForeground(Color.WHITE);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				tcp[4].setBackground(Color.WHITE);
				tcb[4].setForeground(Color.BLACK);
			}
					
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if(teamselection > -1 && playerselection>-1) {
					
					tsel[4] = tour[4].getSelectedIndex();
					msel[4] = MM[4].getSelectedIndex();
					mkeep[4].head = null;
				Player P = Preader.read((String)team.getItemAt(teamselection), (String)(player.getItemAt(playerselection)));
				String fp = "C:\\PowerPlay\\Tournament\\" + tour[4].getSelectedItem()+ "\\";
				String[] insertion = (new File(fp).list());
				MatchLL MList = new MatchLL();
				StringLL Mcombo = new StringLL();
				
				for (int i = 0; i < insertion.length; i++) {
					
					Match X = Read.read(fp+insertion[i]);
						
						for (int k = 0; k < 11; k++) {
							
							if(X.teamA.equals(P.team) && X.A[k].equals(P.name)) {
                                 
								MList.insert(X);
								break;
								
							}else if(X.teamB.equals(P.team) && X.B[k].equals(P.name)) {
								MList.insert(X);
								break;
							}
							
						}
						
					
					
				 }
				
				for(int i =0; i<MList.length();i++) {
					Mcombo.insert(MList.search(i).date + " | " + MList.search(i).stage +" | " + MList.search(i).teamA + " vs. " + MList.search(i).teamB);
					mkeep[4].insert(MList.search(i).stage + ".txt");
				}
				
				String[] usage = new String[MList.length()];
				for (int i = 0; i < usage.length; i++) {
					usage[i] = Mcombo.search(i);
				}
				
				MM[4].setModel(new DefaultComboBoxModel(usage));
				
				}
			}
		});
		tcb[5].addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseEntered(MouseEvent e) {
				tcp[5].setBackground(Color.BLACK);
				tcb[5].setForeground(Color.WHITE);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				tcp[5].setBackground(Color.WHITE);
				tcb[5].setForeground(Color.BLACK);
			}
					
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if(teamselection > -1 && playerselection>-1) {
					
				tsel[5] = tour[5].getSelectedIndex();
				msel[5] = MM[5].getSelectedIndex();	
				mkeep[5].head = null;
				Player P = Preader.read((String)team.getItemAt(teamselection), (String)(player.getItemAt(playerselection)));
				String fp = "C:\\PowerPlay\\Tournament\\" + tour[5].getSelectedItem()+ "\\";
				String[] insertion = (new File(fp).list());;
				MatchLL MList = new MatchLL();
				StringLL Mcombo = new StringLL();
		         
				for (int i = 0; i < insertion.length; i++) {
					System.out.println(insertion[i]);
				}
				
				for (int i = 0; i < insertion.length; i++) {
					
					Match X = Read.read(fp+insertion[i]);
						
						for (int k = 0; k < 11; k++) {
							
							if(X.teamA.equals(P.team) && X.A[k].equals(P.name)) {
                                 
								MList.insert(X);
								break;
								
							}else if(X.teamB.equals(P.team) && X.B[k].equals(P.name)) {
								MList.insert(X);
								break;
							}
							
						}
						
					
					
				 }
				
				for(int i =0; i<MList.length();i++) {
					Mcombo.insert(MList.search(i).date + " | " + MList.search(i).stage +" | " + MList.search(i).teamA + " vs. " + MList.search(i).teamB);
					mkeep[5].insert(MList.search(i).stage + ".txt");
				}
				
				String[] usage = new String[MList.length()];
				for (int i = 0; i < usage.length; i++) {
					usage[i] = Mcombo.search(i);
				}
				
				MM[5].setModel(new DefaultComboBoxModel(usage));
				
				
				}
			}
		});
		tcb[6].addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseEntered(MouseEvent e) {
				tcp[6].setBackground(Color.BLACK);
				tcb[6].setForeground(Color.WHITE);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				tcp[6].setBackground(Color.WHITE);
				tcb[6].setForeground(Color.BLACK);
			}
					
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if(teamselection > -1 && playerselection>-1) {
					tsel[6] = tour[6].getSelectedIndex();
					msel[6] = MM[6].getSelectedIndex();
					mkeep[6].head = null;
				Player P = Preader.read((String)team.getItemAt(teamselection), (String)(player.getItemAt(playerselection)));
				String fp = "C:\\PowerPlay\\Tournament\\" + tour[6].getSelectedItem()+ "\\";
				String[] insertion = (new File(fp).list());
				MatchLL MList = new MatchLL();
				StringLL Mcombo = new StringLL();
		         
				for (int i = 0; i < insertion.length; i++) {
					System.out.println(insertion[i]);
				}
				
				for (int i = 0; i < insertion.length; i++) {
					
					Match X = Read.read(fp+insertion[i]);
						
						for (int k = 0; k < 11; k++) {
							
							if(X.teamA.equals(P.team) && X.A[k].equals(P.name)) {
                                 
								MList.insert(X);
								break;
								
							}else if(X.teamB.equals(P.team) && X.B[k].equals(P.name)) {
								MList.insert(X);
								break;
							}
							
						}
						
					
					
				 }
				
				for(int i =0; i<MList.length();i++) {
					Mcombo.insert(MList.search(i).date + " | " + MList.search(i).stage +" | " + MList.search(i).teamA + " vs. " + MList.search(i).teamB);
					mkeep[6].insert(MList.search(i).stage + ".txt");
				}
				
				String[] usage = new String[MList.length()];
				for (int i = 0; i < usage.length; i++) {
					usage[i] = Mcombo.search(i);
				}
				
				MM[6].setModel(new DefaultComboBoxModel(usage));
				
				}
			}
		});
		tcb[7].addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseEntered(MouseEvent e) {
				tcp[7].setBackground(Color.BLACK);
				tcb[7].setForeground(Color.WHITE);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				tcp[7].setBackground(Color.WHITE);
				tcb[7].setForeground(Color.BLACK);
			}
					
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if(teamselection > -1 && playerselection>-1) {
					mkeep[7].head = null;
					tsel[7] = tour[7].getSelectedIndex();
					msel[7] = MM[7].getSelectedIndex();	
				Player P = Preader.read((String)team.getItemAt(teamselection), (String)(player.getItemAt(playerselection)));
				String fp = "C:\\PowerPlay\\Tournament\\" + tour[7].getSelectedItem()+ "\\";
				String[] insertion = (new File(fp).list());
				MatchLL MList = new MatchLL();
				StringLL Mcombo = new StringLL();
				
				for (int i = 0; i < insertion.length; i++) {
					
					Match X = Read.read(fp+insertion[i]);
						
						for (int k = 0; k < 11; k++) {
							
							if(X.teamA.equals(P.team) && X.A[k].equals(P.name)) {
                                 
								MList.insert(X);
								break;
								
							}else if(X.teamB.equals(P.team) && X.B[k].equals(P.name)) {
								MList.insert(X);
								break;
							}
							
						}
						
					
					
				 }
				
				for(int i =0; i<MList.length();i++) {
					Mcombo.insert(MList.search(i).date + " | " + MList.search(i).stage +" | " + MList.search(i).teamA + " vs. " + MList.search(i).teamB);
					mkeep[7].insert(MList.search(i).stage + ".txt");
				}
				
				String[] usage = new String[MList.length()];
				for (int i = 0; i < usage.length; i++) {
					usage[i] = Mcombo.search(i);
				}
				
				MM[7].setModel(new DefaultComboBoxModel(usage));
				
				}
			}
		});
		tcb[8].addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseEntered(MouseEvent e) {
				tcp[8].setBackground(Color.BLACK);
				tcb[8].setForeground(Color.WHITE);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				tcp[8].setBackground(Color.WHITE);
				tcb[8].setForeground(Color.BLACK);
			}
					
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if(teamselection > -1 && playerselection>-1) {
					tsel[8] = tour[8].getSelectedIndex();
					msel[8] = MM[8].getSelectedIndex();
					mkeep[8].head = null;
					Player P = Preader.read((String)team.getItemAt(teamselection), (String)(player.getItemAt(playerselection)));
				String fp = "C:\\PowerPlay\\Tournament\\" + tour[8].getSelectedItem()+ "\\";
				String[] insertion = (new File(fp).list());
				MatchLL MList = new MatchLL();
				StringLL Mcombo = new StringLL();
				
				for (int i = 0; i < insertion.length; i++) {
					
					Match X = Read.read(fp+insertion[i]);
						
						for (int k = 0; k < 11; k++) {
							
							if(X.teamA.equals(P.team) && X.A[k].equals(P.name)) {
                                 
								MList.insert(X);
								break;
								
							}else if(X.teamB.equals(P.team) && X.B[k].equals(P.name)) {
								MList.insert(X);
								break;
							}
							
						}
						
					
					
				 }
				
			
				for(int i =0; i<MList.length();i++) {
					Mcombo.insert(MList.search(i).date + " | " + MList.search(i).stage +" | " + MList.search(i).teamA + " vs. " + MList.search(i).teamB);
					mkeep[8].insert(MList.search(i).stage + ".txt");
				}
				
				String[] usage = new String[MList.length()];
				for (int i = 0; i < usage.length; i++) {
					usage[i] = Mcombo.search(i);
				}
				
				MM[8].setModel(new DefaultComboBoxModel(usage));
				
				}
			}
		});
		
		cl.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
				PLL.head = null;
				String[] PList =  new File("C:\\PowerPlay\\Players\\"+ Tlist[team.getSelectedIndex()]).list(); 
				
				for(int i =0;i<PList.length;i++) {
					int index = PList[i].indexOf(".txt"); 
					PList[i] = PList[i].substring(0, index);
					PLL.insert(Preader.read(Tlist[team.getSelectedIndex()],PList[i]));	
					
				}
				
				for (int i = 0; i < 9; i++) {
					
					tour[i].setSelectedIndex(-1);
					MM[i].setSelectedIndex(-1);
					
				}
			
				player.setModel(new DefaultComboBoxModel(PList));
					
			}
		});
		
		
		cl_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				teamselection = team.getSelectedIndex();
				playerselection = player.getSelectedIndex();
				
				Player P =  Preader.read((String)team.getSelectedItem(),(String)player.getSelectedItem());
                StringLL T = new StringLL(); 
                
				
				String[] adr = (new File("C:\\PowerPlay\\Tournament\\").list());		
				
				for (int j = 0; j < adr.length; j++) {
					String[] adr_2 = new File("C:\\PowerPlay\\Tournament\\"+ adr[j]).list();
					
					for (int i = 0; i < adr_2.length; i++) {
						
						Match X = Read.read("C:\\PowerPlay\\Tournament\\"+adr[j]+"\\"+adr_2[i]);
						
						for (int k = 0; k < 11; k++) {
							
							if(X.teamA.equals(P.team) && X.A[k].equals(P.name)) {
                                 
								T.insert(adr[j]);
								break;
								
							}else if(X.teamB.equals(P.team) && X.B[k].equals(P.name)) {
								T.insert(adr[j]);
								break;
							}
							
						}				
					if(T.length()>j) {	
						break;
					}
					}
				}
				
			String[] use = new String[T.length()];	
			for(int i =0; i<T.length();i++) {
				use[i]=T.search(i);
			}
			
			for(int i =0; i<tour.length;i++) {
				tour[i].setModel(new DefaultComboBoxModel(use));
				for (int j = 0; j < use.length; j++) {
					tkeep[i].insert(use[j]);
				}
				
			}
			for (int i = 0; i < 9; i++) {
				
				tour[i].setSelectedIndex(-1);
				MM[i].setSelectedIndex(-1);
				
			}
				
			}
		});
		

		draw.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				draw.setForeground(Color.WHITE);
				dp.setBackground(new Color(49,79,79));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				draw.setForeground(new Color(49,79,79));
				dp.setBackground(Color.WHITE);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				
				int mode = type.getSelectedIndex() + 21;
				
				for (int i = 0; i < 9; i++) {
					tsel[i] = tour[i].getSelectedIndex();
					msel[i] = MM[i].getSelectedIndex();
					if(tsel[i] !=-1 || msel[i] != -1){
					System.out.println("C:\\PowerPlay\\Tournament\\" + tkeep[i].search(tsel[i])+"\\" + mkeep[i].search(msel[i]));
					System.out.println("--------------------------------------------------------------------------------------");
					}
					}
				
				
				
				Player G = Preader.read((String)team.getItemAt(teamselection), (String)player.getItemAt(playerselection));
				Grapher LetsPlotet = new Grapher(G, tsel, msel, tkeep, mkeep, mode);
				LetsPlotet.setVisible(true);
				
			}
		}); 
		
	}
}
