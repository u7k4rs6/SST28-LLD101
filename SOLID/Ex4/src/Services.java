public class Services {
    public boolean hasMess;
    public boolean hasLaundry;
    public boolean hasGym;

    public Services(boolean hasMess, boolean hasLaundry, boolean hasGym) {
        this.hasMess = hasMess;
        this.hasLaundry = hasLaundry;
        this.hasGym = hasGym;
    }

    public double calculateExtras() {
        double cost = 0;
        if (hasMess == true) {
            cost = cost + 1000.0;
        }
        if (hasLaundry == true) {
            cost = cost + 500.0;
        }
        if (hasGym == true) {
            cost = cost + 300.0;
        }
        return cost;
    }
}