public class NumberStuff {

    public NumberStuff() { }
 
    public String positiveZeroOrNegative(int num) {
        if (num > 0) {
            return num + " is a positive number";
        }
        if (num == 0) {
            return num + " isn't positive or negative";
        }
            return num + " is a negative number";
        
    }
 }
 