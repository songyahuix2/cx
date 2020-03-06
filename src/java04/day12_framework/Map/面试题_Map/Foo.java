package java04.day12_framework.Map.面试题_Map;

import java.util.Objects;

/**
 * @author shkstart
 * @date 7/30/2019 - 4:56 PM
 */
public class Foo {
    private String code;
    private String name;

    public Foo(String code, String name) {
        this.code = code;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Foo foo = (Foo) o;
        return Objects.equals(code, foo.code) &&
                Objects.equals(name, foo.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(code, name);
    }
}
