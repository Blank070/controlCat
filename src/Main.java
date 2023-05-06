import java.util.Formatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Jaster jaster = new Jaster();
        Poppy poppy = new Poppy();
        Peach peach = new Peach();
        NewDog newDog = new NewDog();
        start(jaster, peach, poppy,newDog);
    }
    static void cat(Jaster jaster, Peach peach, Poppy poppy){
        poppy.setMood((int)(poppy.getMood()+Math.random()*100));
        poppy.setSatiety((int)(poppy.getSatiety()+Math.random()*100));
        poppy.setHealth((int)(poppy.getHealth()+Math.random()*100));
        jaster.setMood((int)(jaster.getMood()+Math.random()*100));
        jaster.setSatiety((int)(jaster.getSatiety()+Math.random()*100));
        jaster.setHealth((int)(jaster.getHealth()+Math.random()*100));
        peach.setMood((int)(peach.getMood()+Math.random()*100));
        peach.setSatiety((int)(peach.getSatiety()+Math.random()*100));
        peach.setHealth((int)(peach.getHealth()+Math.random()*100));
        jaster.setAge(1+(int) (jaster.getAge()+Math.random()*18));
        poppy.setAge(1+(int)(poppy.getAge()+Math.random()*18));
        peach.setAge(1+(int)(peach.getAge()+Math.random()*18));

    }
    public static void start(Jaster jaster, Peach peach, Poppy poppy, NewDog newDog){
        cat(jaster, peach, poppy);
        table(jaster, peach, poppy, newDog);
        System.out.println("Покормить - 1");
        System.out.println("Поиграть - 2");
        System.out.println("К ветеренару - 3");
        System.out.println("Завести нового кота - 4");
        System.out.println("Следующий день - 5");
        Scanner console = new Scanner(System.in);
        int choose = console.nextInt();
        if(choose==4){
            newDog.setChoose(choose+ newDog.getChoose());
            newCat(jaster, peach, poppy, newDog);
        }else if(choose ==1) {
            feed(jaster, peach, poppy, newDog);
        }else if (choose==2){
            game(jaster, peach, poppy, newDog);
        }else if(choose==3){
            health(jaster, peach, poppy, newDog);
        }else if (choose==5){
            nextDay(jaster, peach, poppy, newDog);
        }
    }
    public static void newCat(Jaster jaster, Peach peach, Poppy poppy,NewDog newDog) {
        System.out.println("Введите имя кота");
        Scanner console = new Scanner(System.in);
        String name = console.nextLine();
        newDog.setNameDog(name);
        System.out.println(newDog.getNameDog());
        newDog.setAgeDog(1 +(int) (newDog.getAgeDog()+Math.random()*18));
        newDog.setMood(20 + (int)(newDog.getMood()+Math.random()*80));
        newDog.setSatiety(20+ (int)(newDog.getSatiety()+Math.random()*80));
        newDog.setHealth(20+ (int)(newDog.getHealth()+Math.random()*80));
        int average3 = newDog.getMood()+ newDog.getSatiety()+ newDog.getHealth();
        int averageNew = average3/3;
        Formatter fmt = new Formatter();
        fmt.format("%15s %15s %15s %15s %15s\n", "Name", "age", "Nast","syt","srednee" );
        fmt.format("%15s %13s %13s %16s %11s\n", newDog.getNameDog(), newDog.getAgeDog(), newDog.getMood(), newDog.getSatiety(), averageNew);
        System.out.println(fmt);
        table(jaster,peach,poppy,newDog);
    }
    public static void table(Jaster jaster, Peach peach, Poppy poppy, NewDog newDog) {
        int average = jaster.getMood()+ jaster.getSatiety()+ jaster.getHealth();
        int averageJaster = average/3;
        int average1 = poppy.getMood()+ poppy.getSatiety()+ poppy.getHealth();
        int averagePoppy = average1/3;
        int average2 = peach.getMood()+ peach.getSatiety()+ peach.getHealth();
        int averagePeach = average2/3;
        int average3 = newDog.getMood()+ newDog.getSatiety()+ newDog.getHealth();
        int averageNew = average3/3;
        Formatter fmt = new Formatter();
        if (newDog.getChoose()==4){
            fmt.format("%15s %15s %15s %15s %15s\n", "Name", "Age", "Mood","Satiety","Average" );
            fmt.format("%17s %13s %13s %16s %11s\n", "1 "+jaster.name, jaster.getAge(), jaster.getMood(), jaster.getSatiety(), averageJaster);
            fmt.format("%16s %14s %13s %16s %11s\n", "2 "+peach.name, peach.getAge(), peach.getMood(), peach.getSatiety(), averagePeach);
            fmt.format("%16s %14s %13s %16s %11s\n", "3 "+poppy.name, poppy.getAge(), poppy.getMood(), poppy.getSatiety(), averagePoppy);
            fmt.format("%16s %14s %13s %16s %11s\n", "4 "+newDog.getNameDog(), newDog.getAgeDog(), newDog.getMood(), newDog.getSatiety(), averageNew);
            System.out.println(fmt);
        }else {
            fmt.format("%15s %15s %15s %15s %15s\n", "Name", "Age", "Mood","Satiety","Average" );
            fmt.format("%17s %13s %13s %16s %11s\n", "1 "+jaster.name, jaster.getAge(), jaster.getMood(), jaster.getSatiety(), averageJaster);
            fmt.format("%16s %14s %13s %16s %11s\n", "2 "+peach.name, peach.getAge(), peach.getMood(), peach.getSatiety(), averagePeach);
            fmt.format("%16s %14s %13s %16s %11s\n", "3 "+poppy.name, poppy.getAge(), poppy.getMood(), poppy.getSatiety(), averagePoppy);
            System.out.println(fmt);
        }



    }
    public static void feed(Jaster jaster, Peach peach, Poppy poppy, NewDog newDog){
        System.out.println("Выберите кота");
        table(jaster, peach, poppy, newDog);
        Scanner console = new Scanner(System.in);
        int feed = console.nextInt();
        if(feed ==1){
            jaster.setSatiety(jaster.getSatiety()+5);
            jaster.setHealth(jaster.getHealth()+5);
            table(jaster, peach, poppy, newDog);
            start(jaster, peach, poppy, newDog);
        }else if(feed ==2){
            peach.setSatiety(peach.getSatiety()+5);
            peach.setHealth(peach.getHealth()+5);
            table(jaster, peach, poppy, newDog);
            start(jaster, peach, poppy, newDog);
        }else if (feed==3){
            poppy.setSatiety(poppy.getSatiety()+5);
            poppy.setHealth(poppy.getHealth()+5);
            table(jaster, peach, poppy, newDog);
            start(jaster, peach, poppy, newDog);
        }else if (feed==4){
            newDog.setSatiety(newDog.getSatiety()+5);
            table(jaster, peach, poppy, newDog);
            start(jaster, peach, poppy, newDog);
        }
    }
    public static void game(Jaster jaster, Peach peach, Poppy poppy, NewDog newDog){
        System.out.println("Выберите кота");
        table(jaster, peach, poppy, newDog);
        Scanner console = new Scanner(System.in);
        int feed = console.nextInt();
        if(feed ==1){
            if (jaster.getAge()>6){
                jaster.setHealth(jaster.getHealth()+7);
                jaster.setMood(jaster.getMood()+7);
                jaster.setSatiety(jaster.getSatiety()-3);
                table(jaster, peach, poppy, newDog);
                start(jaster, peach, poppy, newDog);
            }else if (jaster.getAge()>11||jaster.getAge()<5){
                jaster.setHealth(jaster.getHealth()+5);
                jaster.setSatiety(jaster.getSatiety()-5);
                jaster.setMood(jaster.getMood()+5);
                table(jaster, peach, poppy, newDog);
                start(jaster, peach, poppy, newDog);
            }else {
                jaster.setHealth(jaster.getHealth()+4);
                jaster.setSatiety(jaster.getSatiety()-6);
                jaster.setMood(peach.getMood()+4);
                table(jaster, peach, poppy, newDog);
                start(jaster, peach, poppy, newDog);
            }
        }else if(feed ==2){
            if (peach.getAge()>6){
                peach.setHealth(peach.getHealth()+7);
                peach.setSatiety(peach.getSatiety()-3);
                peach.setMood(peach.getMood()+7);
                table(jaster, peach, poppy, newDog);
                start(jaster, peach, poppy, newDog);
            }else if (peach.getAge()>11||peach.getAge()<5){
                peach.setHealth(peach.getHealth()+5);
                peach.setSatiety(peach.getSatiety()-5);
                peach.setMood(peach.getMood()+5);
                table(jaster, peach, poppy, newDog);
                start(jaster, peach, poppy, newDog);
            }else {
                peach.setHealth(peach.getHealth()+4);
                peach.setSatiety(peach.getSatiety()-6);
                peach.setMood(peach.getMood()+4);
                table(jaster, peach, poppy, newDog);
                start(jaster, peach, poppy, newDog);
            }
        }else if (feed==3){
            if (poppy.getAge()>6){
                poppy.setHealth(poppy.getHealth()+7);
                poppy.setSatiety(poppy.getSatiety()-3);
                poppy.setMood(poppy.getMood()+7);
                table(jaster, peach, poppy, newDog);
                start(jaster, peach, poppy, newDog);
            }else if (poppy.getAge()>11||poppy.getAge()<5){
                poppy.setHealth(poppy.getHealth()+5);
                poppy.setSatiety(poppy.getSatiety()-5);
                poppy.setMood(poppy.getMood()+5);
                table(jaster, peach, poppy, newDog);
                start(jaster, peach, poppy, newDog);
            }else {
                poppy.setHealth(poppy.getHealth()+4);
                poppy.setSatiety(poppy.getSatiety()-6);
                poppy.setMood(poppy.getMood()+4);
                table(jaster, peach, poppy, newDog);
                start(jaster, peach, poppy, newDog);
            }
        }else if (feed==4){
            if (newDog.getAgeDog()>6){
                newDog.setHealth(newDog.getHealth()+7);
                newDog.setSatiety(newDog.getSatiety()-3);
                newDog.setMood(newDog.getMood()+7);
                table(jaster, peach, poppy, newDog);
                start(jaster, peach, poppy, newDog);
            }else if (newDog.getAgeDog()>11||newDog.getAgeDog()<5){
                newDog.setHealth(newDog.getHealth()+5);
                newDog.setSatiety(newDog.getSatiety()-5);
                newDog.setMood(newDog.getMood()+5);
                table(jaster, peach, poppy, newDog);
                start(jaster, peach, poppy, newDog);
            }else {
                newDog.setHealth(newDog.getHealth()+4);
                newDog.setSatiety(newDog.getSatiety()-6);
                newDog.setMood(newDog.getMood()+4);
                table(jaster, peach, poppy, newDog);
                start(jaster, peach, poppy, newDog);
            }
        }
    }
    public static void health(Jaster jaster, Peach peach, Poppy poppy, NewDog newDog){
        System.out.println("Выберите кота");
        table(jaster, peach, poppy, newDog);
        Scanner console = new Scanner(System.in);
        int feed = console.nextInt();
        if(feed ==1){
            if (jaster.getAge()>6){
                jaster.setHealth(jaster.getHealth()+7);
                jaster.setSatiety(jaster.getSatiety()-3);
                jaster.setMood(jaster.getMood()-3);
                table(jaster, peach, poppy, newDog);
                start(jaster, peach, poppy, newDog);
            }else if (jaster.getAge()>11||jaster.getAge()<5){
                jaster.setHealth(jaster.getHealth()+5);
                jaster.setSatiety(jaster.getSatiety()-5);
                jaster.setMood(jaster.getMood()-5);
                table(jaster, peach, poppy, newDog);
                start(jaster, peach, poppy, newDog);
            }else {
                jaster.setHealth(jaster.getHealth()+4);
                jaster.setSatiety(jaster.getSatiety()-6);
                jaster.setMood(peach.getMood()-6);
                table(jaster, peach, poppy, newDog);
                start(jaster, peach, poppy, newDog);
            }
        }else if(feed ==2){
            if (peach.getAge()>6){
                peach.setHealth(peach.getHealth()+7);
                peach.setSatiety(peach.getSatiety()-3);
                peach.setMood(peach.getMood()-3);
                table(jaster, peach, poppy, newDog);
                start(jaster, peach, poppy, newDog);
            }else if (peach.getAge()>11||peach.getAge()<5){
                peach.setHealth(peach.getHealth()+5);
                peach.setSatiety(peach.getSatiety()-5);
                peach.setMood(peach.getMood()-5);
                table(jaster, peach, poppy, newDog);
                start(jaster, peach, poppy, newDog);
            }else {
                peach.setHealth(peach.getHealth()+4);
                peach.setSatiety(peach.getSatiety()-6);
                peach.setMood(peach.getMood()-6);
                table(jaster, peach, poppy, newDog);
                start(jaster, peach, poppy, newDog);
            }

        }else if (feed==3){
            if (poppy.getAge()>6){
                poppy.setHealth(poppy.getHealth()+7);
                poppy.setSatiety(poppy.getSatiety()-3);
                poppy.setMood(poppy.getMood()-3);
                table(jaster, peach, poppy, newDog);
                start(jaster, peach, poppy, newDog);
            }else if (poppy.getAge()>11||poppy.getAge()<5){
                poppy.setHealth(poppy.getHealth()+5);
                poppy.setSatiety(poppy.getSatiety()-5);
                poppy.setMood(poppy.getMood()-5);
                table(jaster, peach, poppy, newDog);
                start(jaster, peach, poppy, newDog);
            }else {
                poppy.setHealth(poppy.getHealth()+4);
                poppy.setSatiety(poppy.getSatiety()-6);
                poppy.setMood(poppy.getMood()-6);
                table(jaster, peach, poppy, newDog);
                start(jaster, peach, poppy, newDog);
            }
        }else if (feed==4){
            if (newDog.getAgeDog()>6){
                newDog.setHealth(newDog.getHealth()+7);
                newDog.setSatiety(newDog.getSatiety()-3);
                newDog.setMood(newDog.getMood()-3);
                table(jaster, peach, poppy, newDog);
                start(jaster, peach, poppy, newDog);
            }else if (newDog.getAgeDog()>11||newDog.getAgeDog()<5){
                newDog.setHealth(newDog.getHealth()+5);
                newDog.setSatiety(newDog.getSatiety()-5);
                newDog.setMood(newDog.getMood()-5);
                table(jaster, peach, poppy, newDog);
                start(jaster, peach, poppy, newDog);
            }else {
                newDog.setHealth(newDog.getHealth()+4);
                newDog.setSatiety(newDog.getSatiety()-6);
                newDog.setMood(newDog.getMood()-6);
                table(jaster, peach, poppy, newDog);
                start(jaster, peach, poppy, newDog);
            }
        }
    }
    public static void nextDay(Jaster jaster, Peach peach, Poppy poppy, NewDog newDog){
        jaster.setSatiety(jaster.getSatiety()- (1+(int)(Math.random()*5)));
        jaster.setMood(jaster.getMood()- (3-(int)(Math.random()*3)));
        jaster.setHealth(jaster.getHealth()- (3-(int)(Math.random()*5)));
        peach.setSatiety(peach.getSatiety()- (1+(int)(Math.random()*5)));
        peach.setMood(peach.getMood()- (3-(int)(Math.random()*3)));
        peach.setHealth(peach.getHealth()- (3-(int)(Math.random()*5)));
        poppy.setSatiety(poppy.getSatiety()- (1+(int)(Math.random()*5)));
        poppy.setMood(poppy.getMood()- (3-(int)(Math.random()*3)));
        poppy.setHealth(poppy.getHealth()- (3-(int)(Math.random()*5)));
        newDog.setSatiety(newDog.getSatiety()- (1+(int)(Math.random()*5)));
        newDog.setMood(newDog.getMood()- (3-(int)(Math.random()*3)));
        newDog.setHealth(newDog.getHealth()- (3-(int)(Math.random()*5)));
        table(jaster, peach, poppy, newDog);
    }
    //Сытость: уменьшается на случайное значение в диапазоне от 1 до 5.
    //
    //Настроение: меняется на случайное значение в диапазоне от -3 до +3.
    //
    //Здоровье: меняется на случайное значение в диапазоне от -3 до +3.
}