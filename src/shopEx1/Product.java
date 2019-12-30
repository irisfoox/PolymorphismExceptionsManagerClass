package shopEx1;

//ייש לייצר 5 מוצרים לתת שם מחיר רנדומלי בין 20-50 ומס סידורי 
     //יש ליצור מוצר אחד שהוא ללא שום נתון
     //  יש לשמור כל המוצרים במבנה נתונים מתאים מסוג כללי
     //יש להדפיס שם של מוצר עם מחיר הכי נמוך
     //יש לבדוק אם קיימים מוצרים ללא מחיר
     //יש לעדכן לכל מוצר מחיר חדש בהנחה של 15 אחוז
     //יש להדפיס מחיר כולל של כל המוצרים
public class Product {
     public int serialnum;
     public String name;
     public double price=0;
     public Product() {
    	 
     }
     
     public Product(int serialnum, String name, double price) {//checking price 0
		
		this.serialnum = serialnum;
		this.name = name;
		this.price = price;
	}

	public Product(int i,String name) {
    	 this.serialnum=i;
    	 this.name=name;
    	 for(int k=0;k<100;k++) {
    	 price=(int) (Math.random()*100+20);
    	 if(price<50) { 
    	 this.price=price;
    	 k=100;
    	 }
    	 }
     }
     public Product(int i) {
    	 this.serialnum=i;
    	 this.name="product"+i;
    	 for(int k=0;k<100;k++) {
        	 price=(int)(Math.random()*100+20);
        	 if(price<50) { 
        	 this.price=price;
        	 k=100;
        	 }
        	 }
     }
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("the product: %s %s %s",serialnum,name,price);
	}
     
    public static void lowest(Object[] obj) {
    	try {
    	double low=((Product)(obj[0])).price;
    	int k=0;
    	for(int i=1;i<obj.length-1;i++) {
    		if(low>((Product)(obj[i])).price) {low=((Product)(obj[i])).price; k=i;}
    	}
    	
    	System.out.println("The lowest price belongs to product: "+(((Product)(obj[k])).name)); 
    	
    	} catch(NullPointerException ex) {
    	System.out.println("null exception"+ex);
    	ex.printStackTrace();
        }
    	catch(Exception ex) {System.out.println("Exception: "+ex);}
		
    	
    
    }
	public static void noPrice(Object[] obj) {
		// TODO Auto-generated method stub
		try {
		for(int i=0; i<obj.length;i++) {
			   if(((Product)(obj[i])).price==0){
				   System.out.println("no price for product: "+((Product)(obj[i])).name
						   +"at index: "+i);
			   }
	       }
		}catch(NullPointerException ex) {
			System.out.println("Null exception "+ex); 
			ex.printStackTrace();
			}
		 catch(Exception ex) {System.out.println("Exception: "+ex);
		 }
	}
	public static void discount(Object[] obj) {
		try {
		 for(int i=0;i<obj.length;i++) {
			   ((Product)(obj[i])).price=(int)(((Product)(obj[i])).price*0.85);
			   System.out.println("price after discount: "+obj[i].toString());
		   }
		} catch(NullPointerException ex) {
	    	System.out.println("null exception"+ex);
	    	ex.printStackTrace();
	        }
	    	catch(Exception ex) {System.out.println("Exception: "+ex);}
			 
	}
	public static double allPrices(Object[] obj) {
		double total=0;
		try {
			for(int i=0;i<obj.length;i++) {
			total=+((Product)(obj[i])).price;
			}
		} catch(NullPointerException ex) {
			System.out.println("Null exception: "+ex);
			ex.printStackTrace();
		} catch(Exception ex) {
			System.out.println("Exception "+ex);
		}
		return total;
		}
	}

