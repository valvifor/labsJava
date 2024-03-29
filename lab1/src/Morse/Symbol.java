package Morse;

import java.util.Objects;

public class Symbol implements Comparable{
    private final char c;
    private int count;

    public Symbol(char c) {
        this.c = c;
        count = 1;
    }

    @Override
    public String toString() {
        return (c + " - " + count);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if ((getClass() != o.getClass())) {
            return false;
        }
        Symbol second = (Symbol) o;
        if (c == second.c) {
            second.count++;
        }
        return (c == second.c);
    }

    @Override
    public int hashCode() {
        return Objects.hash(c);
    }

    @Override
    public int compareTo(Object o) { //сравнивает вызывающий объект с объектом, переданным в качестве параметра, и возвращает в результате выполнения сравнения целое число
        if (o == this) {
            return 0;
        }
        Symbol second = (Symbol) o;
        return Integer.compare(count, second.count);
    }
}
