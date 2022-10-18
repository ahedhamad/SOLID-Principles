package open_closed.Impements;

import open_closed.Interface.IGetOperationResult;

import java.util.ArrayList;

public class Addition implements IGetOperationResult {

    @Override
    public int results(ArrayList<Integer> numbers) {
        int result = 0;
            for (Integer number : numbers) {
               result += number;
           }
            return result;
    }
}
