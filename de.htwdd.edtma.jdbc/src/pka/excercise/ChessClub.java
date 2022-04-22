package pka.excercise;

public class ChessClub extends Club {

    private String zpsCode;

    public ChessClub() {
        super();
        this.zpsCode = "F2208";
    }

    public ChessClub(String clubName, Address address, Name name, String zpsCode) {
        super(clubName, address, name);
        this.zpsCode = zpsCode;
    }

    public String getZpsCode() {
        return zpsCode;
    }

    public void setZpsCode(String zpsCode) {
        this.zpsCode = zpsCode;
    }

    @Override
    public String toString() {
        return "ChessClub{" +
                "zpsCode='" + zpsCode + '\'' +
                '}';
    }
}
