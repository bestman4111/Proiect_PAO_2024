package Domain;

public class Magazine extends Article{
    private static int magazineId = 0;
    private int magazineNoOfPages;
    private String magazineIssue;
    private String magazinePublisher;

    public Magazine(String articleName, int magazineNoOfPages, String magazineIssue, String magazinePublisher) {
        super(articleName);
        this.magazineNoOfPages = magazineNoOfPages;
        this.magazineIssue = magazineIssue;
        this.magazinePublisher = magazinePublisher;
        magazineId++;
    }

    public int getMagazineNoOfPages() {
        return magazineNoOfPages;
    }

    public void setMagazineNoOfPages(int magazineNoOfPages) {
        this.magazineNoOfPages = magazineNoOfPages;
    }

    public String getMagazineIssue() {
        return magazineIssue;
    }

    public void setMagazineIssue(String magazineIssue) {
        this.magazineIssue = magazineIssue;
    }

    public String getMagazinePublisher() {
        return magazinePublisher;
    }

    public void setMagazinePublisher(String magazinePublisher) {
        this.magazinePublisher = magazinePublisher;
    }

    @Override
    public String toString() {
        return "Magazine number " + magazineId + ", titled \"" + articleName + "\" (" + magazineNoOfPages + " pages) was first issued in " + magazineIssue + " by " + magazinePublisher + " (Article number " + articleId + ")";
    }
}
