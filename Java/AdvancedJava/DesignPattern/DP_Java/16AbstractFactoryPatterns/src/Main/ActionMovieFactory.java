/**
 * 
 */
package Main;

/**
 * @author sbp
 *
 */
public class ActionMovieFactory implements IMovieFactory 
{
	/* (non-Javadoc)
	 * @see Main.IMovieFactory#GetTollywoodMovie()
	 */
	@Override
	public ITollywoodMovie GetTollywoodMovie() 
	{
		return new TollywoodActionMovie();
	}

	/* (non-Javadoc)
	 * @see Main.IMovieFactory#GetBollywoodMovie()
	 */
	@Override
	public IBollywoodMovie GetBollywoodMovie() 
	{
		return new BollywoodActionMovie();
	}

}
