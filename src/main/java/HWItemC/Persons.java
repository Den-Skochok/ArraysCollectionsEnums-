package HWItemC;

import java.util.ArrayList;

public class Persons {
    private int age;
    private String NameValue;
    private int secondNameValue;

    ArrayList<Accounts> accountsArrayList = new ArrayList<Accounts>();

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNameValue() {
        return NameValue;
    }

    public void setNameValue(String nameValue) {
        NameValue = nameValue;
    }

    public int getSecondNameValue() {
        return secondNameValue;
    }

    public void setSecondNameValue(int secondNameValue) {
        this.secondNameValue = secondNameValue;
    }

    public Persons(int age, String NameValue) {
        this.age = age;
        this.NameValue = NameValue;
    }

    @Override
    public String toString() {
        return "Persons{" +
                "age=" + age +
                ", firstNameValue='" + NameValue + '\'' +
                ", secondNameValue='" + secondNameValue + '\'' +
                '}';
    }
}
