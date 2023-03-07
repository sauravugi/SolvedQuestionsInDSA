package DsaProblems.src.BruteForce;
/*
    if N = 5
    *
    * *
    * * *
    * * * *
    * * * * *
    Print like this
 */
public class PatternPrint1 {
    public static void main(String[] args) {
        new PatternPrint1().printPattern(5);
    }

    // Pattern Printing Method
    private void printPattern(int n){
        for( int i = 0 ; i < n ; i++ ){
            StringBuilder sb = new StringBuilder();  // For Faster Performance
            for( int j = 0 ; j <= i ; j++ ){
                sb.append("* ");
            }
            System.out.println(sb.toString().trim());  // For No extra Space use Trim Method
        }
    }
}
