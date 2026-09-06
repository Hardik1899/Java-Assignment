public class CampusManagementApp {

    public static void main(String[] args) {

        CampusRegistry registry = new CampusRegistry(10);

        Student s1 = new Student("Rahul", 101, new int[]{80, 75, 90});
        Student s2 = new Student("Aman", 102, new int[]{65, 70, 60});
        Student s3 = new Student("Riya", 103, new int[]{95, 88, 92});

        Instructor i1 = new Instructor("Dr. Sharma", 201, "Java");
        Instructor i2 = new Instructor("Dr. Mehta", 202, "Database");

        // Adding people to registry
        registry.addPerson(s1);
        registry.addPerson(s2);
        registry.addPerson(s3);
        registry.addPerson(i1);
        registry.addPerson(i2);

        System.out.println("------ CAMPUS REGISTRY ------");

        // Display all people
        registry.displayPeople();

        // Feature 1: Search by name
        System.out.println("\n------ SEARCH RESULT ------");
        registry.searchByName("Riya");

        // Feature 2: Student with highest average
        System.out.println("\n------ TOP STUDENT ------");
        registry.findTopStudent();
    }
}


abstract class Person {

    private String name;
    private int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public abstract String getRole();

    @Override
    public String toString() {
        return "Name: " + name + ", ID: " + id;
    }
}


class Student extends Person {

    private int[] marks;

    public Student(String name, int id, int[] marks) {
        super(name, id);

        if (marks == null || marks.length == 0) {
            throw new IllegalArgumentException("Marks cannot be empty");
        }

        this.marks = marks;
    }

    public int[] getMarks() {
        return marks;
    }

    public double getAverage() {

        int total = 0;

        for (int mark : marks) {
            total += mark;
        }

        return (double) total / marks.length;
    }

    @Override
    public String getRole() {
        return "Student";
    }

    @Override
    public String toString() {
        return "Student - " + super.toString()
                + ", Average: " + getAverage();
    }
}


class Instructor extends Person {

    private String subject;

    public Instructor(String name, int id, String subject) {
        super(name, id);
        this.subject = subject;
    }

    @Override
    public String getRole() {
        return "Instructor";
    }

    @Override
    public String toString() {
        return "Instructor - " + super.toString()
                + ", Subject: " + subject;
    }
}


class CampusRegistry {

    private Person[] people;
    private int size;

    public CampusRegistry(int capacity) {
        people = new Person[capacity];
        size = 0;
    }

    public void addPerson(Person person) {

        if (size < people.length) {
            people[size] = person;
            size++;
        } else {
            System.out.println("Registry is full.");
        }
    }


    public void displayPeople() {

        for (int i = 0; i < size; i++) {

            Person person = people[i];

            System.out.println(person.getRole() + ": " + person);
        }
    }


    public void searchByName(String name) {

        boolean found = false;

        for (int i = 0; i < size; i++) {

            if (people[i].getName().equalsIgnoreCase(name)) {
                System.out.println(people[i]);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Person not found.");
        }
    }


    public void findTopStudent() {

        Student topStudent = null;

        for (int i = 0; i < size; i++) {

            Person person = people[i];

            // Safe instanceof check and downcast
            if (person instanceof Student) {

                Student student = (Student) person;

                if (topStudent == null ||
                        student.getAverage() > topStudent.getAverage()) {

                    topStudent = student;
                }
            }
        }

        if (topStudent != null) {
            System.out.println(topStudent);
        } else {
            System.out.println("No students found.");
        }
    }
}

