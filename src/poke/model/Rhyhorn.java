package poke.model;

public class Rhyhorn extends Pokemon implements Rock
{
	public Rhyhorn()
	{
		super("Rhyhorn", 01);
	}
	public Rhyhorn(String name)
	{
		super(name, 01);
	}
	
	public Rhyhorn(String name, int number)
	{
		super(name, number);
	}
	
	public int rockTomb() 
	{
		return 500;
	}
	
	public int rockThrough()
	{
		return this.getAttackPoints() / 2;
	}
}
