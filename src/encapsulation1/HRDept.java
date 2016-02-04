/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulation1;

/**
 *
 * @author nstokesbeamon
 */
public class HRDept {
    private Employee employee;
    
    public void orientInfo(String FirstName, String LastName, String ssn) {
        Employee e = new Employee();
        e.getFirstName();
        e.getLastName();
        e.getSsn();
        e.doOrientation("B153");
        employee = e;
    }
    public String getEmployeeStatus() {
        return employee.getStatus();
    }
    
   
}
