import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.io.*;
import java.text.DecimalFormat;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import java.awt.Canvas;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.EtchedBorder;
import javax.swing.JTextField;

public class PlayerReaderx implements Serializable {

	private JFrame frmPowerplayPlayerEditor;
	private JTextField info_4;
	private JTextField info_5;
	private JTextField info_6;
	private JTextField info;
	private JTextField info_1;
	private JTextField info_2;
	private JTextField info_3;
	private JTextField info_7;
	private JTextField info_8;
	private JTextField info_9;
	private JTextField info_10;
	private JTextField info_11;
	private JTextField info_12;
	private JTextField info_13;
	private JTextField info_14;
	private JTextField role;
	private JTextField info_10_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PlayerReaderx window = new PlayerReaderx();
					window.frmPowerplayPlayerEditor.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PlayerReaderx() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		PlayerReader Preader = new PlayerReader();
		PlayerLL LL = new PlayerLL();
		String[] Tlist = new File("C:\\PowerPlay\\Players\\").list();
		
		
		JLabel apphelper = new JLabel("-");
		apphelper.setFont(new Font("Exo 2 Light", Font.PLAIN, 16));
		apphelper.setBounds(10, 273, 256, 28);
		
		frmPowerplayPlayerEditor = new JFrame();
		frmPowerplayPlayerEditor.getContentPane().setBackground(Color.WHITE);
		frmPowerplayPlayerEditor.getContentPane().setLayout(null);
		
		JLabel PlayerPic = new JLabel("");
		PlayerPic.setVerticalAlignment(SwingConstants.TOP);
		PlayerPic.setHorizontalAlignment(SwingConstants.CENTER);
		PlayerPic.setBounds(10, 11, 249, 249);
		frmPowerplayPlayerEditor.getContentPane().add(PlayerPic);
		
		Canvas canvas = new Canvas();
		canvas.setBackground(Color.GRAY);
		canvas.setBounds(265, 11, 1, 249);
		frmPowerplayPlayerEditor.getContentPane().add(canvas);
		
		JPanel panel = new JPanel();
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 0, 0), Color.DARK_GRAY));
		panel.setBackground(Color.WHITE);
		panel.setBounds(706, -13, 229, 82);
		frmPowerplayPlayerEditor.getContentPane().add(panel);
		panel.setLayout(null);
		
		JComboBox psel = new JComboBox();
		psel.setBounds(5, 53, 140, 22);
		panel.add(psel);
		psel.setFont(new Font("Exo 2 Light", Font.PLAIN, 14));
		
		JComboBox tsel = new JComboBox();
		tsel.setBounds(5, 20, 140, 22);
		panel.add(tsel);
		tsel.setFont(new Font("Exo 2 Light", Font.PLAIN, 14));
		tsel.setModel(new DefaultComboBoxModel(Tlist));
		
		JPanel checkp = new JPanel();
		checkp.setBackground(Color.WHITE);
		checkp.setBounds(145, 20, 68, 22);
		panel.add(checkp);
		checkp.setLayout(null);
		
		JLabel checkb = new JLabel("Check");
		checkb.setBounds(0, 0, 68, 22);
		checkp.add(checkb);
		checkb.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				LL.head = null;
				String[] PList =  new File("C:\\PowerPlay\\Players\\"+ Tlist[tsel.getSelectedIndex()]).list(); 
				
				for(int i =0;i<PList.length;i++) {
					int index = PList[i].indexOf(".txt"); 
					PList[i] = PList[i].substring(0, index);
					LL.insert(Preader.read(Tlist[tsel.getSelectedIndex()],PList[i]));	
					
				}
			
				psel.setModel(new DefaultComboBoxModel(PList));
				
			}			@Override
			public void mouseEntered(MouseEvent e) {
				checkp.setBackground(Color.BLACK);
				checkb.setForeground(Color.WHITE);
			}		@Override
			public void mouseExited(MouseEvent e) {
				checkp.setBackground(Color.WHITE);
				checkb.setForeground(Color.BLACK);
			}
});
		checkb.setHorizontalAlignment(SwingConstants.CENTER);
		checkb.setFont(new Font("Exo 2 Light", Font.PLAIN, 15));
		
		JPanel ImportP = new JPanel();
		ImportP.setBackground(Color.WHITE);
		ImportP.setBounds(145, 53, 68, 22);
		panel.add(ImportP);
		ImportP.setLayout(null);
		
		JLabel importb = new JLabel("Import");
		importb.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Player A = LL.search(psel.getSelectedIndex());

				    if(new File("C:\\PowerPlay\\Labels\\Players_Big\\"+A.team+"\\"+A.name+".png").exists()) {
				    	PlayerPic.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Players_Big\\"+A.team+"\\"+A.name+".png"));
				    }else {
				    	PlayerPic.setIcon( null);
				    	PlayerPic.setText("Player Picture Not Found!");
				    }
							
				info.setText(Integer.toString(A.truns));
				info_1.setText(Integer.toString(A.tballs));
				info_2.setText(Integer.toString(A.fours));
				info_3.setText(Integer.toString(A.sixes));
				info_4.setText(A.name);
				info_5.setText(Integer.toString(A.age));
				info_6.setText(A.team);
				info_7.setText(Integer.toString(A.tbballs));
				info_8.setText(Integer.toString(A.twickets));
				info_10.setText(Integer.toString(A.noballs));
				info_10_1.setText(""+A.wides);
				info_9.setText(Integer.toString(A.bruns));
				
				Double S = new Double(A.truns);
				Double R = new Double(A.tballs);
				double SR = (S/R)*100;
				
				Double BB = new Double(A.tbballs);
				Double CC = new Double(A.bruns);
				A.economy = (CC/BB)*6;
				
				info_11.setText(new DecimalFormat("###.##").format(SR));
				info_12.setText((new DecimalFormat("###.##").format(A.economy)));
				info_13.setText(Integer.toString(A.maxwickets));
				info_14.setText(Integer.toString(A.maxruns));
				role.setText(A.role);
				
			}			@Override
			public void mouseEntered(MouseEvent e) {
				ImportP.setBackground(Color.BLACK);
				importb.setForeground(Color.WHITE);
			}		@Override
			public void mouseExited(MouseEvent e) {
				ImportP.setBackground(Color.WHITE);
				importb.setForeground(Color.BLACK);
			}
		});
		importb.setBounds(0, 0, 68, 22);
		ImportP.add(importb);
		importb.setHorizontalAlignment(SwingConstants.CENTER);
		importb.setFont(new Font("Exo 2 Light", Font.PLAIN, 15));
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Exo 2 Light", Font.PLAIN, 18));
		lblNewLabel.setBounds(281, 11, 60, 24);
		frmPowerplayPlayerEditor.getContentPane().add(lblNewLabel);
		
		JLabel lblTeam = new JLabel("Team");
		lblTeam.setHorizontalAlignment(SwingConstants.CENTER);
		lblTeam.setFont(new Font("Exo 2 Light", Font.PLAIN, 18));
		lblTeam.setBounds(411, 45, 83, 24);
		frmPowerplayPlayerEditor.getContentPane().add(lblTeam);
		
		JLabel lblAge = new JLabel("Age");
		lblAge.setHorizontalAlignment(SwingConstants.CENTER);
		lblAge.setFont(new Font("Exo 2 Light", Font.PLAIN, 18));
		lblAge.setBounds(291, 46, 46, 24);
		frmPowerplayPlayerEditor.getContentPane().add(lblAge);
		
		info_4 = new JTextField();
		info_4.setFont(new Font("Exo 2 Light", Font.PLAIN, 16));
		info_4.setBounds(341, 11, 323, 24);
		frmPowerplayPlayerEditor.getContentPane().add(info_4);
		info_4.setColumns(10);
		
		info_5 = new JTextField();
		info_5.setFont(new Font("Exo 2 Light", Font.PLAIN, 16));
		info_5.setColumns(10);
		info_5.setBounds(341, 45, 60, 24);
		frmPowerplayPlayerEditor.getContentPane().add(info_5);
		
		info_6 = new JTextField();
		info_6.setFont(new Font("Exo 2 Light", Font.PLAIN, 16));
		info_6.setColumns(10);
		info_6.setBounds(504, 45, 160, 24);
		frmPowerplayPlayerEditor.getContentPane().add(info_6);
		
		JLabel lblBatting = new JLabel("Batting");
		lblBatting.setForeground(Color.GRAY);
		lblBatting.setHorizontalAlignment(SwingConstants.CENTER);
		lblBatting.setFont(new Font("Exo 2 Light", Font.PLAIN, 18));
		lblBatting.setBounds(333, 99, 106, 24);
		frmPowerplayPlayerEditor.getContentPane().add(lblBatting);
		
		JLabel lblTotalRuns = new JLabel("Total Runs");
		lblTotalRuns.setHorizontalAlignment(SwingConstants.CENTER);
		lblTotalRuns.setFont(new Font("Exo 2 Light", Font.PLAIN, 18));
		lblTotalRuns.setBounds(269, 128, 110, 24);
		frmPowerplayPlayerEditor.getContentPane().add(lblTotalRuns);
		
		JLabel lblBallsFaced = new JLabel("Balls Faced");
		lblBallsFaced.setHorizontalAlignment(SwingConstants.CENTER);
		lblBallsFaced.setFont(new Font("Exo 2 Light", Font.PLAIN, 18));
		lblBallsFaced.setBounds(269, 163, 110, 24);
		frmPowerplayPlayerEditor.getContentPane().add(lblBallsFaced);
		
		JLabel lblFours = new JLabel("Fours");
		lblFours.setHorizontalAlignment(SwingConstants.CENTER);
		lblFours.setFont(new Font("Exo 2 Light", Font.PLAIN, 18));
		lblFours.setBounds(269, 198, 110, 24);
		frmPowerplayPlayerEditor.getContentPane().add(lblFours);
		
		JLabel lblSixes = new JLabel("Sixes");
		lblSixes.setHorizontalAlignment(SwingConstants.CENTER);
		lblSixes.setFont(new Font("Exo 2 Light", Font.PLAIN, 18));
		lblSixes.setBounds(269, 233, 110, 24);
		frmPowerplayPlayerEditor.getContentPane().add(lblSixes);
		
		Canvas canvas_1 = new Canvas();
		canvas_1.setBackground(Color.LIGHT_GRAY);
		canvas_1.setBounds(385, 129, 1, 132);
		frmPowerplayPlayerEditor.getContentPane().add(canvas_1);
		
		info = new JTextField();
		info.setText("0");
		info.setHorizontalAlignment(SwingConstants.CENTER);
		info.setFont(new Font("Exo 2 Light", Font.PLAIN, 16));
		info.setBounds(400, 130, 60, 24);
		frmPowerplayPlayerEditor.getContentPane().add(info);
		info.setColumns(10);
		
		info_1 = new JTextField();
		info_1.setText("0");
		info_1.setHorizontalAlignment(SwingConstants.CENTER);
		info_1.setFont(new Font("Exo 2 Light", Font.PLAIN, 16));
		info_1.setColumns(10);
		info_1.setBounds(400, 163, 60, 24);
		frmPowerplayPlayerEditor.getContentPane().add(info_1);
		
		info_2 = new JTextField();
		info_2.setText("0");
		info_2.setHorizontalAlignment(SwingConstants.CENTER);
		info_2.setFont(new Font("Exo 2 Light", Font.PLAIN, 16));
		info_2.setColumns(10);
		info_2.setBounds(400, 198, 60, 24);
		frmPowerplayPlayerEditor.getContentPane().add(info_2);
		
		info_3 = new JTextField();
		info_3.setText("0");
		info_3.setHorizontalAlignment(SwingConstants.CENTER);
		info_3.setFont(new Font("Exo 2 Light", Font.PLAIN, 16));
		info_3.setColumns(10);
		info_3.setBounds(400, 233, 60, 24);
		frmPowerplayPlayerEditor.getContentPane().add(info_3);
		
		Canvas canvas_1_1 = new Canvas();
		canvas_1_1.setBackground(Color.BLACK);
		canvas_1_1.setBounds(470, 128, 1, 132);
		frmPowerplayPlayerEditor.getContentPane().add(canvas_1_1);
		
		JLabel lblBallsBowled = new JLabel("Balls Bowled");
		lblBallsBowled.setHorizontalAlignment(SwingConstants.CENTER);
		lblBallsBowled.setFont(new Font("Exo 2 Light", Font.PLAIN, 18));
		lblBallsBowled.setBounds(485, 128, 110, 24);
		frmPowerplayPlayerEditor.getContentPane().add(lblBallsBowled);
		
		JLabel lblWickets = new JLabel("Wickets");
		lblWickets.setHorizontalAlignment(SwingConstants.CENTER);
		lblWickets.setFont(new Font("Exo 2 Light", Font.PLAIN, 18));
		lblWickets.setBounds(485, 163, 110, 24);
		frmPowerplayPlayerEditor.getContentPane().add(lblWickets);
		
		JLabel lblBestFigures = new JLabel("Runs Conceded");
		lblBestFigures.setHorizontalAlignment(SwingConstants.CENTER);
		lblBestFigures.setFont(new Font("Exo 2 Light", Font.PLAIN, 15));
		lblBestFigures.setBounds(485, 198, 110, 24);
		frmPowerplayPlayerEditor.getContentPane().add(lblBestFigures);
		
		JLabel lblEconomy = new JLabel("No Balls");
		lblEconomy.setHorizontalAlignment(SwingConstants.CENTER);
		lblEconomy.setFont(new Font("Exo 2 Light", Font.PLAIN, 18));
		lblEconomy.setBounds(485, 233, 110, 24);
		frmPowerplayPlayerEditor.getContentPane().add(lblEconomy);
		
		info_7 = new JTextField();
		info_7.setText("0");
		info_7.setHorizontalAlignment(SwingConstants.CENTER);
		info_7.setFont(new Font("Exo 2 Light", Font.PLAIN, 16));
		info_7.setColumns(10);
		info_7.setBounds(622, 128, 60, 24);
		frmPowerplayPlayerEditor.getContentPane().add(info_7);
		
		info_8 = new JTextField();
		info_8.setText("0");
		info_8.setHorizontalAlignment(SwingConstants.CENTER);
		info_8.setFont(new Font("Exo 2 Light", Font.PLAIN, 16));
		info_8.setColumns(10);
		info_8.setBounds(622, 161, 60, 24);
		frmPowerplayPlayerEditor.getContentPane().add(info_8);
		
		info_9 = new JTextField();
		info_9.setText("0");
		info_9.setHorizontalAlignment(SwingConstants.CENTER);
		info_9.setFont(new Font("Exo 2 Light", Font.PLAIN, 16));
		info_9.setColumns(10);
		info_9.setBounds(622, 196, 60, 24);
		frmPowerplayPlayerEditor.getContentPane().add(info_9);
		
		info_10 = new JTextField();
		info_10.setText("0");
		info_10.setHorizontalAlignment(SwingConstants.CENTER);
		info_10.setFont(new Font("Exo 2 Light", Font.PLAIN, 16));
		info_10.setColumns(10);
		info_10.setBounds(622, 231, 60, 24);
		frmPowerplayPlayerEditor.getContentPane().add(info_10);
		
		Canvas canvas_1_2 = new Canvas();
		canvas_1_2.setBackground(Color.LIGHT_GRAY);
		canvas_1_2.setBounds(607, 128, 1, 159);
		frmPowerplayPlayerEditor.getContentPane().add(canvas_1_2);
		
		JLabel lblBowling = new JLabel("Bowling");
		lblBowling.setHorizontalAlignment(SwingConstants.CENTER);
		lblBowling.setForeground(Color.GRAY);
		lblBowling.setFont(new Font("Exo 2 Light", Font.PLAIN, 18));
		lblBowling.setBounds(554, 99, 106, 24);
		frmPowerplayPlayerEditor.getContentPane().add(lblBowling);
		
		Canvas canvas_1_1_1 = new Canvas();
		canvas_1_1_1.setBackground(Color.BLACK);
		canvas_1_1_1.setBounds(698, 128, 1, 132);
		frmPowerplayPlayerEditor.getContentPane().add(canvas_1_1_1);
		
		JLabel lblStrikeRate = new JLabel("Strike Rate");
		lblStrikeRate.setHorizontalAlignment(SwingConstants.CENTER);
		lblStrikeRate.setFont(new Font("Exo 2 Light", Font.PLAIN, 18));
		lblStrikeRate.setBounds(709, 128, 110, 24);
		frmPowerplayPlayerEditor.getContentPane().add(lblStrikeRate);
		
		JLabel lblEconomy_2 = new JLabel("Economy");
		lblEconomy_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblEconomy_2.setFont(new Font("Exo 2 Light", Font.PLAIN, 18));
		lblEconomy_2.setBounds(709, 163, 110, 24);
		frmPowerplayPlayerEditor.getContentPane().add(lblEconomy_2);
		
		JLabel lblBestWickets = new JLabel("Best Wickets");
		lblBestWickets.setHorizontalAlignment(SwingConstants.CENTER);
		lblBestWickets.setFont(new Font("Exo 2 Light", Font.PLAIN, 18));
		lblBestWickets.setBounds(709, 198, 110, 24);
		frmPowerplayPlayerEditor.getContentPane().add(lblBestWickets);
		
		JLabel lblBestRuns = new JLabel("Best Runs");
		lblBestRuns.setHorizontalAlignment(SwingConstants.CENTER);
		lblBestRuns.setFont(new Font("Exo 2 Light", Font.PLAIN, 18));
		lblBestRuns.setBounds(709, 233, 110, 24);
		frmPowerplayPlayerEditor.getContentPane().add(lblBestRuns);
		
		info_11 = new JTextField();
		info_11.setText("0");
		info_11.setHorizontalAlignment(SwingConstants.CENTER);
		info_11.setFont(new Font("Exo 2 Light", Font.PLAIN, 16));
		info_11.setColumns(10);
		info_11.setBounds(854, 128, 60, 24);
		frmPowerplayPlayerEditor.getContentPane().add(info_11);
		
		info_12 = new JTextField();
		info_12.setText("0");
		info_12.setHorizontalAlignment(SwingConstants.CENTER);
		info_12.setFont(new Font("Exo 2 Light", Font.PLAIN, 16));
		info_12.setColumns(10);
		info_12.setBounds(854, 161, 60, 24);
		frmPowerplayPlayerEditor.getContentPane().add(info_12);
		
		info_13 = new JTextField();
		info_13.setText("0");
		info_13.setHorizontalAlignment(SwingConstants.CENTER);
		info_13.setFont(new Font("Exo 2 Light", Font.PLAIN, 16));
		info_13.setColumns(10);
		info_13.setBounds(854, 196, 60, 24);
		frmPowerplayPlayerEditor.getContentPane().add(info_13);
		
		info_14 = new JTextField();
		info_14.setText("0");
		info_14.setHorizontalAlignment(SwingConstants.CENTER);
		info_14.setFont(new Font("Exo 2 Light", Font.PLAIN, 16));
		info_14.setColumns(10);
		info_14.setBounds(854, 231, 60, 24);
		frmPowerplayPlayerEditor.getContentPane().add(info_14);
		
		Canvas canvas_1_2_1 = new Canvas();
		canvas_1_2_1.setBackground(Color.LIGHT_GRAY);
		canvas_1_2_1.setBounds(829, 128, 1, 132);
		frmPowerplayPlayerEditor.getContentPane().add(canvas_1_2_1);
		
		JLabel lblAdvanced = new JLabel("Advanced");
		lblAdvanced.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdvanced.setForeground(Color.GRAY);
		lblAdvanced.setFont(new Font("Exo 2 Light", Font.PLAIN, 18));
		lblAdvanced.setBounds(774, 99, 106, 24);
		frmPowerplayPlayerEditor.getContentPane().add(lblAdvanced);
		
		JPanel writep = new JPanel();
		writep.setBackground(Color.WHITE);
		writep.setBounds(829, 266, 92, 34);
		frmPowerplayPlayerEditor.getContentPane().add(writep);
		writep.setLayout(null);
		
		JLabel writeb = new JLabel("Write");
		writeb.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
                if(!info_4.getText().isEmpty() && !info_6.getText().isEmpty()) {
				
                lblNewLabel.setForeground(Color.BLACK);
                lblTeam.setForeground(Color.BLACK);  
                Player A = new Player();
				A.age = Integer.parseInt(info_5.getText());
				A.truns = Integer.parseInt(info.getText());
				A.tballs = Integer.parseInt(info_1.getText());
				A.fours = Integer.parseInt(info_2.getText());
				A.sixes = Integer.parseInt(info_3.getText());
				A.name = info_4.getText();
				A.team = info_6.getText();
				A.wides = Integer.parseInt(info_10_1.getText());
				A.noballs = Integer.parseInt(info_10.getText());
				A.bruns =Integer.parseInt(info_9.getText());
				A.tbballs =Integer.parseInt(info_7.getText());
				A.twickets =Integer.parseInt(info_8.getText());	
				//S11EBBBR
				
				if(A.tballs != 0){
				Double P = new Double(A.tballs);
				Double Q = new Double(A.truns);
				Double R = new Double(P/Q);;		
				A.sr = (P/Q);}
				else {
					A.sr = 0;
				}
				
				if(A.tbballs != 0){
				Double P = new Double(A.tbballs);
				Double Q = new Double(A.bruns);
				Double R = new Double(P/Q);;		
				A.economy = (P/Q);}
				else {
					A.economy = 0;
				}
				A.maxruns = Integer.parseInt(info_14.getText());
				A.maxwickets = Integer.parseInt(info_13.getText());
				A.role = role.getText();
				
				A.write();
				System.out.println(A.name + " is written");
				
				LL.head = null;
				String[] PList =  new File("C:\\PowerPlay\\Players\\"+ Tlist[tsel.getSelectedIndex()]).list(); 
				
				for(int i =0;i<PList.length;i++) {
					int index = PList[i].indexOf(".txt"); 
					PList[i] = PList[i].substring(0, index);
					LL.insert(Preader.read(Tlist[tsel.getSelectedIndex()],PList[i]));	
					
				}
			
				psel.setModel(new DefaultComboBoxModel(PList));
				apphelper.setText("Player written successfully!");
				
				
                }else {
                	
                	lblNewLabel.setForeground(Color.RED);
                    lblTeam.setForeground(Color.RED); 
    				apphelper.setText("Important fields missing!");
                }
                
			}
			@Override
			public void mouseEntered(MouseEvent e) {
			
				apphelper.setText("Write Player File");
				writep.setBackground(new Color(0,128,128));
				writeb.setForeground(Color.WHITE);
			}
			public void mouseExited(MouseEvent e) {
				
				apphelper.setText("");
				writep.setBackground(Color.WHITE);
				writeb.setForeground(new Color(0,128,128));
			}
		});
		writeb.setForeground(new Color(0, 128, 128));
		writeb.setHorizontalAlignment(SwingConstants.CENTER);
		writeb.setFont(new Font("Exo 2 Light", Font.PLAIN, 24));
		writeb.setBounds(0, 0, 92, 34);
		writep.add(writeb);
		
		JPanel clearp = new JPanel();
		clearp.setBackground(Color.WHITE);
		clearp.setBounds(727, 266, 103, 34);
		frmPowerplayPlayerEditor.getContentPane().add(clearp);
		clearp.setLayout(null);
		
		JLabel clearb = new JLabel("Clear");
		clearb.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				info.setText("0");
				info_1.setText("0");
				info_2.setText("0");
				info_3.setText("0");
				info_4.setText("");
				info_5.setText("");
				info_6.setText("");
				info_7.setText("0");
				info_8.setText("0");
				info_10.setText("0");
				info_10_1.setText("0");
				info_9.setText("0");
				

				
				info_11.setText("0");
				info_12.setText("0");
				info_13.setText("0");
				info_14.setText("0");
				role.setText("");
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
			
				apphelper.setText("Clear all fields");
				clearp.setBackground(new Color(220, 20, 60));
				clearb.setForeground(Color.WHITE);
			}
			public void mouseExited(MouseEvent e) {
				apphelper.setText("");
				clearp.setBackground(Color.WHITE);
				clearb.setForeground(new Color(220, 20, 60));
			}
		});
		clearb.setForeground(new Color(220, 20, 60));
		clearb.setHorizontalAlignment(SwingConstants.CENTER);
		clearb.setFont(new Font("Exo 2 Light", Font.PLAIN, 24));
		clearb.setBounds(0, 0, 103, 34);
		clearp.add(clearb);
		
		role = new JTextField();
		role.setColumns(10);
		role.setBounds(350, 267, 110, 24);
		frmPowerplayPlayerEditor.getContentPane().add(role);
		
		JLabel lblRole = new JLabel("Role");
		lblRole.setHorizontalAlignment(SwingConstants.CENTER);
		lblRole.setFont(new Font("Exo 2 Light", Font.PLAIN, 18));
		lblRole.setBounds(269, 267, 110, 24);
		frmPowerplayPlayerEditor.getContentPane().add(lblRole);
		
		info_10_1 = new JTextField();
		info_10_1.setText("0");
		info_10_1.setHorizontalAlignment(SwingConstants.CENTER);
		info_10_1.setFont(new Font("Exo 2 Light", Font.PLAIN, 16));
		info_10_1.setColumns(10);
		info_10_1.setBounds(622, 266, 60, 24);
		frmPowerplayPlayerEditor.getContentPane().add(info_10_1);
		
		JLabel lblWides = new JLabel("Wides");
		lblWides.setHorizontalAlignment(SwingConstants.CENTER);
		lblWides.setFont(new Font("Exo 2 Light", Font.PLAIN, 18));
		lblWides.setBounds(485, 266, 110, 24);
		frmPowerplayPlayerEditor.getContentPane().add(lblWides);
		

		frmPowerplayPlayerEditor.getContentPane().add(apphelper);
		frmPowerplayPlayerEditor.setTitle("PowerPlay Player Editor");
		frmPowerplayPlayerEditor.setBackground(Color.WHITE);
		frmPowerplayPlayerEditor.setResizable(false);
		frmPowerplayPlayerEditor.setBounds(100, 100, 937, 341);
		frmPowerplayPlayerEditor.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
}
