package firstPackage;

import secondPackage.ChildTestClassDifferentPackage;

public class MainClass {
    public static void main(String[] args) {

        TestClass tc = new TestClass();
        ChildTestClass ctc = new ChildTestClass();
        ChildTestClassDifferentPackage ctcdp = new ChildTestClassDifferentPackage();
      // TestClassDifferentPackage tcdp = new TestClassDifferentPackage();
        System.out.println("*********From TestClass************");
        tc.testPublic();
        tc.testProtected();
        tc.testDefault();
        System.out.println("From *********ChildTestClassSamePackage***************");
        ctc.testPublic();
        ctc.testProtected();
        ctc.testDefault();
        System.out.println("************From ChildClassDifferentPackage**************");
        ctcdp.testPublic();
        ctcdp.testProtected();






    }
}
