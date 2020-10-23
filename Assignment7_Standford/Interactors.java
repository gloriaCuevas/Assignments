import acm.graphics.*; 
import acm.program.*; 
import java.util.*; 
import java.awt.event.*; 
import javax.swing.*;



@SuppressWarnings("serial")
public class Interactors extends GraphicsProgram
{
	
	public void init()
	{
		contents = new HashMap<String,GObject>(); 
		createWindow();
		addActionListeners(); 
		addMouseListeners();
		
		
	}
	private void createWindow()
	{
		add(new JLabel("Name"), SOUTH);
		add(textBox = new JTextField(25), SOUTH);
		textBox.addActionListener(this);
		add(addButton = new JButton("Add"), SOUTH);
		add(removeButton = new JButton("Remove"), SOUTH);
		add(clearButton = new JButton("Clear"), SOUTH);
		
		
	}
	private void addBox(String name)
	{
		GCompound group = new GCompound();
		GRect box = new GRect(GROUP_WIDTH, GROUP_HEIGHT);
		GLabel label = new GLabel (name);
		group.add(box, -GROUP_WIDTH /2, -GROUP_HEIGHT /2);
		group.add(label, -label.getWidth() /2, label.getAscent() /2);
		add(group, getWidth() /2, getHeight() /2);
		contents.put(name, group);
		
		
	}
	private void removeBox(String name)
	{
		GObject obj = contents.get(name);
		if(obj != null)
		{
			remove(obj);
		}
	}
	private void removeContents()
	{
		Iterator<String> remover = contents.keySet().iterator();
		while(remover.hasNext())
		{
			removeBox(remover.next());
		}
		contents.clear();
	}
	
	public void actionPerformed(ActionEvent e) 
	{
		Object event = e.getSource();
		if(event == addButton || event == textBox)
		{
			addBox(textBox.getText());
		}
		else if(event == removeButton)
		{
			removeBox(textBox.getText());
		}
		else if(event == clearButton)
		{
				removeContents();
		}
		
	}
	public void mousePressed(MouseEvent e) {
			last = new GPoint(e.getPoint());
			   next = getElementAt(last);
	}
	public void mouseDragged(MouseEvent e) {
		if (next != null) 
		{ 
			next.move(e.getX() - last.getX(), e.getY() - last.getY()); 
			last = new GPoint(e.getPoint());
		} 
	}
	public void mouseClicked(MouseEvent e) 
	{
		if (next != null) next.sendToFront();
	}
	private static final double GROUP_WIDTH = 120;
	private static final double GROUP_HEIGHT = 50;
	private HashMap<String,GObject> contents;
	private GPoint last;
	private GObject next;
	private JTextField nameField;
	private JButton addButton;
	private JButton removeButton;
	private JButton clearButton;
	private JTextField textBox;
	}
