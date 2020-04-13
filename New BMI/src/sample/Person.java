package sample;

public class Person {

    double height, weight;
    String category;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (checkValidHeight(height) == true) {
            this.height = height;
        } else {
            this.height = -1;
        }
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (checkValidWeight(weight) == true) {
            this.weight = weight;
        } else {
            this.weight = -1;
        }
    }

        public boolean checkValidWeight(double weight) {
            if (weight < 0 || weight > 150) {
                return false;
            } else {
                return true;
            }
        }

        public boolean checkValidHeight(double height) {
            if (height < 0 || height > 5) {
                return false;
            } else {
                return true;
            }
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

        }}

