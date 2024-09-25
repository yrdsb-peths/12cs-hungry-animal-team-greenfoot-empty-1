import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World
{
    public int score=0;
    int level;
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        Elephant elephant = new Elephant();
        addObject(elephant, 300, 300); 
        
        Apple apple = new Apple();
        addObject(apple, 300, 0); 
        
        createApple();
    }
    
    public void gameOverCode() 
    {
        Label gameOverLabel = new Label ("Game Over", 100);
        addObject(gameOverLabel, 300, 200);
    }
    public void increaseScore(){
        score++;
        if(score % 5 ==0){
            level++;
        }
    }
    public void createApple()
    {
        Apple apple = new Apple();
        int x = Greenfoot.getRandomNumber(600);
        int y = Greenfoot.getRandomNumber(1);
        addObject(apple, x, y); 
    }
}
