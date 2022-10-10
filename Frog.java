import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * @ValentinPopa
 */
public class Frog extends Actor
{
    
    public void act()
    {
        //se apeleaza la fiecare frame
        //cream input de la taste pentru a misca broasca
        if(Greenfoot.isKeyDown("w"))//miscare in fata
        {
            setLocation(getX(), getY()-2);
        }
        if(Greenfoot.isKeyDown("d"))//miscare in dreapta
        {
            setLocation(getX()+2, getY());
        }
        if(Greenfoot.isKeyDown("a"))//miscare in stanga
        {
            setLocation(getX()-2, getY());
        }
        if(Greenfoot.isKeyDown("s"))//miscare in spate
        {
            setLocation(getX(), getY()+2);
        }
    }
}
