package firstPackage;

public class TestClass {
    public int testPublicInt=10;
    private int testPrivateInt=11;
    protected int testProtectedInt= 12;
     int testDefaultInt=13;

     public void testPublic(){
         System.out.println("I am inside public method");
     }
     private void testPrivate() {
         System.out.println("I am inside private method");
     }
         protected void testProtected() {
             System.out.println("I am inside protected method");
         }
         void testDefault(){
             System.out.println("I am inside default method");
         }


}



