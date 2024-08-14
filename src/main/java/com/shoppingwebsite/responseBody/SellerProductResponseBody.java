package com.shoppingwebsite.responseBody;

import jakarta.persistence.Column;
import lombok.*;

import java.util.UUID;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ProductResponseBody {
    private UUID id;
    private String productName;
    private int price;
    private String category;
}
