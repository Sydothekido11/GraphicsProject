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
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.PINK);
		this.add(mrButton);
		
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}

	@Override
	protected void paintComponent(Graphics currentGraphics)
	{
		super.paintComponent(currentGraphics);
		
		Graphics2D mainGraphics = (Graphics2D) currentGraphics;
		mainGraphics.setStroke(new BasicStroke(20));
		mainGraphics.setColor(Color.CYAN);
		
		mainGraphics.drawRect(50, 70, 200, 20);
	}

}
