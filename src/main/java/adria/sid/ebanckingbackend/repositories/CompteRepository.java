package adria.sid.ebanckingbackend.repositories;

import adria.sid.ebanckingbackend.entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CompteRepository extends JpaRepository<Compte,String> {
    @Query("SELECT c FROM Compte c WHERE c.id = :compteId")
    Compte getCompteById(@Param("compteId") String compteId);
}