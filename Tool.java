import java.util.Random;
/**
*This class represents a tool object.
*@author David Kim
*@version 13.31
**/
public class Tool {

    private String name;
    private int maxdamage;
/**
*This is a constructor that takes in two values
*@param two values, one of type String, the other of type int
*@return nothing
**/
    public Tool(String name, int maxdamage) {
        this.name = name;
        this.maxdamage = maxdamage;
    }
/**
*This method allows us to get the tool's name
*@param nothing
*@return name of the tool
**/
    public String getName() {
        return this.name;
    }
/**
*This method allows us to get the amount of damage
*the tool can do in an int value
*@param nothing
*@return attackdamage
**/
    public int getAttackDamage() {
        Random rand = new Random();
        int attackdamage = (rand.nextInt(maxdamage - 1) + 1);
        return attackdamage;
    }

}