import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
    
/**
 * @ValentinPopa (your name) 
 */
public class CarCoins extends Actor
{
    //declarari
    protected int speed = 0;
    protected Direction direction;
    
    //constructor pentru viteza si sens
    public CarCoins(int speed, Direction direction) {
        this.speed = speed;
        this.direction = direction;
    }
    
  
    public void act() 
    {
        //act se apeleaza la fiecare frame
        checkForCollision();//verificam daca a atins ceva
        moveCoins();//mutam banutul            
    }   

    //verificam daca broasca a lovit sau nu o masina
    public void checkForCollision() {
        Actor actor = getOneIntersectingObject(Frog.class);
        if (actor != null) {
            FroggerCoins world = (FroggerCoins)getWorld();
            world.eraseScoreCoins();//daca broasca a lovit o masina se reseteaza scorul
        }
    }
    
    //functie pentru a crea miscarea masinilor
    public void moveCoins() {
     if (direction == Direction.West) {
            setLocation(getX() - speed, getY());//face masina sa se miste cu o viteza data
            if (getX() == 0) {//daca ajunge la final in stanga trebuie scoasa masina de pe harta
                FroggerCoins myWorldCoins = getWorldOfType(FroggerCoins.class);
                getWorld().removeObject(this);//stergem masina
                myWorldCoins.spawnVehicleCoins();//putem spawna alta masina
            }
        }
        else if (direction ==  Direction.East) {
            setLocation(getX() + speed, getY());   //face masina sa se miste cu o viteza data
            if (getX() == 599) {//daca ajunge la final in stanga trebuie scoasa masina de pe harta
                FroggerCoins myWorldCoins = getWorldOfType(FroggerCoins.class);
                getWorld().removeObject(this);//stergem masina
                myWorldCoins.spawnVehicleCoins();//putem spawna alta masina
            }
        }   
    }
}
