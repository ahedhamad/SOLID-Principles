package open_closed.Impements;

import open_closed.Interface.IGetOperationResult;

import java.util.ArrayList;

public class Count implements IGetOperationResult {

    @Override
    public int results(ArrayList<Integer> numbers) {
        return numbers.size();
    }
}
