
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
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class StatTrak extends JFrame implements ActionListener {

	boolean a,b,c,d;
    int sel = 0;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StatTrak frame = new StatTrak();
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
	private final JLabel creditb = new JLabel("Exit");
	private final JPanel creditp = new JPanel();
	private final JPanel Tournaments = new JPanel();
	private final JLabel apphelper = new JLabel("Welcome to PowerPlay!");
	private final JLabel tournamentsb = new JLabel("-");
	private final JLabel F = new JLabel("Features");
	private final JLabel ind = new JLabel("INDIVIDUAL");
	private final JLabel ind3d = new JLabel("INDIVIDUAL");
	
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
	
	public StatTrak() {

		F.setVisible(false);
		setResizable(false);
		setTitle("PowerPlay Analytics");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
		creditp.setBackground(new Color(255, 255, 255));
		creditp.setBounds(1145, 569, 84, 46);
		
		contentPane.add(creditp);
		creditp.setLayout(null);
		creditb.setForeground(new Color(220, 20, 60));
		creditb.setBounds(0, 0, 84, 46);
		creditp.add(creditb);
		creditb.setFont(new Font("Exo 2 Light", Font.PLAIN, 41));
		creditb.setHorizontalAlignment(SwingConstants.CENTER);
		Tournaments.setBackground(new Color(248, 248, 255));
		Tournaments.setBounds(679, 71, 550, 200);
		
		contentPane.add(Tournaments);
		Tournaments.setLayout(null);
		tournamentsb.setBounds(0, 0, 540, 200);
		
		Tournaments.add(tournamentsb);
		apphelper.setFont(new Font("Exo 2 Light", Font.PLAIN, 18));
		apphelper.setForeground(Color.GRAY);
		apphelper.setBounds(35, 584, 1005, 27);
		
		contentPane.add(apphelper);
		F.setFont(new Font("Exo 2 Medium", Font.PLAIN, 24));
		F.setHorizontalAlignment(SwingConstants.LEFT);
		F.setBounds(679, 269, 550, 32);
		
		contentPane.add(F);
		ind.setFont(new Font("Exo 2 Light", Font.PLAIN, 42));
		ind.setBounds(91, 168, 225, 65);
		
		contentPane.add(ind);
		ind3d.setForeground(new Color(220, 220, 220));
		ind3d.setFont(new Font("Exo 2 Light", Font.PLAIN, 42));
		ind3d.setBounds(101, 184, 235, 65);
		
		contentPane.add(ind3d);
		
		JLabel ply = new JLabel("PLAYERS");
		ply.setFont(new Font("Exo 2 Light", Font.PLAIN, 42));
		ply.setBounds(91, 369, 225, 65);
		contentPane.add(ply);
		
		JLabel ply3d = new JLabel("PLAYERS");
		ply3d.setForeground(new Color(220, 220, 220));
		ply3d.setFont(new Font("Exo 2 Light", Font.PLAIN, 42));
		ply3d.setBounds(101, 385, 235, 65);
		contentPane.add(ply3d);
		
		JLabel cmp = new JLabel("COMPARATOR");
		cmp.setFont(new Font("Exo 2 Light", Font.PLAIN, 42));
		cmp.setBounds(91, 478, 286, 65);
		contentPane.add(cmp);
		
		JLabel cmp3d = new JLabel("COMPARATOR");
		cmp3d.setForeground(new Color(220, 220, 220));
		cmp3d.setFont(new Font("Exo 2 Light", Font.PLAIN, 42));
		cmp3d.setBounds(101, 494, 276, 65);
		contentPane.add(cmp3d);
		
		JLabel team = new JLabel("TEAMS");
		team.setFont(new Font("Exo 2 Light", Font.PLAIN, 42));
		team.setBounds(91, 260, 225, 65);
		contentPane.add(team);
		
		JLabel team3d = new JLabel("TEAMS");
		team3d.setForeground(new Color(220, 220, 220));
		team3d.setFont(new Font("Exo 2 Light", Font.PLAIN, 42));
		team3d.setBounds(101, 276, 235, 65);
		contentPane.add(team3d);
		
		JLabel selhelper = new JLabel("-\r\n");
		selhelper.setVerticalAlignment(SwingConstants.TOP);
		selhelper.setForeground(new Color(192, 192, 192));
		selhelper.setFont(new Font("Exo 2 Medium", Font.PLAIN, 16));
		selhelper.setBounds(679, 303, 585, 255);
		contentPane.add(selhelper);
		
		JPanel creditp_1 = new JPanel();
		creditp_1.setLayout(null);
		creditp_1.setBackground(Color.WHITE);
		creditp_1.setBounds(1051, 569, 84, 46);
		contentPane.add(creditp_1);
		
		JLabel go = new JLabel("Go");
		go.setHorizontalAlignment(SwingConstants.CENTER);
		go.setForeground(new Color(47, 79, 79));
		go.setFont(new Font("Exo 2 Light", Font.PLAIN, 41));
		go.setBounds(0, 0, 84, 46);
		creditp_1.add(go);
				
		tm.start();
		
		go.setVisible(false);
		cmp3d.setVisible(false);
		ply3d.setVisible(false);
		ind3d.setVisible(false);
		team3d.setVisible(false);
		creditb.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				creditb.setForeground(Color.WHITE);
				creditp.setBackground(new Color(220, 20, 60));
				apphelper.setText("Get to know the creators of this project!");
			}
			public void mouseExited(MouseEvent e) {
				creditb.setForeground(new Color(220, 20, 60));
				creditp.setBackground(Color.WHITE);
				apphelper.setText("Welcome to PowerPlay!");
			}
			public void mouseClicked(MouseEvent e) {
				dispose();
				MainMenu X = new MainMenu();
				X.setVisible(true);
			}
		});
		
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

		ind.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				if(a == false) {
				ind3d.setVisible(true);
				if(!a && !b && !c && !d) {
				tournamentsb.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Selections\\IR.png"));
				}
				};
			}
			@Override
			public void mouseExited(MouseEvent e) {
				ind3d.setVisible(false);
				if(!a && !b && !c && !d) {
				tournamentsb.setIcon(null);
				}
			}
			public void mouseClicked(MouseEvent e) {
				sel = 0;
				go.setVisible(true);
				ind3d.setVisible(false);
				selhelper.setText("<html>-Player Batting Form (Strike Rate) + Best Fit <br>\r\n-Player Batting Form (Fours) + Best Fit<br>\r\n-Player Batting Form (Sixes) + Best Fit<br>\r\n-Player Batting Form (Boundaries) + Best Fit<br>\r\n-Player Batsman Endurance (Balls Faced) + Best Fit <br>\r\n-Player Bowling Form (Economy) + Best Fit<br>\r\n-Player Bowling Form (Wickets) + Best Fit <br>\r\n-Player Bowling Form (Runs Conceded) + Best Fit<br>\r\n<br>\r\nSelect yourself or your favorite player and graph to see current form, whatever may it be. Includes almost 15 modes that analyze a player's performance to depth using user selected matches.");
				F.setVisible(true);
				ind.setForeground(Color.GREEN);
				cmp.setForeground(Color.BLACK);
				team.setForeground(Color.BLACK);
				ply.setForeground(Color.BLACK);
				tournamentsb.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Selections\\IR1.png"));
				a = true;
				b = false;
				c = false;
			    d = false;
			}
		});
		ply.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				if(c == false) {
				ply3d.setVisible(true);
				
				if(!a && !b && !c && !d) {
				tournamentsb.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Selections\\PR.png"));
				}
				};
			}
			@Override
			public void mouseExited(MouseEvent e) {
				ply3d.setVisible(false);
				if(!a && !b && !c && !d) {
				tournamentsb.setIcon(null);
				}
			}
			public void mouseClicked(MouseEvent e) {
				sel = 1;
				go.setVisible(true);
				ply3d.setVisible(false);
				selhelper.setText("<html>-Average Batsman Strike Rate <br>\r\n-Average Bowler Economy <br>\r\n-Average Bowler Wickets (Overs) <br>\r\n-Average Bowler Wickets (Matches) <br>\r\n-Average Batsmen Fours <br>\r\n-Average Batsmen Sixes <br>\r\n-Average Batsmen Boundaries <br>\r\n<br>\r\nPit your selected players against each other and compare their average metric<br>\r\ngraphically. Includes color coded lines, refrences and refrences helpers for better\r\nvision.\r\n");
				F.setVisible(true);
				ply.setForeground(Color.GREEN);
				ind.setForeground(Color.BLACK);
				cmp.setForeground(Color.BLACK);
				team.setForeground(Color.BLACK);
				tournamentsb.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Selections\\PR1.png"));
				a = false;
				b = false;
				c = true;
			    d = false;
			}
		});
		
		team.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				if(b == false) {
				team3d.setVisible(true);
				if(!a && !b && !c && !d) {
				tournamentsb.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Selections\\TR.png"));
				}
				};
			}
			@Override
			public void mouseExited(MouseEvent e) {
				team3d.setVisible(false);
				if(!a && !b && !c && !d) {
				tournamentsb.setIcon(null);
				}
			}
			public void mouseClicked(MouseEvent e) {
				sel =2;
				go.setVisible(true);
				team3d.setVisible(false);
				selhelper.setText("<html>-Average Team Runs Scored <br>\r\n-Average Team Balls Faced <br>\r\n-Average Team Wickets Taken <br>\r\n-Average Team Fours <br>\r\n-Average Team Sixes  <br>\r\n-Average Team Boundaries <br>\r\n<br>\r\nAnalyze, compare and obtain information as to what makes certain teams better than other's by using 6 included modes that expand to 12 modes for a more specfic and precise analysis.");
				F.setVisible(true);
				team.setForeground(Color.GREEN);
				ind.setForeground(Color.BLACK);
				cmp.setForeground(Color.BLACK);
				ply.setForeground(Color.BLACK);
				tournamentsb.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Selections\\TR1.png"));
				a = false;
				b = true;
				c = false;
			    d = false;
			}
		});
		
		cmp.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				if(d == false) {
				cmp3d.setVisible(true);
				if(!a && !b && !c && !d) {
				tournamentsb.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Selections\\4C.png"));
				}
				};
			}
			@Override
			public void mouseExited(MouseEvent e) {
				cmp3d.setVisible(false);
				if(!a && !b && !c && !d) {
				tournamentsb.setIcon(null);
				}
				
			}
			public void mouseClicked(MouseEvent e) {
				
				sel = 3;
				go.setVisible(true);
				cmp3d.setVisible(false);
				F.setVisible(true);
				selhelper.setText("<html>-Professional Mode <br>\r\n<br>\r\nA lightweight comparator that compares upto 4 players' most common statistcs. Along with Color Representations.<br>\r\n<br>\r\nProfessional mode is also supplied, which removes colors from certain elements to make program visually easier to view. With Professional Mode, PowerPlay can be used to show quick differences between main statistics of players and at the same time make them compatible for office/corporate use. ");
				cmp.setForeground(Color.GREEN);
				ind.setForeground(Color.BLACK);
				team.setForeground(Color.BLACK);
				ply.setForeground(Color.BLACK);
				tournamentsb.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Selections\\4C1.png"));
				a = false;
				b = false;
				c = false;
			    d = true;
			}
		});
		
		go.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				go.setForeground(Color.WHITE);
				creditp_1.setBackground(new Color(47,79,79));
				apphelper.setText("Get to know the creators of this project!");
			}
			public void mouseExited(MouseEvent e) {
				go.setForeground(new Color(47,79,79));
				creditp_1.setBackground(Color.WHITE);
				apphelper.setText("Welcome to PowerPlay!");
			}
			public void mouseClicked(MouseEvent e) {
				if(sel == 0) {
					StatTrakIndie A = new StatTrakIndie();
					A.setVisible(true);
				}else if(sel == 1) {
					StatTrakPlayerG A = new StatTrakPlayerG();
					A.setVisible(true);
				}else if(sel == 2) {
					StatTrakTeams A = new StatTrakTeams();
					A.setVisible(true);
				}else if(sel == 3) {
					RaspberryConstruction A = new RaspberryConstruction();
					A.setVisible(true);
				}
			}
		});
	}
}
