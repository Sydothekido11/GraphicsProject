package graphics.view;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.util.ArrayList;

import javax.swing.JPanel;

public class ShapePanel extends JPanel
{

	private ArrayList<Rectangle> squareList;
	private ArrayList<Rectangle> rectangleList;
	private ArrayList<Ellipse2D> ellipseList;
	private ArrayList<Ellipse2D> circleList;
	private ArrayList<Polygon> triangleList;
	private ArrayList<Polygon> polygonList;
	
	
	public void addTriangle()
	{
		int [] xPoints = new int[3];
		xPoints[0] = (int)(Math.random() * 150);
		xPoints[1] = (int)(Math.random() * 250);
		xPoints[2] = (int)(Math.random() * 350);
		
		int [] yPoints = {(int)(Math.random() * 250), (int)(Math.random() * 450), (int)(Math.random() * 250)};
		
		Polygon triangle = new Polygon(xPoints, yPoints, 3);
		triangleList.add(triangle);
	}
	public void addRectangle()
	{
		int xPos = (int)(Math.random() * getWidth());
	    int yPos = (int)(Math.random() * getHeight());
	    int width = (int)(Math.random() * 100);
	    int height = (int)(Math.random() * 100);
	    
	    
		rectangleList.add(new Rectangle(xPos, yPos, width, height));
	    
	    repaint();
	}
	
	public void addSquare()
	{
		int xPos = (int)(Math.random() * getWidth());
	    int yPos = (int)(Math.random() * getHeight());
	    int width = (int)(Math.random() * 100);
	    int height = (int)(Math.random() * 100);
	    
	    
		squareList.add(new Rectangle(xPos, yPos, width, height));
	    
	    repaint();
	}
	
	public void addEllipse()
	{
		int xPos = (int)(Math.random() * getWidth());
	    int yPos = (int)(Math.random() * getHeight());
	    int width = (int)(Math.random() * 100);
	    int height = width;
	    
	    Ellipse2D currentEllipse = new Ellipse2D.Double(xPos, yPos, width, height);
		ellipseList.add(currentEllipse);
	    
	    repaint();
	}
	
	public void addCircle()
	{
		int xPos = (int)(Math.random() * getWidth());
	    int yPos = (int)(Math.random() * getHeight());
	    int width = (int)(Math.random() * 100);
	    int height = width;
	    
	    Ellipse2D currentEllipse = new Ellipse2D.Double(xPos, yPos, width, height);
		circleList.add(currentEllipse);
	    
	    repaint();
	}
	public void addPolygon()
	{
		int numberOfSides = (int)(Math.random() * 9) + 3;
		int [] xPoints = new int [numberOfSides];
		int [] yPoints = new int [numberOfSides];
		
		for(int side = 0; side < numberOfSides; side++)
		{
			xPoints[side] = (int)(Math.random() * 200);
			yPoints[side] = (int)(Math.random() * 200);
		}
		
		Polygon myPolygon = new Polygon(xPoints, yPoints, numberOfSides);
		polygonList.add(myPolygon);
	}
	
	@Override
	protected void paintComponent(Graphics currentGraphics)
	{
		super.paintComponent(currentGraphics);
		Graphics2D mainGraphics = (Graphics2D) currentGraphics;
		
		for(Polygon currentTriangle : triangleList)
		{
			int red = (int)(Math.random() * 256);
			int green = (int)(Math.random() * 256);
			int blue = (int)(Math.random() * 256);
			
			int penSize = (int)(Math.random() * 10) + 3;
			mainGraphics.setColor(new Color(red, green, blue));
			mainGraphics.setStroke(new BasicStroke(penSize));
			
			mainGraphics.draw(currentTriangle);
		}
		
		for(Polygon currentPolygon : polygonList)
		{
			int red = (int)(Math.random() * 256);
			int green = (int)(Math.random() * 256);
			int blue = (int)(Math.random() * 256);
			
			
			mainGraphics.setColor(new Color(red, green, blue));
			
			
			mainGraphics.draw(currentPolygon);
		}
		
		for(Rectangle currentRectangle : rectangleList)
		{
			int red = (int)(Math.random() * 256);
			int green = (int)(Math.random() * 256);
			int blue = (int)(Math.random() * 256);
			
			
			mainGraphics.setColor(new Color(red, green, blue));
			
			
			mainGraphics.draw(currentRectangle);
		}
		
		for(Rectangle currentSquare : squareList)
		{
			int red = (int)(Math.random() * 256);
			int green = (int)(Math.random() * 256);
			int blue = (int)(Math.random() * 256);
			
			
			mainGraphics.setColor(new Color(red, green, blue));
			
			
			mainGraphics.draw(currentSquare);
		}
		
		for(Ellipse2D currentEllipse : ellipseList)
		{
			int red = (int)(Math.random() * 256);
			int green = (int)(Math.random() * 256);
			int blue = (int)(Math.random() * 256);
			
			
			mainGraphics.setColor(new Color(red, green, blue));
			
			
			mainGraphics.draw(currentEllipse);
		}
		
		for(Ellipse2D currentCircle : circleList)
		{
			int red = (int)(Math.random() * 256);
			int green = (int)(Math.random() * 256);
			int blue = (int)(Math.random() * 256);
			
			
			mainGraphics.setColor(new Color(red, green, blue));
			
			
			mainGraphics.draw(currentCircle);
		}
	}
}
