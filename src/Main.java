public class Main {
    public static void main(String[] args) {
        Music song1 = new Music("Song One", 3.5, "Pop");
        Music song2 = new Music("Song Two", 4.0, "Rock");
        Music song3 = new Music("Song Three", 2.8, "Jazz");
        Music song4 = new Music("Song Four", 3.2, "Classical");
        Music song5 = new Music("Song Five", 4.5, "Hip-Hop");

        Album album1 = new Album("Greatest Hits", 2024, 5);
        album1.addMusic(song1);
        album1.addMusic(song2);
        album1.addMusic(song3);
        album1.addMusic(song4);
        album1.addMusic(song5);

        Album album2 = new Album("New Releases", 2024, 3);
        album2.addMusic(new Music("New Song One", 3.0, "Pop"));
        album2.addMusic(new Music("New Song Two", 4.2, "Rock"));

        Artist artist1 = new Artist("Artist Name", 3);
        artist1.addAlbum(album1);
        artist1.addAlbum(album2);

        System.out.println("Artist Information:");
        artist1.displayInfo();

        System.out.println("\nPlaying and stopping a song:");
        song1.play();
        song1.stop();

        System.out.println("\nRemoving a song from the album:");
        album1.removeMusic(song2);
        album1.displayInfo();


        System.out.println("\nAttempting to add more music to the album:");
        album1.addMusic(new Music("Extra Song", 3.5, "Pop"));
        album1.addMusic(new Music("Another Extra Song", 4.0, "Rock"));
    }
}