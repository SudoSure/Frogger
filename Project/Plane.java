import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Plane here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Plane extends Actor
{
    /**
     * Act - do whatever the Plane wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
        move(5);
        if (Greenfoot.getRandomNumber(100) < 5)
        {
            turn(Greenfoot.getRandomNumber(180));
        }
        if(isAtEdge()){
            turn(180);
             move(5);
         }else{
              move(5);
        
         }   
     Actor Frog;
        Frog = getOneObjectAtOffset (0, 0, Frog.class);
        if (Frog != null)
        { World detect;
           
                detect = getWorld();
                detect.removeObject(Frog);
        }
    }    
}
