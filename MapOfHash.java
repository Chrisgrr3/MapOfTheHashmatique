import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class MapOfHash {
    public HashMap<String, String> trackList() {
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("Shallow", "I'm off the deep end, watch as I dive in");
        trackList.put("Lovely", "Walking out of time, looking for a better place");
        trackList.put("Circles", "We couldn't turn around, till we were upside down");
        trackList.put("Ivy", "I thought that I was dreamin' when you said you loved me");
        return trackList;
    }

    public String oneSong() {
        String song = "Circles";
        String lyrics = trackList().get(song);
        String example = "The lyrics to " + song + ": " + lyrics;
        return example;
    }
    
    public void library() {
        Set<String> tracks = trackList().keySet();
        for(String track: tracks) {
            System.out.println("Track: " + track + " Lyrics: " + trackList().get(track));
        }
    }
}
