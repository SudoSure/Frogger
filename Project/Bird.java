import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bird here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bird extends Actor
{
    /**
     * Act - do whatever the Bird wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
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
