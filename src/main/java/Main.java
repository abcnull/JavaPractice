import java.util.Scanner;

/**
 * Created by shilei on 2018/8/4.
 */
public class Main {
    public static void main(String args[]){
        while(true) {
            System.out.println("请选择题号：2——4题，输入0表示结束：");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            if(n!=0) {
                System.out.println("您已选择" + n + "题");
                switch (n) {
                    case 2:
                        new Exam2(n).conduct();
                        break;
                    case 3:
                        new Exam3(n).conduct();
                        break;
                    case 4:
                        new Exam4(n).conduct();
                        break;
                }
            }
            else{
                break;
            }
        }
    }
}
