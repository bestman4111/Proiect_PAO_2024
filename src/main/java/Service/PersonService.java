package Service;

import Domain.Person;

public class PersonService {
    Person[] persons;
    private int lastIndex;
    private int maxNoOfPersons;

    public PersonService(int maxNoOfPersons) {
        this.persons = new Person[maxNoOfPersons];
        this.lastIndex = 0;
        this.maxNoOfPersons = maxNoOfPersons;
    }

    public void addPerson(Person person) {
        if(lastIndex < persons.length) {
            persons[lastIndex] = person;
            System.out.println("Added person " + person.getPersonName() + " at index " + lastIndex);
            lastIndex++;
        }
        else {
            throw new ArrayIndexOutOfBoundsException("Maximum number of persons reached");
        }
    }
}
