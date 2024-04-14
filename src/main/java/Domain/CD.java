package Domain;

public class CD extends Article{
    private static int CDId = 0;
    private int CDNoOfTracks;
    private CDGenre CDGenre;
    private int CDPublicationYear;
    private String CDPublisher;

    public CD(String articleName, int CDNoOfTracks, Domain.CDGenre CDGenre, int CDPublicationYear, String CDPublisher) {
        super(articleName);
        this.CDNoOfTracks = CDNoOfTracks;
        this.CDGenre = CDGenre;
        this.CDPublicationYear = CDPublicationYear;
        this.CDPublisher = CDPublisher;
        CDId++;
    }

    public int getCDNoOfTracks() {
        return CDNoOfTracks;
    }

    public void setCDNoOfTracks(int CDNoOfTracks) {
        this.CDNoOfTracks = CDNoOfTracks;
    }

    public Domain.CDGenre getCDGenre() {
        return CDGenre;
    }

    public void setCDGenre(Domain.CDGenre CDGenre) {
        this.CDGenre = CDGenre;
    }

    public int getCDPublicationYear() {
        return CDPublicationYear;
    }

    public void setCDPublicationYear(int CDPublicationYear) {
        this.CDPublicationYear = CDPublicationYear;
    }

    public String getCDPublisher() {
        return CDPublisher;
    }

    public void setCDPublisher(String CDPublisher) {
        this.CDPublisher = CDPublisher;
    }

    @Override
    public String toString() {
        return "CD number " + CDId + ", titled \"" + articleName + "\" contains " + CDNoOfTracks + " tracks, is of the " + CDGenre + " genre and it was first published in the year " + CDPublicationYear + " by " + CDPublisher + " (Article number " + articleId + ")";
    }
}
