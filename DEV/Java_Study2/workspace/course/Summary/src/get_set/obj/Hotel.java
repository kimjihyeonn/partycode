package get_set.obj;



public class Hotel {

	private Chef chef;
	private Employee emp;
	
	
  public Hotel() {
	//this.chef =  new Chef();
	this.emp = new Employee();
  }
  
  //chef-getter,setter
  
  public void setChef(Chef chef) {
	  this.chef = chef;
	  
  }
  
  public Chef getChef() {
	  return chef;
  }
public void setEmp(Employee emp) {
	this.emp = emp;
}

public Employee getEmp() {
	return emp;
}
}
