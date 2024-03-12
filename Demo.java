public class Demo{
    public static void main(String args[]){
        int i=123;
        int sum=0;
        while(i>=0){
            int val=i%10;
            sum=sum+(val*val*val);
            i=i/10;
        }
        System.out.println("Sum is "+sum);
    }
}