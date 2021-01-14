import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.text.DecimalFormat;

import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class PlayerViewer extends JFrame implements ActionListener {

	boolean a,b,c,d;
    int sel = -1;
	DecimalFormat formatter = new DecimalFormat("###.#");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PlayerViewer frame = new PlayerViewer("India");
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
	private final JLabel Pname = new JLabel("<No Player Loaded>");
	private final JLabel SRt = new JLabel("<000.0>");
	private final JPanel SRp = new JPanel();
	private final JPanel Ep = new JPanel();
	private final JLabel Et = new JLabel("<00.00>");
	private final JPanel BFp = new JPanel();
	private final JLabel BFt = new JLabel("<00000>");
	private final JPanel RMp = new JPanel();
	private final JLabel RMt = new JLabel("<00000>");
	private final JPanel BDp = new JPanel();
	private final JLabel BDt = new JLabel("<00000>");
	private final JPanel RCp = new JPanel();
	private final JLabel RCt = new JLabel("<00000>");
	private final JLabel lblRunsConceded = new JLabel("RUNS CONCEDED");
	private final JLabel lblBallsDelivered = new JLabel("BALLS DELIVERED");
	private final JPanel Wp = new JPanel();
	private final JLabel Wt = new JLabel("<00000>");
	private final JLabel lblWickets = new JLabel("WICKETS");
	private final JPanel NBWp = new JPanel();
	private final JLabel NBWt = new JLabel("<00000>");
	private final JLabel lblWidesNo = new JLabel("WIDES & NO BALLS");
	private final JPanel nodata = new JPanel();
	private final JPanel low = new JPanel();
	private final JPanel avg = new JPanel();
	private final JPanel high = new JPanel();
	private final JPanel highest = new JPanel();
	private final JPanel nodata_1 = new JPanel();
	private final JPanel low_1 = new JPanel();
	private final JPanel avg_1 = new JPanel();
	private final JPanel high_1 = new JPanel();
	private final JPanel highest_1 = new JPanel();
	private final JPanel nodata_2 = new JPanel();
	private final JPanel low_2 = new JPanel();
	private final JPanel avg_2 = new JPanel();
	private final JPanel high_2 = new JPanel();
	private final JPanel highest_2 = new JPanel();
	private final JPanel nodata_3 = new JPanel();
	private final JPanel low_3 = new JPanel();
	private final JPanel avg_3 = new JPanel();
	private final JPanel high_3 = new JPanel();
	private final JPanel highest_3 = new JPanel();
	private final JPanel nodata_4 = new JPanel();
	private final JPanel low_4 = new JPanel();
	private final JPanel avg_4 = new JPanel();
	private final JPanel high_4 = new JPanel();
	private final JPanel highest_4 = new JPanel();
	private final JPanel nodata_5 = new JPanel();
	private final JPanel low_5 = new JPanel();
	private final JPanel avg_5 = new JPanel();
	private final JPanel high_5 = new JPanel();
	private final JPanel highest_5 = new JPanel();
	private final JPanel nodata_6 = new JPanel();
	private final JPanel low_6 = new JPanel();
	private final JPanel avg_6 = new JPanel();
	private final JPanel high_6 = new JPanel();
	private final JPanel highest_6 = new JPanel();
	private final JPanel nodata_7 = new JPanel();
	private final JPanel low_7 = new JPanel();
	private final JPanel avg_7 = new JPanel();
	private final JPanel high_7 = new JPanel();
	private final JPanel highest_7 = new JPanel();
	private final JPanel nodata_8 = new JPanel();
	private final JPanel low_8 = new JPanel();
	private final JPanel avg_8 = new JPanel();
	private final JPanel high_8 = new JPanel();
	private final JPanel highest_8 = new JPanel();
	private final JPanel nodata_9 = new JPanel();
	private final JPanel low_9 = new JPanel();
	private final JPanel avg_9 = new JPanel();
	private final JPanel high_9 = new JPanel();
	private final JPanel highest_9 = new JPanel();
	private final JLabel label = new JLabel("New label");
	private final JLabel PlayerPicture = new JLabel("-");
	private final JLabel prole = new JLabel("<No Player Loaded>");
	
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
	
	public PlayerViewer(String TeamName) {
		
		PlayerReader Read = new PlayerReader();
		PlayerLL List = new PlayerLL();
		
		String[] address = new File("C:\\PowerPlay\\Players\\" + TeamName+"\\").list();
		
		for(int i =0;i<address.length;i++) {
			int index = address[i].indexOf(".txt"); 
			address[i] = address[i].substring(0, index);
			List.insert(Read.read(TeamName,address[i]));			
		}
		
		
		setResizable(false);
		setTitle("PowerPlay PlayerViewer | Promethium");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(00, 00, 1280,720);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		

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
		Pname.setFont(new Font("Jersey M54", Font.PLAIN, 66));
		Pname.setBounds(82, 71, 1193, 65);
		
		contentPane.add(Pname);
		SRp.setBackground(Color.DARK_GRAY);
		SRp.setBounds(404, 529, 200, 75);
		
		contentPane.add(SRp);
		SRp.setLayout(null);
		SRt.setForeground(Color.WHITE);
		SRt.setBounds(0, 0, 200, 75);
		SRp.add(SRt);
		SRt.setHorizontalAlignment(SwingConstants.CENTER);
		SRt.setFont(new Font("Jersey M54", Font.PLAIN, 72));
		Ep.setLayout(null);
		Ep.setBackground(Color.DARK_GRAY);
		Ep.setBounds(694, 529, 200, 75);
		
		contentPane.add(Ep);
		Et.setHorizontalAlignment(SwingConstants.CENTER);
		Et.setForeground(Color.WHITE);
		Et.setFont(new Font("Jersey M54", Font.PLAIN, 72));
		Et.setBounds(0, 0, 200, 75);
		
		Ep.add(Et);
		BFp.setLayout(null);
		BFp.setBackground(Color.DARK_GRAY);
		BFp.setBounds(82, 305, 200, 75);
		
		contentPane.add(BFp);
		BFt.setHorizontalAlignment(SwingConstants.CENTER);
		BFt.setForeground(Color.WHITE);
		BFt.setFont(new Font("Jersey M54", Font.PLAIN, 72));
		BFt.setBounds(0, 0, 200, 75);
		
		BFp.add(BFt);
		RMp.setLayout(null);
		RMp.setBackground(Color.DARK_GRAY);
		RMp.setBounds(82, 193, 200, 75);
		
		contentPane.add(RMp);
		RMt.setHorizontalAlignment(SwingConstants.CENTER);
		RMt.setForeground(Color.WHITE);
		RMt.setFont(new Font("Jersey M54", Font.PLAIN, 72));
		RMt.setBounds(0, 0, 200, 75);
		
		RMp.add(RMt);
		
		JLabel STRIKERATE = new JLabel("STRIKE RATE");
		STRIKERATE.setFont(new Font("Exo 2 Medium", Font.PLAIN, 18));
		STRIKERATE.setBounds(404, 492, 194, 54);
		contentPane.add(STRIKERATE);
		
		JLabel ECONOMY = new JLabel("ECONOMY");
		ECONOMY.setFont(new Font("Exo 2 Medium", Font.PLAIN, 18));
		ECONOMY.setBounds(694, 492, 194, 54);
		contentPane.add(ECONOMY);
		
		JLabel RUNSSCORED = new JLabel("RUNS SCORED");
		RUNSSCORED.setFont(new Font("Exo 2 Medium", Font.PLAIN, 18));
		RUNSSCORED.setBounds(82, 156, 194, 54);
		contentPane.add(RUNSSCORED);
		
		JLabel BALLSFACED = new JLabel("BALLS FACED");
		BALLSFACED.setFont(new Font("Exo 2 Medium", Font.PLAIN, 18));
		BALLSFACED.setBounds(81, 269, 194, 54);
		contentPane.add(BALLSFACED);
		
		JPanel FSp = new JPanel();
		FSp.setLayout(null);
		FSp.setBackground(Color.DARK_GRAY);
		FSp.setBounds(82, 415, 200, 75);
		contentPane.add(FSp);
		
		JLabel FSt = new JLabel("<00000>");
		FSt.setHorizontalAlignment(SwingConstants.CENTER);
		FSt.setForeground(Color.WHITE);
		FSt.setFont(new Font("Jersey M54", Font.PLAIN, 72));
		FSt.setBounds(0, 0, 200, 75);
		FSp.add(FSt);
		
		JLabel FOURSSCORED = new JLabel("FOURS SCORED");
		FOURSSCORED.setFont(new Font("Exo 2 Medium", Font.PLAIN, 18));
		FOURSSCORED.setBounds(82, 378, 194, 54);
		contentPane.add(FOURSSCORED);
		
		JPanel SSp = new JPanel();
		SSp.setLayout(null);
		SSp.setBackground(Color.DARK_GRAY);
		SSp.setBounds(82, 529, 200, 75);
		contentPane.add(SSp);
		
		JLabel SSt = new JLabel("<00000>");
		SSt.setHorizontalAlignment(SwingConstants.CENTER);
		SSt.setForeground(Color.WHITE);
		SSt.setFont(new Font("Jersey M54", Font.PLAIN, 72));
		SSt.setBounds(0, 0, 200, 75);
		SSp.add(SSt);
		
		JLabel SIXESSCORED = new JLabel("SIXES SCORED");
		SIXESSCORED.setFont(new Font("Exo 2 Medium", Font.PLAIN, 18));
		SIXESSCORED.setBounds(82, 492, 194, 54);
		contentPane.add(SIXESSCORED);
		BDp.setLayout(null);
		BDp.setBackground(Color.DARK_GRAY);
		BDp.setBounds(995, 305, 200, 75);
		
		contentPane.add(BDp);
		BDt.setHorizontalAlignment(SwingConstants.CENTER);
		BDt.setForeground(Color.WHITE);
		BDt.setFont(new Font("Jersey M54", Font.PLAIN, 72));
		BDt.setBounds(0, 0, 200, 75);
		
		BDp.add(BDt);
		RCp.setLayout(null);
		RCp.setBackground(Color.DARK_GRAY);
		RCp.setBounds(995, 193, 200, 75);
		
		contentPane.add(RCp);
		RCt.setBounds(0, 0, 200, 75);
		RCp.add(RCt);
		RCt.setHorizontalAlignment(SwingConstants.CENTER);
		RCt.setForeground(Color.WHITE);
		RCt.setFont(new Font("Jersey M54", Font.PLAIN, 72));
		lblRunsConceded.setFont(new Font("Exo 2 Medium", Font.PLAIN, 18));
		lblRunsConceded.setBounds(995, 156, 194, 54);
		
		contentPane.add(lblRunsConceded);
		lblBallsDelivered.setFont(new Font("Exo 2 Medium", Font.PLAIN, 18));
		lblBallsDelivered.setBounds(994, 269, 194, 54);
		
		contentPane.add(lblBallsDelivered);
		Wp.setLayout(null);
		Wp.setBackground(Color.DARK_GRAY);
		Wp.setBounds(995, 415, 200, 75);
		
		contentPane.add(Wp);
		Wt.setHorizontalAlignment(SwingConstants.CENTER);
		Wt.setForeground(Color.WHITE);
		Wt.setFont(new Font("Jersey M54", Font.PLAIN, 72));
		Wt.setBounds(0, 0, 200, 75);
		
		Wp.add(Wt);
		lblWickets.setFont(new Font("Exo 2 Medium", Font.PLAIN, 18));
		lblWickets.setBounds(995, 378, 194, 54);
		
		contentPane.add(lblWickets);
		NBWp.setLayout(null);
		NBWp.setBackground(Color.DARK_GRAY);
		NBWp.setBounds(995, 529, 200, 75);
		
		contentPane.add(NBWp);
		NBWt.setHorizontalAlignment(SwingConstants.CENTER);
		NBWt.setForeground(Color.WHITE);
		NBWt.setFont(new Font("Jersey M54", Font.PLAIN, 72));
		NBWt.setBounds(0, 0, 200, 75);
		
		NBWp.add(NBWt);
		lblWidesNo.setFont(new Font("Exo 2 Medium", Font.PLAIN, 18));
		lblWidesNo.setBounds(995, 492, 194, 54);
		
		contentPane.add(lblWidesNo);
		nodata.setToolTipText("Metric has too Less Data to determine.");
		nodata.setBackground(Color.DARK_GRAY);
		nodata.setBounds(282, 193, 10, 15);
		
		contentPane.add(nodata);
		low.setToolTipText("Player has low performance in this metric.");
		low.setBackground(new Color(220, 20, 60));
		low.setBounds(282, 208, 10, 15);
		
		contentPane.add(low);
		avg.setToolTipText("Player has average performance in this metric.");
		avg.setBackground(Color.ORANGE);
		avg.setBounds(282, 223, 10, 15);
		
		contentPane.add(avg);
		high.setToolTipText("Player has high performance in this metric");
		high.setBackground(Color.GREEN);
		high.setBounds(282, 238, 10, 15);
		
		contentPane.add(high);
		highest.setToolTipText("Player has brilliant performance in this metric");
		highest.setBackground(new Color(0, 128, 128));
		highest.setBounds(282, 253, 10, 15);
		
		contentPane.add(highest);
		nodata_1.setToolTipText("Metric has too Less Data to determine.");
		nodata_1.setBackground(Color.DARK_GRAY);
		nodata_1.setBounds(282, 305, 10, 15);
		
		contentPane.add(nodata_1);
		low_1.setToolTipText("Player has low performance in this metric.");
		low_1.setBackground(new Color(220, 20, 60));
		low_1.setBounds(282, 320, 10, 15);
		
		contentPane.add(low_1);
		avg_1.setToolTipText("Player has average performance in this metric.");
		avg_1.setBackground(Color.ORANGE);
		avg_1.setBounds(282, 335, 10, 15);
		
		contentPane.add(avg_1);
		high_1.setToolTipText("Player has high performance in this metric");
		high_1.setBackground(Color.GREEN);
		high_1.setBounds(282, 350, 10, 15);
		
		contentPane.add(high_1);
		highest_1.setToolTipText("Player has brilliant performance in this metric");
		highest_1.setBackground(new Color(0, 128, 128));
		highest_1.setBounds(282, 365, 10, 15);
		
		contentPane.add(highest_1);
		nodata_2.setToolTipText("Metric has too Less Data to determine.");
		nodata_2.setBackground(Color.DARK_GRAY);
		nodata_2.setBounds(282, 529, 10, 15);
		
		contentPane.add(nodata_2);
		low_2.setToolTipText("Player has low performance in this metric.");
		low_2.setBackground(new Color(220, 20, 60));
		low_2.setBounds(282, 544, 10, 15);
		
		contentPane.add(low_2);
		avg_2.setToolTipText("Player has average performance in this metric.");
		avg_2.setBackground(Color.ORANGE);
		avg_2.setBounds(282, 559, 10, 15);
		
		contentPane.add(avg_2);
		high_2.setToolTipText("Player has high performance in this metric");
		high_2.setBackground(Color.GREEN);
		high_2.setBounds(282, 574, 10, 15);
		
		contentPane.add(high_2);
		highest_2.setToolTipText("Player has brilliant performance in this metric");
		highest_2.setBackground(new Color(0, 128, 128));
		highest_2.setBounds(282, 589, 10, 15);
		
		contentPane.add(highest_2);
		nodata_3.setToolTipText("Metric has too Less Data to determine.");
		nodata_3.setBackground(Color.DARK_GRAY);
		nodata_3.setBounds(282, 415, 10, 15);
		
		contentPane.add(nodata_3);
		low_3.setToolTipText("Player has low performance in this metric.");
		low_3.setBackground(new Color(220, 20, 60));
		low_3.setBounds(282, 430, 10, 15);
		
		contentPane.add(low_3);
		avg_3.setToolTipText("Player has average performance in this metric.");
		avg_3.setBackground(Color.ORANGE);
		avg_3.setBounds(282, 445, 10, 15);
		
		contentPane.add(avg_3);
		high_3.setToolTipText("Player has high performance in this metric");
		high_3.setBackground(Color.GREEN);
		high_3.setBounds(282, 460, 10, 15);
		
		contentPane.add(high_3);
		highest_3.setToolTipText("Player has brilliant performance in this metric");
		highest_3.setBackground(new Color(0, 128, 128));
		highest_3.setBounds(282, 475, 10, 15);
		
		contentPane.add(highest_3);
		nodata_4.setToolTipText("Metric has too Less Data to determine.");
		nodata_4.setBackground(Color.DARK_GRAY);
		nodata_4.setBounds(1195, 193, 10, 15);
		
		contentPane.add(nodata_4);
		low_4.setToolTipText("Player has low performance in this metric.");
		low_4.setBackground(new Color(220, 20, 60));
		low_4.setBounds(1195, 208, 10, 15);
		
		contentPane.add(low_4);
		avg_4.setToolTipText("Player has average performance in this metric.");
		avg_4.setBackground(Color.ORANGE);
		avg_4.setBounds(1195, 223, 10, 15);
		
		contentPane.add(avg_4);
		high_4.setToolTipText("Player has high performance in this metric");
		high_4.setBackground(Color.GREEN);
		high_4.setBounds(1195, 238, 10, 15);
		
		contentPane.add(high_4);
		highest_4.setToolTipText("Player has brilliant performance in this metric");
		highest_4.setBackground(new Color(0, 128, 128));
		highest_4.setBounds(1195, 253, 10, 15);
		
		contentPane.add(highest_4);
		nodata_5.setToolTipText("Metric has too Less Data to determine.");
		nodata_5.setBackground(Color.DARK_GRAY);
		nodata_5.setBounds(1195, 415, 10, 15);
		
		contentPane.add(nodata_5);
		low_5.setToolTipText("Player has low performance in this metric.");
		low_5.setBackground(new Color(220, 20, 60));
		low_5.setBounds(1195, 430, 10, 15);
		
		contentPane.add(low_5);
		avg_5.setToolTipText("Player has average performance in this metric.");
		avg_5.setBackground(Color.ORANGE);
		avg_5.setBounds(1195, 445, 10, 15);
		
		contentPane.add(avg_5);
		high_5.setToolTipText("Player has high performance in this metric");
		high_5.setBackground(Color.GREEN);
		high_5.setBounds(1195, 460, 10, 15);
		
		contentPane.add(high_5);
		highest_5.setToolTipText("Player has brilliant performance in this metric");
		highest_5.setBackground(new Color(0, 128, 128));
		highest_5.setBounds(1195, 475, 10, 15);
		
		contentPane.add(highest_5);
		nodata_6.setToolTipText("Metric has too Less Data to determine.");
		nodata_6.setBackground(Color.DARK_GRAY);
		nodata_6.setBounds(1195, 529, 10, 15);
		
		contentPane.add(nodata_6);
		low_6.setToolTipText("Player has low performance in this metric.");
		low_6.setBackground(new Color(220, 20, 60));
		low_6.setBounds(1195, 544, 10, 15);
		
		contentPane.add(low_6);
		avg_6.setToolTipText("Player has average performance in this metric.");
		avg_6.setBackground(Color.ORANGE);
		avg_6.setBounds(1195, 559, 10, 15);
		
		contentPane.add(avg_6);
		high_6.setToolTipText("Player has high performance in this metric");
		high_6.setBackground(Color.GREEN);
		high_6.setBounds(1195, 574, 10, 15);
		
		contentPane.add(high_6);
		highest_6.setToolTipText("Player has brilliant performance in this metric");
		highest_6.setBackground(new Color(0, 128, 128));
		highest_6.setBounds(1195, 589, 10, 15);
		
		contentPane.add(highest_6);
		nodata_7.setToolTipText("Metric has too Less Data to determine.");
		nodata_7.setBackground(Color.DARK_GRAY);
		nodata_7.setBounds(1195, 305, 10, 15);
		
		contentPane.add(nodata_7);
		low_7.setToolTipText("Player has low performance in this metric.");
		low_7.setBackground(new Color(220, 20, 60));
		low_7.setBounds(1195, 320, 10, 15);
		
		contentPane.add(low_7);
		avg_7.setToolTipText("Player has average performance in this metric.");
		avg_7.setBackground(Color.ORANGE);
		avg_7.setBounds(1195, 335, 10, 15);
		
		contentPane.add(avg_7);
		high_7.setToolTipText("Player has high performance in this metric");
		high_7.setBackground(Color.GREEN);
		high_7.setBounds(1195, 350, 10, 15);
		
		contentPane.add(high_7);
		highest_7.setToolTipText("Player has brilliant performance in this metric");
		highest_7.setBackground(new Color(0, 128, 128));
		highest_7.setBounds(1195, 365, 10, 15);
		
		contentPane.add(highest_7);
		nodata_8.setToolTipText("Metric has too Less Data to determine.");
		nodata_8.setBackground(Color.DARK_GRAY);
		nodata_8.setBounds(894, 529, 10, 15);
		
		contentPane.add(nodata_8);
		low_8.setToolTipText("Player has low performance in this metric.");
		low_8.setBackground(new Color(220, 20, 60));
		low_8.setBounds(894, 544, 10, 15);
		
		contentPane.add(low_8);
		avg_8.setToolTipText("Player has average performance in this metric.");
		avg_8.setBackground(Color.ORANGE);
		avg_8.setBounds(894, 559, 10, 15);
		
		contentPane.add(avg_8);
		high_8.setToolTipText("Player has high performance in this metric");
		high_8.setBackground(Color.GREEN);
		high_8.setBounds(894, 574, 10, 15);
		
		contentPane.add(high_8);
		highest_8.setToolTipText("Player has brilliant performance in this metric");
		highest_8.setBackground(new Color(0, 128, 128));
		highest_8.setBounds(894, 589, 10, 15);
		
		contentPane.add(highest_8);
		nodata_9.setToolTipText("Metric has too Less Data to determine.");
		nodata_9.setBackground(Color.DARK_GRAY);
		nodata_9.setBounds(604, 529, 10, 15);
		
		contentPane.add(nodata_9);
		low_9.setToolTipText("Player has low performance in this metric.");
		low_9.setBackground(new Color(220, 20, 60));
		low_9.setBounds(604, 544, 10, 15);
		
		contentPane.add(low_9);
		avg_9.setToolTipText("Player has average performance in this metric.");
		avg_9.setBackground(Color.ORANGE);
		avg_9.setBounds(604, 559, 10, 15);
		
		contentPane.add(avg_9);
		high_9.setToolTipText("Player has high performance in this metric");
		high_9.setBackground(Color.GREEN);
		high_9.setBounds(604, 574, 10, 15);
		
		contentPane.add(high_9);
		highest_9.setToolTipText("Player has brilliant performance in this metric");
		highest_9.setBackground(new Color(0, 128, 128));
		highest_9.setBounds(604, 589, 10, 15);
		
		contentPane.add(highest_9);
		label.setBounds(381, 467, 390, -53);
		
		contentPane.add(label);
		PlayerPicture.setVerticalAlignment(SwingConstants.TOP);
		PlayerPicture.setHorizontalAlignment(SwingConstants.CENTER);
		PlayerPicture.setBounds(353, 129, 594, 361);
		
		contentPane.add(PlayerPicture);
		prole.setHorizontalAlignment(SwingConstants.TRAILING);
		prole.setForeground(new Color(192, 192, 192));
		prole.setFont(new Font("Jersey M54", Font.PLAIN, 49));
		prole.setBounds(833, 86, 372, 46);
		
		contentPane.add(prole);
				
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
		
		Nextb.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {			
			
				if(sel<address.length-1) {
				 sel++;
				 Player X = List.search(sel);
				 Pname.setText(X.name);
				 System.out.println("C:\\PowerPlay\\Labels\\Players_Big\\" +X.team + "\\" + X.name + ".png");
				 PlayerPicture.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Players_Big\\" +X.team + "\\" + X.name + ".png"));
				 Double Runs  = new Double(X.truns);
				 Double Balls = new Double(X.tballs);
				 Double CRuns = new Double(X.bruns);
				 Double BBalls= new Double(X.tbballs);
				 
				 double SR = (Runs/Balls)*100;	
				 double E  = (CRuns/(BBalls/6)); 
				 prole.setText(X.role);
				 
					Thread creatives = new Thread(new Runnable(){
						
						@Override
						public void run() {
				
							boolean[] check = new boolean[10];
							double use[] = {SR, E};
							
							if(BBalls == 0.0) {
								 use[1] = 0;
							 }
							
							double[] sum  = {0,0};
							int   [] sumi = {0,0,0,0,0,0,0,0};
							DecimalFormat x = new DecimalFormat("###.#");
							SRt.setText("000.0");
							SRp.setBackground(Color.DARK_GRAY);
							Et.setText("000.0");
							Ep.setBackground(Color.DARK_GRAY);
							RCt.setText("00000");
							RCp.setBackground(Color.DARK_GRAY);
							RMt.setText("00000");
							RMp.setBackground(Color.DARK_GRAY);
							BFt.setText("00000");
							BFp.setBackground(Color.DARK_GRAY);
							BDt.setText("00000");
							BDp.setBackground(Color.DARK_GRAY);
							SSt.setText("00000");
						    SSp.setBackground(Color.DARK_GRAY);
							FSt.setText("00000");
						    FSp.setBackground(Color.DARK_GRAY);
							Wt.setText("00000");
						    Wp.setBackground(Color.DARK_GRAY);
							NBWp.setBackground(Color.DARK_GRAY);
							NBWt.setText("00000");
							Wt.setText("00000");
						    Wp.setBackground(Color.DARK_GRAY);
							
							while(true) {
								
								//Strike Rate
								if(sum[0]<use[0]-1.3) {
								sum[0] = sum[0] + 1.1;
								SRt.setText(x.format(sum[0]));
								
								if(sum[0]>50.0) {
									SRp.setBackground(new Color(220, 20, 60));
								}
								if(sum[0]>80.0) {
									SRp.setBackground(Color.ORANGE);
								}
								if(sum[0]>110.0) {
									SRp.setBackground(Color.GREEN);
								}
								if(sum[0]>140.0) {
									SRp.setBackground(new Color(0,128,128));

								}
								}else {
                                     SRt.setText(x.format(use[0]));
                                     check[0] = true;
								}
								
								//Economy
								if(sum[1]<use[1]-0.1) {
								sum[1] = sum[1] + 0.07;
								Et.setText(new DecimalFormat("#.###").format(sum[1]));
								
								if(sum[1]<4.0) {
									Ep.setBackground(new Color(0,128,128));								}
								if(sum[1]>4.0) {
									Ep.setBackground(Color.GREEN);
								}
								if(sum[1]>6.00) {
									Ep.setBackground(Color.ORANGE);
								}
								if(sum[1]>8.0) {
									Ep.setBackground(new Color(220, 20, 60));
								}
								}else {

									Et.setText(new DecimalFormat("#.###").format(use[1]));
									check[1] = true;
								}
								
								//Runs
								if(sumi[0]<X.truns-3) {
								sumi[0] = sumi[0] + 5;
								RMt.setText(new DecimalFormat("#.###").format(sumi[0]));
								
								if(sumi[0]<2500) {
									RMp.setBackground(new Color(220, 20, 60));								}
								if(sumi[0]>2500) {
									RMp.setBackground(Color.ORANGE);
								}
								if(sumi[0]>5000) {
									RMp.setBackground(Color.GREEN);
								}
								if(sumi[0]>10000) {
									RMp.setBackground(new Color(0,128,128));
								}
								}else {
									RMt.setText(new DecimalFormat("#.###").format(X.truns));
									check[2] = true;
									RMp.setBackground(SRp.getBackground());
									
								}
								
								//Balls Faced
								if(sumi[1]<X.tballs-6) {
								sumi[1] = sumi[1] + 5;
								BFt.setText(new DecimalFormat("#.###").format(sumi[1]));
								
								if(sumi[1]<2500) {
									BFp.setBackground(new Color(220, 20, 60));								}
								if(sumi[1]>2500) {
									BFp.setBackground(Color.ORANGE);
								}
								if(sumi[1]>5000) {
									BFp.setBackground(Color.GREEN);
								}
								if(sumi[1]>10000) {
									BFp.setBackground(new Color(0,128,128));
								}
								}else {
									BFt.setText(new DecimalFormat("#.###").format(X.tballs));
									BFp.setBackground(SRp.getBackground());
									check[3] = true;		
								}
								
								//Fours
								if(sumi[2]<X.fours) {
								sumi[2] = sumi[2] + 1;
								FSt.setText(new DecimalFormat("#.###").format(sumi[2]));
								
								if(sumi[2]<25) {
									FSp.setBackground(new Color(220, 20, 60));								}
								if(sumi[2]>25) {
									FSp.setBackground(Color.ORANGE);
								}
								if(sumi[2]>125) {
									FSp.setBackground(Color.GREEN);
								}
								if(sumi[2]>250) {
									FSp.setBackground(new Color(0,128,128));
								}
								}else {
									FSt.setText(new DecimalFormat("#.###").format(X.fours));
									check[4] = true;		
								}
								
								//Sixes
								if(sumi[3]<X.sixes) {
								sumi[3] = sumi[3] + 1;
								SSt.setText(new DecimalFormat("#.###").format(sumi[3]));
								
								if(sumi[3]<25) {
									SSp.setBackground(new Color(220, 20, 60));								}
								if(sumi[3]>25) {
									SSp.setBackground(Color.ORANGE);
								}
								if(sumi[3]>125) {
									SSp.setBackground(Color.GREEN);
								}
								if(sumi[3]>250) {
									SSp.setBackground(new Color(0,128,128));
								}
								}else {
									SSt.setText(new DecimalFormat("#.###").format(X.sixes));
									check[5] = true;		
								}
								
								//Balls Delivered
								if(sumi[4]<X.tbballs-4) {
								sumi[4] = sumi[4] + 3;
								BDt.setText(new DecimalFormat("#.###").format(sumi[4]));
								
								if(sumi[4]<600) {
									BDp.setBackground(new Color(220, 20, 60));								}
								if(sumi[4]>1200) {
									BDp.setBackground(Color.ORANGE);
								}
								if(sumi[4]>1800) {
									BDp.setBackground(Color.GREEN);
								}
								if(sumi[4]>3000) {
									BDp.setBackground(new Color(0,128,128));
								}
								}else {
									BDt.setText(new DecimalFormat("#.###").format(X.tbballs));
									check[6] = true;
									BDp.setBackground(Ep.getBackground());
								}
								
								//Wickets
								if(sumi[5]<X.twickets-1) {
								sumi[5] = sumi[5] + 1;
								Wt.setText(new DecimalFormat("#.###").format(sumi[5]));
								
								if(sumi[5]<60) {
									Wp.setBackground(new Color(220, 20, 60));								}
								if(sumi[5]>120) {
									Wp.setBackground(Color.ORANGE);
								}
								if(sumi[5]>180) {
									Wp.setBackground(Color.GREEN);
								}
								if(sumi[5]>300) {
									Wp.setBackground(new Color(0,128,128));
								}
								}else {
									Wt.setText(new DecimalFormat("#.###").format(X.twickets));
									check[7] = true;		
								}
								
								//Runs Conceded
								if(sumi[6]<X.bruns-1) {
								sumi[6] = sumi[6] + 1;
								RCt.setText(new DecimalFormat("#.###").format(sumi[6]));
								
								if(sumi[6]<1000) {
									RCp.setBackground(new Color(0,128,128));								}
								if(sumi[6]>2500) {
									RCp.setBackground(Color.GREEN);
								}
								if(sumi[6]>5000) {
									RCp.setBackground(Color.ORANGE);
								}
								if(sumi[6]>7500) {
									RCp.setBackground(new Color(220, 20, 60));
								}
								}else {
									RCt.setText(new DecimalFormat("#.###").format(X.bruns));
									check[8] = true;
									RCp.setBackground(Ep.getBackground());
								}
								
								//No Balls & Wides
								if(sumi[7]<X.wides+X.noballs-1) {
								sumi[7] = sumi[7] + 1;
								NBWt.setText(new DecimalFormat("#.###").format(sumi[7]));
								
								if(sumi[7]<300) {
									NBWp.setBackground(new Color(0,128,128));								}
								if(sumi[7]>300) {
									NBWp.setBackground(Color.GREEN);
								}
								if(sumi[7]>500) {
									NBWp.setBackground(Color.ORANGE);
								}
								if(sumi[7]>750) {
									NBWp.setBackground(new Color(220, 20, 60));
								}
								}else {
									NBWt.setText(new DecimalFormat("#.###").format(X.wides + X.noballs));
									check[9] = true;		
								}
								                              
								
								if(check[0] == true && check[1] == true && check[2] == true && check[3] == true && check[4] == true && check[5] == true && check[6] == true && check[7] == true && check[8] == true && check[9] == true ) {
									break;
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

				
				if(sel>-1) {
				 sel--;
				 Player X = List.search(sel);
				 PlayerPicture.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Players_Big\\" +X.team + "\\" + X.name + ".png"));
				 Pname.setText(X.name);
				 Double Runs  = new Double(X.truns);
				 Double Balls = new Double(X.tballs);
				 Double CRuns = new Double(X.bruns);
				 Double BBalls= new Double(X.tbballs);
				 
				 double SR = (Runs/Balls)*100;	
				 double E  = (CRuns/(BBalls/6)); 
				 prole.setText(X.role);
				 
					Thread creatives = new Thread(new Runnable(){
						
						@Override
						public void run() {
				
							boolean[] check = new boolean[10];
							double use[] = {SR, E};
							
							if(BBalls == 0.0) {
								 use[1] = 0;
							 }
							if(Balls == 0.0) {
								 use[0] = 0;
							 }
							
							double[] sum  = {0,0};
							int   [] sumi = {0,0,0,0,0,0,0,0};
							DecimalFormat x = new DecimalFormat("###.#");
							SRt.setText("000.0");
							SRp.setBackground(Color.DARK_GRAY);
							RMt.setText("00000");
							RMp.setBackground(Color.DARK_GRAY);
							Et.setText("000.0");
							Ep.setBackground(Color.DARK_GRAY);
							RCt.setText("00000");
							RCp.setBackground(Color.DARK_GRAY);
							BFt.setText("00000");
							BFp.setBackground(Color.DARK_GRAY);
							BDt.setText("00000");
							BDp.setBackground(Color.DARK_GRAY);
							SSt.setText("00000");
						    SSp.setBackground(Color.DARK_GRAY);
							FSt.setText("00000");
						    FSp.setBackground(Color.DARK_GRAY);
							Wt.setText("00000");
						    Wp.setBackground(Color.DARK_GRAY);
							NBWp.setBackground(Color.DARK_GRAY);
							NBWt.setText("00000");
							Wt.setText("00000");
						    Wp.setBackground(Color.DARK_GRAY);
							
							while(true) {
								
								//Strike Rate
								if(sum[0]<use[0]-1.3) {
								sum[0] = sum[0] + 1.1;
								SRt.setText(x.format(sum[0]));
								
								if(sum[0]>50.0) {
									SRp.setBackground(new Color(220, 20, 60));
								}
								if(sum[0]>80.0) {
									SRp.setBackground(Color.ORANGE);
								}
								if(sum[0]>110.0) {
									SRp.setBackground(Color.GREEN);
								}
								if(sum[0]>140.0) {
									SRp.setBackground(new Color(0,128,128));
								}
								if(sum[0]>599.9) {
									SRt.setText(x.format(use[0]));
                                    check[0] = true;
								}
								}else {
                                     SRt.setText(x.format(use[0]));
                                     check[0] = true;
								}
								
								//Economy
								if(sum[1]<use[1]-0.1) {
								sum[1] = sum[1] + 0.07;
								Et.setText(new DecimalFormat("#.###").format(sum[1]));
								
								if(sum[1]<4.0) {
									Ep.setBackground(new Color(0,128,128));								}
								if(sum[1]>4.0) {
									Ep.setBackground(Color.GREEN);
								}
								if(sum[1]>6.0) {
									Ep.setBackground(Color.ORANGE);
								}
								if(sum[1]>8.0) {
									Ep.setBackground(new Color(220, 20, 60));
								}
								if(sum[1]>42.0) {
									Ep.setBackground(Color.BLACK);
									check[1] = true;
								}
								}else {

									Et.setText(new DecimalFormat("#.###").format(use[1]));
									check[1] = true;
								}
								
								//Runs
								if(sumi[0]<X.truns-3) {
								sumi[0] = sumi[0] + 5;
								RMt.setText(new DecimalFormat("#.###").format(sumi[0]));
								
								if(sumi[0]<2500) {
									RMp.setBackground(new Color(220, 20, 60));								}
								if(sumi[0]>2500) {
									RMp.setBackground(Color.ORANGE);
								}
								if(sumi[0]>5000) {
									RMp.setBackground(Color.GREEN);
								}
								if(sumi[0]>10000) {
									RMp.setBackground(new Color(0,128,128));
								}
								}else {
									RMt.setText(new DecimalFormat("#.###").format(X.truns));
									check[2] = true;
									RMp.setBackground(SRp.getBackground());
								}
								
								//Balls Faced
								if(sumi[1]<X.tballs-6) {
								sumi[1] = sumi[1] + 5;
								BFt.setText(new DecimalFormat("#.###").format(sumi[1]));
								
								if(sumi[1]<2500) {
									BFp.setBackground(new Color(220, 20, 60));								}
								if(sumi[1]>2500) {
									BFp.setBackground(Color.ORANGE);
								}
								if(sumi[1]>5000) {
									BFp.setBackground(Color.GREEN);
								}
								if(sumi[1]>10000) {
									BFp.setBackground(new Color(0,128,128));
								}
								}else {
									BFt.setText(new DecimalFormat("#.###").format(X.tballs));
									check[3] = true;	
									BFp.setBackground(SRp.getBackground());
								}
								
								//Fours
								if(sumi[2]<X.fours) {
								sumi[2] = sumi[2] + 1;
								FSt.setText(new DecimalFormat("#.###").format(sumi[2]));
								
								if(sumi[2]<25) {
									FSp.setBackground(new Color(220, 20, 60));								}
								if(sumi[2]>50) {
									FSp.setBackground(Color.ORANGE);
								}
								if(sumi[2]>125) {
									FSp.setBackground(Color.GREEN);
								}
								if(sumi[2]>250) {
									FSp.setBackground(new Color(0,128,128));
								}
								}else {
									FSt.setText(new DecimalFormat("#.###").format(X.fours));
									check[4] = true;		
								}
								
								//Sixes
								if(sumi[3]<X.sixes) {
								sumi[3] = sumi[3] + 1;
								SSt.setText(new DecimalFormat("#.###").format(sumi[3]));
								
								if(sumi[3]<25) {
									SSp.setBackground(new Color(220, 20, 60));								}
								if(sumi[3]>25) {
									SSp.setBackground(Color.ORANGE);
								}
								if(sumi[3]>125) {
									SSp.setBackground(Color.GREEN);
								}
								if(sumi[3]>250) {
									SSp.setBackground(new Color(0,128,128));
								}
								}else {
									SSt.setText(new DecimalFormat("#.###").format(X.sixes));
									check[5] = true;		
								}
								
								//Balls Delivered
								if(sumi[4]<X.tbballs-4) {
								sumi[4] = sumi[4] + 3;
								BDt.setText(new DecimalFormat("#.###").format(sumi[4]));
								
								if(sumi[4]<600) {
									BDp.setBackground(new Color(220, 20, 60));								}
								if(sumi[4]>1200) {
									BDp.setBackground(Color.ORANGE);
								}
								if(sumi[4]>1800) {
									BDp.setBackground(Color.GREEN);
								}
								if(sumi[4]>3000) {
									BDp.setBackground(new Color(0,128,128));
								}
								}else {
									BDt.setText(new DecimalFormat("#.###").format(X.tbballs));
									check[6] = true;	
									BDp.setBackground(Ep.getBackground());
								}
								
								//Wickets
								if(sumi[5]<X.twickets-1) {
								sumi[5] = sumi[5] + 1;
								Wt.setText(new DecimalFormat("#.###").format(sumi[5]));
								
								if(sumi[5]<60) {
									Wp.setBackground(new Color(220, 20, 60));								}
								if(sumi[5]>120) {
									Wp.setBackground(Color.ORANGE);
								}
								if(sumi[5]>180) {
									Wp.setBackground(Color.GREEN);
								}
								if(sumi[5]>300) {
									Wp.setBackground(new Color(0,128,128));
								}
								}else {
									Wt.setText(new DecimalFormat("#.###").format(X.twickets));
									check[7] = true;		
								}
								
								//Runs Conceded
								if(sumi[6]<X.bruns-1) {
								sumi[6] = sumi[6] + 1;
								RCt.setText(new DecimalFormat("#.###").format(sumi[6]));
								
								if(sumi[6]<1000) {
									RCp.setBackground(new Color(0,128,128));								}
								if(sumi[6]>2500) {
									RCp.setBackground(Color.GREEN);
								}
								if(sumi[6]>5000) {
									RCp.setBackground(Color.ORANGE);
								}
								if(sumi[6]>7500) {
									RCp.setBackground(new Color(220, 20, 60));
								}
								}else {
									RCt.setText(new DecimalFormat("#.###").format(X.bruns));
									check[8] = true;	
									RCp.setBackground(Ep.getBackground());
								}
								
								//No Balls & Wides
								if(sumi[7]<X.wides+X.noballs-1) {
								sumi[7] = sumi[7] + 1;
								NBWt.setText(new DecimalFormat("#.###").format(sumi[7]));
								
								if(sumi[7]<300) {
									NBWp.setBackground(new Color(0,128,128));								}
								if(sumi[7]>300) {
									NBWp.setBackground(Color.GREEN);
								}
								if(sumi[7]>500) {
									NBWp.setBackground(Color.ORANGE);
								}
								if(sumi[7]>750) {
									NBWp.setBackground(new Color(220, 20, 60));
								}
								}else {
									NBWt.setText(new DecimalFormat("#.###").format(X.wides + X.noballs));
									check[9] = true;		
								}
								                              
								
								if(check[0] == true && check[1] == true && check[2] == true && check[3] == true && check[4] == true && check[5] == true && check[6] == true && check[7] == true && check[8] == true && check[9] == true ) {
									break;
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
			public void mouseEntered(MouseEvent e) {
				Prevb.setForeground(Color.WHITE);
				Prevp.setBackground(Color.BLACK);
			}
			public void mouseExited(MouseEvent e) {
				Prevb.setForeground(Color.BLACK);
				Prevp.setBackground(Color.WHITE);
			}
		});
	}
}
