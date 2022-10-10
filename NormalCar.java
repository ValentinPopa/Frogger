import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * @ValentinPopa
 */
public class NormalCar extends Car
{
    //constructor
    public NormalCar(Direction direction)
    {
        super(3,direction);//creare masina normala cu viteza 3
        if(direction==Direction.East)//detectarea directiei de mers
        {
            GreenfootImage image=new GreenfootImage("autos_01.png");//setare masina normala cu botul in dreapta
            setImage(image);
        }else 
            if(direction==Direction.West)
            {
                GreenfootImage image=new GreenfootImage("autos_01L.png");//setare masina normala cu botul in stanga
                setImage(image);
            }
    }

    public void act()
    {
        //se apeleaza la fiecare frame
        super.act();
    }
}
