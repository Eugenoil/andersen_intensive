package by.dunin.comparator;

import java.util.Comparator;
import java.util.Objects;

public class ObjectComparator implements Comparator<Object>{
        @Override
        public int compare(Object obj1, Object obj2) {
            if (Objects.equals(obj1, obj2)) {
                return 0;
            }
            if (obj1 == null) {
                return -1;
            }
            if (obj2 == null) {
                return 1;
            }
            return String.valueOf(obj1).compareTo(String.valueOf(obj2));
        }
    }
