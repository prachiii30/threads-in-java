public class multipleCatchwithTry {
    public static void main(String[] args) {
        int i=0;
        int j=0;
        String s=null;
        int[] arr=new int[3];
        try{
            System.out.println(s.length());
            j=6/i;
            System.out.println("in try");
            System.out.println(arr[4]);
        }
        catch(ArithmeticException e){
            System.out.println("not a maths operation");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("be in your limits");
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("done");
    }
    
}
