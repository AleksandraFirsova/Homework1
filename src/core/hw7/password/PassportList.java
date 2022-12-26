package core.hw7.password;

import java.util.Set;

public class PassportList {
    private Set<Password> setList;

    public PassportList(Set<Password> setList) {
        this.setList = setList;
    }

    public void addPassword(Password password) {
        Password old = getPassword(password.getNumber());
        if (old != null) {
            setList.remove(old);
            setList.add(password);
        }
    }

    public Password getPassword(String number) {
        for (Password password : setList) {
            if (password.getNumber().equals(number)) {
                return password;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "PassportList{" +
                "setList=" + setList +
                '}';
    }
}

