import java.util.*;
public class SetMain{
    
     static Scanner sc=new Scanner(System.in);
    private static Set<SetOperation> set=new HashSet<>();
   // private static HashSet<SetOperation> newset=new TreeSet<>();
    
    
    public static void add(){
      
        System.out.println("Enter emp id: ");
        Integer id=sc.nextInt();
        
         System.out.println("Enter emp name: ");
        String name=sc.nextLine();
        sc.nextLine();
         System.out.println("Enter emp product: ");
        String product=sc.nextLine();
        
         System.out.println("Enter emp price: ");
        double price=sc.nextDouble();
        
        set.add(new SetOperation(id,name,product,price));
       // newset.addAll(set);
        System.out.println("Emp added");
    }
    
    public static void delete(){
      
        System.out.println("Enter emp id to delete: ");
        Integer del_id=sc.nextInt();
        
         for(SetOperation s:set){
             if(s.getId()==del_id){
                 set.remove(s);
                 System.out.println("Emp details is removed");
             }
             
         }
        //  for(SetOperation s1:newset){
        //      if(s1.getId()==del_id){
        //          //newset.remove(del_id);
        //          //System.out.println("Emp details is removed");
        //      }
             
        //  }
         System.out.println("Emp details not found ");
      
    }
    
    public static void displayUnsorted(){
        for(SetOperation s:set)
        {
            System.out.println(s.getId()+"    "+s.getName()+"    "+s.getProduct()+"    "+s.getPrice());
        }
    }
    
    //  public static void displaysorted(){
    //     for(SetOperation s1:newset)
    //     {
    //         System.out.println(s1.getId()+"    "+s1.getName()+"    "+s1.getProduct()+"    "+s1.getPrice());
    //     }
    // }
    
    
    
    
    
    
    public static void main (String[] args) {
     
     
     while(true){
         System.out.println("Enter your choice: ");
         System.out.println("1.Add");
         System.out.println("2.Remove");
         System.out.println("3.Display unsorted");
         System.out.println("4.Display sortedly");
         
         int choice=sc.nextInt();
         switch(choice)
         {
             case 1:add();
             break;
             
             case 2:delete();
             break;
             
             case 3:displayUnsorted();
             break;
             
            //  case 4:displaysorted();
            //  break;
                 
         }
     }
     
        
    }
}