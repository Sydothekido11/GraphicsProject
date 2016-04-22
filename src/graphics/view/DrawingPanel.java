package graphics.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import graphics.controller.GraphicsController;

import javax.swing.JButton;
import javax.swing.SpringLayout;
import javax.swing.JPanel;

public class DrawingPanel extends JPanel
{
	private GraphicsController baseController;
	private SpringLayout baseLayout;
	
	private JButton mrButton;
	
	private DrawingFrame baseFrame;
	
	public DrawingPanel(GraphicsController baseController)
	{
		baseLayout = new SpringLayout();
		this.baseController = baseController;
		
		mrButton = new JButton();
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(mrButton);
		
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}

}
