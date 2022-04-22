package pka.excercise;

public class Club {

    private String clubName;
    private Address address;
    private Name name;

    public Club() {
        this(   "Schachzentrum Seeblick e.V.",
                new Address("Talsperrenstraße", 56, "01744", "Dippoldiswalde"),
                new Name("Max",'a',"Mustermann")
        );
    }

    public Club(String clubName, Address address, Name name) {
        this.clubName = clubName;
        this.address = address;
        this.name = name;
    }

    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Club{" +
                "clubName='" + clubName + '\'' +
                ", address=" + address +
                ", name=" + name +
                '}';
    }
}
