package resourses;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class SpringConfiFile {

	@Bean
	public DriverManagerDataSource myDataSource() {

		DriverManagerDataSource dataSource = new DriverManagerDataSource();

		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/SpringCRUD");
		dataSource.setUsername("root");
		dataSource.setPassword("bhushan");

		return dataSource;

	}

	@Bean
	public JdbcTemplate jdbcTemp() {

		JdbcTemplate temp = new JdbcTemplate();
		temp.setDataSource(myDataSource());

		return temp;

	}

}
