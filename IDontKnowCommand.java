/**
 * A class to print out the lyrics to I Don't Know by calling
 * the Military Cadence class.
 * @author Ana Boccanfuso
 */
public class IDontKnowCommand implements Command {
    private MilitaryCadence cadence;

    /**
     * Creates a specific instance of the cadence. 
     * @param cadence The song to be sung.
     */
    public IDontKnowCommand(MilitaryCadence cadence) {
        this.cadence = cadence;
    }

    /**
     * Calls the Military Cadence class to print the cadence.
     */
    public void execute() {
        cadence.singIDontKnow();
    }
    
}
