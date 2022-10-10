import greenfoot.*;

/**
 * @ValentinPopa
 */
public class VehicleSpawnerCoins  
{

    private VehicleFactoryCoins vehicleFactory = new VehicleFactoryCoins();//declarare variabila de tip VehicleFactoryCoins

    //constructor
    public VehicleSpawnerCoins()
    {
        
    }
    //functie care face totul pentru a afisa o masina pe harta + functionalitatea ei
    public void spawnVehicleCoins(FroggerCoins world)
    {
        Direction direction = Direction.values()[Greenfoot.getRandomNumber(2)];//ii dam directia masinii
        CarCoins car = vehicleFactory.createCarCoins(direction);//alegem tipul masinii si o facem sa se miste
        Lane lane = world.getLane(direction);//selectam unde se spawneaza masina
        world.addObject(car, lane.getX(), lane.getY());//adaugam masina in lume apeland coordonatele lane-ului pe care se spawneaza
    }
}
