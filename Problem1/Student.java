/**
 * Represents a high school student with an ID and GPA.
 */
class Student extends Person {
    protected String myIdNum;
    protected double myGPA;

    /**
     * Creates a student and initializes inherited person fields.
     *
     * @param name student's name
     * @param age student's age
     * @param gender student's gender
     * @param idNum student ID number
     * @param gpa student's GPA
     */
    public Student(String name, int age, String gender, String idNum, double gpa) {
        super(name, age, gender);
        myIdNum = idNum;
        myGPA = gpa;
    }

    public String getIdNum() {
        return myIdNum;
    }

    public double getGPA() {
        return myGPA;
    }

    public void setIdNum(String idNum) {
        myIdNum = idNum;
    }

    public void setGPA(double gpa) {
        myGPA = gpa;
    }

    /**
     * Returns a readable string with student details.
     *
     * @return formatted student details
     */
    @Override
    public String toString() {
        return super.toString() + ", Student ID: " + myIdNum + ", GPA: " + myGPA;
    }
}
