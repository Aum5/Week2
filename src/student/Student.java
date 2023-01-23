package student;


public class Student {

    public static void main(String[] args) {
        
    Studentlist[] list= new Studentlist[3];
    
    Studentlist one = new Studentlist();
    
    one.setName("Aum");
    one.setAge(19);
   
    
    Studentlist two = new Studentlist();
    
    two.setName("Umang");
    two.setAge(24);
   
    Studentlist three = new Studentlist();
    
    three.setName("Jahnavi");
    three.setAge(22);
    
    list[0]=one;
    list[1]=two;
    list[2]=three;
      
        for(int i = 0 ; i < list.length ; i++)
        {
            System.out.println(list[i].getName() +list[i].getAge());
            System.out.println("Changes made in github");//pull
            System.out.println("fetch");// fetch
            
        }
    }    
}
