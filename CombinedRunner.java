public class CombinedRunner implements GitTesting, QuotientInterface{

    public static void main(String[]args){
        GitTesting gitTesting = (int n) -> (Math.sqrt(n)) ==  (int)(Math.sqrt(n));
        System.out.println(gitTesting.perfectSquare(5));

        QuotientInterface qi = (a,b) -> System.out.printf("%.3f\n", a/b);
        qi.getQuotient(1000f,50f);

        //Partner B: Through this project, I learned a lot about how git works, as well as specifics of GitHub and GitKraken.
        //Partner B: This project taught me how to correctly use the oush, pull, and commit commands, which I had no clue how to use before.
        //Partner B: Also, this above portion showed me how to correctly use lambda notation in methods, a skill which I think will be pivotal in the future.

    }

    @Override
    public void getQuotient(float a, float b) {
        
    }

}
