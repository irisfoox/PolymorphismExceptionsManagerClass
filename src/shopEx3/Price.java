package shopEx3;

	public class Price extends Payment{
		public static double[] priceDis2=new double[4];
		
		public static void updatePrice(Object[] shop,int add) {
			for(int i=0; i<shop.length;i++) {
			Product p=((Product)(shop[i]));
			priceDis2[i]=p.getPrice()+add;
			if(add==0) {priceDis2[i]=0;}
			System.out.println(String.format("the new shop's product&updated price: %s %s %s",p.getSerialnum()
					,p.getName(),priceDis2[i]));
		}
		}
		public static void updatePrice(Object[] shop,double percentRise) {
			for(int i=0; i<shop.length;i++) {
				Product p=((Product)(shop[i]));
				priceDis2[i]=(int)p.getPrice()*(100+percentRise)/100;  //casting to int so no 0.9999999 occurs
				System.out.println(String.format("the new shop's product&updated price: %s %s %s",p.getSerialnum()
						,p.getName(),priceDis2[i]));
			}
		}
	    public static void makeDiscount(Object[] obj,double discountPercent) {
			// TODO Auto-generated method stub
		    //changeable discount percent
			try {
			for(int i=0;i<obj.length;i++) {
				Product p=((Product)(obj[i]));
				priceDis[i]=(p.getPrice())*(100-discountPercent)/100;  // an array for discounted prices
				System.out.println(String.format("price after specific discount: %s %s %s",p.getSerialnum(),p.getName()
						,priceDis[i]));
			}
			}catch(NullPointerException ex) {
				System.out.println("Null exception"+ex);
				ex.printStackTrace();
			}
			catch(Exception ex) {System.out.println("Exception "+ex);}
		}

		public Price() {
	    	
	    }
	}

}
