import java.util.Scanner;

/**
 * Created by 石磊 on 2018/8/4.
 */
public class Exam3 {
    private int n;//输入题号
    private boolean isLeapYear;//是否为闰年
    private boolean isProblem = true;
    String yearStr;
    String monthStr;
    String dayStr;
    int yearInt;
    int monthInt;
    int dayInt;
    public Exam3(int n) {
        this.n = n;
    }
    /**
     * 先判断日期输入的格式对不对，不对就一直循环，对了就break出来，先判断输入的格式对不对，在判断年份时间合不合理
     * 判断是不是闰年，设置isRunnian的值
     * 获取year，month和day部分数据为int型
     * 看day加一有没有超过本月的最大天数，若超过月份加一，day就是1，看月份加一有没超过12月，超过就年份加一，然后变成1月1号
     **/
    public void conduct(){
        System.out.println("请输入日期：");
        String[] str;

        /*先判断输入的日期格式是否符合规范*/
        while(true){
            Scanner sc = new Scanner(System.in);
            String a = sc.next();
            str = a.split("-");
            //先判断基本格式对不对
            if(str.length!=3 || !str[0].matches("\\d+") || !str[1].matches("\\d+") || !str[2].matches("\\d+"))
                System.out.println("输入日期格式很奇怪，请重新输入日期：");
            //若基本格式对了，再判断日期值符不符合要求
            else{
                //得到年月日的字符串
                yearStr = str[0];
                monthStr = str[1];
                dayStr = str[2];
                yearInt = Integer.parseInt(yearStr);
                monthInt = Integer.parseInt(monthStr);
                dayInt = Integer.parseInt(dayStr);
                //月份和日期至少一个是两位数
                if(monthInt>9 || dayInt>9){
                    //如果月份是两位数，日期不知道是不是两位数
                    if(monthInt>9){
                        //若年月日是十位数的以0开头，那么格式有问题，被要求重新输入
                        if(yearStr.startsWith("0") || monthStr.startsWith("0") || dayStr.startsWith("0")){
                            System.out.println("您输入的日期值前有多余的0，请检查后重新输入：");
                        }
                        //若十位数的日期格式前没有0，还要判断日期值有没有超限和2月份闰年日期值超限问题
                        else{
                            //再判断日期格式有没有超限
                            switch (monthInt){
                                case 1:if(dayInt>31){System.out.println("您输入的日期值不存在，请重新输入：");break;}
                                    else{isProblem = false;break;}
                                case 2:
                                    //若是闰年
                                    if(isLeapYearFun(yearInt)){
                                        if(dayInt>29){isLeapYear = isLeapYearFun(yearInt);System.out.println("您输入的日期值不存在，请重新输入：");break;}
                                        else{isProblem = false;break;}
                                    }
                                    //若不是闰年
                                    else{
                                        if(dayInt>28){isLeapYear = isLeapYearFun(yearInt);System.out.println("您输入的日期值不存在，请重新输入：");break;}
                                        else{isProblem = false;break;}
                                    }
                                case 3:if(dayInt>31){System.out.println("您输入的日期值不存在，请重新输入：");break;}
                                    else{isProblem = false;break;}
                                case 4:if(dayInt>30){System.out.println("您输入的日期值不存在，请重新输入：");break;}
                                    else{isProblem = false;break;}
                                case 5:if(dayInt>31){System.out.println("您输入的日期值不存在，请重新输入：");break;}
                                    else{isProblem = false;break;}
                                case 6:if(dayInt>30){System.out.println("您输入的日期值不存在，请重新输入：");break;}
                                    else{isProblem = false;break;}
                                case 7:if(dayInt>31){System.out.println("您输入的日期值不存在，请重新输入：");break;}
                                    else{isProblem = false;break;}
                                case 8:if(dayInt>31){System.out.println("您输入的日期值不存在，请重新输入：");break;}
                                    else{isProblem = false;break;}
                                case 9:if(dayInt>30){System.out.println("您输入的日期值不存在，请重新输入：");break;}
                                    else{isProblem = false;break;}
                                case 10:if(dayInt>31){System.out.println("您输入的日期值不存在，请重新输入：");break;}
                                    else{isProblem = false;break;}
                                case 11:if(dayInt>30){System.out.println("您输入的日期值不存在，请重新输入：");break;}
                                    else{isProblem = false;break;}
                                case 12:if(dayInt>31){System.out.println("您输入的日期值不存在，请重新输入：");break;}
                                    else{isProblem = false;break;}
                                default:System.out.println("您输入的日期值不存在，请重新输入：");break;
                            }
                        }
                    }
                    //如果月份是个位数，但是日期是两位数
                    else if(dayInt>9){
                        if(yearStr.startsWith("0") || dayStr.startsWith("0")){
                            System.out.println("您输入的日期值前有多余的0，请检查后重新输入：");
                        }
                        else{
                            //再判断日期格式有没有超限
                            switch (monthInt){
                                case 1:if(dayInt>31){System.out.println("您输入的日期值不存在，请重新输入：");break;}
                                else{isProblem = false;break;}
                                case 2:
                                    //若是闰年
                                    if(isLeapYearFun(yearInt)){
                                        if(dayInt>29){isLeapYear = isLeapYearFun(yearInt);System.out.println("您输入的日期值不存在，请重新输入：");break;}
                                        else{isProblem = false;break;}
                                    }
                                    //若不是闰年
                                    else{
                                        if(dayInt>28){isLeapYear = isLeapYearFun(yearInt);System.out.println("您输入的日期值不存在，请重新输入：");break;}
                                        else{isProblem = false;break;}
                                    }
                                case 3:if(dayInt>31){System.out.println("您输入的日期值不存在，请重新输入：");break;}
                                else{isProblem = false;break;}
                                case 4:if(dayInt>30){System.out.println("您输入的日期值不存在，请重新输入：");break;}
                                else{isProblem = false;break;}
                                case 5:if(dayInt>31){System.out.println("您输入的日期值不存在，请重新输入：");break;}
                                else{isProblem = false;break;}
                                case 6:if(dayInt>30){System.out.println("您输入的日期值不存在，请重新输入：");break;}
                                else{isProblem = false;break;}
                                case 7:if(dayInt>31){System.out.println("您输入的日期值不存在，请重新输入：");break;}
                                else{isProblem = false;break;}
                                case 8:if(dayInt>31){System.out.println("您输入的日期值不存在，请重新输入：");break;}
                                else{isProblem = false;break;}
                                case 9:if(dayInt>30){System.out.println("您输入的日期值不存在，请重新输入：");break;}
                                else{isProblem = false;break;}
                                case 10:if(dayInt>31){System.out.println("您输入的日期值不存在，请重新输入：");break;}
                                else{isProblem = false;break;}
                                case 11:if(dayInt>30){System.out.println("您输入的日期值不存在，请重新输入：");break;}
                                else{isProblem = false;break;}
                                case 12:if(dayInt>31){System.out.println("您输入的日期值不存在，请重新输入：");break;}
                                else{isProblem = false;break;}
                                default:System.out.println("您输入的日期值不存在，请重新输入：");break;
                            }
                        }
                    }
                }
                //月份和日期都是个位数
                else{
                        isProblem = false;
                }
            }
            //若没有问题，就break出死循环，isProblem默认是有问题，只有当真正没问题才会修改isProblem的值
            if(isProblem == false){
                break;
            }
        }
        //上面格式都对了
        //输出下一天
        switch (monthInt){
            case 1:
                if(dayInt<31){System.out.println(yearStr+"-"+monthStr+"-"+(dayInt+1));break;}
                else{System.out.println(yearStr+"-"+(monthInt+1)+"-"+"01");break;}
            case 2:
                //若是闰年
                if(isLeapYear){
                    if(dayInt<29){System.out.println(yearStr+"-"+monthStr+"-"+(dayInt+1));break;}
                    else{System.out.println(yearStr+"-"+(monthInt+1)+"-"+"01");break;}
                }
                //若不是闰年
                else{
                    if(dayInt<28){System.out.println(yearStr+"-"+monthStr+"-"+(dayInt+1));break;}
                    else{System.out.println(yearStr+"-"+(monthInt+1)+"-"+"01");break;}
                }
            case 3:
                if(dayInt<31){System.out.println(yearStr+"-"+monthStr+"-"+(dayInt+1));break;}
                else{System.out.println(yearStr+"-"+(monthInt+1)+"-"+"01");break;}
            case 4:
                if(dayInt<30){System.out.println(yearStr+"-"+monthStr+"-"+(dayInt+1));break;}
                else{System.out.println(yearStr+"-"+(monthInt+1)+"-"+"01");break;}
            case 5:
                if(dayInt<31){System.out.println(yearStr+"-"+monthStr+"-"+(dayInt+1));break;}
                else{System.out.println(yearStr+"-"+(monthInt+1)+"-"+"01");break;}
            case 6:
                if(dayInt<30){System.out.println(yearStr+"-"+monthStr+"-"+(dayInt+1));break;}
                else{System.out.println(yearStr+"-"+(monthInt+1)+"-"+"01");break;}
            case 7:
                if(dayInt<31){System.out.println(yearStr+"-"+monthStr+"-"+(dayInt+1));break;}
                else{System.out.println(yearStr+"-"+(monthInt+1)+"-"+"01");break;}
            case 8:
                if(dayInt<31){System.out.println(yearStr+"-"+monthStr+"-"+(dayInt+1));break;}
                else{System.out.println(yearStr+"-"+(monthInt+1)+"-"+"01");break;}
            case 9:
                if(dayInt<30){System.out.println(yearStr+"-"+monthStr+"-"+(dayInt+1));break;}
                else{System.out.println(yearStr+"-"+(monthInt+1)+"-"+"01");break;}
            case 10:
                if(dayInt<31){System.out.println(yearStr+"-"+monthStr+"-"+(dayInt+1));break;}
                else{System.out.println(yearStr+"-"+(monthInt+1)+"-"+"01");break;}
            case 11:
                if(dayInt<30){System.out.println(yearStr+"-"+monthStr+"-"+(dayInt+1));break;}
                else{System.out.println(yearStr+"-"+(monthInt+1)+"-"+"01");break;}
            case 12:
                if(dayInt<31){System.out.println(yearStr+"-"+monthStr+"-"+(dayInt+1));break;}
                else{System.out.println((yearInt+1)+"-"+"01"+"-"+"01");break;}
        }
    }

    //判断闰年的方法，返回真假
    public boolean isLeapYearFun(int yearInt){
        return !(yearInt % 4 != 0 )|| (yearInt % 100 == 0 )&& (yearInt % 400 != 0);
    }
}
