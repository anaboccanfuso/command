/**
 * A class to play specific song InArmy
 * @author adam sanfacon
 */
public class InArmyCommand implements Command {
    //initializes cadence variable
    private MilitaryCadence cadence;
    //constructor for class to define cadence
    public InArmyCommand(MilitaryCadence cadence) {
        this.cadence = cadence;
    }
    //executes song 
    public void execute() {
        cadence.singInArmy();
    }
}
