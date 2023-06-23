public class Main {
    public static void main(String[] args) {
        int vasyaAge = 24;
        int katyaAge = 24;
        int mishaAge = 24;

        int min = -1;
        int middle = -1;
        int max = -1;

        if (vasyaAge <= katyaAge && vasyaAge <= mishaAge) {
            min = vasyaAge;
            if (katyaAge <= mishaAge) {
                middle = katyaAge;
                max = mishaAge;
            } else if (mishaAge <= katyaAge) {
                middle = mishaAge;
                max = katyaAge;
            } else {
                middle = katyaAge;
                max = mishaAge;
            }
        } else if (katyaAge <= vasyaAge && katyaAge <= mishaAge) {
            min = katyaAge;
            if (vasyaAge <= mishaAge) {
                middle = vasyaAge;
                max = mishaAge;
            } else if (mishaAge <= vasyaAge) {
                middle = mishaAge;
                max = vasyaAge;
            } else {
                middle = vasyaAge;
                max = mishaAge;
            }
        } else {
            min = mishaAge;
            if (vasyaAge <= katyaAge) {
                middle = vasyaAge;
                max = katyaAge;
            } else if (katyaAge <= vasyaAge) {
                middle = katyaAge;
                max = vasyaAge;
            } else {
                middle = vasyaAge;
                max = katyaAge;
            }
        }
        boolean limit = min >= 0 && max <= 120;
        if (limit) {
            System.out.println("Minimal age: " + min);
            System.out.println("Middle age: " + middle);
            System.out.println("Maximal age: " + max);
        } else
            System.out.println("probably the meaning of age");
    }
}
