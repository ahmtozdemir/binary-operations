package binaryoperations;

public class SumAndMultiply {

    public String BinarySum(String a, String b){
        int left = Integer.parseInt(a, 2);
        int right = Integer.parseInt(b, 2);
        int sum = left + right;
        return Integer.toBinaryString(sum);
    }

    public String BinaryProd(String a, String b){
        int left = Integer.parseInt(a, 2);
        int right = Integer.parseInt(b, 2);
        int prod = left * right;
        return Integer.toBinaryString(prod);
    }

    
}