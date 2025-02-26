package PRA;

import java.util.*;

class TVSeries {
    private int SeriesID;
    private String SeriesName;
    private int TRP;

    public TVSeries(int SeriesID, String SeriesName, int TRP) {
        this.SeriesID = SeriesID;
        this.SeriesName = SeriesName;
        this.TRP = TRP;
    }

    public int getSeriesID() {
        return SeriesID;
    }

    public String getSeriesName() {
        return SeriesName;
    }

    public void setTRP(int trp) {
        this.TRP = trp;
    }

    public int getTRp() {
        return TRP;
    }
}

class TRPTracker {
    public void updateTRP(TVSeries series, int view) {
        int increment = view / 5000;
        series.setTRP(series.getTRp() + increment);
    }

    public void simulateTRP(ArrayList<TVSeries> Serieslist, int seriesId, int view) {
        for (TVSeries t : Serieslist) {
            if (t.getSeriesID() == seriesId) {
                updateTRP(t, view);
                break;
            }
        }
    }

    public void displayTVSeriesStats(TVSeries s) {
        System.out.println("Series ID: " + s.getSeriesID());
        System.out.println("Series Name: " + s.getSeriesName());
        System.out.println("TRP: " + s.getTRp());
        System.out.println();
    }
}

public class PRA23 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<TVSeries> tvSeries = new ArrayList<>();
        TRPTracker tracker = new TRPTracker();

        while (true) {
            System.out.println("Enter the serial Number");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the serial Name");
            String name = sc.nextLine();
            System.out.println("Enter valid TRP");
            int TRp = sc.nextInt();
            sc.nextLine();

            tvSeries.add(new TVSeries(id, name, TRp));

            System.out.println("Do you want to add more series");
            char choice = sc.next().charAt(0);
            if (choice == 'n' || choice == 'N') {
                break;
            }
        }

        System.out.println("Enter the simulation number");
        int n = sc.nextInt();sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Series ID for simulation: ");
            int seriesId1 = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Series ID view");
            int views = sc.nextInt();
            sc.nextLine();
            tracker.simulateTRP(tvSeries, seriesId1, views);
        }

        // displayTVSeriesStats(TVSeries);
        for (TVSeries x : tvSeries) {
            tracker.displayTVSeriesStats(x);
        }
    }
}