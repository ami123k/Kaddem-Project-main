package tn.esprit.kaddemproject.generic;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


public class GenericController<T,ID> {


	@Autowired
	IGenericService<T,ID> genericService;

	//http://localhost:9090/stock/add
	@PostMapping()
	public T add(@RequestBody T entity) {
		return genericService.add(entity);
	}

	//http://localhost:9090/stock/add
	@PutMapping()
	public T update(@RequestBody T entity) {
		return	genericService.update(entity);
	}

	//http://localhost:9090/stock/ahmed
	@GetMapping("/{id}")
	public T retrieveById(@PathVariable ID id ) {
		return	genericService.retrieveById(id);
	}

	//http://localhost:9090/stock/add/ahmed
	@GetMapping("/getall")
	public List<T> retrieveAll() {
		return	genericService.retrieveAll();
	}

	//http://localhost:9090/stock/add/ahmed
	@DeleteMapping("/{id}")
	public Boolean delete(@PathVariable ID id) {
		return	genericService.delete(id);
	}
}
