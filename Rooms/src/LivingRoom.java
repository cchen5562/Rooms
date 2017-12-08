
public class LivingRoom extends Room
{

	public LivingRoom(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}
	public void enterRoom(Person x)
	{
		System.out.println("You enter the livingroom.");
		occupant = x;
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);
	}
	
	public void leaveRoom(Person x)
	{
		occupant = null;
	}
}
