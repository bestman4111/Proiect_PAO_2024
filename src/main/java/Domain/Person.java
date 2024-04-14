package Domain;

public class Person {
    protected static int personId = 0;
    protected String personName;
    protected int personBirthYear;

    public Person(String personName, int personBirthYear) {
        this.personName = personName;
        this.personBirthYear = personBirthYear;
        personId++;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public int getPersonBirthYear() {
        return personBirthYear;
    }

    public void setPersonBirthYear(int personBirthYear) {
        this.personBirthYear = personBirthYear;
    }

    @Override
    public String toString() {
        return "Person{" +
                "personName = '" + personName + '\'' +
                ", personBirthYear = " + personBirthYear +
                '}';
    }
}
