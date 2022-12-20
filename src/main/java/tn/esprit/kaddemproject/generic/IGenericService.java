package tn.esprit.kaddemproject.generic;

import java.util.List;



public interface IGenericService<T,ID> {


	public T add(T entity);
	
	public T update(T entity);
	
	public T retrieveById(ID id);
	
	public List<T> retrieveAll();
	
	public Boolean delete(ID id);
	
}
