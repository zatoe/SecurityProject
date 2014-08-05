package security;

/**
 * @author Hipshot
 *
 */
public class Door extends Entrance{

	public Door(int posX, int posY)  {
		super(posX, posY);
		this.setSensor(new DoorSensor(posX, posY));
	}
	
}
