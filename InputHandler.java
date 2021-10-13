
/**
 * Handles the input from the user
 * @author Vaughn Eugenio
 */
import java.util.ArrayList;

public class InputHandler {
    private ArrayList<Command> commands;

    /**
     * constructor, created an arraylist of commands based on the passed in cadence
     * 
     * @param cadence - the type that is the song
     */
    public InputHandler(MilitaryCadence cadence) {
        IDontKnowCommand idk = new IDontKnowCommand(cadence);
        InArmyCommand inArmy = new InArmyCommand(cadence);
        EverywhereCommand everywhere = new EverywhereCommand(cadence);

        commands = new ArrayList<Command>();
        commands.add(idk);
        commands.add(inArmy);
        commands.add(everywhere);
    }

    /**
     * exicutes the command for the desired cadence
     * 
     * @param num - index of the users desired cadence
     * @return True if guess is valid, flase if otherwise
     */
    public boolean playCadence(int num) {
        if (num < commands.size() && num >= 0) {
            commands.get(num).execute();
            return true;
        }
        return false;
    }

}