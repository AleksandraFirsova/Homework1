package core.hw7.multiplication_table;

import java.util.Objects;

public class Example {
    private int a;
    private int b;

    public Example(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return a + " * " +  b + " = ?";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Example example = (Example) o;
        return a == example.a && b == example.b;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }
}
