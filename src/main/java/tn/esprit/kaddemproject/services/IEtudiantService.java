package tn.esprit.kaddemproject.services;

import tn.esprit.kaddemproject.entities.Departement;
import tn.esprit.kaddemproject.entities.Etudiant;
import tn.esprit.kaddemproject.generic.IGenericService;

import java.util.List;

public interface IEtudiantService extends IGenericService<Etudiant,Integer>  {

    public void assignEtudiantToDepartement (Integer etudiantId, Integer departementId);

    public Etudiant addAndAssignEtudiantToEquipeAndContract(Etudiant e, Integer idContrat, Integer idEquipe);

    public 	List<Etudiant> getEtudiantsByDepartement (Integer idDepartement);
}
