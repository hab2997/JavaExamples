class Demo {
   void show() {
      System.out.println("I am in show method of super class");
   }
}
class AnnonymousInnerSubClassDemo{
 
   //  An anonymous class with Demo as base class
   static Demo d = new Demo() {
       void show() {
           super.show();
           System.out.println("I am in AnnonymousInnerSubClassDemo class");
       }
   };
   public static void main(String[] args){
       d.show();
   }
}