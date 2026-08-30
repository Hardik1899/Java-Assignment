public class CourseEnrollment {
    public static void main(String[] args){

    }
class Course{
        String courseCode;
    String title;
    int capacity;
    int enrolledCount;

    public Course(String courseCode, String title, int capacity) {
        this.courseCode = courseCode;
        this.title = title;
        this.capacity = capacity;
        this.enrolledCount = 0;
    }

    public boolean enroll() {
        if (isFull()) {
            return false;
        }else {
            enrolledCount++;
            return true;
        }
    }
    public boolean withdraw() {
        if (enrolledCount == 0) {
            return false;
        }else {
            enrolledCount--;
            return true;
        }
    }
    public boolean isFull() {
        return enrolledCount == capacity;
    }
    public int getAvailableSeats() {
        return capacity - enrolledCount;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getTitle() {
        return title;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getEnrolledCount() {
        return enrolledCount;
    }

    @Override
    public String toString() {
        return "Course{" + "courseCode ='" + courseCode + " " + ", title ='" + title + " " + ", capacity=" + capacity + ", enrolledCount =" + enrolledCount + ", availableSeat s=" + getAvailableSeats() + '}';
    }
}

    public class CoursEenrollment {
        public void main(String[] args) {

            Course course = new Course("CS101", "Java Programming", 3);

            System.out.println("Initial course:");
            System.out.println(course);
            System.out.println("\nEnroll student 1: " + course.enroll());

            System.out.println("Enroll student 2: " + course.enroll());

            System.out.println("Available seats: " + course.getAvailableSeats());
            System.out.println("\nEnroll student 3: " + course.enroll());

            System.out.println("Course full: " + course.isFull());

            System.out.println("Enroll student 4: " + course.enroll());


            System.out.println("\nWithdraw student: " + course.withdraw());

            System.out.println("Course full: " + course.isFull());

            System.out.println("Available seats: " + course.getAvailableSeats());

            System.out.println("\nFinal course:");
            System.out.println(course);
        }
}
}
