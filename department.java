import java.util.ArrayList;
public class department{
    private ArrayList<String> wks= new ArrayList<>();
    private String nme;
    private String mng;

    public department(String nme){
        this.nme=nme;

    }
    public void addWorker(String wrk){
        wks.add(wrk);
    }
    public void makeManager(String nm){
        for(int i=0;i<wks.size();i++){
            if (nm.equals( wks.get(i))){
                this.mng = nm;
                break;

            }
        }
    }
    public String employes(String nme){
        String str = wks.get(0);
        boolean r=false;
        for (int i = 1; i < wks.size(); i++){
            str= str +", "+ wks.get(i);
            if (nme.equals(wks.get(i)))
                r=true;
        }
        if (r)
            return ("Список сотрулников департамента: "+str+".");
        else
            return ("В данном отделе такого сотрудника нет, попробуйте проверить другой отдел.");
    }

    public String tostr() {
        String str = wks.get(0);
        for (int i = 1; i < wks.size(); i++){
            str= str +", "+ wks.get(i);
        }

        return ("Название департамента: "+nme+". Начальник департамента: "+mng+". Список сотрудников департамента: "+str+".");
    }
}
