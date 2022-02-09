import java.util.Scanner;

public class FindingValue {
    public static void main(String[] args) {
        String[] students = {"Duong", "Dat", "Khanh", "Giang", "Tuan"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten sinh vien vao day:");
        String input_name = scanner.nextLine();
        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(input_name)) {
                System.out.println("Position of the student " + input_name + " is: " + i + " in the list.DDU");
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println("Not found " + input_name + " in the list.");
        }
    }
}
