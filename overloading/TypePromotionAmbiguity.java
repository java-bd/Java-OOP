class TypePromotionAmbiguity{  
  void sum(int a,long b){System.out.println("a method invoked");}  
  void sum(long a,int b){System.out.println("b method invoked");}  
  
  public static void main(String args[]){  
	  TypePromotionAmbiguity obj=new TypePromotionAmbiguity();  
	  obj.sum(20,20);//now ambiguity  //  error: reference to sum is ambiguous
  }  
}  