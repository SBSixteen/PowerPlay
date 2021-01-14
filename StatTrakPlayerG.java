import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.io.File;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;

public class StatTrakPlayerG extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StatTrakPlayerG frame = new StatTrakPlayerG();
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
	public StatTrakPlayerG() {
		
		int[] choice = new int[9];
		
		for (int i = 0; i < choice.length; i++) {
			choice[i] = -1;
		}
		
		setResizable(false);
		setTitle("PowerPlay Grapher v0.4");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 494, 490);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Metric");
		lblNewLabel.setFont(new Font("Exo 2 Light", Font.PLAIN, 18));
		lblNewLabel.setBounds(10, 11, 124, 22);
		contentPane.add(lblNewLabel);
		
		JComboBox type = new JComboBox();
		type.setModel(new DefaultComboBoxModel(new String[] {"Average Batsman Strike Rate", "Average Bowler Economy", "Average Bowler Wickets (Overs)", "Average Bowler Wickets (Matches)", "Average Batsmen Fours", "Average Batsmen Sixes", "Average Batsmen Boundaries"}));
		type.setFont(new Font("Exo 2 Light", Font.PLAIN, 14));
		type.setBounds(10, 37, 416, 25);
		contentPane.add(type);
		
		JComboBox T = new JComboBox();
		T.setFont(new Font("Exo 2 Light", Font.PLAIN, 16));
		T.setBounds(10, 111, 150, 22);
		contentPane.add(T);
		
		JLabel lblNewLabel_1 = new JLabel("Team");
		lblNewLabel_1.setFont(new Font("Exo 2 Light", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(10, 70, 108, 30);
		contentPane.add(lblNewLabel_1);
		
		JComboBox T_1 = new JComboBox();
		T_1.setFont(new Font("Exo 2 Light", Font.PLAIN, 16));
		T_1.setBounds(10, 144, 150, 22);
		contentPane.add(T_1);
		
		JComboBox T_2 = new JComboBox();
		T_2.setFont(new Font("Exo 2 Light", Font.PLAIN, 16));
		T_2.setBounds(10, 177, 150, 22);
		contentPane.add(T_2);
		
		JComboBox T_3 = new JComboBox();
		T_3.setFont(new Font("Exo 2 Light", Font.PLAIN, 16));
		T_3.setBounds(10, 210, 150, 22);
		contentPane.add(T_3);
		
		JComboBox T_4 = new JComboBox();
		T_4.setFont(new Font("Exo 2 Light", Font.PLAIN, 16));
		T_4.setBounds(10, 243, 150, 22);
		contentPane.add(T_4);
		
		JComboBox T_5 = new JComboBox();
		T_5.setFont(new Font("Exo 2 Light", Font.PLAIN, 16));
		T_5.setBounds(10, 276, 150, 22);
		contentPane.add(T_5);
		
		JComboBox T_6 = new JComboBox();
		T_6.setFont(new Font("Exo 2 Light", Font.PLAIN, 16));
		T_6.setBounds(10, 309, 150, 22);
		contentPane.add(T_6);
		
		JComboBox T_7 = new JComboBox();
		T_7.setFont(new Font("Exo 2 Light", Font.PLAIN, 16));
		T_7.setBounds(10, 342, 150, 22);
		contentPane.add(T_7);
		
		JComboBox T_8 = new JComboBox();
		T_8.setFont(new Font("Exo 2 Light", Font.PLAIN, 16));
		T_8.setBounds(10, 375, 150, 22);
		contentPane.add(T_8);
		
		JComboBox P = new JComboBox();
		P.setFont(new Font("Exo 2 Light", Font.PLAIN, 16));
		P.setBounds(243, 111, 183, 22);
		contentPane.add(P);
		
		JComboBox P_1 = new JComboBox();
		P_1.setFont(new Font("Exo 2 Light", Font.PLAIN, 16));
		P_1.setBounds(243, 144, 183, 22);
		contentPane.add(P_1);
		
		JComboBox P_2 = new JComboBox();
		P_2.setFont(new Font("Exo 2 Light", Font.PLAIN, 16));
		P_2.setBounds(243, 177, 183, 22);
		contentPane.add(P_2);
		
		JComboBox P_3 = new JComboBox();
		P_3.setFont(new Font("Exo 2 Light", Font.PLAIN, 16));
		P_3.setBounds(243, 210, 183, 22);
		contentPane.add(P_3);
		
		JComboBox P_4 = new JComboBox();
		P_4.setFont(new Font("Exo 2 Light", Font.PLAIN, 16));
		P_4.setBounds(243, 243, 183, 22);
		contentPane.add(P_4);
		
		JComboBox P_5 = new JComboBox();
		P_5.setFont(new Font("Exo 2 Light", Font.PLAIN, 16));
		P_5.setBounds(243, 276, 183, 22);
		contentPane.add(P_5);
		
		JComboBox P_6 = new JComboBox();
		P_6.setFont(new Font("Exo 2 Light", Font.PLAIN, 16));
		P_6.setBounds(243, 309, 183, 22);
		contentPane.add(P_6);
		
		JComboBox P_7 = new JComboBox();
		P_7.setFont(new Font("Exo 2 Light", Font.PLAIN, 16));
		P_7.setBounds(243, 342, 183, 22);
		contentPane.add(P_7);
		
		JComboBox P_8 = new JComboBox();
		P_8.setFont(new Font("Exo 2 Light", Font.PLAIN, 16));
		P_8.setBounds(243, 375, 183, 22);
		contentPane.add(P_8);
		
		JPanel ip = new JPanel();
		ip.setBackground(Color.WHITE);
		ip.setBounds(170, 111, 63, 22);
		contentPane.add(ip);
		ip.setLayout(null);
		
		JLabel ub = new JLabel("Update");
		ub.setHorizontalAlignment(SwingConstants.CENTER);
		ub.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		ub.setBounds(0, 0, 63, 22);
		ip.add(ub);
		
		JPanel ip_1 = new JPanel();
		ip_1.setBackground(Color.WHITE);
		ip_1.setLayout(null);
		ip_1.setBounds(170, 144, 63, 22);
		contentPane.add(ip_1);
		
		JLabel ub_1 = new JLabel("Update");
		ub_1.setHorizontalAlignment(SwingConstants.CENTER);
		ub_1.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		ub_1.setBounds(0, 0, 63, 22);
		ip_1.add(ub_1);
		
		JPanel ip_2 = new JPanel();
		ip_2.setBackground(Color.WHITE);
		ip_2.setLayout(null);
		ip_2.setBounds(170, 177, 63, 22);
		contentPane.add(ip_2);
		
		JLabel ub_2 = new JLabel("Update");
		ub_2.setHorizontalAlignment(SwingConstants.CENTER);
		ub_2.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		ub_2.setBounds(0, 0, 63, 22);
		ip_2.add(ub_2);
		
		JPanel ip_3 = new JPanel();
		ip_3.setBackground(Color.WHITE);
		ip_3.setLayout(null);
		ip_3.setBounds(170, 210, 63, 22);
		contentPane.add(ip_3);
		
		JLabel ub_3 = new JLabel("Update");
		ub_3.setHorizontalAlignment(SwingConstants.CENTER);
		ub_3.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		ub_3.setBounds(0, 0, 63, 22);
		ip_3.add(ub_3);
		
		JPanel ip_4 = new JPanel();
		ip_4.setBackground(Color.WHITE);
		ip_4.setLayout(null);
		ip_4.setBounds(170, 243, 63, 22);
		contentPane.add(ip_4);
		
		JLabel ub_4 = new JLabel("Update");
		ub_4.setHorizontalAlignment(SwingConstants.CENTER);
		ub_4.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		ub_4.setBounds(0, 0, 63, 22);
		ip_4.add(ub_4);
		
		JPanel ip_5 = new JPanel();
		ip_5.setBackground(Color.WHITE);
		ip_5.setLayout(null);
		ip_5.setBounds(170, 276, 63, 22);
		contentPane.add(ip_5);
		
		JLabel ub_5 = new JLabel("Update");
		ub_5.setHorizontalAlignment(SwingConstants.CENTER);
		ub_5.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		ub_5.setBounds(0, 0, 63, 22);
		ip_5.add(ub_5);
		
		JPanel ip_6 = new JPanel();
		ip_6.setBackground(Color.WHITE);
		ip_6.setLayout(null);
		ip_6.setBounds(170, 309, 63, 22);
		contentPane.add(ip_6);
		
		JLabel ub_6 = new JLabel("Update");
		ub_6.setHorizontalAlignment(SwingConstants.CENTER);
		ub_6.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		ub_6.setBounds(0, 0, 63, 22);
		ip_6.add(ub_6);
		
		JPanel ip_7 = new JPanel();
		ip_7.setBackground(Color.WHITE);
		ip_7.setLayout(null);
		ip_7.setBounds(170, 342, 63, 22);
		contentPane.add(ip_7);
		
		JLabel ub_7 = new JLabel("Update");
		ub_7.setHorizontalAlignment(SwingConstants.CENTER);
		ub_7.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		ub_7.setBounds(0, 0, 63, 22);
		ip_7.add(ub_7);
		
		JPanel ip_8 = new JPanel();
		ip_8.setBackground(Color.WHITE);
		ip_8.setLayout(null);
		ip_8.setBounds(170, 375, 63, 22);
		contentPane.add(ip_8);
		
		JLabel ub_8 = new JLabel("Update");
		ub_8.setHorizontalAlignment(SwingConstants.CENTER);
		ub_8.setFont(new Font("Exo 2 Light", Font.PLAIN, 13));
		ub_8.setBounds(0, 0, 63, 22);
		ip_8.add(ub_8);
		
		JLabel lblNewLabel_1_1 = new JLabel("Player");
		lblNewLabel_1_1.setFont(new Font("Exo 2 Light", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(241, 70, 108, 30);
		contentPane.add(lblNewLabel_1_1);
		
		JPanel dp = new JPanel();
		dp.setBackground(new Color(255, 255, 255));
		dp.setBounds(10, 408, 322, 39);
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
		bp.setBounds(342, 408, 127, 39);
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
		panel.setBounds(436, 111, 33, 22);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel x = new JLabel("x");
		x.setForeground(new Color(220, 20, 60));
		x.setBackground(new Color(220, 20, 60));
		x.setFont(new Font("Exo 2 Light", Font.BOLD, 16));
		x.setHorizontalAlignment(SwingConstants.CENTER);
		x.setBounds(0, 0, 33, 22);
		panel.add(x);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(436, 144, 33, 22);
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
		panel_2.setBounds(436, 177, 33, 22);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel x_2 = new JLabel("x");
		x_2.setHorizontalAlignment(SwingConstants.CENTER);
		x_2.setForeground(new Color(220, 20, 60));
		x_2.setFont(new Font("Exo 2 Light", Font.BOLD, 16));
		x_2.setBackground(new Color(220, 20, 60));
		x_2.setBounds(0, 0, 33, 22);
		panel_2.add(x_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(436, 210, 33, 22);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel x_3 = new JLabel("x");
		x_3.setHorizontalAlignment(SwingConstants.CENTER);
		x_3.setForeground(new Color(220, 20, 60));
		x_3.setFont(new Font("Exo 2 Light", Font.BOLD, 16));
		x_3.setBackground(new Color(220, 20, 60));
		x_3.setBounds(0, 0, 33, 22);
		panel_3.add(x_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.WHITE);
		panel_4.setBounds(436, 243, 33, 22);
		contentPane.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel x_4 = new JLabel("x");
		x_4.setHorizontalAlignment(SwingConstants.CENTER);
		x_4.setForeground(new Color(220, 20, 60));
		x_4.setFont(new Font("Exo 2 Light", Font.BOLD, 16));
		x_4.setBackground(new Color(220, 20, 60));
		x_4.setBounds(0, 0, 33, 22);
		panel_4.add(x_4);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.WHITE);
		panel_5.setBounds(436, 276, 33, 22);
		contentPane.add(panel_5);
		panel_5.setLayout(null);
		
		JLabel x_5 = new JLabel("x");
		x_5.setHorizontalAlignment(SwingConstants.CENTER);
		x_5.setForeground(new Color(220, 20, 60));
		x_5.setFont(new Font("Exo 2 Light", Font.BOLD, 16));
		x_5.setBackground(new Color(220, 20, 60));
		x_5.setBounds(0, 0, 33, 22);
		panel_5.add(x_5);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(Color.WHITE);
		panel_6.setBounds(436, 309, 33, 22);
		contentPane.add(panel_6);
		panel_6.setLayout(null);
		
		JLabel x_6 = new JLabel("x");
		x_6.setHorizontalAlignment(SwingConstants.CENTER);
		x_6.setForeground(new Color(220, 20, 60));
		x_6.setFont(new Font("Exo 2 Light", Font.BOLD, 16));
		x_6.setBackground(new Color(220, 20, 60));
		x_6.setBounds(0, 0, 33, 22);
		panel_6.add(x_6);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(Color.WHITE);
		panel_7.setBounds(436, 342, 33, 22);
		contentPane.add(panel_7);
		panel_7.setLayout(null);
		
		JLabel x_7 = new JLabel("x");
		x_7.setHorizontalAlignment(SwingConstants.CENTER);
		x_7.setForeground(new Color(220, 20, 60));
		x_7.setFont(new Font("Exo 2 Light", Font.BOLD, 16));
		x_7.setBackground(new Color(220, 20, 60));
		x_7.setBounds(0, 0, 33, 22);
		panel_7.add(x_7);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(Color.WHITE);
		panel_8.setBounds(436, 375, 33, 22);
		contentPane.add(panel_8);
		panel_8.setLayout(null);
		
		JLabel x_8 = new JLabel("x");
		x_8.setHorizontalAlignment(SwingConstants.CENTER);
		x_8.setForeground(new Color(220, 20, 60));
		x_8.setFont(new Font("Exo 2 Light", Font.BOLD, 16));
		x_8.setBackground(new Color(220, 20, 60));
		x_8.setBounds(0, 0, 33, 22);
		panel_8.add(x_8);
		
		JComboBox[] Teams = {T, T_1, T_2, T_3, T_4, T_5, T_6, T_7, T_8};
        JComboBox[] Players = {P, P_1, P_2, P_3, P_4, P_5, P_6, P_7, P_8};
		String[] Tlist = new File("C:\\PowerPlay\\Players\\").list();
		JLabel[] u  = {ub, ub_1, ub_2, ub_3, ub_4, ub_5, ub_6, ub_7, ub_8};
		JPanel[] Ip = {ip, ip_1, ip_2, ip_3, ip_4, ip_5, ip_6, ip_7, ip_8};
		
		for (int i = 0; i< Teams.length;i++) {	
			Teams[i].setModel(new DefaultComboBoxModel(Tlist));	
			Teams[i].setSelectedIndex(-1);
		}		
		
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
				Ip[0].setBackground(Color.BLACK);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				u[0].setForeground(Color.BLACK);
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
				Ip[1].setBackground(Color.BLACK);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				u[1].setForeground(Color.BLACK);
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
				Ip[2].setBackground(Color.BLACK);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				u[2].setForeground(Color.BLACK);
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
				Ip[3].setBackground(Color.BLACK);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				u[3].setForeground(Color.BLACK);
				Ip[3].setBackground(Color.WHITE);
			}
		});
		
		u[4].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if(Teams[4].getSelectedIndex()>-1) {
					choice[4] = Teams[4].getSelectedIndex();
				String[] PList = new File("C:\\PowerPlay\\Players\\"+ Teams[4].getSelectedItem() + "\\").list();
				for(int i =0;i<PList.length;i++) {
					
					int index = PList[i].indexOf(".txt"); 
					PList[i] = PList[i].substring(0, index);
				}
				    
				
				
				Players[4].setModel(new DefaultComboBoxModel(PList));	
				Players[4].setSelectedIndex(-1);
				}
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				u[4].setForeground(Color.WHITE);
				Ip[4].setBackground(Color.BLACK);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				u[4].setForeground(Color.BLACK);
				Ip[4].setBackground(Color.WHITE);
			}
		});
		
		u[5].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if(Teams[5].getSelectedIndex()>-1) {
					choice[5] = Teams[5].getSelectedIndex();
				String[] PList = new File("C:\\PowerPlay\\Players\\"+ Teams[5].getSelectedItem() + "\\").list();
				for(int i =0;i<PList.length;i++) {
					
					int index = PList[i].indexOf(".txt"); 
					PList[i] = PList[i].substring(0, index);
				    
				}
				
				Players[5].setModel(new DefaultComboBoxModel(PList));	
				Players[5].setSelectedIndex(-1);
				}
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				u[5].setForeground(Color.WHITE);
				Ip[5].setBackground(Color.BLACK);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				u[5].setForeground(Color.BLACK);
				Ip[5].setBackground(Color.WHITE);
			}
		});
		
		u[6].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if(Teams[6].getSelectedIndex()>-1) {
					choice[6] = Teams[6].getSelectedIndex();
				String[] PList = new File("C:\\PowerPlay\\Players\\"+ Teams[6].getSelectedItem() + "\\").list();
				for(int i =0;i<PList.length;i++) {
					
					int index = PList[i].indexOf(".txt"); 
					PList[i] = PList[i].substring(0, index);
				    
				}
				
				Players[6].setModel(new DefaultComboBoxModel(PList));	
				Players[6].setSelectedIndex(-1);
				}
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				u[6].setForeground(Color.WHITE);
				Ip[6].setBackground(Color.BLACK);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				u[6].setForeground(Color.BLACK);
				Ip[6].setBackground(Color.WHITE);
			}
		});
		
		u[7].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if(Teams[7].getSelectedIndex()>-1) {
					choice[7] = Teams[7].getSelectedIndex();
				String[] PList = new File("C:\\PowerPlay\\Players\\"+ Teams[7].getSelectedItem() + "\\").list();
				for(int i =0;i<PList.length;i++) {
					
					int index = PList[i].indexOf(".txt"); 
					PList[i] = PList[i].substring(0, index);
				    
				}
				
				Players[7].setModel(new DefaultComboBoxModel(PList));
				Players[7].setSelectedIndex(-1);
				}
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				u[7].setForeground(Color.WHITE);
				Ip[7].setBackground(Color.BLACK);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				u[7].setForeground(Color.BLACK);
				Ip[7].setBackground(Color.WHITE);
			}
		});
		
		u[8].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if(Teams[8].getSelectedIndex()>-1) {
					choice[8] = Teams[8].getSelectedIndex();
				String[] PList = new File("C:\\PowerPlay\\Players\\"+ Teams[8].getSelectedItem() + "\\").list();
				for(int i =0;i<PList.length;i++) {
					
					int index = PList[i].indexOf(".txt"); 
					PList[i] = PList[i].substring(0, index);
				    
				}
				
				Players[8].setModel(new DefaultComboBoxModel(PList));	
				Players[8].setSelectedIndex(-1);
				}
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				u[8].setForeground(Color.WHITE);
				Ip[8].setBackground(Color.BLACK);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				u[8].setForeground(Color.BLACK);
				Ip[8].setBackground(Color.WHITE);
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
				
				int mode = type.getSelectedIndex();
				
				PlayerReader Read = new PlayerReader();
				PlayerLL List = new PlayerLL();
				for(int i =0; i<9; i++) {
					
					if(choice[i] >-1 && Players[i].getSelectedIndex() >-1) {
					Player insertion = Read.read((String)Teams[i].getItemAt(choice[i]), (String) Players[i].getSelectedItem());
					List.insert(insertion);
					}
				}
				
				Player[] array = new Player[List.length()];
		        
				for (int i = 0; i < array.length; i++) {
					
					array[i] = List.search(i);
					
				}
				
				Grapher LetsPlot = new Grapher(array, type.getSelectedIndex());
				LetsPlot.setVisible(true);
				
			}
		});
		
		JLabel[] xb = {x, x_1, x_2, x_3, x_4, x_5, x_6, x_7, x_8};
		JPanel[] xp = {panel, panel_1, panel_2, panel_3, panel_4, panel_5, panel_6, panel_7, panel_8};
		
		xb[0].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				xb[0].setForeground(Color.WHITE);
				xp[0].setBackground(new Color(220,20,60));
				
			}
			public void mouseExited(MouseEvent e) {
				
				xb[0].setForeground(new Color(220,20,60));
				xp[0].setBackground(Color.WHITE);
				
			}public void mouseClicked(MouseEvent e) {
				
				Players[0].setSelectedIndex(-1);
				
			}
			
		});
		
		xb[01].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				xb[01].setForeground(Color.WHITE);
				xp[01].setBackground(new Color(220,20,60));
				
			}
			public void mouseExited(MouseEvent e) {
				
				xb[01].setForeground(new Color(220,20,60));
				xp[01].setBackground(Color.WHITE);
				
			}public void mouseClicked(MouseEvent e) {
				
				Players[01].setSelectedIndex(-1);
				
			}
			
		});
		
		xb[02].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				xb[02].setForeground(Color.WHITE);
				xp[02].setBackground(new Color(220,20,60));
				
			}
			public void mouseExited(MouseEvent e) {
				
				xb[02].setForeground(new Color(220,20,60));
				xp[02].setBackground(Color.WHITE);
				
			}public void mouseClicked(MouseEvent e) {
				
				Players[02].setSelectedIndex(-1);
				
			}
			
		});
		
		xb[03].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				xb[03].setForeground(Color.WHITE);
				xp[03].setBackground(new Color(220,20,60));
				
			}
			public void mouseExited(MouseEvent e) {
				
				xb[03].setForeground(new Color(220,20,60));
				xp[03].setBackground(Color.WHITE);
				
			}public void mouseClicked(MouseEvent e) {
				
				Players[03].setSelectedIndex(-1);
				
			}
			
		});
		
		xb[04].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				xb[04].setForeground(Color.WHITE);
				xp[04].setBackground(new Color(220,20,60));
				
			}
			public void mouseExited(MouseEvent e) {
				
				xb[04].setForeground(new Color(220,20,60));
				xp[04].setBackground(Color.WHITE);
				
			}public void mouseClicked(MouseEvent e) {
				
				Players[04].setSelectedIndex(-1);
				
			}
			
		});
		
		xb[05].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				xb[05].setForeground(Color.WHITE);
				xp[05].setBackground(new Color(220,20,60));
				
			}
			public void mouseExited(MouseEvent e) {
				
				xb[05].setForeground(new Color(220,20,60));
				xp[05].setBackground(Color.WHITE);
				
			}public void mouseClicked(MouseEvent e) {
				
				Players[05].setSelectedIndex(-1);
				
			}
			
		});
		
		xb[06].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				xb[06].setForeground(Color.WHITE);
				xp[06].setBackground(new Color(220,20,60));
				
			}
			public void mouseExited(MouseEvent e) {
				
				xb[06].setForeground(new Color(220,20,60));
				xp[06].setBackground(Color.WHITE);
				
			}public void mouseClicked(MouseEvent e) {
				
				Players[6].setSelectedIndex(-1);
				
			}
			
		});
		
		xb[7].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				xb[7].setForeground(Color.WHITE);
				xp[7].setBackground(new Color(220,20,60));
				
			}
			public void mouseExited(MouseEvent e) {
				
				xb[7].setForeground(new Color(220,20,60));
				xp[7].setBackground(Color.WHITE);
				
			}public void mouseClicked(MouseEvent e) {
				
				Players[7].setSelectedIndex(-1);
				
			}
			
		});
		
		xb[8].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				xb[8].setForeground(Color.WHITE);
				xp[8].setBackground(new Color(220,20,60));
				
			}
			public void mouseExited(MouseEvent e) {
				
				xb[8].setForeground(new Color(220,20,60));
				xp[8].setBackground(Color.WHITE);
				
			}public void mouseClicked(MouseEvent e) {
				
				Players[8].setSelectedIndex(-1);
				
			}
			
		});
		
		
		
		
		
		
		
	}
}
