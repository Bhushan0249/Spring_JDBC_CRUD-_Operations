package main_class;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import beans.Student;
import mappers.StudentRowMappers;
import resourses.SpringConfiFile;

public class CRUD_Codeing {

	ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiFile.class);

	JdbcTemplate temp = context.getBean(JdbcTemplate.class);
	Scanner s = new Scanner(System.in);

	public  void insert() {

		System.out.println("Enter the id");
		int id = s.nextInt();
		System.out.println("Enter the Name");
		String name = s.next();
		System.out.println("Enter the gender");
		String gender = s.next();

		String query = "INSERT INTO student VALUES(?,?,?)";
		int n = temp.update(query, id, name, gender);

		if (n != 0) {
			System.out.println("Data inserted Successfully..");
		} else {
			System.out.println("Data NOT inserted.....");
		}

	}

	public void update() {

		System.out.println("Enter the Name");
		String name = s.next();
		;
		System.out.println("Enter the Gender");
		String gender = s.next();
		System.out.println("Enter the old ID");
		int id = s.nextInt();
		;

		String query = "UPDATE student SET name=?,gender=? WHERE id=?";
		int num = temp.update(query, name, gender, id);

		if (num != 0) {
			System.out.println("Data Updated Successfully");
		} else {
			System.out.println("Data NOT Inserted....");
		}

	}

	public void delete() {

		System.out.println("Enter the ID");
		int id = s.nextInt();

		String query = "DELETE FROM student WHERE id=?";
		int num = temp.update(query, id);
		if (num != 0) {
			System.out.println("Data Deleted Successfully");
		} else {
			System.out.println("Data NOT Deleted......");
		}

	}

	public void view1() {

		System.out.println("Enter the id ");
		int id = s.nextInt();

		String query = "SELECT * FROM student WHERE id=?";
		Student std = temp.queryForObject(query, new StudentRowMappers(), id);

		System.out.println("id: " + std.getId());
		System.out.println("name: " + std.getName());
		System.out.println("gender: " + std.getGender());

	}

	public void viewAll() {

		String query = "SELECT * FROM student";
		List<Student> list = temp.query(query, new StudentRowMappers());

		for (Student std : list) {

			System.out.println("id: " + std.getId());
			System.out.println("name: " + std.getName());
			System.out.println("gender: " + std.getGender());
			System.out.println("-----------------------");

		}

	}

	public void Exit() {

		System.out.println("THANK YOU FOR USING SPRING CRUD OPERATION.....");

	}

}
