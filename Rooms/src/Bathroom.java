
public class Bathroom extends Room
{

	public Bathroom(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	public void enterRoom(Person x)
	{
		System.out.println("You enter the bathroom");
		occupant = x;
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);
	}
	
	public void leaveRoom(Person x)
	{
		occupant = null;
	}
}
