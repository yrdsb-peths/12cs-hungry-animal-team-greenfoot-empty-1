import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * food for elephant
**/
public class Apple extends Food implements Moveable
{
    public Apple()
    {
        super(1);
    }
    
    /**
     * Act - do whatever the Apple wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        //setLocation(getX(),getY() + 3);
        
        move(3);
        
        MyWorld world = (MyWorld) getWorld();
        if(getY() >= world.getHeight() - 1)
        {
            world.gameOver();
            world.removeObject(this);
        }
    }
    
    
    // interface of moveable 
    public void move(int distance)
    {
        setLocation(getX(), getY() + distance);
    }
}