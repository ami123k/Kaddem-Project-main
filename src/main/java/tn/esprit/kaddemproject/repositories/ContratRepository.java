package tn.esprit.kaddemproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import org.springframework.data.repository.query.Param;

import tn.esprit.kaddemproject.entities.Contrat;
import tn.esprit.kaddemproject.entities.Departement;
import tn.esprit.kaddemproject.entities.Specialite;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Stream;


public interface ContratRepository extends JpaRepository<Contrat,Integer> {

    @Query("SELECT count(c) " +
            "FROM Contrat c " +
            "where ((c.archive=true) " +
            "and  ((c.dateDebutContrat < :startDate AND :endDate > :startDate )) " +
            "     or(c.dateFinContrat BETWEEN :startDate AND :endDate))")
    public Integer getnbContratsValides(@Param("startDate") LocalDate startDate, @Param("endDate") LocalDate endDate);



    public int countByArchiveIsTrueAndEtudiantIdEtudiant(int idEtudiant);

    public int countByArchiveIsFalseAndDateDebutContratAfterAndDateFinContratBefore(LocalDate startDate, LocalDate endDate);

    public List<Contrat> findByArchiveIsFalseAndSpecialiteAndEtudiantDepartement(Specialite specialite, Departement departement);

    public List<Contrat> findByArchiveIsFalseAndEtudiantDepartement(Departement departement);

    public  List<Contrat> findByArchiveIsFalseAndDateFinContrat(LocalDate endDate);

    public  List<Contrat> findByArchiveIsFalse();


}