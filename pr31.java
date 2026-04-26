import java.util.*;
public class pr31{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> playlist = new LinkedList<>();
        System.out.print("Enter number of songs: ");
        int n = sc.nextInt();
        sc.nextLine(); 
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter song " + i + ": ");
            playlist.add(sc.nextLine());
        }
        System.out.println("\nFull Playlist:");
        for (String song : playlist) {
            System.out.println(song);
        }
        if (!playlist.isEmpty()) {
            String first = playlist.removeFirst();
            System.out.println("\nPlaying: " + first);
        } else {
            System.out.println("\nPlaylist is empty");
        }

        System.out.println("Playlist after playing first song:");
        System.out.println(playlist);

        if (!playlist.isEmpty()) {
            String last = playlist.removeLast();
            System.out.println("\nSkipped: " + last);
        } else {
            System.out.println("\nNo song to skip");
        }

        System.out.println("\nFinal Playlist:");
        System.out.println(playlist);
    }
}
