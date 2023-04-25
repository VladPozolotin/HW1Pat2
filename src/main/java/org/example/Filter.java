package org.example;

import java.util.ArrayList;
import java.util.List;

public class Filter {
    protected int threshold;
    public Filter(int threshold){
        this.threshold = threshold;
    }
    public List<Integer> filterOut(List<Integer> input) {
        Logger logger = Logger.getInstance();
        logger.log("Фильтруем");
        List<Integer> result = new ArrayList<>();
        for (int item : input) {
            if (item < this.threshold){
                logger.log(item + " не проходит");
            } else {
                logger.log(item + " проходит");
                result.add(item);
            }
        }
        logger.log("Прошло фильтр " + result.size() + " элемента(ов) из " + input.size());
        return result;
    }
}
