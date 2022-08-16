package ApiGestionRegion.API.Modele;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name="population")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Population {

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long Id ;
    private int chiffre;
    private int annee;
    private String langue;

    @ManyToOne
    private Region region;
        }
