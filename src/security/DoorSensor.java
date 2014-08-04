package security;

public class DoorSensor extends Sensor {

	public DoorSensor(int posX, int posY) {
		super(posX, posY);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setMonitoredZone(Space[][] grid) {
		// TODO Auto-generated method stub
		
	}
	
	public int[][] getDoorPosition(Door door){
		int[][] x = { {door.getPosX()}, {door.getPosY()} };
		return x;
	}

}
