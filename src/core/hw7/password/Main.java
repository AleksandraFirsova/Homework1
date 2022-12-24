package core.hw7.password;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Password> passwords = new HashSet<>();
        passwords.add(new Password("1234", "First name", "Middle name", "Last name", "2022-12-24"));
        passwords.add(new Password("1234", "First name", "Middle name", "Last name", "2022-12-24"));

        PassportList passportList = new PassportList(passwords);
        System.out.println(passportList);
    }
}
