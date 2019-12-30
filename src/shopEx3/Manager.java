package shopEx3;

public class Manager {
	Product product0=new Product(1001,"pen");
  	Product product1=new Product(1002,"pencil");
  	Product product2=new Product(1003,"notebook");//add 0 to check noPrice
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
	Product.lowest(obj);         //find product with the lowest price
	Product.noPrice(obj);        //find product with no price
	Payment.makeDiscount(obj);   //updating prices without using Main
	Price.makeDiscount(obj,20);  //changeable discount percent
	Object[] shop2=new Product[4];
	shop2[0]=new Product(1006,"book",14);
	shop2[1]=new Product(1007,"memo",16);
	shop2[2]=new Product(1008,"glue",15);
	shop2[3]=new Product(1009,"scissors",17);
    Price.updatePrice(shop2,-10);    //add or decrease
    Price.updatePrice(shop2, -2.5);  //rise or discount by percent 2.0 double intakes
    Price.updatePrice(shop2,0);      //zero update

    public Manager() {
    	
    }
}
