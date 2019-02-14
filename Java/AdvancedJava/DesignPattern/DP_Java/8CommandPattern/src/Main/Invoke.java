package Main;

public class Invoke 
{
	ICommand cmd;
	
	public void ExecuteCommand(ICommand cmdS)
	{
		cmd = cmdS;
		
		cmd.Do();
	}
}
