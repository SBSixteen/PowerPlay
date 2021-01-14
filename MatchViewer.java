
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

public class MatchViewer extends JFrame implements ActionListener {
    Match Y = null;
	boolean a,b,c,d;
	boolean switcht = false;
    int sel = -1;
    MatchLL use_1 = new MatchLL();
	DecimalFormat formatter = new DecimalFormat("###.#");
	PlayerReader Pread = new PlayerReader();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MatchViewer frame = new MatchViewer();
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
	private final JLabel TeamAf = new JLabel("<Undefined>");
	private JLabel B_0;
	
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
	
	public MatchViewer() {
		
        String[] fpm = (new File("C:\\PowerPlay\\Tournament").list());
      //  MatchLL use_1 = new MatchLL();
        MatchReader Mread = new MatchReader();
        
		setResizable(false);
		setTitle("PowerPlay MatchViewer v0.2");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(00, 00, 1280,720);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Canvas seper_2_1 = new Canvas();
		seper_2_1.setBackground(Color.GRAY);
		seper_2_1.setBounds(913, 336, 170, 1);
		contentPane.add(seper_2_1);
		
		Canvas seper_3_2 = new Canvas();
		seper_3_2.setBackground(Color.GRAY);
		seper_3_2.setBounds(65, 166, 1, 350);
		contentPane.add(seper_3_2);
		
		Canvas seper_1_1 = new Canvas();
		seper_1_1.setBackground(Color.GRAY);
		seper_1_1.setBounds(65, 515, 804, 1);
		contentPane.add(seper_1_1);
		
		Canvas seper = new Canvas();
		seper.setBackground(new Color(128, 128, 128));
		seper.setBounds(868, 166, 1, 350);
		contentPane.add(seper);
		
		Canvas seper_1 = new Canvas();
		seper_1.setBackground(new Color(128, 128, 128));
		seper_1.setBounds(65, 166, 804, 1);
		contentPane.add(seper_1);
		
		JPanel jp = new JPanel();
		jp.setLayout(null);
		jp.setBackground(Color.WHITE);
		jp.setBounds(913, 0, 361, 59);
		contentPane.add(jp);
		
		JLabel j = new JLabel("JUMP");
		j.setHorizontalAlignment(SwingConstants.CENTER);
		j.setForeground(new Color(47, 79, 79));
		j.setFont(new Font("Jersey M54", Font.PLAIN, 30));
		j.setBounds(244, 31, 107, 28);
		jp.add(j);
		comboBox.setBackground(new Color(0, 128, 128));
		comboBox.setEditable(true);
		comboBox.setForeground(Color.BLACK);
		comboBox.setFont(new Font("Exo 2 Light", Font.PLAIN, 16));
		comboBox.setBounds(0, 0, 235, 22);
		jp.add(comboBox);
		
		comboBox.setModel(new DefaultComboBoxModel(fpm));
		
		JLabel Lb = new JLabel("LOAD");
		Lb.setHorizontalAlignment(SwingConstants.CENTER);
		Lb.setForeground(Color.DARK_GRAY);
		Lb.setFont(new Font("Jersey M54", Font.PLAIN, 30));
		Lb.setBounds(244, 0, 107, 28);
		jp.add(Lb);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setForeground(Color.BLACK);
		comboBox_1.setFont(new Font("Exo 2 Light", Font.PLAIN, 16));
		comboBox_1.setEditable(true);
		comboBox_1.setBackground(new Color(0, 128, 128));
		comboBox_1.setBounds(-1, 31, 235, 22);
		jp.add(comboBox_1);
		

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
		
		JLabel Tname = new JLabel("No Match Loaded");
		Tname.setFont(new Font("Jersey M54", Font.PLAIN, 66));
		Tname.setBounds(69, 64, 989, 65);
		contentPane.add(Tname);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setForeground(Color.BLACK);
		panel.setBounds(913, 177, 154, 83);
		contentPane.add(panel);
		panel.setLayout(null);
		TeamAf.setBounds(1, 1, 156, 81);
		panel.add(TeamAf);
		TeamAf.setForeground(Color.WHITE);
		TeamAf.setHorizontalAlignment(SwingConstants.CENTER);
		TeamAf.setFont(new Font("Exo 2 Light", Font.PLAIN, 15));
		TeamAf.setBackground(Color.BLACK);
		
		JLabel N_1 = new JLabel("<Undefined>");
		N_1.setFont(new Font("Exo 2 Medium", Font.PLAIN, 16));
		N_1.setBounds(72, 195, 243, 32);
		contentPane.add(N_1);
		
		JLabel N = new JLabel("<Undefined>");
		N.setFont(new Font("Exo 2 Medium", Font.PLAIN, 16));
		N.setBounds(72, 166, 243, 32);
		contentPane.add(N);
		
		JLabel N_3 = new JLabel("<Undefined>");
		N_3.setFont(new Font("Exo 2 Medium", Font.PLAIN, 16));
		N_3.setBounds(72, 258, 243, 32);
		contentPane.add(N_3);
		
		JLabel N_4 = new JLabel("<Undefined>");
		N_4.setFont(new Font("Exo 2 Medium", Font.PLAIN, 16));
		N_4.setBounds(72, 290, 243, 32);
		contentPane.add(N_4);
		
		JLabel N_5 = new JLabel("<Undefined>");
		N_5.setFont(new Font("Exo 2 Medium", Font.PLAIN, 16));
		N_5.setBounds(72, 320, 243, 32);
		contentPane.add(N_5);
		
		JLabel N_6 = new JLabel("<Undefined>");
		N_6.setFont(new Font("Exo 2 Medium", Font.PLAIN, 16));
		N_6.setBounds(72, 352, 243, 32);
		contentPane.add(N_6);
		
		JLabel N_7 = new JLabel("<Undefined>");
		N_7.setFont(new Font("Exo 2 Medium", Font.PLAIN, 16));
		N_7.setBounds(72, 386, 243, 32);
		contentPane.add(N_7);
		
		JLabel N_9 = new JLabel("<Undefined>");
		N_9.setFont(new Font("Exo 2 Medium", Font.PLAIN, 16));
		N_9.setBounds(72, 452, 243, 32);
		contentPane.add(N_9);
		
		JLabel N_8 = new JLabel("<Undefined>");
		N_8.setFont(new Font("Exo 2 Medium", Font.PLAIN, 16));
		N_8.setBounds(72, 420, 243, 32);
		contentPane.add(N_8);
		
		JLabel R = new JLabel("<?>");
		R.setHorizontalAlignment(SwingConstants.CENTER);
		R.setFont(new Font("Exo 2 Medium", Font.BOLD, 16));
		R.setBounds(326, 166, 60, 32);
		contentPane.add(R);
		
		JLabel R_1 = new JLabel("<?>");
		R_1.setHorizontalAlignment(SwingConstants.CENTER);
		R_1.setFont(new Font("Exo 2 Medium", Font.BOLD, 16));
		R_1.setBounds(326, 195, 60, 32);
		contentPane.add(R_1);
		
		JLabel R_2 = new JLabel("<?>");
		R_2.setHorizontalAlignment(SwingConstants.CENTER);
		R_2.setFont(new Font("Exo 2 Medium", Font.BOLD, 16));
		R_2.setBounds(326, 228, 60, 32);
		contentPane.add(R_2);
		
		JLabel R_3 = new JLabel("<?>");
		R_3.setHorizontalAlignment(SwingConstants.CENTER);
		R_3.setFont(new Font("Exo 2 Medium", Font.BOLD, 16));
		R_3.setBounds(326, 259, 60, 32);
		contentPane.add(R_3);
		
		JLabel R_4 = new JLabel("<?>");
		R_4.setHorizontalAlignment(SwingConstants.CENTER);
		R_4.setFont(new Font("Exo 2 Medium", Font.BOLD, 16));
		R_4.setBounds(326, 290, 60, 32);
		contentPane.add(R_4);
		
		JLabel R_5 = new JLabel("<?>");
		R_5.setHorizontalAlignment(SwingConstants.CENTER);
		R_5.setFont(new Font("Exo 2 Medium", Font.BOLD, 16));
		R_5.setBounds(326, 320, 60, 32);
		contentPane.add(R_5);
		
		JLabel R_6 = new JLabel("<?>");
		R_6.setHorizontalAlignment(SwingConstants.CENTER);
		R_6.setFont(new Font("Exo 2 Medium", Font.BOLD, 16));
		R_6.setBounds(326, 352, 60, 32);
		contentPane.add(R_6);
		
		JLabel R_7 = new JLabel("<?>");
		R_7.setHorizontalAlignment(SwingConstants.CENTER);
		R_7.setFont(new Font("Exo 2 Medium", Font.BOLD, 16));
		R_7.setBounds(326, 386, 60, 32);
		contentPane.add(R_7);
		
		JLabel R_8 = new JLabel("<?>");
		R_8.setHorizontalAlignment(SwingConstants.CENTER);
		R_8.setFont(new Font("Exo 2 Medium", Font.BOLD, 16));
		R_8.setBounds(326, 420, 60, 32);
		contentPane.add(R_8);
		
		JLabel R_9 = new JLabel("<?>");
		R_9.setHorizontalAlignment(SwingConstants.CENTER);
		R_9.setFont(new Font("Exo 2 Medium", Font.BOLD, 16));
		R_9.setBounds(326, 452, 60, 32);
		contentPane.add(R_9);
		
		JLabel lblBowling = new JLabel("Bowling");
		lblBowling.setForeground(Color.GRAY);
		lblBowling.setFont(new Font("Exo 2 Medium", Font.ITALIC, 14));
		lblBowling.setBounds(613, 121, 185, 32);
		contentPane.add(lblBowling);
		
		JLabel lblBatting = new JLabel("Batting");
		lblBatting.setForeground(Color.GRAY);
		lblBatting.setFont(new Font("Exo 2 Medium", Font.ITALIC, 14));
		lblBatting.setBounds(341, 121, 60, 32);
		contentPane.add(lblBatting);
		
		JLabel lblGeneral = new JLabel("Perspective");
		lblGeneral.setForeground(Color.GRAY);
		lblGeneral.setFont(new Font("Exo 2 Medium", Font.ITALIC, 14));
		lblGeneral.setBounds(913, 152, 111, 30);
		contentPane.add(lblGeneral);
		
		JLabel Counter = new JLabel("");
		Counter.setBounds(918, 127, 140, 33);
		contentPane.add(Counter);
		Counter.setFont(new Font("Exo 2 Light", Font.PLAIN, 26));
		
		JPanel sp_1 = new JPanel();
		sp_1.setLayout(null);
		sp_1.setBackground(Color.WHITE);
		sp_1.setBounds(913, 258, 154, 47);
		contentPane.add(sp_1);
		
		JLabel lblSwitch = new JLabel("SWITCH");
		lblSwitch.setHorizontalAlignment(SwingConstants.CENTER);
		lblSwitch.setForeground(Color.LIGHT_GRAY);
		lblSwitch.setFont(new Font("Jersey M54", Font.PLAIN, 42));
		lblSwitch.setBounds(0, 0, 154, 47);
		sp_1.add(lblSwitch);
		
		JLabel N_10 = new JLabel("<Undefined>");
		N_10.setFont(new Font("Exo 2 Medium", Font.PLAIN, 16));
		N_10.setBounds(73, 484, 242, 32);
		contentPane.add(N_10);
		
		JLabel lblRuns = new JLabel("Runs");
		lblRuns.setHorizontalAlignment(SwingConstants.CENTER);
		lblRuns.setForeground(Color.GRAY);
		lblRuns.setFont(new Font("Exo 2 Medium", Font.ITALIC, 14));
		lblRuns.setBounds(326, 140, 60, 32);
		contentPane.add(lblRuns);
		
		JLabel R_10 = new JLabel("<?>");
		R_10.setHorizontalAlignment(SwingConstants.CENTER);
		R_10.setFont(new Font("Exo 2 Medium", Font.BOLD, 16));
		R_10.setBounds(326, 484, 60, 32);
		contentPane.add(R_10);
		
		JLabel N_2 = new JLabel("<Undefined>");
		N_2.setFont(new Font("Exo 2 Medium", Font.PLAIN, 16));
		N_2.setBounds(72, 228, 243, 32);
		contentPane.add(N_2);
		
		JLabel lblBalls = new JLabel("Balls");
		lblBalls.setHorizontalAlignment(SwingConstants.CENTER);
		lblBalls.setForeground(Color.GRAY);
		lblBalls.setFont(new Font("Exo 2 Medium", Font.ITALIC, 14));
		lblBalls.setBounds(395, 140, 71, 32);
		contentPane.add(lblBalls);
		
		JLabel B_0;
		B_0 = new JLabel("<?>");
		B_0.setHorizontalAlignment(SwingConstants.CENTER);
		B_0.setFont(new Font("Exo 2 Medium", Font.BOLD, 16));
		B_0.setBounds(401, 166, 60, 32);
		contentPane.add(B_0);
		
		JLabel B_1 = new JLabel("<?>");
		B_1.setHorizontalAlignment(SwingConstants.CENTER);
		B_1.setFont(new Font("Exo 2 Medium", Font.BOLD, 16));
		B_1.setBounds(401, 195, 60, 32);
		contentPane.add(B_1);
		
		JLabel B_2 = new JLabel("<?>");
		B_2.setHorizontalAlignment(SwingConstants.CENTER);
		B_2.setFont(new Font("Exo 2 Medium", Font.BOLD, 16));
		B_2.setBounds(401, 228, 60, 32);
		contentPane.add(B_2);
		
		JLabel B_3 = new JLabel("<?>");
		B_3.setHorizontalAlignment(SwingConstants.CENTER);
		B_3.setFont(new Font("Exo 2 Medium", Font.BOLD, 16));
		B_3.setBounds(401, 259, 60, 32);
		contentPane.add(B_3);
		
		JLabel B_4 = new JLabel("<?>");
		B_4.setHorizontalAlignment(SwingConstants.CENTER);
		B_4.setFont(new Font("Exo 2 Medium", Font.BOLD, 16));
		B_4.setBounds(401, 290, 60, 32);
		contentPane.add(B_4);
		
		JLabel B_5 = new JLabel("<?>");
		B_5.setHorizontalAlignment(SwingConstants.CENTER);
		B_5.setFont(new Font("Exo 2 Medium", Font.BOLD, 16));
		B_5.setBounds(401, 320, 60, 32);
		contentPane.add(B_5);
		
		JLabel B_6 = new JLabel("<?>");
		B_6.setHorizontalAlignment(SwingConstants.CENTER);
		B_6.setFont(new Font("Exo 2 Medium", Font.BOLD, 16));
		B_6.setBounds(401, 352, 60, 32);
		contentPane.add(B_6);
		
		JLabel B_7 = new JLabel("<?>");
		B_7.setHorizontalAlignment(SwingConstants.CENTER);
		B_7.setFont(new Font("Exo 2 Medium", Font.BOLD, 16));
		B_7.setBounds(401, 386, 60, 32);
		contentPane.add(B_7);
		
		JLabel B_8 = new JLabel("<?>");
		B_8.setHorizontalAlignment(SwingConstants.CENTER);
		B_8.setFont(new Font("Exo 2 Medium", Font.BOLD, 16));
		B_8.setBounds(401, 420, 60, 32);
		contentPane.add(B_8);
		
		JLabel B_9 = new JLabel("<?>");
		B_9.setHorizontalAlignment(SwingConstants.CENTER);
		B_9.setFont(new Font("Exo 2 Medium", Font.BOLD, 16));
		B_9.setBounds(401, 452, 60, 32);
		contentPane.add(B_9);
		
		JLabel B_10 = new JLabel("<?>");
		B_10.setHorizontalAlignment(SwingConstants.CENTER);
		B_10.setFont(new Font("Exo 2 Medium", Font.BOLD, 16));
		B_10.setBounds(401, 484, 60, 32);
		contentPane.add(B_10);
		
		JLabel lbls = new JLabel("4s");
		lbls.setHorizontalAlignment(SwingConstants.CENTER);
		lbls.setForeground(Color.GRAY);
		lbls.setFont(new Font("Exo 2 Medium", Font.ITALIC, 14));
		lbls.setBounds(476, 140, 48, 32);
		contentPane.add(lbls);
		
		JLabel f = new JLabel("<?>");
		f.setHorizontalAlignment(SwingConstants.CENTER);
		f.setFont(new Font("Exo 2 Medium", Font.BOLD, 16));
		f.setBounds(476, 166, 48, 32);
		contentPane.add(f);
		
		JLabel f1 = new JLabel("<?>");
		f1.setHorizontalAlignment(SwingConstants.CENTER);
		f1.setFont(new Font("Exo 2 Medium", Font.BOLD, 16));
		f1.setBounds(476, 195, 48, 32);
		contentPane.add(f1);
		
		JLabel f2 = new JLabel("<?>");
		f2.setHorizontalAlignment(SwingConstants.CENTER);
		f2.setFont(new Font("Exo 2 Medium", Font.BOLD, 16));
		f2.setBounds(476, 228, 48, 32);
		contentPane.add(f2);
		
		JLabel f3 = new JLabel("<?>");
		f3.setHorizontalAlignment(SwingConstants.CENTER);
		f3.setFont(new Font("Exo 2 Medium", Font.BOLD, 16));
		f3.setBounds(476, 259, 48, 32);
		contentPane.add(f3);
		
		JLabel f4 = new JLabel("<?>");
		f4.setHorizontalAlignment(SwingConstants.CENTER);
		f4.setFont(new Font("Exo 2 Medium", Font.BOLD, 16));
		f4.setBounds(476, 290, 48, 32);
		contentPane.add(f4);
		
		JLabel f5 = new JLabel("<?>");
		f5.setHorizontalAlignment(SwingConstants.CENTER);
		f5.setFont(new Font("Exo 2 Medium", Font.BOLD, 16));
		f5.setBounds(476, 320, 48, 32);
		contentPane.add(f5);
		
		JLabel f6 = new JLabel("<?>");
		f6.setHorizontalAlignment(SwingConstants.CENTER);
		f6.setFont(new Font("Exo 2 Medium", Font.BOLD, 16));
		f6.setBounds(476, 352, 48, 32);
		contentPane.add(f6);
		
		JLabel f7 = new JLabel("<?>");
		f7.setHorizontalAlignment(SwingConstants.CENTER);
		f7.setFont(new Font("Exo 2 Medium", Font.BOLD, 16));
		f7.setBounds(476, 386, 48, 32);
		contentPane.add(f7);
		
		JLabel f8 = new JLabel("<?>");
		f8.setHorizontalAlignment(SwingConstants.CENTER);
		f8.setFont(new Font("Exo 2 Medium", Font.BOLD, 16));
		f8.setBounds(476, 420, 48, 32);
		contentPane.add(f8);
		
		JLabel f9 = new JLabel("<?>");
		f9.setHorizontalAlignment(SwingConstants.CENTER);
		f9.setFont(new Font("Exo 2 Medium", Font.BOLD, 16));
		f9.setBounds(476, 452, 48, 32);
		contentPane.add(f9);
		
		JLabel f10 = new JLabel("<?>");
		f10.setHorizontalAlignment(SwingConstants.CENTER);
		f10.setFont(new Font("Exo 2 Medium", Font.BOLD, 16));
		f10.setBounds(476, 484, 48, 32);
		contentPane.add(f10);
		
		JLabel lbls_2 = new JLabel("6s");
		lbls_2.setHorizontalAlignment(SwingConstants.CENTER);
		lbls_2.setForeground(Color.GRAY);
		lbls_2.setFont(new Font("Exo 2 Medium", Font.ITALIC, 14));
		lbls_2.setBounds(534, 140, 48, 32);
		contentPane.add(lbls_2);
		
		JLabel six = new JLabel("<?>");
		six.setHorizontalAlignment(SwingConstants.CENTER);
		six.setFont(new Font("Exo 2 Medium", Font.BOLD, 16));
		six.setBounds(534, 166, 48, 32);
		contentPane.add(six);
		
		JLabel six_1 = new JLabel("<?>");
		six_1.setHorizontalAlignment(SwingConstants.CENTER);
		six_1.setFont(new Font("Exo 2 Medium", Font.BOLD, 16));
		six_1.setBounds(534, 195, 48, 32);
		contentPane.add(six_1);
		
		JLabel six_2 = new JLabel("<?>");
		six_2.setHorizontalAlignment(SwingConstants.CENTER);
		six_2.setFont(new Font("Exo 2 Medium", Font.BOLD, 16));
		six_2.setBounds(534, 228, 48, 32);
		contentPane.add(six_2);
		
		JLabel six_3 = new JLabel("<?>");
		six_3.setHorizontalAlignment(SwingConstants.CENTER);
		six_3.setFont(new Font("Exo 2 Medium", Font.BOLD, 16));
		six_3.setBounds(534, 259, 48, 32);
		contentPane.add(six_3);
		
		JLabel six_4 = new JLabel("<?>");
		six_4.setHorizontalAlignment(SwingConstants.CENTER);
		six_4.setFont(new Font("Exo 2 Medium", Font.BOLD, 16));
		six_4.setBounds(534, 290, 48, 32);
		contentPane.add(six_4);
		
		JLabel six_5 = new JLabel("<?>");
		six_5.setHorizontalAlignment(SwingConstants.CENTER);
		six_5.setFont(new Font("Exo 2 Medium", Font.BOLD, 16));
		six_5.setBounds(534, 320, 48, 32);
		contentPane.add(six_5);
		
		JLabel six_6 = new JLabel("<?>");
		six_6.setHorizontalAlignment(SwingConstants.CENTER);
		six_6.setFont(new Font("Exo 2 Medium", Font.BOLD, 16));
		six_6.setBounds(534, 352, 48, 32);
		contentPane.add(six_6);
		
		JLabel six_7 = new JLabel("<?>");
		six_7.setHorizontalAlignment(SwingConstants.CENTER);
		six_7.setFont(new Font("Exo 2 Medium", Font.BOLD, 16));
		six_7.setBounds(534, 386, 48, 32);
		contentPane.add(six_7);
		
		JLabel six_8 = new JLabel("<?>");
		six_8.setHorizontalAlignment(SwingConstants.CENTER);
		six_8.setFont(new Font("Exo 2 Medium", Font.BOLD, 16));
		six_8.setBounds(534, 420, 48, 32);
		contentPane.add(six_8);
		
		JLabel six_9 = new JLabel("<?>");
		six_9.setHorizontalAlignment(SwingConstants.CENTER);
		six_9.setFont(new Font("Exo 2 Medium", Font.BOLD, 16));
		six_9.setBounds(534, 452, 48, 32);
		contentPane.add(six_9);
		
		JLabel six_10 = new JLabel("<?>");
		six_10.setHorizontalAlignment(SwingConstants.CENTER);
		six_10.setFont(new Font("Exo 2 Medium", Font.BOLD, 16));
		six_10.setBounds(534, 484, 48, 32);
		contentPane.add(six_10);
		
		Canvas seper_3 = new Canvas();
		seper_3.setBackground(Color.GRAY);
		seper_3.setBounds(588, 166, 1, 350);
		contentPane.add(seper_3);
		
		JLabel lblRuns_1 = new JLabel("Runs");
		lblRuns_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblRuns_1.setForeground(Color.GRAY);
		lblRuns_1.setFont(new Font("Exo 2 Medium", Font.ITALIC, 14));
		lblRuns_1.setBounds(602, 141, 49, 32);
		contentPane.add(lblRuns_1);
		
		JLabel lblBalls_1 = new JLabel("Balls");
		lblBalls_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblBalls_1.setForeground(Color.GRAY);
		lblBalls_1.setFont(new Font("Exo 2 Medium", Font.ITALIC, 14));
		lblBalls_1.setBounds(661, 141, 54, 32);
		contentPane.add(lblBalls_1);
		
		JLabel lblBalls_1_1 = new JLabel("Wickets");
		lblBalls_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblBalls_1_1.setForeground(Color.GRAY);
		lblBalls_1_1.setFont(new Font("Exo 2 Medium", Font.ITALIC, 14));
		lblBalls_1_1.setBounds(719, 141, 60, 32);
		contentPane.add(lblBalls_1_1);
		
		JLabel RC = new JLabel("<?>");
		RC.setHorizontalAlignment(SwingConstants.CENTER);
		RC.setFont(new Font("Exo 2 Medium", Font.BOLD, 16));
		RC.setBounds(602, 166, 48, 32);
		contentPane.add(RC);
		
		JLabel RC_1 = new JLabel("<?>");
		RC_1.setHorizontalAlignment(SwingConstants.CENTER);
		RC_1.setFont(new Font("Exo 2 Medium", Font.BOLD, 16));
		RC_1.setBounds(602, 195, 48, 32);
		contentPane.add(RC_1);
		
		JLabel RC_2 = new JLabel("<?>");
		RC_2.setHorizontalAlignment(SwingConstants.CENTER);
		RC_2.setFont(new Font("Exo 2 Medium", Font.BOLD, 16));
		RC_2.setBounds(602, 228, 48, 32);
		contentPane.add(RC_2);
		
		JLabel RC_3 = new JLabel("<?>");
		RC_3.setHorizontalAlignment(SwingConstants.CENTER);
		RC_3.setFont(new Font("Exo 2 Medium", Font.BOLD, 16));
		RC_3.setBounds(602, 259, 48, 32);
		contentPane.add(RC_3);
		
		JLabel RC_4 = new JLabel("<?>");
		RC_4.setHorizontalAlignment(SwingConstants.CENTER);
		RC_4.setFont(new Font("Exo 2 Medium", Font.BOLD, 16));
		RC_4.setBounds(602, 290, 48, 32);
		contentPane.add(RC_4);
		
		JLabel RC_5 = new JLabel("<?>");
		RC_5.setHorizontalAlignment(SwingConstants.CENTER);
		RC_5.setFont(new Font("Exo 2 Medium", Font.BOLD, 16));
		RC_5.setBounds(602, 320, 48, 32);
		contentPane.add(RC_5);
		
		JLabel RC_6 = new JLabel("<?>");
		RC_6.setHorizontalAlignment(SwingConstants.CENTER);
		RC_6.setFont(new Font("Exo 2 Medium", Font.BOLD, 16));
		RC_6.setBounds(602, 352, 48, 32);
		contentPane.add(RC_6);
		
		JLabel RC_7 = new JLabel("<?>");
		RC_7.setHorizontalAlignment(SwingConstants.CENTER);
		RC_7.setFont(new Font("Exo 2 Medium", Font.BOLD, 16));
		RC_7.setBounds(602, 386, 48, 32);
		contentPane.add(RC_7);
		
		JLabel RC_8 = new JLabel("<?>");
		RC_8.setHorizontalAlignment(SwingConstants.CENTER);
		RC_8.setFont(new Font("Exo 2 Medium", Font.BOLD, 16));
		RC_8.setBounds(602, 420, 48, 32);
		contentPane.add(RC_8);
		
		JLabel RC_9 = new JLabel("<?>");
		RC_9.setHorizontalAlignment(SwingConstants.CENTER);
		RC_9.setFont(new Font("Exo 2 Medium", Font.BOLD, 16));
		RC_9.setBounds(602, 452, 48, 32);
		contentPane.add(RC_9);
		
		JLabel RC_10 = new JLabel("<?>");
		RC_10.setHorizontalAlignment(SwingConstants.CENTER);
		RC_10.setFont(new Font("Exo 2 Medium", Font.BOLD, 16));
		RC_10.setBounds(602, 484, 48, 32);
		contentPane.add(RC_10);
		
		JLabel BB = new JLabel("<?>");
		BB.setHorizontalAlignment(SwingConstants.CENTER);
		BB.setFont(new Font("Exo 2 Medium", Font.BOLD, 16));
		BB.setBounds(661, 166, 48, 32);
		contentPane.add(BB);
		
		JLabel BB_1 = new JLabel("<?>");
		BB_1.setHorizontalAlignment(SwingConstants.CENTER);
		BB_1.setFont(new Font("Exo 2 Medium", Font.BOLD, 16));
		BB_1.setBounds(661, 195, 48, 32);
		contentPane.add(BB_1);
		
		JLabel BB_2 = new JLabel("<?>");
		BB_2.setHorizontalAlignment(SwingConstants.CENTER);
		BB_2.setFont(new Font("Exo 2 Medium", Font.BOLD, 16));
		BB_2.setBounds(661, 228, 48, 32);
		contentPane.add(BB_2);
		
		JLabel BB_3 = new JLabel("<?>");
		BB_3.setHorizontalAlignment(SwingConstants.CENTER);
		BB_3.setFont(new Font("Exo 2 Medium", Font.BOLD, 16));
		BB_3.setBounds(661, 259, 48, 32);
		contentPane.add(BB_3);
		
		JLabel BB_4 = new JLabel("<?>");
		BB_4.setHorizontalAlignment(SwingConstants.CENTER);
		BB_4.setFont(new Font("Exo 2 Medium", Font.BOLD, 16));
		BB_4.setBounds(661, 290, 48, 32);
		contentPane.add(BB_4);
		
		JLabel BB_5 = new JLabel("<?>");
		BB_5.setHorizontalAlignment(SwingConstants.CENTER);
		BB_5.setFont(new Font("Exo 2 Medium", Font.BOLD, 16));
		BB_5.setBounds(661, 320, 48, 32);
		contentPane.add(BB_5);
		
		JLabel BB_6 = new JLabel("<?>");
		BB_6.setHorizontalAlignment(SwingConstants.CENTER);
		BB_6.setFont(new Font("Exo 2 Medium", Font.BOLD, 16));
		BB_6.setBounds(661, 352, 48, 32);
		contentPane.add(BB_6);
		
		JLabel BB_7 = new JLabel("<?>");
		BB_7.setHorizontalAlignment(SwingConstants.CENTER);
		BB_7.setFont(new Font("Exo 2 Medium", Font.BOLD, 16));
		BB_7.setBounds(661, 386, 48, 32);
		contentPane.add(BB_7);
		
		JLabel BB_8 = new JLabel("<?>");
		BB_8.setHorizontalAlignment(SwingConstants.CENTER);
		BB_8.setFont(new Font("Exo 2 Medium", Font.BOLD, 16));
		BB_8.setBounds(661, 420, 48, 32);
		contentPane.add(BB_8);
		
		JLabel BB_9 = new JLabel("<?>");
		BB_9.setHorizontalAlignment(SwingConstants.CENTER);
		BB_9.setFont(new Font("Exo 2 Medium", Font.BOLD, 16));
		BB_9.setBounds(661, 452, 48, 32);
		contentPane.add(BB_9);
		
		JLabel BB_10 = new JLabel("<?>");
		BB_10.setHorizontalAlignment(SwingConstants.CENTER);
		BB_10.setFont(new Font("Exo 2 Medium", Font.BOLD, 16));
		BB_10.setBounds(661, 484, 48, 32);
		contentPane.add(BB_10);
		
		JLabel lblBalls_1_1_1 = new JLabel("NB&Wd");
		lblBalls_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblBalls_1_1_1.setForeground(Color.GRAY);
		lblBalls_1_1_1.setFont(new Font("Exo 2 Medium", Font.ITALIC, 14));
		lblBalls_1_1_1.setBounds(789, 141, 73, 32);
		contentPane.add(lblBalls_1_1_1);
		
		JLabel W = new JLabel("<?>");
		W.setHorizontalAlignment(SwingConstants.CENTER);
		W.setFont(new Font("Exo 2 Medium", Font.BOLD, 16));
		W.setBounds(725, 166, 48, 32);
		contentPane.add(W);
		
		JLabel W_1 = new JLabel("<?>");
		W_1.setHorizontalAlignment(SwingConstants.CENTER);
		W_1.setFont(new Font("Exo 2 Medium", Font.BOLD, 16));
		W_1.setBounds(725, 195, 48, 32);
		contentPane.add(W_1);
		
		JLabel W_2 = new JLabel("<?>");
		W_2.setHorizontalAlignment(SwingConstants.CENTER);
		W_2.setFont(new Font("Exo 2 Medium", Font.BOLD, 16));
		W_2.setBounds(725, 228, 48, 32);
		contentPane.add(W_2);
		
		JLabel W_3 = new JLabel("<?>");
		W_3.setHorizontalAlignment(SwingConstants.CENTER);
		W_3.setFont(new Font("Exo 2 Medium", Font.BOLD, 16));
		W_3.setBounds(725, 259, 48, 32);
		contentPane.add(W_3);
		
		JLabel W_4 = new JLabel("<?>");
		W_4.setHorizontalAlignment(SwingConstants.CENTER);
		W_4.setFont(new Font("Exo 2 Medium", Font.BOLD, 16));
		W_4.setBounds(725, 290, 48, 32);
		contentPane.add(W_4);
		
		JLabel W_5 = new JLabel("<?>");
		W_5.setHorizontalAlignment(SwingConstants.CENTER);
		W_5.setFont(new Font("Exo 2 Medium", Font.BOLD, 16));
		W_5.setBounds(725, 320, 48, 32);
		contentPane.add(W_5);
		
		JLabel W_6 = new JLabel("<?>");
		W_6.setHorizontalAlignment(SwingConstants.CENTER);
		W_6.setFont(new Font("Exo 2 Medium", Font.BOLD, 16));
		W_6.setBounds(725, 352, 48, 32);
		contentPane.add(W_6);
		
		JLabel W_7 = new JLabel("<?>");
		W_7.setHorizontalAlignment(SwingConstants.CENTER);
		W_7.setFont(new Font("Exo 2 Medium", Font.BOLD, 16));
		W_7.setBounds(725, 386, 48, 32);
		contentPane.add(W_7);
		
		JLabel W_8 = new JLabel("<?>");
		W_8.setHorizontalAlignment(SwingConstants.CENTER);
		W_8.setFont(new Font("Exo 2 Medium", Font.BOLD, 16));
		W_8.setBounds(725, 420, 48, 32);
		contentPane.add(W_8);
		
		JLabel W_9 = new JLabel("<?>");
		W_9.setHorizontalAlignment(SwingConstants.CENTER);
		W_9.setFont(new Font("Exo 2 Medium", Font.BOLD, 16));
		W_9.setBounds(725, 452, 48, 32);
		contentPane.add(W_9);
		
		JLabel W_10 = new JLabel("<?>");
		W_10.setHorizontalAlignment(SwingConstants.CENTER);
		W_10.setFont(new Font("Exo 2 Medium", Font.BOLD, 16));
		W_10.setBounds(725, 484, 48, 32);
		contentPane.add(W_10);
		
		JLabel NBW = new JLabel("<?>");
		NBW.setHorizontalAlignment(SwingConstants.CENTER);
		NBW.setFont(new Font("Exo 2 Medium", Font.BOLD, 16));
		NBW.setBounds(799, 166, 48, 32);
		contentPane.add(NBW);
		
		JLabel NBW_1 = new JLabel("<?>");
		NBW_1.setHorizontalAlignment(SwingConstants.CENTER);
		NBW_1.setFont(new Font("Exo 2 Medium", Font.BOLD, 16));
		NBW_1.setBounds(799, 195, 48, 32);
		contentPane.add(NBW_1);
		
		JLabel NBW_2 = new JLabel("<?>");
		NBW_2.setHorizontalAlignment(SwingConstants.CENTER);
		NBW_2.setFont(new Font("Exo 2 Medium", Font.BOLD, 16));
		NBW_2.setBounds(799, 228, 48, 32);
		contentPane.add(NBW_2);
		
		JLabel NBW_3 = new JLabel("<?>");
		NBW_3.setHorizontalAlignment(SwingConstants.CENTER);
		NBW_3.setFont(new Font("Exo 2 Medium", Font.BOLD, 16));
		NBW_3.setBounds(799, 259, 48, 32);
		contentPane.add(NBW_3);
		
		JLabel NBW_4 = new JLabel("<?>");
		NBW_4.setHorizontalAlignment(SwingConstants.CENTER);
		NBW_4.setFont(new Font("Exo 2 Medium", Font.BOLD, 16));
		NBW_4.setBounds(799, 290, 48, 32);
		contentPane.add(NBW_4);
		
		JLabel NBW_5 = new JLabel("<?>");
		NBW_5.setHorizontalAlignment(SwingConstants.CENTER);
		NBW_5.setFont(new Font("Exo 2 Medium", Font.BOLD, 16));
		NBW_5.setBounds(799, 320, 48, 32);
		contentPane.add(NBW_5);
		
		JLabel NBW_6 = new JLabel("<?>");
		NBW_6.setHorizontalAlignment(SwingConstants.CENTER);
		NBW_6.setFont(new Font("Exo 2 Medium", Font.BOLD, 16));
		NBW_6.setBounds(799, 352, 48, 32);
		contentPane.add(NBW_6);
		
		JLabel NBW_7 = new JLabel("<?>");
		NBW_7.setHorizontalAlignment(SwingConstants.CENTER);
		NBW_7.setFont(new Font("Exo 2 Medium", Font.BOLD, 16));
		NBW_7.setBounds(799, 386, 48, 32);
		contentPane.add(NBW_7);
		
		JLabel NBW_8 = new JLabel("<?>");
		NBW_8.setHorizontalAlignment(SwingConstants.CENTER);
		NBW_8.setFont(new Font("Exo 2 Medium", Font.BOLD, 16));
		NBW_8.setBounds(799, 420, 48, 32);
		contentPane.add(NBW_8);
		
		JLabel NBW_9 = new JLabel("<?>");
		NBW_9.setHorizontalAlignment(SwingConstants.CENTER);
		NBW_9.setFont(new Font("Exo 2 Medium", Font.BOLD, 16));
		NBW_9.setBounds(799, 452, 48, 32);
		contentPane.add(NBW_9);
		
		JLabel NBW_10 = new JLabel("<?>");
		NBW_10.setHorizontalAlignment(SwingConstants.CENTER);
		NBW_10.setFont(new Font("Exo 2 Medium", Font.BOLD, 16));
		NBW_10.setBounds(799, 484, 48, 32);
		contentPane.add(NBW_10);
		
		Canvas seper_3_1 = new Canvas();
		seper_3_1.setBackground(Color.GRAY);
		seper_3_1.setBounds(314, 166, 1, 350);
		contentPane.add(seper_3_1);
		
		JLabel lblGeneral_2 = new JLabel("General");
		lblGeneral_2.setForeground(Color.GRAY);
		lblGeneral_2.setFont(new Font("Exo 2 Medium", Font.ITALIC, 14));
		lblGeneral_2.setBounds(913, 312, 185, 25);
		contentPane.add(lblGeneral_2);
		
		JLabel Tname_2 = new JLabel("<Undefined>");
		Tname_2.setForeground(Color.GRAY);
		Tname_2.setFont(new Font("Exo 2 Medium", Font.ITALIC, 20));
		Tname_2.setBounds(913, 337, 185, 32);
		contentPane.add(Tname_2);
		
		JLabel lblGeneral_2_1_1 = new JLabel("Final Score");
		lblGeneral_2_1_1.setForeground(Color.GRAY);
		lblGeneral_2_1_1.setFont(new Font("Exo 2 Medium", Font.ITALIC, 14));
		lblGeneral_2_1_1.setBounds(913, 373, 126, 25);
		contentPane.add(lblGeneral_2_1_1);
		
		JLabel lblGeneral_2_1_1_1 = new JLabel("Overs");
		lblGeneral_2_1_1_1.setForeground(Color.GRAY);
		lblGeneral_2_1_1_1.setFont(new Font("Exo 2 Medium", Font.ITALIC, 14));
		lblGeneral_2_1_1_1.setBounds(913, 399, 126, 25);
		contentPane.add(lblGeneral_2_1_1_1);
		
		JLabel lblGeneral_2_1_1_1_1 = new JLabel("Overs");
		lblGeneral_2_1_1_1_1.setForeground(Color.GRAY);
		lblGeneral_2_1_1_1_1.setFont(new Font("Exo 2 Medium", Font.ITALIC, 14));
		lblGeneral_2_1_1_1_1.setBounds(913, 491, 126, 25);
		contentPane.add(lblGeneral_2_1_1_1_1);
		
		JLabel lblGeneral_2_1_1_2 = new JLabel("Final Score");
		lblGeneral_2_1_1_2.setForeground(Color.GRAY);
		lblGeneral_2_1_1_2.setFont(new Font("Exo 2 Medium", Font.ITALIC, 14));
		lblGeneral_2_1_1_2.setBounds(913, 465, 126, 25);
		contentPane.add(lblGeneral_2_1_1_2);
		
		JLabel Tname_3 = new JLabel("<Undefined>");
		Tname_3.setForeground(Color.GRAY);
		Tname_3.setFont(new Font("Exo 2 Medium", Font.ITALIC, 20));
		Tname_3.setBounds(913, 429, 185, 32);
		contentPane.add(Tname_3);
		
		JLabel FS = new JLabel("-");
		FS.setForeground(Color.GRAY);
		FS.setFont(new Font("Exo 2 Medium", Font.ITALIC, 14));
		FS.setBounds(1039, 373, 126, 25);
		contentPane.add(FS);
		
		JLabel O = new JLabel("-");
		O.setForeground(Color.GRAY);
		O.setFont(new Font("Exo 2 Medium", Font.ITALIC, 14));
		O.setBounds(1039, 399, 126, 25);
		contentPane.add(O);
		
		JLabel O_1 = new JLabel("-");
		O_1.setForeground(Color.GRAY);
		O_1.setFont(new Font("Exo 2 Medium", Font.ITALIC, 14));
		O_1.setBounds(1039, 491, 41, 25);
		contentPane.add(O_1);
		
		JLabel FS_1 = new JLabel("-");
		FS_1.setForeground(Color.GRAY);
		FS_1.setFont(new Font("Exo 2 Medium", Font.ITALIC, 14));
		FS_1.setBounds(1039, 465, 126, 25);
		contentPane.add(FS_1);
		
		Canvas seper_2_1_1 = new Canvas();
		seper_2_1_1.setBackground(Color.GRAY);
		seper_2_1_1.setBounds(913, 423, 170, 1);
		contentPane.add(seper_2_1_1);
		
		Canvas seper_2_1_2 = new Canvas();
		seper_2_1_2.setBackground(Color.GRAY);
		seper_2_1_2.setBounds(913, 515, 170, 1);
		contentPane.add(seper_2_1_2);
		
		JLabel Tname_1 = new JLabel("No Match Loaded");
		Tname_1.setForeground(Color.GRAY);
		Tname_1.setFont(new Font("Jersey M54", Font.PLAIN, 40));
		Tname_1.setBounds(913, 88, 341, 47);
		contentPane.add(Tname_1);
				
		tm.start();
		
		JLabel[] Runs = {R, R_1, R_2, R_3, R_4, R_5, R_6, R_7, R_8, R_9, R_10, };
		JLabel[] Balls = {B_0, B_1, B_2, B_3, B_4, B_5, B_6, B_7, B_8, B_9, B_10, };
		JLabel[] Fours = {f, f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, };
		JLabel[] Sixes = {six, six_1, six_2, six_3, six_4, six_5, six_6, six_7, six_8, six_9, six_10,};
		JLabel[] RunsC = {RC, RC_1, RC_2, RC_3, RC_4, RC_5, RC_6, RC_7, RC_8, RC_9, RC_10};
		JLabel[] BBalls = {BB, BB_1, BB_2, BB_3, BB_4, BB_5, BB_6, BB_7, BB_8, BB_9, BB_10, };
		JLabel[] Wickets = {W, W_1, W_2, W_3, W_4, W_5, W_6, W_7, W_8, W_9, W_10, };
		JLabel[] NB_W = {NBW, NBW_1, NBW_2, NBW_3, NBW_4, NBW_5, NBW_6, NBW_7, NBW_8, NBW_9, NBW_10,};
		JLabel[] Names = {N, N_1, N_2, N_3, N_4, N_5, N_6, N_7, N_8, N_9, N_10, };
		
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
		
		
		Nextb.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {			
                 
				if(sel<use_1.length()-1) {
					sel++;
				Y = use_1.search(sel);
				TeamAf.setIcon(new ImageIcon("C:\\PowerPlay\\Flags\\" + Y.teamA + ".png"));
				Tname_1.setText(sel+1 + " out of " + use_1.length());
				Tname.setText(Y.teamA + " vs. " + Y.teamB);
				int sumruns = 0;
				int sumruns_1 = 0;
				int sumw = 0;
				int sumw_1 = 0;
				int sumb = 0;
				int sumb_1 = 0;
				for (int i = 0; i < 11; i++) {
					Names[i].setText(Y.A[i]);
					Runs[i].setText(Y.Astats[i][0]+"");
					sumruns = sumruns + Y.Bstats[i][4];
					sumruns_1 = sumruns_1 + Y.Astats[i][4];
					sumw = sumw + Y.Astats[i][2];
					sumw_1 = sumw_1 + Y.Bstats[i][2];
					sumb = sumb + Y.Astats[i][1];
					sumb_1 = sumb_1 + Y.Bstats[i][1];
					Balls[i].setText(Y.Astats[i][1]+"");
					Fours[i].setText(Y.Astats[i][5]+"");
					Sixes[i].setText(Y.Astats[i][6]+"");
					RunsC[i].setText(Y.Astats[i][4]+"");
					BBalls[i].setText(Y.Astats[i][3]+"");
					Wickets[i].setText(Y.Astats[i][2]+"");
					NB_W[i].setText(Y.Astats[i][8]+Y.Astats[i][7] + "");
				}
				
				O.setText(sumb/6 + "." + sumb%6);
				O_1.setText(sumb_1/6 + "." + sumb_1%6);
				FS.setText(sumruns + " - " + sumw_1);
				FS_1.setText(sumruns_1 + " - " + sumw);
				Tname_2.setText(Y.teamA);
				Tname_3.setText(Y.teamB);
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
				Y = use_1.search(sel);
				TeamAf.setIcon(new ImageIcon("C:\\PowerPlay\\Flags\\" + Y.teamA + ".png"));
				Tname.setText(Y.teamA + " vs. " + Y.teamB);
				Tname_1.setText(sel+1 + " out of " + use_1.length());
				int sumruns = 0;
				int sumruns_1 = 0;
				int sumw = 0;
				int sumw_1 = 0;
				int sumb = 0;
				int sumb_1 = 0;
				for (int i = 0; i < 11; i++) {
					Names[i].setText(Y.A[i]);
					Runs[i].setText(Y.Astats[i][0]+"");
					sumruns = sumruns + Y.Bstats[i][4];
					sumruns_1 = sumruns_1 + Y.Astats[i][4];
					sumw = sumw + Y.Astats[i][2];
					sumw_1 = sumw_1 + Y.Bstats[i][2];
					sumb = sumb + Y.Astats[i][1];
					sumb_1 = sumb_1 + Y.Bstats[i][1];
					Balls[i].setText(Y.Astats[i][1]+"");
					Fours[i].setText(Y.Astats[i][5]+"");
					Sixes[i].setText(Y.Astats[i][6]+"");
					RunsC[i].setText(Y.Astats[i][4]+"");
					BBalls[i].setText(Y.Astats[i][3]+"");
					Wickets[i].setText(Y.Astats[i][2]+"");
					NB_W[i].setText(Y.Astats[i][8]+Y.Astats[i][7] + "");
				}
				
				O.setText(sumb/6 + "." + sumb%6);
				O_1.setText(sumb_1/6 + "." + sumb_1%6);
				FS.setText(sumruns + " - " + sumw_1);
				FS_1.setText(sumruns_1 + " - " + sumw);
				Tname_2.setText(Y.teamA);
				Tname_3.setText(Y.teamB);
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
				sel = comboBox_1.getSelectedIndex();
				Y = use_1.search(sel);
				Tname_1.setText(sel+1 + " out of " + use_1.length());
				TeamAf.setIcon(new ImageIcon("C:\\PowerPlay\\Flags\\" + Y.teamA + ".png"));
				Tname.setText(Y.teamA + " vs. " + Y.teamB);
				int sumruns = 0;
				int sumruns_1 = 0;
				int sumw = 0;
				int sumw_1 = 0;
				int sumb = 0;
				int sumb_1 = 0;
				for (int i = 0; i < 11; i++) {
					Names[i].setText(Y.A[i]);
					Runs[i].setText(Y.Astats[i][0]+"");
					sumruns = sumruns + Y.Bstats[i][4];
					sumruns_1 = sumruns_1 + Y.Astats[i][4];
					sumw = sumw + Y.Astats[i][2];
					sumw_1 = sumw_1 + Y.Bstats[i][2];
					sumb = sumb + Y.Astats[i][1];
					sumb_1 = sumb_1 + Y.Bstats[i][1];
					Balls[i].setText(Y.Astats[i][1]+"");
					Fours[i].setText(Y.Astats[i][5]+"");
					Sixes[i].setText(Y.Astats[i][6]+"");
					RunsC[i].setText(Y.Astats[i][4]+"");
					BBalls[i].setText(Y.Astats[i][3]+"");
					Wickets[i].setText(Y.Astats[i][2]+"");
					NB_W[i].setText(Y.Astats[i][8]+Y.Astats[i][7] + "");
				}
				
				O.setText(sumb/6 + "." + sumb%6);
				O_1.setText(sumb_1/6 + "." + sumb_1%6);
				FS.setText(sumruns + " - " + sumw_1);
				FS_1.setText(sumruns_1 + " - " + sumw);
				Tname_2.setText(Y.teamA);
				Tname_3.setText(Y.teamB);
			}
		});
		
		Lb.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				use_1.head = null;
				sel = 0;
				String T = "C:\\PowerPlay\\Tournament\\" + (String)comboBox.getSelectedItem() + "\\";
				String[] M = (new File(T).list());
				
				for (int i = 0; i < M.length; i++) {
					use_1.insert(Mread.read(T+M[i]));
					M[i] = M[i].substring(0, M[i].indexOf(".txt"));
				}
				
				comboBox_1.setModel(new DefaultComboBoxModel(M));
				
				Y = use_1.search(sel);
				TeamAf.setIcon(new ImageIcon("C:\\PowerPlay\\Flags\\" + Y.teamA + ".png"));
				Tname.setText(Y.teamA + " vs. " + Y.teamB);
				Tname_1.setText(sel+1 + " out of " + use_1.length());
				int sumruns = 0;
				int sumruns_1 = 0;
				int sumw = 0;
				int sumw_1 = 0;
				int sumb = 0;
				int sumb_1 = 0;
				for (int i = 0; i < 11; i++) {
					Names[i].setText(Y.A[i]);
					Runs[i].setText(Y.Astats[i][0]+"");
					sumruns = sumruns + Y.Bstats[i][4];
					sumruns_1 = sumruns_1 + Y.Astats[i][4];
					sumw = sumw + Y.Astats[i][2];
					sumw_1 = sumw_1 + Y.Bstats[i][2];
					sumb = sumb + Y.Astats[i][1];
					sumb_1 = sumb_1 + Y.Bstats[i][1];
					Balls[i].setText(Y.Astats[i][1]+"");
					Fours[i].setText(Y.Astats[i][5]+"");
					Sixes[i].setText(Y.Astats[i][6]+"");
					RunsC[i].setText(Y.Astats[i][4]+"");
					BBalls[i].setText(Y.Astats[i][3]+"");
					Wickets[i].setText(Y.Astats[i][2]+"");
					NB_W[i].setText(Y.Astats[i][8]+Y.Astats[i][7] + "");
				}
				
				O.setText(sumb/6 + "." + sumb%6);
				O_1.setText(sumb_1/6 + "." + sumb_1%6);
				FS.setText(sumruns + " - " + sumw_1);
				FS_1.setText(sumruns_1 + " - " + sumw);
				Tname_2.setText(Y.teamA);
				Tname_3.setText(Y.teamB);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
			Lb.setForeground(Color.WHITE);
			jp.setBackground(Color.DARK_GRAY);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				Lb.setForeground(Color.DARK_GRAY);
				jp.setBackground(Color.WHITE);
			}
			
		});
		
		lblSwitch.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				try {
				int sumruns = 0;
				int sumruns_1 = 0;
				int sumw = 0;
				int sumw_1 = 0;
				int sumb = 0;
				int sumb_1 = 0;
				
				if(switcht == false) {
					TeamAf.setIcon(new ImageIcon("C:\\PowerPlay\\Flags\\" + Y.teamB + ".png"));

				for (int i = 0; i < 11; i++) {
					Names[i].setText(Y.B[i]);
					Runs[i].setText(Y.Bstats[i][0]+"");
					sumruns = sumruns + Y.Bstats[i][4];
					sumruns_1 = sumruns_1 + Y.Astats[i][4];
					sumw = sumw + Y.Astats[i][2];
					sumw_1 = sumw_1 + Y.Bstats[i][2];
					sumb = sumb + Y.Astats[i][1];
					sumb_1 = sumb_1 + Y.Bstats[i][1];
					Balls[i].setText(Y.Bstats[i][1]+"");
					Fours[i].setText(Y.Bstats[i][5]+"");
					Sixes[i].setText(Y.Bstats[i][6]+"");
					RunsC[i].setText(Y.Bstats[i][4]+"");
					BBalls[i].setText(Y.Bstats[i][3]+"");
					Wickets[i].setText(Y.Bstats[i][2]+"");
					NB_W[i].setText(Y.Bstats[i][8]+Y.Bstats[i][7] + "");
					switcht = true;
				}
					
				}else {
					TeamAf.setIcon(new ImageIcon("C:\\PowerPlay\\Flags\\" + Y.teamA + ".png"));
					for (int i = 0; i < 11; i++) {
						Names[i].setText(Y.A[i]);
						Runs[i].setText(Y.Astats[i][0]+"");
						sumruns = sumruns + Y.Bstats[i][4];
						sumruns_1 = sumruns_1 + Y.Astats[i][4];
						sumw = sumw + Y.Astats[i][2];
						sumw_1 = sumw_1 + Y.Bstats[i][2];
						sumb = sumb + Y.Astats[i][1];
						sumb_1 = sumb_1 + Y.Bstats[i][1];
						Balls[i].setText(Y.Astats[i][1]+"");
						Fours[i].setText(Y.Astats[i][5]+"");
						Sixes[i].setText(Y.Astats[i][6]+"");
						RunsC[i].setText(Y.Astats[i][4]+"");
						BBalls[i].setText(Y.Astats[i][3]+"");
						Wickets[i].setText(Y.Astats[i][2]+"");
						NB_W[i].setText(Y.Astats[i][8]+Y.Astats[i][7] + "");
					}
					switcht = false;
				}
				}catch(Exception X) {
					
				}
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblSwitch.setForeground(Color.BLACK);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblSwitch.setForeground(Color.LIGHT_GRAY);
			}
		});
		

	}
}
