import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * @ValentinPopa 
 */

public class Ambulance extends Car
{
    public Ambulance(Direction direction)
    {
        super(7,direction);//creare ambulanta cu viteza 7
        if(direction==Direction.East)//detectarea directiei de mers
        {
            GreenfootImage image=new GreenfootImage("ambulance.png");//setarea ambulantiei cu botul in dreapta
            setImage(image);
        }else 
            if(direction==Direction.West)
            {
                GreenfootImage image=new GreenfootImage("ambulanceL.png");//setarea ambulantiei cu botul in stanga
                setImage(image);
            }
    }

    public void act()
    {
        //act se apeleaza la fiecare frame
        super.act();
    }
}
