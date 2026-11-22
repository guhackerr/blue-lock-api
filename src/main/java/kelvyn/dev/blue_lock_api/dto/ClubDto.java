package kelvyn.dev.blue_lock_api.dto;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import lombok.*;

@Getter 
@Setter 
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
@AllArgsConstructor
@Builder 
public class ClubDto {
    @EqualsAndHashCode.Include
    private Long id;
    
    private String name;
    private LocalDate foundationDate;

    private Integer stars;

    @Builder.Default
    private Set<PlayerDto> players = new HashSet<>();
}