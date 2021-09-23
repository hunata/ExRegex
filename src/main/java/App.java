import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) {

// Bài 1: Tìm tất cả các chuỗi ngày tháng có định dạng dd-mm-yyyy hoặc dd/mm/yyyy trong chuỗi văn bản text1

        String input = "Hello java regex 2-12-2018, hello world 12/12/2018";
        String regex = ("\\d{1,2}[-|/]\\d{1,2}[-|/]\\d{4}");
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(input);
        boolean matchFound = m.find();
        while (matchFound) {
            String date = input.substring(m.start(), m.end());
            System.out.println(date);
            matchFound = m.find();
        }

// Bài 2: Tìm tất cả các địa chỉ email có trong chuỗi văn bản đầu vào text

        String input = "hunata@gmaim.com, gmail,  huana.gmail.com, 1212h@gmail.com";
        String regex = ("[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+");
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(input);
        boolean matchFound = m.find();
        while (matchFound) {
            String email = input.substring(m.start(), m.end());
            System.out.println(email);
            matchFound = m.find();
        }

//        String regex ="(0|\\+84)\\d{2}[\\.\\-\\s]?\\d{3}[\\.\\-\\s]?\\d{4}";
//        String input ="0934170687, +84934170687, 093.417.0687, 093 417 0687, 093-417-0687";
//        Pattern p = Pattern.compile(regex);
//        Matcher m = p.matcher(input);
//
//        boolean matcherFound = m.find();
//        while (matcherFound){
//            String phone = input.substring(m.start(),m.end());
//            System.out.println(phone);
//            matcherFound = m.find();
//        }

    }
}

