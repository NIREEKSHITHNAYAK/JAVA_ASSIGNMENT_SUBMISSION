/*2.b. Develop a Java program to make a Performance Test on StringBuffer and StringBuilder for appending the string ‘AIET’ 
 * for 10000 times both in the StringBuffer and StringBuilder. Justify your answer which one is better.*/
package twoB;
public class PerformanceTest {

    public static void main(String[] args) {

        int iterations = 10000;

        // Test StringBuffer
        StringBuffer sbf = new StringBuffer();
        long startTimeBuffer = System.nanoTime();

        for (int i = 0; i < iterations; i++) {
            sbf.append("AIET");
        }

        long endTimeBuffer = System.nanoTime();
        long durationBuffer = endTimeBuffer - startTimeBuffer;

        // Test StringBuilder
        StringBuilder sbd = new StringBuilder();
        long startTimeBuilder = System.nanoTime();

        for (int i = 0; i < iterations; i++) {
            sbd.append("AIET");
        }

        long endTimeBuilder = System.nanoTime();
        long durationBuilder = endTimeBuilder - startTimeBuilder;

        // Display Results
        System.out.println("StringBuffer Time: " + durationBuffer + " ns");
        System.out.println("StringBuilder Time: " + durationBuilder + " ns");

        // Comparison
        if (durationBuffer > durationBuilder) {
            System.out.println("StringBuilder is faster than StringBuffer.");
        } else if (durationBuffer < durationBuilder) {
            System.out.println("StringBuffer is faster than StringBuilder.");
        } else {
            System.out.println("Both have similar performance.");
        }
    }
}