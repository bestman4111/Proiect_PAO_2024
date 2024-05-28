package Domain;

public enum SectionType {
//    Books, CDs, Magazines
    BOOKS("Books"),
    CDS("CDs"),
    MAGAZINES("Magazines");

    private String value;

    private SectionType(String value) {
        this.value = value;
    }
}
