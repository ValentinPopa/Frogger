import greenfoot.*;
/**
 * @ValentinPopa
 */

public class CopyOfSportsCar extends CarCoins
{
    public CopyOfSportsCar(Direction direction)
    {
        super(5,direction);//crearea masinii sport cu viteza 5
        if(direction==Direction.East)//detectarea directiei de mers
        {
            GreenfootImage image=new GreenfootImage("car03.png");//crearea masinii sport cu botul in dreapta
            setImage(image);
        }else 
            if(direction==Direction.West)
            {
                GreenfootImage image=new GreenfootImage("car03L.png");//crearea masinii sport cu botul in stanga
                setImage(image);
            }
    }

    public void act()
    {
        //act se apeleaza la fiecare frame
        super.act();
    }
}
