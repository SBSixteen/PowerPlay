import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;

public class RaspberryConstruction extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RaspberryConstruction frame = new RaspberryConstruction();
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
	public RaspberryConstruction() {
		
		int[] choice = new int[4];
		
		for (int i = 0; i < choice.length; i++) {
			choice[i] = -1;
		}
		
		setResizable(false);
		setTitle("PowerPlay Grapher v0.4");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 494, 340);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox T = new JComboBox();
		T.setFont(new Font("Exo 2 Light", Font.PLAIN, 16));
		T.setBounds(10, 38, 150, 22);
		contentPane.add(T);
		
		JLabel lblNewLabel_1 = new JLabel("Team");
		lblNewLabel_1.setForeground(new Color(255, 215, 0));
		lblNewLabel_1.setFont(new Font("Exo 2 Light", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(10, 11, 108, 30);
		contentPane.add(lblNewLabel_1);
		
		JComboBox T_1 = new JComboBox();
		T_1.setFont(new Font("Exo 2 Light", Font.PLAIN, 16));
		T_1.setBounds(10, 90, 150, 22);
		contentPane.add(T_1);
		
		JComboBox T_2 = new JComboBox();
		T_2.setFont(new Font("Exo 2 Light", Font.PLAIN, 16));
		T_2.setBounds(10, 144, 150, 22);
		contentPane.add(T_2);
		
		JComboBox T_3 = new JComboBox();
		T_3.setFont(new Font("Exo 2 Light", Font.PLAIN, 16));
		T_3.setBounds(10, 195, 150, 22);
		contentPane.add(T_3);
		
		JComboBox P = new JComboBox();
		P.setFont(new Font("Exo 2 Light", Font.PLAIN, 16));
		P.setBounds(243, 38, 183, 22);
		contentPane.add(P);
		
		JComboBox P_1 = new JComboBox();
		P_1.setFont(new Font("Exo 2 Light", Font.PLAIN, 16));
		P_1.setBounds(243, 90, 183, 22);
		contentPane.add(P_1);
		
		JComboBox P_2 = new JComboBox();
		P_2.setFont(new Font("Exo 2 Light", Font.PLAIN, 16));
		P_2.setBounds(243, 144, 183, 22);
		contentPane.add(P_2);
		
		JComboBox P_3 = new JComboBox();
		P_3.setFont(new Font("Exo 2 Light", Font.PLAIN, 16));
		P_3.setBounds(243, 195, 183, 22);
		contentPane.add(P_3);
		
		JPanel ip = new JPanel();
		ip.setBackground(Color.WHITE);
		ip.setBounds(170, 38, 63, 22);
		contentPane.add(ip);
		ip.setLayout(null);
		
		JLabel ub = new JLabel("Update");
		ub.setForeground(new Color(255, 215, 0));
		ub.setHorizontalAlignment(SwingConstants.CENTER);
		ub.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		ub.setBounds(0, 0, 63, 22);
		ip.add(ub);
		
		JPanel ip_1 = new JPanel();
		ip_1.setBackground(Color.WHITE);
		ip_1.setLayout(null);
		ip_1.setBounds(170, 90, 63, 22);
		contentPane.add(ip_1);
		
		JLabel ub_1 = new JLabel("Update");
		ub_1.setForeground(new Color(220, 20, 60));
		ub_1.setHorizontalAlignment(SwingConstants.CENTER);
		ub_1.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		ub_1.setBounds(0, 0, 63, 22);
		ip_1.add(ub_1);
		
		JPanel ip_2 = new JPanel();
		ip_2.setBackground(Color.WHITE);
		ip_2.setLayout(null);
		ip_2.setBounds(170, 144, 63, 22);
		contentPane.add(ip_2);
		
		JLabel ub_2 = new JLabel("Update");
		ub_2.setForeground(new Color(30, 144, 255));
		ub_2.setHorizontalAlignment(SwingConstants.CENTER);
		ub_2.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		ub_2.setBounds(0, 0, 63, 22);
		ip_2.add(ub_2);
		
		JPanel ip_3 = new JPanel();
		ip_3.setBackground(Color.WHITE);
		ip_3.setLayout(null);
		ip_3.setBounds(170, 195, 63, 22);
		contentPane.add(ip_3);
		
		JLabel ub_3 = new JLabel("Update");
		ub_3.setForeground(new Color(0, 255, 0));
		ub_3.setHorizontalAlignment(SwingConstants.CENTER);
		ub_3.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		ub_3.setBounds(0, 0, 63, 22);
		ip_3.add(ub_3);
		
		JLabel lblNewLabel_1_1 = new JLabel("Player");
		lblNewLabel_1_1.setForeground(new Color(255, 215, 0));
		lblNewLabel_1_1.setFont(new Font("Exo 2 Light", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(241, 11, 108, 30);
		contentPane.add(lblNewLabel_1_1);
		
		JPanel dp = new JPanel();
		dp.setBackground(new Color(255, 255, 255));
		dp.setBounds(10, 261, 322, 39);
		contentPane.add(dp);
		dp.setLayout(null);
		
		JLabel draw = new JLabel("Draw");
		draw.setForeground(new Color(47, 79, 79));

		draw.setFont(new Font("Exo 2 Light", Font.PLAIN, 25));
		draw.setHorizontalAlignment(SwingConstants.CENTER);
		draw.setBounds(0, 0, 322, 39);
		dp.add(draw);
		
		JPanel bp = new JPanel();
		bp.setBackground(new Color(255, 255, 255));
		bp.setBounds(342, 261, 127, 39);
		contentPane.add(bp);
		bp.setLayout(null);
		
		JLabel back = new JLabel("Back");
		back.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			dispose();
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				
				back.setForeground(Color.WHITE);
				bp.setBackground(new Color(220, 20, 60));
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				back.setForeground(new Color(220, 20, 60));
				bp.setBackground(Color.WHITE);
			}
		});
		back.setForeground(new Color(220, 20, 60));
		back.setFont(new Font("Exo 2 Light", Font.PLAIN, 25));
		back.setHorizontalAlignment(SwingConstants.CENTER);
		back.setBounds(0, 0, 127, 39);
		bp.add(back);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(436, 38, 33, 22);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel x = new JLabel("x");
		x.setForeground(new Color(255, 215, 0));
		x.setBackground(new Color(220, 20, 60));
		x.setFont(new Font("Exo 2 Light", Font.BOLD, 16));
		x.setHorizontalAlignment(SwingConstants.CENTER);
		x.setBounds(0, 0, 33, 22);
		panel.add(x);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(436, 90, 33, 22);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel x_1 = new JLabel("x");
		x_1.setHorizontalAlignment(SwingConstants.CENTER);
		x_1.setForeground(new Color(220, 20, 60));
		x_1.setFont(new Font("Exo 2 Light", Font.BOLD, 16));
		x_1.setBackground(new Color(220, 20, 60));
		x_1.setBounds(0, 0, 33, 22);
		panel_1.add(x_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(436, 144, 33, 22);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel x_2 = new JLabel("x");
		x_2.setHorizontalAlignment(SwingConstants.CENTER);
		x_2.setForeground(new Color(30, 144, 255));
		x_2.setFont(new Font("Exo 2 Light", Font.BOLD, 16));
		x_2.setBackground(new Color(220, 20, 60));
		x_2.setBounds(0, 0, 33, 22);
		panel_2.add(x_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(436, 195, 33, 22);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel x_3 = new JLabel("x");
		x_3.setHorizontalAlignment(SwingConstants.CENTER);
		x_3.setForeground(new Color(0, 255, 0));
		x_3.setFont(new Font("Exo 2 Light", Font.BOLD, 16));
		x_3.setBackground(new Color(220, 20, 60));
		x_3.setBounds(0, 0, 33, 22);
		panel_3.add(x_3);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Player");
		lblNewLabel_1_1_1.setForeground(new Color(220, 20, 60));
		lblNewLabel_1_1_1.setFont(new Font("Exo 2 Light", Font.PLAIN, 20));
		lblNewLabel_1_1_1.setBounds(241, 62, 108, 30);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Team");
		lblNewLabel_1_2.setForeground(new Color(220, 20, 60));
		lblNewLabel_1_2.setFont(new Font("Exo 2 Light", Font.PLAIN, 20));
		lblNewLabel_1_2.setBounds(10, 62, 108, 30);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Player");
		lblNewLabel_1_1_1_1.setForeground(new Color(30, 144, 255));
		lblNewLabel_1_1_1_1.setFont(new Font("Exo 2 Light", Font.PLAIN, 20));
		lblNewLabel_1_1_1_1.setBounds(241, 115, 108, 30);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Team");
		lblNewLabel_1_2_1.setForeground(new Color(30, 144, 255));
		lblNewLabel_1_2_1.setFont(new Font("Exo 2 Light", Font.PLAIN, 20));
		lblNewLabel_1_2_1.setBounds(10, 115, 108, 30);
		contentPane.add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Player");
		lblNewLabel_1_1_1_1_1.setForeground(new Color(0, 255, 0));
		lblNewLabel_1_1_1_1_1.setFont(new Font("Exo 2 Light", Font.PLAIN, 20));
		lblNewLabel_1_1_1_1_1.setBounds(241, 166, 108, 30);
		contentPane.add(lblNewLabel_1_1_1_1_1);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("Team");
		lblNewLabel_1_2_1_1.setForeground(new Color(0, 255, 0));
		lblNewLabel_1_2_1_1.setFont(new Font("Exo 2 Light", Font.PLAIN, 20));
		lblNewLabel_1_2_1_1.setBounds(10, 166, 108, 30);
		contentPane.add(lblNewLabel_1_2_1_1);
		
		JCheckBox promode = new JCheckBox("Professional Mode (Grays out all entities)",false);
		promode.setFont(new Font("Exo 2 Medium", Font.PLAIN, 15));
		promode.setBackground(new Color(255, 255, 255));
		promode.setBounds(10, 224, 459, 23);
		contentPane.add(promode);
		
		JComboBox[] Teams = {T, T_1, T_2, T_3};
        JComboBox[] Players = {P, P_1, P_2, P_3};
		String[] Tlist = new File("C:\\PowerPlay\\Players\\").list();
		JLabel[] u  = {ub, ub_1, ub_2, ub_3};
		JPanel[] Ip = {ip, ip_1, ip_2, ip_3};
		
		for (int i = 0; i< Teams.length;i++) {	
			Teams[i].setModel(new DefaultComboBoxModel(Tlist));	
			Teams[i].setSelectedIndex(-1);
		}		
		
		Color A = u[0].getForeground();
		Color B = u[1].getForeground();
		Color C = u[2].getForeground();
		Color D = u[3].getForeground();
		
		u[0].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				choice[0] = Teams[0].getSelectedIndex();

			if(Teams[0].getSelectedIndex()>-1) {
				
				String[] PList = new File("C:\\PowerPlay\\Players\\"+ Teams[0].getSelectedItem() + "\\").list();
				
				for(int i =0;i<PList.length;i++) {
					
					int index = PList[i].indexOf(".txt"); 
					PList[i] = PList[i].substring(0, index);
				    
				}
				
				Players[0].setModel(new DefaultComboBoxModel(PList));
				Players[0].setSelectedIndex(-1);
			}
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				u[0].setForeground(Color.WHITE);
				Ip[0].setBackground(A);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				u[0].setForeground(A);
				Ip[0].setBackground(Color.WHITE);
			}
		});
		
		u[1].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if(Teams[1].getSelectedIndex()>-1) {
					choice[1] = Teams[1].getSelectedIndex();
				String[] PList = new File("C:\\PowerPlay\\Players\\"+ Teams[1].getSelectedItem() + "\\").list();
				for(int i =0;i<PList.length;i++) {
					
					int index = PList[i].indexOf(".txt"); 
					PList[i] = PList[i].substring(0, index);
				    
				}
				
				Players[1].setModel(new DefaultComboBoxModel(PList));
				Players[1].setSelectedIndex(-1);
				}
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				u[1].setForeground(Color.WHITE);
				Ip[1].setBackground(B);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				u[1].setForeground(B);
				Ip[1].setBackground(Color.WHITE);
			}
		});
		u[2].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if(Teams[2].getSelectedIndex()>-1) {
					choice[2] = Teams[2].getSelectedIndex();
				String[] PList = new File("C:\\PowerPlay\\Players\\"+ Teams[2].getSelectedItem() + "\\").list();
				for(int i =0;i<PList.length;i++) {
					
					int index = PList[i].indexOf(".txt"); 
					PList[i] = PList[i].substring(0, index);
				    
				}
				
				Players[2].setModel(new DefaultComboBoxModel(PList));
				Players[2].setSelectedIndex(-1);
				}
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				u[2].setForeground(Color.WHITE);
				Ip[2].setBackground(C);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				u[2].setForeground(C);
				Ip[2].setBackground(Color.WHITE);
			}
		});
		
		u[3].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if(Teams[3].getSelectedIndex()>-1) {
					choice[3] = Teams[3].getSelectedIndex();
				String[] PList = new File("C:\\PowerPlay\\Players\\"+ Teams[3].getSelectedItem() + "\\").list();
				for(int i =0;i<PList.length;i++) {
					
					int index = PList[i].indexOf(".txt"); 
					PList[i] = PList[i].substring(0, index);
				    
				}
				
				Players[3].setModel(new DefaultComboBoxModel(PList));	
				Players[3].setSelectedIndex(-1);
				}
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				u[3].setForeground(Color.WHITE);
				Ip[3].setBackground(D);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				u[3].setForeground(D);
				Ip[3].setBackground(Color.WHITE);
			}
		});
	

		JLabel[] xb = {x, x_1, x_2, x_3};
		JPanel[] xp = {panel, panel_1, panel_2, panel_3};
		
		xb[0].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				xb[0].setForeground(Color.WHITE);
				xp[0].setBackground(A);
				
			}
			public void mouseExited(MouseEvent e) {
				
				xb[0].setForeground(A);
				xp[0].setBackground(Color.WHITE);
				
			}public void mouseClicked(MouseEvent e) {
				
				Players[0].setSelectedIndex(-1);
				
			}
			
		});
		
		xb[01].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				xb[01].setForeground(Color.WHITE);
				xp[01].setBackground(B);
				
			}
			public void mouseExited(MouseEvent e) {
				
				xb[01].setForeground(B);
				xp[01].setBackground(Color.WHITE);
				
			}public void mouseClicked(MouseEvent e) {
				
				Players[01].setSelectedIndex(-1);
				
			}
			
		});
		
		xb[02].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				xb[02].setForeground(Color.WHITE);
				xp[02].setBackground(C);
				
			}
			public void mouseExited(MouseEvent e) {
				
				xb[02].setForeground(C);
				xp[02].setBackground(Color.WHITE);
				
			}public void mouseClicked(MouseEvent e) {
				
				Players[02].setSelectedIndex(-1);
				
			}
			
		});
		
		xb[03].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				xb[03].setForeground(Color.WHITE);
				xp[03].setBackground(D);
				
			}
			public void mouseExited(MouseEvent e) {
				
				xb[03].setForeground(D);
				xp[03].setBackground(Color.WHITE);
				
			}public void mouseClicked(MouseEvent e) {
				
				Players[03].setSelectedIndex(-1);
				
			}
			
		});
		
		draw.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				dp.setBackground(new Color(47, 79, 79));
				draw.setForeground(Color.WHITE);			
			}
			@Override
			public void mouseExited(MouseEvent e) {
				
				dp.setBackground(Color.WHITE);
				draw.setForeground(new Color(47, 79, 79));
				
			}
			@Override
			public void mouseClicked(MouseEvent e) {

				PlayerLL use = new PlayerLL();
				PlayerReader Read = new PlayerReader();
				for(int i =0; i<u.length;i++) {
					
					if(Teams[i].getSelectedIndex() == -1 || Players[i].getSelectedIndex() == -1) {
						use.insert(null);
					}else {
						use.insert(Read.read((String) Teams[i].getSelectedItem(),(String) Players[i].getSelectedItem()));
					}
					
				}
				
				if(promode.isSelected()) {
					raspberry a = new raspberry(use, false);
					a.setVisible(true);
				}else {
					raspberry a = new raspberry(use, true);
					a.setVisible(true);
				}
				
			}
		});
		
		
				
	  }
	}

