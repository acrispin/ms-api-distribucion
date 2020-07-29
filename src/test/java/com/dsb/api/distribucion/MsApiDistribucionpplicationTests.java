package com.dsb.api.distribucion;

import com.dsb.api.commons.db.dao.util.DaoTest;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 *
 * @author acrispin
 * @since 25/07/2020
 */
@SpringBootTest
@Log4j2
class MsApiDistribucionpplicationTests {

	@Test
	void contextLoads() {
		DaoTest.checkDatabase("");
	}

}
