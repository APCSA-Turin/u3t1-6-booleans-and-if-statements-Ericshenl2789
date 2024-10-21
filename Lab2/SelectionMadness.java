public class SelectionMadness {

    // no instance variables //
    
    public SelectionMadness() { }
  
    /* Returns 1 of 5 randomly generated fortunes as a string;
       you should write your own 5 fortunes! (see output for examples)
     */
    public String fortune() {
        int random = (int) (Math.random() * 5) + 1;
        if (random == 1){
            return "An average day awaits";
        } 
        else if (random == 2) {
            return "The sun shines on you";
        }
        else if (random == 3) {
            return "Watch out for accidents";
        }
        else if (random == 4) {
            return "Something extraordinary will happen today";
        }
        return "Inspiration hits you"; 
    }
  
    /* Returns the largest of three provided integers: num1, num2, or num3
     */
    public int largest(int num1, int num2, int num3) {
        int largest;
        if (num1 > num2){
            largest = num1;
        } 
        else {
            largest = num2;
        }
        if (num3 > largest){
            largest = num3;
        }
        return largest;
    }
    /* Returns true if the three provided lengths create a right triangle, in
     other words, a2 + b2 = c2, where c is the longest side; returns false
     Otherwise (hint: use the largest() method that you wrote).
     Note the "largest" side could be any of the 3 numbers, i.e. your method
     should work if side1 = 3, side2 = 4, and side3 = 5 and also if
     side1 = 5, side2 = 4, and side3 = 3
   */
    public boolean rightTriangle(int side1, int side2, int side3) {
        int hyp = largest(side1, side2, side3);
        int height = 0;
        int base = 0;
        if (hyp == side1 ){
            height = side2;
            base = side3;
        } else if (hyp == side2){
            height = side1; 
            base = side3;
        } else if (hyp == side3){
            height = side1;
            base = side2;
        }
        boolean isTriangle = Math.pow(height, 2) + Math.pow(base,2 ) == Math.pow(hyp, 2);
        return isTriangle;
    }
  }
  