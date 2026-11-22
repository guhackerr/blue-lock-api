package kelvyn.dev.blue_lock_api.database.model;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.*;

@Entity
@Getter 
@Setter 
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
@AllArgsConstructor
public class Club{
    @Id 
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @EqualsAndHashCode.Include
    private Long id;
    
    private String name;

    @Column(name = "foundation_date", updatable = false)
    private LocalDate foundationDate;

    private Integer overral;

    private Integer pontos;
    private Integer partidas;
    private Integer vitorias;
    private Integer empates;
    private Integer derrotas;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE, }, mappedBy = "team", fetch = FetchType.LAZY)
    private Set<Player> players = new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "campeonato_id")
    private Championship campeonato;
}
