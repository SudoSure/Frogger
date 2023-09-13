import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Frog here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Frog extends Actor
{
    /**
     * Act - do whatever the Frog wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    //private String name;
   // private double speed;
    
    //public Frog(String name, double speed){
      //  this.name = name;
     //   this.speed = speed;
    //}
    
    public void act() 
    {
        if(Greenfoot.isKeyDown("up")){
            move(5);
        }
        if(Greenfoot.isKeyDown("down")){
            move(-5);
        }
        if(Greenfoot.isKeyDown("right")){
            turn(5);
        }
        if(Greenfoot.isKeyDown("left")){
           turn(-5);
        }
       Actor Fly;
        Fly = getOneObjectAtOffset (0, 0, Fly.class);
        if (Fly != null)
        { World detect;
           
                detect = getWorld();
                detect.removeObject(Fly);
                
              
        }
    }   
    
    //public String getName(){
    //    return this.name;
  //  }
    
    //public void setName(String n){
     //   this.name = n;
   // }
    
    //public double getSpeed(){
    //    return this.speed;
  //  }
    
   // public void setSpeed(double s){
    //    this.speed = s;
   // }
    
    
}
