public class ErrorExample {
    public static void recursive()
    {
        System.out.println ( " dont call me");
        recursive();

    }
    public static void main ( String[]args)
    {
        recursive();
    }
    
}
