package open_closed.Impements;

import open_closed.Interface.IGetOperationResult;

import java.util.ArrayList;

public class Min implements IGetOperationResult {
    @Override
    public int results(ArrayList<Integer> numbers) {
        int min = Integer.MAX_VALUE;
        for (Integer number : numbers) {
            if (min > number){

                min = number;
            }
        }
        return min;
    }
    }


