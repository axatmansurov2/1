package com.example.shop_1.entity;

import jakarta.persistence.Entity;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity(name = "histories")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class History extends BaseEntity {

    private UUID productId;

    private UUID userId;

    private LocalDateTime timeSold;

}
