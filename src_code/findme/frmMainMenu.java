
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;





public class frmMainMenu extends  JFrame
{


    
	JPanel picPanel=new JPanel();
	JPanel butPanel=new JPanel();
	JPanel titlePanel=new JPanel();
	JPanel sidePanel=new JPanel();
	JPanel northPanel=new JPanel();
	JPanel playPanel=new JPanel();
	JPanel insPanel=new JPanel();
	JPanel highPanel=new JPanel();
    JPanel backPanel=new JPanel();
    JPanel creditPanel=new JPanel();
	

	JLabel lblUsername=new JLabel("Username");
	JTextField txtUsername=new JTextField(25);
	
	


    
    
	String ins="";
	String hPath;


	setPath sPath=new setPath();
	String path=sPath.setThePath(hPath);
	
	JLabel lblMenu=new JLabel(new ImageIcon(path + "menu.gif"));
	JLabel cmdPlay=new JLabel(new ImageIcon(path + "playMenu.gif"));
	JLabel cmdIns=new JLabel(new ImageIcon(path + "ins.gif"));
	JLabel cmdCre=new JLabel(new ImageIcon(path + "credit.gif"));
	JLabel cmdHigh=new JLabel(new ImageIcon(path + "score.gif"));
	JLabel cmdExit=new JLabel(new ImageIcon(path + "exitMenu.gif"));
	JLabel lblPic=new JLabel(new ImageIcon( path + "back.gif"));
	JLabel lblTitle=new JLabel(new ImageIcon( path + "AnimatedGhost1.gif"));
	JLabel lblStat=new JLabel(new ImageIcon(path +"gamePage3.gif"));
	JLabel lblIns=new JLabel(new ImageIcon(path +"instruction.gif"));
	JLabel lblHighScore=new JLabel(new ImageIcon(path +"highScore.gif"));
	JLabel lblCredit=new JLabel(new ImageIcon(path +"crePro.gif"));
	JLabel cmdGame =new JLabel(new ImageIcon(path +"next2.gif"));
	JLabel cmdBack=new JLabel(new ImageIcon(path +"back2.gif"));
	
	JLabel lblBorder1=new JLabel(new ImageIcon(path + "border.gif"));
	JLabel lblBorder2=new JLabel(new ImageIcon(path + "border.gif"));
	JLabel lblWarning =new JLabel("        Enter your User Name        ");

	public  frmMainMenu()
	{

		
		function func=new function();
		func.MousePointer(this);

		playPanel.setBackground(Color.DARK_GRAY);
		sidePanel.setBackground(Color.DARK_GRAY);
		playPanel.setVisible(false);
		insPanel.setBackground(Color.DARK_GRAY);
		insPanel.setVisible(false);
		picPanel.setBackground(Color.DARK_GRAY);
		butPanel.setBackground(Color.DARK_GRAY);
		sidePanel.setBackground(Color.DARK_GRAY);
		northPanel.setBackground(Color.DARK_GRAY);
		titlePanel.setBackground(Color.DARK_GRAY);
		highPanel.setBackground(Color.DARK_GRAY);
		highPanel.setVisible(false);
        backPanel.setBackground(Color.DARK_GRAY);
        creditPanel.setBackground(Color.DARK_GRAY);
        creditPanel.setVisible(false);
		
		
		
		titlePanel.add(lblPic);
		picPanel.add(lblTitle);
		lblWarning.setVisible(false);
		
		
		butPanel.setLayout(new GridLayout(6,1,6,5));
		butPanel.add(cmdPlay);
		butPanel.add(cmdIns);
		butPanel.add(cmdHigh);
		butPanel.add(cmdCre);
		butPanel.add(cmdCre);
		butPanel.add(cmdExit);
		
		
		
		
		northPanel.setLayout(new FlowLayout());
		
		lblUsername.setFont(new Font("OCR A Extended", Font.BOLD, 20));
		txtUsername.setFont(new Font("OCR A Extended", Font.BOLD, 25));
		txtUsername.setForeground(Color.RED);
		
		lblUsername.setForeground(Color.BLACK);
        lblWarning.setFont(new Font("OCR A Extended", Font.BOLD, 12));
        lblWarning.setForeground(Color.RED);
		
		
		northPanel.add(lblStat);



		


		getContentPane().add(BorderLayout.NORTH,titlePanel);
		getContentPane().add(BorderLayout.WEST,picPanel);
		getContentPane().add(BorderLayout.EAST,sidePanel);
		getContentPane().add(BorderLayout.CENTER,butPanel);
		getContentPane().add(BorderLayout.SOUTH,northPanel);
		setSize(630,500);
		setResizable(false);
		setLocation(350,100);

		cmdPlay.addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent e)
			{
        			butPanel.setVisible(false);
        			playPanel.setVisible(true);
        			insPanel.setVisible(false);
        			highPanel.setVisible(false);
                    creditPanel.setVisible(false);

        			playPanel.setLayout(new FlowLayout());
        			playPanel.add(lblUsername);
        			playPanel.add(txtUsername);
        			playPanel.add(cmdGame);
        			playPanel.add(cmdBack);
        			playPanel.add(lblWarning);
        			getContentPane().add(BorderLayout.CENTER,playPanel);



        		}
        });
		
		cmdGame.addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent e)
			{

        		if (txtUsername.getText().equals(null))
        		{
        			lblWarning.setVisible(true);
        		}
        		else
        		{
        			frmCase caseGame=new frmCase();
        			caseGame.lblUserName.setText(txtUsername.getText());
        			caseGame.setVisible(true);
        			dispose();
        		}
        		


        	}
        });

		cmdBack.addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent e)
			{

        			butPanel.setVisible(true);
        			playPanel.setVisible(false);
        			insPanel.setVisible(false);
        			highPanel.setVisible(false);
                    creditPanel.setVisible(false);

        		}
        });

		cmdIns.addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent e)
			{
        			insPanel.setVisible(true);
        			butPanel.setVisible(false);
        			playPanel.setVisible(false);
        			highPanel.setVisible(false);
                    creditPanel.setVisible(false);
        			insPanel.setLayout(new FlowLayout());
        			insPanel.add(lblIns);
        			insPanel.add(cmdBack);
        			getContentPane().add(BorderLayout.CENTER,insPanel);


        		}
        });

		cmdHigh.addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent e)
			{
        		insPanel.setVisible(false);
        		butPanel.setVisible(false);
        		playPanel.setVisible(false);
        		highPanel.setVisible(true);
                creditPanel.setVisible(false);

        		highPanel.add(lblHighScore);

                highPanel.add(BorderLayout.SOUTH,backPanel);
                backPanel.add(cmdBack);
        		getContentPane().add(BorderLayout.CENTER,highPanel);

        	}
        });

        cmdCre.addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent e)
			{
                  creditPanel.setVisible(true);
                  butPanel.setVisible(false);
                  playPanel.setVisible(false);
                  insPanel.setVisible(false);
                  highPanel.setVisible(false);

                  creditPanel.setLayout(new FlowLayout());
                  creditPanel.add(lblCredit);
                  creditPanel.add(cmdBack);
                  getContentPane().add(BorderLayout.CENTER,creditPanel);
        	}
        });

		cmdExit.addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent e)
			{
        		System.exit(0);

        	}
        });
		
		cmdPlay.addMouseListener(new MouseAdapter()
		{
			public void mouseEntered(MouseEvent arg0)
			{
				cmdPlay.setIcon( new ImageIcon(path + "playMenu2.gif") );

		    }
		});
		
		cmdPlay.addMouseListener(new MouseAdapter()
		{
		     public void mouseExited(MouseEvent arg0) 
		     {
		    	 cmdPlay.setIcon( new ImageIcon(path + "playMenu.gif") );
		     }
		});
		
		cmdIns.addMouseListener(new MouseAdapter()
		{
			public void mouseEntered(MouseEvent arg0)
			{
				cmdIns.setIcon( new ImageIcon(path + "ins2.gif") );

		    }
		});
		
		cmdIns.addMouseListener(new MouseAdapter()
		{
		     public void mouseExited(MouseEvent arg0) 
		     {
		    	 cmdIns.setIcon( new ImageIcon(path + "ins.gif") );
		     }
		});
		
		cmdHigh.addMouseListener(new MouseAdapter()
		{
			public void mouseEntered(MouseEvent arg0)
			{
				cmdHigh.setIcon( new ImageIcon(path + "score2.gif") );

		    }
		});
		
		cmdHigh.addMouseListener(new MouseAdapter()
		{
		     public void mouseExited(MouseEvent arg0) 
		     {
		    	 cmdHigh.setIcon( new ImageIcon(path + "score.gif") );
		     }
		});
		
		cmdCre.addMouseListener(new MouseAdapter()
		{
			public void mouseEntered(MouseEvent arg0)
			{
				cmdCre.setIcon( new ImageIcon(path + "credit2.gif") );

		    }
		});
		
		cmdCre.addMouseListener(new MouseAdapter()
		{
		     public void mouseExited(MouseEvent arg0) 
		     {
		    	 cmdCre.setIcon( new ImageIcon(path + "credit.gif") );
		     }
		});
		
		cmdExit.addMouseListener(new MouseAdapter()
		{
			public void mouseEntered(MouseEvent arg0)
			{
				cmdExit.setIcon( new ImageIcon(path + "exitMenu2.gif") );

		    }
		});
		
		cmdExit.addMouseListener(new MouseAdapter()
		{
		     public void mouseExited(MouseEvent arg0) 
		     {
		    	 cmdExit.setIcon( new ImageIcon(path + "exitMenu.gif") );
		     }
		});
		
		cmdGame.addMouseListener(new MouseAdapter()
		{
			public void mouseEntered(MouseEvent arg0)
			{
				cmdGame.setIcon( new ImageIcon(path + "next.gif") );

		    }
		});
		
		cmdGame.addMouseListener(new MouseAdapter()
		{
		     public void mouseExited(MouseEvent arg0) 
		     {
		    	 cmdGame.setIcon( new ImageIcon(path + "next2.gif") );
		     }
		});
		
		cmdBack.addMouseListener(new MouseAdapter()
		{
			public void mouseEntered(MouseEvent arg0)
			{
				cmdBack.setIcon( new ImageIcon(path + "back1.gif") );

		    }
		});
		
		cmdBack.addMouseListener(new MouseAdapter()
		{
		     public void mouseExited(MouseEvent arg0) 
		     {
		    	 cmdBack.setIcon( new ImageIcon(path + "back2.gif") );
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
	



	
	public static void main(String[] args) throws Exception
	{
		
		frmMainMenu game=new frmMainMenu();
		game.setTitle("Mr. Detective");
		game.setVisible(true);

        
	}
	



	

	
	
}

