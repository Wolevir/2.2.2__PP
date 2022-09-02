package web.model;

public class Car {
    private String model;
    private String color;
    private int year_of_issue;

    public Car(String model, String color, int year_of_issue) {
        this.model = model;
        this.color = color;
        this.year_of_issue = year_of_issue;
    }



    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear_of_issue() {
        return year_of_issue;
    }

    public void setYear_of_issue(int year_of_issue) {
        this.year_of_issue = year_of_issue;
    }

    @Override
    public String toString() {
        return "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year_of_issue=" + year_of_issue + "\n";
    }
}
