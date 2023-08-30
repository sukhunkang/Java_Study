package practice;

public class OracleDao implements DataAccessObject {
	
	@Override
	public void select() {
		System.out.println("Select on Oracle DB");
	} // select
	
	@Override
	public void insert() {
		System.out.println("Insert on Oracle DB");
	} // insert
	
	@Override
	public void update() {
		System.out.println("Update on Oracle DB");
	} // update
	
	@Override
	public void delete() {
		System.out.println("Delete on Oracle DB");
	} // delete
	
} // end class
