import greenfoot.*;
/**
 * @ValentinPopa
 */
public class SportsCar extends Car
{
    //constructor
    public SportsCar(Direction direction)
    {
        super(5,direction);//creare masina sport cu viteza 5
        if(direction==Direction.East)//detectarea directiei de mers
        {
            GreenfootImage image=new GreenfootImage("car03.png");//setare masina cu botul in dreapta
            setImage(image);
        }else 
            if(direction==Direction.West)
            {
                GreenfootImage image=new GreenfootImage("car03L.png");//setare masina cu botul in stanga
                setImage(image);
            }
    }
    public void act()
    {
        //se executa la fiecare frame
        super.act();
    }
}
