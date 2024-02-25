import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class PhoneBook {
    private static HashMap<String, ArrayList<Integer>> phoneBook = new HashMap<>();
    public String add(String name, Integer phoneNum) {
        if (phoneBook.get(name) != null) {
            phoneBook.get(name).add(phoneNum);
        } else {
            List<Integer> ll = new ArrayList<>();
            ll.add(phoneNum);
            phoneBook.put(name, (ArrayList<Integer>) ll);
        }
        return phoneBook.toString();
    }
    public void PrintMap(){
        System.out.println(phoneBook);
    }
}
