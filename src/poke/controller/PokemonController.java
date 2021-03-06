package poke.controller;
import poke.model.*;
import poke.view.PokemonFrame;
import java.util.ArrayList;

import javax.swing.JOptionPane;


public class PokemonController 
{
	private ArrayList<Pokemon> pokedex;
	private PokemonFrame baseFrame;
	
	
	public PokemonController()
	{
		pokedex = new ArrayList<Pokemon>();
		buildPokedex();
		
		baseFrame = new PokemonFrame(this);
	}
	
	public void start()
	{
		JOptionPane.showMessageDialog(baseFrame, "Welcome to Pokemon Inheritence!");
	}
	
	private void buildPokedex()
	{
		pokedex.add(new Magicarp("OP"));
		pokedex.add(new Rhyhorn("Master"));
		pokedex.add(new Bulbasaur("Whip"));
		pokedex.add(new Charizard("Blaze"));
		pokedex.add(new Magicarp("5 OH'"));
		pokedex.add(new Charizard("Rizen"));
		pokedex.add(new Gyarados("MASTER"));
		
	}
	
	public String[] buildPokedexText()
	{
		String [] pokemonNames =new String[pokedex.size()];
		for(int index = 0; index < pokedex.size(); index++)
		{
			pokemonNames[index] = pokedex.get(index).getName();
		}
		
		return pokemonNames;
	}
	
	public void updateSelected(int index, String name, int combat, int health, double speed)
	{
		Pokemon current = pokedex.get(index);
		current.setName(name);
		current.setAttackPoints(combat);
		current.setHealthPoints(health);
		current.setSpeed(speed);
	}
	
	public ArrayList<Pokemon> getPokedex()
	{
		return pokedex;
	}

	public PokemonFrame getBaseFrame() 
	{
		return baseFrame;
	}

	public void setBaseFrame(PokemonFrame baseFrame) 
	{
		this.baseFrame = baseFrame;
	}
	
	
	
	
}
