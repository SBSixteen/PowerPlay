import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Stroke;
import java.io.File;
import java.text.DecimalFormat;
import javax.swing.JPanel;

 class paintGraph extends JPanel{

	    int mode = 0;
	    boolean srbfmode = false;
	    boolean ebfmode;
		Color[] colors = {new Color(0,128,128), new Color(140,20,20),new Color(133,129,255), new Color(151,167,40), new Color(255,179,0), new Color(122,0,147), new Color(147,97,85), new Color(0,46,36),new Color(255,46,36)};
		double SR[];
		double maxy;
		double act[];
		double bf[] = new double[9];
		
		//Team Bowling representation
		//Team Batting representation
		
		//Graphs for 
		paintGraph(Player A, double[] y,int state){
			
			System.out.println(y);
			act = y;
			mode = state;
			SR = new double[y.length];
			setBounds(70, 10, 1100, 620);
		
			for(int i =0;i<y.length;i++) {	
				System.out.println(y[i]);
				maxy = Math.max(maxy, y[i]);
			}
				
			for (int i = 0; i < y.length; i++) {

				SR[i] = Math.abs(((y[i]/maxy)*558) -(620));
				System.out.println(SR[i]);
						
			}
			
		}
		
		//SR of Collection of Batsmen
		paintGraph(Player[] A, double[] y ,int state){
			
			act = y;
			mode = state;
			SR = new double[A.length];
			setBounds(70, 10, 1100, 620);
		
			for(int i =0;i<y.length;i++) {		
				maxy = Math.max(maxy, y[i]);
			}
				
			for (int i = 0; i < y.length; i++) {

				SR[i] = Math.abs(((y[i]/maxy)*558) -(620));
						
			}
			
		}
		
		paintGraph(String[] A, double[] y ,int state){
			
			act = y;
			mode = state;
			SR = new double[A.length];
			setBounds(70, 10, 1100, 620);
		
			for(int i =0;i<y.length;i++) {		
				maxy = Math.max(maxy, y[i]);
			}
				
			for (int i = 0; i < y.length; i++) {

				SR[i] = Math.abs(((y[i]/maxy)*558) -(620));
						
			}
			
		}
		
		
		void drawRForm(Graphics g) {
			
            var g2d = (Graphics2D) g;		
		  	g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		 	
			Color Line = new Color(0,0,0);
            Stroke dashed = new BasicStroke(1, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0 , new float[] {9}, 0);
			
            int initialx = 110;

            //Print Reference
			for (int i = 0; i < SR.length; i++) 
			
			  {
				g2d.setStroke(dashed);
				g2d.setColor(Color.LIGHT_GRAY);
				g2d.drawLine(initialx*(0), (int)Math.round(SR[i]), initialx*(i+1) , (int)(Math.round(SR[i])));
				g2d.setColor(colors[i]);
				g2d.setStroke(new BasicStroke(2));
				g2d.drawOval(initialx*(i+1)-5, (int)Math.round(SR[i])-5, 10, 10);
				System.out.println( "use as Y["+i+ "] = "+ (SR[i]-620));
				g2d.setColor(colors[i]);
				g2d.setStroke(dashed);
				g2d.drawLine(initialx*(i+1) , (int)(Math.round(SR[i])) , 1100, (int)(Math.round(SR[i])) );
				g2d.drawLine(initialx*(i+1) , 620 , initialx*(i+1), (int)(Math.round(SR[i])) );
				g2d.setFont(new Font("Exo 2 Light", Font.BOLD, 12));
				if(mode == 29) {
					g2d.drawString("S/R = " +new DecimalFormat("###.##").format(act[i]), 1000, (int)(Math.round(SR[i])-2));
				}
				else if(mode == 30) {
					g2d.drawString("4s = " +new DecimalFormat("###.##").format(act[i]), 1000, (int)(Math.round(SR[i])-2));
				}
				else if(mode == 31) {
					g2d.drawString("6s = " +new DecimalFormat("###.##").format(act[i]), 1000, (int)(Math.round(SR[i])-2));
				}
				else if(mode == 32) {
					g2d.drawString("4s + 6s = " +new DecimalFormat("###.##").format(act[i]), 1000, (int)(Math.round(SR[i])-2));
				}
				else if(mode == 33) {
					g2d.drawString("Endurance = " +new DecimalFormat("###.##").format(act[i]), 1000, (int)(Math.round(SR[i])-2));
				}
				else if(mode == 34) {
					g2d.drawString("Economy = " +new DecimalFormat("###.##").format(act[i]), 1000, (int)(Math.round(SR[i])-2));
				}
				else if(mode == 35) {
					g2d.drawString("Wickets = " +new DecimalFormat("###.##").format(act[i]), 1000, (int)(Math.round(SR[i])-2));
				}
				else if(mode == 36) {
					g2d.drawString("RC = " +new DecimalFormat("###.##").format(act[i]), 1000, (int)(Math.round(SR[i])-2));
				}		
				
			}
			
			//Best Fit Line
			
			int xsum = 0;
			int ysum = 0;
			
			for (int i = 0; i < SR.length; i++) {
				
				xsum = initialx*(i+1) + xsum;
				ysum = (int) SR[i] + ysum;
				
			}
			
			System.out.println(xsum + " = xsum");
			System.out.println(ysum + " = ysum");

			ysum = ysum/SR.length;
			xsum = xsum/SR.length;
			
			System.out.println(xsum + " = xmean");
			System.out.println(ysum + " = ymean");
			
			int[] bfx = new int[SR.length];
			int[] bfy = new int[SR.length];
			int[] bfx_2 = new int[SR.length];
			int[] use = new int[SR.length];
			
			int sumuse   = 0;
			int sumbfx_2 = 0; 
			
			for (int i = 0; i < SR.length; i++) {
				
				bfx[i] = initialx*(i+1)-xsum;
				int temp = (int)(SR[i]);
				System.out.println(temp);
				bfy[i] = temp-ysum;
				bfx_2[i] = bfx[i]*bfx[i];	
				use[i] = bfx[i]*bfy[i]; 			
				sumuse = sumuse + use[i];
				sumbfx_2 = sumbfx_2+bfx_2[i];
				
			}
			
			if(mode > 28) {
				srbfmode= true;
			}
			
			Double one = new Double(sumbfx_2);
			Double two = new Double(sumuse);
			double gradient = two/one;
			double yint =  ysum - (xsum*gradient);
            
			double[] yuse = new double[SR.length]; 
			
			for (int i = 0; i < SR.length; i++) {
				yuse[i] =(gradient)*initialx*(i+1) + yint;
				System.out.println(yuse[i]);
				//yuse[i] = 620- 558 + (yuse[i]);
				System.out.println("yuse ["+ i + "] = "+ (int)yuse[i]);
			}
			
			// Print Graph
			g2d.setColor(Line);
			for(int i =0; i<SR.length-1;i++) {
		        
				if(srbfmode == true) {
				g2d.setStroke(new BasicStroke(1));
				g2d.drawLine(initialx*(i+1), (int)Math.round(yuse[i]), initialx*(i+2) , (int)(Math.round(yuse[i+1])));
				}
				else {		
				g2d.setStroke(new BasicStroke(2));
				g2d.drawLine(initialx*(i+1), (int)Math.round(SR[i]), initialx*(i+2) , (int)(Math.round(SR[i+1])));
				}

			}
			
			
		}
		
		void drawSR(Graphics g){
			
			var g2d = (Graphics2D) g;
			
			g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
			
			Color Line = new Color(0,0,0);
            Stroke dashed = new BasicStroke(1, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0 , new float[] {9}, 0);
			
            int initialx = 110;

            //Print Reference
			for (int i = 0; i < SR.length; i++) 
			
			  {
				g2d.setStroke(new BasicStroke(1));
				g2d.setColor(Color.LIGHT_GRAY);
				g2d.drawLine(initialx*(0), (int)Math.round(SR[i]), initialx*(i+1) , (int)(Math.round(SR[i])));
				g2d.setColor(colors[i]);
				g2d.drawOval(initialx*(i+1)-5, (int)Math.round(SR[i])-5, 10, 10);
				g2d.setColor(colors[i]);
				g2d.setStroke(dashed);
				g2d.drawLine(initialx*(i+1) , (int)(Math.round(SR[i])) , 1100, (int)(Math.round(SR[i])) );
				g2d.drawLine(initialx*(i+1) , 620 , initialx*(i+1), (int)(Math.round(SR[i])) );
				g2d.setFont(new Font("Exo 2 Light", Font.BOLD, 12));
				if(mode == 0) {
				g2d.drawString("S/R = " +new DecimalFormat("###.##").format(act[i]), 1020, (int)(Math.round(SR[i])-2) );
				}else if(mode == 1) {
					g2d.drawString("Economy = " +new DecimalFormat("###.##").format(act[i]), 1010, (int)(Math.round(SR[i])-2));
				}else if(mode == 2) {
					g2d.drawString("W/Over = " +new DecimalFormat("###.##").format(act[i]), 1010, (int)(Math.round(SR[i])-2));
				}else if(mode == 3) {
					g2d.drawString("W/Match = " +new DecimalFormat("###.##").format(act[i]), 1010, (int)(Math.round(SR[i])-2));
				}
				else if(mode == 4) {
					g2d.drawString("4s/Match = " +new DecimalFormat("###.##").format(act[i]), 1010, (int)(Math.round(SR[i])-2));
				}else if(mode == 5) {
					g2d.drawString("6s/Match = " +new DecimalFormat("###.##").format(act[i]), 1010, (int)(Math.round(SR[i])-2));
				}else if(mode == 6) {
					g2d.drawString("Bs/Match = " +new DecimalFormat("###.##").format(act[i]), 1000, (int)(Math.round(SR[i])-2));
				}else if(mode == 8) {
					g2d.drawString("Runs/Over = " +new DecimalFormat("###.##").format(act[i]), 1000, (int)(Math.round(SR[i])-2));
				}else if(mode == 9) {
					g2d.drawString("R/Matches = " +new DecimalFormat("###.##").format(act[i]), 1000, (int)(Math.round(SR[i])-2));
				}	else if(mode == 10) {
					g2d.drawString("Balls/W = " +new DecimalFormat("###.##").format(act[i]), 1000, (int)(Math.round(SR[i])-2));
				}
				else if(mode == 11) {
					g2d.drawString("Balls/M = " +new DecimalFormat("###.##").format(act[i]), 1000, (int)(Math.round(SR[i])-2));
				}
				else if(mode == 12) {
					g2d.drawString("Overs/W = " +new DecimalFormat("###.##").format(act[i]), 1000, (int)(Math.round(SR[i])-2));
				}
				else if(mode == 13) {
					g2d.drawString("Wickets/M = " +new DecimalFormat("###.##").format(act[i]), 1000, (int)(Math.round(SR[i])-2));
				}
				else if(mode == 14) {
					g2d.drawString("Overs/4s = " +new DecimalFormat("###.##").format(act[i]), 1000, (int)(Math.round(SR[i])-2));
				}
				else if(mode == 15) {
					g2d.drawString("4s/M = " +new DecimalFormat("###.##").format(act[i]), 1000, (int)(Math.round(SR[i])-2));
				}
				else if(mode == 16) {
					g2d.drawString("Overs/6s = " +new DecimalFormat("###.##").format(act[i]), 1000, (int)(Math.round(SR[i])-2));
				}
				else if(mode == 17) {
					g2d.drawString("6s/M = " +new DecimalFormat("###.##").format(act[i]), 1000, (int)(Math.round(SR[i])-2));
				}
				else if(mode == 18) {
					g2d.drawString("Overs/(4s+6s) = " +new DecimalFormat("###.##").format(act[i]), 1000, (int)(Math.round(SR[i])-2));
				}
				else if(mode == 19) {
					g2d.drawString("(4s + 6s)/M = " +new DecimalFormat("###.##").format(act[i]), 1000, (int)(Math.round(SR[i])-2));
				}
				else if(mode ==21) {
					g2d.drawString("S/R = " +new DecimalFormat("###.##").format(act[i]), 1000, (int)(Math.round(SR[i])-2));
				}
				else if(mode == 22) {
					g2d.drawString("4s = " +new DecimalFormat("###.##").format(act[i]), 1000, (int)(Math.round(SR[i])-2));
				}
				else if(mode == 23) {
					g2d.drawString("6s = " +new DecimalFormat("###.##").format(act[i]), 1000, (int)(Math.round(SR[i])-2));
				}
				else if(mode == 24) {
					g2d.drawString("4s + 6s = " +new DecimalFormat("###.##").format(act[i]), 1000, (int)(Math.round(SR[i])-2));
				}
				else if(mode == 25) {
					g2d.drawString("Endurance = " +new DecimalFormat("###.##").format(act[i]), 1000, (int)(Math.round(SR[i])-2));
				}
				else if(mode == 26) {
					g2d.drawString("Economy = " +new DecimalFormat("###.##").format(act[i]), 1000, (int)(Math.round(SR[i])-2));
				}
				else if(mode == 27) {
					g2d.drawString("Wickets = " +new DecimalFormat("###.##").format(act[i]), 1000, (int)(Math.round(SR[i])-2));
				}
				else if(mode == 28) {
					g2d.drawString("RC = " +new DecimalFormat("###.##").format(act[i]), 1000, (int)(Math.round(SR[i])-2));
				}
				
			}
			
			

			// Print Graph
			g2d.setColor(Line);
			for(int i =0; i<SR.length-1;i++) {
				
				System.out.println(SR[i]);
				g2d.setStroke(new BasicStroke(2));
				g2d.drawLine(initialx*(i+1), (int)Math.round(SR[i]), initialx*(i+2) , (int)(Math.round(SR[i+1])));

			}
			
			
			
		}
		@Override
		protected void paintComponent(Graphics g) { 
			
			super.paintComponent(g);		
			if(mode < 29) {
			drawSR(g);
			}else {
				drawRForm(g);
			}
		}
				
		public static void main(String[] args) {
			
			PlayerReader P = new PlayerReader();
			int stats[][] = new int[9][2];
			int index[] = new int[9];
			
			Player X = P.read("Austrailia", "Aaron Finch");
		    MatchLL list = new MatchLL();
			MatchReader Read = new MatchReader();
		    
			//paintGraph A = new paintGraph(X);
			
			int count = 0;
			
			String[] adr = (new File("C:\\PowerPlay\\Tournament\\").list());
			
			for(int i =0; i<adr.length;i++) {
				
				String[] adr_2 = new File("C:\\PowerPlay\\Tournament\\"+ adr[i]).list();
				
				for (int j = 0; j < adr_2.length; j++) {
					
					Match Pox = Read.read("C:\\PowerPlay\\Tournament\\"+ adr[i]+"\\"+adr_2[j]);
					
					for(int k = 0; k<Pox.A.length;k++) {
						

						
					}
					
					
				}
			
			}
			
			
		}
		
	}