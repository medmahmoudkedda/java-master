package tp4;

class Dollars extends Devise
{
	public Dollars(Devise d)
	{
		setSomme(d);
	}

	public Dollars(double somme)
	{
		setSomme(somme);
	}

	@Override
	public double getCours()
	{
		return 1.0;
	}

	@Override
	public String getUnite() 
	{
		return "dollar";
	}
}

