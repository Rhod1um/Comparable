public class Cake implements Comparable<Cake> {
    private String name;
    private int weight;

    Cake(String name, int weigth){
        this.name=name;
        this.weight=weigth;
    }
    public String getName(){
        return name;
    }

    public int getWeight(){
        return weight;
    }


    //kager sorteres efter alfabetisk rækkefølge
    //@Override  //hedder other fordi man sammenligner med "den anden/den næste"
    //public int compareTo(Cake other) { //bare skriv com så kommer den frem når den implementere Comparable
        //if (this.name < other.name)//med simple datatyper ville man gøre det sådan her
        //if (this.name.compareTo(other.name) < 0) //at den er mindre end nul betyder bogstavet ligger lavere i alfabetet. compareTo STRING metoden går selv videre til næste bogstav hvis de første er ens
            //return -1;
        //else if (this.name.compareTo(other.name) > 0)
            //return 1;
        //else return 0;
        //her er ifferne skrevet ud, men compareTo returnere selv de tal alt efter størrelse
        //return this.name.compareTo(other)

        //er det ens returneres 0
        //er den 1 er den første større end den næste?
        //og omvendt når den returnere -1
        //der er kun de tre muligheder
    //}

    //kan kun have én compareTo metoden
    public int compareTo(Cake other){
        return this.weight - other.weight; //giver mindste tal først
        //for hvis this.weight er størst returnere den et tal højere end 0 og bytter om?
        //return other.weight - this.weight; giver største tal først
    }
    //er det første størst skal man have tal større end 0?



    @Override
    public String toString() {
        return "Cake{" +
                "name='" + weight + '\'' +
                '}';
    }
}
