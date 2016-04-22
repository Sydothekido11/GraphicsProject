package graphics.view;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import graphics.controller.GraphicsController;

import javax.swing.JButton;
import javax.swing.SpringLayout;
import javax.swing.JPanel;

public class DrawingPanel extends JPanel
{
	private GraphicsController baseController;
	private SpringLayout baseLayout;
	private ShapePanel shapePanel;
	private JButton mrButton;
	private ArrayList<Rectangle> rectangleList;
	
	private DrawingFrame baseFrame;
	
	public DrawingPanel(GraphicsController baseController)
	{
		baseLayout = new SpringLayout();
		this.baseController = baseController;
		
		mrButton = new JButton();
		rectangleList = new ArrayList<Rectangle>();
		shapePanel = new ShapePanel();
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.PINK);
		this.add(mrButton);
		this.add(shapePanel);
		
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		mrButton.addActionListener(new ActionListener()
		{
		
			public void actionPerformed(ActionEvent click)
			{
				int xPosition = (int) (Math.random() * getWidth());
				int yPosition = (int) (Math.random() * getHeight());
				int width = (int) (Math.random() * 100);
				int height = (int) (Math.random() * 100);
				
				rectangleList.add(new Rectangle(xPosition, yPosition, width, height));
				
				repaint();
			}
		});
	}

	@Override
	protected void paintComponent(Graphics currentGraphics)
	{
		super.paintComponent(currentGraphics);
		
		Graphics2D mainGraphics = (Graphics2D) currentGraphics;
		mainGraphics.setStroke(new BasicStroke(20));
		mainGraphics.setColor(Color.CYAN);
		
		mainGraphics.drawRect(50, 70, 200, 20);
		
		for(Rectangle current :rectangleList)
		{
			int red = (int)(Math.random() * 256);
			int green = (int)(Math.random() * 256);
			int blue = (int)(Math.random() * 256);
			
			mainGraphics.setColor(new Color(red,green,blue));
			mainGraphics.draw(current);
		}
	}

}
