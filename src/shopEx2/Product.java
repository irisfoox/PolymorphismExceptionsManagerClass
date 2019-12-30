package shopEx2;

public class Product {
   private int serialnum;
   private String name;
   private double price;
   
   public static void noPrice(Object[] obj) {  //find product with no price
	   try {
	   for(int i=0; i<obj.length;i++) {
		   if(((Product)(obj[i])).getPrice()==0){
			   System.out.println("no price for product: "+((Product)(obj[i])).getName());
		   }
		   if(((Product)(obj[i])).getName().equals(null)){
			   System.out.println(String.format("the product on index %s is null",i));
		   }
		   }   
		   }catch(NullPointerException ex) {
			   System.out.println("Null exception: "+ex);
			   ex.printStackTrace();
		   }catch(Exception ex) {System.out.println("Exception "+ex);}
   }
   public static void lowest(Object[] obj) {  //find product with lowest price
	    	try {
	    	double low=((Product) obj[0]).getPrice();
	    	int k=0;
	    	for(int i=1;i<obj.length-1;i++) {
	    		if(low>((Product)(obj[i])).getPrice()) {low=((Product)(obj[i])).getPrice(); k=i;}
	    	}
	    	System.out.println("the lowest price belongs to: "+((Product)(obj[k])).toString());
	    } catch(NullPointerException ex) {
	    	System.out.println("null exception"+ex);
	    	ex.printStackTrace();
	    }
	    	catch(Exception ex) {System.out.println("Exception: "+ex);}
			
   }
   
   @Override
public String toString() {
	// TODO Auto-generated method stub
	return String.format("The product: %s %s %s",this.serialnum,this.name,this.price);
}
public Product() {
	   
   }
   public Product(int serialnum,String name) {
	  setSerialnum(serialnum);
	  setName(name);
	  setPrice(0);
   }
   
public Product(int serialnum, String name, double price) {//to check noPrice function
	
	this.serialnum = serialnum;
	this.name = name;
	this.price = price;
}
public int getSerialnum() {
	return serialnum;
}
public void setSerialnum(int serialnum) {
	this.serialnum = serialnum;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	if(price==0) {
	for(int k=0;k<100;k++) {
   	 price=(int) (Math.random()*100+20);
   	 if(price<50) { 
   	 this.price=price;
   	 k=100;
   	 }
	}
} else this.price=price;  
}

}

