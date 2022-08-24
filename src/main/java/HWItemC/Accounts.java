package HWItemC;

public class Accounts {
    private int idValue;
    private String firstNameValue;
    private String secondNameValue;

    public int getIdValue() {
        return idValue;
    }

    public void setIdValue(int idValue) {
        this.idValue = idValue;
    }

    public String getFirstNameValue() {
        return firstNameValue;
    }

    public void setFirstNameValue(String firstNameValue) {
        this.firstNameValue = firstNameValue;
    }

    public String getSecondNameValue() {
        return secondNameValue;
    }

    public void setSecondNameValue(String secondNameValue) {
        this.secondNameValue = secondNameValue;
    }

    public Accounts(int idValue, String firstNameValue) {
        this.idValue = idValue;
        this.firstNameValue = firstNameValue;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + idValue + '\'' +
                ", id='" + firstNameValue + '\'' +
                ", id='" + secondNameValue + '\'' +
                '}';
    }
}
