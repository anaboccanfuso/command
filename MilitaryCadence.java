import java.io.*;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class MilitaryCadence {
    private ArrayList<String> lyrics;
    public MilitaryCadence() {
        lyrics = new ArrayList<String>();
    }

    public void singIDontKnow() {
        lyrics = getLyrics("command/idontknow.txt");
        singSong();
    }

    public void singEverywhereWeGo() {
        lyrics = getLyrics("command/everywhere.txt");
        singSong();
    }

    public void singInArmy() {
        lyrics = getLyrics("command/inarmy.txt");
        singSong();
    }

    private ArrayList<String> getLyrics(String fileName) {
        ArrayList<String> lyrics = new ArrayList<String>();
        try {
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                lyrics.add(line);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lyrics;
    }

    private void singSong() {
        for (int i = 0; i < lyrics.size(); i++) {
            System.out.println(lyrics.get(i));
            try {
                TimeUnit.MILLISECONDS.sleep(500);
                System.out.print("\033[H\033[2J");
                System.out.flush();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
