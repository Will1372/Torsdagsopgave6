import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Person> persons = new ArrayList<>();
        ArrayList<String> passedCourses1 = new ArrayList<>();
        passedCourses1.add("Java");
        passedCourses1.add("Python");

        ArrayList<String> canTeach = new ArrayList<>();
        canTeach.add("Java");
        canTeach.add("Python");

        Student student1 = new Student("Asbjørn", passedCourses1);
        Teacher teacher1 = new Teacher("William", canTeach);

        persons.add(student1);
        persons.add(teacher1);

        for (Person person : persons) {
            boolean result = person.addCourse("Java");
            if (!result) {
                if (person instanceof Student) {
                    System.out.println(person.getName() + " har allerede bestået dette kursus.");
                } else if (person instanceof Teacher) {
                    System.out.println(person.getName() + " kan IKKE undervise i dette fag.");
                }
            }
        }
    }
}