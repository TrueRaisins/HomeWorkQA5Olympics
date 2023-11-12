import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Артур", "Петерс", "Дмитриевич", List.of(80, 90, 75)));
        students.add(new Student("Александр", "Богомолов", "Петрович", List.of(85, 70, 90)));
        students.add(new Student("Антон", "Смирнов", "Сергеевич", List.of(95, 85, 80)));
        students.add(new Student("Филиппов", "Андрей", "Николаевич", List.of(70, 80, 90)));

        winners(students);
    }
    public static void winners(@org.jetbrains.annotations.NotNull List<Student> students) {
        students.sort((s1, s2) -> Double.compare(s2.calculateAverageScore(), s1.calculateAverageScore()));

        System.out.println("Победители:");

        for (int i = 0; i < 3; i++) {
            Student student = students.get(i);
            System.out.println((i + 1) + " место: " + student.getSurname() + " " + student.getName() + " " + student.getPatronymic());
        }
    }
}