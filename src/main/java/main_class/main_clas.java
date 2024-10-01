package main_class;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import beans.Student;
import mappers.StudentRowMappers;
import resourses.SpringConfiFile;

public class main_clas {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiFile.class);

		JdbcTemplate temp = context.getBean(JdbcTemplate.class);

		// -------------------INSERT OPERATION-----------------

//		int id = 3;
//		String name = "rahul";
//		String gender = "male";
//		String query = "insert into student values (?,?,?)";
//		int num = temp.update(query, id, name, gender);
//
//		if (num != 0) {
//			System.out.println("Data Inseted Successfully.....");
//		} else {
//			System.out.println("Data NOT Inserted......");
//		}

		// -------------------UPDATE OPERATION-----------------

//		String name = "BHUSHAN";
//		String gender="male";
//		int id = 1;
//
//		String query = "update student set name=?,gender=? where id=?";
//		int num = temp.update(query, name,gender, id);
//
//		if (num != 0) {
//			System.out.println("Data Updated Successfully");
//		} else {
//			System.out.println("Data NOT Inserted....");
//		}

//----------------DELETE OPERATION---------------
//		int id = 3;
//
//		String query = "delete from student where id=?";
//		int num = temp.update(query, id);
//		if (num != 0) {
//			System.out.println("Data Deleted Successfully");
//		} else {
//			System.out.println("Data NOT Deleted......");
//		}

//// ---------------SELECT OPERATION--------------
//
//		String query = "select * from student";
//		List<Student> list = temp.query(query, new StudentRowMappers());
//
//		for (Student std : list) {
//
//			System.out.println("id: " + std.getId());
//			System.out.println("name: " + std.getName());
//			System.out.println("gender: " + std.getGender());
//			System.out.println("-----------------------");
//
//		}
// ---------------SELECT OPERATION2--------------
//		
//		String query = "select * from student where id=?";
//		int id=1;
//		List<Student> list = temp.query(query, new StudentRowMappers(),id);
//		
//		for (Student std : list) {
//			
//			System.out.println("id: " + std.getId());
//			System.out.println("name: " + std.getName());
//			System.out.println("gender: " + std.getGender());
//			System.out.println("-----------------------");
//			
//		}

//		// ---------------SELECT OPERATION3--------------

//		int id = 1;
//		String query = "select * from student where id=?";
//		Student std = temp.queryForObject(query, new StudentRowMappers(), id);
//
//		System.out.println("id: " + std.getId());
//		System.out.println("name: " + std.getName());
//		System.out.println("gender: " + std.getGender());

	}
}
