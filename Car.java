    import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
    
    /**
     * @ValentinPopa 
     */

    public class Car extends Actor
    {
        //declarari
        protected int speed = 0;
        protected Direction direction;
        //constructor pentru viteza si sens
        public Car(int speed, Direction direction) {
            this.speed = speed;
            this.direction = direction;
        }
        
        public void act() 
        {
            //act se apeleaza la fiecare frame
            //initializare
            checkForCollision();
            move();            
        }   

        //verificam daca broasca a lovit sau nu o masina
        public void checkForCollision() {
            Actor actor = getOneIntersectingObject(Frog.class);
            if (actor != null) {
                FroggerInfinite world = (FroggerInfinite)getWorld();
                world.eraseScore();//daca broasca a lovit o masina se reseteaza scorul
            }
        }
        
        //functie pentru a crea miscarea masinilor
        public void move() {
         if (direction == Direction.West) {
                setLocation(getX() - speed, getY());//face masina sa se miste cu o viteza data
                if (getX() == 0) {//daca ajunge la final in stanga trebuie scoasa masina de pe harta
                    FroggerInfinite myWorld = getWorldOfType(FroggerInfinite.class);
                    getWorld().removeObject(this);//stergem masina
                    myWorld.spawnVehicle();//putem spawna alta masina
                }
            }
            else if (direction ==  Direction.East) {//face masina sa se miste cu o viteza data
                setLocation(getX() + speed, getY()); //daca ajunge la final in stanga trebuie scoasa masina de pe harta  
                if (getX() == 599) {
                    FroggerInfinite myWorld = getWorldOfType(FroggerInfinite.class);
                    getWorld().removeObject(this);//stergem masina
                    myWorld.spawnVehicle();//putem spawna alta masina
                }
            }   
        }
    }
