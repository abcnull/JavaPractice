import java.util.Scanner;

/**
 * Created by shilei on 2018/8/4.
 */
public class Exam2 {
    private int n;//题号
    private int b;//输出
    public Exam2(int n) {
        this.n = n;
    }
    public void conduct(){
        System.out.println("请输入工资：");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if(a<=1500){
            b = a * 3 /100;
        }
        else if(a>1500 && a<=4500){
            b = 1500 * 3/100+ (a-1500) *10 /100;
        }
        else if(a>4500 && a<=9000){
            b = 1500 * 3/100+ 3000 * 10 /100 + (a-4500)*20/100;
        }
        else if(a>9000 && a<=35000){
            b = 1500 * 3/100+ 3000 * 10 /100 + 4500*20/100 + (a-9000)*25/100;
        }
        else if(a>35000 && a<=55000){
            b = 1500 * 3/100+ 3000 * 10 /100 + 4500*20/100 + 26000*25/100+(a-35000)*30/100;
        }
        else if(a>55000 && a<=80000){
            b = 1500 * 3/100+ 3000 * 10 /100 + 4500*20/100 + 26000*25/100 + 20000 *30/100 + (a-55000)*35/100;
        }
        else if(a>80000){
            b = 1500 * 3/100+ 3000 * 10 /100 + 4500*20/100 + 26000*25/100 + 20000 *30/100 + 25000*35/100 + (a-80000)*45/100;
        }
        System.out.println("所需要缴纳的税费为："+ b +"元");
    }
}
