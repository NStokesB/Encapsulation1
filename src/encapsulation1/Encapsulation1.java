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
public class Encapsulation1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HRDept HR = new HRDept();
        HR.hiredEmployee("Jake", "Jones", "265-49-359");

        System.out.println("The employee's status is: " + HR.getEmployeeStatus());
    }
    
}
