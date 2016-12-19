package poke.model;

public class Bulbasaur extends Pokemon implements Grass
{
	public Bulbasaur()
	{
		super("Bulbasaur", 001);
	}
	public Bulbasaur(String name)
	{
		super(name, 001);
	}
	
	public Bulbasaur(String name, int number)
	{
		super(name, number);
	}
	
	public int vineWhip() 
	{
		return 2;
	}
	
	public int leechSeed()
	{
		return this.getAttackPoints() * 2;
	}
}

