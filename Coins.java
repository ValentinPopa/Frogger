import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
        
/**
 * @ValentinPopa
 */
public class Coins extends Actor
{
    public void act() 
    {
        //act se apeleaza la fiecare frame
        //verificam daca broasca a calcat pe un banut
        Actor intersectingFrog = getOneIntersectingObject(Frog.class);    
        if (intersectingFrog != null) {//se intra daca a calcat pe banut
            moveCoins();//mutam banutul in alta pozitie
            FroggerCoins world = (FroggerCoins)getWorld();
            world.incrementScore();//incrementam scorul cu 1
        }
    }    

    //functia pentru mutarea random a banutilor
    public void moveCoins() 
    {
        setLocation(Greenfoot.getRandomNumber(551)+25, Greenfoot.getRandomNumber(551)+25);
    }
}