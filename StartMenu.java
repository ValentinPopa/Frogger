import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


/**
 * @ValentinPopa
 */
public class StartMenu extends World
{
    //constructor
    public StartMenu()
    {
        super(600, 400, 1); //creare careu cu x=600 y=400 si nr de pixeli 1

        Button playButtonCoins=new Button("ButtonCoins.png",new FroggerCoins());//creare buton pentru Jocul Coins
        addObject(playButtonCoins, 400,57);

        Button playButtonInfinite=new Button("ButtonCrossTheRoad.png",new FroggerInfinite());//creare buton pentru jocul Cross The Road
        addObject(playButtonInfinite,400,230);
        
        Button instructionsButtonInfinite=new Button("Instructions_FroggerCrossTheRoad.png",new InstructionsFroggerCrossTheRoad());
        //creare buton pentru instructiuni Cross The Road
        addObject(instructionsButtonInfinite,400,284);
        
        Button instructionsButtonCoins=new Button("Instructions_FroggerCoins.png",new InstructionsFroggerCoins());
        //creare buton pentru instructiuni Coins
        addObject(instructionsButtonCoins,400,106);
        
        prepare();
    }

    private void prepare()
    {
    }
}
