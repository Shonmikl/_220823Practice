package org.example._2024_01_15;

import lombok.*;

/**
 * "CATEGORY": "FOOD#1",
 * "NAME": "Pasta#1",
 * "FACTORY": "Barilla#1",
 * "QUANTITY": 150,
 * "ISPACKED": true,
 * "ISADV": false,
 * "PRICE": 1.49,
 * "MARGIN": 15.0,
 * "ISDEBT": false},
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private int id;
    private Category category;
    private String name;
    private Factor factor;
    private int quantity;
    private boolean isPacked;
    private boolean isAdv;
    private float price;
    private double margin;
    private boolean isDebt;
}

enum Category {

}

enum Factor {

}