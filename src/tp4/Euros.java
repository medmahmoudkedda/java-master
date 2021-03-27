package tp4;

class Euros extends Devise
{
	public Euros(Devise d)
	{
		setSomme(d);
	}

	public Euros(double somme)
	{
		setSomme(somme);
	}

	@Override
	public double getCours()
	{
		return 0.500;
	}

	@Override
	public String getUnite() 
	{
		return "Euro";
	}
}
