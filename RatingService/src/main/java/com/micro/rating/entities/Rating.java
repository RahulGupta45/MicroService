package com.micro.rating.entities;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.lang.annotation.Documented;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name="rating")
public class Rating {

    @Id
    private String ratingId;
    private String userId;
    private String hotelId;
    private  int rating;
    private String feedback;

}