import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.*;
import javax.swing.JOptionPane;

/**
* @ValentinPopa 
*/
    public class FroggerInfinite extends World
    {
        //declarari
        private ArrayList<Lane> EastboundLanes = new ArrayList<Lane>();/*creare lista de lane-uri pentru est(specificam pozitia x si y 
                                                                            unde se pot spawna masinile)*/
        private ArrayList<Lane> WestboundLanes = new ArrayList<Lane>();/*creare lista de lane-uri pentru vest(specificam pozitia x si y 
                                                                            unde se pot spawna masinile)*/
        private VehicleSpawner vehicleSpawner = new VehicleSpawner();//declarare variabila de tip VehicleSpawner
        private boolean clicked=false;
        private static int score = 0;//declaram static deoarece este variabila de clasa, nu de instanta
        public static int vehicleCount=0;//numarul maxim de masini

        public FroggerInfinite()
        {    
            //initializare
            super(600, 600, 1); //creare careu cu x=600 y=600 pe 1 pixel
            addLanes();//adaugare lane-uri
            this.addObject(new FinishLine(), Greenfoot.getRandomNumber(551)+25, 25);//adaugare musca
            this.addObject(new Frog(), 300, 575);//adaugare broasca
            
        }
        public void act()
        {    
            //act se apeleaza la fiecare frame
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

        //functie pentru a spawna masinile
        private void spawnVehicles() {
            for(int i = 0; i < vehicleCount; i++) {
             spawnVehicle();   
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
        //functie care creste scorul
        public void incrementScore() {
         score++;
         paintScore();
        }
        
        //functie care sterge scorul si scrie in fisier scorul inregistrat
        public void eraseScore() {
            try {
            //deschide fisierul
            BufferedWriter writer= new BufferedWriter(new FileWriter("HighScoreCrossTheRoad.txt",true));
            writer.write(String.valueOf(score) +"\n");//scrie in fisier scorul
            writer.close();//inchide fisierul


            //mai se face afisarea mesajului game over
            Message m = new Message();
            setPaintOrder(GreenfootImage.class);
            GreenfootImage i = new GreenfootImage("game_over.png");
            i.setTransparency(95);
            m.setImage(i);
            addObject(m, getWidth()/2, getHeight()/2);
            Greenfoot.stop();
            } catch (Exception e) {
                //TODO: handle exception
            }
        }
        //functie care spawneaza scoruk
        public void spawnScore() {
            score = 0;   
            paintScore();
        }
        //functie care afiseaza scorul
        public void paintScore() {
         showText("Score: " + score, 50, 575);   
        }
        //functie care creaza masinile
        public void spawnVehicle() {
            vehicleSpawner.spawnVehicle(this);
        }
        //functie care alege random un lane de spawnare
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
