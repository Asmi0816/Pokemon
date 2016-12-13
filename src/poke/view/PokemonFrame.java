package poke.view;

import java.awt.Dimension;
import javax.swing.*;
import poke.controller.PokemonController;
import poke.view.PokemonPanel;

public class PokemonFrame extends JFrame
{
	
	private PokemonController baseController;
	private PokemonPanel basePanel;
			
			public PokemonFrame (PokemonController baseController)
			{
				super();
				this.baseController = baseController;
				basePanel = new PokemonPanel(baseController);
				
				setupFrame();
			}
			
			private void setupFrame()
			{
				this.setContentPane(basePanel);
				this.setTitle("You got served sucker");
				this.setSize(new Dimension(600, 400));
				this.setResizable(false);
				this.setVisible(true);
			}
			
}
