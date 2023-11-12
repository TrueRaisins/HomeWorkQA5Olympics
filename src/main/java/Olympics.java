import java.util.ArrayList;
import java.util.List;

class Student {
    private String name;
    private String surname;
    private String patronymic;
    private List<Integer> score;

    public Student(String name, String surname, String patronymic, List<Integer> score) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public List<Integer> getScore() {
        return score;
    }

    public void setScore(List<Integer> score) {
        this.score = score;
    }

    public double calculateAverageScore() {
        int sum = 0;
        for (int s : score) {
            sum += s;
        }
        return (double) sum / score.size();
    }
}