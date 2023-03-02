package com.example.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "book")

public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String name;
    private Double price;
    private Integer numPages;
    private Boolean available;
}