package open_closed;

import open_closed.Interface.IGetOperationResult;

import java.util.ArrayList;

public class Calculator {
    private ArrayList<Integer> numbers = null;
    // Aggregation relationship
 private IGetOperationResult getOperationResult;

    public Calculator(){
        numbers = new ArrayList<>();
    }

    public ArrayList<Integer> getNumbers() {
        return numbers;
    }

    public void addNumber(int number){

        numbers.add(number);
    }
    public void removeNumberAtIndex(int index){
        if (index < 0 || index >= numbers.size()){
            System.out.println("Invalid number: " + index);
            return;
        }
        numbers.remove(index);
    }

    public int getOperationResult(IGetOperationResult getOperationResult){

        getOperationResult.results(numbers);
        System.err.println("Invalid operation");
        return -1111111;
    }


    // getter and setter functions


    public void setGetOperationResult(IGetOperationResult getOperationResult) {
        this.getOperationResult = getOperationResult;
    }

    public void setNumbers(ArrayList<Integer> numbers) {
        this.numbers = numbers;
    }

    public IGetOperationResult getGetOperationResult() {
        return getOperationResult;
    }

}
