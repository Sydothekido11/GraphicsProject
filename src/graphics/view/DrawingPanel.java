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
	private JButton rectangleButton;
	private JButton polygonButton;
	private ArrayList<Rectangle> rectangleList;
	
	private DrawingFrame baseFrame;
	
	public DrawingPanel(GraphicsController baseController)
	{
		baseLayout = new SpringLayout();
		this.baseController = baseController;
		
		rectangleButton = new JButton();
		polygonButton = new JButton();
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
		this.add(rectangleButton);
		this.add(polygonButton);
		this.add(shapePanel);
		
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		rectangleButton.addActionListener(new ActionListener()
		{
		
			public void actionPerformed(ActionEvent click)
			{
				shapePanel.addTriangle();
				repaint();
			}
		});
		
		polygonButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				shapePanel.addPolygon();
				repaint();
			}
		});
	}

	@Override
	protected void paintComponent(Graphics currentGraphics)
	{
		super.paintComponent(currentGraphics);
		
		Graphics2D mainGraphics = (Graphics2D) currentGraphics;
		mainGraphics.setStroke(new BasicStroke(15));
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
