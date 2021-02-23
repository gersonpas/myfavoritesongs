package mysongs;

public class Songs {
    public static void main(String[] args) {
        String artist = "John Lennon";
        String genre = "Rock";
        int yearReleased = 1971;
        Integer durationSeconds = 235;
        String songName = "Imagine";
        char sucess =  'Y';

        System.out.println("Singer: ");
        System.out.println(artist);
        System.out.println("Song Name: ");
        System.out.println(songName);
        System.out.println("Genre: ");
        System.out.println(genre);
        System.out.println("Year of released");
        System.out.println(yearReleased);
        System.out.println("Song Duration: ");
        System.out.println(durationSeconds);
        System.out.println("Was it a great sucess?");
        System.out.println(sucess);
    }

}
