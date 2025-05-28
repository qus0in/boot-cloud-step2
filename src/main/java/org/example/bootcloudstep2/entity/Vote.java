package org.example.bootcloudstep2.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.ZonedDateTime;

@Entity
@Data
public class Vote {
    @Id
    private long id;
    private String name;
    private ZonedDateTime createdAt;
}
