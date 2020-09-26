package BaiTapKt1.BaiTap8;

public class City implements Comparable<City>{
    private int id;
    private String name;
    private int population;
    private String countrycode;
    Country country;

    public City(int id, String name, int population, String countrycode) {
        this.id = id;
        this.name = name;
        this.population = population;
        this.countrycode = countrycode;
    }

    public City() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getCountrycode() {
        return countrycode;
    }

    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode;
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", population=" + population +
                ", countrycode='" + countrycode + '\'' +
                '}';
    }

    @Override
    public int compareTo(City o) {
        if(this.getPopulation() > o.getPopulation()) return 1;
        else if(this.getPopulation() < o.getPopulation()) return -1;
        else return 0;
    }
}
