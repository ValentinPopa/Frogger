import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * @ValentinPopa
 */
public class CopyOfBus extends CarCoins
{
    public CopyOfBus(Direction direction)
    {
        super(2,direction);//creare copie de autobuz cu viteza 2
        if(direction==Direction.East)// detectarea directiei de deplasare
        {
            GreenfootImage image=new GreenfootImage("bus_01.png");//crearea autobuzului cu botul inspre dreapta
            setImage(image);
        }else 
            if(direction==Direction.West)
            {
                GreenfootImage image=new GreenfootImage("bus_01L.png");//crearea autobuzului cu botul inspre stanga
                setImage(image);
            }
    }

    public void act()
    {
        //act se apeleaza la fiecare frame
        super.act();
    }
}
