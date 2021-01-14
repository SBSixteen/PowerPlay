import java.awt.EventQueue;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import java.io.*;
import java.util.Scanner;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.DropMode;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.ListSelectionModel;
import java.awt.Canvas;
import java.awt.Panel;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Dialog.ModalExclusionType;
import javax.swing.JComboBox;
import javax.swing.ComboBoxEditor;
import javax.swing.DefaultComboBoxModel;

public class MatchReaderx implements Serializable{

    
	private JFrame frmPowerplayMatchmakerV;
	Match A = new Match();
	
	private JTextField TeamAn;
	private JTextField PlayerName;
	private JTextField PlayerName_1;
	private JTextField PlayerName_2;
	private JTextField PlayerName_3;
	private JTextField PlayerName_4;
	private JTextField PlayerName_5;
	private JTextField PlayerName_6;
	private JTextField PlayerName_7;
	private JTextField PlayerName_8;
	private JTextField PlayerName_9;
	private JTextField PlayerName_10;

	private JTextField Aruns;
	private JTextField Aruns_1;
	private JTextField Aruns_2;
	private JTextField Aruns_3;
	private JTextField Aruns_4;
	private JTextField Aruns_5;
	private JTextField Aruns_6;
	private JTextField Aruns_7;
	private JTextField Aruns_8;
	private JTextField Aruns_9;
	private JTextField Aruns_10;
	
	private JTextField balls;
	private JTextField balls_1;
	private JTextField balls_2;
	private JTextField balls_3;
	private JTextField balls_4;
	private JTextField balls_5;
	private JTextField balls_6;
	private JTextField balls_7;
	private JTextField balls_8;
	private JTextField balls_9;
	private JTextField balls_10;
	
	private JTextField wickets;
	private JTextField wickets_1;
	private JTextField wickets_2;
	private JTextField wickets_3;
	private JTextField wickets_4;
	private JTextField wickets_5;
	private JTextField wickets_6;
	private JTextField wickets_7;
	private JTextField wickets_8;
	private JTextField wickets_9;
	private JTextField wickets_10;
	private JTextField bowled;
	private JTextField bowled_1;
	private JTextField bowled_2;
	private JTextField bowled_3;
	private JTextField bowled_4;
	private JTextField bowled_5;
	private JTextField bowled_6;
	private JTextField bowled_7;
	private JTextField bowled_8;
	private JTextField bowled_9;
	private JTextField bowled_10;
	private JTextField fours;
	private JTextField fours_1;
	private JTextField fours_2;
	private JTextField fours_3;
	private JTextField fours_4;
	private JTextField fours_5;
	private JTextField fours_6;
	private JTextField fours_7;
	private JTextField fours_8;
	private JTextField fours_9;
	private JTextField fours_10;
	private JTextField sixes;
	private JTextField sixes_1;
	private JTextField sixes_2;
	private JTextField sixes_3;
	private JTextField sixes_4;
	private JTextField sixes_5;
	private JTextField sixes_6;
	private JTextField sixes_7;
	private JTextField sixes_8;
	private JTextField sixes_9;
	private JTextField sixes_10;
	private JTextField wide;
	private JTextField wide_1;
	private JTextField wide_2;
	private JTextField wide_3;
	private JTextField wide_4;
	private JTextField wide_5;
	private JTextField wide_6;
	private JTextField wide_7;
	private JTextField wide_8;
	private JTextField wide_9;
	private JTextField wide_10;
	private JTextField nballs;
	private JTextField nballs_1;
	private JTextField nballs_2;
	private JTextField nballs_3;
	private JTextField nballs_4;
	private JTextField nballs_5;
	private JTextField nballs_6;
	private JTextField nballs_7;
	private JTextField nballs_8;
	private JTextField nballs_9;
	private JTextField nballs_10;
	private Panel ATeamPanel_1;
	private JTextField BPlayerName;
	private JTextField BPlayerName_1;
	private JTextField BPlayerName_2;
	private JTextField BPlayerName_3;
	private JTextField BPlayerName_4;
	private JTextField BPlayerName_5;
	private JTextField BPlayerName_6;
	private JTextField BPlayerName_7;
	private JTextField BPlayerName_8;
	private JTextField BPlayerName_9;
	private JTextField BPlayerName_10;
	private JTextField Bruns_11;
	private JTextField Bruns_12;
	private JTextField Bruns_13;
	private JTextField Bruns_14;
	private JTextField Bruns_15;
	private JTextField Bruns_16;
	private JTextField Bruns_17;
	private JTextField Bruns_18;
	private JTextField Bruns_19;
	private JTextField Bruns_20;
	private JTextField Bruns_21;
	private JTextField Bballs_22;
	private JTextField Bballs_23;
	private JTextField Bballs_24;
	private JTextField Bballs_25;
	private JTextField Bballs_26;
	private JTextField Bballs_27;
	private JTextField Bballs_28;
	private JTextField Bballs_29;
	private JTextField Bballs_30;
	private JTextField Bballs_31;
	private JTextField Bballs_32;
	private JTextField wickets_33;
	private JTextField wickets_34;
	private JTextField wickets_35;
	private JTextField wickets_36;
	private JTextField wickets_37;
	private JTextField wickets_38;
	private JTextField wickets_39;
	private JTextField wickets_40;
	private JTextField wickets_41;
	private JTextField wickets_42;
	private JTextField wickets_43;
	private JTextField bowled_44;
	private JTextField bowled_45;
	private JTextField bowled_46;
	private JTextField bowled_47;
	private JTextField bowled_48;
	private JTextField bowled_49;
	private JTextField bowled_50;
	private JTextField bowled_51;
	private JTextField bowled_52;
	private JTextField bowled_53;
	private JTextField bowled_54;
	private JTextField fours_55;
	private JTextField fours_56;
	private JTextField fours_57;
	private JTextField fours_58;
	private JTextField fours_59;
	private JTextField fours_60;
	private JTextField fours_61;
	private JTextField fours_62;
	private JTextField fours_63;
	private JTextField fours_64;
	private JTextField fours_65;
	private JTextField sixes_66;
	private JTextField sixes_67;
	private JTextField sixes_68;
	private JTextField sixes_69;
	private JTextField sixes_70;
	private JTextField sixes_71;
	private JTextField sixes_72;
	private JTextField sixes_73;
	private JTextField sixes_74;
	private JTextField sixes_75;
	private JTextField sixes_76;
	private JTextField wides_77;
	private JTextField wides_78;
	private JTextField wides_79;
	private JTextField wides_80;
	private JTextField wides_81;
	private JTextField wides_82;
	private JTextField wides_83;
	private JTextField wides_84;
	private JTextField wides_85;
	private JTextField wides_86;
	private JTextField wides_87;
	private JTextField nballs_88;
	private JTextField nballs_89;
	private JTextField nballs_90;
	private JTextField nballs_91;
	private JTextField nballs_92;
	private JTextField nballs_93;
	private JTextField nballs_94;
	private JTextField nballs_95;
	private JTextField nballs_96;
	private JTextField nballs_97;
	private JTextField nballs_98;
	private Canvas canvas_1_1_2;
	private Canvas canvas_1_1_3;
	private Canvas canvas_1_1_4;
	private Canvas canvas_1_1_5;
	private JTextField txtTeamB;
	private JComboBox Aqf_1;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_3_1;
	private JLabel lblNewLabel_3_2;
	private Canvas canvas_3;
	private JLabel lblNewLabel_3_3;
	private JLabel lblNewLabel_3_1_1;
	private JLabel lblNewLabel_3_2_1;
	private Canvas canvas_3_1;
	private JLabel BRunRate;
	private JLabel Bovers_1;
	private JLabel BFinalScore;
	private JLabel AFinalScore;
	private JLabel Aovers_1;
	private JLabel ARunRate;
	private JLabel lblNewLabel_4;
	private Canvas PlayerList;
	private Canvas sumofBalls;
	private Canvas Sumofwickets;
	private Canvas WinnerA;
	private JLabel Icon;
	private JLabel lblNewLabel_5;
	private Canvas PlayerListB;
	private Canvas SumofBallsB;
	private Canvas sumofRunsB;
	private Canvas SumofwicketsB;
	private Canvas WinnerB;
	private JTextField AbR;
	private JTextField AbR_1;
	private JTextField AbR_2;
	private JTextField AbR_3;
	private JTextField AbR_4;
	private JTextField AbR_5;
	private JTextField AbR_6;
	private JTextField AbR_7;
	private JTextField AbR_8;
	private JTextField AbR_9;
	private JTextField AbR_10;
	private JTextField BbR;
	private JTextField BbR_1;
	private JTextField BbR_2;
	private JTextField BbR_3;
	private JTextField BbR_4;
	private JTextField BbR_5;
	private JTextField BbR_6;
	private JTextField BbR_7;
	private JTextField BbR_8;
	private JTextField BbR_9;
	private JTextField BbR_10;
	private JLabel lblNewLabel_1_7;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;
	private JLabel lblNewLabel_10;
	private JTextField matchinfo_1;
	private JTextField matchinfo_2;
	private JTextField matchinfo_4;
	private JTextField matchinfo_3;
	private JLabel lblNewLabel_11;
	private JComboBox comboBox_1;
	private JLabel apphelper;

	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MatchReaderx window = new MatchReaderx();
					window.frmPowerplayMatchmakerV.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MatchReaderx() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		String[] TDisplay = new File("C:\\PowerPlay\\Tournament").list();
		String[] QuickFill = new File("C:\\PowerPlay\\MatchMaker_QuickFill").list();
		String[] AqfDisplay = QuickFill;
		for(int i =0;i<QuickFill.length;i++) {
			AqfDisplay[i] = QuickFill[i].replace(".txt", "");
		}
		
		frmPowerplayMatchmakerV = new JFrame();
		frmPowerplayMatchmakerV.setFont(new Font("Exo 2 Light", Font.PLAIN, 14));
		frmPowerplayMatchmakerV.setResizable(false);
		frmPowerplayMatchmakerV.setTitle("PowerPlay MatchMaker | Promethium");
		frmPowerplayMatchmakerV.getContentPane().setBackground(new Color(255, 255, 255));
		frmPowerplayMatchmakerV.getContentPane().setLayout(null);
		
		canvas_3 = new Canvas();
		canvas_3.setBackground(Color.BLUE);
		canvas_3.setBounds(94, 559, 1, 73);
		frmPowerplayMatchmakerV.getContentPane().add(canvas_3);
		

		
		JLabel lblNewLabel_1_4_2 = new JLabel("Wides");
		lblNewLabel_1_4_2.setFont(new Font("Exo 2 Light", Font.PLAIN, 12));
		lblNewLabel_1_4_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_4_2.setBounds(525, 186, 39, 23);
		frmPowerplayMatchmakerV.getContentPane().add(lblNewLabel_1_4_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("Balls");
		lblNewLabel_1_1.setToolTipText("Balls faced by the Batsman");
		lblNewLabel_1_1.setFont(new Font("Exo 2 Light", Font.PLAIN, 12));
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setBounds(234, 186, 62, 23);
		frmPowerplayMatchmakerV.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_4 = new JLabel("Fours");
		lblNewLabel_1_4.setFont(new Font("Exo 2 Light", Font.PLAIN, 12));
		lblNewLabel_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_4.setBounds(433, 186, 39, 23);
		frmPowerplayMatchmakerV.getContentPane().add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1 = new JLabel("Runs");
		lblNewLabel_1.setBackground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Exo 2 Light", Font.PLAIN, 12));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(195, 187, 45, 23);
		frmPowerplayMatchmakerV.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Wickets");
		lblNewLabel_1_2.setFont(new Font("Exo 2 Light", Font.PLAIN, 12));
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setBounds(283, 186, 52, 23);
		frmPowerplayMatchmakerV.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Balls");
		lblNewLabel_1_3.setToolTipText("Balls bowled by the bowler");
		lblNewLabel_1_3.setFont(new Font("Exo 2 Light", Font.PLAIN, 12));
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3.setBounds(382, 186, 39, 23);
		frmPowerplayMatchmakerV.getContentPane().add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4_1 = new JLabel("Sixes");
		lblNewLabel_1_4_1.setFont(new Font("Exo 2 Light", Font.PLAIN, 12));
		lblNewLabel_1_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_4_1.setBounds(476, 186, 39, 23);
		frmPowerplayMatchmakerV.getContentPane().add(lblNewLabel_1_4_1);
		
		JLabel lblNewLabel_1_4_3 = new JLabel("No Balls\r\n");
		lblNewLabel_1_4_3.setFont(new Font("Exo 2 Light", Font.PLAIN, 12));
		lblNewLabel_1_4_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_4_3.setBounds(569, 186, 51, 23);
		frmPowerplayMatchmakerV.getContentPane().add(lblNewLabel_1_4_3);
		
		JLabel lblNewLabel = new JLabel("Player Name");
		lblNewLabel.setFont(new Font("Exo 2 Light", Font.PLAIN, 12));
		lblNewLabel.setBounds(10, 186, 165, 23);
		frmPowerplayMatchmakerV.getContentPane().add(lblNewLabel);
		
		TeamAn = new JTextField();
		TeamAn.setText("Team A");
		TeamAn.setForeground(new Color(0, 0, 255));
		TeamAn.setToolTipText("Enter Team Name\r\n");
		TeamAn.setHorizontalAlignment(SwingConstants.LEFT);
		TeamAn.setFont(new Font("Exo 2 Light", Font.PLAIN, 48));
		TeamAn.setBounds(10, 106, 463, 69);
		frmPowerplayMatchmakerV.getContentPane().add(TeamAn);
		TeamAn.setColumns(20);
		
		Panel ATeamPanel = new Panel();
		ATeamPanel.setBackground(Color.WHITE);
		ATeamPanel.setBounds(10, 215, 616, 339);
		frmPowerplayMatchmakerV.getContentPane().add(ATeamPanel);
		ATeamPanel.setLayout(null);
		
		PlayerName = new JTextField();
		PlayerName.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		PlayerName.setBackground(new Color(240, 255, 255));
		PlayerName.setBounds(0, 0, 164, 20);
		ATeamPanel.add(PlayerName);
		PlayerName.setColumns(64);
		
		PlayerName_1 = new JTextField();
		PlayerName_1.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		PlayerName_1.setBackground(new Color(240, 255, 255));
		PlayerName_1.setColumns(64);
		PlayerName_1.setBounds(0, 31, 164, 20);
		ATeamPanel.add(PlayerName_1);
		
		PlayerName_2 = new JTextField();
		PlayerName_2.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		PlayerName_2.setBackground(new Color(240, 255, 255));
		PlayerName_2.setColumns(64);
		PlayerName_2.setBounds(0, 62, 164, 20);
		ATeamPanel.add(PlayerName_2);
		
		PlayerName_3 = new JTextField();
		PlayerName_3.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		PlayerName_3.setBackground(new Color(240, 255, 255));
		PlayerName_3.setColumns(64);
		PlayerName_3.setBounds(0, 93, 164, 20);
		ATeamPanel.add(PlayerName_3);
		
		PlayerName_4 = new JTextField();
		PlayerName_4.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		PlayerName_4.setBackground(new Color(240, 255, 255));
		PlayerName_4.setColumns(64);
		PlayerName_4.setBounds(0, 124, 164, 20);
		ATeamPanel.add(PlayerName_4);
		
		PlayerName_5 = new JTextField();
		PlayerName_5.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		PlayerName_5.setBackground(new Color(240, 255, 255));
		PlayerName_5.setColumns(64);
		PlayerName_5.setBounds(0, 155, 164, 20);
		ATeamPanel.add(PlayerName_5);
		
		PlayerName_6 = new JTextField();
		PlayerName_6.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		PlayerName_6.setBackground(new Color(240, 255, 255));
		PlayerName_6.setColumns(64);
		PlayerName_6.setBounds(0, 186, 164, 20);
		ATeamPanel.add(PlayerName_6);
		
		PlayerName_7 = new JTextField();
		PlayerName_7.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		PlayerName_7.setBackground(new Color(240, 255, 255));
		PlayerName_7.setColumns(64);
		PlayerName_7.setBounds(0, 217, 164, 20);
		ATeamPanel.add(PlayerName_7);
		
		PlayerName_8 = new JTextField();
		PlayerName_8.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		PlayerName_8.setBackground(new Color(240, 255, 255));
		PlayerName_8.setColumns(64);
		PlayerName_8.setBounds(0, 248, 164, 20);
		ATeamPanel.add(PlayerName_8);
		
		PlayerName_9 = new JTextField();
		PlayerName_9.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		PlayerName_9.setBackground(new Color(240, 255, 255));
		PlayerName_9.setColumns(64);
		PlayerName_9.setBounds(0, 279, 164, 20);
		ATeamPanel.add(PlayerName_9);
		
		PlayerName_10 = new JTextField();
		PlayerName_10.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		PlayerName_10.setBackground(new Color(240, 255, 255));
		PlayerName_10.setColumns(64);
		PlayerName_10.setBounds(0, 310, 164, 20);
		ATeamPanel.add(PlayerName_10);
		
		Aruns = new JTextField();
		Aruns.setHorizontalAlignment(SwingConstants.CENTER);
		Aruns.setText("0");
		Aruns.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		Aruns.setBackground(new Color(240, 255, 255));
		Aruns.setBounds(186, 0, 45, 20);
		ATeamPanel.add(Aruns);
		Aruns.setColumns(4);
		
		Aruns_1 = new JTextField();
		Aruns_1.setHorizontalAlignment(SwingConstants.CENTER);
		Aruns_1.setText("0");
		Aruns_1.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		Aruns_1.setBackground(new Color(240, 255, 255));
		Aruns_1.setColumns(4);
		Aruns_1.setBounds(186, 31, 45, 20);
		ATeamPanel.add(Aruns_1);
		
		Aruns_2 = new JTextField();
		Aruns_2.setHorizontalAlignment(SwingConstants.CENTER);
		Aruns_2.setText("0");
		Aruns_2.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		Aruns_2.setBackground(new Color(240, 255, 255));
		Aruns_2.setColumns(4);
		Aruns_2.setBounds(186, 62, 45, 20);
		ATeamPanel.add(Aruns_2);
		
		Aruns_3 = new JTextField();
		Aruns_3.setHorizontalAlignment(SwingConstants.CENTER);
		Aruns_3.setText("0");
		Aruns_3.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		Aruns_3.setBackground(new Color(240, 255, 255));
		Aruns_3.setColumns(4);
		Aruns_3.setBounds(186, 93, 45, 20);
		ATeamPanel.add(Aruns_3);
		
		Aruns_4 = new JTextField();
		Aruns_4.setHorizontalAlignment(SwingConstants.CENTER);
		Aruns_4.setText("0");
		Aruns_4.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		Aruns_4.setBackground(new Color(240, 255, 255));
		Aruns_4.setColumns(4);
		Aruns_4.setBounds(186, 124, 45, 20);
		ATeamPanel.add(Aruns_4);
		
		Aruns_5 = new JTextField();
		Aruns_5.setHorizontalAlignment(SwingConstants.CENTER);
		Aruns_5.setText("0");
		Aruns_5.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		Aruns_5.setBackground(new Color(240, 255, 255));
		Aruns_5.setColumns(4);
		Aruns_5.setBounds(186, 155, 45, 20);
		ATeamPanel.add(Aruns_5);
		
		Aruns_6 = new JTextField();
		Aruns_6.setHorizontalAlignment(SwingConstants.CENTER);
		Aruns_6.setText("0");
		Aruns_6.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		Aruns_6.setBackground(new Color(240, 255, 255));
		Aruns_6.setColumns(4);
		Aruns_6.setBounds(186, 186, 45, 20);
		ATeamPanel.add(Aruns_6);
		
		Aruns_7 = new JTextField();
		Aruns_7.setHorizontalAlignment(SwingConstants.CENTER);
		Aruns_7.setText("0");
		Aruns_7.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		Aruns_7.setBackground(new Color(240, 255, 255));
		Aruns_7.setColumns(4);
		Aruns_7.setBounds(186, 217, 45, 20);
		ATeamPanel.add(Aruns_7);
		
		Aruns_8 = new JTextField();
		Aruns_8.setHorizontalAlignment(SwingConstants.CENTER);
		Aruns_8.setText("0");
		Aruns_8.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		Aruns_8.setBackground(new Color(240, 255, 255));
		Aruns_8.setColumns(4);
		Aruns_8.setBounds(186, 248, 45, 20);
		ATeamPanel.add(Aruns_8);
		
		Aruns_9 = new JTextField();
		Aruns_9.setHorizontalAlignment(SwingConstants.CENTER);
		Aruns_9.setText("0");
		Aruns_9.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		Aruns_9.setBackground(new Color(240, 255, 255));
		Aruns_9.setColumns(4);
		Aruns_9.setBounds(186, 279, 45, 20);
		ATeamPanel.add(Aruns_9);
		
		Aruns_10 = new JTextField();
		Aruns_10.setHorizontalAlignment(SwingConstants.CENTER);
		Aruns_10.setText("0");
		Aruns_10.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		Aruns_10.setBackground(new Color(240, 255, 255));
		Aruns_10.setColumns(4);
		Aruns_10.setBounds(186, 310, 45, 20);
		ATeamPanel.add(Aruns_10);
		
		balls = new JTextField();
		balls.setHorizontalAlignment(SwingConstants.CENTER);
		balls.setText("0");
		balls.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		balls.setBackground(new Color(240, 255, 255));
		balls.setColumns(4);
		balls.setBounds(239, 0, 33, 20);
		ATeamPanel.add(balls);
		
		balls_1 = new JTextField();
		balls_1.setHorizontalAlignment(SwingConstants.CENTER);
		balls_1.setText("0");
		balls_1.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		balls_1.setBackground(new Color(240, 255, 255));
		balls_1.setColumns(4);
		balls_1.setBounds(239, 31, 33, 20);
		ATeamPanel.add(balls_1);
		
		balls_2 = new JTextField();
		balls_2.setHorizontalAlignment(SwingConstants.CENTER);
		balls_2.setText("0");
		balls_2.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		balls_2.setBackground(new Color(240, 255, 255));
		balls_2.setColumns(4);
		balls_2.setBounds(239, 62, 33, 20);
		ATeamPanel.add(balls_2);
		
		balls_3 = new JTextField();
		balls_3.setHorizontalAlignment(SwingConstants.CENTER);
		balls_3.setText("0");
		balls_3.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		balls_3.setBackground(new Color(240, 255, 255));
		balls_3.setColumns(4);
		balls_3.setBounds(239, 93, 33, 20);
		ATeamPanel.add(balls_3);
		
		balls_4 = new JTextField();
		balls_4.setHorizontalAlignment(SwingConstants.CENTER);
		balls_4.setText("0");
		balls_4.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		balls_4.setBackground(new Color(240, 255, 255));
		balls_4.setColumns(4);
		balls_4.setBounds(239, 124, 33, 20);
		ATeamPanel.add(balls_4);
		
		balls_5 = new JTextField();
		balls_5.setHorizontalAlignment(SwingConstants.CENTER);
		balls_5.setText("0");
		balls_5.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		balls_5.setBackground(new Color(240, 255, 255));
		balls_5.setColumns(4);
		balls_5.setBounds(239, 155, 33, 20);
		ATeamPanel.add(balls_5);
		
		balls_6 = new JTextField();
		balls_6.setHorizontalAlignment(SwingConstants.CENTER);
		balls_6.setText("0");
		balls_6.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		balls_6.setBackground(new Color(240, 255, 255));
		balls_6.setColumns(4);
		balls_6.setBounds(239, 186, 33, 20);
		ATeamPanel.add(balls_6);
		
		balls_7 = new JTextField();
		balls_7.setHorizontalAlignment(SwingConstants.CENTER);
		balls_7.setText("0");
		balls_7.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		balls_7.setBackground(new Color(240, 255, 255));
		balls_7.setColumns(4);
		balls_7.setBounds(239, 217, 33, 20);
		ATeamPanel.add(balls_7);
		
		balls_8 = new JTextField();
		balls_8.setHorizontalAlignment(SwingConstants.CENTER);
		balls_8.setText("0");
		balls_8.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		balls_8.setBackground(new Color(240, 255, 255));
		balls_8.setColumns(4);
		balls_8.setBounds(239, 248, 33, 20);
		ATeamPanel.add(balls_8);
		
		balls_9 = new JTextField();
		balls_9.setHorizontalAlignment(SwingConstants.CENTER);
		balls_9.setText("0");
		balls_9.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		balls_9.setBackground(new Color(240, 255, 255));
		balls_9.setColumns(4);
		balls_9.setBounds(239, 279, 33, 20);
		ATeamPanel.add(balls_9);
		
		balls_10 = new JTextField();
		balls_10.setHorizontalAlignment(SwingConstants.CENTER);
		balls_10.setText("0");
		balls_10.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		balls_10.setBackground(new Color(240, 255, 255));
		balls_10.setColumns(4);
		balls_10.setBounds(239, 310, 33, 20);
		ATeamPanel.add(balls_10);
		
		wickets = new JTextField();
		wickets.setHorizontalAlignment(SwingConstants.CENTER);
		wickets.setText("0");
		wickets.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		wickets.setBackground(new Color(240, 255, 255));
		wickets.setColumns(4);
		wickets.setBounds(282, 0, 33, 20);
		ATeamPanel.add(wickets);
		
		wickets_1 = new JTextField();
		wickets_1.setHorizontalAlignment(SwingConstants.CENTER);
		wickets_1.setText("0");
		wickets_1.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		wickets_1.setBackground(new Color(240, 255, 255));
		wickets_1.setColumns(4);
		wickets_1.setBounds(282, 31, 33, 20);
		ATeamPanel.add(wickets_1);
		
		wickets_2 = new JTextField();
		wickets_2.setHorizontalAlignment(SwingConstants.CENTER);
		wickets_2.setText("0");
		wickets_2.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		wickets_2.setBackground(new Color(240, 255, 255));
		wickets_2.setColumns(4);
		wickets_2.setBounds(282, 62, 33, 20);
		ATeamPanel.add(wickets_2);
		
		wickets_3 = new JTextField();
		wickets_3.setHorizontalAlignment(SwingConstants.CENTER);
		wickets_3.setText("0");
		wickets_3.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		wickets_3.setBackground(new Color(240, 255, 255));
		wickets_3.setColumns(4);
		wickets_3.setBounds(282, 93, 33, 20);
		ATeamPanel.add(wickets_3);
		
		wickets_4 = new JTextField();
		wickets_4.setHorizontalAlignment(SwingConstants.CENTER);
		wickets_4.setText("0");
		wickets_4.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		wickets_4.setBackground(new Color(240, 255, 255));
		wickets_4.setColumns(4);
		wickets_4.setBounds(282, 124, 33, 20);
		ATeamPanel.add(wickets_4);
		
		wickets_5 = new JTextField();
		wickets_5.setHorizontalAlignment(SwingConstants.CENTER);
		wickets_5.setText("0");
		wickets_5.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		wickets_5.setBackground(new Color(240, 255, 255));
		wickets_5.setColumns(4);
		wickets_5.setBounds(282, 155, 33, 20);
		ATeamPanel.add(wickets_5);
		
		wickets_6 = new JTextField();
		wickets_6.setHorizontalAlignment(SwingConstants.CENTER);
		wickets_6.setText("0");
		wickets_6.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		wickets_6.setBackground(new Color(240, 255, 255));
		wickets_6.setColumns(4);
		wickets_6.setBounds(282, 186, 33, 20);
		ATeamPanel.add(wickets_6);
		
		wickets_7 = new JTextField();
		wickets_7.setHorizontalAlignment(SwingConstants.CENTER);
		wickets_7.setText("0");
		wickets_7.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		wickets_7.setBackground(new Color(240, 255, 255));
		wickets_7.setColumns(4);
		wickets_7.setBounds(282, 217, 33, 20);
		ATeamPanel.add(wickets_7);
		
		wickets_8 = new JTextField();
		wickets_8.setHorizontalAlignment(SwingConstants.CENTER);
		wickets_8.setText("0");
		wickets_8.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		wickets_8.setBackground(new Color(240, 255, 255));
		wickets_8.setColumns(4);
		wickets_8.setBounds(282, 248, 33, 20);
		ATeamPanel.add(wickets_8);
		
		wickets_9 = new JTextField();
		wickets_9.setHorizontalAlignment(SwingConstants.CENTER);
		wickets_9.setText("0");
		wickets_9.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		wickets_9.setBackground(new Color(240, 255, 255));
		wickets_9.setColumns(4);
		wickets_9.setBounds(282, 279, 33, 20);
		ATeamPanel.add(wickets_9);
		
		wickets_10 = new JTextField();
		wickets_10.setHorizontalAlignment(SwingConstants.CENTER);
		wickets_10.setText("0");
		wickets_10.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		wickets_10.setBackground(new Color(240, 255, 255));
		wickets_10.setColumns(4);
		wickets_10.setBounds(282, 310, 33, 20);
		ATeamPanel.add(wickets_10);
		
		bowled = new JTextField();
		bowled.setHorizontalAlignment(SwingConstants.CENTER);
		bowled.setText("0");
		bowled.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		bowled.setBackground(new Color(240, 255, 255));
		bowled.setColumns(4);
		bowled.setBounds(376, 0, 33, 20);
		ATeamPanel.add(bowled);
		
		bowled_1 = new JTextField();
		bowled_1.setHorizontalAlignment(SwingConstants.CENTER);
		bowled_1.setText("0");
		bowled_1.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		bowled_1.setBackground(new Color(240, 255, 255));
		bowled_1.setColumns(4);
		bowled_1.setBounds(376, 31, 33, 20);
		ATeamPanel.add(bowled_1);
		
		bowled_2 = new JTextField();
		bowled_2.setHorizontalAlignment(SwingConstants.CENTER);
		bowled_2.setText("0");
		bowled_2.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		bowled_2.setBackground(new Color(240, 255, 255));
		bowled_2.setColumns(4);
		bowled_2.setBounds(376, 62, 33, 20);
		ATeamPanel.add(bowled_2);
		
		bowled_3 = new JTextField();
		bowled_3.setHorizontalAlignment(SwingConstants.CENTER);
		bowled_3.setText("0");
		bowled_3.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		bowled_3.setBackground(new Color(240, 255, 255));
		bowled_3.setColumns(4);
		bowled_3.setBounds(376, 93, 33, 20);
		ATeamPanel.add(bowled_3);
		
		bowled_4 = new JTextField();
		bowled_4.setHorizontalAlignment(SwingConstants.CENTER);
		bowled_4.setText("0");
		bowled_4.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		bowled_4.setBackground(new Color(240, 255, 255));
		bowled_4.setColumns(4);
		bowled_4.setBounds(376, 124, 33, 20);
		ATeamPanel.add(bowled_4);
		
		bowled_5 = new JTextField();
		bowled_5.setHorizontalAlignment(SwingConstants.CENTER);
		bowled_5.setText("0");
		bowled_5.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		bowled_5.setBackground(new Color(240, 255, 255));
		bowled_5.setColumns(4);
		bowled_5.setBounds(376, 155, 33, 20);
		ATeamPanel.add(bowled_5);
		
		bowled_6 = new JTextField();
		bowled_6.setHorizontalAlignment(SwingConstants.CENTER);
		bowled_6.setText("0");
		bowled_6.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		bowled_6.setBackground(new Color(240, 255, 255));
		bowled_6.setColumns(4);
		bowled_6.setBounds(376, 186, 33, 20);
		ATeamPanel.add(bowled_6);
		
		bowled_7 = new JTextField();
		bowled_7.setHorizontalAlignment(SwingConstants.CENTER);
		bowled_7.setText("0");
		bowled_7.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		bowled_7.setBackground(new Color(240, 255, 255));
		bowled_7.setColumns(4);
		bowled_7.setBounds(376, 217, 33, 20);
		ATeamPanel.add(bowled_7);
		
		bowled_8 = new JTextField();
		bowled_8.setHorizontalAlignment(SwingConstants.CENTER);
		bowled_8.setText("0");
		bowled_8.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		bowled_8.setBackground(new Color(240, 255, 255));
		bowled_8.setColumns(4);
		bowled_8.setBounds(376, 248, 33, 20);
		ATeamPanel.add(bowled_8);
		
		bowled_9 = new JTextField();
		bowled_9.setHorizontalAlignment(SwingConstants.CENTER);
		bowled_9.setText("0");
		bowled_9.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		bowled_9.setBackground(new Color(240, 255, 255));
		bowled_9.setColumns(4);
		bowled_9.setBounds(376, 279, 33, 20);
		ATeamPanel.add(bowled_9);
		
		bowled_10 = new JTextField();
		bowled_10.setHorizontalAlignment(SwingConstants.CENTER);
		bowled_10.setText("0");
		bowled_10.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		bowled_10.setBackground(new Color(240, 255, 255));
		bowled_10.setColumns(4);
		bowled_10.setBounds(376, 310, 33, 20);
		ATeamPanel.add(bowled_10);
		
		fours = new JTextField();
		fours.setHorizontalAlignment(SwingConstants.CENTER);
		fours.setText("0");
		fours.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		fours.setBackground(new Color(240, 255, 255));
		fours.setColumns(4);
		fours.setBounds(426, 0, 33, 20);
		ATeamPanel.add(fours);
		
		fours_1 = new JTextField();
		fours_1.setHorizontalAlignment(SwingConstants.CENTER);
		fours_1.setText("0");
		fours_1.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		fours_1.setBackground(new Color(240, 255, 255));
		fours_1.setColumns(4);
		fours_1.setBounds(426, 31, 33, 20);
		ATeamPanel.add(fours_1);
		
		fours_2 = new JTextField();
		fours_2.setHorizontalAlignment(SwingConstants.CENTER);
		fours_2.setText("0");
		fours_2.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		fours_2.setBackground(new Color(240, 255, 255));
		fours_2.setColumns(4);
		fours_2.setBounds(426, 62, 33, 20);
		ATeamPanel.add(fours_2);
		
		fours_3 = new JTextField();
		fours_3.setHorizontalAlignment(SwingConstants.CENTER);
		fours_3.setText("0");
		fours_3.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		fours_3.setBackground(new Color(240, 255, 255));
		fours_3.setColumns(4);
		fours_3.setBounds(426, 93, 33, 20);
		ATeamPanel.add(fours_3);
		
		fours_4 = new JTextField();
		fours_4.setHorizontalAlignment(SwingConstants.CENTER);
		fours_4.setText("0");
		fours_4.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		fours_4.setBackground(new Color(240, 255, 255));
		fours_4.setColumns(4);
		fours_4.setBounds(426, 124, 33, 20);
		ATeamPanel.add(fours_4);
		
		fours_5 = new JTextField();
		fours_5.setHorizontalAlignment(SwingConstants.CENTER);
		fours_5.setText("0");
		fours_5.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		fours_5.setBackground(new Color(240, 255, 255));
		fours_5.setColumns(4);
		fours_5.setBounds(426, 155, 33, 20);
		ATeamPanel.add(fours_5);
		
		fours_6 = new JTextField();
		fours_6.setHorizontalAlignment(SwingConstants.CENTER);
		fours_6.setText("0");
		fours_6.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		fours_6.setBackground(new Color(240, 255, 255));
		fours_6.setColumns(4);
		fours_6.setBounds(426, 186, 33, 20);
		ATeamPanel.add(fours_6);
		
		fours_7 = new JTextField();
		fours_7.setHorizontalAlignment(SwingConstants.CENTER);
		fours_7.setText("0");
		fours_7.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		fours_7.setBackground(new Color(240, 255, 255));
		fours_7.setColumns(4);
		fours_7.setBounds(426, 217, 33, 20);
		ATeamPanel.add(fours_7);
		
		fours_8 = new JTextField();
		fours_8.setHorizontalAlignment(SwingConstants.CENTER);
		fours_8.setText("0");
		fours_8.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		fours_8.setBackground(new Color(240, 255, 255));
		fours_8.setColumns(4);
		fours_8.setBounds(426, 248, 33, 20);
		ATeamPanel.add(fours_8);
		
		fours_9 = new JTextField();
		fours_9.setHorizontalAlignment(SwingConstants.CENTER);
		fours_9.setText("0");
		fours_9.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		fours_9.setBackground(new Color(240, 255, 255));
		fours_9.setColumns(4);
		fours_9.setBounds(426, 279, 33, 20);
		ATeamPanel.add(fours_9);
		
		fours_10 = new JTextField();
		fours_10.setHorizontalAlignment(SwingConstants.CENTER);
		fours_10.setText("0");
		fours_10.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		fours_10.setBackground(new Color(240, 255, 255));
		fours_10.setColumns(4);
		fours_10.setBounds(426, 310, 33, 20);
		ATeamPanel.add(fours_10);
		
		sixes = new JTextField();
		sixes.setHorizontalAlignment(SwingConstants.CENTER);
		sixes.setText("0");
		sixes.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		sixes.setBackground(new Color(240, 255, 255));
		sixes.setColumns(4);
		sixes.setBounds(469, 0, 33, 20);
		ATeamPanel.add(sixes);
		
		sixes_1 = new JTextField();
		sixes_1.setHorizontalAlignment(SwingConstants.CENTER);
		sixes_1.setText("0");
		sixes_1.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		sixes_1.setBackground(new Color(240, 255, 255));
		sixes_1.setColumns(4);
		sixes_1.setBounds(469, 31, 33, 20);
		ATeamPanel.add(sixes_1);
		
		sixes_2 = new JTextField();
		sixes_2.setHorizontalAlignment(SwingConstants.CENTER);
		sixes_2.setText("0");
		sixes_2.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		sixes_2.setBackground(new Color(240, 255, 255));
		sixes_2.setColumns(4);
		sixes_2.setBounds(469, 62, 33, 20);
		ATeamPanel.add(sixes_2);
		
		sixes_3 = new JTextField();
		sixes_3.setHorizontalAlignment(SwingConstants.CENTER);
		sixes_3.setText("0");
		sixes_3.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		sixes_3.setBackground(new Color(240, 255, 255));
		sixes_3.setColumns(4);
		sixes_3.setBounds(469, 93, 33, 20);
		ATeamPanel.add(sixes_3);
		
		sixes_4 = new JTextField();
		sixes_4.setHorizontalAlignment(SwingConstants.CENTER);
		sixes_4.setText("0");
		sixes_4.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		sixes_4.setBackground(new Color(240, 255, 255));
		sixes_4.setColumns(4);
		sixes_4.setBounds(469, 124, 33, 20);
		ATeamPanel.add(sixes_4);
		
		sixes_5 = new JTextField();
		sixes_5.setHorizontalAlignment(SwingConstants.CENTER);
		sixes_5.setText("0");
		sixes_5.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		sixes_5.setBackground(new Color(240, 255, 255));
		sixes_5.setColumns(4);
		sixes_5.setBounds(469, 155, 33, 20);
		ATeamPanel.add(sixes_5);
		
		sixes_6 = new JTextField();
		sixes_6.setHorizontalAlignment(SwingConstants.CENTER);
		sixes_6.setText("0");
		sixes_6.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		sixes_6.setBackground(new Color(240, 255, 255));
		sixes_6.setColumns(4);
		sixes_6.setBounds(469, 186, 33, 20);
		ATeamPanel.add(sixes_6);
		
		sixes_7 = new JTextField();
		sixes_7.setHorizontalAlignment(SwingConstants.CENTER);
		sixes_7.setText("0");
		sixes_7.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		sixes_7.setBackground(new Color(240, 255, 255));
		sixes_7.setColumns(4);
		sixes_7.setBounds(469, 217, 33, 20);
		ATeamPanel.add(sixes_7);
		
		sixes_8 = new JTextField();
		sixes_8.setHorizontalAlignment(SwingConstants.CENTER);
		sixes_8.setText("0");
		sixes_8.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		sixes_8.setBackground(new Color(240, 255, 255));
		sixes_8.setColumns(4);
		sixes_8.setBounds(469, 248, 33, 20);
		ATeamPanel.add(sixes_8);
		
		sixes_9 = new JTextField();
		sixes_9.setHorizontalAlignment(SwingConstants.CENTER);
		sixes_9.setText("0");
		sixes_9.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		sixes_9.setBackground(new Color(240, 255, 255));
		sixes_9.setColumns(4);
		sixes_9.setBounds(469, 279, 33, 20);
		ATeamPanel.add(sixes_9);
		
		sixes_10 = new JTextField();
		sixes_10.setHorizontalAlignment(SwingConstants.CENTER);
		sixes_10.setText("0");
		sixes_10.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		sixes_10.setBackground(new Color(240, 255, 255));
		sixes_10.setColumns(4);
		sixes_10.setBounds(469, 310, 33, 20);
		ATeamPanel.add(sixes_10);
		
		wide = new JTextField();
		wide.setHorizontalAlignment(SwingConstants.CENTER);
		wide.setText("0");
		wide.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		wide.setBackground(new Color(240, 255, 255));
		wide.setColumns(4);
		wide.setBounds(518, 0, 33, 20);
		ATeamPanel.add(wide);
		
		wide_1 = new JTextField();
		wide_1.setHorizontalAlignment(SwingConstants.CENTER);
		wide_1.setText("0");
		wide_1.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		wide_1.setBackground(new Color(240, 255, 255));
		wide_1.setColumns(4);
		wide_1.setBounds(518, 31, 33, 20);
		ATeamPanel.add(wide_1);
		
		wide_2 = new JTextField();
		wide_2.setHorizontalAlignment(SwingConstants.CENTER);
		wide_2.setText("0");
		wide_2.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		wide_2.setBackground(new Color(240, 255, 255));
		wide_2.setColumns(4);
		wide_2.setBounds(518, 62, 33, 20);
		ATeamPanel.add(wide_2);
		
		wide_3 = new JTextField();
		wide_3.setHorizontalAlignment(SwingConstants.CENTER);
		wide_3.setText("0");
		wide_3.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		wide_3.setBackground(new Color(240, 255, 255));
		wide_3.setColumns(4);
		wide_3.setBounds(518, 93, 33, 20);
		ATeamPanel.add(wide_3);
		
		wide_4 = new JTextField();
		wide_4.setHorizontalAlignment(SwingConstants.CENTER);
		wide_4.setText("0");
		wide_4.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		wide_4.setBackground(new Color(240, 255, 255));
		wide_4.setColumns(4);
		wide_4.setBounds(518, 124, 33, 20);
		ATeamPanel.add(wide_4);
		
		wide_5 = new JTextField();
		wide_5.setHorizontalAlignment(SwingConstants.CENTER);
		wide_5.setText("0");
		wide_5.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		wide_5.setBackground(new Color(240, 255, 255));
		wide_5.setColumns(4);
		wide_5.setBounds(518, 155, 33, 20);
		ATeamPanel.add(wide_5);
		
		wide_6 = new JTextField();
		wide_6.setHorizontalAlignment(SwingConstants.CENTER);
		wide_6.setText("0");
		wide_6.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		wide_6.setBackground(new Color(240, 255, 255));
		wide_6.setColumns(4);
		wide_6.setBounds(518, 186, 33, 20);
		ATeamPanel.add(wide_6);
		
		wide_7 = new JTextField();
		wide_7.setHorizontalAlignment(SwingConstants.CENTER);
		wide_7.setText("0");
		wide_7.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		wide_7.setBackground(new Color(240, 255, 255));
		wide_7.setColumns(4);
		wide_7.setBounds(518, 217, 33, 20);
		ATeamPanel.add(wide_7);
		
		wide_8 = new JTextField();
		wide_8.setHorizontalAlignment(SwingConstants.CENTER);
		wide_8.setText("0");
		wide_8.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		wide_8.setBackground(new Color(240, 255, 255));
		wide_8.setColumns(4);
		wide_8.setBounds(518, 248, 33, 20);
		ATeamPanel.add(wide_8);
		
		wide_9 = new JTextField();
		wide_9.setHorizontalAlignment(SwingConstants.CENTER);
		wide_9.setText("0");
		wide_9.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		wide_9.setBackground(new Color(240, 255, 255));
		wide_9.setColumns(4);
		wide_9.setBounds(518, 279, 33, 20);
		ATeamPanel.add(wide_9);
		
		wide_10 = new JTextField();
		wide_10.setHorizontalAlignment(SwingConstants.CENTER);
		wide_10.setText("0");
		wide_10.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		wide_10.setBackground(new Color(240, 255, 255));
		wide_10.setColumns(4);
		wide_10.setBounds(518, 310, 33, 20);
		ATeamPanel.add(wide_10);
		
		nballs = new JTextField();
		nballs.setHorizontalAlignment(SwingConstants.CENTER);
		nballs.setText("0");
		nballs.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		nballs.setBackground(new Color(240, 255, 255));
		nballs.setColumns(4);
		nballs.setBounds(567, 0, 33, 20);
		ATeamPanel.add(nballs);
		
		nballs_1 = new JTextField();
		nballs_1.setHorizontalAlignment(SwingConstants.CENTER);
		nballs_1.setText("0");
		nballs_1.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		nballs_1.setBackground(new Color(240, 255, 255));
		nballs_1.setColumns(4);
		nballs_1.setBounds(567, 31, 33, 20);
		ATeamPanel.add(nballs_1);
		
		nballs_2 = new JTextField();
		nballs_2.setHorizontalAlignment(SwingConstants.CENTER);
		nballs_2.setText("0");
		nballs_2.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		nballs_2.setBackground(new Color(240, 255, 255));
		nballs_2.setColumns(4);
		nballs_2.setBounds(567, 62, 33, 20);
		ATeamPanel.add(nballs_2);
		
		nballs_3 = new JTextField();
		nballs_3.setHorizontalAlignment(SwingConstants.CENTER);
		nballs_3.setText("0");
		nballs_3.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		nballs_3.setBackground(new Color(240, 255, 255));
		nballs_3.setColumns(4);
		nballs_3.setBounds(567, 93, 33, 20);
		ATeamPanel.add(nballs_3);
		
		nballs_4 = new JTextField();
		nballs_4.setHorizontalAlignment(SwingConstants.CENTER);
		nballs_4.setText("0");
		nballs_4.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		nballs_4.setBackground(new Color(240, 255, 255));
		nballs_4.setColumns(4);
		nballs_4.setBounds(567, 124, 33, 20);
		ATeamPanel.add(nballs_4);
		
		nballs_5 = new JTextField();
		nballs_5.setHorizontalAlignment(SwingConstants.CENTER);
		nballs_5.setText("0");
		nballs_5.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		nballs_5.setBackground(new Color(240, 255, 255));
		nballs_5.setColumns(4);
		nballs_5.setBounds(567, 155, 33, 20);
		ATeamPanel.add(nballs_5);
		
		nballs_6 = new JTextField();
		nballs_6.setHorizontalAlignment(SwingConstants.CENTER);
		nballs_6.setText("0");
		nballs_6.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		nballs_6.setBackground(new Color(240, 255, 255));
		nballs_6.setColumns(4);
		nballs_6.setBounds(567, 186, 33, 20);
		ATeamPanel.add(nballs_6);
		
		nballs_7 = new JTextField();
		nballs_7.setHorizontalAlignment(SwingConstants.CENTER);
		nballs_7.setText("0");
		nballs_7.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		nballs_7.setBackground(new Color(240, 255, 255));
		nballs_7.setColumns(4);
		nballs_7.setBounds(567, 217, 33, 20);
		ATeamPanel.add(nballs_7);
		
		nballs_8 = new JTextField();
		nballs_8.setHorizontalAlignment(SwingConstants.CENTER);
		nballs_8.setText("0");
		nballs_8.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		nballs_8.setBackground(new Color(240, 255, 255));
		nballs_8.setColumns(4);
		nballs_8.setBounds(567, 248, 33, 20);
		ATeamPanel.add(nballs_8);
		
		nballs_9 = new JTextField();
		nballs_9.setHorizontalAlignment(SwingConstants.CENTER);
		nballs_9.setText("0");
		nballs_9.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		nballs_9.setBackground(new Color(240, 255, 255));
		nballs_9.setColumns(4);
		nballs_9.setBounds(567, 279, 33, 20);
		ATeamPanel.add(nballs_9);
		
		nballs_10 = new JTextField();
		nballs_10.setHorizontalAlignment(SwingConstants.CENTER);
		nballs_10.setText("0");
		nballs_10.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		nballs_10.setBackground(new Color(240, 255, 255));
		nballs_10.setColumns(4);
		nballs_10.setBounds(567, 310, 33, 20);
		ATeamPanel.add(nballs_10);
		
		Canvas canvas_1 = new Canvas();
		canvas_1.setBackground(new Color(192, 192, 192));
		canvas_1.setBounds(174, 0, 1, 339);
		ATeamPanel.add(canvas_1);
		
		Canvas canvas_1_1 = new Canvas();
		canvas_1_1.setBackground(new Color(192, 192, 192));
		canvas_1_1.setBounds(281, 0, 1, 339);
		ATeamPanel.add(canvas_1_1);
		
		Canvas canvas_1_1_1 = new Canvas();
		canvas_1_1_1.setBackground(Color.LIGHT_GRAY);
		canvas_1_1_1.setBounds(409, 0, 1, 339);
		ATeamPanel.add(canvas_1_1_1);
		
		Canvas canvas_1_1_1_1 = new Canvas();
		canvas_1_1_1_1.setBackground(Color.LIGHT_GRAY);
		canvas_1_1_1_1.setBounds(509, 0, 1, 339);
		ATeamPanel.add(canvas_1_1_1_1);
		
		AbR = new JTextField();
		AbR.setHorizontalAlignment(SwingConstants.CENTER);
		AbR.setText("0");
		AbR.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		AbR.setColumns(4);
		AbR.setBackground(new Color(240, 255, 255));
		AbR.setBounds(329, 0, 33, 20);
		ATeamPanel.add(AbR);
		
		AbR_1 = new JTextField();
		AbR_1.setHorizontalAlignment(SwingConstants.CENTER);
		AbR_1.setText("0");
		AbR_1.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		AbR_1.setColumns(4);
		AbR_1.setBackground(new Color(240, 255, 255));
		AbR_1.setBounds(329, 31, 33, 20);
		ATeamPanel.add(AbR_1);
		
		AbR_2 = new JTextField();
		AbR_2.setHorizontalAlignment(SwingConstants.CENTER);
		AbR_2.setText("0");
		AbR_2.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		AbR_2.setColumns(4);
		AbR_2.setBackground(new Color(240, 255, 255));
		AbR_2.setBounds(329, 62, 33, 20);
		ATeamPanel.add(AbR_2);
		
		AbR_3 = new JTextField();
		AbR_3.setHorizontalAlignment(SwingConstants.CENTER);
		AbR_3.setText("0");
		AbR_3.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		AbR_3.setColumns(4);
		AbR_3.setBackground(new Color(240, 255, 255));
		AbR_3.setBounds(329, 92, 33, 20);
		ATeamPanel.add(AbR_3);
		
		AbR_4 = new JTextField();
		AbR_4.setHorizontalAlignment(SwingConstants.CENTER);
		AbR_4.setText("0");
		AbR_4.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		AbR_4.setColumns(4);
		AbR_4.setBackground(new Color(240, 255, 255));
		AbR_4.setBounds(329, 124, 33, 20);
		ATeamPanel.add(AbR_4);
		
		AbR_5 = new JTextField();
		AbR_5.setHorizontalAlignment(SwingConstants.CENTER);
		AbR_5.setText("0");
		AbR_5.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		AbR_5.setColumns(4);
		AbR_5.setBackground(new Color(240, 255, 255));
		AbR_5.setBounds(329, 155, 33, 20);
		ATeamPanel.add(AbR_5);
		
		AbR_6 = new JTextField();
		AbR_6.setHorizontalAlignment(SwingConstants.CENTER);
		AbR_6.setText("0");
		AbR_6.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		AbR_6.setColumns(4);
		AbR_6.setBackground(new Color(240, 255, 255));
		AbR_6.setBounds(329, 186, 33, 20);
		ATeamPanel.add(AbR_6);
		
		AbR_7 = new JTextField();
		AbR_7.setHorizontalAlignment(SwingConstants.CENTER);
		AbR_7.setText("0");
		AbR_7.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		AbR_7.setColumns(4);
		AbR_7.setBackground(new Color(240, 255, 255));
		AbR_7.setBounds(329, 218, 33, 20);
		ATeamPanel.add(AbR_7);
		
		AbR_8 = new JTextField();
		AbR_8.setHorizontalAlignment(SwingConstants.CENTER);
		AbR_8.setText("0");
		AbR_8.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		AbR_8.setColumns(4);
		AbR_8.setBackground(new Color(240, 255, 255));
		AbR_8.setBounds(329, 248, 33, 20);
		ATeamPanel.add(AbR_8);
		
		AbR_9 = new JTextField();
		AbR_9.setHorizontalAlignment(SwingConstants.CENTER);
		AbR_9.setText("0");
		AbR_9.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		AbR_9.setColumns(4);
		AbR_9.setBackground(new Color(240, 255, 255));
		AbR_9.setBounds(329, 279, 33, 20);
		ATeamPanel.add(AbR_9);
		
		AbR_10 = new JTextField();
		AbR_10.setHorizontalAlignment(SwingConstants.CENTER);
		AbR_10.setText("0");
		AbR_10.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		AbR_10.setColumns(4);
		AbR_10.setBackground(new Color(240, 255, 255));
		AbR_10.setBounds(329, 310, 33, 20);
		ATeamPanel.add(AbR_10);
		
		ATeamPanel_1 = new Panel();
		ATeamPanel_1.setLayout(null);
		ATeamPanel_1.setBackground(new Color(255, 255, 255));
		ATeamPanel_1.setBounds(638, 215, 616, 339);
		frmPowerplayMatchmakerV.getContentPane().add(ATeamPanel_1);
		
		BPlayerName = new JTextField();
		BPlayerName.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		BPlayerName.setBackground(new Color(255, 228, 225));
		BPlayerName.setColumns(64);
		BPlayerName.setBounds(0, 0, 164, 20);
		ATeamPanel_1.add(BPlayerName);
		
		BPlayerName_1 = new JTextField();
		BPlayerName_1.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		BPlayerName_1.setBackground(new Color(255, 228, 225));
		BPlayerName_1.setColumns(64);
		BPlayerName_1.setBounds(0, 31, 164, 20);
		ATeamPanel_1.add(BPlayerName_1);
		
		BPlayerName_2 = new JTextField();
		BPlayerName_2.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		BPlayerName_2.setBackground(new Color(255, 228, 225));
		BPlayerName_2.setColumns(64);
		BPlayerName_2.setBounds(0, 62, 164, 20);
		ATeamPanel_1.add(BPlayerName_2);
		
		BPlayerName_3 = new JTextField();
		BPlayerName_3.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		BPlayerName_3.setBackground(new Color(255, 228, 225));
		BPlayerName_3.setColumns(64);
		BPlayerName_3.setBounds(0, 93, 164, 20);
		ATeamPanel_1.add(BPlayerName_3);
		
		BPlayerName_4 = new JTextField();
		BPlayerName_4.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		BPlayerName_4.setBackground(new Color(255, 228, 225));
		BPlayerName_4.setColumns(64);
		BPlayerName_4.setBounds(0, 124, 164, 20);
		ATeamPanel_1.add(BPlayerName_4);
		
		BPlayerName_5 = new JTextField();
		BPlayerName_5.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		BPlayerName_5.setBackground(new Color(255, 228, 225));
		BPlayerName_5.setColumns(64);
		BPlayerName_5.setBounds(0, 155, 164, 20);
		ATeamPanel_1.add(BPlayerName_5);
		
		BPlayerName_6 = new JTextField();
		BPlayerName_6.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		BPlayerName_6.setBackground(new Color(255, 228, 225));
		BPlayerName_6.setColumns(64);
		BPlayerName_6.setBounds(0, 186, 164, 20);
		ATeamPanel_1.add(BPlayerName_6);
		
		BPlayerName_7 = new JTextField();
		BPlayerName_7.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		BPlayerName_7.setBackground(new Color(255, 228, 225));
		BPlayerName_7.setColumns(64);
		BPlayerName_7.setBounds(0, 217, 164, 20);
		ATeamPanel_1.add(BPlayerName_7);
		
		BPlayerName_8 = new JTextField();
		BPlayerName_8.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		BPlayerName_8.setBackground(new Color(255, 228, 225));
		BPlayerName_8.setColumns(64);
		BPlayerName_8.setBounds(0, 248, 164, 20);
		ATeamPanel_1.add(BPlayerName_8);
		
		BPlayerName_9 = new JTextField();
		BPlayerName_9.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		BPlayerName_9.setBackground(new Color(255, 228, 225));
		BPlayerName_9.setColumns(64);
		BPlayerName_9.setBounds(0, 279, 164, 20);
		ATeamPanel_1.add(BPlayerName_9);
		
		BPlayerName_10 = new JTextField();
		BPlayerName_10.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		BPlayerName_10.setBackground(new Color(255, 228, 225));
		BPlayerName_10.setColumns(64);
		BPlayerName_10.setBounds(0, 310, 164, 20);
		ATeamPanel_1.add(BPlayerName_10);
		
		Bruns_11 = new JTextField();
		Bruns_11.setText("0");
		Bruns_11.setHorizontalAlignment(SwingConstants.CENTER);
		Bruns_11.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		Bruns_11.setBackground(new Color(255, 228, 225));
		Bruns_11.setColumns(10);
		Bruns_11.setBounds(186, 0, 45, 20);
		ATeamPanel_1.add(Bruns_11);
		
		Bruns_12 = new JTextField();
		Bruns_12.setText("0");
		Bruns_12.setHorizontalAlignment(SwingConstants.CENTER);
		Bruns_12.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		Bruns_12.setBackground(new Color(255, 228, 225));
		Bruns_12.setColumns(10);
		Bruns_12.setBounds(186, 31, 45, 20);
		ATeamPanel_1.add(Bruns_12);
		
		Bruns_13 = new JTextField();
		Bruns_13.setText("0");
		Bruns_13.setHorizontalAlignment(SwingConstants.CENTER);
		Bruns_13.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		Bruns_13.setBackground(new Color(255, 228, 225));
		Bruns_13.setColumns(10);
		Bruns_13.setBounds(186, 62, 45, 20);
		ATeamPanel_1.add(Bruns_13);
		
		Bruns_14 = new JTextField();
		Bruns_14.setText("0");
		Bruns_14.setHorizontalAlignment(SwingConstants.CENTER);
		Bruns_14.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		Bruns_14.setBackground(new Color(255, 228, 225));
		Bruns_14.setColumns(10);
		Bruns_14.setBounds(186, 93, 45, 20);
		ATeamPanel_1.add(Bruns_14);
		
		Bruns_15 = new JTextField();
		Bruns_15.setText("0");
		Bruns_15.setHorizontalAlignment(SwingConstants.CENTER);
		Bruns_15.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		Bruns_15.setBackground(new Color(255, 228, 225));
		Bruns_15.setColumns(10);
		Bruns_15.setBounds(186, 124, 45, 20);
		ATeamPanel_1.add(Bruns_15);
		
		Bruns_16 = new JTextField();
		Bruns_16.setText("0");
		Bruns_16.setHorizontalAlignment(SwingConstants.CENTER);
		Bruns_16.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		Bruns_16.setBackground(new Color(255, 228, 225));
		Bruns_16.setColumns(10);
		Bruns_16.setBounds(186, 155, 45, 20);
		ATeamPanel_1.add(Bruns_16);
		
		Bruns_17 = new JTextField();
		Bruns_17.setText("0");
		Bruns_17.setHorizontalAlignment(SwingConstants.CENTER);
		Bruns_17.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		Bruns_17.setBackground(new Color(255, 228, 225));
		Bruns_17.setColumns(10);
		Bruns_17.setBounds(186, 186, 45, 20);
		ATeamPanel_1.add(Bruns_17);
		
		Bruns_18 = new JTextField();
		Bruns_18.setText("0");
		Bruns_18.setHorizontalAlignment(SwingConstants.CENTER);
		Bruns_18.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		Bruns_18.setBackground(new Color(255, 228, 225));
		Bruns_18.setColumns(10);
		Bruns_18.setBounds(186, 217, 45, 20);
		ATeamPanel_1.add(Bruns_18);
		
		Bruns_19 = new JTextField();
		Bruns_19.setText("0");
		Bruns_19.setHorizontalAlignment(SwingConstants.CENTER);
		Bruns_19.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		Bruns_19.setBackground(new Color(255, 228, 225));
		Bruns_19.setColumns(10);
		Bruns_19.setBounds(186, 248, 45, 20);
		ATeamPanel_1.add(Bruns_19);
		
		Bruns_20 = new JTextField();
		Bruns_20.setText("0");
		Bruns_20.setHorizontalAlignment(SwingConstants.CENTER);
		Bruns_20.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		Bruns_20.setBackground(new Color(255, 228, 225));
		Bruns_20.setColumns(10);
		Bruns_20.setBounds(186, 279, 45, 20);
		ATeamPanel_1.add(Bruns_20);
		
		Bruns_21 = new JTextField();
		Bruns_21.setText("0");
		Bruns_21.setHorizontalAlignment(SwingConstants.CENTER);
		Bruns_21.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		Bruns_21.setBackground(new Color(255, 228, 225));
		Bruns_21.setColumns(10);
		Bruns_21.setBounds(186, 310, 45, 20);
		ATeamPanel_1.add(Bruns_21);
		
		Bballs_22 = new JTextField();
		Bballs_22.setText("0");
		Bballs_22.setHorizontalAlignment(SwingConstants.CENTER);
		Bballs_22.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		Bballs_22.setBackground(new Color(255, 228, 225));
		Bballs_22.setColumns(10);
		Bballs_22.setBounds(239, 0, 33, 20);
		ATeamPanel_1.add(Bballs_22);
		
		Bballs_23 = new JTextField();
		Bballs_23.setText("0");
		Bballs_23.setHorizontalAlignment(SwingConstants.CENTER);
		Bballs_23.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		Bballs_23.setBackground(new Color(255, 228, 225));
		Bballs_23.setColumns(10);
		Bballs_23.setBounds(239, 31, 33, 20);
		ATeamPanel_1.add(Bballs_23);
		
		Bballs_24 = new JTextField();
		Bballs_24.setText("0");
		Bballs_24.setHorizontalAlignment(SwingConstants.CENTER);
		Bballs_24.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		Bballs_24.setBackground(new Color(255, 228, 225));
		Bballs_24.setColumns(10);
		Bballs_24.setBounds(239, 62, 33, 20);
		ATeamPanel_1.add(Bballs_24);
		
		Bballs_25 = new JTextField();
		Bballs_25.setText("0");
		Bballs_25.setHorizontalAlignment(SwingConstants.CENTER);
		Bballs_25.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		Bballs_25.setBackground(new Color(255, 228, 225));
		Bballs_25.setColumns(10);
		Bballs_25.setBounds(239, 93, 33, 20);
		ATeamPanel_1.add(Bballs_25);
		
		Bballs_26 = new JTextField();
		Bballs_26.setText("0");
		Bballs_26.setHorizontalAlignment(SwingConstants.CENTER);
		Bballs_26.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		Bballs_26.setBackground(new Color(255, 228, 225));
		Bballs_26.setColumns(10);
		Bballs_26.setBounds(239, 124, 33, 20);
		ATeamPanel_1.add(Bballs_26);
		
		Bballs_27 = new JTextField();
		Bballs_27.setText("0");
		Bballs_27.setHorizontalAlignment(SwingConstants.CENTER);
		Bballs_27.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		Bballs_27.setBackground(new Color(255, 228, 225));
		Bballs_27.setColumns(10);
		Bballs_27.setBounds(239, 155, 33, 20);
		ATeamPanel_1.add(Bballs_27);
		
		Bballs_28 = new JTextField();
		Bballs_28.setText("0");
		Bballs_28.setHorizontalAlignment(SwingConstants.CENTER);
		Bballs_28.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		Bballs_28.setBackground(new Color(255, 228, 225));
		Bballs_28.setColumns(10);
		Bballs_28.setBounds(239, 186, 33, 20);
		ATeamPanel_1.add(Bballs_28);
		
		Bballs_29 = new JTextField();
		Bballs_29.setText("0");
		Bballs_29.setHorizontalAlignment(SwingConstants.CENTER);
		Bballs_29.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		Bballs_29.setBackground(new Color(255, 228, 225));
		Bballs_29.setColumns(10);
		Bballs_29.setBounds(239, 217, 33, 20);
		ATeamPanel_1.add(Bballs_29);
		
		Bballs_30 = new JTextField();
		Bballs_30.setText("0");
		Bballs_30.setHorizontalAlignment(SwingConstants.CENTER);
		Bballs_30.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		Bballs_30.setBackground(new Color(255, 228, 225));
		Bballs_30.setColumns(10);
		Bballs_30.setBounds(239, 248, 33, 20);
		ATeamPanel_1.add(Bballs_30);
		
		Bballs_31 = new JTextField();
		Bballs_31.setText("0");
		Bballs_31.setHorizontalAlignment(SwingConstants.CENTER);
		Bballs_31.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		Bballs_31.setBackground(new Color(255, 228, 225));
		Bballs_31.setColumns(10);
		Bballs_31.setBounds(239, 279, 33, 20);
		ATeamPanel_1.add(Bballs_31);
		
		Bballs_32 = new JTextField();
		Bballs_32.setText("0");
		Bballs_32.setHorizontalAlignment(SwingConstants.CENTER);
		Bballs_32.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		Bballs_32.setBackground(new Color(255, 228, 225));
		Bballs_32.setColumns(10);
		Bballs_32.setBounds(239, 310, 33, 20);
		ATeamPanel_1.add(Bballs_32);
		
		wickets_33 = new JTextField();
		wickets_33.setText("0");
		wickets_33.setHorizontalAlignment(SwingConstants.CENTER);
		wickets_33.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		wickets_33.setBackground(new Color(255, 228, 225));
		wickets_33.setColumns(10);
		wickets_33.setBounds(282, 0, 33, 20);
		ATeamPanel_1.add(wickets_33);
		
		wickets_34 = new JTextField();
		wickets_34.setText("0");
		wickets_34.setHorizontalAlignment(SwingConstants.CENTER);
		wickets_34.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		wickets_34.setBackground(new Color(255, 228, 225));
		wickets_34.setColumns(10);
		wickets_34.setBounds(282, 31, 33, 20);
		ATeamPanel_1.add(wickets_34);
		
		wickets_35 = new JTextField();
		wickets_35.setText("0");
		wickets_35.setHorizontalAlignment(SwingConstants.CENTER);
		wickets_35.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		wickets_35.setBackground(new Color(255, 228, 225));
		wickets_35.setColumns(10);
		wickets_35.setBounds(282, 62, 33, 20);
		ATeamPanel_1.add(wickets_35);
		
		wickets_36 = new JTextField();
		wickets_36.setText("0");
		wickets_36.setHorizontalAlignment(SwingConstants.CENTER);
		wickets_36.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		wickets_36.setBackground(new Color(255, 228, 225));
		wickets_36.setColumns(10);
		wickets_36.setBounds(282, 93, 33, 20);
		ATeamPanel_1.add(wickets_36);
		
		wickets_37 = new JTextField();
		wickets_37.setText("0");
		wickets_37.setHorizontalAlignment(SwingConstants.CENTER);
		wickets_37.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		wickets_37.setBackground(new Color(255, 228, 225));
		wickets_37.setColumns(10);
		wickets_37.setBounds(282, 124, 33, 20);
		ATeamPanel_1.add(wickets_37);
		
		wickets_38 = new JTextField();
		wickets_38.setText("0");
		wickets_38.setHorizontalAlignment(SwingConstants.CENTER);
		wickets_38.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		wickets_38.setBackground(new Color(255, 228, 225));
		wickets_38.setColumns(10);
		wickets_38.setBounds(282, 155, 33, 20);
		ATeamPanel_1.add(wickets_38);
		
		wickets_39 = new JTextField();
		wickets_39.setText("0");
		wickets_39.setHorizontalAlignment(SwingConstants.CENTER);
		wickets_39.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		wickets_39.setBackground(new Color(255, 228, 225));
		wickets_39.setColumns(10);
		wickets_39.setBounds(282, 186, 33, 20);
		ATeamPanel_1.add(wickets_39);
		
		wickets_40 = new JTextField();
		wickets_40.setText("0");
		wickets_40.setHorizontalAlignment(SwingConstants.CENTER);
		wickets_40.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		wickets_40.setBackground(new Color(255, 228, 225));
		wickets_40.setColumns(10);
		wickets_40.setBounds(282, 217, 33, 20);
		ATeamPanel_1.add(wickets_40);
		
		wickets_41 = new JTextField();
		wickets_41.setText("0");
		wickets_41.setHorizontalAlignment(SwingConstants.CENTER);
		wickets_41.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		wickets_41.setBackground(new Color(255, 228, 225));
		wickets_41.setColumns(10);
		wickets_41.setBounds(282, 248, 33, 20);
		ATeamPanel_1.add(wickets_41);
		
		wickets_42 = new JTextField();
		wickets_42.setText("0");
		wickets_42.setHorizontalAlignment(SwingConstants.CENTER);
		wickets_42.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		wickets_42.setBackground(new Color(255, 228, 225));
		wickets_42.setColumns(10);
		wickets_42.setBounds(282, 279, 33, 20);
		ATeamPanel_1.add(wickets_42);
		
		wickets_43 = new JTextField();
		wickets_43.setText("0");
		wickets_43.setHorizontalAlignment(SwingConstants.CENTER);
		wickets_43.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		wickets_43.setBackground(new Color(255, 228, 225));
		wickets_43.setColumns(10);
		wickets_43.setBounds(282, 310, 33, 20);
		ATeamPanel_1.add(wickets_43);
		
		bowled_44 = new JTextField();
		bowled_44.setText("0");
		bowled_44.setHorizontalAlignment(SwingConstants.CENTER);
		bowled_44.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		bowled_44.setBackground(new Color(255, 228, 225));
		bowled_44.setColumns(10);
		bowled_44.setBounds(375, 0, 33, 20);
		ATeamPanel_1.add(bowled_44);
		
		bowled_45 = new JTextField();
		bowled_45.setText("0");
		bowled_45.setHorizontalAlignment(SwingConstants.CENTER);
		bowled_45.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		bowled_45.setBackground(new Color(255, 228, 225));
		bowled_45.setColumns(10);
		bowled_45.setBounds(375, 31, 33, 20);
		ATeamPanel_1.add(bowled_45);
		
		bowled_46 = new JTextField();
		bowled_46.setText("0");
		bowled_46.setHorizontalAlignment(SwingConstants.CENTER);
		bowled_46.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		bowled_46.setBackground(new Color(255, 228, 225));
		bowled_46.setColumns(10);
		bowled_46.setBounds(375, 62, 33, 20);
		ATeamPanel_1.add(bowled_46);
		
		bowled_47 = new JTextField();
		bowled_47.setText("0");
		bowled_47.setHorizontalAlignment(SwingConstants.CENTER);
		bowled_47.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		bowled_47.setBackground(new Color(255, 228, 225));
		bowled_47.setColumns(10);
		bowled_47.setBounds(375, 93, 33, 20);
		ATeamPanel_1.add(bowled_47);
		
		bowled_48 = new JTextField();
		bowled_48.setText("0");
		bowled_48.setHorizontalAlignment(SwingConstants.CENTER);
		bowled_48.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		bowled_48.setBackground(new Color(255, 228, 225));
		bowled_48.setColumns(10);
		bowled_48.setBounds(375, 124, 33, 20);
		ATeamPanel_1.add(bowled_48);
		
		bowled_49 = new JTextField();
		bowled_49.setText("0");
		bowled_49.setHorizontalAlignment(SwingConstants.CENTER);
		bowled_49.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		bowled_49.setBackground(new Color(255, 228, 225));
		bowled_49.setColumns(10);
		bowled_49.setBounds(375, 155, 33, 20);
		ATeamPanel_1.add(bowled_49);
		
		bowled_50 = new JTextField();
		bowled_50.setText("0");
		bowled_50.setHorizontalAlignment(SwingConstants.CENTER);
		bowled_50.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		bowled_50.setBackground(new Color(255, 228, 225));
		bowled_50.setColumns(10);
		bowled_50.setBounds(375, 186, 33, 20);
		ATeamPanel_1.add(bowled_50);
		
		bowled_51 = new JTextField();
		bowled_51.setText("0");
		bowled_51.setHorizontalAlignment(SwingConstants.CENTER);
		bowled_51.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		bowled_51.setBackground(new Color(255, 228, 225));
		bowled_51.setColumns(10);
		bowled_51.setBounds(375, 217, 33, 20);
		ATeamPanel_1.add(bowled_51);
		
		bowled_52 = new JTextField();
		bowled_52.setText("0");
		bowled_52.setHorizontalAlignment(SwingConstants.CENTER);
		bowled_52.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		bowled_52.setBackground(new Color(255, 228, 225));
		bowled_52.setColumns(10);
		bowled_52.setBounds(375, 248, 33, 20);
		ATeamPanel_1.add(bowled_52);
		
		bowled_53 = new JTextField();
		bowled_53.setText("0");
		bowled_53.setHorizontalAlignment(SwingConstants.CENTER);
		bowled_53.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		bowled_53.setBackground(new Color(255, 228, 225));
		bowled_53.setColumns(10);
		bowled_53.setBounds(375, 279, 33, 20);
		ATeamPanel_1.add(bowled_53);
		
		bowled_54 = new JTextField();
		bowled_54.setText("0");
		bowled_54.setHorizontalAlignment(SwingConstants.CENTER);
		bowled_54.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		bowled_54.setBackground(new Color(255, 228, 225));
		bowled_54.setColumns(10);
		bowled_54.setBounds(375, 310, 33, 20);
		ATeamPanel_1.add(bowled_54);
		
		fours_55 = new JTextField();
		fours_55.setText("0");
		fours_55.setHorizontalAlignment(SwingConstants.CENTER);
		fours_55.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		fours_55.setBackground(new Color(255, 228, 225));
		fours_55.setColumns(10);
		fours_55.setBounds(426, 0, 33, 20);
		ATeamPanel_1.add(fours_55);
		
		fours_56 = new JTextField();
		fours_56.setText("0");
		fours_56.setHorizontalAlignment(SwingConstants.CENTER);
		fours_56.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		fours_56.setBackground(new Color(255, 228, 225));
		fours_56.setColumns(10);
		fours_56.setBounds(426, 31, 33, 20);
		ATeamPanel_1.add(fours_56);
		
		fours_57 = new JTextField();
		fours_57.setText("0");
		fours_57.setHorizontalAlignment(SwingConstants.CENTER);
		fours_57.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		fours_57.setBackground(new Color(255, 228, 225));
		fours_57.setColumns(10);
		fours_57.setBounds(426, 62, 33, 20);
		ATeamPanel_1.add(fours_57);
		
		fours_58 = new JTextField();
		fours_58.setText("0");
		fours_58.setHorizontalAlignment(SwingConstants.CENTER);
		fours_58.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		fours_58.setBackground(new Color(255, 228, 225));
		fours_58.setColumns(10);
		fours_58.setBounds(426, 93, 33, 20);
		ATeamPanel_1.add(fours_58);
		
		fours_59 = new JTextField();
		fours_59.setText("0");
		fours_59.setHorizontalAlignment(SwingConstants.CENTER);
		fours_59.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		fours_59.setBackground(new Color(255, 228, 225));
		fours_59.setColumns(10);
		fours_59.setBounds(426, 124, 33, 20);
		ATeamPanel_1.add(fours_59);
		
		fours_60 = new JTextField();
		fours_60.setText("0");
		fours_60.setHorizontalAlignment(SwingConstants.CENTER);
		fours_60.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		fours_60.setBackground(new Color(255, 228, 225));
		fours_60.setColumns(10);
		fours_60.setBounds(426, 155, 33, 20);
		ATeamPanel_1.add(fours_60);
		
		fours_61 = new JTextField();
		fours_61.setText("0");
		fours_61.setHorizontalAlignment(SwingConstants.CENTER);
		fours_61.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		fours_61.setBackground(new Color(255, 228, 225));
		fours_61.setColumns(10);
		fours_61.setBounds(426, 186, 33, 20);
		ATeamPanel_1.add(fours_61);
		
		fours_62 = new JTextField();
		fours_62.setText("0");
		fours_62.setHorizontalAlignment(SwingConstants.CENTER);
		fours_62.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		fours_62.setBackground(new Color(255, 228, 225));
		fours_62.setColumns(10);
		fours_62.setBounds(426, 217, 33, 20);
		ATeamPanel_1.add(fours_62);
		
		fours_63 = new JTextField();
		fours_63.setText("0");
		fours_63.setHorizontalAlignment(SwingConstants.CENTER);
		fours_63.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		fours_63.setBackground(new Color(255, 228, 225));
		fours_63.setColumns(10);
		fours_63.setBounds(426, 248, 33, 20);
		ATeamPanel_1.add(fours_63);
		
		fours_64 = new JTextField();
		fours_64.setText("0");
		fours_64.setHorizontalAlignment(SwingConstants.CENTER);
		fours_64.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		fours_64.setBackground(new Color(255, 228, 225));
		fours_64.setColumns(10);
		fours_64.setBounds(426, 279, 33, 20);
		ATeamPanel_1.add(fours_64);
		
		fours_65 = new JTextField();
		fours_65.setText("0");
		fours_65.setHorizontalAlignment(SwingConstants.CENTER);
		fours_65.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		fours_65.setBackground(new Color(255, 228, 225));
		fours_65.setColumns(10);
		fours_65.setBounds(426, 310, 33, 20);
		ATeamPanel_1.add(fours_65);
		
		sixes_66 = new JTextField();
		sixes_66.setText("0");
		sixes_66.setHorizontalAlignment(SwingConstants.CENTER);
		sixes_66.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		sixes_66.setBackground(new Color(255, 228, 225));
		sixes_66.setColumns(10);
		sixes_66.setBounds(469, 0, 33, 20);
		ATeamPanel_1.add(sixes_66);
		
		sixes_67 = new JTextField();
		sixes_67.setText("0");
		sixes_67.setHorizontalAlignment(SwingConstants.CENTER);
		sixes_67.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		sixes_67.setBackground(new Color(255, 228, 225));
		sixes_67.setColumns(10);
		sixes_67.setBounds(469, 31, 33, 20);
		ATeamPanel_1.add(sixes_67);
		
		sixes_68 = new JTextField();
		sixes_68.setText("0");
		sixes_68.setHorizontalAlignment(SwingConstants.CENTER);
		sixes_68.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		sixes_68.setBackground(new Color(255, 228, 225));
		sixes_68.setColumns(10);
		sixes_68.setBounds(469, 62, 33, 20);
		ATeamPanel_1.add(sixes_68);
		
		sixes_69 = new JTextField();
		sixes_69.setText("0");
		sixes_69.setHorizontalAlignment(SwingConstants.CENTER);
		sixes_69.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		sixes_69.setBackground(new Color(255, 228, 225));
		sixes_69.setColumns(10);
		sixes_69.setBounds(469, 93, 33, 20);
		ATeamPanel_1.add(sixes_69);
		
		sixes_70 = new JTextField();
		sixes_70.setText("0");
		sixes_70.setHorizontalAlignment(SwingConstants.CENTER);
		sixes_70.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		sixes_70.setBackground(new Color(255, 228, 225));
		sixes_70.setColumns(10);
		sixes_70.setBounds(469, 124, 33, 20);
		ATeamPanel_1.add(sixes_70);
		
		sixes_71 = new JTextField();
		sixes_71.setText("0");
		sixes_71.setHorizontalAlignment(SwingConstants.CENTER);
		sixes_71.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		sixes_71.setBackground(new Color(255, 228, 225));
		sixes_71.setColumns(10);
		sixes_71.setBounds(469, 155, 33, 20);
		ATeamPanel_1.add(sixes_71);
		
		sixes_72 = new JTextField();
		sixes_72.setText("0");
		sixes_72.setHorizontalAlignment(SwingConstants.CENTER);
		sixes_72.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		sixes_72.setBackground(new Color(255, 228, 225));
		sixes_72.setColumns(10);
		sixes_72.setBounds(469, 186, 33, 20);
		ATeamPanel_1.add(sixes_72);
		
		sixes_73 = new JTextField();
		sixes_73.setText("0");
		sixes_73.setHorizontalAlignment(SwingConstants.CENTER);
		sixes_73.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		sixes_73.setBackground(new Color(255, 228, 225));
		sixes_73.setColumns(10);
		sixes_73.setBounds(469, 217, 33, 20);
		ATeamPanel_1.add(sixes_73);
		
		sixes_74 = new JTextField();
		sixes_74.setText("0");
		sixes_74.setHorizontalAlignment(SwingConstants.CENTER);
		sixes_74.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		sixes_74.setBackground(new Color(255, 228, 225));
		sixes_74.setColumns(10);
		sixes_74.setBounds(469, 248, 33, 20);
		ATeamPanel_1.add(sixes_74);
		
		sixes_75 = new JTextField();
		sixes_75.setText("0");
		sixes_75.setHorizontalAlignment(SwingConstants.CENTER);
		sixes_75.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		sixes_75.setBackground(new Color(255, 228, 225));
		sixes_75.setColumns(10);
		sixes_75.setBounds(469, 279, 33, 20);
		ATeamPanel_1.add(sixes_75);
		
		sixes_76 = new JTextField();
		sixes_76.setText("0");
		sixes_76.setHorizontalAlignment(SwingConstants.CENTER);
		sixes_76.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		sixes_76.setBackground(new Color(255, 228, 225));
		sixes_76.setColumns(10);
		sixes_76.setBounds(469, 310, 33, 20);
		ATeamPanel_1.add(sixes_76);
		
		wides_77 = new JTextField();
		wides_77.setText("0");
		wides_77.setHorizontalAlignment(SwingConstants.CENTER);
		wides_77.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		wides_77.setBackground(new Color(255, 228, 225));
		wides_77.setColumns(10);
		wides_77.setBounds(518, 0, 33, 20);
		ATeamPanel_1.add(wides_77);
		
		wides_78 = new JTextField();
		wides_78.setText("0");
		wides_78.setHorizontalAlignment(SwingConstants.CENTER);
		wides_78.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		wides_78.setBackground(new Color(255, 228, 225));
		wides_78.setColumns(10);
		wides_78.setBounds(518, 31, 33, 20);
		ATeamPanel_1.add(wides_78);
		
		wides_79 = new JTextField();
		wides_79.setText("0");
		wides_79.setHorizontalAlignment(SwingConstants.CENTER);
		wides_79.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		wides_79.setBackground(new Color(255, 228, 225));
		wides_79.setColumns(10);
		wides_79.setBounds(518, 62, 33, 20);
		ATeamPanel_1.add(wides_79);
		
		wides_80 = new JTextField();
		wides_80.setText("0");
		wides_80.setHorizontalAlignment(SwingConstants.CENTER);
		wides_80.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		wides_80.setBackground(new Color(255, 228, 225));
		wides_80.setColumns(10);
		wides_80.setBounds(518, 93, 33, 20);
		ATeamPanel_1.add(wides_80);
		
		wides_81 = new JTextField();
		wides_81.setText("0");
		wides_81.setHorizontalAlignment(SwingConstants.CENTER);
		wides_81.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		wides_81.setBackground(new Color(255, 228, 225));
		wides_81.setColumns(10);
		wides_81.setBounds(518, 124, 33, 20);
		ATeamPanel_1.add(wides_81);
		
		wides_82 = new JTextField();
		wides_82.setText("0");
		wides_82.setHorizontalAlignment(SwingConstants.CENTER);
		wides_82.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		wides_82.setBackground(new Color(255, 228, 225));
		wides_82.setColumns(10);
		wides_82.setBounds(518, 155, 33, 20);
		ATeamPanel_1.add(wides_82);
		
		wides_83 = new JTextField();
		wides_83.setText("0");
		wides_83.setHorizontalAlignment(SwingConstants.CENTER);
		wides_83.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		wides_83.setBackground(new Color(255, 228, 225));
		wides_83.setColumns(10);
		wides_83.setBounds(518, 186, 33, 20);
		ATeamPanel_1.add(wides_83);
		
		wides_84 = new JTextField();
		wides_84.setText("0");
		wides_84.setHorizontalAlignment(SwingConstants.CENTER);
		wides_84.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		wides_84.setBackground(new Color(255, 228, 225));
		wides_84.setColumns(10);
		wides_84.setBounds(518, 217, 33, 20);
		ATeamPanel_1.add(wides_84);
		
		wides_85 = new JTextField();
		wides_85.setText("0");
		wides_85.setHorizontalAlignment(SwingConstants.CENTER);
		wides_85.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		wides_85.setBackground(new Color(255, 228, 225));
		wides_85.setColumns(10);
		wides_85.setBounds(518, 248, 33, 20);
		ATeamPanel_1.add(wides_85);
		
		wides_86 = new JTextField();
		wides_86.setText("0");
		wides_86.setHorizontalAlignment(SwingConstants.CENTER);
		wides_86.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		wides_86.setBackground(new Color(255, 228, 225));
		wides_86.setColumns(10);
		wides_86.setBounds(518, 279, 33, 20);
		ATeamPanel_1.add(wides_86);
		
		wides_87 = new JTextField();
		wides_87.setText("0");
		wides_87.setHorizontalAlignment(SwingConstants.CENTER);
		wides_87.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		wides_87.setBackground(new Color(255, 228, 225));
		wides_87.setColumns(10);
		wides_87.setBounds(518, 310, 33, 20);
		ATeamPanel_1.add(wides_87);
		
		nballs_88 = new JTextField();
		nballs_88.setText("0");
		nballs_88.setHorizontalAlignment(SwingConstants.CENTER);
		nballs_88.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		nballs_88.setBackground(new Color(255, 228, 225));
		nballs_88.setColumns(10);
		nballs_88.setBounds(567, 0, 33, 20);
		ATeamPanel_1.add(nballs_88);
		
		nballs_89 = new JTextField();
		nballs_89.setText("0");
		nballs_89.setHorizontalAlignment(SwingConstants.CENTER);
		nballs_89.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		nballs_89.setBackground(new Color(255, 228, 225));
		nballs_89.setColumns(10);
		nballs_89.setBounds(567, 31, 33, 20);
		ATeamPanel_1.add(nballs_89);
		
		nballs_90 = new JTextField();
		nballs_90.setText("0");
		nballs_90.setHorizontalAlignment(SwingConstants.CENTER);
		nballs_90.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		nballs_90.setBackground(new Color(255, 228, 225));
		nballs_90.setColumns(10);
		nballs_90.setBounds(567, 62, 33, 20);
		ATeamPanel_1.add(nballs_90);
		
		nballs_91 = new JTextField();
		nballs_91.setText("0");
		nballs_91.setHorizontalAlignment(SwingConstants.CENTER);
		nballs_91.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		nballs_91.setBackground(new Color(255, 228, 225));
		nballs_91.setColumns(10);
		nballs_91.setBounds(567, 93, 33, 20);
		ATeamPanel_1.add(nballs_91);
		
		nballs_92 = new JTextField();
		nballs_92.setText("0");
		nballs_92.setHorizontalAlignment(SwingConstants.CENTER);
		nballs_92.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		nballs_92.setBackground(new Color(255, 228, 225));
		nballs_92.setColumns(10);
		nballs_92.setBounds(567, 124, 33, 20);
		ATeamPanel_1.add(nballs_92);
		
		nballs_93 = new JTextField();
		nballs_93.setText("0");
		nballs_93.setHorizontalAlignment(SwingConstants.CENTER);
		nballs_93.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		nballs_93.setBackground(new Color(255, 228, 225));
		nballs_93.setColumns(10);
		nballs_93.setBounds(567, 155, 33, 20);
		ATeamPanel_1.add(nballs_93);
		
		nballs_94 = new JTextField();
		nballs_94.setText("0");
		nballs_94.setHorizontalAlignment(SwingConstants.CENTER);
		nballs_94.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		nballs_94.setBackground(new Color(255, 228, 225));
		nballs_94.setColumns(10);
		nballs_94.setBounds(567, 186, 33, 20);
		ATeamPanel_1.add(nballs_94);
		
		nballs_95 = new JTextField();
		nballs_95.setText("0");
		nballs_95.setHorizontalAlignment(SwingConstants.CENTER);
		nballs_95.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		nballs_95.setBackground(new Color(255, 228, 225));
		nballs_95.setColumns(10);
		nballs_95.setBounds(567, 217, 33, 20);
		ATeamPanel_1.add(nballs_95);
		
		nballs_96 = new JTextField();
		nballs_96.setText("0");
		nballs_96.setHorizontalAlignment(SwingConstants.CENTER);
		nballs_96.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		nballs_96.setBackground(new Color(255, 228, 225));
		nballs_96.setColumns(10);
		nballs_96.setBounds(567, 248, 33, 20);
		ATeamPanel_1.add(nballs_96);
		
		nballs_97 = new JTextField();
		nballs_97.setText("0");
		nballs_97.setHorizontalAlignment(SwingConstants.CENTER);
		nballs_97.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		nballs_97.setBackground(new Color(255, 228, 225));
		nballs_97.setColumns(10);
		nballs_97.setBounds(567, 279, 33, 20);
		ATeamPanel_1.add(nballs_97);
		
		nballs_98 = new JTextField();
		nballs_98.setText("0");
		nballs_98.setHorizontalAlignment(SwingConstants.CENTER);
		nballs_98.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		nballs_98.setBackground(new Color(255, 228, 225));
		nballs_98.setColumns(10);
		nballs_98.setBounds(567, 310, 33, 20);
		ATeamPanel_1.add(nballs_98);
		
		canvas_1_1_2 = new Canvas();
		canvas_1_1_2.setBackground(Color.LIGHT_GRAY);
		canvas_1_1_2.setBounds(174, 0, 1, 339);
		ATeamPanel_1.add(canvas_1_1_2);
		
		canvas_1_1_3 = new Canvas();
		canvas_1_1_3.setBackground(Color.LIGHT_GRAY);
		canvas_1_1_3.setBounds(281, 0, 1, 339);
		ATeamPanel_1.add(canvas_1_1_3);
		
		canvas_1_1_4 = new Canvas();
		canvas_1_1_4.setBackground(Color.LIGHT_GRAY);
		canvas_1_1_4.setBounds(409, 0, 1, 339);
		ATeamPanel_1.add(canvas_1_1_4);
		
		canvas_1_1_5 = new Canvas();
		canvas_1_1_5.setBackground(Color.LIGHT_GRAY);
		canvas_1_1_5.setBounds(509, 0, 1, 339);
		ATeamPanel_1.add(canvas_1_1_5);
		
		BbR = new JTextField();
		BbR.setHorizontalAlignment(SwingConstants.CENTER);
		BbR.setText("0");
		BbR.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		BbR.setColumns(4);
		BbR.setBackground(new Color(255, 228, 225));
		BbR.setBounds(332, 0, 33, 20);
		ATeamPanel_1.add(BbR);
		
		BbR_1 = new JTextField();
		BbR_1.setHorizontalAlignment(SwingConstants.CENTER);
		BbR_1.setText("0");
		BbR_1.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		BbR_1.setColumns(4);
		BbR_1.setBackground(new Color(255, 228, 225));
		BbR_1.setBounds(332, 31, 33, 20);
		ATeamPanel_1.add(BbR_1);
		
		BbR_2 = new JTextField();
		BbR_2.setHorizontalAlignment(SwingConstants.CENTER);
		BbR_2.setText("0");
		BbR_2.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		BbR_2.setColumns(4);
		BbR_2.setBackground(new Color(255, 228, 225));
		BbR_2.setBounds(332, 62, 33, 20);
		ATeamPanel_1.add(BbR_2);
		
		BbR_3 = new JTextField();
		BbR_3.setHorizontalAlignment(SwingConstants.CENTER);
		BbR_3.setText("0");
		BbR_3.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		BbR_3.setColumns(4);
		BbR_3.setBackground(new Color(255, 228, 225));
		BbR_3.setBounds(332, 92, 33, 20);
		ATeamPanel_1.add(BbR_3);
		
		BbR_4 = new JTextField();
		BbR_4.setHorizontalAlignment(SwingConstants.CENTER);
		BbR_4.setText("0");
		BbR_4.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		BbR_4.setColumns(4);
		BbR_4.setBackground(new Color(255, 228, 225));
		BbR_4.setBounds(332, 124, 33, 20);
		ATeamPanel_1.add(BbR_4);
		
		BbR_5 = new JTextField();
		BbR_5.setHorizontalAlignment(SwingConstants.CENTER);
		BbR_5.setText("0");
		BbR_5.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		BbR_5.setColumns(4);
		BbR_5.setBackground(new Color(255, 228, 225));
		BbR_5.setBounds(332, 155, 33, 20);
		ATeamPanel_1.add(BbR_5);
		
		BbR_6 = new JTextField();
		BbR_6.setHorizontalAlignment(SwingConstants.CENTER);
		BbR_6.setText("0");
		BbR_6.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		BbR_6.setColumns(4);
		BbR_6.setBackground(new Color(255, 228, 225));
		BbR_6.setBounds(332, 186, 33, 20);
		ATeamPanel_1.add(BbR_6);
		
		BbR_7 = new JTextField();
		BbR_7.setHorizontalAlignment(SwingConstants.CENTER);
		BbR_7.setText("0");
		BbR_7.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		BbR_7.setColumns(4);
		BbR_7.setBackground(new Color(255, 228, 225));
		BbR_7.setBounds(332, 218, 33, 20);
		ATeamPanel_1.add(BbR_7);
		
		BbR_8 = new JTextField();
		BbR_8.setHorizontalAlignment(SwingConstants.CENTER);
		BbR_8.setText("0");
		BbR_8.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		BbR_8.setColumns(4);
		BbR_8.setBackground(new Color(255, 228, 225));
		BbR_8.setBounds(332, 248, 33, 20);
		ATeamPanel_1.add(BbR_8);
		
		BbR_9 = new JTextField();
		BbR_9.setHorizontalAlignment(SwingConstants.CENTER);
		BbR_9.setText("0");
		BbR_9.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		BbR_9.setColumns(4);
		BbR_9.setBackground(new Color(255, 228, 225));
		BbR_9.setBounds(332, 279, 33, 20);
		ATeamPanel_1.add(BbR_9);
		
		BbR_10 = new JTextField();
		BbR_10.setHorizontalAlignment(SwingConstants.CENTER);
		BbR_10.setText("0");
		BbR_10.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		BbR_10.setColumns(4);
		BbR_10.setBackground(new Color(255, 228, 225));
		BbR_10.setBounds(332, 310, 33, 20);
		ATeamPanel_1.add(BbR_10);
		
		JTextField[] An = {PlayerName,PlayerName_1,PlayerName_2,PlayerName_3,PlayerName_4,PlayerName_5,PlayerName_6,PlayerName_7,PlayerName_8,PlayerName_9,PlayerName_10};
		JTextField[] Ar = {Aruns,Aruns_1,Aruns_2,Aruns_3,Aruns_4,Aruns_5,Aruns_6,Aruns_7,Aruns_8,Aruns_9,Aruns_10};
		JTextField[] Ab = {balls,balls_1,balls_2,balls_3,balls_4,balls_5,balls_6,balls_7,balls_8,balls_9,balls_10};
		JTextField[] Aw = {wickets,wickets_1,wickets_2,wickets_3,wickets_4,wickets_5,wickets_6,wickets_7,wickets_8,wickets_9,wickets_10};
		JTextField[] Abb = {bowled,bowled_1,bowled_2,bowled_3,bowled_4,bowled_5,bowled_6,bowled_7,bowled_8,bowled_9,bowled_10};
		JTextField[] Af = {fours,fours_1,fours_2,fours_3,fours_4,fours_5,fours_6,fours_7,fours_8,fours_9,fours_10};
		JTextField[] As = {sixes,sixes_1,sixes_2,sixes_3,sixes_4,sixes_5,sixes_6,sixes_7,sixes_8,sixes_9,sixes_10};
		JTextField[] Awd = {wide,wide_1,wide_2,wide_3,wide_4,wide_5,wide_6,wide_7,wide_8, wide_9,wide_10};
		JTextField[] Anb = {nballs,nballs_1,nballs_2,nballs_3,nballs_4,nballs_5,nballs_6,nballs_7,nballs_8,nballs_9,nballs_10};
		JTextField[] brA = {AbR,AbR_1,AbR_2,AbR_3,AbR_4,AbR_5,AbR_6,AbR_7,AbR_8,AbR_9,AbR_10};
		
		JTextField[] Bn = {BPlayerName,BPlayerName_1,BPlayerName_2,BPlayerName_3,BPlayerName_4,BPlayerName_5,BPlayerName_6,BPlayerName_7,BPlayerName_8,BPlayerName_9,BPlayerName_10};
		JTextField[] Br = {Bruns_11,Bruns_12,Bruns_13,Bruns_14,Bruns_15,Bruns_16,Bruns_17,Bruns_18,Bruns_19,Bruns_20,Bruns_21};
		JTextField[] Bb = {Bballs_22,Bballs_23,Bballs_24,Bballs_25,Bballs_26,Bballs_27,Bballs_28,Bballs_29,Bballs_30,Bballs_31,Bballs_32};
		JTextField[] Bw = {wickets_33,wickets_34,wickets_35,wickets_36,wickets_37,wickets_38,wickets_39,wickets_40,wickets_41,wickets_42,wickets_43};
		JTextField[] Bbb = {bowled_44,bowled_45,bowled_46,bowled_47,bowled_48,bowled_49,bowled_50,bowled_51,bowled_52,bowled_53,bowled_54};
		JTextField[] Bf = {fours_55,fours_56,fours_57,fours_58,fours_59,fours_60,fours_61,fours_62,fours_63,fours_64,fours_65};
		JTextField[] Bs = {sixes_66,sixes_67,sixes_68,sixes_69,sixes_70,sixes_71,sixes_72,sixes_73,sixes_74,sixes_75,sixes_76};
		JTextField[] Bwd = {wides_77,wides_78,wides_79,wides_80,wides_81,wides_82,wides_83,wides_84,wides_85,wides_86,wides_87};
		JTextField[] Bnb = {nballs_88,nballs_89,nballs_90,nballs_91,nballs_92,nballs_93,nballs_94,nballs_95,nballs_96,nballs_97,nballs_98};
		JTextField[] brB = {BbR,BbR_1,BbR_2,BbR_3,BbR_4,BbR_5,BbR_6,BbR_7,BbR_8,BbR_9,BbR_10};
		
		JLabel lblNewLabel_2 = new JLabel("Player Name");
		lblNewLabel_2.setFont(new Font("Exo 2 Light", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(638, 186, 165, 23);
		frmPowerplayMatchmakerV.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_1_5 = new JLabel("Runs");
		lblNewLabel_1_5.setFont(new Font("Exo 2 Light", Font.PLAIN, 12));
		lblNewLabel_1_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_5.setBounds(824, 186, 45, 23);
		frmPowerplayMatchmakerV.getContentPane().add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Balls");
		lblNewLabel_1_1_1.setFont(new Font("Exo 2 Light", Font.PLAIN, 12));
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setBounds(862, 186, 62, 23);
		frmPowerplayMatchmakerV.getContentPane().add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_4_3_1 = new JLabel("No Balls\r\n");
		lblNewLabel_1_4_3_1.setFont(new Font("Exo 2 Light", Font.PLAIN, 12));
		lblNewLabel_1_4_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_4_3_1.setBounds(1196, 186, 51, 23);
		frmPowerplayMatchmakerV.getContentPane().add(lblNewLabel_1_4_3_1);
		
		JLabel lblNewLabel_1_4_2_1 = new JLabel("Wides");
		lblNewLabel_1_4_2_1.setFont(new Font("Exo 2 Light", Font.PLAIN, 12));
		lblNewLabel_1_4_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_4_2_1.setBounds(1152, 186, 39, 23);
		frmPowerplayMatchmakerV.getContentPane().add(lblNewLabel_1_4_2_1);
		
		JLabel lblNewLabel_1_4_1_1 = new JLabel("Sixes");
		lblNewLabel_1_4_1_1.setFont(new Font("Exo 2 Light", Font.PLAIN, 12));
		lblNewLabel_1_4_1_1.setBounds(1105, 186, 39, 23);
		frmPowerplayMatchmakerV.getContentPane().add(lblNewLabel_1_4_1_1);
		lblNewLabel_1_4_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("Balls");
		lblNewLabel_1_3_1.setFont(new Font("Exo 2 Light", Font.PLAIN, 12));
		lblNewLabel_1_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3_1.setBounds(1006, 186, 45, 23);
		frmPowerplayMatchmakerV.getContentPane().add(lblNewLabel_1_3_1);
		
		JLabel lblNewLabel_1_4_4 = new JLabel("Fours");
		lblNewLabel_1_4_4.setFont(new Font("Exo 2 Light", Font.PLAIN, 12));
		lblNewLabel_1_4_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_4_4.setBounds(1061, 186, 39, 23);
		frmPowerplayMatchmakerV.getContentPane().add(lblNewLabel_1_4_4);
		
		txtTeamB = new JTextField();
		txtTeamB.setToolTipText("Enter Team Name\r\n");
		txtTeamB.setText("Team B");
		txtTeamB.setHorizontalAlignment(SwingConstants.RIGHT);
		txtTeamB.setForeground(Color.RED);
		txtTeamB.setFont(new Font("Exo 2 Light", Font.PLAIN, 48));
		txtTeamB.setColumns(20);
		txtTeamB.setBounds(791, 106, 463, 69);
		frmPowerplayMatchmakerV.getContentPane().add(txtTeamB);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Wickets");
		lblNewLabel_1_2_1.setFont(new Font("Exo 2 Light", Font.PLAIN, 12));
		lblNewLabel_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1.setBounds(915, 186, 45, 23);
		frmPowerplayMatchmakerV.getContentPane().add(lblNewLabel_1_2_1);
		
		JComboBox Aqf = new JComboBox();
		Aqf.setModel(new DefaultComboBoxModel(AqfDisplay));
		Aqf.setMaximumRowCount(24);
		Aqf.setForeground(Color.BLACK);
		Aqf.setBackground(Color.WHITE);
		Aqf.setFont(new Font("Exo 2 Light", Font.PLAIN, 16));
		Aqf.setBounds(10, 72, 132, 23);
		frmPowerplayMatchmakerV.getContentPane().add(Aqf);
		
		Aqf_1 = new JComboBox();
		Aqf_1.setModel(new DefaultComboBoxModel(AqfDisplay));
		Aqf_1.setMaximumRowCount(24);
		Aqf_1.setForeground(Color.BLACK);
		Aqf_1.setFont(new Font("Exo 2 Light", Font.PLAIN, 16));
		Aqf_1.setBackground(Color.WHITE);
		Aqf_1.setBounds(1122, 72, 132, 23);
		frmPowerplayMatchmakerV.getContentPane().add(Aqf_1);
		
		JPanel Button3_helper = new JPanel();
		Button3_helper.setBackground(new Color(255, 255, 255));
		Button3_helper.setBounds(149, 71, 84, 24);
		frmPowerplayMatchmakerV.getContentPane().add(Button3_helper);
		Button3_helper.setLayout(null);
		
		JLabel TeamAf = new JLabel("");
		TeamAf.setFont(new Font("Exo 2 Light", Font.PLAIN, 15));
		TeamAf.setHorizontalAlignment(SwingConstants.CENTER);
		TeamAf.setBackground(Color.BLACK);
		TeamAf.setBounds(476, 94, 156, 81);
		frmPowerplayMatchmakerV.getContentPane().add(TeamAf);
		
		JLabel TeamBf = new JLabel("");
		TeamBf.setFont(new Font("Exo 2 Light", Font.PLAIN, 15));
		TeamBf.setHorizontalAlignment(SwingConstants.CENTER);
		TeamBf.setBackground(Color.BLACK);
		TeamBf.setBounds(631, 94, 156, 81);
		frmPowerplayMatchmakerV.getContentPane().add(TeamBf);
			
		JLabel Button3 = new JLabel("QuickFill");
		Button3.setBounds(0, 0, 84, 24);
		Button3_helper.add(Button3);
		Button3.setBackground(new Color(0, 0, 0));
		Button3.setForeground(Color.BLUE);
		Button3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				Button3.setForeground(Color.WHITE);
				Button3_helper.setBackground(Color.BLUE);
				
			}
			public void mouseClicked(MouseEvent e) {
				
				TeamAn.setText(QuickFill[Aqf.getSelectedIndex()]);
				String A = "C:\\PowerPlay\\MatchMaker_QuickFill\\"+ QuickFill[Aqf.getSelectedIndex()] + ".txt";
				try {
					TeamAf.setIcon(new ImageIcon("C:\\PowerPlay\\Flags\\"+QuickFill[Aqf.getSelectedIndex()]+".png"));
			    Scanner teamreader = new Scanner(new File(A));
				int i = 0;
				while(teamreader.hasNextLine() && i<11) {
					An[i].setText(teamreader.nextLine());
					i++;
					
				}
				}catch(Exception E) {
					System.out.println(A + " is empty!");
				}
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				Button3_helper.setBackground(Color.WHITE);
				Button3.setForeground(Color.BLUE);
			}
		});
		
		Button3.setHorizontalAlignment(SwingConstants.CENTER);
		Button3.setFont(new Font("Exo 2 Light", Font.PLAIN, 16));
		
		Canvas canvas_2 = new Canvas();
		canvas_2.setBackground(Color.BLUE);
		canvas_2.setBounds(148, 70, 86, 26);
		frmPowerplayMatchmakerV.getContentPane().add(canvas_2);
		
		Canvas canvas = new Canvas();
		canvas.setBackground(new Color(192, 192, 192));
		canvas.setBounds(631, 126, 1, 431);
		frmPowerplayMatchmakerV.getContentPane().add(canvas);
		
		JPanel Button3_helper_1 = new JPanel();
		Button3_helper_1.setLayout(null);
		Button3_helper_1.setBackground(Color.WHITE);
		Button3_helper_1.setBounds(1031, 71, 84, 24);
		frmPowerplayMatchmakerV.getContentPane().add(Button3_helper_1);
		
		JLabel Button3_1 = new JLabel("QuickFill");
		Button3_1.setBounds(0, 0, 84, 24);
		Button3_helper_1.add(Button3_1);
		Button3_1.setHorizontalAlignment(SwingConstants.CENTER);
		Button3_1.setForeground(Color.RED);
		Button3_1.setFont(new Font("Exo 2 Light", Font.PLAIN, 16));
		Button3_1.setBackground(Color.BLACK);
		Button3_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				Button3_1.setForeground(Color.WHITE);
				Button3_helper_1.setBackground(Color.RED);
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				Button3_helper_1.setBackground(Color.WHITE);
				Button3_1.setForeground(Color.RED);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				txtTeamB.setText(QuickFill[Aqf_1.getSelectedIndex()]);
				String A = "C:\\PowerPlay\\MatchMaker_QuickFill\\"+ QuickFill[Aqf_1.getSelectedIndex()] + ".txt";
				TeamBf.setIcon(new ImageIcon("C:\\PowerPlay\\Flags\\"+QuickFill[Aqf_1.getSelectedIndex()]+".png"));
				try {
				Scanner teamreader = new Scanner(new File(A));
				int i = 0;
				
				while(teamreader.hasNextLine()) {
					Bn[i].setText(teamreader.nextLine());
					i++;
				}
				}catch(FileNotFoundException E) {
					System.out.println(A + " is empty!");
				}
				
			}
		});
		
		Canvas canvas_2_1 = new Canvas();
		canvas_2_1.setBackground(Color.RED);
		canvas_2_1.setBounds(1030, 70, 86, 26);
		frmPowerplayMatchmakerV.getContentPane().add(canvas_2_1);
		
		JPanel verifyhelper = new JPanel();
		verifyhelper.setBackground(Color.WHITE);
		verifyhelper.setBounds(1142, 634, 132, 46);
		frmPowerplayMatchmakerV.getContentPane().add(verifyhelper);
		verifyhelper.setLayout(null);
		
		JLabel verify = new JLabel("Verify");
		verify.setBounds(10, 0, 112, 46);
		verifyhelper.add(verify);
		verify.setForeground(new Color(0, 128, 128));
		verify.setFont(new Font("Exo 2 Light", Font.PLAIN, 30));
		verify.setHorizontalAlignment(SwingConstants.CENTER);
		
		lblNewLabel_3 = new JLabel("Final Score");
		lblNewLabel_3.setFont(new Font("Exo 2 Light", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(10, 560, 78, 23);
		frmPowerplayMatchmakerV.getContentPane().add(lblNewLabel_3);
		
		lblNewLabel_3_1 = new JLabel("Overs");
		lblNewLabel_3_1.setFont(new Font("Exo 2 Light", Font.PLAIN, 15));
		lblNewLabel_3_1.setBounds(10, 585, 78, 23);
		frmPowerplayMatchmakerV.getContentPane().add(lblNewLabel_3_1);
		
		lblNewLabel_3_2 = new JLabel("Run Rate");
		lblNewLabel_3_2.setFont(new Font("Exo 2 Light", Font.PLAIN, 15));
		lblNewLabel_3_2.setBounds(10, 609, 69, 23);
		frmPowerplayMatchmakerV.getContentPane().add(lblNewLabel_3_2);
		
		lblNewLabel_3_3 = new JLabel("Final Score");
		lblNewLabel_3_3.setFont(new Font("Exo 2 Light", Font.PLAIN, 15));
		lblNewLabel_3_3.setBounds(638, 559, 78, 23);
		frmPowerplayMatchmakerV.getContentPane().add(lblNewLabel_3_3);
		
		lblNewLabel_3_1_1 = new JLabel("Overs");
		lblNewLabel_3_1_1.setFont(new Font("Exo 2 Light", Font.PLAIN, 15));
		lblNewLabel_3_1_1.setBounds(638, 584, 78, 23);
		frmPowerplayMatchmakerV.getContentPane().add(lblNewLabel_3_1_1);
		
		lblNewLabel_3_2_1 = new JLabel("Run Rate");
		lblNewLabel_3_2_1.setFont(new Font("Exo 2 Light", Font.PLAIN, 15));
		lblNewLabel_3_2_1.setBounds(638, 608, 78, 23);
		frmPowerplayMatchmakerV.getContentPane().add(lblNewLabel_3_2_1);
		
		canvas_3_1 = new Canvas();
		canvas_3_1.setBackground(Color.RED);
		canvas_3_1.setBounds(722, 559, 1, 73);
		frmPowerplayMatchmakerV.getContentPane().add(canvas_3_1);
		
		BRunRate = new JLabel("");
		BRunRate.setFont(new Font("Exo 2 Light", Font.PLAIN, 15));
		BRunRate.setBounds(735, 608, 78, 23);
		frmPowerplayMatchmakerV.getContentPane().add(BRunRate);
		
		Bovers_1 = new JLabel("");
		Bovers_1.setFont(new Font("Exo 2 Light", Font.PLAIN, 15));
		Bovers_1.setBounds(735, 584, 78, 23);
		frmPowerplayMatchmakerV.getContentPane().add(Bovers_1);
		
		BFinalScore = new JLabel("");
		BFinalScore.setFont(new Font("Exo 2 Light", Font.PLAIN, 15));
		BFinalScore.setBounds(735, 559, 78, 23);
		frmPowerplayMatchmakerV.getContentPane().add(BFinalScore);
		
		AFinalScore = new JLabel("");
		AFinalScore.setFont(new Font("Exo 2 Light", Font.PLAIN, 15));
		AFinalScore.setBounds(109, 560, 78, 23);
		frmPowerplayMatchmakerV.getContentPane().add(AFinalScore);
		
		Aovers_1 = new JLabel("");
		Aovers_1.setFont(new Font("Exo 2 Light", Font.PLAIN, 15));
		Aovers_1.setBounds(109, 585, 78, 23);
		frmPowerplayMatchmakerV.getContentPane().add(Aovers_1);
		
		ARunRate = new JLabel("");
		ARunRate.setFont(new Font("Exo 2 Light", Font.PLAIN, 15));
		ARunRate.setBounds(109, 609, 78, 23);
		frmPowerplayMatchmakerV.getContentPane().add(ARunRate);
		
		lblNewLabel_4 = new JLabel("Status");
		lblNewLabel_4.setFont(new Font("Exo 2 Light", Font.PLAIN, 18));
		lblNewLabel_4.setForeground(Color.BLACK);
		lblNewLabel_4.setBounds(213, 560, 62, 23);
		frmPowerplayMatchmakerV.getContentPane().add(lblNewLabel_4);
		
		PlayerList = new Canvas();
		PlayerList.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				if(PlayerList.getBackground() == Color.BLACK) {
				apphelper.setText("Results unavailable. Click verify to show results.");
			}
				
				if(PlayerList.getBackground() == Color.GREEN) {
				apphelper.setText("All players have names for Team "+ TeamAn.getText());
			}
				if(PlayerList.getBackground() == Color.RED) {
				apphelper.setText("Incomplete Data Exception : Some players do not have names for Team " + TeamAn.getText());
			}
			}
			@Override
			public void mouseExited(MouseEvent e) {
				apphelper.setText("");
			}
		});
		PlayerList.setBackground(Color.BLACK);
		PlayerList.setBounds(281, 560, 26, 26);
		frmPowerplayMatchmakerV.getContentPane().add(PlayerList);
		
		sumofBalls = new Canvas();
		sumofBalls.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				if(sumofBalls.getBackground() == Color.BLACK) {
				apphelper.setText("Results unavailable. Click verify to show results.");
			}
				
				if(sumofBalls.getBackground() == Color.GREEN) {
				apphelper.setText(TeamAn.getText()+"'s bowled balls and " + txtTeamB.getText( )+ "'s faced balls match.");
			}
				if(sumofBalls.getBackground() == Color.RED) {
				apphelper.setText("Data Integrity Exception : " + TeamAn.getText() + "'s bowled balls and " + txtTeamB.getText( )+ "'s batsmen balls do not match!");
			}
			}
			@Override
			public void mouseExited(MouseEvent e) {
				apphelper.setText("");
			}
		});
		sumofBalls.setBackground(Color.BLACK);
		sumofBalls.setBounds(313, 560, 26, 26);
		frmPowerplayMatchmakerV.getContentPane().add(sumofBalls);
		
		Canvas sumofRuns = new Canvas();
		sumofRuns.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				if(sumofRuns.getBackground() == Color.BLACK) {
				apphelper.setText("Results unavailable. Click verify to show results.");
			}
				
				if(sumofRuns.getBackground() == Color.GREEN) {
				apphelper.setText(TeamAn.getText()+"'s scored runs and " + txtTeamB.getText( )+ "'s conceded runs match.");
			}
				if(sumofRuns.getBackground() == Color.RED) {
				apphelper.setText("Data Integrity Exception : " + TeamAn.getText() + "'s scored runs and " + txtTeamB.getText( )+ "'s conceded runs do not match!");
			}
			}
			@Override
			public void mouseExited(MouseEvent e) {
				apphelper.setText("");
			}
		});
		sumofRuns.setBackground(Color.BLACK);
		sumofRuns.setBounds(345, 560, 26, 26);
		frmPowerplayMatchmakerV.getContentPane().add(sumofRuns);
		
		Sumofwickets = new Canvas();
		Sumofwickets.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				if(Sumofwickets.getBackground() == Color.BLACK) {
				apphelper.setText("Results unavailable. Click verify to show results.");
			}
				
				if(Sumofwickets.getBackground() == Color.GREEN) {
				apphelper.setText(TeamAn.getText()+" has valid number of wickets remaining.");
			}
				if(Sumofwickets.getBackground() == Color.RED) {
				apphelper.setText("Data Integrity Exception : " + TeamAn.getText()+" has invalid number of wickets remaining!");
			}
			}
			@Override
			public void mouseExited(MouseEvent e) {
				apphelper.setText("");
			}
		});
		Sumofwickets.setBackground(Color.BLACK);
		Sumofwickets.setBounds(377, 560, 26, 26);
		frmPowerplayMatchmakerV.getContentPane().add(Sumofwickets);
		
		WinnerA = new Canvas();
		WinnerA.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				if(WinnerA.getBackground() == Color.BLACK) {
				apphelper.setText("Click Verify to show match winner.");
			}
				
				if(WinnerA.getBackground() == Color.YELLOW) {
				apphelper.setText(TeamAn.getText()+" won this match according to analysis!");
			}
				if(WinnerA.getBackground() == Color.GRAY) {
				apphelper.setText(TeamAn.getText()+" lost this match according to analysis!");
			}
				if(WinnerA.getBackground() == Color.GRAY && WinnerB.getBackground() == Color.GRAY) {
				apphelper.setText(TeamAn.getText()+" tied this match according to analysis!");
			}
			}
			@Override
			public void mouseExited(MouseEvent e) {
				apphelper.setText("");
			}
		});
		WinnerA.setBackground(Color.BLACK);
		WinnerA.setBounds(410, 560, 26, 26);
		frmPowerplayMatchmakerV.getContentPane().add(WinnerA);
		
		Icon = new JLabel("New label");
		Icon.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				new BatchWritex();				
			}
		});
		Icon.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\label1.png"));
		Icon.setBounds(974, 0, 300, 55);
		frmPowerplayMatchmakerV.getContentPane().add(Icon);
		
		lblNewLabel_5 = new JLabel("Status");
		lblNewLabel_5.setForeground(Color.BLACK);
		lblNewLabel_5.setFont(new Font("Exo 2 Light", Font.PLAIN, 18));
		lblNewLabel_5.setBounds(851, 559, 62, 23);
		frmPowerplayMatchmakerV.getContentPane().add(lblNewLabel_5);
		
		PlayerListB = new Canvas();
		PlayerListB.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				if(PlayerListB.getBackground() == Color.BLACK) {
				apphelper.setText("Results unavailable. Click verify to show results.");
			}
				
				if(PlayerListB.getBackground() == Color.GREEN) {
				apphelper.setText("All players have names for Team "+ txtTeamB.getText());
			}
				if(PlayerListB.getBackground() == Color.RED) {
				apphelper.setText("Incomplete Data Exception : Some players do not have names for Team " + txtTeamB.getText());
			}
			}
			@Override
			public void mouseExited(MouseEvent e) {
				apphelper.setText("");
			}
		});
		PlayerListB.setBackground(Color.BLACK);
		PlayerListB.setBounds(919, 559, 26, 26);
		frmPowerplayMatchmakerV.getContentPane().add(PlayerListB);
		
		SumofBallsB = new Canvas();
		SumofBallsB.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				if(SumofBallsB.getBackground() == Color.BLACK) {
				apphelper.setText("Results unavailable. Click verify to show results.");
			}
				
				if(SumofBallsB.getBackground() == Color.GREEN) {
				apphelper.setText(txtTeamB.getText()+"'s bowled balls and "+ TeamAn.getText() +"'s faced balls match.");
			}
				if(SumofBallsB.getBackground() == Color.RED) {
				apphelper.setText("Data Integrity Exception : " + txtTeamB.getText() + "'s bowled balls and " + TeamAn.getText( )+ "'s batsmen balls do not match!");
			}
			}
			@Override
			public void mouseExited(MouseEvent e) {
				apphelper.setText("");
			}
		});
		SumofBallsB.setBackground(Color.BLACK);
		SumofBallsB.setBounds(951, 559, 26, 26);
		frmPowerplayMatchmakerV.getContentPane().add(SumofBallsB);
		
		sumofRunsB = new Canvas();
		sumofRunsB.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				if(sumofRunsB.getBackground() == Color.BLACK) {
				apphelper.setText("Results unavailable. Click verify to show results.");
			}
				
				if(sumofRunsB.getBackground() == Color.GREEN) {
				apphelper.setText(txtTeamB.getText()+"'s scored runs and " + TeamAn.getText( )+ "'s conceded runs match.");
			}
				if(sumofRunsB.getBackground() == Color.RED) {
				apphelper.setText("Data Integrity Exception : " + txtTeamB.getText() + "'s scored runs and " + TeamAn.getText( )+ "'s conceded runs do not match!");
			}
			}
			@Override
			public void mouseExited(MouseEvent e) {
				apphelper.setText("");
			}
		});
		sumofRunsB.setBackground(Color.BLACK);
		sumofRunsB.setBounds(983, 559, 26, 26);
		frmPowerplayMatchmakerV.getContentPane().add(sumofRunsB);
		
		SumofwicketsB = new Canvas();
		SumofwicketsB.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				if(SumofwicketsB.getBackground() == Color.BLACK) {
				apphelper.setText("Results unavailable. Click verify to show results.");
			}
				
				if(SumofwicketsB.getBackground() == Color.GREEN) {
				apphelper.setText(txtTeamB.getText()+" has valid number of wickets remaining.");
			}
				if(SumofwicketsB.getBackground() == Color.RED) {
				apphelper.setText("Data Integrity Exception : " + txtTeamB.getText()+" has invalid number of wickets remaining!");
			}
			}
			@Override
			public void mouseExited(MouseEvent e) {
				apphelper.setText("");
			}
		});
		SumofwicketsB.setBackground(Color.BLACK);
		SumofwicketsB.setBounds(1015, 559, 26, 26);
		frmPowerplayMatchmakerV.getContentPane().add(SumofwicketsB);
		
		WinnerB = new Canvas();
		WinnerB.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				if(WinnerB.getBackground() == Color.BLACK) {
				apphelper.setText("Click Verify to show match winner.");
			}
				
				if(WinnerB.getBackground() == Color.YELLOW) {
				apphelper.setText(txtTeamB.getText()+" won this match according to analysis!");
			}
				if(WinnerB.getBackground() == Color.GRAY) {
				apphelper.setText(txtTeamB.getText()+" lost this match according to analysis!");
			}
				if(WinnerA.getBackground() == Color.GRAY && WinnerB.getBackground() == Color.GRAY) {
				apphelper.setText(txtTeamB.getText()+" tied this match according to analysis!");
			}
			}
			@Override
			public void mouseExited(MouseEvent e) {
				apphelper.setText("");
			}
		});
		WinnerB.setBackground(Color.BLACK);
		WinnerB.setBounds(1048, 559, 26, 26);
		frmPowerplayMatchmakerV.getContentPane().add(WinnerB);
		
		JLabel lblNewLabel_1_6 = new JLabel("Runs");
		lblNewLabel_1_6.setToolTipText("Runs conceded by bowlers inclusive of Wides and No Balls");
		lblNewLabel_1_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_6.setFont(new Font("Exo 2 Light", Font.PLAIN, 12));
		lblNewLabel_1_6.setBackground(Color.WHITE);
		lblNewLabel_1_6.setBounds(334, 186, 45, 23);
		frmPowerplayMatchmakerV.getContentPane().add(lblNewLabel_1_6);
		
		lblNewLabel_1_7 = new JLabel("Runs");
		lblNewLabel_1_7.setToolTipText("Runs conceded by bowlers inclusive of Wides and No Balls");
		lblNewLabel_1_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_7.setFont(new Font("Exo 2 Light", Font.PLAIN, 12));
		lblNewLabel_1_7.setBounds(963, 186, 45, 23);
		frmPowerplayMatchmakerV.getContentPane().add(lblNewLabel_1_7);
		
		lblNewLabel_6 = new JLabel("Match#");
		lblNewLabel_6.setForeground(Color.BLACK);
		lblNewLabel_6.setFont(new Font("Exo 2 Light", Font.PLAIN, 18));
		lblNewLabel_6.setBounds(10, 0, 69, 23);
		frmPowerplayMatchmakerV.getContentPane().add(lblNewLabel_6);
		
		lblNewLabel_7 = new JLabel("Date");
		lblNewLabel_7.setForeground(Color.BLACK);
		lblNewLabel_7.setFont(new Font("Exo 2 Light", Font.PLAIN, 18));
		lblNewLabel_7.setBounds(10, 27, 78, 23);
		frmPowerplayMatchmakerV.getContentPane().add(lblNewLabel_7);
		
		lblNewLabel_8 = new JLabel("Tournament");
		lblNewLabel_8.setForeground(Color.BLACK);
		lblNewLabel_8.setFont(new Font("Exo 2 Light", Font.PLAIN, 18));
		lblNewLabel_8.setBounds(259, 0, 100, 23);
		frmPowerplayMatchmakerV.getContentPane().add(lblNewLabel_8);
		
		lblNewLabel_9 = new JLabel("Venue");
		lblNewLabel_9.setForeground(Color.BLACK);
		lblNewLabel_9.setFont(new Font("Exo 2 Light", Font.PLAIN, 18));
		lblNewLabel_9.setBounds(259, 27, 62, 23);
		frmPowerplayMatchmakerV.getContentPane().add(lblNewLabel_9);
		
		lblNewLabel_10 = new JLabel("Import");
		lblNewLabel_10.setForeground(Color.BLACK);
		lblNewLabel_10.setFont(new Font("Exo 2 Light", Font.PLAIN, 18));
		lblNewLabel_10.setBounds(638, 0, 62, 23);
		frmPowerplayMatchmakerV.getContentPane().add(lblNewLabel_10);
		
		matchinfo_1 = new JTextField();
		matchinfo_1.setText("-");
		matchinfo_1.setFont(new Font("Exo 2 Light", Font.PLAIN, 14));
		matchinfo_1.setBounds(86, 4, 120, 20);
		frmPowerplayMatchmakerV.getContentPane().add(matchinfo_1);
		matchinfo_1.setColumns(10);
		
		matchinfo_2 = new JTextField();
		matchinfo_2.setText("-");
		matchinfo_2.setFont(new Font("Exo 2 Light", Font.PLAIN, 14));
		matchinfo_2.setColumns(10);
		matchinfo_2.setBounds(86, 31, 120, 20);
		frmPowerplayMatchmakerV.getContentPane().add(matchinfo_2);
		
		matchinfo_4 = new JTextField();
		matchinfo_4.setText("-");
		matchinfo_4.setFont(new Font("Exo 2 Light", Font.PLAIN, 14));
		matchinfo_4.setColumns(10);
		matchinfo_4.setBounds(365, 31, 175, 20);
		frmPowerplayMatchmakerV.getContentPane().add(matchinfo_4);
		
		matchinfo_3 = new JTextField();
		matchinfo_3.setText("-");
		matchinfo_3.setFont(new Font("Exo 2 Light", Font.PLAIN, 14));
		matchinfo_3.setColumns(10);
		matchinfo_3.setBounds(365, 4, 175, 20);
		frmPowerplayMatchmakerV.getContentPane().add(matchinfo_3);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(Color.WHITE);
		comboBox.setFont(new Font("Exo 2 Light", Font.PLAIN, 14));
		comboBox.setModel(new DefaultComboBoxModel(TDisplay));
		comboBox.setBounds(710, 3, 165, 22);
		frmPowerplayMatchmakerV.getContentPane().add(comboBox);
		
		Panel panel = new Panel();
		panel.setBounds(890, 3, 69, 23);
		frmPowerplayMatchmakerV.getContentPane().add(panel);
		panel.setLayout(null);
		
		lblNewLabel_11 = new JLabel("Check");
		lblNewLabel_11.setBounds(10, 0, 49, 23);
		panel.add(lblNewLabel_11);
		lblNewLabel_11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				String[] Matchlist = new File("C:\\PowerPlay\\Tournament\\" + comboBox.getSelectedItem()).list();
				comboBox_1.setModel(new DefaultComboBoxModel(Matchlist));
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblNewLabel_11.setForeground(Color.WHITE);
				panel.setBackground(Color.BLACK);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				lblNewLabel_11.setForeground(Color.BLACK);
				panel.setBackground(Color.WHITE);
			}
		});
		lblNewLabel_11.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_11.setFont(new Font("Exo 2 Light", Font.PLAIN, 15));
		
		comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Exo 2 Light", Font.PLAIN, 14));
		comboBox_1.setBounds(710, 30, 165, 22);
		frmPowerplayMatchmakerV.getContentPane().add(comboBox_1);
		
		apphelper = new JLabel("-");
		apphelper.setFont(new Font("Exo 2 Light", Font.PLAIN, 16));
		apphelper.setBounds(10, 657, 723, 23);
		frmPowerplayMatchmakerV.getContentPane().add(apphelper);
		
		JPanel verifyhelper_1 = new JPanel();
		verifyhelper_1.setLayout(null);
		verifyhelper_1.setBackground(Color.WHITE);
		verifyhelper_1.setBounds(1012, 634, 132, 46);
		frmPowerplayMatchmakerV.getContentPane().add(verifyhelper_1);
		
		JLabel lblWrite = new JLabel("Write");
		lblWrite.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				verifyhelper_1.setBackground(Color.BLACK);
				lblWrite.setForeground(Color.WHITE);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				
				verifyhelper_1.setBackground(Color.WHITE);
				lblWrite.setForeground(Color.BLACK);
				
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if(!matchinfo_1.getText().isEmpty() && !matchinfo_3.getText().isEmpty()) {
				
					lblNewLabel_6.setForeground(Color.BLACK);
					lblNewLabel_8.setForeground(Color.BLACK);
					
				A.update(An, Bn, Ar, Br, Ab, Bb, Aw, Bw, Abb, Bbb, Af, Bf, As, Bs, Awd, Bwd, Anb, Bnb, brA, brB);
				A.basic( TeamAn.getText(), txtTeamB.getText(), matchinfo_1.getText(), matchinfo_3.getText(), matchinfo_4.getText(),matchinfo_2.getText());
				A.teamA = TeamAn.getText();
				A.teamB = txtTeamB.getText();
				String dir = "C:\\PowerPlay\\Tournament\\" + matchinfo_3.getText();
				File Directory = new File(dir);
				if(!Directory.exists()) {
				 Directory.mkdir();
				}
				String filepath = "C:\\PowerPlay\\Tournament\\" + matchinfo_3.getText() + "\\" + matchinfo_1.getText()+".txt" ;
				
				try {
					File F = new File(filepath);
					FileOutputStream start = new FileOutputStream(filepath);
					ObjectOutputStream push = new ObjectOutputStream(start);
					push.writeObject(A);
					
					
				}catch(Exception ex) {
					
					apphelper.setText("Could not write file.");
					
				}
				
				apphelper.setText("File Written Successfully");
				
			}
				else {
					
					lblNewLabel_6.setForeground(Color.RED);
					lblNewLabel_8.setForeground(Color.RED);
					
				}
				
				Thread Update = new Thread() {
					public void run(){

						String[] TDisplay = new File("C:\\PowerPlay\\Tournament").list();
						comboBox.setModel(new DefaultComboBoxModel(TDisplay));
						
					}
				};
				
				Update.start();
				Update.interrupt();
				
			}
		});
		lblWrite.setHorizontalAlignment(SwingConstants.CENTER);
		lblWrite.setForeground(Color.BLACK);
		lblWrite.setFont(new Font("Exo 2 Light", Font.PLAIN, 30));
		lblWrite.setBounds(0, 0, 132, 46);
		verifyhelper_1.add(lblWrite);
		
		Panel panel_1 = new Panel();
		panel_1.setLayout(null);
		panel_1.setBounds(890, 30, 69, 23);
		frmPowerplayMatchmakerV.getContentPane().add(panel_1);
		
		JLabel import_1 = new JLabel("Import");
		import_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				//TeamAf.
				String D = "C:\\PowerPlay\\Tournament\\" + comboBox.getSelectedItem() + "\\" + comboBox_1.getSelectedItem();
				MatchReader A = new MatchReader();
				Match B = A.read(D);
				
				String filepath = "C:\\PowerPlay\\Flags\\" + B.teamA + ".png" ;
				String filepath_2 = "C:\\PowerPlay\\Flags\\" + B.teamB + ".png" ;
				
				System.out.println(filepath);
				System.out.println(filepath_2);
                
				File AFlag = new File(filepath);
				File BFlag = new File(filepath_2);
				
				if(!AFlag.exists()) {
					TeamAf.setIcon(null);
					TeamAf.setText("FLAG NOT FOUND");
				}else {
					TeamAf.setIcon(new ImageIcon(filepath));
				}
				
				if(!BFlag.exists()) {
					TeamBf.setIcon(null);
					TeamBf.setText("FLAG NOT FOUND");
				}else {
					
					TeamBf.setIcon(new ImageIcon(filepath_2));
				}

				
				for(int i = 0; i<11;i++) {
					
					An[i].setText(B.A[i]);
					Bn[i].setText(B.B[i]);
					Ar[i].setText(Integer.toString(B.Astats[i][0]));
					Br[i].setText(Integer.toString(B.Bstats[i][0]));
					Ab[i].setText(Integer.toString(B.Astats[i][1]));
					Bb[i].setText(Integer.toString(B.Bstats[i][1]));
					Aw[i].setText(Integer.toString(B.Astats[i][2])) ;
					Bw[i].setText(Integer.toString(B.Bstats[i][2]));
					Abb[i].setText(Integer.toString(B.Astats[i][3]));
					Bbb[i].setText(Integer.toString(B.Bstats[i][3]));
					Af[i].setText(Integer.toString(B.Astats[i][5]));
					Bf[i].setText(Integer.toString(B.Bstats[i][5]));
					As[i].setText(Integer.toString(B.Astats[i][6]));
					Bs[i].setText(Integer.toString(B.Bstats[i][6]));
					Awd[i].setText(Integer.toString(B.Astats[i][7]));
					Bwd[i].setText(Integer.toString(B.Bstats[i][7]));
					Anb[i].setText(Integer.toString(B.Astats[i][8]));
					Bnb[i].setText(Integer.toString(B.Bstats[i][8]));
					brA[i].setText(Integer.toString(B.Astats[i][4]));
					brB[i].setText(Integer.toString(B.Bstats[i][4]));
				
				}
				
				matchinfo_1.setText(B.stage);
				matchinfo_2.setText(B.date);
			    matchinfo_3.setText(B.tournament);
				matchinfo_4.setText(B.venue);
				txtTeamB.setText(B.teamB);
				TeamAn.setText(B.teamA);
						
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				
				import_1.setForeground(Color.WHITE);
				panel_1.setBackground(Color.BLACK);
				
			}
			
			public void mouseExited(MouseEvent e) {
				
				import_1.setForeground(Color.BLACK);
				panel_1.setBackground(Color.WHITE);
				
			}
		});
		import_1.setHorizontalAlignment(SwingConstants.CENTER);
		import_1.setFont(new Font("Exo 2 Light", Font.PLAIN, 15));
		import_1.setBounds(10, 0, 49, 23);
		panel_1.add(import_1);
		
		frmPowerplayMatchmakerV.setBackground(Color.WHITE);
		frmPowerplayMatchmakerV.setBounds(100, 100, 1280, 720);
		frmPowerplayMatchmakerV.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		
		verify.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				verifyhelper.setBackground(new Color(0,128,128));
				verify.setForeground(Color.WHITE);			
			}
			@Override
			public void mouseExited(MouseEvent e) {
				verifyhelper.setBackground(Color.WHITE);
				verify.setForeground(new Color(0,128,128));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				
				int Arunsum = 0, Brunsum = 0;
				int Awicketsum = 0, Bwicketsum = 0, Abowlrunsum = 0, Bbowlrunsum = 0;
				int Aballsum =0, Bballsum =0;
				int batsmenballsA = 0, batsmenballsB = 0;
				String Aovers,Bovers;
				double Arr, Brr;
				PlayerList.setBackground(Color.GREEN);
				PlayerListB.setBackground(Color.GREEN);
				
				for(int i = 0; i<An.length;i++) {
					Arunsum = Arunsum + Integer.parseInt(Ar[i].getText()) + Integer.parseInt(Bwd[i].getText()) + Integer.parseInt(Bnb[i].getText());
					Brunsum = Brunsum + Integer.parseInt(Br[i].getText()) + Integer.parseInt(Awd[i].getText()) + Integer.parseInt(Anb[i].getText());
				    Bwicketsum = Bwicketsum + Integer.parseInt(Bw[i].getText());
				    Awicketsum = Awicketsum + Integer.parseInt(Aw[i].getText());
				    Bballsum = Bballsum + Integer.parseInt(Bbb[i].getText());
				    Aballsum = Aballsum + Integer.parseInt(Abb[i].getText());
				    Abowlrunsum = Abowlrunsum + Integer.parseInt(brA[i].getText());
				    Bbowlrunsum = Bbowlrunsum + Integer.parseInt(brB[i].getText());
				    batsmenballsA = batsmenballsA + Integer.parseInt(Ab[i].getText());
				    batsmenballsB = batsmenballsB + Integer.parseInt(Bb[i].getText());
				
				}
				
				for(int i = 0; i<An.length;i++) {
                     if(An[i].getText().isBlank()) {
                    	 PlayerList.setBackground(Color.RED);
                     }
                     if(Bn[i].getText().isBlank()) {
                    	 PlayerListB.setBackground(Color.RED);
                     }
				
				}
				
				Aovers = (int)(Aballsum/6) + "." + Aballsum%6;
				Bovers = (int)(Bballsum/6) + "." + Bballsum%6;
				
				Double X = new Double(Bballsum);
				Double Y = new Double(Aballsum);
				System.out.println(X);
				//jackB
				
				Arr = Arunsum/(double)(X/6);
				Brr = Brunsum/(double)(Y/6);
				
				Aovers_1.setText(Bovers);
				AFinalScore.setText(Arunsum + " - " + Bwicketsum);
				ARunRate.setText(String.format("%.2f", Arr));
				Bovers_1.setText(Aovers);
				BFinalScore.setText(Brunsum + " - " + Awicketsum);
				BRunRate.setText(String.format("%.2f", Brr));
				
				
				if(Awicketsum <11 && Awicketsum>-1) {
					
					Sumofwickets.setBackground(Color.GREEN);
					
				}else {
					Sumofwickets.setBackground(Color.RED);
				}
				
				if(Bwicketsum <11 && Bwicketsum>-1) {
					
					SumofwicketsB.setBackground(Color.GREEN);
					
				}else {
					SumofwicketsB.setBackground(Color.RED);
				}
				
				if(Arunsum == Bbowlrunsum) {
					
					sumofRuns.setBackground(Color.GREEN);
					
				}else {
					sumofRuns.setBackground(Color.RED);
				}
				
				if(Brunsum == Abowlrunsum) {
					
					sumofRunsB.setBackground(Color.GREEN);
					
				}else {
					sumofRunsB.setBackground(Color.RED);
				}
				
               if(Aballsum == batsmenballsB) {
					
					sumofBalls.setBackground(Color.GREEN);
					
				}else {
					sumofBalls.setBackground(Color.RED);
				}
				
				if(Bballsum == batsmenballsA) {
					
					SumofBallsB.setBackground(Color.GREEN);
					
				}else {
					SumofBallsB.setBackground(Color.RED);
				}
				
				if(Arunsum > Brunsum) {
					WinnerA.setBackground(Color.YELLOW);
					WinnerB.setBackground(Color.GRAY);
				}else if(Arunsum==Brunsum) {
					WinnerA.setBackground(Color.GRAY);
					WinnerB.setBackground(Color.GRAY);
				}else {
					WinnerB.setBackground(Color.YELLOW);
					WinnerA.setBackground(Color.GRAY);
				}
			}
		});

	}
}
