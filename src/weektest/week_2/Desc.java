package weektest.week_2;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author shkstart
 * @date 8/9/2019 - 7:31 AM
 */
public class Desc implements Comparator<Staff> {
  private  Set<Staff> set1 = new TreeSet<>();

    @Override
    public int compare(Staff o1, Staff o2) {
        if(o1.getName().equals(o2.getName())==true){
            return 1;
        }
        else


        return 0;
    }
}
