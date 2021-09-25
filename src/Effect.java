public class Effect {

    /**
     * What if instead of having each move have its own thing
     * i just make a bunch of effects
     * Is there anything special a super does that a normal move doesnt?
     * maybe make it so supers cannot be blocked by basic defense unless otherwise noted?
     * do something fun like that. but having a bunch of different effects and a bunch of different
     * moves is a bit wack. but i guess it creates organization.
     * If its just a move, and the move gets a name, a cost, and an array of effects it
     * can make it easier to create a bunch through templates in a text file.
     *
     */


    /**
     * And idea list for creating a character
     * Each character will have its own text file, with its
     * own string of characters to denote stuff aswell as some comments to make,
     * some while being attacked, some when winning and some when they lose
     * add's character to them.
     *
     * each character will create each move, saved as different types for the sake
     * of knowing which move is which. Not sure how i will denote it other than just being
     * a child class. maybe make it abstract and do shit like that
     * still unclear how it will work
     * then the moves will be created and filled each with the array of effects
     * a cost and a name.
     * maybe i will have 2 static fields which are blocked damage and damage done
     * and the effects outside of that will be held in an "extra effects" array.
     * This creates a more centralized idea so i can have the head character class
     * have a method that states "hasEffect" that will check any effects on the move
     * or any effects attached to the player. the effects will be passed around so player can
     * refrence what effect has been done to them.
     * this will be very complicated to setup, but once done should
     * optimize and speed up the code and how it works.
     * Do alot of the printing through arrays and shit like that
     * do not type all of it out. save it into text files.
     * each move will setup their own texts to send when used.
     * allow it to be creative with who is attacking
     * this could either be an algorithem to create the statements, or just
     * a shit ton of statements written into a text file with required moves
     * to make the attack
     *
     * but basically. super over the top complex but a fun game so what ever
     * its totally fuckin worth it, because i need something to give me a
     * purpose in life because its clear hockey is not that thing.
     * 
     */


}

