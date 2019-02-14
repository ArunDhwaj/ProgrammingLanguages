package Main;

public class MyRedoCommand implements ICommand 
{
	private Receiver receiver; 
	
	MyRedoCommand(Receiver recvS)
	{
		receiver = recvS;
	}
	
	@Override
	public void Do()
	{
		//Call redo in receiver
		receiver.performRedo();
	}
	
}
