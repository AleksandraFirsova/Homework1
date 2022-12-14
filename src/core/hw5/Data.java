package core.hw5;

public class Data {

    private final static String VALID_CHARACTERS = "abcdefjhijklmnopqrstuvwxyzABCDEFJHIJKLMNOPQRSTUVWXYZ1234567890_";

    public static Boolean check(String login, String password, String confirmPassword) {
        try {
            checkData(login, password, confirmPassword);
            System.out.println("Данные валидны");
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    public static void checkData(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (!validateData(login)) {
            throw new WrongLoginException("Логин не валидный");
        }
        if (!validateData(password)) {
            throw new WrongPasswordException("Пароль не валидный");
        }
        if (!confirmPassword.equals(password)) {
            throw new WrongPasswordException("Пароль и подтверждение пароля не совпадают");
        }
    }

    private static Boolean validateData(String value) {
        if (value.length() < 1 || value.length() > 20) {
            return false;
        }
        for (int i = 0; i < value.length(); i++) {
            if (!VALID_CHARACTERS.contains(String.valueOf(value.charAt(i)))) {
                return false;
            }
        }
        return true;
    }
}
