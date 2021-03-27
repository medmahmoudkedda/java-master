package tp4;

public abstract class Devise
{
	private double somme = 0;
	
	public abstract double getCours();

	public abstract String getUnite();

	protected void setSomme(double somme)
	{
		this.somme = somme;
	}

	protected void setSomme(Devise d)
	{
		setSomme(d.getSomme() * getCours() / d.getCours());
	}

	public double getSomme()
	{
		return somme;
	}
	
	@Override
	public String toString()
	{
		return "somme = " + String.format("%.2f", getSomme())  + " " + getUnite();
	}
}





