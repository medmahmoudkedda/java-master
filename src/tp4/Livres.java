package tp4;

class Livres extends Devise
{
	public Livres(Devise d)
	{
		setSomme(d);
	}

	public Livres(double somme)
	{
		setSomme(somme);
	}

	@Override
	public double getCours()
	{
		return 0.400;
	}

	@Override
	public String getUnite() 
	{
		return "Livre";
	}
}
