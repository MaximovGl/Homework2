    import java.util.Scanner;
    public class Main {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            Main m = new Main();
            int a;
            String s;
            System.out.println("Выберите задание: ");
            a = in.nextInt();
           switch (a){
               case 1:
                   System.out.println("Введите время в секундах(целым числом):");a=m.intcheck();
                   time t1 = new time(a);
                   System.out.println("Введите время в секундах(целым числом):");a=m.intcheck();
                   time t2 = new time(a);
                   System.out.println("Введите время в секундах(целым числом):");a=m.intcheck();
                   time t3 = new time(a);
                   s= t1.tosrt();
                   System.out.println(s);
                   s= t2.tosrt();
                   System.out.println(s);
                   s= t3.tosrt();
                   System.out.println(s);
                   break;
               case 2:
                   System.out.println("Введите число этажей дома(целым положитлеьным числом):");a=m.nonegcheck(m.intcheck());
                   house h1 = new house(a);
                   System.out.println("Введите число этажей дома(целым положитлеьным числом):");a=m.nonegcheck(m.intcheck());
                   house h2 = new house(a);
                   System.out.println("Введите число этажей дома(целым положитлеьным числом):");a=m.nonegcheck(m.intcheck());
                   house h3 = new house(a);
                   s= h1.tosrt();
                   System.out.println(s);
                   s= h2.tosrt();
                   System.out.println(s);
                   s= h3.tosrt();
                   System.out.println(s);
                   break;
               case 3:
                   System.out.println("Введите название департамента:");s = in.next();department IT = new department(s);
                   System.out.println("Введите имя сотрудника: ");s = in.next();IT.addWorker(s);
                   System.out.println("Введите имя сотрудника: ");s = in.next();IT.addWorker(s);
                   System.out.println("Введите имя сотрудника: ");s = in.next();IT.addWorker(s);
                   System.out.println("Введите имя начальника: ");s = in.next();IT.makeManager(s);
                   System.out.println(IT.tostr());
                   break;
               case 4:
                   System.out.println("Введите название департамента:");s = in.next();department TI = new department(s);
                   System.out.println("Введите имя сотрудника: ");s = in.next();TI.addWorker(s);
                   System.out.println("Введите имя сотрудника: ");s = in.next();TI.addWorker(s);
                   System.out.println("Введите имя сотрудника: ");s = in.next();TI.addWorker(s);
                   System.out.println("Введите имя сотрудника: ");s = in.next();System.out.println(TI.employes(s));
                   break;
               case 5:
                   System.out.println("Введите число этажей дома(целым положитлеьным числом):");a=m.nonegcheck(m.intcheck());
                   house h4 = new house(a);
                   System.out.println("Введите число этажей дома(целым положитлеьным числом):");a=m.nonegcheck(m.intcheck());
                   house h5 = new house(a);
                   System.out.println("Введите число этажей дома(целым положитлеьным числом):");a=m.nonegcheck(m.intcheck());
                   house h6 = new house(a);
                   s= h4.tosrt();
                   System.out.println(s);
                   s= h5.tosrt();
                   System.out.println(s);
                   s= h6.tosrt();
                   System.out.println(s);
                   break;
               case 6:
                   System.out.println("Введите патронеов в пистолете(целым положитлеьным числом):");a=m.nonegcheck(m.intcheck());
                   pistol p1= new pistol(a);
                   System.out.println("Введите число выстрелов ис питсолета(целым положитлеьным числом):");a=m.nonegcheck(m.intcheck());
                   p1.shoot(a);
                   break;
           }
        }
        public int intcheck(){
            Scanner in = new Scanner(System.in);
            int a=0;
            if (in.hasNextInt()) {
                a = in.nextInt();
                return(a);
            }
            else {
                System.out.println("Вы ввели не целое число.");
                return (0);
            }
        }
        public int nonegcheck(int a){
            if(a>=0)
                return(a);
            else{
                System.out.println("Вы ввели отрицательное число.");
                return (0);
            }
        }
        public String strcheck(){
            Scanner in = new Scanner(System.in);
            String s=" ";
            if (in.hasNextLine()) {
                s = in.nextLine();
                return(s);
            }
            else {
                System.out.println("Вы ввели не целое число.");
                return ("");
            }
        }
    }
