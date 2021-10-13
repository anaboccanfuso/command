/**
 * A class to play specific song EverywhereWeGo
 * @author adam sanfacon
 */
public class EverywhereCommand implements Command{
    //intializes cadence
    private MilitaryCadence cadence;
    //constructor which defines cadence with the argument
    public EverywhereCommand(MilitaryCadence cadence) {
        this.cadence = cadence;   
    }
    //plays the song Everywhere We Go
    public void execute() {
        cadence.singEverywhereWeGo();
    }
}
