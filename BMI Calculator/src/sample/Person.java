package sample;

public class Person {

    double height, weight;
    String category;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String calculateCategory(double weight, double height) {
        double result = (weight / height) * height;
        if (result <= 18.5) {
            category = "Underweight";
        }
        if (result > 18.5 && result <= 24.9) {
            category = "Healthy";
        }
        if (result > 25.0 && result <= 29.9) {
            category = "Overweight";
        }
        if (result > 29.9) {
            category = "Obese";
        }
        return category;

    }
}
