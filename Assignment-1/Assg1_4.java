public class Assg1_4 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int s1,s2,s3;
        System.out.println("enter the mark of first subject: ");
        s1 = in.nextInt();
        System.out.println("enter the mark of second subject: ");
        s2 = in.nextInt();
        System.out.println("enter the mark of third subject: ");
        s3 = in.nextInt();

        if(s1>60&&s2>60&&s3>60)
            System.out.println("PASSED");
        else if((s1>60&&s2>60)||(s1>60&&s3>60)||(s2>60&&s3>60))
            System.out.println("PROMOTED");
        else
            System.out.println("FAILED");

    }
}
