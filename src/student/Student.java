package student;

public class Student {

    public static void main(String[] args) {
        
    Student []list= new Student[5];
    
    Student one = new Student();
    
    one.setName("Aum");
    one.setAge(19);
   
    Student two = new Student();
    
    two.setName("Umang");
    two.setAge(24);
   
    Student three = new Student();
    
    three.setName("Jahnavi");
    three.setAge(22);
    
    list[0]=one;
    list[1]=two;
    list[2]=three;
      
    for(int i=0;i<list.length;i++ )
       {
           System.out.println(list[i].getName() + list[i].getAge());
       }

    }    
}
