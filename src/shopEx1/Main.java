package shopEx1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          	Product product0=new Product(1001,"pen");
          	Product product1=new Product(1002,"pencil");
          	Product product2=new Product(1003,"notebook"); //,0 for checking noPrice function
          	Product product3=new Product(1004,"binder");
          	Product product4=null;
        	Object[] obj=new Product[5];
        	obj[0]=product0;
        	obj[1]=product1;
        	obj[2]=product2;
        	obj[3]=product3;
        	obj[4]=product4;
        	System.out.println(obj[0].toString());
        	System.out.println(obj[1].toString());
        	System.out.println(obj[2].toString());
        	System.out.println(obj[3].toString());
        	Product.lowest(obj);
        	Product.noPrice(obj);
        	Product.discount(obj);
        	System.out.println("The total amount of all prices is "+Product.allPrices(obj));
        	
        }
	}

