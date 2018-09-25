import java.util.ArrayList;

public class NumberList {

    //Should only reference type(Integer, String inside <>
    private ArrayList<Integer>  numbers;

    public NumberList(ArrayList<Integer> numbers){

        // <> is already specified above
//        this.numbers = new ArrayList<>();
        this.numbers = numbers;
    }

    public int getNumberCount() {
        return this.numbers.size();
    }

    public void addNumber(int newNumber) {
        this.numbers.add(newNumber);
    }

    public int getNumberAtIndex(int index){
        return this.numbers.get(index);
    }

    public int calculateTotal() {
        int total = 0;
        //i is index
        for (int i=0; i < getNumberCount(); i++){
            total += getNumberAtIndex(i);
        }
        return total;
    }

//    // more ruby way to do the for loop
//    public int calculateTotal() {
//        int total = 0;
//        for (int number : this.numbers){
//            total += number;
//        }
//        return total;
//    }



}
