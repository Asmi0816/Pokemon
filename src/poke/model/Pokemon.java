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
		
	}
	
	public String getPokemonInformation()
	{
		String pokemonInfo = "this pokemon is of type: " + this.getClass().getSimpleName();
		return pokemonInfo;
	}
}
