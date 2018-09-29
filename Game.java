import java.util.Scanner;
import java.util.Random;
/**
*This class represents a Game Object
*@author David Kim
*@version 13.31
**/
public class Game {
/**
*This is the main method that is used in order to run this code
**/
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        boolean keepGoing = true;
        boolean startgame = true;
        boolean finalbattle = true;
        SuperHero superhero;
        Tool bability = new Tool("Batarang", 15);
        SuperHero batman = new SuperHero(20, 10, 10, "Batman", bability);
        Tool sability = new Tool("Lazer", 10);
        SuperHero superman = new SuperHero(25, 15, 10, "superman", sability);
        int goonattk;
        int batmanattk;
        int supermanattk;
        int batmanabil;
        int supermanabil;
        int batmanfattk;
        int supermanfattk;
        int supermanfsattk;
        int batmanfsattk;
        int bosschance;
/**
*A while loop is used in order to enable a certain amount
* of play according the how the game is played out. A considerable
* amount of if statements along with while loops, etc were used
* in order to achieve the goal of this game.
**/
        while (startgame) {
            System.out.println("Welcome! Please select a difficulty by typing"
                + " a number."
                + "\n" + "1. Easy" + "\n" + "2. Medium" + "\n" + "3. Hard"
                + "\n");
            int difficulty = keyboard.nextInt();
            if (difficulty == 1) {
                System.out.println("\n" + "Easy Mode Enabled");
            } else if (difficulty == 2) {
                System.out.println("\n" + "Medium Mode Enabled");
            } else {
                System.out.println("\n" + "Hard Mode Enabled");
            }
            System.out.println("\n" + "Please choose your character by typing"
                + " a number" + "\n"
                + "1. Batman" + "\n" + "2. Superman" + "\n");
            int character = keyboard.nextInt();
            System.out.println("\n" + "-----------------------------------"
                + "--------------------------" + "\n");
            if (character == 1) {
                System.out.println("Superman is now under control of the"
                        + " Sith Lord. Mwahahahah"
                        + " It is now your duty to stop him! To fight him,"
                        + " you must first"
                        + " fight his dastardly goons! Good luck Batman!");
            }
            if (character == 2) {
                System.out.println("Batman is now under control of the"
                        + " Sith Lord. Mwahahahah"
                        + "It is now your duty to stop him! To" + "\n"
                        + "fight him, you must first"
                        + " fight his dastardly goons! Good luck Superman!");
            }
            System.out.println("\n" + "v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^");
            System.out.println("BRING IT ON TOUGH GUY.");
            System.out.println("v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^");
            int alive = 1;
            while (alive < 4) {
                Goon goon = new Goon(1 * difficulty, 3 * difficulty);
                System.out.println("\n" + "What do you do?");
                System.out.println("Commands:");
                System.out.println("1. Attack");
                System.out.println("2. Special Attack");
                System.out.println("3. Flee");
                System.out.println("4. View Stats" + "\n");
                int command = keyboard.nextInt();
                goonattk = goon.getAttackDamage();
                batmanattk = batman.getAttackDamage();
                supermanattk = superman.getAttackDamage();
                batmanabil = bability.getAttackDamage();
                supermanabil = sability.getAttackDamage();
                if (command == 1) {
                    if (character == 1 && (batman.getDefense()
                        - goonattk) < 0) {
                        goon.loseHealth(batmanattk);
                        batman.setHealth((batman.getHealth()
                            - (goonattk)));
                        System.out.println("\n" + "You dealt "
                            + batmanattk + " damage!");
                        System.out.println("Gonnie Strikes for "
                            + goonattk + " damage!");
                    }
                    if (character == 1 && (batman.getDefense()
                        - goonattk) > 0) {
                        goon.loseHealth(batmanattk);
                        System.out.println("\n" + "You dealt "
                            + batmanattk + " damage!");
                        System.out.println("Gonnie Strikes for "
                            + 0 + " damage!");
                    }
                    if (character == 2 && (batman.getDefense()
                        - goonattk) < 0) {
                        goon.loseHealth(supermanattk);
                        superman.setHealth(superman.getHealth()
                            - goonattk);
                        System.out.println("\n" + "You dealt "
                            + supermanattk + " damage!");
                        System.out.println("Gonnie Strikes for "
                            + goonattk + " damage!");
                    }
                    if (character == 2 && (superman.getDefense()
                        - goonattk) > 0) {
                        goon.loseHealth(batmanattk);
                        System.out.println("\n" + "You dealt "
                            + batmanattk + " damage!");
                        System.out.println("Gonnie Strikes for "
                            + 0 + " damage!");
                    }
                    if (goon.getHealth() == 0) {
                        System.out.println("\n" + "You have"
                            + " vanquished the Goon!" + "\n");
                        alive += 1;
                    }
                }
                if (command == 2) {
                    if (character == 1 && (batman.getDefense()
                        - goonattk) < 0) {
                        goon.loseHealth(batmanabil);
                        batman.setHealth((batman.getHealth()
                            - (goonattk)));
                        System.out.println("\n" + "You dealt "
                            + batmanabil + " damage!");
                        System.out.println("Gonnie Strikes for "
                            + goonattk + " damage!");
                    }
                    if (character == 1 && (batman.getDefense()
                        - goonattk) > 0) {
                        goon.loseHealth(batmanabil);
                        System.out.println("\n" + "You dealt "
                            + batmanabil + " damage!");
                        System.out.println("Gonnie Strikes for "
                            + 0 + " damage!");
                    }
                    if (character == 2 && (superman.getDefense()
                        - goonattk) < 0) {
                        goon.loseHealth(supermanabil);
                        superman.setHealth(superman.getHealth()
                            - goonattk);
                        System.out.println("\n" + "You dealt "
                            + supermanabil + " damage!");
                        System.out.println("Gonnie Strikes for "
                            + goonattk + " damage!");
                    }
                    if (character == 2 && (superman.getDefense()
                        - goonattk) > 0) {
                        goon.loseHealth(supermanabil);
                        System.out.println("\n" + "You dealt "
                            + supermanabil + " damage!");
                        System.out.println("Gonnie Strikes for "
                            + 0 + " damage!");
                    }
                    if (goon.getHealth() == 0) {
                        System.out.println("\n" + "You have vanquished"
                            + " the Goon!" + "\n");
                        alive += 1;
                    }
                }
                if (command == 3) {
                    Random gamerandom = new Random();
                    int numvalue = (gamerandom.nextInt(10));
                    if (numvalue > 5) {
                        System.out.println("\n" + "Fled successfully!");
                        goon = new Goon(1 * difficulty, 3 * difficulty);
                    }
                    if (numvalue >= 5) {
                        batman.setHealth((batman.getHealth()
                            - (goonattk)));
                        System.out.println("\n" + "Goonie Strikes for "
                            + goonattk + " damage!");
                    }
                }
                if (command == 4) {
                    if (character == 1) {
                        System.out.println(batman.getName() + ": "
                            + batman.getHealth() + " HEALTH");
                        System.out.println("\n" + "GOON: "
                            + goon.getHealth() + " HEALTH");
                    }
                    if (character == 2) {
                        System.out.println(superman.getName() + ": "
                            + superman.getHealth() + " HEALTH");
                        System.out.println("\n" + "GOON: " + goon.getHealth()
                            + " HEALTH");
                    }
                }
            }
            while (finalbattle) {
                batmanfattk = batman.getAttackDamage();
                supermanfattk = superman.getAttackDamage();
                batmanfsattk = bability.getAttackDamage();
                supermanfsattk = sability.getAttackDamage();
                if (character == 1) {
                    System.out.println("ALERT!!!! Superman"
                        + " IS APPROACHING!!!!!");
                    System.out.println("\n"
                        + "v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^");
                    System.out.println("v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^");
                    System.out.println("v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^");
                    System.out.println("v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^");
                    System.out.println("Superman: Batman, I'm going"
                        + " to have to stop you right here.");
                    System.out.println("Batman: *hmpfh* Stop me from"
                        + " what? Beating you?");
                    System.out.println("Superman: I'll make you eat"
                        + " those words!");
                    System.out.println("v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^");
                    System.out.println("v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^");
                    System.out.println("v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^");
                    System.out.println("What do you do?");
                    System.out.println("Commands:");
                    System.out.println("1. Attack");
                    System.out.println("2. Special Attack");
                    System.out.println("3. View Stats" + "\n");
                    int finalcommandb = keyboard.nextInt();
                    if (finalcommandb == 1) {
                        Random rand = new Random();
                        bosschance = (rand.nextInt(10));
                        if (bosschance > 5) {
                            if (character == 1) {
                                batman.setHealth(batman.getHealth()
                                        - supermanfattk);
                                superman.setHealth(superman.getHealth()
                                    - batmanfattk);
                                System.out.println("\n" + "You dealt "
                                    + batmanfattk + "damage!");
                                System.out.println("You suffer " + supermanfattk
                                    + " from Supermans attack." + "\n");
                            }
                        }
                        if (bosschance <= 5) {
                            if (character == 1) {
                                batman.setHealth(batman.getHealth()
                                    - supermanfsattk);
                                superman.setHealth(superman.getHealth()
                                    - batmanfattk);
                                System.out.println("\n" + "You dealt "
                                    + batmanfattk + "damage!");
                                System.out.println("You suffer "
                                    + 0 + " from Supermans Lazer." + "\n");
                            }
                        }
                        if (batman.getHealth() == 0) {
                            finalbattle = false;
                        }
                        if (superman.getHealth() == 0) {
                            finalbattle = false;
                        }
                    }
                    if (finalcommandb == 2) {
                        Random rand = new Random();
                        bosschance = (rand.nextInt(10));
                        if (bosschance > 5) {
                            if (character == 2 && (superman.getDefense()
                                - batmanfattk) < 0) {
                                batman.setHealth(batman.getHealth()
                                    - supermanfsattk);
                                superman.setHealth(superman.getHealth()
                                    - batmanfattk);
                                System.out.println("\n" + "You dealt "
                                    + supermanfsattk + "damage1");
                                System.out.println("You suffer "
                                    + batmanfsattk + " from Batmans attack."
                                    + "\n");
                            }
                        }
                        if (bosschance <= 5) {
                            if (character == 2 && (superman.getDefense()
                                    - batmanfsattk) > 0) {
                                batman.setHealth(batman.getHealth()
                                        - supermanfsattk);
                                superman.setHealth(superman.getHealth()
                                    - batmanfsattk);
                                System.out.println("\n" + "You dealth "
                                    + batmanfattk + "damage1");
                                System.out.println("You suffer " + 0
                                    + " from Batmans Batarang" + "\n");
                            }
                        }
                        if (batman.getHealth() <= 0) {
                            finalbattle = false;
                        }
                        if (superman.getHealth() <= 0) {
                            finalbattle = false;
                        }
                    }
                    if (finalcommandb == 3) {
                        System.out.println(batman.getName() + ": "
                            + batman.getHealth() + " HEALTH");
                        System.out.println(superman.getName() + ": "
                            + superman.getHealth() + "HEALTH");
                    }
                }
                if (character == 2) {
                    System.out.println("ALERT!!!! Batman IS APPROACHING!!!!!");
                    System.out.println("\n"
                        + "v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^");
                    System.out.println("v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^");
                    System.out.println("v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^");
                    System.out.println("v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^");
                    System.out.println("Batman: Superman, I'm going"
                        +  "to have to stop you right here.");
                    System.out.println("Superman: *hmpfh* Stop me"
                        + " from what? Beating you?");
                    System.out.println("Batman: I'll make you eat"
                        + " those words!");
                    System.out.println("What do you do?");
                    System.out.println("Commands:");
                    System.out.println("1. Attack");
                    System.out.println("2. Special Attack");
                    System.out.println("3. View Stats");
                    int finalcommands = keyboard.nextInt();
                    if (finalcommands == 1) {
                        Random rand = new Random();
                        bosschance = (rand.nextInt(10));
                        if (bosschance > 5) {
                            if (character == 2) {
                                batman.setHealth(batman.getHealth()
                                    - supermanfattk);
                                superman.setHealth(superman.getHealth()
                                    - batmanfattk);
                                System.out.println("\n" + "You dealt "
                                    + supermanfattk + "damage!");
                                System.out.println("You suffer "
                                    + batmanfattk + " from Batmans attack."
                                    + "\n");
                            }
                        }
                        if (bosschance <= 5) {
                            if (character == 2) {
                                batman.setHealth(batman.getHealth()
                                    - supermanfattk);
                                superman.setHealth(superman.getHealth()
                                    - batmanfsattk);
                                System.out.println("\n" + "You dealt "
                                    + supermanfattk + "damage!");
                                System.out.println("You suffer " + 0
                                    + " from Batmans Batarang." + "\n");
                            }
                        }
                        if (batman.getHealth() == 0) {
                            finalbattle = false;
                        }
                        if (superman.getHealth() == 0) {
                            finalbattle = false;
                        }
                    }
                    if (finalcommands == 2) {
                        Random rand = new Random();
                        bosschance = (rand.nextInt(10));
                        if (bosschance > 5) {
                            if (character == 2)  {
                                batman.setHealth(batman.getHealth()
                                    - supermanfsattk);
                                superman.setHealth(superman.getHealth()
                                    - batmanfattk);
                                System.out.println("\n" + "You dealt "
                                    + supermanfsattk + "damage1");
                                System.out.println("You suffer "
                                    + batmanfsattk
                                    + " from Batmans attack." + "\n");
                            }
                        }
                        if (bosschance <= 5) {
                            if (character == 2) {
                                batman.setHealth(batman.getHealth()
                                    - supermanfsattk);
                                superman.setHealth(superman.getHealth()
                                    - batmanfsattk);
                                System.out.println("\n" + "You dealth "
                                    + supermanfattk + "damage1");
                                System.out.println("You suffer " + 0
                                    + " from Batmans Batarang" + "\n");
                            }
                        }
                        if (batman.getHealth() <= 0) {
                            finalbattle = false;
                        }
                        if (superman.getHealth() <= 0) {
                            finalbattle = false;
                        }
                    }
                    if (finalcommands == 3) {
                        System.out.println(batman.getName() + ": "
                            + batman.getHealth() + " HEALTH");
                        System.out.println(superman.getName() + ": "
                            + superman.getHealth() + "HEALTH");
                    }
                }
            }
            if (character == 1) {
                System.out.println("Congratulations Batman."
                    + "You have won the game.");
                System.out.println("Play again?");
                System.out.println("1. Yes");
                System.out.println("2. No");
                int playagain = keyboard.nextInt();
                if (playagain == 1) {
                    startgame = true;
                    System.out.println(" ");
                } else {
                    startgame = false;
                    System.out.println("Thank you for playing");
                }
            }
            if (character == 2) {
                System.out.println("Congratulations Superman."
                    + "You have won the game.");
                System.out.println("Play again?");
                System.out.println("1. Yes");
                System.out.println("2. No" + "\n");
                int playA = keyboard.nextInt();
                if (playA == 1) {
                    startgame = true;
                    System.out.println(" ");
                } else {
                    startgame = false;
                    System.out.println("Thank you for playing!");
                }
            }
        }
    }
}