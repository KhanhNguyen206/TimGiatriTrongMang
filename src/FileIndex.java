import java.util.Objects;
import java.util.Scanner;

public class FileIndex {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna",
                "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};

        Scanner scanner=  new Scanner(System.in);

        System.out.println("Nhập vào đây tên sinh viên muốn tra cứu: ");
        String student=scanner.nextLine();

        boolean check=false;

        for (int i=0; i<students.length; i++){
            if (students[i].equals(student)){
                System.out.println("Sinh viên "+student+ " có trong danh sách, đứng ở vị trí thứ "+i);
                check=true;
                break;
            }
        }

        if(check==false) System.out.println("Không có sinh viên này trong danh sách");
    }
}
