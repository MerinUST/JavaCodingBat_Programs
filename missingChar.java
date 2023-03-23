public class Main
{
	public static void main(String[] args) {
	 String str="abcdefg";
      char[] c= str.toCharArray();
      char[] strnew= new char[c.length-1];
      int n=2;
      f:for(int i=0;i<(c.length-1);i++)
      {
          if(n==i){
             
              continue f;
          }
          else{
             strnew[i]=c[i];
          }
         
      }
      String s=new String(strnew); 
       System.out.println(strnew);
    
	}
}
