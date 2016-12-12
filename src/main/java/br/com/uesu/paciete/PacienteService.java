package br.com.uesu.paciete;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.uesu.dentista.DentistaEntity;
import br.com.uesu.utils.GenericService;

@RestController
@RequestMapping(path = "/api/paciente")
public class PacienteService extends GenericService<PacienteEntity, Long> {

	@Autowired
	protected PacineteRepository pacineteRepository;
	
	
	@RequestMapping(path= "/{id}", method = RequestMethod.DELETE)
	@CacheEvict(value= "listaPacientes", allEntries=true)
	public ResponseEntity<PacienteEntity> delete(@PathVariable Long id) {
		
		PacienteEntity usuarioEncontrado = pacineteRepository.findById(id);
		
		pacineteRepository.delete(usuarioEncontrado);
		return new ResponseEntity<>(HttpStatus.OK);
	}	
	
	@RequestMapping(path= "/{id}", method = RequestMethod.GET)
	public PacienteEntity findById(@PathVariable Long id){
		PacienteEntity usuarioEncontrado = pacineteRepository.findById(id);
		
		return usuarioEncontrado;
	}
	
	@Override
	@Cacheable(value= "listaPacientes")
	public List<PacienteEntity> findAll() {	
		return super.findAll();
	}
	
	@Override
	@RequestMapping(method = RequestMethod.POST)
	@CacheEvict(value= "listaPacientes", allEntries=true)
	public PacienteEntity insert(@RequestBody PacienteEntity entityObject) {
		return super.insert(entityObject);
	}
	
	@Override
	@RequestMapping(method = RequestMethod.PUT)
	@CacheEvict(value= "listaPacientes", allEntries=true)
	public void update(@RequestBody PacienteEntity entityObject) {
	
		super.update(entityObject);
	}
}
