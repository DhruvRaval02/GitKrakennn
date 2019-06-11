public class CombinedRunner implements GitTesting, QuotientInterface{

    public static void main(String[]args){
        GitTesting gitTesting = (int n) -> (Math.sqrt(n)) ==  (int)(Math.sqrt(n));
        System.out.println(gitTesting.perfectSquare(5));

        QuotientInterface qi = (a,b) -> System.out.printf("%.3f\n", a/b);
        qi.getQuotient(1000f,50f);

    }

    @Override
    public void getQuotient(float a, float b) {
        
    }

}
