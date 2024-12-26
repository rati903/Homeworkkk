public class Album {
    private String name;
    private int releaseYear;
    private Music[] musics;
    private int musicCount;

    public Album(String name, int releaseYear, int maxMusic) {
        this.name = name;
        this.releaseYear = releaseYear;
        this.musics = new Music[maxMusic];
        this.musicCount = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void addMusic(Music music) {
        if (musicCount < musics.length) {
            musics[musicCount++] = music;
        } else {
            System.out.println("Album is full, cannot add more music.");
        }
    }

    public void removeMusic(Music music) {
        for (int i = 0; i < musicCount; i++) {
            if (musics[i].equals(music)) {
                musics[i] = musics[musicCount - 1];
                musics[musicCount - 1] = null;
                musicCount--;
                return;
            }
        }
        System.out.println("Music not found in album.");
    }

    public void displayInfo() {
        System.out.println("Album: " + name + ", Release Year: " + releaseYear);
        for (int i = 0; i < musicCount; i++) {
            musics[i].displayInfo();
        }
    }
}
