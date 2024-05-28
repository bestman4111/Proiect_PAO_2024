package Domain;

import Service.CSVFile;

import java.time.LocalTime;

public class Library {
    private static int libraryId = 0;
    private String libraryName;
    private String libraryStreet;
    private int libraryStreetNumber;
    private String libraryCity;
    private int maxNoOfSections;
    private int lastIndex;
    Section[] sections;

    public Library(String libraryName, String libraryStreet, int libraryStreetNumber, String libraryCity, int maxNoOfSections) {
        this.libraryName = libraryName;
        this.libraryStreet = libraryStreet;
        this.libraryStreetNumber = libraryStreetNumber;
        this.libraryCity = libraryCity;
        this.maxNoOfSections = maxNoOfSections;
        this.lastIndex = 0;
        this.sections = new Section[maxNoOfSections];
        libraryId++;
        CSVFile.addDataToArray(new String[]{"Created library " + this.libraryName, LocalTime.now().toString()});
    }

    public String getLibraryName() {
        return libraryName;
    }

    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }

    public String getLibraryStreet() {
        return libraryStreet;
    }

    public void setLibraryStreet(String libraryStreet) {
        this.libraryStreet = libraryStreet;
    }

    public int getLibraryStreetNumber() {
        return libraryStreetNumber;
    }

    public void setLibraryStreetNumber(int libraryStreetNumber) {
        this.libraryStreetNumber = libraryStreetNumber;
    }

    public String getLibraryCity() {
        return libraryCity;
    }

    public void setLibraryCity(String libraryCity) {
        this.libraryCity = libraryCity;
    }

    public void addSection(Section section) {
        if(lastIndex < sections.length){
            sections[lastIndex] = section;
            lastIndex++;
            System.out.println("Added section " + section.getSectionName() + " to library '" + libraryName + "' at index " + lastIndex);
            CSVFile.addDataToArray(new String[]{"Added section " + section.getSectionName(), LocalTime.now().toString()});
        }
    }

    @Override
    public String toString() {
        return "Library number " + libraryId + ", named '" + libraryName + '\'' + ", is found at " + libraryStreet + ", number " + libraryStreetNumber + ", in the city of " + libraryCity;
    }
}
