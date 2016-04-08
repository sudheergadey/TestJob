import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.sound.sampled.*;

import java.io.File;

public class frmLoading extends JDialog
{
	static File file;
    static AudioInputStream stream;
    static Clip music;
    
    String mPath;
	
	setMusicPath mus=new setMusicPath();
	String Musicpath= mus.setThePath(mPath);
	
	JPanel titlePanel=new JPanel();
	JPanel picPanel=new JPanel();
	JPanel statPanel=new JPanel();
	JLabel lblStatus=new JLabel("Loading. . . ");
	JLabel lblNum=new JLabel("0");
	JLabel lblPer=new JLabel("%");
	String hPath;
	int numInt;
	int numPer;
	
	public frmLoading()
	{	
		function func=new function();
		func.MousePointerDialog(this);

		file = new File(Musicpath + "MASTER_OF_MYSTERIES_A_y_bourdin_HIB417_LC06881.wav");
		
		titlePanel.setBackground(Color.DARK_GRAY);
		picPanel.setBackground(Color.DARK_GRAY);
		statPanel.setBackground(Color.GRAY);
		
		setPath sPath=new setPath();
		String path=sPath.setThePath(hPath);
		
		//JLabel lblPic=new JLabel(new ImageIcon( path + "21.gif"));
		JLabel lblPicBack=new JLabel(new ImageIcon( path + "horor.gif"));
		
		picPanel.add(lblPicBack);
		//lblPicBack.add(lblPic);
		//lblPic.setBounds(100,0,150,100);
		statPanel.setLayout(new FlowLayout());
		lblStatus.setFont(new Font("OCR A Extended", Font.PLAIN, 14));
		lblStatus.setForeground(Color.GRAY);
		lblNum.setFont(new Font("OCR A Extended", Font.PLAIN, 14));
		lblNum.setForeground(Color.GRAY);
		lblPer.setFont(new Font("OCR A Extended", Font.PLAIN, 14));
		lblPer.setForeground(Color.GRAY);
		statPanel.add(lblStatus);
		statPanel.add(lblNum);
		statPanel.add(lblPer);
		statPanel.setBackground(Color.DARK_GRAY);
		setSize(440,400);
		setLocation(350,100);
		setVisible(true);
		setTitle("Find Me");
		JLabel lblTitle=new JLabel(new ImageIcon( path + "gamePage2.gif"));
		titlePanel.add(lblTitle);
		
		setResizable(false);
		getContentPane().add(titlePanel,BorderLayout.NORTH);
		getContentPane().add(picPanel,BorderLayout.CENTER);
		getContentPane().add(statPanel,BorderLayout.SOUTH);
		
		Timer t = new Timer(120, new ActionListener()
		{
	          public void actionPerformed(ActionEvent e)  
	          {
	              numInt=Integer.parseInt(lblNum.getText());
	              numPer=numInt + 1;
	              lblNum.setText(Integer.toString(numPer));
	              if (lblNum.getText().equals("100"))
	              {
	            	 	dispose();
	            	 	frmMainMenu menu=new frmMainMenu();
	            	 	//stop();
	            	 	menu.setVisible(true);
	            	 	
	            	 	
	              }
	              
	          }
	     });
		
		t.start();
		
		addWindowListener(new WindowAdapter() 
		{
			  public void windowClosing(WindowEvent we) 
			  {
			    System.exit(0);
			  }
		});

		
	}
	
    public  void start() throws Exception 
    {
         // SET UP
         
         stream = AudioSystem.getAudioInputStream(file);
         music = AudioSystem.getClip();
         
         // PLAY
         
         music.open(stream);
         music.start();
         music.loop(Clip.LOOP_CONTINUOUSLY);
    }
    
    public void stop()
    { 
         music.stop();
         music.close();
    }
	public static void main(String[] args) throws Exception
	{
		frmLoading game=new frmLoading();
		game.setTitle("Find me");
		game.setVisible(true);
		game.start();
		
	}
}
