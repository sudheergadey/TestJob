import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

import javax.swing.border.Border;


public class frmGame2 extends  JFrame
{

	JPanel northPanel=new JPanel();
	JPanel westPanel=new JPanel();
	JPanel centerPanel=new JPanel();
	JPanel eastPanel=new JPanel();
	JPanel southPanel=new JPanel();
	JPanel southWestPanel=new JPanel();
	JPanel southCenterPanel=new JPanel();
	JPanel westPicPanel=new JPanel();
	JLabel lblTLeft=new JLabel("Time Left", JLabel.CENTER);
	JLabel lblTime=new JLabel("180");
	JLabel lblTSec=new JLabel("sec");
	JLabel lblClick=new JLabel("Click",JLabel.CENTER);
	JLabel lblTClick=new JLabel("15",JLabel.CENTER);
	JLabel lblScoreSht=new JLabel("Score", JLabel.CENTER);
	JLabel lblScore=new JLabel("0", JLabel.CENTER);
	JLabel lblUserName=new JLabel("",JLabel.CENTER);
	JLabel lbl1=new JLabel("Black Handcerchief");
	JLabel lbl2=new JLabel("Crown");
	JLabel lbl3=new JLabel("Plastic Bug");
	JLabel lbl4=new JLabel("Lips");
	JLabel lbl5=new JLabel("Pocket Watch");
	JLabel lbl6=new JLabel("Old picture");
	JLabel lbl7=new JLabel("Bread paddle");
	JLabel lbl8=new JLabel("Comb");
	JLabel lbl9=new JLabel("Footstep");
	JSeparator line=new JSeparator();
	Timer t;
	
	JLabel handlerAns=new JLabel("0");
	int handler;
	int holder;
	
	
	String hPath;
	int numInt;
	int numPer;
	
	setPath sPath=new setPath();
	String path=sPath.setThePath(hPath);
	
	JLabel lblPause=new JLabel(new ImageIcon(path+"pause.gif"));
	JLabel lblExit=new JLabel(new ImageIcon(path+"exit.gif"));
	JLabel lblPic=new JLabel(new ImageIcon( path + "gamePage3.gif"));
	JLabel lblGamePic=new JLabel(new ImageIcon(path + "lib.gif"));
	JLabel lblSPic=new JLabel(new ImageIcon (path + "ghost_animated.gif"));
	JLabel lblPic1=new JLabel(new ImageIcon (path + "hand clock.gif"));
	JLabel lblPic2=new JLabel(new ImageIcon (path + "breadLapad.gif"));
	JLabel lblPic3=new JLabel(new ImageIcon (path + "crown.gif"));
	JLabel lblPic4=new JLabel(new ImageIcon (path + "Old pic.gif"));
	JLabel lblPic5=new JLabel(new ImageIcon (path + "toy.gif"));
	JLabel lblPic6=new JLabel(new ImageIcon (path + "black hand.gif"));
	JLabel lblPic7=new JLabel(new ImageIcon (path + "lips.gif"));
	JLabel lblPic8=new JLabel(new ImageIcon (path + "comb.gif"));
	JLabel lblPic9=new JLabel(new ImageIcon (path + "footsteep.gif"));
	JLabel lblHolderSPic=new JLabel(new ImageIcon(path + "SPic.gif")); 
	JLabel lblHolderEPic=new JLabel(new ImageIcon(path + "EPic.gif")); 
	JLabel lblPlay=new JLabel(new ImageIcon(path + "play.gif")); 

	
	
	public frmGame2()
	{
		
		function func=new function();
		func.MousePointer(this);

		northPanel.setBackground(Color.DARK_GRAY);
		westPanel.setBackground(Color.DARK_GRAY);
		centerPanel.setBackground(Color.DARK_GRAY);
		southPanel.setBackground(Color.DARK_GRAY);
		eastPanel.setBackground(Color.DARK_GRAY);
		southWestPanel.setBackground(Color.DARK_GRAY);
		southCenterPanel.setBackground(Color.DARK_GRAY);
		westPicPanel.setBackground(Color.DARK_GRAY);
		
		
		
		
		
		
		lblUserName.setFont(new Font("OCR A Extended", Font.BOLD, 12));
		lblTLeft.setFont(new Font("OCR A Extended", Font.BOLD, 16));
		lblTime.setFont(new Font("OCR A Extended", Font.PLAIN, 14));
		lblTSec.setFont(new Font("OCR A Extended", Font.PLAIN, 10));
		lblClick.setFont(new Font("OCR A Extended", Font.BOLD, 17));
		lblTClick.setFont(new Font("OCR A Extended", Font.PLAIN, 14));
		lblScoreSht.setFont(new Font("OCR A Extended", Font.BOLD, 17));
		lblScore.setFont(new Font("OCR A Extended", Font.PLAIN, 14));
		
		lblUserName.setForeground(Color.RED);
		lblTLeft.setForeground(Color.GRAY);
		lblTime.setForeground(Color.GRAY);
		lblTSec.setForeground(Color.GRAY);
		lblClick.setForeground(Color.GRAY);
		lblTClick.setForeground(Color.GRAY);
		lblScoreSht.setForeground(Color.GRAY);
		lblScore.setForeground(Color.GRAY);
		
		
		
		
		
		northPanel.add(lblPic);
		
		
		lblGamePic.add(lblPic1);
		lblGamePic.add(lblPic2);
		lblGamePic.add(lblPic3);
		lblGamePic.add(lblPic4);
		lblGamePic.add(lblPic5);
		lblGamePic.add(lblPic6);
		lblGamePic.add(lblPic7);
		lblGamePic.add(lblPic8);
		lblGamePic.add(lblPic9);
		lblPic7.setBounds(200,200,20,20);
		lblPic2.setBounds(10,25,90,20);
		lblPic3.setBounds(450,200,30,30);
		lblPic4.setBounds(350,300,40,55);
		lblPic5.setBounds(60,320,40,40);
		lblPic6.setBounds(340,190,60,40);
		lblPic1.setBounds(27,160,30,20);
		lblPic8.setBounds(415,-20,60,140);
		lblPic9.setBounds(360,10,20,20);
		
		
		westPanel.add(westPicPanel);
		westPanel.add(lblGamePic);
	
		
	
		
	
		
		
		lblHolderEPic.add(lblUserName);
		lblHolderEPic.add(lblTLeft);
		lblHolderEPic.add(lblTime);
		lblHolderEPic.add(lblTSec);
		lblHolderEPic.add(lblClick);
		lblHolderEPic.add(lblTClick);
		lblHolderEPic.add(lblScoreSht);
		lblHolderEPic.add(lblScore);
		
		lblHolderEPic.add(lblPause);
		lblHolderEPic.add(lblPlay);
		lblHolderEPic.add(lblExit);
		
		lblUserName.setBounds(0,10,100,30);
		lblTLeft.setBounds(0,60,100,30);
		lblTime.setBounds(25,80,100,30);
		lblTSec.setBounds(60,80,100,30);
		lblClick.setBounds(0,130,100,30);
		lblTClick.setBounds(0,150,100,30);
		lblScoreSht.setBounds(0,200,100,30);
		lblScore.setBounds(0,220,100,30);
		
		lblPause.setBounds(0,270,100,30);
		lblPlay.setBounds(0,270,100,30);
		lblPlay.setVisible(false);
		lblExit.setBounds(0,310,100,30);
		
		centerPanel.add(lblHolderEPic);
		
		
		lblHolderSPic.add(lblSPic);
		lblHolderSPic.add(lbl1);
		lblHolderSPic.add(lbl2);
		lblHolderSPic.add(lbl3);
		lblHolderSPic.add(lbl4);
		lblHolderSPic.add(lbl5);
		lblHolderSPic.add(lbl6);
		lblHolderSPic.add(lbl7);
		lblHolderSPic.add(lbl8);
		lblHolderSPic.add(lbl9);
		lbl1.setFont(new Font("OCR A Extended", Font.PLAIN, 15));
		lbl2.setFont(new Font("OCR A Extended", Font.PLAIN, 15));
		lbl3.setFont(new Font("OCR A Extended", Font.PLAIN, 15));
		lbl4.setFont(new Font("OCR A Extended", Font.PLAIN, 15));
		lbl5.setFont(new Font("OCR A Extended", Font.PLAIN, 15));
		lbl6.setFont(new Font("OCR A Extended", Font.PLAIN, 15));
		lbl7.setFont(new Font("OCR A Extended", Font.PLAIN, 15));
		lbl8.setFont(new Font("OCR A Extended", Font.PLAIN, 15));
		lbl9.setFont(new Font("OCR A Extended", Font.PLAIN, 15));
		lbl1.setForeground(Color.GRAY);
		lbl2.setForeground(Color.GRAY);
		lbl3.setForeground(Color.GRAY);
		lbl4.setForeground(Color.GRAY);
		lbl5.setForeground(Color.GRAY);
		lbl6.setForeground(Color.GRAY);
		lbl7.setForeground(Color.GRAY);
		lbl8.setForeground(Color.GRAY);
		lbl9.setForeground(Color.GRAY);
		
		southPanel.add(lblHolderSPic);
		
		lblSPic.setBounds(420,0,155,110);
		lbl1.setBounds(30,20,170,20);
		lbl9.setBounds(30,40,140,20);
		lbl7.setBounds(30,60,140,20);
		
		lbl3.setBounds(230,20,140,20);
		lbl5.setBounds(230,40,140,20);
		lbl6.setBounds(230,60,140,20);
		
		lbl2.setBounds(350,20,140,20);
		lbl8.setBounds(350,40,140,20);
		lbl4.setBounds(350,60,140,20);
		
		//southPanel.setLayout(new BorderLayout());
		//southPanel.add(BorderLayout.WEST,southWestPanel);
		//southPanel.add(BorderLayout.CENTER,southCenterPanel);
		//southWestPanel.setLayout(new BorderLayout());
		getContentPane().add(BorderLayout.NORTH,northPanel);
		getContentPane().add(BorderLayout.WEST,westPanel);
		
		//southCenterPanel.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		
		
		
		
		setTitle("Find me");
		setLocation(350,100);
		setSize(625,550);
		setResizable(false);
	
		getContentPane().add(BorderLayout.NORTH,northPanel);
		getContentPane().add(BorderLayout.WEST,westPanel);
		getContentPane().add(BorderLayout.CENTER,centerPanel);
		getContentPane().add(BorderLayout.EAST,eastPanel);
		getContentPane().add(BorderLayout.SOUTH,southPanel);
		
		
		t = new Timer(700, new ActionListener()
		{
	          public void actionPerformed(ActionEvent e)
	          {
	              numInt=Integer.parseInt(lblTime.getText());
	              numPer=numInt - 1;
	              lblTime.setText(Integer.toString(numPer));
	              
	              if (lblTime.getText().equals("0"))
	              {
	            	 	t.stop();
	            	 	frmLose2 lose=new frmLose2();
		            	lose.setVisible(true);
		            	dispose();
	            	 	
	              }
	              
	          }
	     });
		
		t.start();
		
		lblPause.addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent e)
			{
				t.stop();
				lblGamePic.setVisible(false);
				lblPause.setVisible(false);
				lblPlay.setVisible(true);
			}
			
		});
		
		
		lblPic1.addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent e)
			{
				handler=Integer.parseInt(handlerAns.getText());
				holder=handler+1;
	            handlerAns.setText(Integer.toString(holder));
	            
	            if (handlerAns.getText().equals("9"))
	            {
	            	t.stop();
	            	lblPic1.setVisible(false);
	            	lbl5.setForeground(Color.DARK_GRAY);
	            	numInt=Integer.parseInt(lblScore.getText());
	            	numPer=numInt + 120;
	            	lblScore.setText(Integer.toString(numPer));
	            	frmWin2 win=new frmWin2();
	            	win.lblUsername.setText(lblUserName.getText());
	            	dispose();
	            }
	            else
	            {
	            	
	            	lblPic1.setVisible(false);
	            	lbl5.setForeground(Color.DARK_GRAY);
	            	numInt=Integer.parseInt(lblScore.getText());
	            	numPer=numInt + 120;
	            	lblScore.setText(Integer.toString(numPer));
	            }
			}
		});
		
		lblPic2.addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent e)
			{
				handler=Integer.parseInt(handlerAns.getText());
				holder=handler+1;
	            handlerAns.setText(Integer.toString(holder));
	            
	            if (handlerAns.getText().equals("9"))
	            {
	            	t.stop();
	            	lblPic2.setVisible(false);
	            	lbl7.setForeground(Color.DARK_GRAY);
	            	numInt=Integer.parseInt(lblScore.getText());
	            	numPer=numInt + 120;
	            	lblScore.setText(Integer.toString(numPer));
	            	frmWin2 win=new frmWin2();
	            	win.lblUsername.setText(lblUserName.getText());
	            	dispose();
	            }
	            else
	            {
	            	
	            	lblPic2.setVisible(false);
	            	lbl7.setForeground(Color.DARK_GRAY);
	            	numInt=Integer.parseInt(lblScore.getText());
	            	numPer=numInt + 120;
	            	lblScore.setText(Integer.toString(numPer));
	            }
			}
		});
		
		lblPic3.addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent e)
			{
				handler=Integer.parseInt(handlerAns.getText());
				holder=handler+1;
	            handlerAns.setText(Integer.toString(holder));
	            
	            if (handlerAns.getText().equals("9"))
	            {
	            	t.stop();
	            	lblPic3.setVisible(false);
	            	lbl2.setForeground(Color.DARK_GRAY);
	            	numInt=Integer.parseInt(lblScore.getText());
	            	numPer=numInt + 120;
	            	lblScore.setText(Integer.toString(numPer));
	            	frmWin2 win=new frmWin2();
	            	win.lblUsername.setText(lblUserName.getText());
	            	dispose();
	            }
	            else
	            {
	            	
	            	lblPic3.setVisible(false);
	            	lbl2.setForeground(Color.DARK_GRAY);
	            	numInt=Integer.parseInt(lblScore.getText());
	            	numPer=numInt + 120;
	            	lblScore.setText(Integer.toString(numPer));
	            }
			}
		});
		
		lblPic4.addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent e)
			{
				handler=Integer.parseInt(handlerAns.getText());
				holder=handler+1;
	            handlerAns.setText(Integer.toString(holder));
	            
	            if (handlerAns.getText().equals("9"))
	            {
	            	t.stop();
	            	lblPic4.setVisible(false);
	            	lbl6.setForeground(Color.DARK_GRAY);
	            	numInt=Integer.parseInt(lblScore.getText());
	            	numPer=numInt + 120;
	            	lblScore.setText(Integer.toString(numPer));
	            	frmWin2 win=new frmWin2();
	            	win.lblUsername.setText(lblUserName.getText());
	            	dispose();
	            }
	            else
	            {
	            	
	            	lblPic4.setVisible(false);
	            	lbl6.setForeground(Color.DARK_GRAY);
	            	numInt=Integer.parseInt(lblScore.getText());
	            	numPer=numInt + 120;
	            	lblScore.setText(Integer.toString(numPer));
	            }
			}
		});
		
		lblPic5.addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent e)
			{
				handler=Integer.parseInt(handlerAns.getText());
				holder=handler+1;
	            handlerAns.setText(Integer.toString(holder));
	            
	            if (handlerAns.getText().equals("9"))
	            {
	            	t.stop();
	            	lblPic5.setVisible(false);
					lbl3.setForeground(Color.DARK_GRAY);
					numInt=Integer.parseInt(lblScore.getText());
					numPer=numInt + 120;
					lblScore.setText(Integer.toString(numPer));
					frmWin2 win=new frmWin2();
	            	win.lblUsername.setText(lblUserName.getText());
	            	dispose();
	            }
	            else
	            {
	            	
	            	lblPic5.setVisible(false);
	            	lbl3.setForeground(Color.DARK_GRAY);
	            	numInt=Integer.parseInt(lblScore.getText());
	            	numPer=numInt + 120;
	            	lblScore.setText(Integer.toString(numPer));
	            	lblPic5.setVisible(false);
	            	lbl3.setForeground(Color.DARK_GRAY);
	            	numInt=Integer.parseInt(lblScore.getText());
	            	numPer=numInt + 120;
	            	lblScore.setText(Integer.toString(numPer));
	            }
			}
		});
		
		lblPic6.addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent e)
			{
				handler=Integer.parseInt(handlerAns.getText());
				holder=handler+1;
	            handlerAns.setText(Integer.toString(holder));
	            
	            if (handlerAns.getText().equals("9"))
	            {
	            	t.stop();
	            	lblPic6.setVisible(false);
					lbl1.setForeground(Color.DARK_GRAY);
					numInt=Integer.parseInt(lblScore.getText());
					numPer=numInt + 120;
					lblScore.setText(Integer.toString(numPer));
					frmWin2 win=new frmWin2();
	            	win.lblUsername.setText(lblUserName.getText());
	            	dispose();
	            }
	            else
	            {
	            	
	            	lblPic6.setVisible(false);
					lbl1.setForeground(Color.DARK_GRAY);
					numInt=Integer.parseInt(lblScore.getText());
					numPer=numInt + 120;
					lblScore.setText(Integer.toString(numPer));
	            }
			
			}
		});
		
		lblPic7.addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent e)
			{
				handler=Integer.parseInt(handlerAns.getText());
				holder=handler+1;
	            handlerAns.setText(Integer.toString(holder));
	            
	            if (handlerAns.getText().equals("9"))
	            {
	            	t.stop();
	            	lblPic7.setVisible(false);
	            	lbl4.setForeground(Color.DARK_GRAY);
	            	numInt=Integer.parseInt(lblScore.getText());
	            	numPer=numInt + 120;
	            	lblScore.setText(Integer.toString(numPer));
	            	
	            	frmWin2 win=new frmWin2();
	            	win.lblUsername.setText(lblUserName.getText());
	            	dispose();
	            }
	            else
	            {
	            	
	            	lblPic7.setVisible(false);
	            	lbl4.setForeground(Color.DARK_GRAY);
	            	numInt=Integer.parseInt(lblScore.getText());
	            	numPer=numInt + 120;
	            	lblScore.setText(Integer.toString(numPer));
	            }
			}
		});
		
		lblPic8.addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent e)
			{
				handler=Integer.parseInt(handlerAns.getText());
				holder=handler+1;
	            handlerAns.setText(Integer.toString(holder));
	            
	            if (handlerAns.getText().equals("9"))
	            {
	            	t.stop();
	            	
	            	lblPic8.setVisible(false);
	            	lbl8.setForeground(Color.DARK_GRAY);
	            	numInt=Integer.parseInt(lblScore.getText());
	            	numPer=numInt + 120;
	            	lblScore.setText(Integer.toString(numPer));
	            	
	            	frmWin2 win=new frmWin2();
	            	win.lblUsername.setText(lblUserName.getText());
	            	dispose();
	            }
	            else
	            {
	            	
	            	lblPic8.setVisible(false);
	            	lbl8.setForeground(Color.DARK_GRAY);
	            	numInt=Integer.parseInt(lblScore.getText());
	            	numPer=numInt + 120;
	            	lblScore.setText(Integer.toString(numPer));
	            }
			}
		});
		
		lblPic9.addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent e)
			{
				handler=Integer.parseInt(handlerAns.getText());
				holder=handler+1;
	            handlerAns.setText(Integer.toString(holder));
	            
	            if (handlerAns.getText().equals("9"))
	            {
	            	t.stop();
	            	lblPic9.setVisible(false);
	            	lbl9.setForeground(Color.DARK_GRAY);
	            	numInt=Integer.parseInt(lblScore.getText());
	            	numPer=numInt + 120;
	            	lblScore.setText(Integer.toString(numPer));
	            	frmWin2 win=new frmWin2();
	            	win.lblUsername.setText(lblUserName.getText());
	            	dispose();
	            }
	            else
	            {
	            	
	            	lblPic9.setVisible(false);
	            	lbl9.setForeground(Color.DARK_GRAY);
	            	numInt=Integer.parseInt(lblScore.getText());
	            	numPer=numInt + 120;
	            	lblScore.setText(Integer.toString(numPer));
	            }
			}
		});
		
		lblGamePic.addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent e)
			{
				numInt=Integer.parseInt(lblTClick.getText());
	            numPer=numInt - 1;
	            lblTClick.setText(Integer.toString(numPer));
	            if (lblTClick.getText().equals("0"))
	            {
	            	dispose();
	            	frmLose2 lose=new frmLose2();
	            	lose.setVisible(true);
	            	frmMainMenu game=new frmMainMenu();
	            	game.setVisible(true);
	            	
	            }
			}
		});
		
		lblExit.addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent e)
			{
				frmMainMenu menu=new frmMainMenu();
				menu.setVisible(true);
				dispose();
			}
		});
		
		
		
		
		
		lblPause.addMouseListener(new MouseAdapter()
		{
			public void mouseEntered(MouseEvent arg0)
			{
				lblPause.setIcon( new ImageIcon(path + "pause2.gif") );

		    }
		});
		
		lblPause.addMouseListener(new MouseAdapter()
		{
		     public void mouseExited(MouseEvent arg0) 
		     {
		    	 lblPause.setIcon( new ImageIcon(path + "pause.gif") );
		     }
		});
		
		lblExit.addMouseListener(new MouseAdapter()
		{
			public void mouseEntered(MouseEvent arg0)
			{
				lblExit.setIcon( new ImageIcon(path + "exit2.gif") );

		    }
		});
		
		lblExit.addMouseListener(new MouseAdapter()
		{
		     public void mouseExited(MouseEvent arg0) 
		     {
		    	 lblExit.setIcon( new ImageIcon(path + "exit.gif") );
		     }
		});
		
		lblPlay.addMouseListener(new MouseAdapter()
		{
			public void mouseEntered(MouseEvent arg0)
			{
				lblPlay.setIcon( new ImageIcon(path + "play2.gif") );

		    }
		});
		
		lblPlay.addMouseListener(new MouseAdapter()
		{
		     public void mouseExited(MouseEvent arg0) 
		     {
		    	 lblPlay.setIcon( new ImageIcon(path + "play.gif") );
		     }
		});
		
		lblPlay.addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent e)
			{
				t.start();
				lblGamePic.setVisible(true);
				lblPause.setVisible(true);
				lblPlay.setVisible(false);
			}
			
		});

		addWindowListener(new WindowAdapter() 
		{
			  public void windowClosing(WindowEvent we) 
			  {
						System.exit(0);
			  }
		});
		
		
		
	}
	
	public static void main()
	{
		
		
		frmGame2 game=new frmGame2();
		game.setTitle("Find me");
		game.setVisible(true);
		
		
	}
}
