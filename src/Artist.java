public class Artist {
    private String name;
    private Album[] albums;
    private int albumCount;

    public Artist(String name, int maxAlbums) {
        this.name = name;
        this.albums = new Album[maxAlbums];
        this.albumCount = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addAlbum(Album album) {
        if (albumCount < albums.length) {
            albums[albumCount++] = album;
        } else {
            System.out.println("Artist album capacity reached.");
        }
    }

    public void removeAlbum(Album album) {
        for (int i = 0; i < albumCount; i++) {
            if (albums[i].equals(album)) {
                albums[i] = albums[albumCount - 1];
                albums[albumCount - 1] = null;
                albumCount--;
                return;
            }
        }
        System.out.println("Album not found.");
    }

    public void displayInfo() {
        System.out.println("Artist: " + name);
        for (int i = 0; i < albumCount; i++) {
            albums[i].displayInfo();
        }
    }
}
