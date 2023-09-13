import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    private Counter scoreCount;
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1500, 1000, 1); 
        addObject(new Frog(), 750, 800);
        addObject(new Bird(), 100, 100);
        addObject(new Bird(), 300, 200);
        addObject(new Bird(), 800, 500);
        addObject(new Bird(), 500, 300);
        addObject(new Bird(), 400, 700);
        addObject(new Bird(), 1400, 700);
        addObject(new Bird(), 600, 300);
        addObject(new Bird(), 500, 400);
        addObject(new Boat(), 1000, 300);
        addObject(new Boat(), 900, 400);
        addObject(new Boat(), 700, 600);
        addObject(new Boat(), 200, 600);
        addObject(new Boat(), 1100, 200);
        addObject(new Boat(), 1300, 700);
        addObject(new Boat(), 500, 500);
        addObject(new Plane(), 760, 200);
        
        Counter counter = new Counter();
      
       
    }
    
    public Counter getCounte(){
        return scoreCount;
    }}

