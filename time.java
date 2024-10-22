public class time {
    private int ti;

    public time(int ti) {
        this.ti = ti;
    }

    public String tosrt() {
        if (ti > 86399) {
            ti = ti % 86400;
            return ti / 3600 + ":" + ti % 3600 / 60 + ":" + ti % 3600 % 60;
        } else
            return ti / 3600 + ":" + ti % 3600 / 60 + ":" + ti % 3600 % 60;
    }
}


