
import java.util.*;
public class Circle {

    public static void main(String[] args){
        
        Scanner testS = new Scanner(System.in);
        
        System.out.print("请输入学员人数:\n");
        
        int person = testS.nextInt();
        
        int i  = 1;
        
        double sum = 0;
        
        double average = 0;
        
        while(i <= person){

            System.out.print("请输入第"+i+"名学员的成绩:\n");
            
            double score = testS.nextDouble();
            
            sum = sum + score;
            
            i ++;
            
        }
        
        average = sum/person;
        
        System.out.print("一共有"+person+"名学员,"+"平均分是:"+average+"分\n");
        
        
        
        double yearStu = 80000;
        
        int year = 2006;
        
        while (yearStu < 200000){
            
            yearStu = (yearStu*(1+0.25));
            
            year++;
            
        }
        
        System.out.print("到"+year+"年,学员人数将达到20万!");
        
        
        String tempStr = "";
        do{
            
            System.out.print("打一拳!疼吗?");
            tempStr = testS.next();
            
        }while(!tempStr.equals("Y"));
    }

}
