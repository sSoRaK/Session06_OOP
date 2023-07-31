import java.util.Scanner;

public class Student {
    private String studentId;
    private String studentName;
    private int age;
    private String sex;
    private float htmlScore;
    private float cssScore;
    private float javascriptScore;
    private float avgScore;

    //default constructor

    public Student() {
    }

    //constructor
    public Student(String studentId, String studentName, int age, String sex, float htmlScore, float cssScore, float javascriptScore, float avgScore) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.age = age;
        this.sex = sex;
        this.htmlScore = htmlScore;
        this.cssScore = cssScore;
        this.javascriptScore = javascriptScore;
        this.avgScore = avgScore;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return this.sex;
    }

    public void setSex(String sex) {
        if ("Nam".equalsIgnoreCase(sex) || "Nữ".equalsIgnoreCase(sex)) {
            this.sex = sex;
        }
    }

    public float getHtmlScore() {
        return htmlScore;
    }

    public void setHtmlScore(float htmlScore) {
        this.htmlScore = htmlScore;
    }

    public float getCssScore() {
        return cssScore;
    }

    public void setCssScore(float cssScore) {
        this.cssScore = cssScore;
    }

    public float getJavascriptScore() {
        return javascriptScore;
    }

    public void setJavascriptScore(float javascriptScore) {
        this.javascriptScore = javascriptScore;
    }

    public float getAvgScore() {
        return avgScore;
    }

    public void setAvgScore(float avgScore) {
        this.avgScore = avgScore;
    }

    public void inputData(Scanner scanner) {
        System.out.print("Nhập mã sinh viên: ");
        this.studentId = scanner.nextLine();
        System.out.print("Nhập tên sinh viên: ");
        this.studentName = scanner.nextLine();
        System.out.print("Nhập tuổi sinh viên: ");
        this.age = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập giới tính: ");
        this.sex = scanner.nextLine();
        System.out.print("Điểm HTML: ");
        this.htmlScore = Float.parseFloat(scanner.nextLine());
        System.out.print("Điểm CSS: ");
        this.cssScore = Float.parseFloat(scanner.nextLine());
        System.out.print("Điểm JavaScript: ");
        this.javascriptScore = Float.parseFloat(scanner.nextLine());
    }

    public void displayData() {
        System.out.printf("Mã sinh viên: %s - Tên sinh viên: %s - Tuổi: %d - Sex: %s\n", this.studentId, this.studentName, this.age, this.sex);
        System.out.printf("Điểm HTML: %.3f - Điểm CSS: %.3f - Điểm JavaScript: %.3f\n", this.htmlScore, this.cssScore, this.javascriptScore);
        System.out.printf("Điểm trung bình: %.3f\n", this.avgScore);
    }

    public void calAvgScore() {
        this.avgScore = (htmlScore + cssScore + javascriptScore) / 3;
    }
}
