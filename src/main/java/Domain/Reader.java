package Domain;

import Service.CSVFile;

import java.time.LocalTime;

public class Reader extends Person{
    private static int readerId = 0;

    public Reader(String personName, int personAge) {
        super(personName, personAge);
        readerId++;
        CSVFile.addDataToArray(new String[]{"Created reader " + this.getPersonName(), LocalTime.now().toString()});
    }

    @Override
    public String toString() {
        return "Reader number " + readerId + ", " + personName + ", was born in the year " + personBirthYear + " (Person number " + personId + ")";
    }
}
