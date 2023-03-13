package DsaProblems.src.TwoPointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
List1 = [1, 3, 4, 5,9]
List2 = [2, 3, 4, 12,19,25]

Output = [1,2,3,3,4,4,5,9,12,19,25]

 */
public class MergeTwoSortedList {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 3, 4, 5,9);
        List<Integer> list2 = Arrays.asList(2, 3, 4, 12,19,25);
        List<Integer> sortedList = MergeTwoSortedLists(list1,list2);
        sortedList.forEach(s-> System.out.print(s+ " "));
    }

    private static List<Integer> MergeTwoSortedLists(List<Integer> list1 , List<Integer> list2){
       int first = 0 , second = 0;
       List<Integer> sortedList = new ArrayList<>();
       while(first < list1.size() && second < list2.size()){
           if(list1.get(first) > list2.get(second)) sortedList.add(list2.get(second++));
           else sortedList.add(list1.get(first++));
       }
       while(first < list1.size()) sortedList.add(list1.get(first++));
       while(second<list2.size()) sortedList.add(list2.get(second++));
      return sortedList;
    }
}
