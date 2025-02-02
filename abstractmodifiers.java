// public class abstractmodifiers {
//       public  void m1();                    //missing method body, or declare abstract
//      public abstract void m1(){}             //abstract methods cannot have a body
// }

// ------------------------------------------------------------------------------

// public class abstractmodifiers {
//          public abstract void m1();        //abstractmodifiers is not abstract and does not override abstract method m1() in abstractmodifiers  
//     }                                      // implement the method m1 or make the class abstract.

// -------------------------------------------------------------------------------

abstract class abstractmodifiers{
    public abstract void m1();
    public abstract void m2();             //compile successfully.
}

 class B extends abstractmodifiers {         //B is not abstract and does not override abstract method m2() in abstractmodifiers
    public void  m1() {}                    //make the B class abstract or implement the m2() method.
    
}

// --------------------------------------------------------------------------------

// abstract class A{
//         public abstract void m1();
//         public abstract void m2();
    
//     }
//      class B extends A {         
//         public  void  m1() {
//             System.out.println("Hello");
//         } 
//         public   void  m2() {
//             System.out.println("World");
//         }

//      }

//      public class abstractmodifiers{
//         public static void main(String[] args) {

//             B a = new B();
//             a.m1();
//             a.m2();
   
//      }
//     }