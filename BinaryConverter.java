public class BinaryConverter {
 public static void main(String[] args) {
  for (int i = -10; i < 50; i++) {
   System.out.println(i + ": " + toBinary(i));
   System.out.println(i + ": " + Integer.toBinaryString(i));
  }
 }

 public static String toBinary(int base10) {
  boolean isNegative = base10 < 0;
  base10 = Math.abs(base10);
  String result = "";

  while (base10 > 1) {
   result = (base10 % 2) + result;
   base10 /= 2;
  }
  assert base10 == 0 || base10 == 1 : "Value is not <= 1: " + base10;
  result = base10 + result;
  assert allZeroesAndOnes(result);
  if (isNegative) {
   result = "-" + result;
  }
  return result;
 }

 private static boolean allZeroesAndOnes(String valString) {
  assert valString != null : "Parameter can't be null";
  boolean all = true;
  int i = 0;
  char c;

  while (all && i < valString.length()) {
   c = valString.charAt(i);
   all = c == '0' || c == '1';
   i++;
  }
  return all;
 }
}