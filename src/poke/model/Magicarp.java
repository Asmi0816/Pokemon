package poke.model;

public class Magicarp extends Pokemon implements Water
{
	public Magicarp()
	{
		super("Magicarp", 01);
	}
	public Magicarp(String name)
	{
		super(name, 01);
	}
	
	public Magicarp(String name, int number)
	{
		super(name, number);
	}
	
	public int splash() 
	{
		return 0;
	}
	
	public int waterGun()
	{
		return this.getAttackPoints() * 1000000000;
	}

}
