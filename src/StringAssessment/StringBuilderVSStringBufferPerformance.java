package StringAssessment;

public class StringBuilderVSStringBufferPerformance {

	public static void main(String[] args) {
		
		int iterations = 1000;

        // 1. String concatenation
        long startTime = System.nanoTime();
        String str = "";
        for (int i = 0; i < iterations; i++) {
            str += i;
        }
        long endTime = System.nanoTime();
        long stringTime = (endTime - startTime) / 1_000_000; // convert to milliseconds
        System.out.println("String: " + stringTime + "ms");

        // 2. StringBuilder
        startTime = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            sb.append(i);
        }
        endTime = System.nanoTime();
        long stringBuilderTime = (endTime - startTime) / 1_000_000;
        System.out.println("StringBuilder: " + stringBuilderTime + "ms");

        // 3. StringBuffer
        startTime = System.nanoTime();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            sbf.append(i);
        }
        endTime = System.nanoTime();
        long stringBufferTime = (endTime - startTime) / 1_000_000;
        System.out.println("StringBuffer: " + stringBufferTime + "ms");
	}
}
