package Java_Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {
        List<String> email = Arrays.asList("oleg@gmail.ru","fake@mail.ru","ogo@mail.ru","kot@rambler.ru","fake@mail.ru");

        List<String> unig = email.stream().distinct().collect(Collectors.toList());
        System.out.println(unig);
        List<String> gmail = email.stream().filter(x->x.endsWith("@mail.ru")).collect(Collectors.toList());
        System.out.println(gmail);


    }
}
