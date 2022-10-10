import greenfoot.*;
/**
 * @ValentinPopa
 */
public class VehicleFactory  
{
    //construcor
    public VehicleFactory()
    {
    }

    //functie creata pentru a alege o masina din cele 4 disponibile
    public Car createCar(Direction direction)
    {
        //spawnare random a uneia dintre cele 4 masini
        int random = Greenfoot.getRandomNumber(4);
        switch(random) {
            case 0:
                return new Ambulance(direction);
            case 1:
                return new Bus(direction);
            case 2:
                return new SportsCar(direction);
            default:
                return new NormalCar(direction);
        }
    }
}
