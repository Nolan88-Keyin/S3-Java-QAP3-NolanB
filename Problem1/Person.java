/**
 * Parent class for a person in the school model.
 */
class Person {
    protected String myName;
    protected int myAge;
    protected String myGender;

    /**
     * Creates a person with name, age, and gender.
     *
     * @param name person's name
     * @param age person's age
     * @param gender person's gender
     */
    public Person(String name, int age, String gender) {
        myName = name;
        myAge = age;
        myGender = gender;
    }

    /**
     * Returns a readable string with person details.
     *
     * @return formatted person details
     */
    public String toString() {
        return "Name: " + myName + ", Age: " + myAge + ", Gender: " + myGender;
    }

    public String getName() {
        return myName;
    }

    public int getAge() {
        return myAge;
    }

    public String getGender() {
        return myGender;
    }

    public void setName(String name) {
        myName = name;
    }

    public void setAge(int age) {
        myAge = age;
    }

    public void setGender(String gender) {
        myGender = gender;
    }
}

    
