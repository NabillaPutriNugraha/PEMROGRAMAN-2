package soal2;

public class Country {
    private String name;
    private String leadership;
    private String leader;
    private int independenceDay;
    private int independenceMonth;
    private int independenceYear;

    public Country(String name, String leadership, String leader, int independenceDay, int independenceMonth, int independenceYear) {
        this.name = name;
        this.leadership = leadership;
        this.leader = leader;
        this.independenceDay = independenceDay;
        this.independenceMonth = independenceMonth;
        this.independenceYear = independenceYear;
    }

    public Country(String name, String leadership, String leader) {
        this.name = name;
        this.leadership = leadership;
        this.leader = leader;
    }

    public String getName() {
        return name;
    }

    public String getLeadership() {
        return leadership;
    }

    public String getLeader() {
        return leader;
    }

    public int getIndependenceDay() {
        return independenceDay;
    }

    public int getIndependenceMonth() {
        return independenceMonth;
    }

    public int getIndependenceYear() {
        return independenceYear;
    }

    public void info(String monthName) {
        if (leadership.equalsIgnoreCase("Monarki")) {
            System.out.println("Negara " + name + " mempunyai Raja bernama " + leader);
        } else {
            System.out.println("Negara " + name + " mempunyai " + leadership + " bernama " + leader);
            System.out.println("Deklarasi Kemerdekaan pada Tanggal " + independenceDay + " " + monthName + " " + independenceYear);
        }
        System.out.println();
    }
}
