import java.util.Stack;

public class BaseBallGame {

    public static int calPoints(String[] operations) {


        Stack<Integer> a = new Stack<>();
        int count = 0;

        for(int i = 0; i< operations.length;i++){
            if (operations[i].matches("-?\\d+")) {
                count = Integer.parseInt(operations[i]);
                a.push(count);
            }
            if(operations[i].charAt(0) == '+'){

                int hold = a.pop();
                int second = a.peek();
                a.push(hold);
                a.push(a.peek()+second);
            }

            if(operations[i].charAt(0) == 'D'){
                a.push(a.peek()*2);
            }

            if(operations[i].charAt(0) == 'C'){
                a.pop();
            }

        }

        int to =0;
        while(!a.isEmpty()){
            to += a.pop();
        }
return to;
    }

    public static void main(String[] args) {
        String[] a = {"5","-2","4","C","D","9","+","+"};
        System.out.println( calPoints(a));

    }
}
