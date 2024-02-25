import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class CreatePhoneBook {
    private static PhoneBook phoneBook = new PhoneBook();
    public static void CreatePhoneBook() {
        try {
            File file = new File("PhoneBook.txt");
            if (file.createNewFile()) {
                System.out.println("Файл создан");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void fileWriter(String name, Integer phoneNum) throws IOException {
        FileWriter writer = new FileWriter("PhoneBook.txt", true);
        writer.write(phoneBook.add(name,phoneNum));
        writer.write("\n");
        writer.close();
    }
}

