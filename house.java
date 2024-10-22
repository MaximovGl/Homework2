public class house {
    private final int fl;

    public house(int fl){
        this.fl=fl;
    }

    public String tosrt(){
        if (fl%10==1)
            return "Дом с "+fl+" этажем";
        else
            return "Дом с "+fl+" этажами";
    }
}
