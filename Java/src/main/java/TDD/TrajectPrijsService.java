package TDD;

public class TrajectPrijsService{


    private TrajectNaarTrajectEenhedenService eenhedenService;
    private TrajectEenhedenNaarPrijsService prijsService;

    public TrajectPrijsService() {
    }

    int getTrajectPrijs(String from, String to){
        int eenheden = 0;
        try {
            eenheden = eenhedenService.getTrajectEenheden(from, to);
        } catch (TrajectNaarTrajectEenhedenService.InvalidLocationException e) {
            System.out.println("Ongeldige plaatsnaam/-namen gedetecteerd.");
        }
        return prijsService.getPriceTrajectEenheden(eenheden);
    }

    public void setEenhedenService(TrajectNaarTrajectEenhedenService eenhedenService) {
        this.eenhedenService = eenhedenService;
    }

    public void setPrijsService(TrajectEenhedenNaarPrijsService prijsService) {
        this.prijsService = prijsService;
    }
}
