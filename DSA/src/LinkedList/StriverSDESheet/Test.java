package LinkedList.StriverSDESheet;

import java.util.ArrayList;

public class Test {
    class NumberContainers {
        ArrayList<Integer> list;

        public NumberContainers() {
            list = new ArrayList<>();
        }

        public void change(int index, int number) {
            try {
                list.add(index, number);
            } catch (Exception e){
                list.add(number);
            }
        }

        public int find(int number) {
            int pos = -1;
            if(!list.contains(number)) {
                pos =  -1;
            } else {
                for(int i = 0; i< list.size();i++){
                    if(list.get(i) == number) {
                        pos = i;
                        break;
                    }
                }
            }
            return pos;
        }
    }
}
