import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World
{
    public int score = 0;
    Label scoreLabel;
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        Elephant elephant = new Elephant();
        addObject(elephant, 300, 300);
        
        scoreLabel= new Label(0, 80);
        addObject(scoreLabel, 50, 50);
        
        spawnFood();     
    }
    
<<<<<<< Updated upstream
    public void increaseScore()
=======
    
    public void act()
    {
        List<Moveable> moveables = getObjects(Moveable.class);
        for (Moveable m : moveables) {
            m.move(0);
        }
    }
    
    public void increaseScore(int value)
>>>>>>> Stashed changes
    {
        score += value;
        scoreLabel.setValue(score);
    }
    public void spawnFood()
    {
        int rand = Greenfoot.getRandomNumber(2);
        Food food;
        if(rand == 0)
        {
            food = new Apple();
        }
        else
        {
            food = new Banana();
        }
        int x = Greenfoot.getRandomNumber(600);
        addObject(food, x, 0);
    }
    
    public void gameOver()
    {
        Label gameOverLabel = new Label("Game Over", 100);
        addObject(gameOverLabel, 300, 200); 
    }
}
