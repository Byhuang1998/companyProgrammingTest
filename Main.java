package programmingTest;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String string = in.next();
        String c = in.next();
        int min = in.nextInt();
        int max = in.nextInt();
        in.close();
        String[] ss = string.split(c);
        int n = ss.length;
        
        // 获取所有字符串的长度、判断是否符合长度要求
        int[] length = new int[n];
        boolean[] rightSize = new boolean[n];
        for (int i=0; i<n; i++) {
        	int tem = ss[i].length();
        	length[i] = tem;
        	if (tem >= min && tem < max) {
        		rightSize[i] = true;
        	} else {
        		rightSize[i] = false;
        	}
        	
        }
        
        // 打印字符串
        for (String s : ss) {
        	System.out.print(s + " ");
        }
    }
    public static String[] change(String[] ss, boolean[] rightSize, int[] length, int n) {
    	int[] pos = new int[2];
    	for (int i=0; i<n; i++) {
    		if (rightSize[i] == false) {
    			pos[0] = i;
    		}
    	}
    	
    	return null;
    }
    
    
}
