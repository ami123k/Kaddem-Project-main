package tn.esprit.kaddemproject.services;



import tn.esprit.kaddemproject.entities.Departement;
import tn.esprit.kaddemproject.entities.Specialite;
import tn.esprit.kaddemproject.entities.Universite;
import tn.esprit.kaddemproject.generic.IGenericService;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

public interface IUniversiteService extends IGenericService<Universite,Integer> {

    public void assignUniversiteToDepartement(Integer idUniversite, Integer idDepartement);

    public List<Departement> retrieveDepartementsByUniversite(Integer idUniversite);


    public Map<Specialite,Float> getMontantContartEntreDeuxDate(int idUniv, LocalDate startDate, LocalDate endDate);




}
