package Main;

public class ComedyMovieFactory implements IMovieFactory 
{

	@Override
	public ITollywoodMovie GetTollywoodMovie() 
	{
		return new TollywoodComedyMovie();
	}

	@Override
	public IBollywoodMovie GetBollywoodMovie() 
	{
		return new BollywoodComedyMovie();
	}

}
