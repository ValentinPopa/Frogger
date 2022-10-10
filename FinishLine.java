import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
*@ValentinPopa
*/
public class FinishLine extends Actor
{
    //declarare
    private boolean isNorth = true;

    public void act() 
    {
        //act se apeleaza la fiecare frame
        Actor intersectingFrog = getOneIntersectingObject(Frog.class);    
        if (intersectingFrog != null) {//verificam daca broasca a ajuns la musca
            moveFinishLine();//mutam musca pe partea opusa a drumului
            FroggerInfinite world = (FroggerInfinite)getWorld();
            world.incrementScore();//crestem scorul
        }
    }    
    //functie care muta musca in functie de pozitia ei precedenta (daca era sus se pune jos, iar daca era jos se pune sus)
    public void moveFinishLine() {
    if (isNorth) {
        setLocation(Greenfoot.getRandomNumber(551)+25, 575);//se pune random pe x 
    } else 
    {
        setLocation(Greenfoot.getRandomNumber(551)+25, 25);//se pune random pe x
    }
        isNorth = !isNorth;
    }
}
