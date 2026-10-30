public class Main {

    public static void main(String[] args) {

        Student[] students = {
                new Student("Ana", 18.5),
                new Student("Luis", 16.0),
                new Student("Maria", 19.2),
                new Student("Pedro", 15.7),
                new Student("Sofia", 18.5)
        };

        System.out.println("TOP 3 STUDENTS");

        for (int place = 1; place <= 3; place++) {

            int highest = 0;

            for (int i = 0; i < 5; i++) {

                if (students[i].grade > students[highest].grade) {
                    highest = i;
                }

            }

            System.out.println(place + ". " +
                    students[highest].name + " - " +
                    students[highest].grade);

            students[highest].grade = -1;
        }
    }
}