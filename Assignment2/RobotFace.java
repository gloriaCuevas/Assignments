
import acm.graphics.*; 
import acm.program.*; 
import java.awt.*;

@SuppressWarnings("serial")
public class RobotFace extends GraphicsProgram
{
	private static final int MOUTH_WIDTH = 100; 
	private static final int MOUTH_HEIGHT = 40;
	private static final int HEAD_WIDTH = 200; 
	private static final int HEAD_HEIGHT = 300; 
	private static final int EYE_RADIUS = 35; 
	

	public void run() 
	
	{
		
		addFace();
		
	}
	
	private void addFace()
	{
		getHead(); 
		getMouth();
		getEye(1.5, 2);
		getEye(-.5, 2);
	}
	private void getHead()
	{
		double xx = getWidth()/2 - HEAD_WIDTH * .5;
		double yy = getHeight()/2 - HEAD_HEIGHT * .5;
		GRect head = new GRect(xx, yy, HEAD_WIDTH, HEAD_HEIGHT);
		head.setFilled(true);
		head.setFillColor(Color.gray);
		add(head);
	}
	private void getMouth()	
	{
		double xx = getWidth()/2 - MOUTH_WIDTH * .5;
		double yy = getHeight()/2 - MOUTH_HEIGHT * -1.5;
		GRect mouth = new GRect(xx, yy, MOUTH_WIDTH, MOUTH_HEIGHT);
		mouth.setFilled(true);
		mouth.setFillColor(Color.WHITE);
		add(mouth);
	}
	private void getEye(double x, double y)
	{	
		double xx = getWidth()/2 - EYE_RADIUS * x;
		double yy = getHeight()/2 - EYE_RADIUS * y;
		GOval eye = new GOval(xx, yy, EYE_RADIUS, EYE_RADIUS);
	    eye.setFilled(true); 
		eye.setColor(Color.YELLOW); 
		add(eye);
	}
}


