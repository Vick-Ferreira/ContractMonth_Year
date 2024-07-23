package entities;



public class Department {
     private String name;
     
     //contrutor vazio
     public Department() {
    	 
     }
     //contrutor com argumentos
     public Department(String name) {
    	 this.name = name;
    	 
     }
     
     //geter e seters
     public String getName() {
    	 return name;
     }
     public void setName(String name) {
    	 this.name = name;
    	 
     }
     

}
