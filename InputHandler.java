import java.util.ArrayList;

public class InputHandler {
    private ArrayList<Command> commands;

    public InputHandler(MilitaryCadence cadence) {
        IDontKnowCommand idk = new IDontKnowCommand(cadence);
        InArmyCommand inArmy = new InArmyCommand(cadence);
        EverywhereCommand everywhere = new EverywhereCommand(cadence);

        commands = new ArrayList<Command>();
        commands.add(idk);
        commands.add(inArmy);
        commands.add(everywhere);
    }

    public boolean playCadence(int num) {
        if (num < commands.size() && num >= 0) {
            commands.get(num).execute();
            return true;
        }
        return false;
    }

}