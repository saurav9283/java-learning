package PRA;
import java.util.*;

class ViewIsNegativeException extends Exception{
    public ViewIsNegativeException(String message)
    {
        super(message);
    }
}

class Song{
    private int songId;
    private String songName;
    private String singerNamer;
    private int songViews;
    public Song(int songId, String songName, String singerNamer,int songViews) throws ViewIsNegativeException
    {
        if(songViews < 0)
        {
            throw new ViewIsNegativeException("Invalid SongsView: SongViews cannot be negative.");
        }
        this.songId = songId;
        this.songName = songName;
        this.singerNamer = singerNamer;
        this.songViews =  songViews;
    }
    public int  getsongId()
    {
        return songId;
    }
    public String getsongName()
    {
        return songName;
    }
    public String getsingerNamer()
    {
        return singerNamer;
    }
    public int getsongViews()
    {
        return songViews;
    }
}

class MusicApp{
    private int appId;
    private String appName;
    private int appSubscription;
    private List<Song> songs;
    public MusicApp(int appId, String appName,int appSubscription,List<Song> songs)
    {
        this.appId = appId;
        this.appName =  appName;
        this.appSubscription =  appSubscription;
        this.songs = songs;
    }
    public int getappId()
    {
        return appId;
    }
    public String getappName()
    {
        return appName;
    }
    public int getappSubscription()
    {
        return appSubscription;
    }
    public List<Song> getsongslist()
    {
        return songs;
    }

}
class Service{
    public int CalculateAverageViewsBySingerName(List<MusicApp> musicApps , String findbySinger)
    {
        int count = 0;
        int sum = 0;
        for(MusicApp app:musicApps)
        {
            for(Song song:app.getsongslist())
            {
                if(song.getsingerNamer().equalsIgnoreCase(findbySinger))
                {
                    sum += song.getsongViews();
                    count++;
                }
            }
        }
        if(count> 0)
        {
            return sum/count;
        }
        else{
            System.out.println("No Song found with mentioned singerName.");
            return 0;
        }
    }

    public void findmusicAppOfSongsBySongName(List<MusicApp> musicApps, String findSongName)
    {
        Set<String> musicAppNames = new HashSet<>();
        for(MusicApp app:musicApps)
        {
            for(Song song:app.getsongslist())
            {
                if(song.getsongName().equalsIgnoreCase(findSongName))
                {
                    musicAppNames.add(app.getappName());
                }
            }
        }
        if(musicAppNames.isEmpty())
        {
            System.out.println("No matching musicApp found.");
        }
        else{
            for(String name:musicAppNames)
            {
                System.out.println(name);
            }
        }
    }
}

public class PRA21 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int noOfApp = sc.nextInt();sc.nextLine();
        List<MusicApp> musicappList = new ArrayList<>();
        for(int i = 0; i < noOfApp; i++)
        {
            int appId = sc.nextInt();sc.nextLine();
            String appName = sc.nextLine();
            int appSubscription =  sc.nextInt();sc.nextLine();
            int noOfSong = sc.nextInt();sc.nextLine();
            List<Song> songList = new ArrayList<>();
            
            for(int j = 0; j < noOfSong; j++)
            {
                int songId = sc.nextInt();sc.nextLine();
                String songName = sc.nextLine();
                String singerNamer = sc.nextLine();
                int songViews = sc.nextInt();sc.nextLine();
                try {
                    songList.add(new Song(songId, songName, singerNamer, songViews));
                } catch (ViewIsNegativeException  e) {
                    System.out.println(e.getMessage());
                    return;
                }
            }
            musicappList.add(new MusicApp(appId, appName, appSubscription, songList));
        }
        String findSingerName = sc.nextLine();
        String fingSongName =  sc.nextLine();

        Service service =new Service();
        int result = service.CalculateAverageViewsBySingerName(musicappList , findSingerName);
        if(result > 0)
        {
            System.out.println(result);
        }

        service.findmusicAppOfSongsBySongName(musicappList, fingSongName);
    }
}
