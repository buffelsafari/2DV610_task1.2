import controller.Controller;
import model.ComputerPlayer;
import model.Game;
import view.ConsoleView;

public class Program 
{
	public static void main(String[] arg)
	{
		Game game=new Game(3, 5, 7); // usual setup according to wiki
		ConsoleView view=new ConsoleView(System.out, System.in);
		Controller c=new Controller();
		ComputerPlayer computer=new ComputerPlayer();
		c.play(game, view, computer);
	}
}
