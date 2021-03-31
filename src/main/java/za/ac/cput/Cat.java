/* author : Mogamad Nabeel Meyers
Student Number: 218328702
detail: contains info on class Cat
 */

package za.ac.cput;

import java.util.Objects;

public class Cat {

    private String color;
    private int age;

    public Cat(String color, int age){
        this.setColor(color);
        this.setAge(age);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age && Objects.equals(color, cat.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, age);
    }
}

