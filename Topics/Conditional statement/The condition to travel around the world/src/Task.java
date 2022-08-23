// You can experiment here, it won’t be checked

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task {
  public static void main(String[] args) {
    int result = solution(1041);
    System.out.println(result);
  }



  private static int solution(int intValue) {
    String binaryString = Integer.toBinaryString(intValue);
    int zeroHit = 0;
    int longest = 0;
    for (int i = 0; i < binaryString.length(); i++) {
      if(binaryString.charAt(i) == '1') {
        if (zeroHit > longest) {
          longest = zeroHit;
        }
        zeroHit = 0;
      }
      else { zeroHit++; }
    }
    return longest;
  }

//  public static int solution(int num) {
//    int ptr; //Used for bitwise operation.
//    for(ptr=1; ptr>0; ptr<<=1) //Find the lowest bit 1
//      if((num&ptr) != 0)
//        break;
//    int cnt=0; //Count the (possible) gap
//    int ret=0; //Keep the longest gap.
//    for(; ptr>0; ptr<<=1) {
//      if((num&ptr) != 0) { //If it's bit 1
//        ret = cnt < ret ? ret : cnt; //Get the bigger one between cnt and ret
//        cnt=-1; //Exclude this bit
//      }
//      cnt++; //Increment the count. If this bit is 1, then cnt would become 0 beause we set the cnt as -1 instead of 0.
//    }
//    return ret;
//  }

//  public static int solution(int n) {
//
//    String binaryRep = Integer.toBinaryString(n);
////    System.out.println("Binary Representation of " + n + " = " + binaryRep);
//    List<String> strList = new ArrayList<String>();
//    int count = 0;
//    for (int i = 0; i < binaryRep.length(); i++) { // Loop through the each number
//      String str = binaryRep.charAt(i) + ""; // getting one by one number
//      if(str.equals("0")){
//        for(int j = i;j<binaryRep.length();j++){ //Get each next element
//          String str1 = binaryRep.charAt(j) + "";
//          if(!str.equals("1") &&  str.equals(str1)){
//            if(!strList.isEmpty() && count >= strList.size()){
//              strList.add(str1);
//            }else if(strList.isEmpty()){
//              strList.add(str1);
//            }
//            count ++;
//          }else{
//            count = 0;
//            break;
//          }
//        }
//      }
//    }
//    return strList.size();
//  }



}
