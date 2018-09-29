import java.util.Random;

/**
*This class represents a Goon Object.
*@author David Kim
*@version 13.31
*/

public class Goon {

    private int attack;
    private int health;

/**
*first constructor of Goon
*@param a first number that represents attack
*@param a second number that represnts health
*@return nothing
*/
    public Goon(int attack, int health) {
        this.attack = attack;
        this.health = health;
    }
/**
*second constructor of Goon
*@param nothing
*@return nothing
**/
    public Goon() {
        this.attack = 7;
        this.health = 26;
    }
/**
*This method returns the attack of a goon
*@param nothing
*@return goon's attack
**/
    public int getAttack() {
        return attack;
    }
/**
*This method returns the goon's health
*@param nothing
*@return goon's health
**/
    public int getHealth() {
        return health;
    }
/**
*This method takes in one in value, and sets
* the goon's attack equal to that value
*@param int value
*@return nothing
**/
    public void setAttack(int value) {
        this.attack = value;
    }
/**
*This method allows us to subract from health from the
*int value it takes in
*@param in value
*@return nothing
**/
    public void loseHealth(int healthLost) {
        if (this.health > healthLost) {
            this.health -= healthLost;
        } else {
            this.health = 0;
        }
    }
/**
*This method allows us get a random number
*-10 to 10 as our attackdamage of goon
*@param nothing
*@return attack + randomNumber
**/
    public int getAttackDamage() {
        Random rand = new Random();
        int randomNumber = (rand.nextInt(20) - 10);
        return attack + randomNumber;
    }
/**
*This method allows us to return a string value
*@param nothing
*@return Challengestatment of type String
**/
    public String challenge() {
        String challengestatement = "Bring it on!";
        return challengestatement;
    }

}