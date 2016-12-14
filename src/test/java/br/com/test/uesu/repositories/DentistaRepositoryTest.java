package br.com.test.uesu.repositories;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import br.com.test.uesu.utils.AbstractTest;
import br.com.uesu.dentista.DentistaEntity;
import br.com.uesu.dentista.DentistaRepository;

public class DentistaRepositoryTest extends AbstractTest {

	private static final Logger LOGGER = Logger.getLogger(UserRepositoryTest.class);

	@Autowired
	private DentistaRepository dentistaRepository;

	@Test
	public void findAllTest() {
		List<DentistaEntity> dentistas = this.dentistaRepository.findAll();

		if (LOGGER.isInfoEnabled()) {
			LOGGER.info("Test FindAll(): " + dentistas);
		}
	}

}
