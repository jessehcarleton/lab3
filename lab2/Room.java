import java.util.*;

/**
 * Class Room - a room in an adventure game.
 *
 * This class is part of the "World of Zuul" application. 
 * "World of Zuul" is a very simple, text based adventure game.  
 *
 * A "Room" represents one location in the scenery of the game.  It is 
 * connected to other rooms via exits.  The exits are labelled north, 
 * east, south, west.  For each direction, the room stores a reference
 * to the neighboring room, or null if there is no exit in that direction.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 7.0
 */
public class Room 
{
    public String description;
    public Map<String,Room> exits;
    public static final String NORTH = "north";
    public static final String EAST = "east";

   /**
     * Create a room described "description". Initially, it has no exits. 
     * "description" is something like "a kitchen" or "an open court yard".
     * @param description The room's description.
     */
    public Room(String description) 
    {
        this.description = description;
        exits = new HashMap<>();
    }
  public Room getExits(String direction){
      return exits.get(direction);
    
    }
    
    /**
     * Define the exits of this room.  Every direction either leads
     * to another room or is null (no exit there).
     * @param north The north exit.
     * @param east The east east.
     * @param south The south exit.
     * @param west The west exit.
     */
    public void setExit(String direction, Room room) 
    {
        //return exits.put(direction)
        if(direction != null) {
            exits.put(direction, room);
        }
        /*
        if(east != null) {
            exits.put(EAST,east);
        }
        if(south != null) {
            exits.put("south", south);
        }
        if(west != null) {
            exits.put("west", west);
        }
        */
    }

  
    /**
     * @return The description of the room.
     */
    public String getDescription()
    {
        return description;
    }
    
    public void printLongDescription(){
         System.out.println("You are " + this.getDescription());
         System.out.print("Exits: ");
         for (String key: exits.keySet()){
                System.out.print(key + " ");
            }
            System.out.println();
}
}
