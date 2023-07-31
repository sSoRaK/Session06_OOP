import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class StudentImp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soLuongSV;
        do {
            System.out.print("Nhập số lượng sinh viên: ");
            soLuongSV = Integer.parseInt(scanner.nextLine());
            if (soLuongSV > 100) {
                System.err.println("Số lượng sinh viên nhỏ hơn 100!");
            }
        }
        while (soLuongSV > 100);
        Student[] arrStudent = new Student[soLuongSV];
        int choice;
        do {
            System.out.println("**********************MENU**********************");
            System.out.println("1. Nhập vào thông tin sinh viên");
            System.out.println("2. Tính điểm trung bình mỗi sinh viên");
            System.out.println("3. Hiển thị thông tin tất cả sinh viên");
            System.out.println("4. Sắp xếp sinh viên theo điểm trung bình giảm dần");
            System.out.println("5. Tìm kiếm sinh viên theo tên sinh viên (Tên sinh viên cần tìm nhập từ bàn phím)");
            System.out.println("6. Thoát");
            System.out.print("Lựa chọn của bạn: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    for (int i = 0; i < arrStudent.length; i++) {
                        System.out.print("Nhập thông tin sinh viên thứ " + (i + 1) + " : \n");
                        arrStudent[i] = new Student();
                        arrStudent[i].inputData(scanner);
                    }
                    break;
                case 2:
//                    for (Student student : arrStudent) {
//                        student.calAvgScore();
//                    }
                    for (int i = 0; i < arrStudent.length; i++) {
                        arrStudent[i].calAvgScore();
                    }
                    System.out.println("Đã tính điểm trung bình mỗi học sinh!");
                    break;
                case 3:
                    for (int i = 0; i < arrStudent.length; i++) {
                        System.out.print("Thông tin sinh viên thứ " + (i + 1) + " : \n");
                        arrStudent[i].displayData();
                    }
                    break;
                case 4:
                    // Sắp xếp sinh viên theo điểm trung bình giảm dần
                    // tạo mảng mới đưa các thuộc tính vào newArray riêng để sắp xếp
                    Student[] newArrSort = new Student[arrStudent.length];
                    for (int i = 0; i < newArrSort.length; i++) {
//                        Student student = new Student();
//                        student.setStudentId(arrStudent[i].getStudentId());
//                        student.setStudentName(arrStudent[i].getStudentName());
//                        student.setAge(arrStudent[i].getAge());
//                        student.setSex(arrStudent[i].getSex());
//                        student.setHtmlScore(arrStudent[i].getHtmlScore());
//                        student.setCssScore(arrStudent[i].getCssScore());
//                        student.setJavascriptScore(arrStudent[i].getJavascriptScore());
//                        student.setAvgScore(arrStudent[i].getAvgScore());
//
//                        newArrSort[i] = student;
                        newArrSort[i] = arrStudent[i];
                    }
                    // mặc định Arrays.sort theo thứ tự Ascending, thay đổi mặc định ta dùng compare để có thể thay đổi thành Descending
                    Arrays.sort(newArrSort, (a, b) -> Float.compare(b.getAvgScore(), a.getAvgScore()));
                    System.out.println("Thông tin và điểm trung bình mỗi sinh viên sau khi sắp xếp giảm dần: ");
                    for (int i = 0; i < newArrSort.length; i++) {
                        System.out.print("Thông tin sinh viên thứ " + (i + 1) + " : \n");
                        newArrSort[i].displayData();
                    }
                    break;
                case 5:
                    System.out.print("Nhập tên sinh viên muốn tìm kiếm: ");
                    String searchName = scanner.nextLine();
                    boolean isFound = false;
                    for (int i = 0; i < arrStudent.length; i++) {
                        if (searchName.equalsIgnoreCase(arrStudent[i].getStudentName())) {
                            isFound = true;
                            System.out.println("Tìm thấy sinh viên " + arrStudent[i].getStudentId() + " ở vị trí: " + i);
                            break;
                        }
                    }
                    if (!isFound) {
                        System.err.println("Không tìm thấy sinh viên " + searchName);
                    }
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.err.println("Vui lòng chọn xử lý từ 1 - 6");
            }
        }
        while (true);
    }
}
