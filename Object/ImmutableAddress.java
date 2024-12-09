package Object;

public class ImmutableAddress {

    private final String town;


    public ImmutableAddress(String town) {
        this.town = town;
    }

    public ImmutableAddress add(String newTown){
        return new ImmutableAddress(newTown);
    }

    @Override
    public String toString() {
        return "ImmutableAddress{" +
                "town='" + town + '\'' +
                '}';
    }
}
