import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Canvas;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class raspberry extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					Player A = new Player();
					PlayerReader Read = new PlayerReader();
					A = Read.read("Austrailia", "Aaron Finch");
					PlayerLL use = new PlayerLL();
					use.insert(A);
					use.insert(null);
					use.insert(null);
					use.insert(Read.read("Pakistan", "Babar Azam"));
					//use.insert(Read.read("Pakistan", "Babar Azam"));
					//use.insert(A);


					raspberry frame = new raspberry(use, true);
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
	public raspberry(PlayerLL A, boolean promode) {
		setResizable(false);
		setTitle("Quick Comparasion");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1280, 720);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel apphelper = new JLabel("-");
		apphelper.setFont(new Font("Exo 2 Light", Font.PLAIN, 16));
		apphelper.setBounds(10, 642, 1254, 22);
		contentPane.add(apphelper);
		
		JLabel PG = new JLabel("-");
		PG.setBounds(998, 22, 238, 235);
		contentPane.add(PG);
		
		JLabel PB = new JLabel("-");
		PB.setBounds(680, 22, 238, 235);
		contentPane.add(PB);
		
		JLabel PR = new JLabel("-");
		PR.setBounds(362, 22, 238, 235);
		contentPane.add(PR);
		
		JLabel PY = new JLabel("-");
		PY.setHorizontalAlignment(SwingConstants.CENTER);
		PY.setBounds(42, 22, 238, 235);
		contentPane.add(PY);
		
		JLabel PP = new JLabel("");
		PP.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\P1.png"));
		PP.setHorizontalAlignment(SwingConstants.CENTER);
		PP.setBounds(10, 11, 304, 261);
		contentPane.add(PP);
		
		JLabel PP_1 = new JLabel("");
		PP_1.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\P2.png"));
		PP_1.setHorizontalAlignment(SwingConstants.CENTER);
		PP_1.setBounds(330, 11, 304, 261);
		contentPane.add(PP_1);
		
		JLabel PP_2 = new JLabel("");
		PP_2.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\P3.png"));
		PP_2.setHorizontalAlignment(SwingConstants.CENTER);
		PP_2.setBounds(650, 11, 304, 261);
		contentPane.add(PP_2);
		
		JLabel PP_3 = new JLabel("");
		PP_3.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\P4.png"));
		PP_3.setHorizontalAlignment(SwingConstants.CENTER);
		PP_3.setBounds(967, 11, 304, 261);
		contentPane.add(PP_3);
		
		JLabel PPY = new JLabel("");
		PPY.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\PPY.png"));
		PPY.setBounds(10, 276, 48, 490);
		contentPane.add(PPY);
		
		JLabel PPY_1 = new JLabel("");
		PPY_1.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\PPR.png"));
		PPY_1.setBounds(330, 276, 48, 490);
		contentPane.add(PPY_1);
		
		JLabel PPY_2 = new JLabel("");
		PPY_2.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\PPB.png"));
		PPY_2.setBounds(650, 276, 48, 490);
		contentPane.add(PPY_2);
		
		JLabel SRY_1 = new JLabel("");
		SRY_1.setHorizontalAlignment(SwingConstants.CENTER);
		SRY_1.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\0.png"));
		SRY_1.setBounds(68, 283, 46, 56);
		contentPane.add(SRY_1);
		
		JLabel SRY_2 = new JLabel("");
		SRY_2.setHorizontalAlignment(SwingConstants.CENTER);
		SRY_2.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\0.png"));
		SRY_2.setBounds(124, 283, 46, 56);
		contentPane.add(SRY_2);
		
		JLabel SRY_3 = new JLabel("");
		SRY_3.setHorizontalAlignment(SwingConstants.CENTER);
		SRY_3.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\0.png"));
		SRY_3.setBounds(180, 283, 46, 56);
		contentPane.add(SRY_3);
		
		JLabel SRY_4 = new JLabel("");
		SRY_4.setHorizontalAlignment(SwingConstants.CENTER);
		SRY_4.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\0.png"));
		SRY_4.setBounds(251, 283, 46, 56);
		contentPane.add(SRY_4);
		
		JLabel SRR_1 = new JLabel("");
		SRR_1.setHorizontalAlignment(SwingConstants.CENTER);
		SRR_1.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\0.png"));
		SRR_1.setBounds(388, 283, 46, 56);
		contentPane.add(SRR_1);
		
		JLabel SRR_2 = new JLabel("");
		SRR_2.setHorizontalAlignment(SwingConstants.CENTER);
		SRR_2.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\0.png"));
		SRR_2.setBounds(444, 283, 46, 56);
		contentPane.add(SRR_2);
		
		JLabel SRR_3 = new JLabel("");
		SRR_3.setHorizontalAlignment(SwingConstants.CENTER);
		SRR_3.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\0.png"));
		SRR_3.setBounds(500, 283, 46, 56);
		contentPane.add(SRR_3);
		
		JLabel SRR_4 = new JLabel("");
		SRR_4.setHorizontalAlignment(SwingConstants.CENTER);
		SRR_4.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\0.png"));
		SRR_4.setBounds(571, 283, 46, 56);
		contentPane.add(SRR_4);
		
		JLabel SRB_1 = new JLabel("");
		SRB_1.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\0.png"));
		SRB_1.setHorizontalAlignment(SwingConstants.CENTER);
		SRB_1.setBounds(718, 283, 46, 56);
		contentPane.add(SRB_1);
		
		JLabel SRB_2 = new JLabel("");
		SRB_2.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\0.png"));
		SRB_2.setHorizontalAlignment(SwingConstants.CENTER);
		SRB_2.setBounds(774, 283, 46, 56);
		contentPane.add(SRB_2);
		
		JLabel SRB_3 = new JLabel("");
		SRB_3.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\0.png"));
		SRB_3.setHorizontalAlignment(SwingConstants.CENTER);
		SRB_3.setBounds(830, 283, 46, 56);
		contentPane.add(SRB_3);
		
		JLabel SRB_4 = new JLabel("");
		SRB_4.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\0.png"));
		SRB_4.setHorizontalAlignment(SwingConstants.CENTER);
		SRB_4.setBounds(901, 283, 46, 56);
		contentPane.add(SRB_4);
		
		JLabel SRG_1 = new JLabel("");
		SRG_1.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\0.png"));
		SRG_1.setHorizontalAlignment(SwingConstants.CENTER);
		SRG_1.setBounds(1020, 283, 46, 56);
		contentPane.add(SRG_1);
		
		JLabel SRG_2 = new JLabel("");
		SRG_2.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\0.png"));
		SRG_2.setHorizontalAlignment(SwingConstants.CENTER);
		SRG_2.setBounds(1076, 283, 46, 56);
		contentPane.add(SRG_2);
		
		JLabel SRG_3 = new JLabel("");
		SRG_3.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\0.png"));
		SRG_3.setHorizontalAlignment(SwingConstants.CENTER);
		SRG_3.setBounds(1132, 283, 46, 56);
		contentPane.add(SRG_3);
		
		JLabel SRG_4 = new JLabel("");
		SRG_4.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\0.png"));
		SRG_4.setHorizontalAlignment(SwingConstants.CENTER);
		SRG_4.setBounds(1203, 283, 46, 56);
		contentPane.add(SRG_4);
		
		JLabel reddot = new JLabel("");
		reddot.setHorizontalAlignment(SwingConstants.CENTER);
		reddot.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\Decimal.png"));
		reddot.setBounds(550, 309, 20, 22);
		contentPane.add(reddot);
		
		JLabel yellowdot = new JLabel("");
		yellowdot.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\Decimal.png"));
		yellowdot.setHorizontalAlignment(SwingConstants.CENTER);
		yellowdot.setBounds(231, 309, 20, 22);
		contentPane.add(yellowdot);
		
		JLabel bluedot = new JLabel("");
		bluedot.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\Decimal.png"));
		bluedot.setHorizontalAlignment(SwingConstants.CENTER);
		bluedot.setBounds(883, 309, 20, 22);
		contentPane.add(bluedot);
		
		JLabel PPY_3 = new JLabel("");
		PPY_3.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\PPG.png"));
		PPY_3.setBounds(967, 283, 43, 490);
		contentPane.add(PPY_3);
		
		JLabel greendot = new JLabel("");
		greendot.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\Decimal.png"));
		greendot.setHorizontalAlignment(SwingConstants.CENTER);
		greendot.setBounds(1186, 309, 20, 22);
		contentPane.add(greendot);
		
		JLabel RSY_1 = new JLabel("");
		RSY_1.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\0.png"));
		RSY_1.setHorizontalAlignment(SwingConstants.CENTER);
		RSY_1.setBounds(68, 350, 46, 56);
		contentPane.add(RSY_1);
		
		JLabel RSY_2 = new JLabel("");
		RSY_2.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\0.png"));
		RSY_2.setHorizontalAlignment(SwingConstants.CENTER);
		RSY_2.setBounds(114, 350, 46, 56);
		contentPane.add(RSY_2);
		
		JLabel RSY_3 = new JLabel("");
		RSY_3.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\0.png"));
		RSY_3.setHorizontalAlignment(SwingConstants.CENTER);
		RSY_3.setBounds(162, 350, 46, 56);
		contentPane.add(RSY_3);
		
		JLabel RSY_4 = new JLabel("");
		RSY_4.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\0.png"));
		RSY_4.setHorizontalAlignment(SwingConstants.CENTER);
		RSY_4.setBounds(210, 350, 46, 56);
		contentPane.add(RSY_4);
		
		JLabel RSY_5 = new JLabel("");
		RSY_5.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\0.png"));
		RSY_5.setHorizontalAlignment(SwingConstants.CENTER);
		RSY_5.setBounds(257, 350, 46, 56);
		contentPane.add(RSY_5);
		
		JLabel WY_1 = new JLabel("");
		WY_1.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\0.png"));
		WY_1.setHorizontalAlignment(SwingConstants.CENTER);
		WY_1.setBounds(68, 487, 46, 56);
		contentPane.add(WY_1);
		
		JLabel WY_2 = new JLabel("");
		WY_2.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\0.png"));
		WY_2.setHorizontalAlignment(SwingConstants.CENTER);
		WY_2.setBounds(114, 487, 46, 56);
		contentPane.add(WY_2);
		
		JLabel WY_3 = new JLabel("");
		WY_3.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\0.png"));
		WY_3.setHorizontalAlignment(SwingConstants.CENTER);
		WY_3.setBounds(162, 487, 46, 56);
		contentPane.add(WY_3);
		
		JLabel WY_4 = new JLabel("");
		WY_4.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\0.png"));
		WY_4.setHorizontalAlignment(SwingConstants.CENTER);
		WY_4.setBounds(210, 487, 46, 56);
		contentPane.add(WY_4);
		
		JLabel WY_5 = new JLabel("");
		WY_5.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\0.png"));
		WY_5.setHorizontalAlignment(SwingConstants.CENTER);
		WY_5.setBounds(257, 487, 46, 56);
		contentPane.add(WY_5);
		
		JLabel RCY_1 = new JLabel("");
		RCY_1.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\0.png"));
		RCY_1.setHorizontalAlignment(SwingConstants.CENTER);
		RCY_1.setBounds(68, 566, 46, 56);
		contentPane.add(RCY_1);
		
		JLabel RCY_2 = new JLabel("");
		RCY_2.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\0.png"));
		RCY_2.setHorizontalAlignment(SwingConstants.CENTER);
		RCY_2.setBounds(114, 566, 46, 56);
		contentPane.add(RCY_2);
		
		JLabel RCY_3 = new JLabel("");
		RCY_3.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\0.png"));
		RCY_3.setHorizontalAlignment(SwingConstants.CENTER);
		RCY_3.setBounds(162, 566, 46, 56);
		contentPane.add(RCY_3);
		
		JLabel RCY_4 = new JLabel("");
		RCY_4.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\0.png"));
		RCY_4.setHorizontalAlignment(SwingConstants.CENTER);
		RCY_4.setBounds(210, 566, 46, 56);
		contentPane.add(RCY_4);
		
		JLabel RCY_5 = new JLabel("");
		RCY_5.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\0.png"));
		RCY_5.setHorizontalAlignment(SwingConstants.CENTER);
		RCY_5.setBounds(257, 566, 46, 56);
		contentPane.add(RCY_5);
		
		JLabel EY_1 = new JLabel("");
		EY_1.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\0.png"));
		EY_1.setHorizontalAlignment(SwingConstants.CENTER);
		EY_1.setBounds(68, 417, 46, 56);
		contentPane.add(EY_1);
		
		JLabel EY_2 = new JLabel("");
		EY_2.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\0.png"));
		EY_2.setHorizontalAlignment(SwingConstants.CENTER);
		EY_2.setBounds(124, 417, 46, 56);
		contentPane.add(EY_2);
		
		JLabel EY_3 = new JLabel("");
		EY_3.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\0.png"));
		EY_3.setHorizontalAlignment(SwingConstants.CENTER);
		EY_3.setBounds(208, 417, 46, 56);
		contentPane.add(EY_3);
		
		JLabel yellowdot_1 = new JLabel("");
		yellowdot_1.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\Decimal.png"));
		yellowdot_1.setHorizontalAlignment(SwingConstants.CENTER);
		yellowdot_1.setBounds(178, 440, 20, 22);
		contentPane.add(yellowdot_1);
		
		JLabel EY_4 = new JLabel("");
		EY_4.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\0.png"));
		EY_4.setHorizontalAlignment(SwingConstants.CENTER);
		EY_4.setBounds(251, 417, 46, 56);
		contentPane.add(EY_4);
		
		JLabel RSR_1 = new JLabel("");
		RSR_1.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\0.png"));
		RSR_1.setHorizontalAlignment(SwingConstants.CENTER);
		RSR_1.setBounds(388, 350, 46, 56);
		contentPane.add(RSR_1);
		
		JLabel RSR_2 = new JLabel("");
		RSR_2.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\0.png"));
		RSR_2.setHorizontalAlignment(SwingConstants.CENTER);
		RSR_2.setBounds(434, 350, 46, 56);
		contentPane.add(RSR_2);
		
		JLabel RSR_3 = new JLabel("");
		RSR_3.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\0.png"));
		RSR_3.setHorizontalAlignment(SwingConstants.CENTER);
		RSR_3.setBounds(482, 350, 46, 56);
		contentPane.add(RSR_3);
		
		JLabel RSR_4 = new JLabel("");
		RSR_4.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\0.png"));
		RSR_4.setHorizontalAlignment(SwingConstants.CENTER);
		RSR_4.setBounds(530, 350, 46, 56);
		contentPane.add(RSR_4);
		
		JLabel RSR_5 = new JLabel("");
		RSR_5.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\0.png"));
		RSR_5.setHorizontalAlignment(SwingConstants.CENTER);
		RSR_5.setBounds(577, 350, 46, 56);
		contentPane.add(RSR_5);
		
		JLabel WR_1 = new JLabel("");
		WR_1.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\0.png"));
		WR_1.setHorizontalAlignment(SwingConstants.CENTER);
		WR_1.setBounds(388, 487, 46, 56);
		contentPane.add(WR_1);
		
		JLabel WR_2 = new JLabel("");
		WR_2.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\0.png"));
		WR_2.setHorizontalAlignment(SwingConstants.CENTER);
		WR_2.setBounds(434, 487, 46, 56);
		contentPane.add(WR_2);
		
		JLabel WR_3 = new JLabel("");
		WR_3.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\0.png"));
		WR_3.setHorizontalAlignment(SwingConstants.CENTER);
		WR_3.setBounds(482, 487, 46, 56);
		contentPane.add(WR_3);
		
		JLabel WR_4 = new JLabel("");
		WR_4.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\0.png"));
		WR_4.setHorizontalAlignment(SwingConstants.CENTER);
		WR_4.setBounds(530, 487, 46, 56);
		contentPane.add(WR_4);
		
		JLabel WR_5 = new JLabel("");
		WR_5.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\0.png"));
		WR_5.setHorizontalAlignment(SwingConstants.CENTER);
		WR_5.setBounds(577, 487, 46, 56);
		contentPane.add(WR_5);
		
		JLabel RCR_1 = new JLabel("");
		RCR_1.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\0.png"));
		RCR_1.setHorizontalAlignment(SwingConstants.CENTER);
		RCR_1.setBounds(388, 566, 46, 56);
		contentPane.add(RCR_1);
		
		JLabel RCR_2 = new JLabel("");
		RCR_2.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\0.png"));
		RCR_2.setHorizontalAlignment(SwingConstants.CENTER);
		RCR_2.setBounds(434, 566, 46, 56);
		contentPane.add(RCR_2);
		
		JLabel RCR_3 = new JLabel("");
		RCR_3.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\0.png"));
		RCR_3.setHorizontalAlignment(SwingConstants.CENTER);
		RCR_3.setBounds(482, 566, 46, 56);
		contentPane.add(RCR_3);
		
		JLabel RCR_4 = new JLabel("");
		RCR_4.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\0.png"));
		RCR_4.setHorizontalAlignment(SwingConstants.CENTER);
		RCR_4.setBounds(530, 566, 46, 56);
		contentPane.add(RCR_4);
		
		JLabel RCR_5 = new JLabel("");
		RCR_5.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\0.png"));
		RCR_5.setHorizontalAlignment(SwingConstants.CENTER);
		RCR_5.setBounds(577, 566, 46, 56);
		contentPane.add(RCR_5);
		
		JLabel ER_1 = new JLabel("");
		ER_1.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\0.png"));
		ER_1.setHorizontalAlignment(SwingConstants.CENTER);
		ER_1.setBounds(388, 417, 46, 56);
		contentPane.add(ER_1);
		
		JLabel ER_2 = new JLabel("");
		ER_2.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\0.png"));
		ER_2.setHorizontalAlignment(SwingConstants.CENTER);
		ER_2.setBounds(444, 417, 46, 56);
		contentPane.add(ER_2);
		
		JLabel ER_3 = new JLabel("");
		ER_3.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\0.png"));
		ER_3.setHorizontalAlignment(SwingConstants.CENTER);
		ER_3.setBounds(528, 417, 46, 56);
		contentPane.add(ER_3);
		
		JLabel reddot_1 = new JLabel("");
		reddot_1.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\Decimal.png"));
		reddot_1.setHorizontalAlignment(SwingConstants.CENTER);
		reddot_1.setBounds(498, 440, 20, 22);
		contentPane.add(reddot_1);
		
		JLabel ER_4 = new JLabel("");
		ER_4.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\0.png"));
		ER_4.setHorizontalAlignment(SwingConstants.CENTER);
		ER_4.setBounds(571, 417, 46, 56);
		contentPane.add(ER_4);
		
		JLabel RSB_1 = new JLabel("");
		RSB_1.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\0.png"));
		RSB_1.setHorizontalAlignment(SwingConstants.CENTER);
		RSB_1.setBounds(718, 350, 46, 56);
		contentPane.add(RSB_1);
		
		JLabel RSB_2 = new JLabel("");
		RSB_2.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\0.png"));
		RSB_2.setHorizontalAlignment(SwingConstants.CENTER);
		RSB_2.setBounds(764, 350, 46, 56);
		contentPane.add(RSB_2);
		
		JLabel RSB_3 = new JLabel("");
		RSB_3.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\0.png"));
		RSB_3.setHorizontalAlignment(SwingConstants.CENTER);
		RSB_3.setBounds(812, 350, 46, 56);
		contentPane.add(RSB_3);
		
		JLabel RSB_4 = new JLabel("");
		RSB_4.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\0.png"));
		RSB_4.setHorizontalAlignment(SwingConstants.CENTER);
		RSB_4.setBounds(860, 350, 46, 56);
		contentPane.add(RSB_4);
		
		JLabel RSB_5 = new JLabel("");
		RSB_5.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\0.png"));
		RSB_5.setHorizontalAlignment(SwingConstants.CENTER);
		RSB_5.setBounds(907, 350, 46, 56);
		contentPane.add(RSB_5);
		
		JLabel WB_1 = new JLabel("");
		WB_1.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\0.png"));
		WB_1.setHorizontalAlignment(SwingConstants.CENTER);
		WB_1.setBounds(718, 487, 46, 56);
		contentPane.add(WB_1);
		
		JLabel WB_2 = new JLabel("");
		WB_2.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\0.png"));
		WB_2.setHorizontalAlignment(SwingConstants.CENTER);
		WB_2.setBounds(764, 487, 46, 56);
		contentPane.add(WB_2);
		
		JLabel WB_3 = new JLabel("");
		WB_3.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\0.png"));
		WB_3.setHorizontalAlignment(SwingConstants.CENTER);
		WB_3.setBounds(812, 487, 46, 56);
		contentPane.add(WB_3);
		
		JLabel WB_4 = new JLabel("");
		WB_4.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\0.png"));
		WB_4.setHorizontalAlignment(SwingConstants.CENTER);
		WB_4.setBounds(860, 487, 46, 56);
		contentPane.add(WB_4);
		
		JLabel WB_5 = new JLabel("");
		WB_5.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\0.png"));
		WB_5.setHorizontalAlignment(SwingConstants.CENTER);
		WB_5.setBounds(907, 487, 46, 56);
		contentPane.add(WB_5);
		
		JLabel RCB_1 = new JLabel("");
		RCB_1.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\0.png"));
		RCB_1.setHorizontalAlignment(SwingConstants.CENTER);
		RCB_1.setBounds(718, 566, 46, 56);
		contentPane.add(RCB_1);
		
		JLabel RCB_2 = new JLabel("");
		RCB_2.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\0.png"));
		RCB_2.setHorizontalAlignment(SwingConstants.CENTER);
		RCB_2.setBounds(764, 566, 46, 56);
		contentPane.add(RCB_2);
		
		JLabel RCB_3 = new JLabel("");
		RCB_3.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\0.png"));
		RCB_3.setHorizontalAlignment(SwingConstants.CENTER);
		RCB_3.setBounds(812, 566, 46, 56);
		contentPane.add(RCB_3);
		
		JLabel RCB_4 = new JLabel("");
		RCB_4.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\0.png"));
		RCB_4.setHorizontalAlignment(SwingConstants.CENTER);
		RCB_4.setBounds(860, 566, 46, 56);
		contentPane.add(RCB_4);
		
		JLabel RCB_5 = new JLabel("");
		RCB_5.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\0.png"));
		RCB_5.setHorizontalAlignment(SwingConstants.CENTER);
		RCB_5.setBounds(907, 566, 46, 56);
		contentPane.add(RCB_5);
		
		JLabel EB_1 = new JLabel("");
		EB_1.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\0.png"));
		EB_1.setHorizontalAlignment(SwingConstants.CENTER);
		EB_1.setBounds(718, 417, 46, 56);
		contentPane.add(EB_1);
		
		JLabel EB_2 = new JLabel("");
		EB_2.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\0.png"));
		EB_2.setHorizontalAlignment(SwingConstants.CENTER);
		EB_2.setBounds(774, 417, 46, 56);
		contentPane.add(EB_2);
		
		JLabel EB_3 = new JLabel("");
		EB_3.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\0.png"));
		EB_3.setHorizontalAlignment(SwingConstants.CENTER);
		EB_3.setBounds(858, 417, 46, 56);
		contentPane.add(EB_3);
		
		JLabel bluedot_1 = new JLabel("");
		bluedot_1.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\Decimal.png"));
		bluedot_1.setHorizontalAlignment(SwingConstants.CENTER);
		bluedot_1.setBounds(828, 440, 20, 22);
		contentPane.add(bluedot_1);
		
		JLabel EB_4 = new JLabel("");
		EB_4.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\0.png"));
		EB_4.setHorizontalAlignment(SwingConstants.CENTER);
		EB_4.setBounds(901, 417, 46, 56);
		contentPane.add(EB_4);
		
		JLabel RSG_1 = new JLabel("");
		RSG_1.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\0.png"));
		RSG_1.setHorizontalAlignment(SwingConstants.CENTER);
		RSG_1.setBounds(1020, 350, 46, 56);
		contentPane.add(RSG_1);
		
		JLabel RSG_2 = new JLabel("");
		RSG_2.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\0.png"));
		RSG_2.setHorizontalAlignment(SwingConstants.CENTER);
		RSG_2.setBounds(1066, 350, 46, 56);
		contentPane.add(RSG_2);
		
		JLabel RSG_3 = new JLabel("");
		RSG_3.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\0.png"));
		RSG_3.setHorizontalAlignment(SwingConstants.CENTER);
		RSG_3.setBounds(1114, 350, 46, 56);
		contentPane.add(RSG_3);
		
		JLabel RSG_4 = new JLabel("");
		RSG_4.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\0.png"));
		RSG_4.setHorizontalAlignment(SwingConstants.CENTER);
		RSG_4.setBounds(1162, 350, 46, 56);
		contentPane.add(RSG_4);
		
		JLabel RSG_5 = new JLabel("");
		RSG_5.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\0.png"));
		RSG_5.setHorizontalAlignment(SwingConstants.CENTER);
		RSG_5.setBounds(1209, 350, 46, 56);
		contentPane.add(RSG_5);
		
		JLabel WG_1 = new JLabel("");
		WG_1.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\0.png"));
		WG_1.setHorizontalAlignment(SwingConstants.CENTER);
		WG_1.setBounds(1020, 487, 46, 56);
		contentPane.add(WG_1);
		
		JLabel WG_2 = new JLabel("");
		WG_2.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\0.png"));
		WG_2.setHorizontalAlignment(SwingConstants.CENTER);
		WG_2.setBounds(1066, 487, 46, 56);
		contentPane.add(WG_2);
		
		JLabel WG_3 = new JLabel("");
		WG_3.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\0.png"));
		WG_3.setHorizontalAlignment(SwingConstants.CENTER);
		WG_3.setBounds(1114, 487, 46, 56);
		contentPane.add(WG_3);
		
		JLabel WG_4 = new JLabel("");
		WG_4.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\0.png"));
		WG_4.setHorizontalAlignment(SwingConstants.CENTER);
		WG_4.setBounds(1162, 487, 46, 56);
		contentPane.add(WG_4);
		
		JLabel WG_5 = new JLabel("");
		WG_5.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\0.png"));
		WG_5.setHorizontalAlignment(SwingConstants.CENTER);
		WG_5.setBounds(1209, 487, 46, 56);
		contentPane.add(WG_5);
		
		JLabel RCG_1 = new JLabel("");
		RCG_1.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\0.png"));
		RCG_1.setHorizontalAlignment(SwingConstants.CENTER);
		RCG_1.setBounds(1020, 566, 46, 56);
		contentPane.add(RCG_1);
		
		JLabel RCG_2 = new JLabel("");
		RCG_2.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\0.png"));
		RCG_2.setHorizontalAlignment(SwingConstants.CENTER);
		RCG_2.setBounds(1066, 566, 46, 56);
		contentPane.add(RCG_2);
		
		JLabel RCG_3 = new JLabel("");
		RCG_3.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\0.png"));
		RCG_3.setHorizontalAlignment(SwingConstants.CENTER);
		RCG_3.setBounds(1114, 566, 46, 56);
		contentPane.add(RCG_3);
		
		JLabel RCG_4 = new JLabel("");
		RCG_4.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\0.png"));
		RCG_4.setHorizontalAlignment(SwingConstants.CENTER);
		RCG_4.setBounds(1162, 566, 46, 56);
		contentPane.add(RCG_4);
		
		JLabel RCG_5 = new JLabel("");
		RCG_5.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\0.png"));
		RCG_5.setHorizontalAlignment(SwingConstants.CENTER);
		RCG_5.setBounds(1209, 566, 46, 56);
		contentPane.add(RCG_5);
		
		JLabel EG_1 = new JLabel("");
		EG_1.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\0.png"));
		EG_1.setHorizontalAlignment(SwingConstants.CENTER);
		EG_1.setBounds(1020, 417, 46, 56);
		contentPane.add(EG_1);
		
		JLabel EG_2 = new JLabel("");
		EG_2.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\0.png"));
		EG_2.setHorizontalAlignment(SwingConstants.CENTER);
		EG_2.setBounds(1076, 417, 46, 56);
		contentPane.add(EG_2);
		
		JLabel EG_3 = new JLabel("");
		EG_3.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\0.png"));
		EG_3.setHorizontalAlignment(SwingConstants.CENTER);
		EG_3.setBounds(1160, 417, 46, 56);
		contentPane.add(EG_3);
		
		JLabel greendot_1 = new JLabel("");
		greendot_1.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\Decimal.png"));
		greendot_1.setHorizontalAlignment(SwingConstants.CENTER);
		greendot_1.setBounds(1130, 440, 20, 22);
		contentPane.add(greendot_1);
		
		JLabel EG_4 = new JLabel("");
		EG_4.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\0.png"));
		EG_4.setHorizontalAlignment(SwingConstants.CENTER);
		EG_4.setBounds(1203, 417, 46, 56);
		contentPane.add(EG_4);
		
		if(promode) {

		if(A.search(0) != null) {
			
			PY.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Players\\"+A.search(0).team+"\\"+A.search(0).name+".png"));
			double S = new Double(A.search(0).truns);
			double R = new Double(A.search(0).tballs);
			double SR = S/R*1000;
			
			yellowdot.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Yellow\\decimal.png"));
			yellowdot_1.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Yellow\\decimal.png"));
			
			int strikerate = (int)Math.round(SR);
			
			int g = strikerate/1000;
			SRY_1.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Yellow\\" +  g + ".png"));
			g = (strikerate%1000)/100;
			SRY_2.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Yellow\\" +  g + ".png"));
			g = (strikerate%100)/10;
			SRY_3.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Yellow\\" +  g + ".png"));
			g = (strikerate%10)/1;
			SRY_4.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Yellow\\" +  g + ".png"));
			
		    int runscored = A.search(0).truns;
		    g = runscored/10000;
			RSY_1.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Yellow\\" + g + ".png"));
			g = (runscored%10000)/1000;
			RSY_2.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Yellow\\" + g + ".png"));
			g = (runscored%1000)/100;
			RSY_3.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Yellow\\" +  g + ".png"));
			g = (runscored%100)/10;
			RSY_4.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Yellow\\" +  g + ".png"));
			g = (runscored%10)/1;
			RSY_5.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Yellow\\" +  g + ".png"));
			
		    runscored = A.search(0).twickets;
		    g = runscored/10000;
			WY_1.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Yellow\\" + g + ".png"));
			g = (runscored%10000)/1000;
			WY_2.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Yellow\\" + g + ".png"));
			g = (runscored%1000)/100;
			WY_3.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Yellow\\" +  g + ".png"));
			g = (runscored%100)/10;
			WY_4.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Yellow\\" +  g + ".png"));
			g = (runscored%10)/1;
			WY_5.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Yellow\\" +  g + ".png"));
			
		    runscored = A.search(0).bruns;
		    g = runscored/10000;
			RCY_1.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Yellow\\" + g + ".png"));
			g = (runscored%10000)/1000;
			RCY_2.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Yellow\\" + g + ".png"));
			g = (runscored%1000)/100;
			RCY_3.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Yellow\\" +  g + ".png"));
			g = (runscored%100)/10;
			RCY_4.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Yellow\\" +  g + ".png"));
			g = (runscored%10)/1;
			RCY_5.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Yellow\\" +  g + ".png"));
			
			 S = new Double(A.search(0).bruns);
			 R = new Double(A.search(0).tbballs);
			 SR = S/R*100;
	         strikerate = (int)Math.round(SR);
		     g = strikerate/1000;	     
			 EY_1.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Yellow\\" +  g + ".png"));
			 g = (strikerate%1000)/100;
			 EY_2.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Yellow\\" +  g + ".png"));
			 g = (strikerate%100)/10;
			 EY_3.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Yellow\\" +  g + ".png"));
		    g = (strikerate%10)/1;
		    EY_4.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Yellow\\" +  g + ".png"));
				
	}
		
		if(A.search(1) != null) {
			
			PR.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Players\\"+A.search(1).team+"\\"+A.search(1).name+".png"));
			double S = new Double(A.search(1).truns);
			double R = new Double(A.search(1).tballs);
			double SR = S/R*1000;
			
			reddot.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Red\\decimal.png"));
			reddot_1.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Red\\decimal.png"));
			
			int strikerate = (int)Math.round(SR);
			
			int g = strikerate/1000;
			SRR_1.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Red\\" +  g + ".png"));
			g = (strikerate%1000)/100;
			SRR_2.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Red\\" +  g + ".png"));
			g = (strikerate%100)/10;
			SRR_3.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Red\\" +  g + ".png"));
			g = (strikerate%10)/1;
			SRR_4.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Red\\" +  g + ".png"));
			
		    int runscored = A.search(1).truns;
		    g = runscored/10000;
			RSR_1.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Red\\" + g + ".png"));
			g = (runscored%10000)/1000;
			RSR_2.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Red\\" + g + ".png"));
			g = (runscored%1000)/100;
			RSR_3.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Red\\" +  g + ".png"));
			g = (runscored%100)/10;
			RSR_4.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Red\\" +  g + ".png"));
			g = (runscored%10)/1;
			RSR_5.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Red\\" +  g + ".png"));
			
		    runscored = A.search(1).twickets;
		    g = runscored/10000;
			WR_1.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Red\\" + g + ".png"));
			g = (runscored%10000)/1000;
			WR_2.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Red\\" + g + ".png"));
			g = (runscored%1000)/100;
			WR_3.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Red\\" +  g + ".png"));
			g = (runscored%100)/10;
			WR_4.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Red\\" +  g + ".png"));
			g = (runscored%10)/1;
			WR_5.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Red\\" +  g + ".png"));
			
		    runscored = A.search(1).bruns;
		    g = runscored/10000;
			RCR_1.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Red\\" + g + ".png"));
			g = (runscored%10000)/1000;
			RCR_2.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Red\\" + g + ".png"));
			g = (runscored%1000)/100;
			RCR_3.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Red\\" +  g + ".png"));
			g = (runscored%100)/10;
			RCR_4.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Red\\" +  g + ".png"));
			g = (runscored%10)/1;
			RCR_5.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Red\\" +  g + ".png"));
			
			 S = new Double(A.search(1).bruns);
			 R = new Double(A.search(1).tbballs);
			 SR = S/R*100;
	         strikerate = (int)Math.round(SR);
		     g = strikerate/1000;	     
			 ER_1.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Red\\" +  g + ".png"));
			 g = (strikerate%1000)/100;
			 ER_2.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Red\\" +  g + ".png"));
			 g = (strikerate%100)/10;
			 ER_3.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Red\\" +  g + ".png"));
		    g = (strikerate%10)/1;
		    ER_4.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Red\\" +  g + ".png"));
				
	}
		if(A.search(2) != null) {
			
			PB.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Players\\"+A.search(2).team+"\\"+A.search(2).name+".png"));
			double S = new Double(A.search(2).truns);
			double R = new Double(A.search(2).tballs);
			double SR = S/R*1000;
			
			bluedot.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Blue\\decimal.png"));
			bluedot_1.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Blue\\decimal.png"));
			
			int strikerate = (int)Math.round(SR);
			
			int g = strikerate/1000;
			SRB_1.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Blue\\" +  g + ".png"));
			g = (strikerate%1000)/100;
			SRB_2.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Blue\\" +  g + ".png"));
			g = (strikerate%100)/10;
			SRB_3.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Blue\\" +  g + ".png"));
			g = (strikerate%10)/1;
			SRB_4.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Blue\\" +  g + ".png"));
			
		    int runscored = A.search(2).truns;
		    g = runscored/10000;
			RSB_1.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Blue\\" + g + ".png"));
			g = (runscored%10000)/1000;
			RSB_2.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Blue\\" + g + ".png"));
			g = (runscored%1000)/100;
			RSB_3.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Blue\\" +  g + ".png"));
			g = (runscored%100)/10;
			RSB_4.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Blue\\" +  g + ".png"));
			g = (runscored%10)/1;
			RSB_5.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Blue\\" +  g + ".png"));
			
		    runscored = A.search(2).twickets;
		    g = runscored/10000;
			WB_1.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Blue\\" + g + ".png"));
			g = (runscored%10000)/1000;
			WB_2.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Blue\\" + g + ".png"));
			g = (runscored%1000)/100;
			WB_3.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Blue\\" +  g + ".png"));
			g = (runscored%100)/10;
			WB_4.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Blue\\" +  g + ".png"));
			g = (runscored%10)/1;
			WB_5.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Blue\\" +  g + ".png"));
			
		    runscored = A.search(2).bruns;
		    g = runscored/10000;
			RCB_1.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Blue\\" + g + ".png"));
			g = (runscored%10000)/1000;
			RCB_2.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Blue\\" + g + ".png"));
			g = (runscored%1000)/100;
			RCB_3.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Blue\\" +  g + ".png"));
			g = (runscored%100)/10;
			RCB_4.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Blue\\" +  g + ".png"));
			g = (runscored%10)/1;
			RCB_5.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Blue\\" +  g + ".png"));
			
			 S = new Double(A.search(2).bruns);
			 R = new Double(A.search(2).tbballs);
			 SR = S/R*100;
	         strikerate = (int)Math.round(SR);
		     g = strikerate/1000;	     
			 EB_1.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Blue\\" +  g + ".png"));
			 g = (strikerate%1000)/100;
			 EB_2.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Blue\\" +  g + ".png"));
			 g = (strikerate%100)/10;
			 EB_3.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Blue\\" +  g + ".png"));
		    g = (strikerate%10)/1;
		    EB_4.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Blue\\" +  g + ".png"));
				
	}
		if(A.search(3) != null) {
			
			PG.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Players\\"+A.search(3).team+"\\"+A.search(3).name+".png"));
			double S = new Double(A.search(3).truns);
			double R = new Double(A.search(3).tballs);
			double SR = S/R*1000;
			
			greendot.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Green\\decimal.png"));
			greendot_1.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Green\\decimal.png"));
			
			int strikerate = (int)Math.round(SR);
			
			int g = strikerate/1000;
			SRG_1.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Green\\" +  g + ".png"));
			g = (strikerate%1000)/100;
			SRG_2.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Green\\" +  g + ".png"));
			g = (strikerate%100)/10;
			SRG_3.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Green\\" +  g + ".png"));
			g = (strikerate%10)/1;
			SRG_4.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Green\\" +  g + ".png"));
			
		    int runscored = A.search(3).truns;
		    g = runscored/10000;
			RSG_1.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Green\\" + g + ".png"));
			g = (runscored%10000)/1000;
			RSG_2.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Green\\" + g + ".png"));
			g = (runscored%1000)/100;
			RSG_3.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Green\\" +  g + ".png"));
			g = (runscored%100)/10;
			RSG_4.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Green\\" +  g + ".png"));
			g = (runscored%10)/1;
			RSG_5.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Green\\" +  g + ".png"));
			
		    runscored = A.search(3).twickets;
		    g = runscored/10000;
			WG_1.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Green\\" + g + ".png"));
			g = (runscored%10000)/1000;
			WG_2.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Green\\" + g + ".png"));
			g = (runscored%1000)/100;
			WG_3.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Green\\" +  g + ".png"));
			g = (runscored%100)/10;
			WG_4.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Green\\" +  g + ".png"));
			g = (runscored%10)/1;
			WG_5.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Green\\" +  g + ".png"));
			
		    runscored = A.search(3).bruns;
		    g = runscored/10000;
			RCG_1.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Green\\" + g + ".png"));
			g = (runscored%10000)/1000;
			RCG_2.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Green\\" + g + ".png"));
			g = (runscored%1000)/100;
			RCG_3.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Green\\" +  g + ".png"));
			g = (runscored%100)/10;
			RCG_4.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Green\\" +  g + ".png"));
			g = (runscored%10)/1;
			RCG_5.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Green\\" +  g + ".png"));
			
			 S = new Double(A.search(3).bruns);
			 R = new Double(A.search(3).tbballs);
			 SR = S/R*100;
	         strikerate = (int)Math.round(SR);
		     g = strikerate/1000;	     
			 EG_1.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Green\\" +  g + ".png"));
			 g = (strikerate%1000)/100;
			 EG_2.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Green\\" +  g + ".png"));
			 g = (strikerate%100)/10;
			 EG_3.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Green\\" +  g + ".png"));
		    g = (strikerate%10)/1;
		    EG_4.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Green\\" +  g + ".png"));
				
	     }
	}else{
		

		if(A.search(0) != null) {
			
			PY.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Players\\"+A.search(0).team+"\\"+A.search(0).name+".png"));
			double S = new Double(A.search(0).truns);
			double R = new Double(A.search(0).tballs);
			double SR = S/R*1000;
			
			int strikerate = (int)Math.round(SR);
			
			int g = strikerate/1000;
			SRY_1.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\" +  g + ".png"));
			g = (strikerate%1000)/100;
			SRY_2.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\" +  g + ".png"));
			g = (strikerate%100)/10;
			SRY_3.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\" +  g + ".png"));
			g = (strikerate%10)/1;
			SRY_4.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\" +  g + ".png"));
			
		    int runscored = A.search(0).truns;
		    g = runscored/10000;
			RSY_1.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\" + g + ".png"));
			g = (runscored%10000)/1000;
			RSY_2.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\" + g + ".png"));
			g = (runscored%1000)/100;
			RSY_3.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\" +  g + ".png"));
			g = (runscored%100)/10;
			RSY_4.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\" +  g + ".png"));
			g = (runscored%10)/1;
			RSY_5.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\" +  g + ".png"));
			
		    runscored = A.search(0).twickets;
		    g = runscored/10000;
			WY_1.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\" + g + ".png"));
			g = (runscored%10000)/1000;
			WY_2.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\" + g + ".png"));
			g = (runscored%1000)/100;
			WY_3.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\" +  g + ".png"));
			g = (runscored%100)/10;
			WY_4.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\" +  g + ".png"));
			g = (runscored%10)/1;
			WY_5.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\" +  g + ".png"));
			
		    runscored = A.search(0).bruns;
		    g = runscored/10000;
			RCY_1.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\" + g + ".png"));
			g = (runscored%10000)/1000;
			RCY_2.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\" + g + ".png"));
			g = (runscored%1000)/100;
			RCY_3.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\" +  g + ".png"));
			g = (runscored%100)/10;
			RCY_4.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\" +  g + ".png"));
			g = (runscored%10)/1;
			RCY_5.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\" +  g + ".png"));
			
			 S = new Double(A.search(0).bruns);
			 R = new Double(A.search(0).tbballs);
			 SR = S/R*100;
	         strikerate = (int)Math.round(SR);
		     g = strikerate/1000;	     
			 EY_1.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\" +  g + ".png"));
			 g = (strikerate%1000)/100;
			 EY_2.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\" +  g + ".png"));
			 g = (strikerate%100)/10;
			 EY_3.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\" +  g + ".png"));
		    g = (strikerate%10)/1;
		    EY_4.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\" +  g + ".png"));
				
	}
		
		if(A.search(1) != null) {
			
			PR.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Players\\"+A.search(1).team+"\\"+A.search(1).name+".png"));
			double S = new Double(A.search(1).truns);
			double R = new Double(A.search(1).tballs);
			double SR = S/R*1000;
			
			int strikerate = (int)Math.round(SR);
			
			int g = strikerate/1000;
			SRR_1.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\" +  g + ".png"));
			g = (strikerate%1000)/100;
			SRR_2.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\" +  g + ".png"));
			g = (strikerate%100)/10;
			SRR_3.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\" +  g + ".png"));
			g = (strikerate%10)/1;
			SRR_4.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\" +  g + ".png"));
			
		    int runscored = A.search(1).truns;
		    g = runscored/10000;
			RSR_1.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\" + g + ".png"));
			g = (runscored%10000)/1000;
			RSR_2.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\" + g + ".png"));
			g = (runscored%1000)/100;
			RSR_3.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\" +  g + ".png"));
			g = (runscored%100)/10;
			RSR_4.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\" +  g + ".png"));
			g = (runscored%10)/1;
			RSR_5.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\" +  g + ".png"));
			
		    runscored = A.search(1).twickets;
		    g = runscored/10000;
			WR_1.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\" + g + ".png"));
			g = (runscored%10000)/1000;
			WR_2.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\" + g + ".png"));
			g = (runscored%1000)/100;
			WR_3.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\" +  g + ".png"));
			g = (runscored%100)/10;
			WR_4.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\" +  g + ".png"));
			g = (runscored%10)/1;
			WR_5.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\" +  g + ".png"));
			
		    runscored = A.search(1).bruns;
		    g = runscored/10000;
			RCR_1.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\" + g + ".png"));
			g = (runscored%10000)/1000;
			RCR_2.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\" + g + ".png"));
			g = (runscored%1000)/100;
			RCR_3.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\" +  g + ".png"));
			g = (runscored%100)/10;
			RCR_4.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\" +  g + ".png"));
			g = (runscored%10)/1;
			RCR_5.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\" +  g + ".png"));
			
			 S = new Double(A.search(1).bruns);
			 R = new Double(A.search(1).tbballs);
			 SR = S/R*100;
	         strikerate = (int)Math.round(SR);
		     g = strikerate/1000;	     
			 ER_1.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\" +  g + ".png"));
			 g = (strikerate%1000)/100;
			 ER_2.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\" +  g + ".png"));
			 g = (strikerate%100)/10;
			 ER_3.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\" +  g + ".png"));
		    g = (strikerate%10)/1;
		    ER_4.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\" +  g + ".png"));
				
	}
		if(A.search(2) != null) {
			
			PB.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Players\\"+A.search(2).team+"\\"+A.search(2).name+".png"));
			double S = new Double(A.search(2).truns);
			double R = new Double(A.search(2).tballs);
			double SR = S/R*1000;
			
			int strikerate = (int)Math.round(SR);
			
			int g = strikerate/1000;
			SRB_1.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\" +  g + ".png"));
			g = (strikerate%1000)/100;
			SRB_2.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\" +  g + ".png"));
			g = (strikerate%100)/10;
			SRB_3.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\" +  g + ".png"));
			g = (strikerate%10)/1;
			SRB_4.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\" +  g + ".png"));
			
		    int runscored = A.search(2).truns;
		    g = runscored/10000;
			RSB_1.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\" + g + ".png"));
			g = (runscored%10000)/1000;
			RSB_2.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\" + g + ".png"));
			g = (runscored%1000)/100;
			RSB_3.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\" +  g + ".png"));
			g = (runscored%100)/10;
			RSB_4.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\" +  g + ".png"));
			g = (runscored%10)/1;
			RSB_5.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\" +  g + ".png"));
			
		    runscored = A.search(2).twickets;
		    g = runscored/10000;
			WB_1.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\" + g + ".png"));
			g = (runscored%10000)/1000;
			WB_2.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\" + g + ".png"));
			g = (runscored%1000)/100;
			WB_3.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\" +  g + ".png"));
			g = (runscored%100)/10;
			WB_4.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\" +  g + ".png"));
			g = (runscored%10)/1;
			WB_5.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\" +  g + ".png"));
			
		    runscored = A.search(2).bruns;
		    g = runscored/10000;
			RCB_1.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\" + g + ".png"));
			g = (runscored%10000)/1000;
			RCB_2.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\" + g + ".png"));
			g = (runscored%1000)/100;
			RCB_3.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\" +  g + ".png"));
			g = (runscored%100)/10;
			RCB_4.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\" +  g + ".png"));
			g = (runscored%10)/1;
			RCB_5.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\" +  g + ".png"));
			
			 S = new Double(A.search(2).bruns);
			 R = new Double(A.search(2).tbballs);
			 SR = S/R*100;
	         strikerate = (int)Math.round(SR);
		     g = strikerate/1000;	     
			 EB_1.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\" +  g + ".png"));
			 g = (strikerate%1000)/100;
			 EB_2.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\" +  g + ".png"));
			 g = (strikerate%100)/10;
			 EB_3.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\" +  g + ".png"));
		    g = (strikerate%10)/1;
		    EB_4.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\" +  g + ".png"));
				
	}
		if(A.search(3) != null) {
			
			PG.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Players\\"+A.search(3).team+"\\"+A.search(3).name+".png"));
			double S = new Double(A.search(3).truns);
			double R = new Double(A.search(3).tballs);
			double SR = S/R*1000;
			
			int strikerate = (int)Math.round(SR);
			
			int g = strikerate/1000;
			SRG_1.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\" +  g + ".png"));
			g = (strikerate%1000)/100;
			SRG_2.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\" +  g + ".png"));
			g = (strikerate%100)/10;
			SRG_3.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\" +  g + ".png"));
			g = (strikerate%10)/1;
			SRG_4.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\" +  g + ".png"));
			
		    int runscored = A.search(3).truns;
		    g = runscored/10000;
			RSG_1.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\" + g + ".png"));
			g = (runscored%10000)/1000;
			RSG_2.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\" + g + ".png"));
			g = (runscored%1000)/100;
			RSG_3.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\" +  g + ".png"));
			g = (runscored%100)/10;
			RSG_4.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\" +  g + ".png"));
			g = (runscored%10)/1;
			RSG_5.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\" +  g + ".png"));
			
		    runscored = A.search(3).twickets;
		    g = runscored/10000;
			WG_1.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\" + g + ".png"));
			g = (runscored%10000)/1000;
			WG_2.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\" + g + ".png"));
			g = (runscored%1000)/100;
			WG_3.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\" +  g + ".png"));
			g = (runscored%100)/10;
			WG_4.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\" +  g + ".png"));
			g = (runscored%10)/1;
			WG_5.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\" +  g + ".png"));
			
		    runscored = A.search(3).bruns;
		    g = runscored/10000;
			RCG_1.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\" + g + ".png"));
			g = (runscored%10000)/1000;
			RCG_2.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\" + g + ".png"));
			g = (runscored%1000)/100;
			RCG_3.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\" +  g + ".png"));
			g = (runscored%100)/10;
			RCG_4.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\" +  g + ".png"));
			g = (runscored%10)/1;
			RCG_5.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\" +  g + ".png"));
			
			 S = new Double(A.search(3).bruns);
			 R = new Double(A.search(3).tbballs);
			 SR = S/R*100;
	         strikerate = (int)Math.round(SR);
		     g = strikerate/1000;	     
			 EG_1.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\" +  g + ".png"));
			 g = (strikerate%1000)/100;
			 EG_2.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\" +  g + ".png"));
			 g = (strikerate%100)/10;
			 EG_3.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\" +  g + ".png"));
		    g = (strikerate%10)/1;
		    EG_4.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Numbers\\Grey\\" +  g + ".png"));
				
	     }
		
	}
		
		PY.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				if(A.search(0) != null) {
				apphelper.setText("Name : " + A.search(0).name + " | Team : " + A.search(0).team + " | Age : " + A.search(0).age);
				}else {			
					apphelper.setText("No player loaded at yellow!");
				}
			}
			@Override
			public void mouseExited(MouseEvent e) {
				apphelper.setText("-");
			}
		});
		PR.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				if(A.search(1) != null) {
				apphelper.setText("Name : " + A.search(1).name + " | Team : " + A.search(1).team + " | Age : " + A.search(1).age);
				}else {			
					apphelper.setText("No player loaded at red!");
				}
			}
			@Override
			public void mouseExited(MouseEvent e) {
				apphelper.setText("-");
			}
		});
		PB.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				if(A.search(2) != null) {
				apphelper.setText("Name : " + A.search(2).name + " | Team : " + A.search(2).team + " | Age : " + A.search(2).age);
				}else {			
					apphelper.setText("No player loaded at blue!");
				}
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				apphelper.setText("-");
			}
		});
		PG.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				if(A.search(3) != null) {
				apphelper.setText("Name : " + A.search(3).name + " | Team : " + A.search(3).team + " | Age : " + A.search(3).age);
				}else {			
					apphelper.setText("No player loaded at green!");
				}			
			}
			@Override
			public void mouseExited(MouseEvent e) {
				apphelper.setText("-");
			}
		});

	}
}
