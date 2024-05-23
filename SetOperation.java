import java.util.*;

public class SetOperation
{
    private Integer id;
    private String name;
    private String product;
    private double price;
    
    //CALLING CONSTRUCTOR
    public SetOperation(Integer id,String name,String product,double price){
        this.id=id;
        this.name=name;
        this.product=product;
        this.price=price;
    }
    
     
    
    //CALLING GETTER SETTER
    public Integer getId(){
        return id;
    }
    public void setId(Integer id){
        this.id=id;
    }
    
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    
    public String getProduct(){
        return product;
    }
    public void setProduct(String product){
        this.product=product;
    }
    
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price=price;
    }
    
    
}



