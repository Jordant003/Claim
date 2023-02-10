package com.cdp.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="cars")
public class Cars {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "make")
    private String make;
    @Column(name = "model")
    private String model;
    @Column(name = "year")
    private String year;
    @Column(name = "mileage")
    private Integer mileage;
    @Column(name = "price")
    private Double price;
    @Column(name = "description")
    private String description;
    @Column(name = "image")
    private String image;
    @Column(name = "newOrUsed")
    private String newOrUsed;
    @Column(name = "dateCreated")
    LocalDateTime dateCreated = LocalDateTime.now();
    

    
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Cars() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public Integer getMileage() {
        return mileage;
    }

    public void setMileage(Integer mileage) {
        this.mileage = mileage;
    }

    public Double getPrice() {

        if(LocalDateTime.now().isAfter(dateCreated.plusDays(120))) {
            return this.price * .90;
    }

    return this.price;

}

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Cars [id=" + id + ", make=" + make + ", model=" + model + ", year=" + year + ", mileage=" + mileage
                + ", price=" + price + ", description=" + description + ", image=" + image + ", newOrUsed=" + newOrUsed
                + ", dateCreated=" + dateCreated + "]";
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNewOrUsed() {
        return newOrUsed;
    }

    public void setNewOrUsed(String newOrUsed) {
        this.newOrUsed = newOrUsed;
    }

    public LocalDateTime getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDateTime dateCreated) {
        this.dateCreated = dateCreated;
    }
   
    
}
