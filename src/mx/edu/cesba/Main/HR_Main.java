/*
 Nombre: Luis Javier Navarrete Cruz
Matricula: 2022235
 */
package mx.edu.cesba.Main;

import javax.swing.JOptionPane;
import mx.edu.cesba.model.Employees;


public class HR_Main {
    
   public static void main(String[] args) {
        Employees e1 = new Employees();
        Employees e2 = new Employees(); 
        
        
        e1.setId (Integer.parseInt(JOptionPane.showInputDialog("Ingrese su ID")));
        e1.setFirstName (JOptionPane.showInputDialog("Ingrese su Nombre"));
        e1.setLastName(JOptionPane.showInputDialog("Ingrese el apellido"));
        e1.setAge(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad")));
        e1.setEmail(JOptionPane.showInputDialog("Ingrese su email"));
        e1.setPhoneNumber(Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero telefonico")));       
        e1.setSalary(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario")));
        e1.setHireDate(JOptionPane.showInputDialog("Ingrese la fecha de contratacion"));
                 
                
                
    /*            
      e1.id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su ID"));
      e1.firstName = JOptionPane.showInputDialog("Ingrese su Nombre");
      e1.lastName = JOptionPane.showInputDialog("Ingrese el apellido");
      e1.age = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad"));
      e1.email = JOptionPane.showInputDialog("Ingrese su email");
      e1.phoneNumber  = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero telefonico"));
      e1.salary = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario"));
      e1.hireDate = JOptionPane.showInputDialog("Ingrese la fecha de contratacion");
       
      /*
//        e2.id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su ID")); 
//        e2.firstName = JOptionPane.showInputDialog("Ingrese su Nombre");
//        e2.lastName = JOptionPane.showInputDialog("Ingrese el apellido");
//        e2.age = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad"));
//        e2.email = JOptionPane.showInputDialog("Ingrese su email");
//        e2.phoneNumber  = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero telefonico"));
//        e2.salary = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario"));
//        e2.hireDate = JOptionPane.showInputDialog("Ingrese la fecha de contratacion");
//        */
       e1.getDetails();
     System.out.println("*************");
//        //e2.getDetails();            
   }
}
    

