package poke.model;

public class Gyarados extends Pokemon implements Water
{
	public Gyarados()
	{
		super("Gyarados", 129);
	}
	public Gyarados(String name)
	{
		super(name, 129);
	}
	
	public Gyarados(String name, int number)
	{
		super(name, number);
	}
	
	public int splash() 
	{
		return 2;
	}
	
	public int waterGun()
	{
		return this.getAttackPoints() * 200;
	}
}
