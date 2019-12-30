package shopEx3;

	public class Payment extends Product{
	    public static double[] priceDis=new double[5]; 
		public static void makeDiscount(Object[] obj) {
			try {
			   for(int i=0;i<obj.length;i++) {
				   Product p=(((Product)(obj[i])));
				   priceDis[i]=p.getPrice()*0.85;
				   System.out.println(String.format("price after discount: %s %s %s"
						   ,p.getSerialnum(),p.getName(),priceDis[i]));
			   }
			}catch(NullPointerException ex) {
			      System.out.println("Null exception"+ex);
			      ex.printStackTrace();
			   }
			catch(Exception ex) {System.out.println("Exception"+ex);}
		 }
		public Payment() {
			
		}

	}

