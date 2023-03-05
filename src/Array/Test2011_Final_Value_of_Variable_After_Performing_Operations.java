package Array;

public class Test2011_Final_Value_of_Variable_After_Performing_Operations {
    class Solution {
        public int finalValueAfterOperations(String[] operations) {
            int X = 0;
            for (int i = 0; i < operations.length; i++) {
                if (operations[i].equals("++X") || operations[i].equals("X++")) {
                    X += 1;
                }
                else {
                    X -= 1;
                }
            }
            return X;
        }
    }
}
