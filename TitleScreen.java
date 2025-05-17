import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Title Screen
 * 
 * @author Riley
 * @version May 2025
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label ("The Elephant", 60);
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        addObject(titleLabel, getWidth()/2, 200 );

        prepare();
    }

    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Label label = new Label("Press <Space> to start", 40);
        addObject(label,306,301);
        Elephant elephant = new Elephant();
        addObject(elephant,511,63);
        elephant.setLocation(515,79);
        Label label2 = new Label("Use arrow Keys to move", 40);
        addObject(label2,328,206);
        label2.setLocation(315,205);
        label.setLocation(344,254);
        label.setLocation(331,254);
        label.setLocation(308,254);
        label.setLocation(323,254);
        label.setLocation(331,254);
        label.setLocation(317,252);
        label.setLocation(311,329);
        label2.setLocation(334,275);
        label2.setLocation(280,292);
        label2.setLocation(300,264);
        label.setLocation(320,318);
    }
}
