import java.util.ArrayList;

public class InputHandler {
    private Command[] commands;
    // private static final String EVERYWHERE = "command/everywhere.txt";
    // private static final String IDONTKNOW = "command/idontknow.txt";
    // private static final String INARMY = "command/inarmy.txt";

    public InputHandler(MilitaryCadence cadence) {
        IDontKnowCommand idk = new IDontKnowCommand(cadence);
        InArmyCommand inArmy = new InArmyCommand(cadence);
        EverywhereCommand everywhere = new EverywhereCommand(cadence);

        commands = new Command[] { idk, inArmy, everywhere };
    }

    public boolean playCadence(int num) {
        if (num < commands.length && num >= 0) {
            commands[num].execute();
            return true;
        }
        return false;
    }

}