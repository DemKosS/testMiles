
public class BonusMilesService {
    public int calculate(int price) {
        int priceForMile = 20;
        int totalMileForTicket = price / priceForMile;
        return totalMileForTicket;
    }
}
