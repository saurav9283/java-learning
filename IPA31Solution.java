import java.util.*;

class Music{
    private int playListNo ;
    private String type;
    private int count ;
    private double duration;

    public Music(int playListNo, String type,int count, double duration)
    {
        this.playListNo = playListNo;
        this.type = type;
        this.count = count;
        this.duration = duration;
    }
    public int getplayListNo()
    {
        return playListNo;
    }
    public String gettype()
    {
        return type;
    }
    public int getcount()
    {
        return count;
    }
    public double getduration()
    {
        return duration;
    }
}

public class IPA31Solution{
    public static int findAvgOfCount(Music[] musics, int find)
    {
        int sum = 0;
        int count = 0;
        for(Music music:musics)
        {
            if(music.getcount() > find)
            {
                sum += music.getcount();
                count++;
            }
        }
        if(sum > 0)
        {
            int avg = sum/count;
            return avg;
        }
        else{
            return 0;
        }
    }

    public static List<Music> sortTypeByDuration(Music[] musics, double finddouble)
    {
        List<Music> list = new ArrayList<>();
        for(Music music: musics)
        {
            if(music.getduration() > finddouble)
            {
                list.add(music);
            }
        }
        if(list.isEmpty())
        {
            return null;
        }
        list.sort(Comparator.comparingDouble(Music::getduration));
        return list;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        sc.nextLine();
        Music[] music = new Music[num1];
        for(int i = 0; i < num1; i++)
        {
            int  playListNo = sc.nextInt();sc.nextLine();
            String type = sc.nextLine();
            int count = sc.nextInt();sc.nextLine();
            double duration = sc.nextDouble();sc.nextLine();

            music[i] = new Music(playListNo, type, count, duration);
        }

        int find = sc.nextInt();sc.nextLine();
        double finddouble =sc.nextDouble();sc.nextLine();
        int ans = findAvgOfCount(music, find);
        if(ans != 0)
        {
            System.out.println(ans);
        }
        else{
            System.out.println("No playlist found");
        }

        List<Music> newlist = sortTypeByDuration(music , finddouble);
        if(newlist != null)
        {
            for(Music m: newlist)
            {
                System.out.println(m.gettype());
            }
        }
        else{
            System.out.println("No playlist found with mentioned attribute");
        }
    }
}