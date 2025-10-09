public class tirsdag23 {
    public static void main(String[] args) {
        int[] week = {3, 4, 5, 7, 8, 9, 0};
        int[] week2 = {12, 1, 0, 0, 0, 0, 0};
        int j = 0;
        week2 = Arrays.copyOf(week, week.length);

        for(int i = 0; i < week2.length; i++) {
            System.out.println(week2[i]);
        }
    }
}