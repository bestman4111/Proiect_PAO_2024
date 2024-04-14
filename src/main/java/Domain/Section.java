package Domain;

public class Section {
    private static int sectionId = 0;
    private String sectionName;
    private SectionType type;

    public Section(String sectionName, SectionType type) {
        this.sectionName = sectionName;
        this.type = type;
        sectionId++;
    }

    public static int getSectionId() {
        return sectionId;
    }

    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    public SectionType getType() {
        return type;
    }

    public void setType(SectionType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Section " + sectionId + ", '" + sectionName + '\'' + ", is for " + type;
    }
}
