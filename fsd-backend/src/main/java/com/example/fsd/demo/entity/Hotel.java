package com.example.fsd.demo.entity;


import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;

@Entity
@Table(name="hotels")
public class Hotel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="name",nullable = false)
    private String name;

    @Column(name = "room_price")
    private double roomPrice;

    @Column(name="image_url",unique = true)
    private String imageUrl;

    @Column(name="description")
    private String description;

    @Column(name="rating")
    private double rating;

    @Column(name="city")
    private String city;

    @Column(name="email")
    private String email;

    @Column(name="isWifi")
    private boolean isWifi;

    @Column(name="isGym")
    private boolean isGym;

    @Column(name="isPool")
    private boolean isPool;

    @CreationTimestamp
    @Column(name="created_timestamp")
    private LocalDate createdLocalDate;

    @UpdateTimestamp
    @Column(name="updated_timestamp")
    private LocalDate updateLocalDate;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRoomPrice() {
        return roomPrice;
    }

    public void setRoomPrice(double roomPrice) {
        this.roomPrice = roomPrice;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isWifi() {
        return isWifi;
    }

    public void setWifi(boolean wifi) {
        isWifi = wifi;
    }

    public boolean isGym() {
        return isGym;
    }

    public void setGym(boolean gym) {
        isGym = gym;
    }

    public boolean isPool() {
        return isPool;
    }

    public void setPool(boolean pool) {
        isPool = pool;
    }

    public LocalDate getCreatedLocalDate() {
        return createdLocalDate;
    }

    public void setCreatedLocalDate(LocalDate createdLocalDate) {
        this.createdLocalDate = createdLocalDate;
    }

    public LocalDate getUpdateLocalDate() {
        return updateLocalDate;
    }

    public void setUpdateLocalDate(LocalDate updateLocalDate) {
        this.updateLocalDate = updateLocalDate;
    }


    @Override
    public String toString() {
        return "Hotel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", roomPrice=" + roomPrice +
                ", imageUrl='" + imageUrl + '\'' +
                ", description='" + description + '\'' +
                ", rating=" + rating +
                ", city='" + city + '\'' +
                ", email='" + email + '\'' +
                ", isWifi=" + isWifi +
                ", isGym=" + isGym +
                ", isPool=" + isPool +
                ", createdLocalDate=" + createdLocalDate +
                ", updateLocalDate=" + updateLocalDate +
                '}';
    }
}
