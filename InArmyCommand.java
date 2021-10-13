/**
 * A class to print out the lyrics to In Army by calling
 * the Military Cadence class.
 * @author Adam Sanfacon
 */
public class InArmyCommand implements Command {
    private MilitaryCadence cadence;
    
    /**
     * Creates a specific instance of the cadence.
     * @param cadence The song to be sung.
     */
    public InArmyCommand(MilitaryCadence cadence) {
        this.cadence = cadence;
    }

    /**
     *  Calls the Military Cadence class to print the cadence.
     */ 
    public void execute() {
        cadence.singInArmy();
    }
}
