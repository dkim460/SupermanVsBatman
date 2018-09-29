import java.util.Random;
/**
*This class represents a SuperHero object
*@author David Kim
*@version 13.31
**/
public class SuperHero {

    private int attack;
    private int defense;
    private int health;
    private String name;
    private Tool tool;
/**
*First constructor of this class
*@param nothing
*@return nothing
**/
    public SuperHero() {
        this.attack = 1;
        this.defense = 1;
        this.health = 1;
        this.name = "Spiderman";
        this.tool = new Tool("Web", 50);
    }
/**
*The second constructor that takes in three int values
*@param 3 int values
*@returns nothing
**/
    public SuperHero(int attack, int defense, int health,
        String name, Tool tool) {
        this.attack = attack;
        this.defense = defense;
        this.health = health;
        this.name = name;
        this.tool = tool;
    }
/**
*This method allows us to get the attack of the SuperHero
*@param nothing
*@return attack of the SuperHero
**/
    public int getAttack() {
        return attack;
    }
/**
*This method allows us to get the defense of the SuperHero
*@param nothing
*@return defense of the SuperHero
**/
    public int getDefense() {
        return defense;
    }
/**
*This method allows us to get the health of SuperHero
*@param nothing
*@return health of the SuperHero
**/
    public int getHealth() {
        return health;
    }
/**
*This method allows us to get the name of the SuperHero
*@param nothing
*@return name of the Superhero
**/
    public String getName() {
        return name;
    }
/**
*THis method allows us to get the tool of the SuperHero
*@param nothing
*@return the tool of the SuperHero
**/
    public Tool getTool() {
        return tool;
    }
/**
*This method allows us to set a value for the health of the SuperHero
*@param an int value
*@return nothing
**/
    public void setHealth(int health) {
        this.health = health;
    }
/**
*This method allows us to get the randomized
*attack damage of the SuperHero
*@param nothing
*@return the attack - randomNumber of the Superhero
**/
    public int getAttackDamage() {
        Random rand = new Random();
        int randomNumber = (rand.nextInt(20) - 5);
        return attack - randomNumber;
    }
}