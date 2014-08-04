package security;

/**
 * @author Hipshot
 *
 */
public class Door extends Entrance{

	public Door(int posX, int posY)  {
		super(posX, posY);
		// TODO Auto-generated constructor stub
	}
	
	public Sensor createDoorSensor(int posX, int posY){
		DoorSensor doorSensor = new DoorSensor(posX, posY);
		return doorSensor;
	}
	
	public void ActivateDoorSensor(DoorSensor sensor){
		sensor.setDisabled(false);
	}
	
	public void deactivateDoorSensor(DoorSensor sensor){
		sensor.setDisabled(true);
	}

}
