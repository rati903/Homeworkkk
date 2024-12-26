import java.util.Random;

public class MusicLibrary {
    private Artist[] artists;
    private Album[] albums;
    private Music[] songs;
    private int artistCount;
    private int albumCount;
    private int songCount;

    public MusicLibrary(int maxArtists, int maxAlbums, int maxSongs) {
        this.artists = new Artist[maxArtists];
        this.albums = new Album[maxAlbums];
        this.songs = new Music[maxSongs];
        this.artistCount = 0;
        this.albumCount = 0;
        this.songCount = 0;
    }

    public void addArtist(Artist artist) {
        if (artistCount < artists.length) {
            artists[artistCount++] = artist;
        } else {
            System.out.println("MusicLibrary artist capacity reached.");
        }
    }

    public void addAlbum(Album album) {
        if (albumCount < albums.length) {
            albums[albumCount++] = album;
        } else {
            System.out.println("MusicLibrary album capacity reached.");
        }
    }

    public void addSong(Music song) {
        if (songCount < songs.length) {
            songs[songCount++] = song;
        } else {
            System.out.println("MusicLibrary song capacity reached.");
        }
    }

    public Music searchMusic(String title) {
        for (int i = 0; i < songCount; i++) {
            if (songs[i].getTitle().equalsIgnoreCase(title)) {
                return songs[i];
            }
        }
        System.out.println("Music not found.");
        return null;
    }

    public Music giveRandomMusic() {
        if (songCount > 0) {
            Random rand = new Random();
            return songs[rand.nextInt(songCount)];
        } else {
            System.out.println("No songs in library.");
            return null;
        }
    }
}

