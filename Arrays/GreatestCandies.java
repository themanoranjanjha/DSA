import java.util.ArrayList;
import java.util.List;

/**
 * GreatestCandies
 */
public class GreatestCandies {
    
     List<Boolean> maxCandies(int[] candies, int extraCandies) {
        int max = 0;    
        List<Boolean> list = new ArrayList<>();

        for (int i = 0; i < candies.length; i++) {
           max = Math.max(candies[i], max);
        }

        for(int i =0; i<candies.length; i++){

            if (candies[i]+extraCandies >= max) {
                list.add(true);
            }
            else{
                list.add(false);
            }
        }
        return list;
     }
            
     public static void main(String[] args) {
        GreatestCandies gc = new GreatestCandies();
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        List<Boolean> list = gc.maxCandies(candies, extraCandies);
        System.out.println(list);
     }
    }     



