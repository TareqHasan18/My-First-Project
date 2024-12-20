public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello GitHub! This is another update");
        System.out.println("Hello everyone! checking another sentence for github");

        //This is just a basic for loop
//        for(int i = 0; i < 10; i++){
//            System.out.println(i);
//        }

        //write a if else statement which will determine achived grade for a student
        int grade = 55;
        if(grade > 91){
            System.out.println("A+");
        }else if(grade > 81 && grade <= 90){
            System.out.println("A");
        }else if(grade > 71 && grade <= 80){
            System.out.println("B");
        } else if (grade > 61 && grade <= 70) {
            System.out.println("C");
        }else {
            System.out.println("D");
        }

        //this is from feature/issue-1 branch

        //This section is to reverse the string using java built in method
        String myString = "This is a string";
        StringBuilder stringBuilder = new StringBuilder(myString);
        System.out.println(stringBuilder.reverse());


        System.out.println("This is from feature branch");

        System.out.println("this is from main branch");

    }
}
