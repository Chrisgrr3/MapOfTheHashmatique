public class MapOfHashTest {
    public static void main(String[] args) {
        MapOfHash tracks = new MapOfHash();

        tracks.trackList();

        System.out.println(tracks.oneSong());

        System.out.println("");
        System.out.println("Library ");
        tracks.library();
    }
}
