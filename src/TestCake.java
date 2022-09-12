import java.util.ArrayList;
import java.util.Collections;

public class TestCake {
    public void go(){
        ArrayList<Cake> cakes = new ArrayList<>();

        cakes.add(new Cake("snegl",5));
        cakes.add(new Cake("jordbærtærte",4));
        cakes.add(new Cake("citronmåne",7));
        System.out.println(cakes);

        Collections.sort(cakes); //start med at hente Collections.sort. Så siger den husk at implementere Comparable
        //i Cake klassen. Og husk at lave en compareTo metode. Husk at type bestemme Comparable med <Cake>
        //ellers er det bare object og så skal man typecaste det senere i compareTo. Man kan beholde Object hvis
        //man skal sammenligne forskellige klasse-objekter

        System.out.println(cakes);
    }

    public void go2(){
        ArrayList<Cake> cakes = new ArrayList<>();

        cakes.add(new Cake("snegl",5));
        cakes.add(new Cake("jordbærtærte",4));
        cakes.add(new Cake("citronmåne",7));
        System.out.println(cakes);

        CakeByWeight cakeByWeight = new CakeByWeight(); //med comparator skal man lave en instans, det skal man ikke med comparable
        //CakeByWeitgh er comparator
        //brug comparator hvis der er mulighed for at man skal sortere flere ting
        //til eksamen bruger vi ikke comparator men comparable kan komme med som sidste spørgsmål

        Collections.sort(cakes, cakeByWeight); //comparator skal have comprarator objekt cakeByWeitgh. Lav ny klasse
        //hver gangn skal sammenlgine med noget nyt

        System.out.println(cakes);
    }

    public static void main(String[] args) {
        //new TestCake().go();
        new TestCake().go2();
    }
}
