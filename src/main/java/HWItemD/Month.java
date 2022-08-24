package HWItemD;

public enum Month {



    march(31, Seasons.sprint), april(30, Seasons.sprint), may(31, Seasons.sprint),
    june(30, Seasons.summer), july(31, Seasons.summer), august(31, Seasons.summer),
    september(30, Seasons.autumn), october(31, Seasons.autumn), november(30, Seasons.autumn),
    december(31, Seasons.winter), january(31, Seasons.winter), february(28, Seasons.winter);

    public int getDaysValue() {
        return daysValue;
    }

    public void setDaysValue(int daysValue) {
        this.daysValue = daysValue;
    }

    public Seasons getSeasonsValue() {
        return seasonsValue;
    }

    public void setSeasonsValue(Seasons seasonsValue) {
        this.seasonsValue = seasonsValue;
    }

    public int daysValue;
    public Seasons seasonsValue;

    Month(int daysValue, Seasons seasonsValue){
        this.daysValue = daysValue;
        this.seasonsValue = seasonsValue;
    }

    @Override
    public String toString() {
        return "Month{" +
                "daysValue=" + daysValue +
                ", seasons=" + seasonsValue +
                '}';
    }
}
