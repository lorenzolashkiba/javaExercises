public class Main {
    public static void main(String[] args) {
        List<Integer> arrNum = new List<Integer>();
        List<Integer> arrNum1 = new List<Integer>();

        int flag = 0;
        arrNum.push(1);
        arrNum.push(2);
        arrNum.push(2);
        arrNum.push(3);
        arrNum.push(2);
        arrNum.push(2);
        arrNum.push(1);

        for (int i = 0; i < arrNum.getSize() / 2; i++) {
            arrNum1.push(arrNum.pop());
        }
        System.out.println("arrnum=" + arrNum);

        System.out.println("arrnum1=" + arrNum1);
        if ((arrNum.getSize() % 2) == 0) {
            arrNum.pop();
        }

        System.out.println("arrnum=" + arrNum);

        System.out.println("arrnum1=" + arrNum1);

        while (!arrNum.isEmplty()) {
            System.out.println(arrNum.peek());
            if (arrNum1.peek() == arrNum.peek()) {
                arrNum1.pop();
                arrNum.pop();
            } else {
                flag = 1;
                break;
            }

        }
        System.out.println(flag==1?"nn e palindroma":"e palindroma");
    }
       /* for (int i = 0; i < arrNum.getSize()/2; i++) {
            if(arrNum.getIndex(i)!=arrNum.pop()){
                flag=1;
                System.out.println("uguale, "+arrNum.peek());
            }
        }
        System.out.println(arrNum);
        */



    }

