/**
 * A class to play specific song EverywhereWeGo
 * @author Adam Sanfacon
 */
public class EverywhereCommand implements Command{
    private MilitaryCadence cadence;
    
    /**
     * Constructor to create specific instance of the cadence.
     * @param cadence The song to be sung. 
     */
    public EverywhereCommand(MilitaryCadence cadence) {
        this.cadence = cadence;   
    }

    /**
     * Calls the Military Cadence class to print the cadence. 
     */
    public void execute() {
        cadence.singEverywhereWeGo();
    }
}
