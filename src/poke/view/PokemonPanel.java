package poke.view;

import java.awt.Color;
import javax.swing.*;
import poke.controller.PokemonController;
import java.awt.Dimension;
import java.awt.event.*;

public class PokemonPanel extends JPanel
{
	private PokemonController baseController;
	private ImageIcon pokemonIcon;
	private SpringLayout baseLayout;
	private JButton updateButton;
	private JComboBox pokedexSelector;
	private JLabel pokemonLabel;
	private JLabel healthLabel;
	private JLabel combatLabel;
	private JLabel speedLabel;
	private JLabel nameLabel;
	private JLabel numberLabel;
	private JLabel advancedLabel;
	private JTextField healthField;
	private JTextField combatField;
	private JTextField speedField;
	private JTextField nameField;
	private JTextField numberField;
	private JTextArea advancedArea;
	
	public PokemonPanel(PokemonController baseController)
	{
		this.baseController = baseController;
		this.baseLayout = new SpringLayout();
		this.pokemonIcon = new ImageIcon(getClass().getResource(""));
		this.updateButton = new JButton("Update Your Pokemon!");
		this.nameField = new JTextField(25);
		this.combatField = new JTextField(5);
		this.healthField = new JTextField(5);
		this.speedField = new JTextField(5);
		this.numberField = new JTextField(5);
		this.advancedArea = new JTextArea (10, 25);
		this.pokedexSelector = new JComboBox(baseController.buildPokedexText());
		this.advancedLabel = new JLabel ("Advanced information");
		this.combatLabel = new JLabel ("Combat Points : ");
		this.healthLabel = new JLabel ("Health Points : ");
		this.speedLabel = new JLabel ("Speed Rate : ");
		this.numberLabel = new JLabel ("Pokemon Number : ");
		this.nameLabel = new JLabel ("My Name Is :");
		this.pokemonLabel = new JLabel ("The Current pokemon", pokemonIcon, JLabel.CENTER);
		
		setupPanel();
		setupLayout();
		setupListeners();
		
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setPreferredSize(new Dimension(900, 600));
		this.setBackground(Color.DARK_GRAY);
		
		numberField.setEditable(false);
		advancedArea.setEditable(false);
		advancedArea.setWrapStyleWord(true);
		advancedArea.setLineWrap(true);

		pokemonLabel.setVerticalTextPosition(JLabel.BOTTOM);
		pokemonLabel.setHorizontalTextPosition(JLabel.CENTER);
		
		this.add(pokedexSelector);
		this.add(healthField);
		this.add(healthLabel);
		this.add(combatField);
		this.add(combatLabel);
		this.add(speedField);
		this.add(speedLabel);
		this.add(nameField);
		this.add(nameLabel);
		this.add(numberField);
		this.add(numberLabel);
		this.add(advancedArea);
		this.add(advancedLabel);
		this.add(pokemonLabel);
		this.add(updateButton);
		
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		pokedexSelector.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent selection)
			{
				int selected = pokedexSelector.getSelectedIndex();
				nameField.setText(baseController.getPokedex().get(selected).getName());
				numberField.setText(baseController.getPokedex().get(selected).getNumber() + "");
				combatField.setText(baseController.getPokedex().get(selected).getAttackPoints() + "");
				speedField.setText(baseController.getPokedex().get(selected).getSpeed() + "");
				healthField.setText(baseController.getPokedex().get(selected).getHealthPoints() + "");
				advancedArea.setText(baseController.getPokedex().get(selected).getPokemonInformation()
						+ "\n\n" + baseController.getPokedex().get(selected).getClass().getSimpleName());
				changeColorBasedOnData(baseController.getPokedex().get(selected).getClass().getSimpleName());
				changeImageDisplay(baseController.getPokedex().get(selected).getClass().getSimpleName());
			}
		});
		
		this.addMouseListener(new MouseListener()
				{
					public void mouseEntered(MouseEvent entered)
					{
						JOptionPane.showMessageDialog(baseController.getBaseFrame(), "the mouse entered something");
					}
					
					public void mouseReleased(MouseEvent released)
					{
						System.out.println("released");
					}
					
					public void mouseExited(MouseEvent exited)
					{
						JOptionPane.showMessageDialog(baseController.getBaseFrame(), "the mouse entered something");
					}
					
					public void mouseClicked(MouseEvent clicked)
					{
						System.out.println("clicked");
					}
					
					public void mousePressed(MouseEvent pressed)
					{
						System.out.println("pressed");
					}
				}
				);
		
		
		this.addMouseMotionListener(new MouseMotionListener()
		{
					
					public void mouseDragged(MouseEvent dragged)
					{
						JOptionPane.showMessageDialog(baseController.getBaseFrame(), "the mouse was at X:" + dragged.getX() + ",Y:" + dragged.getY());
					}
					public void mouseMoved(MouseEvent moved)
					{
						if ((Math.abs(moved.getX() - updateButton.getX()) < 5 || (Math.abs(moved.getY() - updateButton.getY()) < 5)))
						{
							updateButton.setLocation(moved.getX() + 10, moved.getY() - 10);
						}
					}
		});
	}
	
	
	public void setRandomColor()
	{
		int red = (int) (Math.random() * 256);
		int green = (int) (Math.random() * 256);
		int blue = (int) (Math.random() * 256);
		
		this.setBackground(new Color(red, green,blue));
	}
	
	
	
	
	private void changeColorBasedOnData(String data)
	{
		if (data.contains("Eletric"))
		{
			this.setBackground(Color.YELLOW);
		}
		else if (data.contains("Fire"))
		{
			this.setBackground(Color.RED);
		}
		else if (data.contains("Grass"))
		{
			this.setBackground(Color.GREEN);
		}
		else if (data.contains("Water"))
		{
			this.setBackground(Color.BLUE);
		}
		else if (data.contains("Rock"))
		{
			this.setBackground(Color.GRAY);
		}
		else
		{
			this.setBackground(Color.ORANGE);
		}
		repaint();
	}
	
	private void changeImageDisplay(String name)
	{
		String path = "/poke/view/images/";
		String defaultName = "ultraball";
		String extension = ".png";
		try
		{
			pokemonIcon = new ImageIcon(getClass().getResource(path+ name+ extension));
		}
		catch (NullPointerException missingFile)
		{
			pokemonIcon = new ImageIcon(getClass().getResource(path+ defaultName+ extension));
		}
		pokemonLabel.setIcon(pokemonIcon);
		repaint();
	}

}