import java.util.*;
import java.io.*;

public class FrogJump {
    
    static class JumpType {
        long a, b, c;
        JumpType(long a, long b, long c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        
        int t = Integer.parseInt(br.readLine());
        
        while (t-- > 0) {
            String[] line = br.readLine().split(" ");
            int n = Integer.parseInt(line[0]);
            long x = Long.parseLong(line[1]);
            
            JumpType[] jumps = new JumpType[n];
            for (int i = 0; i < n; i++) {
                line = br.readLine().split(" ");
                long a = Long.parseLong(line[0]);
                long b = Long.parseLong(line[1]);
                long c = Long.parseLong(line[2]);
                jumps[i] = new JumpType(a, b, c);
            }
            
            pw.println(solve(n, x, jumps));
        }
        
        pw.close();
    }
    
    static long solve(int n, long x, JumpType[] jumps) {
        // First check if we can reach without any rollbacks
        long maxWithoutRollbacks = 0;
        long bestNet = Long.MIN_VALUE;
        
        for (JumpType j : jumps) {
            // Free jumps before first rollback
            long freeJumps = j.b - 1;
            maxWithoutRollbacks += freeJumps * j.a;
            
            // Net gain per rollback cycle
            long netPerCycle = j.b * j.a - j.c;
            bestNet = Math.max(bestNet, netPerCycle);
        }
        
        if (maxWithoutRollbacks >= x) {
            return 0;
        }
        
        // If best net gain is non-positive, we can't progress further
        if (bestNet <= 0) {
            return -1;
        }
        
        // Calculate minimum rollbacks needed
        long remaining = x - maxWithoutRollbacks;
        long rollbacksNeeded = (remaining + bestNet - 1) / bestNet;
        
        return rollbacksNeeded;
    }
}