package poke.model;

public class Charizard extends Pokemon implements Fire
{
	public Charizard()
	{
		super("Charizard", 005);
	}
	public Charizard(String name)
	{
		super(name, 005);
	}
	
	public Charizard(String name, int number)
	{
		super(name, number);
	}
	
	public int ember() 
	{
		return 39;
	}
	
	public int flameThrougher()
	{
		return this.getAttackPoints() * 10;
	}

}
