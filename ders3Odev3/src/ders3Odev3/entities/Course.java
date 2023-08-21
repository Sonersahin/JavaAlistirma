package ders3Odev3.entities;

public class Course {
    private int id;
    private String name;
    private CourseCategory categoryName;
    private double price;

    public Course(int id, String name, CourseCategory categoryName, double price) {
        this.id = id;
        this.name = name;
        this.categoryName = categoryName;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CourseCategory getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(CourseCategory categoryName) {
        this.categoryName = categoryName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
