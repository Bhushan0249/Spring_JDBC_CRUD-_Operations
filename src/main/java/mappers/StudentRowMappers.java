package mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import beans.Student;

public class StudentRowMappers implements RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {

		Student std = new Student();
		std.setId(rs.getInt("id"));
		std.setName(rs.getString("name"));
		std.setGender(rs.getString("gender"));

		return std;
	}

}
