package mockito.example;

import mockito.example.model.Vehicle;

public class VehicleCrash {

	private double totalEnergy;
	private int totalVehicles;

	public double getTotalEnergy() {
		return totalEnergy;
	}

	public int getTotalVehicles() {
		return totalVehicles;
	}

	public void crash(Vehicle vehicle) {
		totalVehicles++;
		totalEnergy += vehicle.getMass() * vehicle.getMaxSpeed() * vehicle.getMaxSpeed() / 2;
	}

	public String toString() {
		if (totalVehicles > 0)
			return "Up to " + totalEnergy + " Joules in " + totalVehicles + " crashes measured";
		return "No crashes measured";

	}

}
