import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import javax.sound.sampled.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.awt.Font;

public class MainMenu extends JFrame implements ActionListener {
	
	boolean sound = true;
	
	static class Audio{
		
		long current;
		Clip X;
		String filepath;
		
		AudioInputStream read;
		
		Audio(){
			
			try{
				
				String[] A = {"Morphine.wav", "Heroes.wav"};
								
				read= AudioSystem.getAudioInputStream(new File("C:\\PowerPlay\\Audio\\"+A[1]).getAbsoluteFile());
				X = AudioSystem.getClip();
				X.open(read);
				X.loop(X.LOOP_CONTINUOUSLY);
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		void play() {
			X.start();
		}
		void stop() {
			X.stop();
		}
		
	}


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenu frame = new MainMenu();
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
	private final JLabel creditb = new JLabel("Credits");
	private final JPanel creditp = new JPanel();
	private final JPanel Teams = new JPanel();
	private final JPanel Analytics = new JPanel();
	private final JPanel Tournaments = new JPanel();
	private final JPanel Database = new JPanel();
	private final JLabel apphelper = new JLabel("Welcome to PowerPlay!");
	private final JPanel shh = new JPanel();
	private final JLabel Analyticsb = new JLabel("New label");
	private final JLabel Teamsb = new JLabel("");
	private final JLabel tournamentsb = new JLabel("");
	private final JLabel databaseb = new JLabel("New label");
	private final JPanel ahp = new JPanel();
	private final JLabel ah = new JLabel("- Includes Graphing systems that display detailed Statistics and Form");
	private final JLabel database = new JLabel("- Includes MatchMaker, PlayerMaker and Database Refresher");
	private final JPanel databasep_1 = new JPanel();
	private final JLabel tourinfo = new JLabel("- Includes MatchViewer and Indepth Match Statistics");
	private final JPanel tourinfop = new JPanel();
	
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
	
	public MainMenu() {

		setResizable(false);
		setTitle("MainMenu");
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
		creditp.setBounds(1081, 569, 148, 46);
		
		contentPane.add(creditp);
		creditp.setLayout(null);
		creditb.setForeground(new Color(220, 20, 60));
		creditb.setBounds(0, 0, 148, 46);
		creditp.add(creditb);
		creditb.setFont(new Font("Exo 2 Light", Font.PLAIN, 41));
		creditb.setHorizontalAlignment(SwingConstants.CENTER);
		Teams.setBackground(new Color(192, 192, 192));
		Teams.setBounds(35, 71, 550, 200);
		
		contentPane.add(Teams);
		Teams.setLayout(null);
		Teamsb.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Selections\\TV.png"));
		Teamsb.setBounds(0, 0, 550, 200);
		
		Teams.add(Teamsb);
		Analytics.setBackground(new Color(192, 192, 192));
		Analytics.setBounds(35, 339, 550, 200);
		
		contentPane.add(Analytics);
		Analytics.setLayout(null);
		Analyticsb.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Selections\\A.png"));
		Analyticsb.setBounds(0, 0, 550, 200);
		
		Analytics.add(Analyticsb);
		Tournaments.setBackground(new Color(192, 192, 192));
		Tournaments.setBounds(679, 71, 550, 200);
		
		contentPane.add(Tournaments);
		Tournaments.setLayout(null);
		tournamentsb.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Selections\\TOUR.png"));
		tournamentsb.setBounds(0, 0, 550, 200);
		
		Tournaments.add(tournamentsb);
		Database.setBackground(new Color(192, 192, 192));
		Database.setBounds(679, 339, 550, 200);
		
		contentPane.add(Database);
		Database.setLayout(null);
		databaseb.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Selections\\DB.png"));
		databaseb.setBounds(0, 0, 550, 200);
		
		Database.add(databaseb);
		apphelper.setFont(new Font("Exo 2 Light", Font.PLAIN, 17));
		apphelper.setForeground(Color.GRAY);
		apphelper.setBounds(35, 584, 1005, 27);
		
		contentPane.add(apphelper);
		shh.setBackground(Color.WHITE);
		shh.setBounds(1034, 588, 47, 27);
		
		contentPane.add(shh);
		shh.setLayout(null);
		
		JLabel shhb = new JLabel("Shhh!");
		shhb.setHorizontalAlignment(SwingConstants.CENTER);
		shhb.setFont(new Font("Exo 2 Light", Font.PLAIN, 14));
		shhb.setBounds(0, 0, 46, 27);
		shh.add(shhb);
		
		JPanel teamhp = new JPanel();
		teamhp.setBackground(new Color(192, 192, 192));
		teamhp.setBounds(35, 297, 550, 2);
		contentPane.add(teamhp);
		
		JLabel teamh = new JLabel("- Includes TeamViewer, PlayerViewer and Color-Coded Statistcs!");
		teamh.setForeground(new Color(128, 128, 128));
		teamh.setFont(new Font("Exo 2 Light", Font.PLAIN, 16));
		teamh.setBounds(35, 272, 550, 27);
		contentPane.add(teamh);
		ahp.setBackground(new Color(192, 192, 192));
		ahp.setBounds(35, 564, 550, 2);
		
		contentPane.add(ahp);
		ah.setForeground(Color.GRAY);
		ah.setFont(new Font("Exo 2 Light", Font.PLAIN, 16));
		ah.setBounds(35, 539, 550, 27);
		
		contentPane.add(ah);
		database.setForeground(Color.GRAY);
		database.setFont(new Font("Exo 2 Light", Font.PLAIN, 16));
		database.setBounds(679, 539, 550, 27);
		
		contentPane.add(database);
		databasep_1.setBackground(new Color(192, 192, 192));
		databasep_1.setBounds(679, 564, 550, 2);
		
		contentPane.add(databasep_1);
		tourinfo.setForeground(Color.GRAY);
		tourinfo.setFont(new Font("Exo 2 Light", Font.PLAIN, 16));
		tourinfo.setBounds(679, 272, 550, 27);
		
		contentPane.add(tourinfo);
		tourinfop.setBackground(new Color(192, 192, 192));
		tourinfop.setBounds(679, 297, 550, 2);
		
		contentPane.add(tourinfop);
		
		teamh.setVisible(false);
		database.setVisible(false);
		ah.setVisible(false);
		ahp.setVisible(false);
		tourinfo.setVisible(false);
		tourinfop.setVisible(false);
		databasep_1.setVisible(false);
		teamhp.setVisible(false);
		
		tm.start();
		
		Audio music = new Audio();
		music.play();
		
		Thread barsizer = new Thread(new Runnable(){
			
			@Override
			public void run() {
				boolean checker = true;
				
				while(true) {
					
					if(ahp.getWidth() > 549) {
						checker = false;
					}else if(ahp.getWidth() < 175) {
						checker = true;
					}
					
					if(!checker) {
						
						try {
						Thread.sleep(20);
						}catch(Exception e) {
							//If code encounters any error it, the program must say text in blue
							System.out.println("Dank Farrik!");
						}
						ahp.setBounds(35,564,ahp.getWidth()-1,2);
						tourinfop.setBounds(679,297,tourinfop.getWidth()-1,2);
						databasep_1.setBounds(679,564,databasep_1.getWidth()-1,2);
						teamhp.setBounds(35,297,teamhp.getWidth()-1,2);
						
					}else {
						try {
						Thread.sleep(20);
						}catch(Exception e) {
							//If code encounters any error it, the program must say text in blue
							System.out.println("Dank Farrik!");
						}
						ahp.setBounds(35,564,ahp.getWidth()+1,2);
						tourinfop.setBounds(679,297,tourinfop.getWidth()+1,2);
						databasep_1.setBounds(679,564,databasep_1.getWidth()+1,2);
						teamhp.setBounds(35,297,teamhp.getWidth()+1,2);
					}
					
				}
			}
			
		});
		
		barsizer.start();
		
		Analyticsb.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				StatTrak X = new StatTrak();
				X.setVisible(true);
				music.stop();
				dispose();
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				Analyticsb.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Selections\\A1.png"));
				apphelper.setText("Use sophisticated tools to analyze players and teams!");
				ah.setVisible(true);
				ahp.setVisible(true);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				apphelper.setText("Welcome to PowerPlay!");
				Analyticsb.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Selections\\A.png"));
				ah.setVisible(false);
				ahp.setVisible(false);
			}
		});
		
		tournamentsb.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MatchViewer A = new MatchViewer();
				A.setVisible(true);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				tournamentsb.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Selections\\TOUR1.png"));
				apphelper.setText("View matches stored in the PowerPlay Database!");
				tourinfo.setVisible(true);
				tourinfop.setVisible(true);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				apphelper.setText("Welcome to PowerPlay!");
				tournamentsb.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Selections\\TOUR.png"));
				tourinfo.setVisible(false);
				tourinfop.setVisible(false);
			}
		});
		
		databaseb.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DBStuff X = new DBStuff();
				X.setVisible(true);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				databaseb.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Selections\\DB_1.png"));
				apphelper.setText("Inquire about Database and make additions to it");
				database.setVisible(true);
				databasep_1.setVisible(true);

			}
			@Override
			public void mouseExited(MouseEvent e) {
				apphelper.setText("Welcome to PowerPlay!");
				databaseb.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Selections\\DB.png"));
				database.setVisible(false);
				databasep_1.setVisible(false);
			}
		});
		
		shhb.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
				if(sound) {
					music.stop();
					
					sound = false;
				}else {
					music.play();
					sound = true;
				}
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				shhb.setForeground(Color.WHITE);
				shh.setBackground(Color.BLACK);
				if(sound) {
				apphelper.setText("Turn menu music off!");
				}else {
					apphelper.setText("Turn menu music on!");
				}
			}
			@Override
			public void mouseExited(MouseEvent e) {
				shhb.setForeground(Color.BLACK);
				shh.setBackground(Color.WHITE);
				apphelper.setText("Welcome to PowerPlay!");
				
			}
		});
		
		Teamsb.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Teamviewer X = new Teamviewer();
				X.setVisible(true);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				Teamsb.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Selections\\TV1.png"));
				apphelper.setText("View teams and players stored in the PowerPlay Database!");
				teamh.setVisible(true);
				teamhp.setVisible(true);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				apphelper.setText("Welcome to PowerPlay!");
				Teamsb.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Selections\\TV.png"));
				teamh.setVisible(false);
				teamhp.setVisible(false);
			}
		});
		
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
			apphelper.setText("Muhammad Saad Karim | Zohair Abbas | Nabeel Mirza ");	
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
	}
}
