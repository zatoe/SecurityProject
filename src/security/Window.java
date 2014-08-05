package security;

/**
 * @author Hipshot
 * @author Zatoe
 * Class to model a window entrance
 */
public class Window extends Entrance {

	public Window(int posX, int posY) {
		super(posX, posY);
		this.setSensor(new WindowSensor(posX, posY));
	}

}
