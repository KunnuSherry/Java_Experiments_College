import java.util.*;

class Student {
    String name;
    int age;
    char grade;

    Student() {
        name = "";
        age = -1;
        grade = 'Z';
    }

    Student(String name, int age, char grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    Student(Student obj) {
        this.name = obj.name;
        this.age = obj.age;
        this.grade = obj.grade;
    }

    void display() {
        System.out.println("The name of the student is: " + name);
        System.out.println("The age of the student is: " + age);
        System.out.println("The grade of the student is: " + grade);
    }
}

class SMain {
    public static void main(String[] args) {
        Student[] arr = new Student[5];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter the name of " + (i + 1) + " Student: ");
            String name = sc.nextLine();
            System.out.println();

            System.out.print("Enter the age of " + (i + 1) + " Student: ");
            int age = sc.nextInt();
            System.out.println();

            System.out.print("Enter the Grade of " + (i + 1) + " Student: ");
            char grade = sc.next().charAt(0);
            System.out.println();

            arr[i] = new Student(name, age, grade);
            sc.nextLine();
        }

        System.out.println("All Students Information:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Student number: " + (i + 1));
            arr[i].display();
        }

        System.out.println("Grade A Students Information:");
        for (int i = 0; i < 5; i++) {
            if (arr[i].grade == 'A') {
                arr[i].display();
            }
        }

        sc.close();
    }
}