import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * @ValentinPopa
 */
public class Bus extends Car
{
    public Bus(Direction direction)
    {
        super(2,direction);//creare autobuz cu viteza 2
        if(direction==Direction.East)//detectarea directiei de mers
        {
            GreenfootImage image=new GreenfootImage("bus_01.png");//setarea autobuzului cu botul in dreapta
            setImage(image);
        }else 
            if(direction==Direction.West)
            {
                GreenfootImage image=new GreenfootImage("bus_01L.png");//setarea autobuzului cu botul in stanga
                setImage(image);
            }
    }

    public void act()
    {
        //se apeleaza la fiecare frame
        super.act();
    }
}
