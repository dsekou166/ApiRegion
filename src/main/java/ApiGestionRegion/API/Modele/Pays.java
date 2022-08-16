package ApiGestionRegion.API.Modele;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;

@Entity
@Table(name="pays")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Pays {

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long Id ;
    @Column(unique = true, length = 20)
    private String nom;
}
