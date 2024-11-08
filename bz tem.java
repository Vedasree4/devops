import java.util.*;

public class Main {
    public static int countK(int n, String s) {

        int count0 = (int) s.chars().filter(ch -> ch == '0').count();
        int count1 = n - count0;
        int r = 0;
        for (int k = 1; k <= n; ++k) {
            if (count0 % k == 0 || count1 % k == 0) {
                r++;
            }
        }

        return r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(); 
        while (x--> 0) {
            int n = sc.nextInt();
            String s = sc.next();
            System.out.println(countK(n, s));
        }
        
        scanner.close();
    }
}




import java.util.Scanner;

public class WinningWorldFinals {
    public static void main(String[] args) {
        int timeLeft = 299 - M;
            
        
        
        sc.close();
    }
}


import java.util.*;
import java.io.*;

public class RangeMinimize {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();
        
        int X = Integer.parseInt(br.readLine());
        
        while (X-- > 0) {
            int N = Integer.parseInt(br.readLine());
            int[] A = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            if (N <= 3) {
                result.append("0\n");
                continue;
            }
             Arrays.sort(A);
            
            int minRange = Math.min(A[N-3] - A[0], Math.min(A[N-2] - A[1], A[N-1] - A[2]));
            result.append(minRange).append("\n");
        }
        System.out.print(result);
    }
}




import java.util.Scanner;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        
        int X = sc.nextInt();  
        StringBuilder s = new StringBuilder();
        while (X-- > 0) {
            int n = sc.nextInt();  
            int M = sc.nextInt(); 
            
            char[][] strings = new char[M][n];
            for (int i = 0; i < M; i++) {
                strings[i] = sc.next().toCharArray();
            }
            for (int col = 0; col < n; col++) {
                int countZero = 0;
                int countOne = 0;

                for (int row = 0; row < M; row++) {
                    if (strings[row][col] == '0') countZero++;
                    else if (strings[row][col] == '1') countOne++;
                }
                char replacementZero = (countZero > countOne) ? '1' : '0';  
                char replacementOne = (replacementZero == '0') ? '1' : '0';  
                
                int flip = 0;
                for (int row = 0; row < M; row++) {
                    if (strings[row][col] == '?') {
                        strings[row][col] = (flip % 2 == 0) ? replacementZero : replacementOne;
                        flip++;
                    }
                }
            }
            
            int totalH = 0;
            for (int i = 0; i < M; i++) {
                for (int j = i + 1; j < M; j++) {
                    int hammingD = 0;
                    for (int k = 0; k < n; k++) {
                        if (strings[i][k] != strings[j][k]) {
                            hammingD++;
                        }
                    }
                    totalH += hammingD;
                }
            }
            
            s.append(totalH).append("\n");
        }
        System.out.println(s.toString());  
    }
}
import java.util.Scanner;

public class MaxHammingDistance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            String[] strings = new String[m];
            
            for (int i = 0; i < m; i++) {
                strings[i] = sc.next();
            }

            long totalD = 0;
            for (int col = 0; col < n; col++) {
                int countZ = 0, countO = 0, countQuestionMark = 0;

                for (int row = 0; row < m; row++) {
                    char c = strings[row].charAt(col);
                    if (c == '0') countZ++;
                    else if (c == '1') countO++;
                    else countQuestionMark++;
                }

                int minC = Math.min(countZ, countO);
                int maxC = Math.max(countZ, countO);

                if (minC + countQuestionMark <= maxC) {
                    minC += countQuestionMark;
                } else {
                    countQuestionMark -= maxC - minC;
                    minC = maxC;
                    maxC += countQuestionMark / 2;
                    minC += (countQuestionMark + 1) / 2;
                }

                totalD += (long) minC * maxC;
            }

            System.out.println(totalHD);
        }
    }
}

