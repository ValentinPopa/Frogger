import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * @ValentinPopa
 */
public class CopyOfNormalCar extends CarCoins
{
    public CopyOfNormalCar(Direction direction)
    {
        super(3,direction);//creare copie a masinii normale cu viteza 3
        if(direction==Direction.East)//detectarea directiei de deplasare
        {
            GreenfootImage image=new GreenfootImage("autos_01.png");//crearea masinii normale cu botul in dreapta
            setImage(image);
        }else 
            if(direction==Direction.West)
            {
                GreenfootImage image=new GreenfootImage("autos_01L.png");//crearea masinii normale cu botul in stanga
                setImage(image);
            }
    }

    public void act()
    {
        //act se apeleaza la fiecare frame
        super.act();
    }
}
