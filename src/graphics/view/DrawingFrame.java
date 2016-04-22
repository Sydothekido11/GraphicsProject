package graphics.view;


import graphics.controller.GraphicsController;
import graphics.view.DrawingPanel;

import javax.swing.JFrame;

import graphics.controller.GraphicsController;

public class DrawingFrame extends JFrame
{

	private GraphicsController baseController;
	private DrawingPanel basePanel;
	
	
	public DrawingFrame(GraphicsController baseController)
	{
		this.baseController = baseController;
		basePanel = new DrawingPanel();
		
		setupFrame();
	}

	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setResizable(false);
		this.setSize(600, 600);
		this.setTitle("Meow meow");
		this.setVisible(true);
	}
	
	public GraphicsController getBaseController()
	{
		return baseController;
	}

}
