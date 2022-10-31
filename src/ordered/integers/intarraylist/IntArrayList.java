package ordered.integers.intarraylist;

import ordered.integers.IntList;

public class IntArrayList implements IntList {

    //#5 - IntList Interface
    public IntArrayList() {
        this.intListArray = new Integer[10];
    }

    public Integer[] getIntListArray() {
        return intListArray;
    }

    private Integer[] intListArray;

    @Override
    public void add(int numberToAdd) {

        boolean checkedSize = false;

        for (int i = 0; i < intListArray.length; i++) {
            if (intListArray[i] == null) {
                intListArray[i] = numberToAdd;

                checkedSize = true;
                break;
            }
        }

        //If checked size true, expand array by 50%
        if (!checkedSize) {

            int capacity = intListArray.length + intListArray.length / 2;
            Integer[] newIntListArray = new Integer[capacity];
            System.arraycopy(intListArray, 0, newIntListArray, 0, intListArray.length);

            intListArray = newIntListArray;
        }
    }

    @Override
    public Integer get(Integer id) {
        return id;
    }

}



