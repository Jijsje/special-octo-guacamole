package TDD;

public interface TrajectNaarTrajectEenhedenService {
    int getTrajectEenheden(String from, String to) throws InvalidLocationException;

    class InvalidLocationException extends Exception {
    }
}
