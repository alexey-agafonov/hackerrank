package dev.agafonov;

import java.util.Scanner;

public class MultidimensionalArrays {
  
  public static void main(String[] args) {
    var arr = new int[6][6];
    
    try (var scanner = new Scanner(System.in)) {
      for (var i = 0; i < 6; i++) {
        var arrRowItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        var arrItem = 0;
        for (var j = 0; j < 6; j++) {
          do {
            arrItem = Integer.parseInt(arrRowItems[j]);    
          } while (arrItem < -9 || arrItem > 9);
          arr[i][j] = arrItem;
        }
      }
      
      var max = -99999;
      var sum = 0;
      for (var i = 0; i < 6; i++) {
        for (var j = 0; j < 6; j++) {
          sum = a[i][j] + a[i][j + 1] + a[i][j + 2] + 
                a[i + 1][j + 1] +
                a[i + 2][j] + a[i + 2][j + 1] + a[i + 2][j + 2];
          
          if (sum > max) {
            max = sum;  
          }
        }
      }
      System.out.println(max);
    }
  }
}
