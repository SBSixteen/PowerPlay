import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import java.text.DecimalFormat;

import javax.swing.UIManager;
import java.awt.Canvas;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Stroke;

import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;

public class Grapher extends JFrame {	
	
	private JPanel contentPane;
	JLabel lblNewLabel = new JLabel("Name :");
	JPanel profile = new JPanel();
	JLabel lblSr = new JLabel("S/R : ");
	JLabel pname = new JLabel("-");
	JLabel playerpic = new JLabel("-");
	JLabel sr = new JLabel("-");
	Canvas xaxis = new Canvas();
	Canvas yaxis = new Canvas();
	Canvas x_2 = new Canvas();
	Canvas x_3 = new Canvas();
	Canvas x_4 = new Canvas();
	Canvas x_5 = new Canvas();
	Canvas x_6 = new Canvas();
	Canvas x_7 = new Canvas();
	Canvas x_8 = new Canvas();
	Canvas x_9 = new Canvas();
	Canvas x_10 = new Canvas();
	Canvas y_10 = new Canvas();
	Canvas y_9 = new Canvas();
	Canvas y_8 = new Canvas();
	Canvas y_7 = new Canvas();
	Canvas y_6 = new Canvas();
	Canvas y_5 = new Canvas();
	Canvas y_4 = new Canvas();
	Canvas y_3 = new Canvas();		
	Canvas y_2 = new Canvas();
	


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	@SuppressWarnings("deprecation")
	public Grapher(Player A, int[] tsel, int[] msel, StringLL[] TT, StringLL[] MM, int mode) {
    	
		setTitle("PowerPlay Grapher v0.5");
		Color[] colors = {new Color(0,128,128), new Color(140,20,20),new Color(133,129,255), new Color(151,167,40), new Color(255,179,0), new Color(122,0,147), new Color(147,97,85), new Color(0,46,36),new Color(255,46,36)};
		
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1280, 720);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		

		profile.setBounds(970, 258, 249, 77);
		contentPane.add(profile);
		profile.setLayout(null);
		profile.setVisible(false);
		
		
		lblNewLabel.setFont(new Font("Exo 2 Light", Font.PLAIN, 16));
		lblNewLabel.setBounds(10, 11, 73, 26);
		profile.add(lblNewLabel);
		

		lblSr.setFont(new Font("Exo 2 Light", Font.PLAIN, 16));
		lblSr.setBounds(10, 40, 73, 26);
		profile.add(lblSr);
		

		pname.setFont(new Font("Exo 2 Light", Font.PLAIN, 16));
		pname.setBounds(85, 11, 154, 26);
		profile.add(pname);
		

		sr.setFont(new Font("Exo 2 Light", Font.PLAIN, 16));
		sr.setBounds(85, 40, 154, 26);
		profile.add(sr);
		

		playerpic.setHorizontalAlignment(SwingConstants.CENTER);
		playerpic.setFont(new Font("Exo 2 Light", Font.PLAIN, 15));
		playerpic.setBounds(970, 10, 249, 249);
		contentPane.add(playerpic);
		
		yaxis.setBounds(70, 10, 1, 620);
		yaxis.setBackground(Color.GRAY);
		contentPane.add(yaxis);
		
		xaxis.setBounds(70, 629, 1100, 1);
		xaxis.setBackground(Color.GRAY);
		contentPane.add(xaxis);
		
		x_2.setBounds(180, 627, 1, 17);
		x_2.setBackground(Color.GRAY);
		contentPane.add(x_2);
		
		x_3.setBounds(290, 627, 1, 17);
		x_3.setBackground(Color.GRAY);
		contentPane.add(x_3);
		
		x_4.setBounds(400, 627, 1, 17);
		x_4.setBackground(Color.GRAY);
		contentPane.add(x_4);
		
		x_5.setBounds(510, 627, 1, 17);
		x_5.setBackground(Color.GRAY);
		contentPane.add(x_5);
		
		x_6.setBounds(620, 627, 1, 17);
		x_6.setBackground(Color.GRAY);
		contentPane.add(x_6);
		
		x_7.setBounds(730, 627, 1, 17);
		x_7.setBackground(Color.GRAY);
		contentPane.add(x_7);
		
		x_8.setBounds(840, 627, 1, 17);
		x_8.setBackground(Color.GRAY);
		contentPane.add(x_8);
		
		x_9.setBounds(950, 627, 1, 17);
		x_9.setBackground(Color.GRAY);
		contentPane.add(x_9);
		
		x_10.setBounds(1060, 627, 1, 17);
		x_10.setBackground(Color.GRAY);
		contentPane.add(x_10);
		

		y_10.setBounds(60, 72, 16, 1);
		y_10.setBackground(Color.GRAY);
		contentPane.add(y_10);
		
		Canvas y_9 = new Canvas();
		y_9.setBounds(60, 134, 16, 1);
		y_9.setBackground(Color.GRAY);
		contentPane.add(y_9);
		
		Canvas y_8 = new Canvas();
		y_8.setBounds(60, 196, 16, 1);
		y_8.setBackground(Color.GRAY);
		contentPane.add(y_8);
		
		Canvas y_7 = new Canvas();
		y_7.setBounds(60, 258, 16, 1);
		y_7.setBackground(Color.GRAY);
		contentPane.add(y_7);
		
		Canvas y_6 = new Canvas();
		y_6.setBounds(60, 320, 16, 1);
		y_6.setBackground(Color.GRAY);
		contentPane.add(y_6);
		
		Canvas y_5 = new Canvas();
		y_5.setBounds(60, 382, 16, 1);
		y_5.setBackground(Color.GRAY);
		contentPane.add(y_5);
		
		Canvas y_4 = new Canvas();
		y_4.setBounds(60, 444, 16, 1);
		y_4.setBackground(Color.GRAY);
		contentPane.add(y_4);
		
		Canvas y_3 = new Canvas();
		y_3.setBounds(60, 506, 16, 1);
		y_3.setBackground(Color.GRAY);
		contentPane.add(y_3);
		
		Canvas y_2 = new Canvas();
		y_2.setBounds(60, 568, 16, 1);
		y_2.setBackground(Color.GRAY);
		contentPane.add(y_2);
		
		JLabel yl = new JLabel("x");
		yl.setBounds(10, 65, 46, 14);
		yl.setForeground(new Color(220, 20, 60));
		yl.setHorizontalAlignment(SwingConstants.CENTER);
		yl.setFont(new Font("Exo 2 Light", Font.PLAIN, 12));
		contentPane.add(yl);
		
		JLabel yl_1 = new JLabel("x");
		yl_1.setBounds(10, 127, 46, 14);
		yl_1.setForeground(new Color(220, 20, 60));
		yl_1.setHorizontalAlignment(SwingConstants.CENTER);
		yl_1.setFont(new Font("Exo 2 Light", Font.PLAIN, 12));
		contentPane.add(yl_1);
		
		JLabel yl_2 = new JLabel("x");
		yl_2.setBounds(10, 189, 46, 14);
		yl_2.setForeground(new Color(220, 20, 60));
		yl_2.setHorizontalAlignment(SwingConstants.CENTER);
		yl_2.setFont(new Font("Exo 2 Light", Font.PLAIN, 12));
		contentPane.add(yl_2);
		
		JLabel yl_3 = new JLabel("x");
		yl_3.setBounds(10, 251, 46, 14);
		yl_3.setForeground(new Color(220, 20, 60));
		yl_3.setHorizontalAlignment(SwingConstants.CENTER);
		yl_3.setFont(new Font("Exo 2 Light", Font.PLAIN, 12));
		contentPane.add(yl_3);
		
		JLabel yl_4 = new JLabel("x");
		yl_4.setBounds(10, 313, 46, 14);
		yl_4.setForeground(new Color(220, 20, 60));
		yl_4.setHorizontalAlignment(SwingConstants.CENTER);
		yl_4.setFont(new Font("Exo 2 Light", Font.PLAIN, 12));
		contentPane.add(yl_4);
		
		JLabel yl_5 = new JLabel("x");
		yl_5.setBounds(10, 375, 46, 14);
		yl_5.setForeground(new Color(220, 20, 60));
		yl_5.setHorizontalAlignment(SwingConstants.CENTER);
		yl_5.setFont(new Font("Exo 2 Light", Font.PLAIN, 12));
		contentPane.add(yl_5);
		
		JLabel yl_6 = new JLabel("x");
		yl_6.setBounds(10, 437, 46, 14);
		yl_6.setForeground(new Color(220, 20, 60));
		yl_6.setHorizontalAlignment(SwingConstants.CENTER);
		yl_6.setFont(new Font("Exo 2 Light", Font.PLAIN, 12));
		contentPane.add(yl_6);
		
		JLabel yl_7 = new JLabel("x");
		yl_7.setBounds(10, 499, 46, 14);
		yl_7.setForeground(new Color(220, 20, 60));
		yl_7.setHorizontalAlignment(SwingConstants.CENTER);
		yl_7.setFont(new Font("Exo 2 Light", Font.PLAIN, 12));
		contentPane.add(yl_7);
		
		JLabel yl_8 = new JLabel("x");

		yl_8.setBounds(10, 561, 46, 14);
		yl_8.setForeground(new Color(220, 20, 60));
		yl_8.setHorizontalAlignment(SwingConstants.CENTER);
		yl_8.setFont(new Font("Exo 2 Light", Font.PLAIN, 12));
		contentPane.add(yl_8);
		
		JLabel xl = new JLabel("x");
		JLabel xl_1 = new JLabel("x");
		JLabel xl_2 = new JLabel("x");
		JLabel xl_3 = new JLabel("x");
		JLabel xl_4 = new JLabel("x");
		JLabel xl_5 = new JLabel("x");
		JLabel xl_6 = new JLabel("x");
		JLabel xl_7 = new JLabel("x");
		JLabel xl_8 = new JLabel("x");

		JLabel[] yval = {yl_8, yl_7, yl_6, yl_5, yl_4, yl_3, yl_2, yl_1, yl};
		JLabel[] xval = {xl, xl_1, xl_2, xl_3, xl_4, xl_5, xl_6, xl_7, xl_8};
	    double maxy = 0;
    	
	    StringLL address = new StringLL();
	    
	    for (int i = 0; i < xval.length; i++) {
			if(tsel[i] != -1 &&  msel[i]!=-1) {
				System.out.println("Tsel[" + i + "]"  + tsel[i]);
				System.out.println("msel[" + i + "]"  + msel[i]);
				System.out.println("T[" + i + "]"  + TT[i].search(tsel[i]));
				System.out.println("M[" + i + "]"  + MM[i].search(msel[i]));
               
				
				System.out.println("C:\\PowerPlay\\Tournament\\"+TT[i].search(tsel[i])+ "\\" + MM[i].search(msel[i]));
            	address.insert("C:\\PowerPlay\\Tournament\\"+TT[i].search(tsel[i])+ "\\" + MM[i].search(msel[i]));

			}
		}
             
        MatchLL use = new MatchLL();
        MatchReader Read = new MatchReader();
        
        for (int i = 0; i < address.length(); i++) {
    		System.out.println(address.search(i));
		}
        
        for (int i = 0; i < address.length(); i++) {
			System.out.println(address.search(i) + "  Grapher Line 305");
        	use.insert(Read.read(address.search(i)));
		}
	    
       
		double[] P = new double[9];
		double[] Q = new double[9];
        
System.out.println(A.name + " | " + A.team+ " Line:313");
		
		for (int i = 0; i < use.length(); i++) {
		   Match X = new Match();
		   X = use.search(i);
		   System.out.println(X.teamA + " and " + X.teamB);
			System.out.println("Match#" + i + " = Loaded");
            for (int j = 0; j < 11; j++) {
        		System.out.println(X.teamA +  " = team currently searching | Player = " + X.A[j]);
            	System.out.println("mode = " + mode);
        		if(X.teamA.equals(A.team) && X.A[j].equals(A.name)) {
                    System.out.println("Does reach here?");
            		//SR Batting Form
            		if(mode == 21 ||  mode == 29) {
            			System.out.println("Found Him!");
            			P[i] = new Double(X.Astats[j][0]);
            			Q[i] = new Double(X.Astats[j][1]);
            		       System.out.println(P[i]);
            		       System.out.println(Q[i]);
            		}//Batting Form 4s
            		else if(mode == 22 || mode == 30) {
            			P[i] = new Double(X.Astats[j][5]);
            		}
            		//Batting Form 6s
            		else if(mode == 23 || mode == 31) {
            			Q[i] = new Double(X.Astats[j][6]);
            		} //Batting Form 4s + 6s
            		else if(mode == 24 || mode ==32) {
            			P[i] = new Double(X.Astats[j][5]);
            			Q[i] = new Double(X.Astats[j][6]);
            		}//Batting Form (Survival)
            		else if(mode == 25 || mode == 33) {
            			P[i] = new Double(X.Astats[j][1]);
            		}// Bowling Form (Economy)
            		else if(mode == 26 || mode == 34) {
            			P[i] = new Double(X.Astats[j][4]);
            			Q[i] = new Double(X.Astats[j][3]);
            		}// Bowling Form (Wickets)
            		else if(mode == 27 || mode == 35) {
            			P[i] = new Double(X.Astats[j][2]);

            		}//Bowling Form (Runs Conceded)
            		else if(mode == 28 || mode == 36) {
            			P[i] = new Double(X.Astats[j][4]);

            		}
            		
            	}
        		else if(X.teamB.equals(A.team) && X.B[j].equals(A.name)) {

            		//SR Batting Form
            		if(mode == 21 ||  mode == 29) {
            			P[i] = new Double(X.Bstats[j][0]);
            			Q[i] = new Double(X.Bstats[j][1]);
            		}//Batting Form 4s
            		else if(mode == 22 || mode == 30) {
            			P[i] = new Double(X.Bstats[j][5]);
            		}
            		//Batting Form 6s
            		else if(mode == 23 || mode == 31) {
            			Q[i] = new Double(X.Bstats[j][6]);
            		} //Batting Form 4s + 6s
            		else if(mode == 24 || mode ==32) {
            			P[i] = new Double(X.Bstats[j][5]);
            			Q[i] = new Double(X.Bstats[j][6]);
            		}//Batting Form (Survival)
            		else if(mode == 25 || mode == 33) {
            			P[i] = new Double(X.Bstats[j][1]);
            		}// Bowling Form (Economy)
            		else if(mode == 26 || mode == 34) {
            			P[i] = new Double(X.Bstats[j][4]);
            			Q[i] = new Double(X.Bstats[j][3]);
            		}// Bowling Form (Wickets)
            		else if(mode == 27 || mode == 35) {
            			P[i] = new Double(X.Bstats[j][2]);

            		}//Bowling Form (Runs Conceded)
            		else if(mode == 28 || mode == 36) {
            			P[i] = new Double(X.Bstats[j][4]);

            		}

            	}
			}
    
			xval[i].setText("Match #" + (i+1));
			xval[i].setForeground(colors[i]);
			xval[i].setFont(new Font("Exo 2 Light", Font.BOLD, 12));
		    xval[i].setHorizontalAlignment(SwingConstants.CENTER);
			xval[i].setBounds(140+110*i, 646, 80, 14);
			contentPane.add(xval[i]);
			xval[i].setVisible(true);
			
		}
		
		double[] ysend = new double[use.length()];
		for (int k = 0; k < ysend.length; k++) {
			
    		//SR Batting Form
    		if(mode == 21 ||  mode == 29) {
                if(Q[k]!=0) {
    			ysend[k] = (P[k]/Q[k])*100;
                }else {
                	ysend[k]=0;
                }
    		}//Batting Form 4s
    		else if(mode == 22 || mode == 30) {
    			ysend[k] = P[k];
    		}
    		//Batting Form 6s
    		else if(mode == 23 || mode == 31) {
    			ysend[k] = Q[k];
    		} //Batting Form 4s + 6s
    		else if(mode == 24 || mode ==32) {
               ysend[k] = Q[k] + P[k];
    		}//Batting Form (Survival)
    		else if(mode == 25 || mode == 33) {
    			 ysend[k] = P[k];
    		}// Bowling Form (Economy)
    		else if(mode == 26 || mode == 34) {
                if(Q[k]!=0) {
    			ysend[k] = P[k]/Q[k];
                }else {
                	ysend[k]=0;
                }
    		}// Bowling Form (Wickets)
    		else if(mode == 27 || mode == 35) {
    			ysend[k]=P[k];

    		}//Bowling Form (Runs Conceded)
    		else if(mode == 28 || mode == 36) {
    			ysend[k]= P[k];

    		}
			
		}
		
		for (int j = 0; j < ysend.length; j++) {
			maxy = Math.max(maxy, ysend[j]);
		}
		
		

			for (int i = 0; i < yval.length; i++) {
				yval[i].setText(new DecimalFormat("###.##").format(maxy*(i+1)/9));
			}		
		
		paintGraph visuals = new paintGraph(A, ysend ,mode);
		visuals.setBounds(70, 10, 1100, 620);
		contentPane.add(visuals);
		visuals.setBackground(new Color(255,255,255));
		visuals.setLayout(null);
		visuals.setVisible(true);

		
	}
	
	public Grapher(String[] A, int mode) {
		
		
		String[] names = { "PowerPlay Grapher v0.5 || Y = Average Runs Scored (Overs)", "PowerPlay Grapher v0.5 || Y = Average Team Runs Score per Match", "PowerPlay Grapher v0.5 || Y = Average Team Balls Faced (Wickets)", "PowerPlay Grapher v0.5 || Y = Average Team Balls Faced (Matches)", "PowerPlay Grapher v0.5 || Y = Average Team Wickets Taken (Overs)", "PowerPlay Grapher v0.5 || Y = Average Team Wickets Taken (Matches)", "PowerPlay Grapher v0.5 || Y = Average Team Overs (Fours)", "PowerPlay Grapher v0.5 || Y = Average Team Fours (Matches)", "PowerPlay Grapher v0.5 || Y = Average Team Sixes (Overs)", "PowerPlay Grapher v0.5 || Y = Average Team Sixes (Matches)", "PowerPlay Grapher v0.5 || Y = Average Team Overs (Boundaries)", "PowerPlay Grapher v0.5 || Y = Average Team Boundaries (Matches)"};
		
		for (int i = 0; i < names.length; i++) {
			if(i+8 == mode) {
				setTitle(names[i]);
			}
		}
		
		Color[] colors = {new Color(0,128,128), new Color(140,20,20),new Color(133,129,255), new Color(151,167,40), new Color(255,179,0), new Color(122,0,147), new Color(147,97,85), new Color(0,46,36),new Color(255,46,36)};
			
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1280, 720);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel profile = new JPanel();
		profile.setBounds(980, 130, 249, 102);
		contentPane.add(profile);
		profile.setLayout(null);
		profile.setVisible(false);
		
		JLabel lblNewLabel = new JLabel("Name :");
		lblNewLabel.setFont(new Font("Exo 2 Light", Font.PLAIN, 16));
		lblNewLabel.setBounds(10, 11, 73, 26);
		profile.add(lblNewLabel);
		
		JLabel lblSr = new JLabel("S/R : ");
		lblSr.setFont(new Font("Exo 2 Light", Font.PLAIN, 16));
		lblSr.setBounds(10, 40, 159, 26);
		profile.add(lblSr);

		JLabel pname = new JLabel("-");
		pname.setHorizontalAlignment(SwingConstants.TRAILING);
		pname.setFont(new Font("Exo 2 Light", Font.PLAIN, 16));
		pname.setBounds(85, 11, 154, 26);
		profile.add(pname);
		
		JLabel sr = new JLabel("-");
		sr.setHorizontalAlignment(SwingConstants.CENTER);
		sr.setFont(new Font("Exo 2 Light", Font.PLAIN, 16));
		sr.setBounds(179, 40, 60, 26);
		profile.add(sr);
		
		JLabel lblMatches = new JLabel("Matches :");
		lblMatches.setFont(new Font("Exo 2 Light", Font.PLAIN, 16));
		lblMatches.setBounds(10, 65, 159, 26);
		profile.add(lblMatches);
		
		JLabel sr_1 = new JLabel("-");
		sr_1.setHorizontalAlignment(SwingConstants.CENTER);
		sr_1.setFont(new Font("Exo 2 Light", Font.PLAIN, 16));
		sr_1.setBounds(179, 65, 60, 26);
		profile.add(sr_1);
		
		JLabel playerpic = new JLabel("-");
		playerpic.setHorizontalAlignment(SwingConstants.CENTER);
		playerpic.setFont(new Font("Exo 2 Light", Font.PLAIN, 15));
		playerpic.setBounds(980, 18, 160, 107);
		contentPane.add(playerpic);
		
		Canvas yaxis = new Canvas();
		yaxis.setBounds(70, 10, 1, 620);
		yaxis.setBackground(Color.GRAY);
		contentPane.add(yaxis);
		
		Canvas xaxis = new Canvas();
		xaxis.setBounds(70, 629, 1100, 1);
		xaxis.setBackground(Color.GRAY);
		contentPane.add(xaxis);
		
		Canvas x_2 = new Canvas();
		x_2.setBounds(180, 627, 1, 17);
		x_2.setBackground(Color.GRAY);
		contentPane.add(x_2);
		
		Canvas x_3 = new Canvas();
		x_3.setBounds(290, 627, 1, 17);
		x_3.setBackground(Color.GRAY);
		contentPane.add(x_3);
		
		Canvas x_4 = new Canvas();
		x_4.setBounds(400, 627, 1, 17);
		x_4.setBackground(Color.GRAY);
		contentPane.add(x_4);
		
		Canvas x_5 = new Canvas();
		x_5.setBounds(510, 627, 1, 17);
		x_5.setBackground(Color.GRAY);
		contentPane.add(x_5);
		
		Canvas x_6 = new Canvas();
		x_6.setBounds(620, 627, 1, 17);
		x_6.setBackground(Color.GRAY);
		contentPane.add(x_6);
		
		Canvas x_7 = new Canvas();
		x_7.setBounds(730, 627, 1, 17);
		x_7.setBackground(Color.GRAY);
		contentPane.add(x_7);
		
		Canvas x_8 = new Canvas();
		x_8.setBounds(840, 627, 1, 17);
		x_8.setBackground(Color.GRAY);
		contentPane.add(x_8);
		
		Canvas x_9 = new Canvas();
		x_9.setBounds(950, 627, 1, 17);
		x_9.setBackground(Color.GRAY);
		contentPane.add(x_9);
		
		Canvas x_10 = new Canvas();
		x_10.setBounds(1060, 627, 1, 17);
		x_10.setBackground(Color.GRAY);
		contentPane.add(x_10);
		
		Canvas y_10 = new Canvas();
		y_10.setBounds(60, 72, 16, 1);
		y_10.setBackground(Color.GRAY);
		contentPane.add(y_10);
		
		Canvas y_9 = new Canvas();
		y_9.setBounds(60, 134, 16, 1);
		y_9.setBackground(Color.GRAY);
		contentPane.add(y_9);
		
		Canvas y_8 = new Canvas();
		y_8.setBounds(60, 196, 16, 1);
		y_8.setBackground(Color.GRAY);
		contentPane.add(y_8);
		
		Canvas y_7 = new Canvas();
		y_7.setBounds(60, 258, 16, 1);
		y_7.setBackground(Color.GRAY);
		contentPane.add(y_7);
		
		Canvas y_6 = new Canvas();
		y_6.setBounds(60, 320, 16, 1);
		y_6.setBackground(Color.GRAY);
		contentPane.add(y_6);
		
		Canvas y_5 = new Canvas();
		y_5.setBounds(60, 382, 16, 1);
		y_5.setBackground(Color.GRAY);
		contentPane.add(y_5);
		
		Canvas y_4 = new Canvas();
		y_4.setBounds(60, 444, 16, 1);
		y_4.setBackground(Color.GRAY);
		contentPane.add(y_4);
		
		Canvas y_3 = new Canvas();
		y_3.setBounds(60, 506, 16, 1);
		y_3.setBackground(Color.GRAY);
		contentPane.add(y_3);
		
		Canvas y_2 = new Canvas();
		y_2.setBounds(60, 568, 16, 1);
		y_2.setBackground(Color.GRAY);
		contentPane.add(y_2);
		
		JLabel yl = new JLabel("x");
		yl.setBounds(10, 65, 46, 14);
		yl.setForeground(new Color(220, 20, 60));
		yl.setHorizontalAlignment(SwingConstants.CENTER);
		yl.setFont(new Font("Exo 2 Light", Font.PLAIN, 12));
		contentPane.add(yl);
		
		JLabel yl_1 = new JLabel("x");
		yl_1.setBounds(10, 127, 46, 14);
		yl_1.setForeground(new Color(220, 20, 60));
		yl_1.setHorizontalAlignment(SwingConstants.CENTER);
		yl_1.setFont(new Font("Exo 2 Light", Font.PLAIN, 12));
		contentPane.add(yl_1);
		
		JLabel yl_2 = new JLabel("x");
		yl_2.setBounds(10, 189, 46, 14);
		yl_2.setForeground(new Color(220, 20, 60));
		yl_2.setHorizontalAlignment(SwingConstants.CENTER);
		yl_2.setFont(new Font("Exo 2 Light", Font.PLAIN, 12));
		contentPane.add(yl_2);
		
		JLabel yl_3 = new JLabel("x");
		yl_3.setBounds(10, 251, 46, 14);
		yl_3.setForeground(new Color(220, 20, 60));
		yl_3.setHorizontalAlignment(SwingConstants.CENTER);
		yl_3.setFont(new Font("Exo 2 Light", Font.PLAIN, 12));
		contentPane.add(yl_3);
		
		JLabel yl_4 = new JLabel("x");
		yl_4.setBounds(10, 313, 46, 14);
		yl_4.setForeground(new Color(220, 20, 60));
		yl_4.setHorizontalAlignment(SwingConstants.CENTER);
		yl_4.setFont(new Font("Exo 2 Light", Font.PLAIN, 12));
		contentPane.add(yl_4);
		
		JLabel yl_5 = new JLabel("x");
		yl_5.setBounds(10, 375, 46, 14);
		yl_5.setForeground(new Color(220, 20, 60));
		yl_5.setHorizontalAlignment(SwingConstants.CENTER);
		yl_5.setFont(new Font("Exo 2 Light", Font.PLAIN, 12));
		contentPane.add(yl_5);
		
		JLabel yl_6 = new JLabel("x");
		yl_6.setBounds(10, 437, 46, 14);
		yl_6.setForeground(new Color(220, 20, 60));
		yl_6.setHorizontalAlignment(SwingConstants.CENTER);
		yl_6.setFont(new Font("Exo 2 Light", Font.PLAIN, 12));
		contentPane.add(yl_6);
		
		JLabel yl_7 = new JLabel("x");
		yl_7.setBounds(10, 499, 46, 14);
		yl_7.setForeground(new Color(220, 20, 60));
		yl_7.setHorizontalAlignment(SwingConstants.CENTER);
		yl_7.setFont(new Font("Exo 2 Light", Font.PLAIN, 12));
		contentPane.add(yl_7);
		
		JLabel yl_8 = new JLabel("x");

		yl_8.setBounds(10, 561, 46, 14);
		yl_8.setForeground(new Color(220, 20, 60));
		yl_8.setHorizontalAlignment(SwingConstants.CENTER);
		yl_8.setFont(new Font("Exo 2 Light", Font.PLAIN, 12));
		contentPane.add(yl_8);
		
		JLabel xl = new JLabel("x");
		JLabel xl_1 = new JLabel("x");
		JLabel xl_2 = new JLabel("x");
		JLabel xl_3 = new JLabel("x");
		JLabel xl_4 = new JLabel("x");
		JLabel xl_5 = new JLabel("x");
		JLabel xl_6 = new JLabel("x");
		JLabel xl_7 = new JLabel("x");
		JLabel xl_8 = new JLabel("x");

		JLabel[] yval = {yl_8, yl_7, yl_6, yl_5, yl_4, yl_3, yl_2, yl_1, yl};
		JLabel[] xval = {xl, xl_1, xl_2, xl_3, xl_4, xl_5, xl_6, xl_7, xl_8};
	    double maxy = 0;
	    
	    MatchLL[] TList = new MatchLL[A.length];
	    int[] matchc = new int[A.length];
	    MatchReader M = new MatchReader();
	    String[] adr = (new File("C:\\PowerPlay\\Tournament\\").list());
	    
	    for (int i = 0; i < A.length; i++) {
	    	
	    	TList[i] = new MatchLL();
	    	
	    	 for (int j = 0; j < adr.length; j++) {
	    		 
	 	    	String[] adr_2 = (new File("C:\\PowerPlay\\Tournament\\" + adr[j] + "\\").list());
	 	    	
	 	    	for (int k = 0; k < adr_2.length; k++) {
	 	    		
	 	    		Match X = M.read("C:\\PowerPlay\\Tournament\\" + adr[j] + "\\" + adr_2[k]);
	 	    		System.out.println("C:\\PowerPlay\\Tournament\\" + adr[j] + "\\" + adr_2[k]);
	 	    		
	 	    		System.out.println(X.teamA);
	 	    		System.out.println(X.teamB);
	 	    		if(X.teamA.equals(A[i]) || X.teamB.equals(A[i])) {
	 	    			TList[i].insert(X);
	 	    			matchc[i] = matchc[i] + 1;
	 	    		}
					
				}
			
			}
	    	
		}
	    
	    double[] y = new double[A.length];
	    double[] x = new double[A.length];
	    
	    for (int i = 0; i < TList.length; i++) {
			
	    	for (int j = 0; j < TList[i].length(); j++) {
				
	    		Match seek = TList[i].search(j);
	    		
	    		for (int k = 0; k < seek.Astats.length; k++) {
					
	    			//Average Runs per over 
	    			if(mode == 8 && seek.teamA.equals(A[i])) {
	    				
	    				y[i] = y[i] + seek.Astats[k][0];
	    				x[i] = x[i] + seek.Astats[k][1];
	    				System.out.println(A[i] + " seeked in A");
	    				
	    			}else if(mode == 8 && seek.teamB.equals(A[i])) {
	    				
	    				y[i] = y[i] + seek.Bstats[k][0];
	    				x[i] = x[i] + seek.Bstats[k][1];
	    				System.out.println(A[i] + " seeked in B");
	    				
	    			}
	    			
	    			//Average Runs per match
	    			else if(mode == 9 && seek.teamA.equals(A[i])) {
	    				
	    				y[i] = y[i] + seek.Astats[k][0];
	    				x[i] = x[i] + seek.Astats[k][1];
	    				
	    			}else if(mode == 9 && seek.teamB.equals(A[i])) {
	    				
	    				y[i] = y[i] + seek.Bstats[k][0];
	    				x[i] = x[i] + seek.Bstats[k][1];
	    				
	    			}
	    			//Average balls faced per wicket
	    			else if(mode == 10 && seek.teamA.equals(A[i])) {
	    				
	    				y[i] = y[i] + seek.Astats[k][1];
	    				x[i] = x[i] + seek.Bstats[k][2];
	    				
	    			}else if(mode == 10 && seek.teamB.equals(A[i])) {
	    				
	    				y[i] = y[i] + seek.Bstats[k][1];
	    				x[i] = x[i] + seek.Astats[k][2];
	    				
	    			}
	    			//Average balls faced per match
	    			else if(mode == 11 && seek.teamA.equals(A[i])) {
	    				
	    				y[i] = y[i] + seek.Astats[k][1];
	    				x[i] = x[i] + seek.Bstats[k][2];
	    				
	    			}else if(mode == 11 && seek.teamB.equals(A[i])) {
	    				
	    				y[i] = y[i] + seek.Bstats[k][1];
	    				x[i] = x[i] + seek.Astats[k][2];
	    				
	    			}
	    			//Average wickets taken per overs bowled
	    			else if(mode == 12 && seek.teamA.equals(A[i])) {
	    				
	    				y[i] = y[i] + seek.Astats[k][2];
	    				x[i] = x[i] + seek.Astats[k][3];
	    				
	    			}else if(mode == 12 && seek.teamB.equals(A[i])) {
	    				
	    				y[i] = y[i] + seek.Bstats[k][2];
	    				x[i] = x[i] + seek.Bstats[k][3];
	    				
	    			}
	    			//Average Wickets taken per match
                     else if(mode == 13 && seek.teamA.equals(A[i])) {
	    				
	    				y[i] = y[i] + seek.Astats[k][2];
	    				x[i] = x[i] + seek.Astats[k][3];
	    				
	    		    }else if(mode == 13 && seek.teamB.equals(A[i])) {
	    				
	    				y[i] = y[i] + seek.Bstats[k][2];
	    				x[i] = x[i] + seek.Bstats[k][3];
	    				
	    			}
	    			//Average Overs to score a 4
                     else if(mode == 14 && seek.teamA.equals(A[i])) {
	    				
	    				y[i] = y[i] + seek.Astats[k][5];
	    				x[i] = x[i] + seek.Astats[k][1];
	    				
	    		    }else if(mode == 14 && seek.teamB.equals(A[i])) {
	    				
	    				y[i] = y[i] + seek.Bstats[k][5];
	    				x[i] = x[i] + seek.Bstats[k][1];
	    				
	    			}
	    			//4 per match
                    else if(mode == 15 && seek.teamA.equals(A[i])) {
	    				
	    				y[i] = y[i] + seek.Astats[k][5];
	    				x[i] = x[i] + seek.Astats[k][1];
	    				
	    		    }else if(mode == 15 && seek.teamB.equals(A[i])) {
	    				
	    				y[i] = y[i] + seek.Bstats[k][5];
	    				x[i] = x[i] + seek.Bstats[k][1];
	    				
	    			}
	    			
	    			//Average Overs to score a 6
                    else if(mode == 16 && seek.teamA.equals(A[i])) {
	    				
	    				y[i] = y[i] + seek.Astats[k][6];
	    				x[i] = x[i] + seek.Astats[k][1];
	    				
	    		    }else if(mode == 16  && seek.teamB.equals(A[i])) {
	    				
	    				y[i] = y[i] + seek.Bstats[k][6];
	    				x[i] = x[i] + seek.Bstats[k][1];
	    				
	    			}
	    			//Average Sixes in a Match
                    else if(mode == 17 && seek.teamA.equals(A[i])) {
	    				
	    				y[i] = y[i] + seek.Astats[k][6];
	    				x[i] = x[i] + seek.Astats[k][1];
	    				
	    		    }else if(mode == 17  && seek.teamB.equals(A[i])) {
	    				
	    				y[i] = y[i] + seek.Bstats[k][6];
	    				x[i] = x[i] + seek.Bstats[k][1];
	    				
	    			}
	    			//Overs needed to score a boundary
                    else if(mode == 18 && seek.teamA.equals(A[i])) {
	    				
	    				y[i] = y[i] + seek.Astats[k][5] + seek.Astats[k][6];
	    				x[i] = x[i] + seek.Astats[k][1];
	    				
	    		    }else if(mode == 18  && seek.teamB.equals(A[i])) {
	    				
	    				y[i] = y[i] + seek.Bstats[k][5] + seek.Astats[k][6];
	    				x[i] = x[i] + seek.Bstats[k][1];
	    				
	    			}
	    			//Average Boundaries per match
                    else if(mode == 19 && seek.teamA.equals(A[i])) {
	    				
	    				y[i] = y[i] + seek.Astats[k][5] + seek.Astats[k][6];
	    				x[i] = x[i] + seek.Astats[k][1];
	    				
	    		    }else if(mode == 19  && seek.teamB.equals(A[i])) {
	    				
	    				y[i] = y[i] + seek.Bstats[k][5] + seek.Astats[k][6];
	    				x[i] = x[i] + seek.Bstats[k][1];
	    				
	    			}
	    			
				}
	    		
			}
	    	
		}
	    
	    double[] ysend = new double[y.length];
	    
	    for (int i = 0; i < x.length; i++) {
            
	    	if(i<A.length) {
				xval[i].setText(A[i]);
				xval[i].setForeground(colors[i]);
				xval[i].setFont(new Font("Exo 2 Light", Font.BOLD, 12));
			    xval[i].setHorizontalAlignment(SwingConstants.CENTER);
				xval[i].setBounds(140+110*i, 646, 80, 14);
				contentPane.add(xval[i]);
	    	
				//Average Strike Rate
	    	if(mode == 8) {
	        
	    		if(x[i] != 0) {
	    	ysend[i] = ((y[i]/x[i])*6);
	    		}else {
	    			ysend[i] = 0;
	    		}
	    	}
	    	//Average Match RUns
	    	else if(mode == 9) {
		         if(matchc[i] != 0) {
	    		ysend[i] = (y[i]/(new Double(matchc[i])));
		         }
		         else {
		        	 ysend[i] = 0;
		         }
	    	}
	    	//Average Batsmen Survival
	    	else if(mode == 10) {
		         if(x[i] != 0) {
	    		ysend[i] = (y[i]/x[i]);
		         }
		         else {
		        	 ysend[i] = 0;
		         }
	    	}
	    	//Average Balls faced in a match
	    	else if(mode == 11) {
		         if(matchc[i] != 0) {
	    		ysend[i] = (y[i]/(new Double(matchc[i])));
		         }
		         else {
		        	 ysend[i] = 0;
		         }
	    	}
	    	//Average Overs for a Wicket
	   	 else if(mode == 12) {
	         if(y[i] != 0) {
    		ysend[i] = ((x[i]/6)/y[i]);
	         }
	         else {
	        	 ysend[i] = 0;
	         }
    	}
	    	//Average Wickets Taken in a Match
	   	 else if(mode == 13) {
	         if(matchc[i] != 0) {
    		ysend[i] = (y[i]/matchc[i]);
	         }
	         else {
	        	 ysend[i] = 0;
	         }
    	}
	    	//Average Overs to Score a Four
	   	 else if(mode == 14) {
	         if(y[i] != 0) {
    		ysend[i] = ((x[i]/6)/y[i]);
	         }
	         else {
	        	 ysend[i] = 0;
	         }
    	}
	    	//Average 4s per match
	   	 else if(mode == 15) {
	         if(matchc[i] != 0) {
    		ysend[i] = ((y[i])/matchc[i]);
	         }
	         else {
	        	 ysend[i] = 0;
	         }
    	}
	    	//Overs to score a Six
	   	 else if(mode == 16) {
	         if(y[i] != 0) {
    		ysend[i] = ((x[i]/6)/y[i]);
	         }
	         else {
	        	 ysend[i] = 0;
	         }
    	}
	    	//Average 6s per match
	   	 else if(mode == 17) {
	         if(matchc[i] != 0) {
    		ysend[i] = ((y[i])/matchc[i]);
	         }
	         else {
	        	 ysend[i] = 0;
	         }
    	}
	    	//Overs to score a boundary
	   	 else if(mode == 18) {
	         if(y[i] != 0) {
    		ysend[i] = ((x[i]/6)/y[i]);
	         }
	         else {
	        	 ysend[i] = 0;
	         }
    	}
	    	//Average 4s and 6s per match
	   	 else if(mode == 19) {
	         if(matchc[i] != 0) {
    		ysend[i] = ((y[i])/matchc[i]);
	         }
	         else {
	        	 ysend[i] = 0;
	         }
    	}
	    	
	    	
	    	System.out.println(ysend[i]);
	    	maxy= Math.max(ysend[i],maxy);
	    	}else {
				xval[i] = new JLabel("x");
				xval[i].setForeground(colors[i]);
				xval[i].setFont(new Font("Exo 2 Light", Font.BOLD, 12));
				xval[i].setHorizontalAlignment(SwingConstants.CENTER);
				xval[i].setBounds(140+110*i, 646, 80, 14);
				contentPane.add(xval[i]);
	    	}
	    	
		}
	    
		for (int i = 0; i < yval.length; i++) {
			yval[i].setText(new DecimalFormat("###.##").format(maxy*(i+1)/9));
		}
		
		
		paintGraph visuals = new paintGraph(A, ysend ,mode);
		visuals.setBounds(70, 10, 1100, 620);
		contentPane.add(visuals);
		visuals.setBackground(new Color(255,255,255));
		visuals.setLayout(null);
		visuals.setVisible(true);
		
		
	    if(mode == 1) {
	    	lblSr.setText("Economy : ");
	    }
	    else if(mode == 2) {
	    	lblSr.setText("Wickets per Over ");
	    }
	    if(mode == 3) {
	    	lblSr.setText("Wickets per Match : ");
	    }
	    if(mode == 4) {
	    	lblSr.setText("Fours : ");
	    }
	    if(mode == 5) {
	    	lblSr.setText("Sixes : ");
	    }
	    if(mode == 6) {
	    	lblSr.setText("Boundaries : ");
	    }
		
		
		xval[0].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				profile.setVisible(true);	
				sr.setText(new DecimalFormat("###.##").format(ysend[0]));
				pname.setText(A[0]);
				playerpic.setVisible(true);
				playerpic.setIcon(new ImageIcon("C:\\PowerPlay\\Flags\\" +A[0]+".png"));
				playerpic.setText("Image does not exist");
			    sr_1.setText("" + matchc[0]);
			    
			}			public void mouseExited(MouseEvent e) {
				
				playerpic.setVisible(false);
				profile.setVisible(false);
				
			}
		});
		
		xval[1].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				profile.setVisible(true);	
				sr.setText(new DecimalFormat("###.##").format(ysend[1]));
				pname.setText(A[1]);
				playerpic.setVisible(true);
				playerpic.setIcon(new ImageIcon("C:\\PowerPlay\\Flags\\" +A[1]+".png"));
				playerpic.setText("Image does not exist");
			    sr_1.setText("" + matchc[1]);
			    
			}			public void mouseExited(MouseEvent e) {
				profile.setVisible(false);
				playerpic.setVisible(false);
				
			}
		});
		
		xval[2].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {

				profile.setVisible(true);	
				sr.setText(new DecimalFormat("###.##").format(ysend[2]));
				pname.setText(A[2]);
				playerpic.setVisible(true);
				playerpic.setIcon(new ImageIcon("C:\\PowerPlay\\Flags\\" +A[2]+".png"));
				playerpic.setText("Image does not exist");
			    sr_1.setText("" + matchc[2]);
				
			}			public void mouseExited(MouseEvent e) {
				profile.setVisible(false);
				playerpic.setVisible(false);
				
			}
		});
		
		xval[3].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
 
				profile.setVisible(true);	
				sr.setText(new DecimalFormat("###.##").format(ysend[3]));
				pname.setText(A[3]);
				playerpic.setVisible(true);
				playerpic.setIcon(new ImageIcon("C:\\PowerPlay\\Flags\\" +A[3]+".png"));
				playerpic.setText("Image does not exist");
			    sr_1.setText("" + matchc[3]);
				
			}			public void mouseExited(MouseEvent e) {
				profile.setVisible(false);
				playerpic.setVisible(false);
				
			}
		});
		
		xval[4].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				profile.setVisible(true);	
				sr.setText(new DecimalFormat("###.##").format(ysend[4]));
				pname.setText(A[4]);
				playerpic.setVisible(true);
				playerpic.setIcon(new ImageIcon("C:\\PowerPlay\\Flags\\" +A[4]+".png"));
				playerpic.setText("Image does not exist");
			    sr_1.setText("" + matchc[4]);
			    
			}			public void mouseExited(MouseEvent e) {
				profile.setVisible(false);
				playerpic.setVisible(false);
				
			}
		});
		
		xval[5].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				
				profile.setVisible(true);	
				sr.setText(new DecimalFormat("###.##").format(ysend[5]));
				pname.setText(A[5]);
				playerpic.setVisible(true);
				playerpic.setIcon(new ImageIcon("C:\\PowerPlay\\Flags\\" +A[5]+".png"));
				playerpic.setText("Image does not exist");
			    sr_1.setText("" + matchc[5]);
			    
			}			public void mouseExited(MouseEvent e) {
				profile.setVisible(false);
				playerpic.setVisible(false);
				
			}
		});
		
		xval[6].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				profile.setVisible(true);	
				sr.setText(new DecimalFormat("###.##").format(ysend[6]));
				pname.setText(A[6]);
				playerpic.setVisible(true);
				playerpic.setIcon(new ImageIcon("C:\\PowerPlay\\Flags\\" +A[6]+".png"));
				playerpic.setText("Image does not exist");
			    sr_1.setText("" + matchc[6]);
			    
			}			public void mouseExited(MouseEvent e) {
				profile.setVisible(false);
				playerpic.setVisible(false);
				
			}
		});
		
		xval[7].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				
				profile.setVisible(true);	
				sr.setText(new DecimalFormat("###.##").format(ysend[7]));
				pname.setText(A[7]);
				playerpic.setVisible(true);
				playerpic.setIcon(new ImageIcon("C:\\PowerPlay\\Flags\\" +A[7]+".png"));
				playerpic.setText("Image does not exist");
			    sr_1.setText("" + matchc[7]);
			}
			
			public void mouseExited(MouseEvent e) {
				profile.setVisible(false);
				playerpic.setVisible(false);
				
			}
		});
		
		xval[8].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				profile.setVisible(true);	
				sr.setText(new DecimalFormat("###.##").format(ysend[8]));
				pname.setText(A[8]);
				playerpic.setVisible(true);
				playerpic.setIcon(new ImageIcon("C:\\PowerPlay\\Flags\\" +A[8]+".png"));
				playerpic.setText("Image does not exist");
			    sr_1.setText("" + matchc[8]);
				
			}
			public void mouseExited(MouseEvent e) {
				profile.setVisible(false);	
				playerpic.setVisible(false);
				
			}
		});
		
	}

    /**
     * @wbp.parser.constructor
     */
    public Grapher(Player[] A, int mode) {
		
		setTitle("PowerPlay Grapher v0.1");
		Color[] colors = {new Color(0,128,128), new Color(140,20,20),new Color(133,129,255), new Color(151,167,40), new Color(255,179,0), new Color(122,0,147), new Color(147,97,85), new Color(0,46,36),new Color(255,46,36)};
		
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1280, 720);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel profile = new JPanel();
		profile.setBounds(970, 258, 249, 107);
		contentPane.add(profile);
		profile.setLayout(null);
		profile.setVisible(false);
		
		JLabel lblNewLabel = new JLabel("Name :");
		lblNewLabel.setFont(new Font("Exo 2 Light", Font.PLAIN, 16));
		lblNewLabel.setBounds(10, 11, 73, 26);
		profile.add(lblNewLabel);
		
		JLabel lblSr = new JLabel("S/R : ");
		lblSr.setFont(new Font("Exo 2 Light", Font.PLAIN, 16));
		lblSr.setBounds(10, 40, 159, 26);
		profile.add(lblSr);

		JLabel pname = new JLabel("-");
		pname.setHorizontalAlignment(SwingConstants.TRAILING);
		pname.setFont(new Font("Exo 2 Light", Font.PLAIN, 16));
		pname.setBounds(85, 11, 154, 26);
		profile.add(pname);
		
		JLabel sr = new JLabel("-");
		sr.setHorizontalAlignment(SwingConstants.CENTER);
		sr.setFont(new Font("Exo 2 Light", Font.PLAIN, 16));
		sr.setBounds(179, 40, 60, 26);
		profile.add(sr);
		
		JLabel Matches = new JLabel("Matches : ");
		Matches.setFont(new Font("Exo 2 Light", Font.PLAIN, 16));
		Matches.setBounds(10, 65, 83, 26);
		profile.add(Matches);
		
		JLabel sr_1 = new JLabel("-");
		sr_1.setHorizontalAlignment(SwingConstants.CENTER);
		sr_1.setFont(new Font("Exo 2 Light", Font.PLAIN, 16));
		sr_1.setBounds(179, 65, 60, 26);
		profile.add(sr_1);
		
		JLabel playerpic = new JLabel("-");
		playerpic.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Players_Big\\Pakistan\\Shadab Khan.png"));
		playerpic.setVerticalAlignment(SwingConstants.TOP);
		playerpic.setHorizontalAlignment(SwingConstants.CENTER);
		playerpic.setFont(new Font("Exo 2 Light", Font.PLAIN, 15));
		playerpic.setBounds(970, 10, 249, 249);
		contentPane.add(playerpic);
		
		Canvas yaxis = new Canvas();
		yaxis.setBounds(70, 10, 1, 620);
		yaxis.setBackground(Color.GRAY);
		contentPane.add(yaxis);
		
		Canvas xaxis = new Canvas();
		xaxis.setBounds(70, 629, 1100, 1);
		xaxis.setBackground(Color.GRAY);
		contentPane.add(xaxis);
		
		Canvas x_2 = new Canvas();
		x_2.setBounds(180, 627, 1, 17);
		x_2.setBackground(Color.GRAY);
		contentPane.add(x_2);
		
		Canvas x_3 = new Canvas();
		x_3.setBounds(290, 627, 1, 17);
		x_3.setBackground(Color.GRAY);
		contentPane.add(x_3);
		
		Canvas x_4 = new Canvas();
		x_4.setBounds(400, 627, 1, 17);
		x_4.setBackground(Color.GRAY);
		contentPane.add(x_4);
		
		Canvas x_5 = new Canvas();
		x_5.setBounds(510, 627, 1, 17);
		x_5.setBackground(Color.GRAY);
		contentPane.add(x_5);
		
		Canvas x_6 = new Canvas();
		x_6.setBounds(620, 627, 1, 17);
		x_6.setBackground(Color.GRAY);
		contentPane.add(x_6);
		
		Canvas x_7 = new Canvas();
		x_7.setBounds(730, 627, 1, 17);
		x_7.setBackground(Color.GRAY);
		contentPane.add(x_7);
		
		Canvas x_8 = new Canvas();
		x_8.setBounds(840, 627, 1, 17);
		x_8.setBackground(Color.GRAY);
		contentPane.add(x_8);
		
		Canvas x_9 = new Canvas();
		x_9.setBounds(950, 627, 1, 17);
		x_9.setBackground(Color.GRAY);
		contentPane.add(x_9);
		
		Canvas x_10 = new Canvas();
		x_10.setBounds(1060, 627, 1, 17);
		x_10.setBackground(Color.GRAY);
		contentPane.add(x_10);
		
		Canvas y_10 = new Canvas();
		y_10.setBounds(60, 72, 16, 1);
		y_10.setBackground(Color.GRAY);
		contentPane.add(y_10);
		
		Canvas y_9 = new Canvas();
		y_9.setBounds(60, 134, 16, 1);
		y_9.setBackground(Color.GRAY);
		contentPane.add(y_9);
		
		Canvas y_8 = new Canvas();
		y_8.setBounds(60, 196, 16, 1);
		y_8.setBackground(Color.GRAY);
		contentPane.add(y_8);
		
		Canvas y_7 = new Canvas();
		y_7.setBounds(60, 258, 16, 1);
		y_7.setBackground(Color.GRAY);
		contentPane.add(y_7);
		
		Canvas y_6 = new Canvas();
		y_6.setBounds(60, 320, 16, 1);
		y_6.setBackground(Color.GRAY);
		contentPane.add(y_6);
		
		Canvas y_5 = new Canvas();
		y_5.setBounds(60, 382, 16, 1);
		y_5.setBackground(Color.GRAY);
		contentPane.add(y_5);
		
		Canvas y_4 = new Canvas();
		y_4.setBounds(60, 444, 16, 1);
		y_4.setBackground(Color.GRAY);
		contentPane.add(y_4);
		
		Canvas y_3 = new Canvas();
		y_3.setBounds(60, 506, 16, 1);
		y_3.setBackground(Color.GRAY);
		contentPane.add(y_3);
		
		Canvas y_2 = new Canvas();
		y_2.setBounds(60, 568, 16, 1);
		y_2.setBackground(Color.GRAY);
		contentPane.add(y_2);
		
		JLabel yl = new JLabel("x");
		yl.setBounds(10, 65, 46, 14);
		yl.setForeground(new Color(220, 20, 60));
		yl.setHorizontalAlignment(SwingConstants.CENTER);
		yl.setFont(new Font("Exo 2 Light", Font.PLAIN, 12));
		contentPane.add(yl);
		
		JLabel yl_1 = new JLabel("x");
		yl_1.setBounds(10, 127, 46, 14);
		yl_1.setForeground(new Color(220, 20, 60));
		yl_1.setHorizontalAlignment(SwingConstants.CENTER);
		yl_1.setFont(new Font("Exo 2 Light", Font.PLAIN, 12));
		contentPane.add(yl_1);
		
		JLabel yl_2 = new JLabel("x");
		yl_2.setBounds(10, 189, 46, 14);
		yl_2.setForeground(new Color(220, 20, 60));
		yl_2.setHorizontalAlignment(SwingConstants.CENTER);
		yl_2.setFont(new Font("Exo 2 Light", Font.PLAIN, 12));
		contentPane.add(yl_2);
		
		JLabel yl_3 = new JLabel("x");
		yl_3.setBounds(10, 251, 46, 14);
		yl_3.setForeground(new Color(220, 20, 60));
		yl_3.setHorizontalAlignment(SwingConstants.CENTER);
		yl_3.setFont(new Font("Exo 2 Light", Font.PLAIN, 12));
		contentPane.add(yl_3);
		
		JLabel yl_4 = new JLabel("x");
		yl_4.setBounds(10, 313, 46, 14);
		yl_4.setForeground(new Color(220, 20, 60));
		yl_4.setHorizontalAlignment(SwingConstants.CENTER);
		yl_4.setFont(new Font("Exo 2 Light", Font.PLAIN, 12));
		contentPane.add(yl_4);
		
		JLabel yl_5 = new JLabel("x");
		yl_5.setBounds(10, 375, 46, 14);
		yl_5.setForeground(new Color(220, 20, 60));
		yl_5.setHorizontalAlignment(SwingConstants.CENTER);
		yl_5.setFont(new Font("Exo 2 Light", Font.PLAIN, 12));
		contentPane.add(yl_5);
		
		JLabel yl_6 = new JLabel("x");
		yl_6.setBounds(10, 437, 46, 14);
		yl_6.setForeground(new Color(220, 20, 60));
		yl_6.setHorizontalAlignment(SwingConstants.CENTER);
		yl_6.setFont(new Font("Exo 2 Light", Font.PLAIN, 12));
		contentPane.add(yl_6);
		
		JLabel yl_7 = new JLabel("x");
		yl_7.setBounds(10, 499, 46, 14);
		yl_7.setForeground(new Color(220, 20, 60));
		yl_7.setHorizontalAlignment(SwingConstants.CENTER);
		yl_7.setFont(new Font("Exo 2 Light", Font.PLAIN, 12));
		contentPane.add(yl_7);
		
		JLabel yl_8 = new JLabel("x");

		yl_8.setBounds(10, 561, 46, 14);
		yl_8.setForeground(new Color(220, 20, 60));
		yl_8.setHorizontalAlignment(SwingConstants.CENTER);
		yl_8.setFont(new Font("Exo 2 Light", Font.PLAIN, 12));
		contentPane.add(yl_8);
		
		JLabel xl = new JLabel("x");
		JLabel xl_1 = new JLabel("x");
		JLabel xl_2 = new JLabel("x");
		JLabel xl_3 = new JLabel("x");
		JLabel xl_4 = new JLabel("x");
		JLabel xl_5 = new JLabel("x");
		JLabel xl_6 = new JLabel("x");
		JLabel xl_7 = new JLabel("x");
		JLabel xl_8 = new JLabel("x");

		JLabel[] yval = {yl_8, yl_7, yl_6, yl_5, yl_4, yl_3, yl_2, yl_1, yl};
		JLabel[] xval = {xl, xl_1, xl_2, xl_3, xl_4, xl_5, xl_6, xl_7, xl_8};
	    double maxy = 0;
	    
	    int[] matchc = new int[A.length];
	    MatchReader M = new MatchReader();
	    String[] adr = (new File("C:\\PowerPlay\\Tournament\\").list());
	    int count = 0;
	  
	    for(int h = 0; h<A.length;h++) {
		for(int i =0; i<adr.length;i++) {
			
			String[] adr_2 = new File("C:\\PowerPlay\\Tournament\\"+ adr[i]).list();
			
			for (int j = 0; j < adr_2.length; j++) {
				
				Match Pox = M.read("C:\\PowerPlay\\Tournament\\"+ adr[i]+"\\"+adr_2[j]);
	    	
				    for (int k = 0; k < Pox.A.length; k++) {
				    	
				    	
						if(Pox.teamA.equals(A[h].team)) {
							
							if(Pox.A[k].equals(A[h].name)) {
							
                                count++;
                                //matchc[i] = matchc[i]+1;
                                System.out.println(A[h].name + " found in team " +Pox.teamA);

							}
						}
							
							else {
								
								if(Pox.B[k].equals(A[h].name)) {
	                                //matchc[i] = matchc[i]+1;
									count++;
	                                System.out.println(A[h].name + " found in team " + Pox.teamB);
									
								}
							}

							

				    	
				    }
                 }
				    	
			   }
	    	
		      matchc[h] = count;
		      System.out.println(A[h].name + " Mathches : " + matchc[h]);
		      count = 0;
			}
		
	
	  
	    
	    double[] y = new double[A.length];
		
		for (int i = 0;i<A.length; i++) {
			
			if(i<A.length) {
			xval[i].setText(A[i].name);
			xval[i].setForeground(colors[i]);
			xval[i].setFont(new Font("Exo 2 Light", Font.BOLD, 12));
		    xval[i].setHorizontalAlignment(SwingConstants.CENTER);
			xval[i].setBounds(140+110*i, 646, 80, 14);
			contentPane.add(xval[i]);
			
			if(mode == 0) {

				if(A[i].tballs != 0) {
				Double P = new Double(A[i].truns);
				Double Q = new Double(A[i].tballs);           
				y[i] = P/Q*100;
				}
				else {
					y[i] = 0;
				}
                    //System.out.println( A[i].name + " SR = " + y[i]);
            
      
			} else if(mode == 1){
				
				if(A[i].tbballs != 0) {
				Double P = new Double(A[i].bruns);
				Double Q = new Double(A[i].tbballs);
		     	y[i] = (P/Q)*6;
		     	
				System.out.println(A[i].name);
				System.out.println(P);
				System.out.println(Q);
				}else {
					y[i] = 0;
				}

		
			}else if(mode == 2) {
				
				if(A[i].tbballs != 0) {
				Double P = new Double(A[i].twickets);
				Double Q = new Double(A[i].tbballs);
		     	y[i] = (P/Q)*6;
				}else {
					y[i] = 0;
				}
				
				
				
			}else if(mode == 3) {
				
				Double P = new Double(matchc[i]);
				Double O = new Double(A[i].twickets);
				y[i] = O/P;
				
				if(P == 0) {
					y[i] = 0;
				}
							
			}else if(mode == 4) {
				
				Double O = new Double(A[i].fours);
				Double P = new Double(matchc[i]);
				
				y[i] = O/P;
				
				if(P == 0) {
					y[i] = 0;
				}
				
			}else if(mode == 5) {
				
				Double O = new Double(A[i].sixes);
				Double P = new Double(matchc[i]);
				y[i] = O/P;
				
				if(P == 0) {
					y[i] = 0;
				}
				
			} else if(mode ==6) {
				
				Double O = new Double(A[i].fours + A[i].sixes);
				Double P = new Double(matchc[i]);
				y[i] = O/P;
				
				if(P == 0) {
					y[i] = 0;
				}
				
			}
			
	
			maxy = Math.max(y[i], maxy);
			
			}
			
			else {
				xval[i] = new JLabel("x");
				xval[i].setForeground(colors[i]);
				xval[i].setFont(new Font("Exo 2 Light", Font.BOLD, 12));
				xval[i].setHorizontalAlignment(SwingConstants.CENTER);
				xval[i].setBounds(140+110*i, 646, 80, 14);
				contentPane.add(xval[i]);
			}
		}
		
		System.out.println(maxy);
		
		for (int i = 0; i < yval.length; i++) {
			yval[i].setText(new DecimalFormat("###.##").format(maxy*(i+1)/9));
		}
		
		
		paintGraph visuals = new paintGraph(A , y , mode);
		visuals.setBounds(70, 10, 1100, 620);
		contentPane.add(visuals);
		visuals.setBackground(new Color(255,255,255));
		visuals.setLayout(null);
		visuals.setVisible(true);
		
		
	    if(mode == 1) {
	    	lblSr.setText("Economy : ");
	    }
	    else if(mode == 2) {
	    	lblSr.setText("Wickets per Over ");
	    }
	    if(mode == 3) {
	    	lblSr.setText("Wickets per Match : ");
	    }
	    if(mode == 4) {
	    	lblSr.setText("Fours : ");
	    }
	    if(mode == 5) {
	    	lblSr.setText("Sixes : ");
	    }
	    if(mode == 6) {
	    	lblSr.setText("Boundaries : ");
	    }
		
		
		xval[0].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				profile.setVisible(true);	
				sr.setText(new DecimalFormat("###.##").format(y[0]));
				pname.setText(A[0].name);
				playerpic.setVisible(true);
				playerpic.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Players_Big\\" + A[0].team+"\\" +A[0].name+".png"));
				playerpic.setText("Image does not exist");
			    sr_1.setText("" + matchc[0]);
			}			public void mouseExited(MouseEvent e) {
				
				playerpic.setVisible(false);
				profile.setVisible(false);
				
			}
		});
		
		xval[1].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				profile.setVisible(true);	
				sr.setText(new DecimalFormat("###.##").format(y[1]));
				pname.setText(A[1].name);
				playerpic.setVisible(true);
				playerpic.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Players\\" + A[1].team+"\\" +A[1].name+".png"));
				playerpic.setText("Image does not exist");
			    sr_1.setText("" + matchc[1]);
			    
			}			public void mouseExited(MouseEvent e) {
				profile.setVisible(false);
				playerpic.setVisible(false);
				
			}
		});
		
		xval[2].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				profile.setVisible(true);	
				sr.setText(new DecimalFormat("###.##").format(y[2]));
				pname.setText(A[2].name);
				playerpic.setVisible(true);
				playerpic.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Players\\" + A[2].team+"\\" +A[2].name+".png"));
				playerpic.setText("Image does not exist");
				
			    sr_1.setText("" + matchc[2]);
			}			public void mouseExited(MouseEvent e) {
				profile.setVisible(false);
				playerpic.setVisible(false);
				
			}
		});
		
		xval[3].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				profile.setVisible(true);	
				sr.setText(new DecimalFormat("###.##").format(y[3]));
				pname.setText(A[3].name);
				playerpic.setVisible(true);
				playerpic.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Players\\" + A[3].team+"\\" +A[3].name+".png"));
				playerpic.setText("Image does not exist");
			    sr_1.setText("" + matchc[3]);
			}			public void mouseExited(MouseEvent e) {
				profile.setVisible(false);
				playerpic.setVisible(false);
				
			}
		});
		
		xval[4].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				profile.setVisible(true);	
				sr.setText(new DecimalFormat("###.##").format(y[4]));
				pname.setText(A[4].name);
				playerpic.setVisible(true);
				playerpic.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Players\\" + A[4].team+"\\" +A[4].name+".png"));
				playerpic.setText("Image does not exist");
			    sr_1.setText("" + matchc[4]);
			}			public void mouseExited(MouseEvent e) {
				profile.setVisible(false);
				playerpic.setVisible(false);
				
			}
		});
		
		xval[5].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				profile.setVisible(true);	
				sr.setText(new DecimalFormat("###.##").format(y[5]));
				pname.setText(A[5].name);
				playerpic.setVisible(true);
				playerpic.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Players\\" + A[5].team+"\\" +A[5].name+".png"));
				playerpic.setText("Image does not exist");
			    sr_1.setText("" + matchc[5]);
			}			public void mouseExited(MouseEvent e) {
				profile.setVisible(false);
				playerpic.setVisible(false);
				
			}
		});
		
		xval[6].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				profile.setVisible(true);	
				sr.setText(new DecimalFormat("###.##").format(y[6]));
				pname.setText(A[6].name);
				playerpic.setVisible(true);
				playerpic.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Players\\" + A[6].team+"\\" +A[6].name+".png"));
				playerpic.setText("Image does not exist");
			    sr_1.setText("" + matchc[6]);
			    
			}			public void mouseExited(MouseEvent e) {
				profile.setVisible(false);
				playerpic.setVisible(false);
				
			}
		});
		
		xval[7].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				profile.setVisible(true);	
				sr.setText(new DecimalFormat("###.##").format(y[7]));
				pname.setText(A[7].name);
				playerpic.setVisible(true);
				playerpic.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Players\\" + A[7].team+"\\" +A[7].name+".png"));
				playerpic.setText("Image does not exist");
			    sr_1.setText("" + matchc[7]);
			}
			
			public void mouseExited(MouseEvent e) {
				profile.setVisible(false);
				playerpic.setVisible(false);
				
			}
		});
		
		xval[8].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				profile.setVisible(true);	
				sr.setText(new DecimalFormat("###.##").format(y[8]));
				pname.setText(A[8].name);
				playerpic.setVisible(true);
				playerpic.setIcon(new ImageIcon("C:\\PowerPlay\\Labels\\Players\\" + A[8].team+"\\" +A[8].name+".png"));
				playerpic.setText("Image does not exist");
			    sr_1.setText("" + matchc[8]);
				
			}
			public void mouseExited(MouseEvent e) {
				profile.setVisible(false);	
				playerpic.setVisible(false);
				
			}
		});
		
	}

	//Team Comparator Grapher
}
