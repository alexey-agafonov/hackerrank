package dev.agafonov;

class Person {
    protected String firstName;
    protected String lastName;
    protected int id;

    /**
     * Class constructor
     *
     * @param firstName - first name of a person
     * @param lastName - last name of a person
     * @param id - identification number of a person
     */
    Person(String firstName, String lastName, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    /**
     * Print person data.
     */
    public void printPerson() {
        System.out.println("Name: " + lastName + ", " + firstName+ "\nID: " + id);
    }
}
