import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class frmLose extends JDialog 
{
	JPanel northPanel=new JPanel();
	JPanel westPanel=new JPanel();
	JPanel centerPanel=new JPanel();
	JPanel eastPanel=new JPanel();
	JPanel southPanel=new JPanel();
	
	String hPath;
	setPath sPath=new setPath();
	String path=sPath.setThePath(hPath);
	
	JLabel lblPic=new JLabel(new ImageIcon(path + "lose.gif"));
	JLabel cmdGame =new JLabel(new ImageIcon(path +"again2.gif"));
	JLabel lblUsername=new JLabel();
	
	public frmLose()
	{

		function func=new function();
		func.MousePointerDialog(this);

		northPanel.setBackground(Color.DARK_GRAY);
		westPanel.setBackground(Color.DARK_GRAY);
		centerPanel.setBackground(Color.DARK_GRAY);
		southPanel.setBackground(Color.DARK_GRAY);
		eastPanel.setBackground(Color.DARK_GRAY);

		centerPanel.add(lblPic);
		southPanel.add(cmdGame);
		
		setSize(550,300);
		setLocation(400,200);
		setVisible(true);
		getContentPane().add(BorderLayout.CENTER,centerPanel);
		getContentPane().add(BorderLayout.SOUTH,southPanel);
		
		cmdGame.addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent e)
			{

        		
        		frmMainMenu menu=new frmMainMenu();
        		frmGame1 game=new frmGame1();
        		game.dispose();
        		menu.setVisible(true);
        		dispose();
        		

        	}
        });
		
		cmdGame.addMouseListener(new MouseAdapter()
		{
			public void mouseEntered(MouseEvent arg0)
			{
				cmdGame.setIcon( new ImageIcon(path + "again.gif") );

		    }
		});
		
		cmdGame.addMouseListener(new MouseAdapter()
		{
		     public void mouseExited(MouseEvent arg0) 
		     {
		    	 cmdGame.setIcon( new ImageIcon(path + "again2.gif") );
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
	
	public static void main(String[] agrs)
	{
		frmLose lose=new frmLose();
		lose.setVisible(true);
	}
}
