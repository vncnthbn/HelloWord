public class Hello  {



    protected static class Hello2{

        int a = 20;
        int b = 30;


    }
    public static void main(String[] args){
        System.out.println("Hello, Vincent Jose C Habon");
        int firstDeclarationOfVariable = 22 ; /*this line is a declaration statement*/
        int sencondVariable = 23;
        int addTwoIntegers = sencondVariable + firstDeclarationOfVariable;
        String concatinating = String.valueOf(addTwoIntegers + firstDeclarationOfVariable);
        int PEMDAS = 10 + 29 - (2* 87);
        Hello2  classB = new Hello2();/*use data from another class declared the class then define its name*/

        String Name = "Vincent Jose C. Habon";
        System.out.println("my name is "+Name + "My age at this year 2022 is "+firstDeclarationOfVariable);
        System.out.println(addTwoIntegers + "Value of addTwointegers and first declaration" +concatinating);
        System.out.println(PEMDAS);
        System.out.println(classB.a);
    }
}
