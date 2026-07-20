/**
 * Represents a teacher with a subject specialization and salary.
 */
class Teacher extends Person {
    protected String mySubject;
    protected double mySalary;
    
    /**
     * Creates a teacher and initializes inherited person fields along with subject and salary.
     *
     * @param name teacher's name
     * @param age teacher's age
     * @param gender teacher's gender
     * @param subject teacher's subject
     * @param salary teacher's annual salary
     */
    public Teacher(String name, int age, String gender, String subject, double salary) {
        super(name, age, gender);
        mySubject = subject;
        mySalary = salary;
    }

    public String getSubject() {
        return mySubject;
    }

    public double getSalary() {
        return mySalary;
    }

    public void setSubject(String subject) {
        mySubject = subject;
    }

    public void setSalary(double salary) {
        mySalary = salary;
    }

    /**
     * Returns a readable string with teacher details.
     *
     * @return formatted teacher details
     */
    @Override
    public String toString() {
        return super.toString() + ", Subject: " + mySubject + ", Salary: " + mySalary;
    }
}
