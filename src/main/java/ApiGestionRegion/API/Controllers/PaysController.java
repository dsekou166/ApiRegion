package ApiGestionRegion.API.Controllers;

import ApiGestionRegion.API.Modele.Message;
import ApiGestionRegion.API.Modele.Pays;
import ApiGestionRegion.API.Services.PaysService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@Api(value = "apiregion", description = "Une API de GESTION des REGIONS pour faciliter a l'agence de touristes")
@RequestMapping("/pays")

public class PaysController {

    @Autowired
    PaysService paysService;

    @ApiOperation(value = "Ajouter un pays")
    @PostMapping("/Creer")
    public Object creer(@RequestBody Pays pays){
        try{
            return paysService.creer(pays);
        }catch (Exception e){
            return Message.ErreurReponse(" le Pays "+pays.getNom()+" existe déjà", HttpStatus.OK,null);
        }

    }

    @ApiOperation(value = "La liste des pays")
    @GetMapping("/liste")
    public List<Pays> list(){

        return paysService.lire();
    }



    @ApiOperation(value = "Modifier un peu")
    @PutMapping("/modifier/{Id}")
    public Pays Modifier(@PathVariable Long Id,Pays pays) {
        return paysService.modifier( Id,pays);
    }

    @ApiOperation(value = "Supprimer un pays")
    @DeleteMapping("/Supprimer/{Id}")
    public String Supprimer(@PathVariable Long Id) {

        return paysService.supprimer(Id);
    }

}
