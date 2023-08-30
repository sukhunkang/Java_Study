package practice;

public class MySqlDao implements DataAccessObject {
	
	public void select() {
		System.out.println("Select on MySql DB");
	} // select
	
	public void insert() {
		System.out.println("Insert on MySql DB");
	} // insert
	
	public void update() {
		System.out.println("Update on MySql DB");
	} // update
	
	public void delete() {
		System.out.println("Delete on MySql DB");
	} // delete
	
} // end class
