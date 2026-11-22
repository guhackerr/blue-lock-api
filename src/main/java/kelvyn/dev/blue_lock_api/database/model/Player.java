
package kelvyn.dev.blue_lock_api.database.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import kelvyn.dev.blue_lock_api.database.enums.PlayerPosition;
import lombok.*;

@Entity
@Getter 
@Setter 
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @EqualsAndHashCode.Include
    private Long id;

    
    @Column(length = 200)
    private String name;
    private String nationality;
    private Integer age;
    private BigDecimal height;
    
    @Enumerated(EnumType.STRING)
    private PlayerPosition playerPosition;


    private Integer overall;
    private Integer shoot;
    private Integer acceleration;
    private Integer velocity;
    private Integer agility;
    private Integer defence;
    private Integer pass;
    private Integer dribble;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "team_id")
    private Club team;

    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn( name = "championship_id")
    private Championship championship;
}