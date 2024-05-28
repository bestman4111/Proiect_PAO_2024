package Service;

import Domain.Person;

import java.time.LocalTime;
import java.util.*;

public class PersonService {
    public List<Person> persons;
    private int lastIndex;
    private int maxNoOfPersons;

    public PersonService(int maxNoOfPersons) {
        this.persons = new ArrayList<>();
        this.lastIndex = 0;
        this.maxNoOfPersons = maxNoOfPersons;
        CSVFile.addDataToArray(new String[]{"Created new person service", LocalTime.now().toString()});
    }

    public void addPerson(Person person) {
        if(lastIndex < this.maxNoOfPersons) {
            persons.add(lastIndex, person);
            Collections.sort(persons, new PersonComparator());
            System.out.println("Added person " + person.getPersonName() + " at index " + lastIndex);
            lastIndex++;
            CSVFile.addDataToArray(new String[]{"Added person " + person.getPersonName() + " to person service", LocalTime.now().toString()});
            AddToDB.addPersonToDB(person);
        }
        else {
            throw new ArrayIndexOutOfBoundsException("Maximum number of persons reached");
        }
    }

    public void showListOfPersons(){
        for(Person person : persons) {
            System.out.println(person.getPersonName() + " was born in " + person.getPersonBirthYear());
            CSVFile.addDataToArray(new String[]{"Displayed list of persons in the person service", LocalTime.now().toString()});
        }
    }
}

class PersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person a, Person b) {
        return a.getPersonName().compareTo(b.getPersonName());
    }
}
