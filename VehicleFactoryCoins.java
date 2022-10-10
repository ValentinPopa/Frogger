import greenfoot.*;
/**
 * @ValentinPopa 
 */
public class VehicleFactoryCoins  
{

    //constructor
    public VehicleFactoryCoins()
    {
    }
    //functie creata pentru a alege o masina din cele 4 disponibile
    public CarCoins createCarCoins(Direction direction)
    {
        int random = Greenfoot.getRandomNumber(4);
        //spawnare random a uneia dintre cele 4 masini
        switch(random) {
            case 0:
                return new CopyOfAmbulance(direction);
            case 1:
                return new CopyOfBus(direction);
            case 2:
                return new CopyOfSportsCar(direction);
            default:
                return new CopyOfNormalCar(direction);
        }
    }
}
