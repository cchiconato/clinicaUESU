package br.com.uesu.agenda;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.uesu.utils.GenericService;


@RestController
@RequestMapping(path = "/api/agenda")
public class AgendaService extends GenericService<AgendaEntity, Long> {
	
	@Autowired
	protected AgendaRepository agendaRepository;
	
	@RequestMapping(path= "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<AgendaEntity> delete(@PathVariable Long id) {
		
		AgendaEntity agendaEncontrada = agendaRepository.findById(id);
		
		agendaRepository.delete(agendaEncontrada);
		return new ResponseEntity<>(HttpStatus.OK);
	}	
	
	@RequestMapping(path= "/{id}", method = RequestMethod.GET)
	public AgendaEntity findById(@PathVariable Long id){
		
		AgendaEntity agendaEncontrado = agendaRepository.findById(id);
		
		return agendaEncontrado;
	}
	
}
