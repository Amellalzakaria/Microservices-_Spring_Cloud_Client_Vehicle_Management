package com.emsi.eurekavoiture.Repositories;




import com.emsi.eurekavoiture.Models.Voiture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VoitureRepository extends JpaRepository<Voiture, Long> {

}