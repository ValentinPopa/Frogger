import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * @ValentinPopa
 */
public class Frogger extends World
{

    public Frogger()
    {    
        //se apeleaza la initializare
        super(728, 410, 1); //dimensiunile careului
        Button playButtonCoins=new Button("frogger.png",new StartMenu());
        //adaugam imaginea frogger care ne duce mai departe la apasarea unui click pe ea
        addObject(playButtonCoins, 375,175);
        prepare();
    }
    
    private void prepare()
    {
    }
}
