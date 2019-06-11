package printquotient;
public class PrintQuotient implements QuotientInterface{

    public static void main(String[] args) {
        QuotientInterface qi = (a,b) -> System.out.printf("%.3f\n", a/b);
        qi.getQuotient(1000f,50f);
        
    }

    @Override
    public void getQuotient(float a, float b) {
        
    }
    
}
