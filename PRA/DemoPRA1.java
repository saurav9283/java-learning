package PRA;

import java.util.*;

class NoMissionFoundException extends Exception {
    public NoMissionFoundException(String message) {
        super(message);
    }
}

class NoDataAvailableException extends Exception {
    public NoDataAvailableException(String message) {
        super(message);
    }
}

class SpaceMissionDetails {
    private String missionName;
    private double lonchCost;
    private int noOfPlanetExposed;
    private List<String> planetNames;

    public SpaceMissionDetails(String missString, double lonchCost, int noOfPlanetExposed, List<String> planetNames) {

        this.missionName = missString;
        this.lonchCost = lonchCost;
        this.noOfPlanetExposed = noOfPlanetExposed;
        this.planetNames = planetNames;
    }

    public String getmissionName() {
        return missionName;
    }

    public double getlonchCost() {
        return lonchCost;
    }

    public int getnoOfPlanetExposed() {
        return noOfPlanetExposed;
    }

    public List<String> getplanetNames() {
        return planetNames;
    }

}

class SpaceMissionService {
    private List<SpaceMissionDetails> listOFMissionDetails;

    public SpaceMissionService(List<SpaceMissionDetails> listOFMissionDetails) {
        this.listOFMissionDetails = listOFMissionDetails;
    }

    public List<String> MissionExposedSpecificDetails(List<SpaceMissionDetails> listOFMissionDetails,
            String PlanetName) throws NoMissionFoundException {
        if (listOFMissionDetails.isEmpty()) {
            throw new NoMissionFoundException("No Space Missions Found");
        }
        List<String> ans = new ArrayList<>();
        for (SpaceMissionDetails space : listOFMissionDetails) {
            if (space.getplanetNames().contains(PlanetName)) {
                ans.add(space.getmissionName());
            }
        }
        return ans;
    }

    public double averageLonchCode() throws NoDataAvailableException {

        if (listOFMissionDetails.isEmpty()) {
            throw new NoDataAvailableException("No Data Available");
        }
        double sum = 0;
        int count = 0;
        for (SpaceMissionDetails s : listOFMissionDetails) {
            sum += s.getlonchCost();
            count++;
        }
        if (count > 0) {
            return sum / count;
        } else {
            return 0;
        }
    }
}

public class DemoPRA1 {
    public static void main(String[] args) throws NoMissionFoundException {
        Scanner sc = new Scanner(System.in);
        int numberOfMission = sc.nextInt();
        sc.nextLine();

        List<SpaceMissionDetails> listMission = new ArrayList<>();
        for (int i = 0; i < numberOfMission; i++) {
            String MissionName = sc.nextLine();
            double LonchCost = sc.nextDouble();
            sc.nextLine();
            int numberOfMissionExposed = sc.nextInt();
            sc.nextLine();
            List<String> planetList = new ArrayList<>();
            for (int j = 0; j < numberOfMissionExposed; j++) {
                String planetName = sc.nextLine();
                planetList.add(planetName);
            }
            listMission.add(new SpaceMissionDetails(MissionName, LonchCost, numberOfMissionExposed, planetList));

        }

        SpaceMissionService spaceMission = new SpaceMissionService(listMission);
        String find = sc.nextLine();
        try {
            List<String> ans = spaceMission.MissionExposedSpecificDetails(listMission, find);
            for (String s : ans) {
                System.out.println(s);
            }
        } catch (NoMissionFoundException  e) {
            System.out.println(e.getMessage());
            // return;
        }

        try {
            double avg = spaceMission.averageLonchCode();
            System.out.println(avg + " avg");
        } catch (NoDataAvailableException e) {
            System.out.println(e.getMessage());
        }

    }
}
