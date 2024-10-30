import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

class Song {
    private int songId;
    private String title;
    private String artist;
    private double duration;

    public Song(int songId, String title, String artist, double duration) {
        this.songId = songId;
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    public int getid() {
        return songId;
    }

    public String gettitle() {
        return title;
    }

    public String getartist() {
        return artist;
    }

    public double getduration() {
        return duration;
    }
}

public class IPA37Solution {
    public static double findSongDurationForArtist(Song[] songs, String find) {
        double result = 0;
        for (Song song : songs) {
            if (song.getartist().equalsIgnoreCase(find)) {
                result += song.getduration();
            }
        }
        return result;
    }

    public static List<Song> getSongsInAscendingOrder(Song[] songs, String findstr) {
        List<Song> list = new ArrayList<>();
        for (Song song : songs) {
            if (song.getartist().equalsIgnoreCase(findstr)) {
                list.add(song);
            }
        }
        if (list.size() == 0) {
            return null;
        }
        list.sort(Comparator.comparingDouble(Song::getduration));
        return list;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Song[] song = new Song[4];
        for (int i = 0; i < 4; i++) {
            int songId = sc.nextInt();
            sc.nextLine();
            String title = sc.nextLine();
            String artist = sc.nextLine();
            double duration = sc.nextDouble();
            sc.nextLine();
            song[i] = new Song(songId, title, artist, duration);
        }

        String find = sc.nextLine();
        String findstr = sc.nextLine();
        double ans = findSongDurationForArtist(song, find);
        if (ans != 0) {
            System.out.println(ans);
        } else {
            System.out.println("There are no songs with given artist");
        }

        List<Song> anslist = getSongsInAscendingOrder(song, findstr);
        if (anslist != null) {
            for (Song s : anslist) {
                System.out.println(s.getid());
                System.out.println(s.gettitle());
            }
        } else {
            System.out.println("no");
        }
    }
}