import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * @ValentinPopa 
 */

public class Button extends Actor
{
    //crearea buton pentru a realiza conexiunea intre scene
    private World link;
    public Button(String image, World link)
    {
        setImage(new GreenfootImage(image));//setam imaginea
        this.link=link;
    }
    public void act()
    {
        //act se apeleaza la fiecare frame
        //la actiunea click-ului butonul se pune in functiune
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(this.link);
        }
        
    }
}
