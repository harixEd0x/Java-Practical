public class Practical7 {
    public static void main(String[] args) {
        //letter
        int letter1 = 65 + (int) (Math.random() * (90 - 65));
        int letter2 = 65 + (int) (Math.random() * (90 - 65));
        int letter3 = 65 + (int) (Math.random() * (90 - 65));
        //number
        int numb1 = (int) (Math.random() * 10);
        int numb2 = (int) (Math.random() * 10);
        int numb3 = (int) (Math.random() * 10);
        int numb4 = (int) (Math.random() * 10);
        System.out.println("" + (char) letter1 + (char) letter2 + (char) letter3 + "-" + numb1 + numb2 + numb3 + numb4);
    }

}
