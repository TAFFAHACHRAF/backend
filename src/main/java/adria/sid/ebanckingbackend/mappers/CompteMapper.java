package adria.sid.ebanckingbackend.mappers;

import adria.sid.ebanckingbackend.dtos.compte.CompteReqDTO;
import adria.sid.ebanckingbackend.dtos.compte.CompteResDTO;
import adria.sid.ebanckingbackend.entities.Compte;

import java.util.List;

public interface CompteMapper {
    public CompteReqDTO fromCompteToCompteReqDTO(Compte compte);
    public CompteResDTO fromCompteToCompteResDTO(Compte compte);
    public Compte fromCompteDTOToCompte(CompteReqDTO compteDTO);
    public List<CompteResDTO> toComptesResDTOs(List<Compte> comptes);
}
