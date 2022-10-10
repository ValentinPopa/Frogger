import greenfoot.*;

/**
 * @ValentinPopa
 */
public class VehicleSpawner  
{

    private VehicleFactory vehicleFactory = new VehicleFactory();//declarare variabila de tip VehicleFactory

    //constructor
    public VehicleSpawner()
    {
        
    }

    //functie care face totul pentru a afisa o masina pe harta + functionalitatea ei
    public void spawnVehicle(FroggerInfinite world)
    {
        Direction direction = Direction.values()[Greenfoot.getRandomNumber(2)];//ii dam directia masinii
        Car car = vehicleFactory.createCar(direction);//alegem tipul masinii si o facem sa se miste
        Lane lane = world.getLane(direction);//selectam unde se spawneaza masina
        world.addObject(car, lane.getX(), lane.getY());//adaugam masina in lume apeland coordonatele lane-ului pe care se spawneaza
    }
}
