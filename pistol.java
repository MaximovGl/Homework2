public class pistol {
    private int bul;

    public pistol(int bul) {
        this.bul = bul;
    }

    public pistol() {
        this.bul = 5;
    }

    public void shoot(int sh) {
        while (this.bul > 0) {
            System.out.println("Бах!");
            this.bul = this.bul - 1;
            sh = sh - 1;
        }
        while (sh > 0) {
            System.out.println("Клац!");
            sh = sh - 1;
        }
    }

    public String tostr() {
        return ("Колличество оставшихся патронов: " + bul + ".");
    }
}
