import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
import javax.swing.JOptionPane;

/**
 * @ValentinPopa 
 */
public class FroggerCoins extends World
{
    //declarari
    private ArrayList<Lane> EastboundLanes = new ArrayList<Lane>();/*creare lista de lane-uri pentru est(specificam pozitia x si y 
                                                                        unde se pot spawna masinile)*/
    private ArrayList<Lane> WestboundLanes = new ArrayList<Lane>();/*creare lista de lane-uri pentru vest(specificam pozitia x si y 
                                                                    unde se pot spawna masinile)*/
    private VehicleSpawnerCoins vehicleSpawnerCoins = new VehicleSpawnerCoins(); //declarare variabila de tip VehicleSpawnerCoins
    private boolean clicked=false;
    public static int score = 0;//declaram static deoarece este variabila de clasa, nu de instanta
    private int vehicleCount=0;//numarul maxim de masini
 
    public FroggerCoins()
    {   
        //se face initializarea
        super(600, 600, 1); //creare careu cu x=600 y=600 si un pixel
        addLanes();//adaunare lane-uri
        this.addObject(new Coins(), Greenfoot.getRandomNumber(551)+25, Greenfoot.getRandomNumber(551)+25);//adaugare banut
        this.addObject(new Frog(), 300, 575);//adaugare broasca(player)
    }
    public void act()
    {    //act se apeleaza la fiecare frame
        if(!clicked)//verificam daca am intrat in act o data
         {
            String inputValue = JOptionPane.showInputDialog("Please input a valid value of cars (!0).");
            //preluam numarul de masini date
            if(inputValue!=null)
            {
                vehicleCount= Integer.valueOf(inputValue);
                spawnVehicles();//spawnam nr de masini
                spawnScore();//aratam scorul
                clicked=true;
            }
        }
    }
    //functie pentru a crea spawna masinile
    private void spawnVehicles() {
        for(int i = 0; i < vehicleCount; i++) {
         spawnVehicleCoins();   
        }
    }
    //functia pentru a popula listele de lane-uri
    private void addLanes() {
        //bordere right
        EastboundLanes.add(new Lane(0, 79));
        EastboundLanes.add(new Lane(0, 187));

        EastboundLanes.add(new Lane(0, 354));
        EastboundLanes.add(new Lane(0, 408));

        //bordere left
        WestboundLanes.add(new Lane(600, 133));
        WestboundLanes.add(new Lane(600, 241));

        WestboundLanes.add(new Lane(600, 462));
        WestboundLanes.add(new Lane(600, 516));   
    }
    //functie pentru a incrementa scorul si a il afisa pe ecran incrementat
    public void incrementScore() {
     score++;
     paintScore();
    }
    //functie pentru a spawna scrorul atunci cand jocul incepe
    public void spawnScore() {
        score = 0;   
        paintScore();
    }
    //functie pentru a afisa scorul
    public void paintScore() {
     showText("Score: " + score, 50, 575);   
    }
    //functie pentru a spawna vehicule in jocul coins
    public void spawnVehicleCoins() {
        vehicleSpawnerCoins.spawnVehicleCoins(this);
    }
    //functie care sterge scorul
    public void eraseScoreCoins() {
        score=0;
        paintScore();
    }
    //functie care ne alege random un lane pe care se face spawnarea unui vehicul
    public Lane getLane(Direction direction){
        int random = Greenfoot.getRandomNumber(4);
        switch(direction) {
         case East:   
            return EastboundLanes.get(random);
         default:   
            return WestboundLanes.get(random);
        }
    }
}
