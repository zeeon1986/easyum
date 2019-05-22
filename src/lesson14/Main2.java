package lesson14;

public class Main2 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Type a number");
//        String inputNum = sc.nextLine();
//        try {
//            int num = Integer.parseInt(inputNum);
//            System.out.println(num);
//        }
//        catch (Exception e) {
//            System.out.println("You have typed not a number");
//        }
//        finally {
//            sc.close();
//        }

        Person person = new Person();
        person.setName("Vasya");
        try {
            person.setAge(200);
        } catch (Exception e) {
            System.out.println("Type correct age");
        }
        System.out.println(person);
        int num = 011;
        System.out.println(num);
    }
}
