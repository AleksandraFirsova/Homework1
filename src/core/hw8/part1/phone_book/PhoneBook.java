package core.hw8.part1.phone_book;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < 20; i++) {
            map.put(Utils.generatingRandomString(), Utils.getRandomPhone());
        }
        System.out.println(map.toString());
    }
}
