/**
 * Demo of Problem 1 inheritance classes.
 */
public class Demo {
    /**
     * Creates and prints sample Person, Student, Teacher, and CollegeStudent objects.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        System.out.println("=== School Object Creation Demo ===\n");

        System.out.println("Person:");
        Person bob = new Person("Coach Bob", 27, "M");
        System.out.println(bob);

        System.out.println("\nStudent:");
        Student lynne = new Student("Lynne Brooke", 16, "F", "HS95129", 3.5);
        System.out.println(lynne);

        System.out.println("\nTeacher:");
        Teacher mrJava = new Teacher("Duke Java", 34, "M", "Computer Science", 50000);
        System.out.println(mrJava);

        System.out.println("\nCollegeStudent:");
        CollegeStudent ima = new CollegeStudent("Ima Frosh", 18, "F", "UCB123", 4.0, 1, "English");
        System.out.println(ima);
    }
}
