/**
 * Represents a college student with academic year and major.
 */
class CollegeStudent extends Student {
    private String major;
    private int year;

    /**
     * Creates a college student and initializes inherited student fields along with year and major.
     *
     * @param name student's name
     * @param age student's age
     * @param gender student's gender
     * @param idNum student ID number
     * @param gpa student's GPA
     * @param year current college year
     * @param major student's major
     */
    public CollegeStudent(String name, int age, String gender, String idNum, double gpa, int year, String major) {
        super(name, age, gender, idNum, gpa);
        this.major = major;
        this.year = year;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    /**
     * Returns a readable string with college student details.
     *
     * @return formatted college student details
     */
    @Override
    public String toString() {
        return super.toString() + ", Year: " + year + ", Major: " + major;
    }
}
