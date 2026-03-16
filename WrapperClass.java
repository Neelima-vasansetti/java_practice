public class WrapperClass
{
    public static void main(String[] args)
    {
        int num = 8;
        Integer obj = num; // Autoboxing: converting primitive int to Integer object
        System.out.println("Integer object: " + obj);
        System.out.println("prmitive value:"+num);
        int value =obj; // Unboxing: converting Integer object back to primitive int
        System.out.println("primitive value: " + value);
    }
}