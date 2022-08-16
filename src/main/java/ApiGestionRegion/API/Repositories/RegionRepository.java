package ApiGestionRegion.API.Repositories;

import ApiGestionRegion.API.Modele.Pays;
import ApiGestionRegion.API.Modele.Population;
import ApiGestionRegion.API.Modele.Region;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RegionRepository extends JpaRepository<Region, Long> {
   // void save(Population population);
   // void save(Pays pays);
    @Query(value="SELECT nom, code_region, activite,superficie,langue,chiffre,annee from region,population where region.population_id=population.id",nativeQuery=true)
    List<Object[]> getRegionsP();


}
