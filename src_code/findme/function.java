import java.awt.Image;
import java.awt.Point;
import javax.swing.*;


public class function
{
	String hPath;
	setPath sPath=new setPath();
	String path=sPath.setThePath(hPath);
	final Image cursorImage = new ImageIcon(path + "mouse.gif").getImage();
	final Point hotspot = new Point(10, 10);
	final String name = "My Cursor";

	public function()
	{
	}
	
	public void MousePointer(JFrame frame)
	{
		frame.setCursor(frame.getToolkit().createCustomCursor(cursorImage, hotspot, name));
	}

	public void MousePointerDialog(JDialog frame)
	{
		frame.setCursor(frame.getToolkit().createCustomCursor(cursorImage, hotspot, name));
	}
}
