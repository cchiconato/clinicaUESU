package br.com.uesu.dentista;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.uesu.utils.GenericService;

@RestController
@RequestMapping(path = "/api/dentista")
public class DentistaService extends GenericService<DentistaEntity, Long>{
	

	@Autowired
	protected DentistaRepository dentistaRepository;
	
	@RequestMapping(path= "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<DentistaEntity> delete(@PathVariable Long id) {
		
		DentistaEntity dentistaEncontrado = dentistaRepository.findById(id);
		
		dentistaRepository.delete(dentistaEncontrado);
		return new ResponseEntity<>(HttpStatus.OK);
	}	
	
	@RequestMapping(path= "/{id}", method = RequestMethod.GET)
	public DentistaEntity findById(@PathVariable Long id){
		
		DentistaEntity dentistaEncontrado = dentistaRepository.findById(id);
		
		return dentistaEncontrado;
	}
	
}
