
import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.MouseInfo;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.text.DecimalFormat;

import javax.swing.SwingConstants;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;

public class Teamviewer extends JFrame implements ActionListener {

	boolean a,b,c,d;
    int sel = -1;
	DecimalFormat formatter = new DecimalFormat("###.#");
	PlayerReader Pread = new PlayerReader();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Teamviewer frame = new Teamviewer();
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
	
	Timer tm = new Timer(15, this);
	private final JPanel L_1 = new JPanel();
	private final JPanel L_2 = new JPanel();
	JLabel DB = new JLabel("");
	JLabel DB_1 = new JLabel("");
	private JPanel contentPane;
	private final JPanel sep_1 = new JPanel();
	private final JPanel sep = new JPanel();
	private final JPanel Prevp = new JPanel();
	private final JPanel Nextp = new JPanel();
	private final JLabel Prevb = new JLabel("[");
	private final JLabel Nextb = new JLabel("]");
	JComboBox comboBox = new JComboBox();
	private final JLabel W = new JLabel("<Undefined>");
	private final JLabel W_1 = new JLabel("<Undefined>");
	private final JLabel W_2 = new JLabel("<Undefined>");
	private final JLabel W_3 = new JLabel("<Undefined>");
	private final JLabel TeamAf = new JLabel("<Undefined>");
	
	public void actionPerformed(ActionEvent e) {
		
		if(DB.getX()<-280) {
			DB.setBounds(984+280, 615, 280, 65);
			DB_1.setBounds(-257, 10, 267, 65);
			L_2.setBounds(-245, 679, 245, 1);
			L_1.setBounds(1264, 59, 245, 1);
		}
    DB.setBounds(DB.getX()-1, 615, 280, 65);
    DB_1.setBounds(DB_1.getX()+1, 0, 280, 60);
    L_1.setBounds(L_1.getX()-1,59,245,1);
    L_2.setBounds(L_2.getX()+1,615,245,1);
		
	}
	
	public Teamviewer() {
		
        String[] fpm = (new File("C:\\PowerPlay\\Tournament").list());
        MatchLL use_1 = new MatchLL();
        MatchReader Mread = new MatchReader();
        
        for (int i = 0; i < fpm.length; i++) {
        	String[] fptm = (new File("C:\\PowerPlay\\Tournament\\" + fpm[i]+"\\").list());
			for (int k = 0; k < fptm.length; k++) {
				  use_1.insert(Mread.read("C:\\PowerPlay\\Tournament\\" + fpm[i]+"\\" +fptm[k]));
				  System.out.println("C:\\PowerPlay\\Tournament\\" + fpm[i]+"\\" +fptm[k]);
			}
		}
		
        System.out.println(use_1.length());
		StringLL List = new StringLL();	
		String[] array = (new File("C:\\PowerPlay\\Players\\").list());
		int use = -1;
		
		for(int i = 0; i<array.length;i++) {
			List.insert(array[i]);
		}
        
		setResizable(false);
		setTitle("PowerPlay TeamViewer");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(00, 00, 1280,720);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Canvas seper = new Canvas();
		seper.setBackground(new Color(128, 128, 128));
		seper.setBounds(72, 510, 300, 1);
		contentPane.add(seper);
		
		Canvas seper_2 = new Canvas();
		seper_2.setBackground(new Color(128, 128, 128));
		seper_2.setBounds(71, 237, 300, 1);
		contentPane.add(seper_2);
		
		Canvas seper_1 = new Canvas();
		seper_1.setBackground(new Color(128, 128, 128));
		seper_1.setBounds(72, 423, 300, 1);
		contentPane.add(seper_1);
		
		JLabel lblTopSquadBowlers = new JLabel("Top Squad Bowlers");
		lblTopSquadBowlers.setForeground(Color.GRAY);
		lblTopSquadBowlers.setFont(new Font("Jersey M54", Font.PLAIN, 26));
		lblTopSquadBowlers.setBounds(881, 115, 329, 65);
		contentPane.add(lblTopSquadBowlers);
		
		JPanel jp = new JPanel();
		jp.setLayout(null);
		jp.setBackground(Color.WHITE);
		jp.setBounds(976, 0, 298, 59);
		contentPane.add(jp);
		
		JLabel j = new JLabel("JUMP");
		j.setHorizontalAlignment(SwingConstants.CENTER);
		j.setForeground(new Color(47, 79, 79));
		j.setFont(new Font("Jersey M54", Font.PLAIN, 45));
		j.setBounds(150, 0, 138, 59);
		jp.add(j);
		comboBox.setBackground(new Color(0, 128, 128));
		comboBox.setEditable(true);
		comboBox.setForeground(Color.BLACK);
		comboBox.setFont(new Font("Exo 2 Light", Font.PLAIN, 16));
		comboBox.setBounds(0, 0, 140, 22);
		jp.add(comboBox);
		
		comboBox.setModel(new DefaultComboBoxModel(array));
		
		JLabel Counter = new JLabel("0 out of " + array.length);
		Counter.setBounds(0, 21, 140, 33);
		jp.add(Counter);
		Counter.setFont(new Font("Exo 2 Light", Font.PLAIN, 26));
		
		JPanel sp = new JPanel();
		sp.setBackground(new Color(255, 255, 255));
		sp.setBounds(1088, 618, 176, 65);
		contentPane.add(sp);
		sp.setLayout(null);
		
		JLabel s = new JLabel("Select");
		s.setForeground(new Color(47, 79, 79));
		s.setHorizontalAlignment(SwingConstants.CENTER);
		s.setFont(new Font("Jersey M54", Font.PLAIN, 56));
		s.setBounds(0, 0, 176, 65);
		sp.add(s);
		

		DB.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\label1.png"));
		DB.setBounds(984+280, 615, 280, 65);
		contentPane.add(DB);
		DB_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				BatchWritex x = new BatchWritex();
				x.start();
			}
		});
		
		


		DB_1.setHorizontalAlignment(SwingConstants.CENTER);
		DB_1.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\label1.png"));
		DB_1.setBounds(-257, 0, 267, 60);
		contentPane.add(DB_1);
		L_1.setBackground(new Color(0, 0, 0));
		L_1.setBounds(1264, 59, 245, 1);
		
		contentPane.add(L_1);
		L_2.setBackground(new Color(0, 0, 0));
		L_2.setBounds(-245, 679, 245, 1);
		
		contentPane.add(L_2);
		sep_1.setBackground(new Color(204, 204, 204));
		sep_1.setBounds(10, 59, 1244, 1);
		
		contentPane.add(sep_1);
		sep.setBackground(new Color(204, 204, 204));
		sep.setBounds(10, 615, 1244, 1);
		
		contentPane.add(sep);
		Prevp.setBackground(Color.WHITE);
		Prevp.setBounds(10, 305, 36, 75);
		
		contentPane.add(Prevp);
		Prevp.setLayout(null);
		Prevb.setFont(new Font("Exo 2 Medium", Font.PLAIN, 48));
		Prevb.setForeground(Color.BLACK);
		Prevb.setHorizontalAlignment(SwingConstants.CENTER);
		Prevb.setBounds(0, -18, 36, 106);
		
		Prevp.add(Prevb);
		Nextp.setBackground(Color.WHITE);
		Nextp.setBounds(1220, 305, 36, 75);
		
		contentPane.add(Nextp);
		Nextp.setLayout(null);
		Nextb.setHorizontalAlignment(SwingConstants.CENTER);
		Nextb.setForeground(Color.BLACK);
		Nextb.setFont(new Font("Exo 2 Medium", Font.PLAIN, 48));
		Nextb.setBounds(0, -18, 36, 106);
		
		Nextp.add(Nextb);
		W.setForeground(Color.GRAY);
		W.setFont(new Font("Exo 2 Medium", Font.PLAIN, 20));
		W.setBounds(881, 471, 230, 32);
		
		contentPane.add(W);
		W_1.setForeground(Color.GRAY);
		W_1.setFont(new Font("Exo 2 Medium", Font.PLAIN, 20));
		W_1.setBounds(881, 503, 230, 32);
		
		contentPane.add(W_1);
		W_2.setForeground(Color.GRAY);
		W_2.setFont(new Font("Exo 2 Medium", Font.PLAIN, 20));
		W_2.setBounds(881, 535, 230, 32);
		
		contentPane.add(W_2);
		W_3.setForeground(Color.GRAY);
		W_3.setFont(new Font("Exo 2 Medium", Font.PLAIN, 20));
		W_3.setBounds(881, 567, 230, 32);
		
		contentPane.add(W_3);
		
		JLabel Pname = new JLabel("<No Team Loaded>");
		Pname.setFont(new Font("Jersey M54", Font.PLAIN, 66));
		Pname.setBounds(71, 65, 893, 65);
		contentPane.add(Pname);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setForeground(Color.BLACK);
		panel.setBounds(71, 127, 154, 83);
		contentPane.add(panel);
		panel.setLayout(null);
		TeamAf.setBounds(1, 1, 156, 81);
		panel.add(TeamAf);
		TeamAf.setForeground(Color.WHITE);
		TeamAf.setHorizontalAlignment(SwingConstants.CENTER);
		TeamAf.setFont(new Font("Exo 2 Light", Font.PLAIN, 15));
		TeamAf.setBackground(Color.BLACK);
		
		JLabel Wt = new JLabel("New label");
		Wt.setForeground(Color.GRAY);
		Wt.setFont(new Font("Exo 2 Medium", Font.PLAIN, 20));
		Wt.setBounds(1113, 471, 97, 32);
		contentPane.add(Wt);
		
		JLabel Wt_1 = new JLabel("New label");
		Wt_1.setForeground(Color.GRAY);
		Wt_1.setFont(new Font("Exo 2 Medium", Font.PLAIN, 20));
		Wt_1.setBounds(1113, 503, 97, 32);
		contentPane.add(Wt_1);
		
		JLabel Wt_2 = new JLabel("New label");
		Wt_2.setForeground(Color.GRAY);
		Wt_2.setFont(new Font("Exo 2 Medium", Font.PLAIN, 20));
		Wt_2.setBounds(1113, 535, 97, 32);
		contentPane.add(Wt_2);
		
		JLabel Wt_3 = new JLabel("New label");
		Wt_3.setForeground(Color.GRAY);
		Wt_3.setFont(new Font("Exo 2 Medium", Font.PLAIN, 20));
		Wt_3.setBounds(1113, 567, 97, 32);
		contentPane.add(Wt_3);
		
		JLabel R = new JLabel("<Undefined>");
		R.setForeground(Color.GRAY);
		R.setFont(new Font("Exo 2 Medium", Font.PLAIN, 20));
		R.setBounds(509, 471, 230, 32);
		contentPane.add(R);
		
		JLabel R_1 = new JLabel("<Undefined>");
		R_1.setForeground(Color.GRAY);
		R_1.setFont(new Font("Exo 2 Medium", Font.PLAIN, 20));
		R_1.setBounds(509, 503, 230, 32);
		contentPane.add(R_1);
		
		JLabel R_2 = new JLabel("<Undefined>");
		R_2.setForeground(Color.GRAY);
		R_2.setFont(new Font("Exo 2 Medium", Font.PLAIN, 20));
		R_2.setBounds(509, 535, 230, 32);
		contentPane.add(R_2);
		
		JLabel R_3 = new JLabel("<Undefined>");
		R_3.setForeground(Color.GRAY);
		R_3.setFont(new Font("Exo 2 Medium", Font.PLAIN, 20));
		R_3.setBounds(509, 567, 230, 32);
		contentPane.add(R_3);
		
		JLabel Rt = new JLabel("New label");
		Rt.setForeground(Color.GRAY);
		Rt.setFont(new Font("Exo 2 Medium", Font.PLAIN, 20));
		Rt.setBounds(741, 471, 97, 32);
		contentPane.add(Rt);
		
		JLabel Rt_1 = new JLabel("New label");
		Rt_1.setForeground(Color.GRAY);
		Rt_1.setFont(new Font("Exo 2 Medium", Font.PLAIN, 20));
		Rt_1.setBounds(741, 503, 97, 32);
		contentPane.add(Rt_1);
		
		JLabel Rt_2 = new JLabel("New label");
		Rt_2.setForeground(Color.GRAY);
		Rt_2.setFont(new Font("Exo 2 Medium", Font.PLAIN, 20));
		Rt_2.setBounds(741, 535, 97, 32);
		contentPane.add(Rt_2);
		
		JLabel Rt_3 = new JLabel("New label");
		Rt_3.setForeground(Color.GRAY);
		Rt_3.setFont(new Font("Exo 2 Medium", Font.PLAIN, 20));
		Rt_3.setBounds(741, 567, 97, 32);
		contentPane.add(Rt_3);
		
		JLabel PlayerPicture_1 = new JLabel("<No Picture Available>");
		PlayerPicture_1.setFont(new Font("Exo 2 Medium", Font.PLAIN, 18));
		PlayerPicture_1.setVerticalAlignment(SwingConstants.TOP);
		PlayerPicture_1.setHorizontalAlignment(SwingConstants.CENTER);
		PlayerPicture_1.setBounds(509, 165, 329, 307);
		contentPane.add(PlayerPicture_1);
		
		JLabel PlayerPicture = new JLabel("<No Picture Available>");
		PlayerPicture.setFont(new Font("Exo 2 Medium", Font.PLAIN, 20));
		PlayerPicture.setVerticalAlignment(SwingConstants.TOP);
		PlayerPicture.setHorizontalAlignment(SwingConstants.CENTER);
		PlayerPicture.setBounds(881, 165, 329, 307);
		contentPane.add(PlayerPicture);
		
		JLabel lblTopSquadBatsmen = new JLabel("Top Squad Batsmen");
		lblTopSquadBatsmen.setForeground(Color.GRAY);
		lblTopSquadBatsmen.setFont(new Font("Jersey M54", Font.PLAIN, 26));
		lblTopSquadBatsmen.setBounds(505, 115, 333, 65);
		contentPane.add(lblTopSquadBatsmen);
		
		JLabel St = new JLabel("Players ");
		St.setFont(new Font("Exo 2 Medium", Font.PLAIN, 20));
		St.setBounds(71, 237, 189, 32);
		contentPane.add(St);
		
		JLabel St_1 = new JLabel("Matches");
		St_1.setFont(new Font("Exo 2 Medium", Font.PLAIN, 20));
		St_1.setBounds(71, 269, 189, 32);
		contentPane.add(St_1);
		
		JLabel St_2 = new JLabel("Victories");
		St_2.setFont(new Font("Exo 2 Medium", Font.PLAIN, 20));
		St_2.setBounds(71, 301, 189, 32);
		contentPane.add(St_2);
		
		JLabel lblTies = new JLabel("Ties");
		lblTies.setFont(new Font("Exo 2 Medium", Font.PLAIN, 20));
		lblTies.setBounds(71, 333, 189, 32);
		contentPane.add(lblTies);
		
		JLabel lblWinRatio = new JLabel("Win Ratio");
		lblWinRatio.setFont(new Font("Exo 2 Medium", Font.PLAIN, 20));
		lblWinRatio.setBounds(71, 365, 189, 32);
		contentPane.add(lblWinRatio);
		
		JLabel lblTotalRuns = new JLabel("Total Runs");
		lblTotalRuns.setFont(new Font("Exo 2 Medium", Font.PLAIN, 20));
		lblTotalRuns.setBounds(71, 420, 189, 32);
		contentPane.add(lblTotalRuns);
		
		JLabel lblTotalBalls = new JLabel("Total Balls");
		lblTotalBalls.setFont(new Font("Exo 2 Medium", Font.PLAIN, 20));
		lblTotalBalls.setBounds(71, 452, 189, 32);
		contentPane.add(lblTotalBalls);
		
		JLabel lblTotalWickets = new JLabel("Total Runs Conceded");
		lblTotalWickets.setFont(new Font("Exo 2 Medium", Font.PLAIN, 20));
		lblTotalWickets.setBounds(71, 506, 203, 32);
		contentPane.add(lblTotalWickets);
		
		JLabel lblTotalWickets_1 = new JLabel("Total Wickets");
		lblTotalWickets_1.setFont(new Font("Exo 2 Medium", Font.PLAIN, 20));
		lblTotalWickets_1.setBounds(71, 572, 189, 32);
		contentPane.add(lblTotalWickets_1);
		
		JLabel lblTotalBallsBowled = new JLabel("Total Balls Bowled");
		lblTotalBallsBowled.setFont(new Font("Exo 2 Medium", Font.PLAIN, 20));
		lblTotalBallsBowled.setBounds(71, 540, 189, 32);
		contentPane.add(lblTotalBallsBowled);
		
		JLabel val = new JLabel("<?>");
		val.setFont(new Font("Exo 2 Medium", Font.PLAIN, 20));
		val.setBounds(281, 237, 97, 32);
		contentPane.add(val);
		
		JLabel val_1 = new JLabel("<?>");
		val_1.setFont(new Font("Exo 2 Medium", Font.PLAIN, 20));
		val_1.setBounds(281, 269, 97, 32);
		contentPane.add(val_1);
		
		JLabel val_2 = new JLabel("<?>");
		val_2.setFont(new Font("Exo 2 Medium", Font.PLAIN, 20));
		val_2.setBounds(281, 301, 97, 32);
		contentPane.add(val_2);
		
		JLabel val_3 = new JLabel("<?>");
		val_3.setFont(new Font("Exo 2 Medium", Font.PLAIN, 20));
		val_3.setBounds(281, 333, 97, 32);
		contentPane.add(val_3);
		
		JLabel val_4 = new JLabel("<?>");
		val_4.setFont(new Font("Exo 2 Medium", Font.PLAIN, 20));
		val_4.setBounds(281, 364, 97, 32);
		contentPane.add(val_4);
		
		JLabel val_5 = new JLabel("<?>");
		val_5.setFont(new Font("Exo 2 Medium", Font.PLAIN, 20));
		val_5.setBounds(281, 420, 97, 32);
		contentPane.add(val_5);
		
		JLabel val_6 = new JLabel("<?>");
		val_6.setFont(new Font("Exo 2 Medium", Font.PLAIN, 20));
		val_6.setBounds(281, 452, 97, 32);
		contentPane.add(val_6);
		
		JLabel val_7 = new JLabel("<?>");
		val_7.setFont(new Font("Exo 2 Medium", Font.PLAIN, 20));
		val_7.setBounds(281, 506, 97, 32);
		contentPane.add(val_7);
		
		JLabel val_8 = new JLabel("<?>");
		val_8.setFont(new Font("Exo 2 Medium", Font.PLAIN, 20));
		val_8.setBounds(281, 540, 97, 32);
		contentPane.add(val_8);
		
		JLabel val_9 = new JLabel("<?>");
		val_9.setFont(new Font("Exo 2 Medium", Font.PLAIN, 20));
		val_9.setBounds(281, 572, 97, 32);
		contentPane.add(val_9);
		
		JLabel lblBowling = new JLabel("Bowling");
		lblBowling.setForeground(Color.GRAY);
		lblBowling.setFont(new Font("Exo 2 Medium", Font.ITALIC, 14));
		lblBowling.setBounds(71, 485, 203, 32);
		contentPane.add(lblBowling);
		
		JLabel lblBatting = new JLabel("Batting");
		lblBatting.setForeground(Color.GRAY);
		lblBatting.setFont(new Font("Exo 2 Medium", Font.ITALIC, 14));
		lblBatting.setBounds(71, 398, 203, 32);
		contentPane.add(lblBatting);
		
		JLabel lblGeneral = new JLabel("General");
		lblGeneral.setForeground(Color.GRAY);
		lblGeneral.setFont(new Font("Exo 2 Medium", Font.ITALIC, 14));
		lblGeneral.setBounds(71, 213, 203, 32);
		contentPane.add(lblGeneral);
				
		tm.start();
		
		DB_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		
		DB.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				BatchWritex x = new BatchWritex();
			}
		});
		
		W.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				W.setForeground(Color.BLACK);
				Wt.setForeground(Color.BLACK);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				W.setForeground(Color.GRAY);
				Wt.setForeground(Color.GRAY);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				PlayerPicture.setIcon(new ImageIcon("C://PowerPlay//Labels//Players_Big//"+List.search(sel)+ "//" +W.getText()+".png"));
			}
		});
		
		W_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				W_1.setForeground(Color.BLACK);
				Wt_1.setForeground(Color.BLACK);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				W_1.setForeground(Color.GRAY);
				Wt_1.setForeground(Color.GRAY);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				PlayerPicture.setIcon(new ImageIcon("C://PowerPlay//Labels//Players_Big//"+List.search(sel)+ "//" +W_1.getText()+".png"));
			}
		});
		
		W_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				W_2.setForeground(Color.BLACK);
				Wt_2.setForeground(Color.BLACK);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				W_2.setForeground(Color.GRAY);
				Wt_2.setForeground(Color.GRAY);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				PlayerPicture.setIcon(new ImageIcon("C://PowerPlay//Labels//Players_Big//"+List.search(sel)+ "//" +W_2.getText()+".png"));
			}
		});
		
		W_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				W_3.setForeground(Color.BLACK);
				Wt_3.setForeground(Color.BLACK);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				W_3.setForeground(Color.GRAY);
				Wt_3.setForeground(Color.GRAY);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				PlayerPicture.setIcon(new ImageIcon("C://PowerPlay//Labels//Players_Big//"+List.search(sel)+ "//" +W_3.getText()+".png"));
			}
		});
		
		R.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				R.setForeground(Color.BLACK);
				Rt.setForeground(Color.BLACK);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				R.setForeground(Color.GRAY);
				Rt.setForeground(Color.GRAY);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				PlayerPicture_1.setIcon(new ImageIcon("C://PowerPlay//Labels//Players_Big//"+List.search(sel)+ "//" +R.getText()+".png"));
			}
		});
		
		R_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				R_1.setForeground(Color.BLACK);
				Rt_1.setForeground(Color.BLACK);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				R_1.setForeground(Color.GRAY);
				Rt_1.setForeground(Color.GRAY);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				PlayerPicture_1.setIcon(new ImageIcon("C://PowerPlay//Labels//Players_Big//"+List.search(sel)+ "//" +R_1.getText()+".png"));
			}
		});
		
		R_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				R_2.setForeground(Color.BLACK);
				Rt_2.setForeground(Color.BLACK);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				R_2.setForeground(Color.GRAY);
				Rt_2.setForeground(Color.GRAY);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				PlayerPicture_1.setIcon(new ImageIcon("C://PowerPlay//Labels//Players_Big//"+List.search(sel)+ "//" +R_2.getText()+".png"));
			}
		});
		
		R_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				R_3.setForeground(Color.BLACK);
				Rt_3.setForeground(Color.BLACK);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				R_3.setForeground(Color.GRAY);
				Rt_3.setForeground(Color.GRAY);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				PlayerPicture_1.setIcon(new ImageIcon("C://PowerPlay//Labels//Players_Big//"+List.search(sel)+ "//" +R_3.getText()+".png"));
			}
		});
		
		
		Nextb.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {			
				
				if(sel<List.length()-1) {
				sel++;
				Counter.setText((sel+1)+" out of " + array.length);
		        Pname.setText(List.search(sel));
		        TeamAf.setIcon(new ImageIcon("C:\\PowerPlay\\Flags\\" + List.search(sel) + ".png"));
		        String fp = "C://PowerPlay//Players//"+List.search(sel);
		        String[] names = (new File(fp).list());
		        Player[] X = new Player[names.length];
		        Player[] Y = new Player[names.length];
		        
		        for(int i =0; i<names.length;i++) {
					int index = names[i].indexOf(".txt"); 
					names[i] = names[i].substring(0, index);	
					X[i] = Pread.read(List.search(sel), names[i]);
					Y[i] = Pread.read(List.search(sel), names[i]);
		        }
		        
		        PlayerBubbleSort sorter = new PlayerBubbleSort();
		        sorter.sort(X);
		        //sorter.print(X);
		        PlayerRadixSort Radix = new PlayerRadixSort();
		        Radix.radix(Y);
		        
		        W.setText(X[X.length-1].name);
		        W_1.setText(X[X.length-2].name);
		        W_2.setText(X[X.length-3].name);
		        W_3.setText(X[X.length-4].name);
		        
		        Wt.setText(X[X.length-1].twickets + "");
		        Wt_1.setText(X[X.length-2].twickets + "");
		        Wt_2.setText(X[X.length-3].twickets + "");
		        Wt_3.setText(X[X.length-4].twickets+ "");
		        
		        R.setText(Y[Y.length-1].name);
		        R_1.setText(Y[Y.length-2].name);
		        R_2.setText(Y[Y.length-3].name);
		        R_3.setText(Y[Y.length-4].name);
		        
		        Rt.setText(Y[Y.length-1].truns + "");
		        Rt_1.setText(Y[Y.length-2].truns+ "");
		        Rt_2.setText(Y[Y.length-3].truns+ "");
		        Rt_3.setText(Y[Y.length-4].truns+ "");
		        
		        val.setText(Y.length + "");
		        
		        int match = 0;
		        int matchv = 0;
		        int matcht = 0;
		        int SumA =0;
		        int SumB =0;
		        
		        for (int i = 0; i < use_1.length(); i++) {
					if(use_1.search(i).teamA.equals(List.search(sel)) || use_1.search(i).teamB.equals(List.search(sel))) {
						match++;
	
						for (int k = 0; k < 11; k++) {
							SumA = SumA + use_1.search(i).Astats[k][0]; 
							SumB = SumB + use_1.search(i).Bstats[k][0];
						}
						
						if((use_1.search(i).teamA.equals(List.search(sel)) && SumA>SumB) || (use_1.search(i).teamB.equals(List.search(sel)) && SumB>SumA)) {
							matchv++;
						}
						
						if(SumA == SumB) {
							matcht++;
						}
						
						SumA = 0;
						SumB = 0;
					}
				}
		        
		        val_1.setText(match + "");
		        val_2.setText(matchv + "");
		        val_3.setText(matcht + "");
		        
		        int[] totals = new int[5];
		        
		        for (int i = 0; i < Y.length; i++) {
					totals[0] = totals[0] + Y[i].truns;
					totals[1] = totals[1] + Y[i].tballs;
					totals[2] = totals[2] + Y[i].tbballs;
					totals[3] = totals[3] + Y[i].bruns;
					totals[4] = totals[4] + Y[i].twickets;					
				}
		        
		        Double A = new Double(match);
		        Double B = new Double(matchv);
		        
		        double ratio = (B/A)*100;
		        
		        val_4.setText(formatter.format(ratio) + "%");
		        
		        val_5.setText(totals[0] + "");
		        val_6.setText(totals[1] + "");
		        val_7.setText(totals[2] + "");
		        val_8.setText(totals[3] + "");
		        val_9.setText(totals[4] + "");
		     
		        PlayerPicture.setIcon(new ImageIcon("C://PowerPlay//Labels//Players_Big//"+List.search(sel)+ "//" +W.getText()+".png"));
		        PlayerPicture_1.setIcon(new ImageIcon("C://PowerPlay//Labels//Players_Big//"+List.search(sel)+ "//" +R.getText()+".png"));
				}
				
			}
			public void mouseEntered(MouseEvent e) {
				Nextb.setForeground(Color.WHITE);
				Nextp.setBackground(Color.BLACK);
			}
			public void mouseExited(MouseEvent e) {
				Nextb.setForeground(Color.BLACK);
				Nextp.setBackground(Color.WHITE);
			}
		});
	
		Prevb.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {			

				if(sel>0) {
			        sel--;
			        Counter.setText((sel+1)+" out of " + array.length);
			        Pname.setText(List.search(sel));
			        TeamAf.setIcon(new ImageIcon("C:\\PowerPlay\\Flags\\" + List.search(sel) + ".png"));
			        String fp = "C://PowerPlay//Players//"+List.search(sel);
			        String[] names = (new File(fp).list());
			        Player[] X = new Player[names.length];
			        Player[] Y = new Player[names.length];
			        
			        for(int i =0; i<names.length;i++) {
						int index = names[i].indexOf(".txt"); 
						names[i] = names[i].substring(0, index);	
						X[i] = Pread.read(List.search(sel), names[i]);
						Y[i] = Pread.read(List.search(sel), names[i]);
			        }
			        
			        PlayerBubbleSort sorter = new PlayerBubbleSort();
			        sorter.sort(X);
			        //sorter.print(X);
			        PlayerRadixSort Radix = new PlayerRadixSort();
			        Radix.radix(Y);
			        
			        W.setText(X[X.length-1].name);
			        W_1.setText(X[X.length-2].name);
			        W_2.setText(X[X.length-3].name);
			        W_3.setText(X[X.length-4].name);
			        
			        Wt.setText(X[X.length-1].twickets + "");
			        Wt_1.setText(X[X.length-2].twickets + "");
			        Wt_2.setText(X[X.length-3].twickets + "");
			        Wt_3.setText(X[X.length-4].twickets+ "");
			        
			        R.setText(Y[Y.length-1].name);
			        R_1.setText(Y[Y.length-2].name);
			        R_2.setText(Y[Y.length-3].name);
			        R_3.setText(Y[Y.length-4].name);
			        
			        Rt.setText(Y[Y.length-1].truns + "");
			        Rt_1.setText(Y[Y.length-2].truns+ "");
			        Rt_2.setText(Y[Y.length-3].truns+ "");
			        Rt_3.setText(Y[Y.length-4].truns+ "");
			        
			        val.setText(Y.length + "");
			        
			        int match = 0;
			        int matchv = 0;
			        int matcht = 0;
			        int SumA =0;
			        int SumB =0;
			        
			        for (int i = 0; i < use_1.length(); i++) {
						if(use_1.search(i).teamA.equals(List.search(sel)) || use_1.search(i).teamB.equals(List.search(sel))) {
							match++;
		
							for (int k = 0; k < 11; k++) {
								SumA = SumA + use_1.search(i).Astats[k][0]; 
								SumB = SumB + use_1.search(i).Bstats[k][0];
							}
							
							if((use_1.search(i).teamA.equals(List.search(sel)) && SumA>SumB) || (use_1.search(i).teamB.equals(List.search(sel)) && SumB>SumA)) {
								matchv++;
							}
							
							if(SumA == SumB) {
								matcht++;
							}
							
							SumA = 0;
							SumB = 0;
						}
					}
			        
			        val_1.setText(match + "");
			        val_2.setText(matchv + "");
			        val_3.setText(matcht + "");
			        
			        int[] totals = new int[5];
			        
			        for (int i = 0; i < Y.length; i++) {
						totals[0] = totals[0] + Y[i].truns;
						totals[1] = totals[1] + Y[i].tballs;
						totals[2] = totals[2] + Y[i].tbballs;
						totals[3] = totals[3] + Y[i].bruns;
						totals[4] = totals[4] + Y[i].twickets;					
					}
			        
			        Double A = new Double(match);
			        Double B = new Double(matchv);
			        
			        double ratio = (B/A)*100;
			        
			        val_4.setText(formatter.format(ratio) + "%");
			        
			        val_5.setText(totals[0] + "");
			        val_6.setText(totals[1] + "");
			        val_7.setText(totals[2] + "");
			        val_8.setText(totals[3] + "");
			        val_9.setText(totals[4] + "");
			     
			        PlayerPicture.setIcon(new ImageIcon("C://PowerPlay//Labels//Players_Big//"+List.search(sel)+ "//" +W.getText()+".png"));
			        PlayerPicture_1.setIcon(new ImageIcon("C://PowerPlay//Labels//Players_Big//"+List.search(sel)+ "//" +R.getText()+".png"));
			        
					}
                   				
			}
			public void mouseEntered(MouseEvent e) {
				Prevb.setForeground(Color.WHITE);
				Prevp.setBackground(Color.BLACK);
			}
			public void mouseExited(MouseEvent e) {
				Prevb.setForeground(Color.BLACK);
				Prevp.setBackground(Color.WHITE);
			}
		});
		
		j.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				jp.setBackground(j.getForeground());
				j.setForeground(Color.WHITE);
				Counter.setForeground(Color.WHITE);
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				jp.setBackground(j.getForeground());
				j.setForeground(new Color(47,79,79));
				Counter.setForeground(Color.BLACK);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				
		        sel = comboBox.getSelectedIndex();
		        Counter.setText((sel+1)+" out of " + array.length);
		        Pname.setText(List.search(sel));
		        TeamAf.setIcon(new ImageIcon("C:\\PowerPlay\\Flags\\" + List.search(sel) + ".png"));
		        String fp = "C://PowerPlay//Players//"+List.search(sel);
		        String[] names = (new File(fp).list());
		        Player[] X = new Player[names.length];
		        Player[] Y = new Player[names.length];
		        
		        for(int i =0; i<names.length;i++) {
					int index = names[i].indexOf(".txt"); 
					names[i] = names[i].substring(0, index);	
					X[i] = Pread.read(List.search(sel), names[i]);
					Y[i] = Pread.read(List.search(sel), names[i]);
		        }
		        
		        PlayerBubbleSort sorter = new PlayerBubbleSort();
		        sorter.sort(X);
		        //sorter.print(X);
		        PlayerRadixSort Radix = new PlayerRadixSort();
		        Radix.radix(Y);
		        
		        W.setText(X[X.length-1].name);
		        W_1.setText(X[X.length-2].name);
		        W_2.setText(X[X.length-3].name);
		        W_3.setText(X[X.length-4].name);
		        
		        Wt.setText(X[X.length-1].twickets + "");
		        Wt_1.setText(X[X.length-2].twickets + "");
		        Wt_2.setText(X[X.length-3].twickets + "");
		        Wt_3.setText(X[X.length-4].twickets+ "");
		        
		        R.setText(Y[Y.length-1].name);
		        R_1.setText(Y[Y.length-2].name);
		        R_2.setText(Y[Y.length-3].name);
		        R_3.setText(Y[Y.length-4].name);
		        
		        Rt.setText(Y[Y.length-1].truns + "");
		        Rt_1.setText(Y[Y.length-2].truns+ "");
		        Rt_2.setText(Y[Y.length-3].truns+ "");
		        Rt_3.setText(Y[Y.length-4].truns+ "");
		        
		        val.setText(Y.length + "");
		        
		        int match = 0;
		        int matchv = 0;
		        int matcht = 0;
		        int SumA =0;
		        int SumB =0;
		        
		        for (int i = 0; i < use_1.length(); i++) {
					if(use_1.search(i).teamA.equals(List.search(sel)) || use_1.search(i).teamB.equals(List.search(sel))) {
						match++;
	
						for (int k = 0; k < 11; k++) {
							SumA = SumA + use_1.search(i).Astats[k][0]; 
							SumB = SumB + use_1.search(i).Bstats[k][0];
						}
						
						if((use_1.search(i).teamA.equals(List.search(sel)) && SumA>SumB) || (use_1.search(i).teamB.equals(List.search(sel)) && SumB>SumA)) {
							matchv++;
						}
						
						if(SumA == SumB) {
							matcht++;
						}
						
						SumA = 0;
						SumB = 0;
					}

				}
		        
		        val_1.setText(match + "");
		        val_2.setText(matchv + "");
		        val_3.setText(matcht + "");
		        
		        int[] totals = new int[5];
		        
		        for (int i = 0; i < Y.length; i++) {
					totals[0] = totals[0] + Y[i].truns;
					totals[1] = totals[1] + Y[i].tballs;
					totals[2] = totals[2] + Y[i].tbballs;
					totals[3] = totals[3] + Y[i].bruns;
					totals[4] = totals[4] + Y[i].twickets;					
				}
		        
		        Double A = new Double(match);
		        Double B = new Double(matchv);
		        
		        double ratio = (B/A)*100;
		        
		        val_4.setText(formatter.format(ratio) + "%");
		        
		        val_5.setText(totals[0] + "");
		        val_6.setText(totals[1] + "");
		        val_7.setText(totals[2] + "");
		        val_8.setText(totals[3] + "");
		        val_9.setText(totals[4] + "");
		     
		        PlayerPicture.setIcon(new ImageIcon("C://PowerPlay//Labels//Players_Big//"+List.search(sel)+ "//" +W.getText()+".png"));
		        PlayerPicture_1.setIcon(new ImageIcon("C://PowerPlay//Labels//Players_Big//"+List.search(sel)+ "//" +R.getText()+".png"));
				
			}
		});
		
		s.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				sp.setBackground(new Color(40,79,79));
				s.setForeground(Color.WHITE);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				sp.setBackground(Color.WHITE);
				s.setForeground(new Color(40,79,79));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				PlayerViewer A = new PlayerViewer(List.search(sel));
				A.setVisible(true);
			}
		});

	}
}
