import java.util.Queue;
import java.util.LinkedList;

class reverseNum{
    
    public static int reverse(int x) {
        String l = "";
        Queue<Integer> s = new LinkedList<Integer>();
        boolean i = true;
        
        System.out.println("oldX: "+x);
        while(i == true){
            s.add(x%10);
            x = x/10;
            System.out.println("newX: "+x);
            if(x == 0){
                i = false;
            }
        }
        
        while(s.size() != 1){
            l += s.remove();
            System.out.println("l: "+l);
        }
        int r = s.remove();
        if(r != 0){ l += r;}
        return Integer.parseInt(l);        
    }

    public static void main(String args[]){
        System.out.println(""+reverse(9646324351));
    }
    
}