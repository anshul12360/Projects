class Prime
{
  static boolean isPrime(int num)
  {
    if(num%2==0)
      return false;	 	
    int h=num/2;	
    for(int c=3;c<=h;c+=2) 
    {
	if(num%c==0)
	  return false;
    }  
    return true;
  }
  public static void main(String []args)
  {
	boolean res=isPrime(97);
	System.out.println(res);
  }
}
