package security;

/**
 * @author William Zielke
 * @author Donald Nardi
 * @author Aarani Permachandra
 * @title Museum Simulation
 * 
 * Class to model a door entrance to a room
 */
public class Door extends Entrance{

	public Door(int posX, int posY)  {
		super(posX, posY);
		this.setSensor(new DoorSensor(posX, posY));
	}
	
}
