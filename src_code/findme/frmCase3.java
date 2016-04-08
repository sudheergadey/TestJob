import javax.swing.*;


import java.awt.*;
import java.awt.event.*;


public class frmCase3 extends JFrame
{
	JPanel northPanel=new JPanel();
	JPanel westPanel=new JPanel();
	JPanel eastPanel=new JPanel();
	JPanel centerPanel=new JPanel();
	JPanel southPanel=new JPanel();
	
	String hPath;
	
	
	setPath sPath=new setPath();
	String path=sPath.setThePath(hPath);
	JLabel lblPicCase=new JLabel(new ImageIcon(path+"case3.gif"));
	JLabel lblNorth=new JLabel(new ImageIcon(path+"gamePage3.gif"));
	JLabel cmdGame =new JLabel(new ImageIcon(path +"next2.gif"));
	JLabel lblUserName=new JLabel();
	
	
	public frmCase3()
	{
		function func=new function();
		func.MousePointer(this);

		southPanel.setBackground(Color.DARK_GRAY);
		centerPanel.setBackground(Color.DARK_GRAY);
		eastPanel.setBackground(Color.DARK_GRAY);
		westPanel.setBackground(Color.DARK_GRAY);
		northPanel.setBackground(Color.DARK_GRAY);
		
		centerPanel.add(lblPicCase);
		northPanel.add(lblNorth);
		southPanel.add(cmdGame);
		westPanel.add(lblUserName);
		
		
		setSize(630,550);
		setVisible(true);
		setResizable(false);
		setLocation(350,100);
		getContentPane().add(BorderLayout.CENTER,centerPanel);
		getContentPane().add(BorderLayout.SOUTH,southPanel);
		getContentPane().add(BorderLayout.NORTH,northPanel);
		
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
		
		cmdGame.addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent e)
			{
        		frmGame3 game=new frmGame3();
        		game.lblUserName.setText(lblUserName.getText());
        		dispose();
        		game.setVisible(true);
        		
        		
        		
        		

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
	
	public static void main(String[] args)
	{
		frmCase3 game=new frmCase3();
		game.setTitle("Mr. Detective");
		game.setVisible(true);
	}
	
}
