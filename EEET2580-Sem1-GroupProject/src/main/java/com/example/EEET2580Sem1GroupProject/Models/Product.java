package com.example.EEET2580Sem1GroupProject.Models;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long itemID;

    @Column(length = 40, nullable = false)
    private String name;

    @Column
    private String description;

    @Column(columnDefinition="TEXT")
    private String background;

    @Column(nullable = false)
    private double price;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "product")
    public Set<Image> images;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Seller seller;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "product")
    public Set<OrderDetail> orderDetails;



    public Long getItemID() {
        return itemID;
    }

    public void setItemID(Long itemID) {
        this.itemID = itemID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Set<Image> getImages() {
        return images;
    }

    public void setImages(Set<Image> images) {
        this.images = images;
    }
}
