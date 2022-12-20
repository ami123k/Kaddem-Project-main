package tn.esprit.kaddemproject.services;

import tn.esprit.kaddemproject.entities.Contrat;
import tn.esprit.kaddemproject.entities.Departement;
import tn.esprit.kaddemproject.generic.IGenericService;

import java.time.LocalDate;
import java.util.Date;

public interface IContratService extends IGenericService<Contrat,Integer> {

    public Contrat affectContratToEtudiant (Integer idContrat, String nomE, String prenomE);
    public Integer nbContratsValides(LocalDate startDate, LocalDate endDate);
    public void retrieveAndUpdateStatusContrat();
    public void archiveExpiredContracts();

}

