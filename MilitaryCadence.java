import java.io.*;
import java.util.*;
import java.util.concurrent.TimeUnit;

/**
 * A class that prints out lyrics to military songs
 * @author Adam Steger
 */
public class MilitaryCadence {
    private ArrayList<String> lyrics;

    /**
     * Creates an instance of military cadence and initializes the string array of lyrics
     */
    public MilitaryCadence() {
        lyrics = new ArrayList<String>();
    }

    /**
     * Populates the lyrics array with I Don't Know and prints them line by line to the console
     */
    public void singIDontKnow() {
        lyrics = getLyrics("command/idontknow.txt");
        singSong();
    }

    /**
     * Populates the lyrics array with Everywhere We Go and prints them line by line to the console
     */
    public void singEverywhereWeGo() {
        lyrics = getLyrics("command/everywhere.txt");
        singSong();
    }

    /**
     * Populates the lyrics array with In Army and prints them line by line to the console
     */
    public void singInArmy() {
        lyrics = getLyrics("command/inarmy.txt");
        singSong();
    }

    /**
     * Reads the lyrics files and populates the lyrics array
     * @param fileName A string of the name of the song lyrics file
     * @return Returns an array list of type string with the lyrics of the song
     */
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

    /**
     * Prints out the lyrics array to the console
     */
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
