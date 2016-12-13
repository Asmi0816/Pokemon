package poke.model;

public abstract class Pokemon 
{
	private int healthPoints;
	private int attackPoints;
	private double speed;
	private int number;
	private String name;
	
	public Pokemon(String name, int number)
	{
		this.name = name;
		this.number = number;
	}
	
	public String getPokemonTypes()
	{
		String pokemonTypes = "This pokemon has the following types:\n";
		Class<?> [] types = getClass().getInterfaces();
		String [] pokeTypes = new String[types.length];
		for(int index = 0; index < types.length; index++)
		{
			String temp = types[index].getCanonicalName();
			pokemonTypes += temp + "\n";
		}
		
		return pokemonTypes;
	}
	
	public String toString()
	{
		return "This pokemons health is " + this.healthPoints + " It has a attack stat of " + this.attackPoints + " I know this pokemon has a speed of " +
	 this.speed + " And has and epic and lucky number of " + this.number + " And its name is " + this.name;
	}
	
	public String getPokemonInformation()
	{
		String pokemonInfo = "this pokemon is of type: " + this.getClass().getSimpleName();
		return pokemonInfo;
	}
	
	public int getHealthPoints()
	{
		return healthPoints;
	}
	
	public int getAttackPoints()
	{
		return attackPoints;
	}
	
	public double getSpeed()
	{
		return speed;
	}
	
	public int getNumber()
	{
		return number;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setHealthPoints(int healthPoints)
	{
		this.healthPoints = healthPoints;
	}
	
	public void setAttackPoints(int attackPoints)
	{
		this.attackPoints = attackPoints;
	}
	
	public void setSpeed(double speed)
	{
		this.speed = speed;
	}
	
	public void setNumber(int number)
	{
		this.number = number;
	}
	public void setName(String name)
	{
		this.name = name;
	}
}
