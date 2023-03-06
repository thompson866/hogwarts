public abstract class hogwarts {

    private String name;
    private int magic;
    private int transgression;

    public hogwarts(String name, int magic, int transgression) {
        this.name = name;
        this.magic = magic;
        this.transgression = transgression;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }

    private int ability() {
        return magic + transgression;
    }

    public void print() {
        System.out.println(this);
    }

    public void compareHogwarts(hogwarts hogwartsStudent) {
        int ability1 = ability();
        int ability2 = hogwartsStudent.ability();
        if (ability1 > ability2) {
            System.out.println("Студент " + getName() + " лучше, чем студент " + hogwartsStudent.getName() + " "+ ability1 + " : " + ability2);
        } else if (ability2 > ability1) {
            System.out.println("Студент " + hogwartsStudent.getName() + " лучше, чем студент " + getName() + " "+ ability1 + " : " + ability2);
        } else {
            System.out.println("Студент " + hogwartsStudent.getName() + " такой же, как " + getName() + " "+ ability1 + " : " + ability2);
        }
    }

    @Override
    public String toString() {
        return String.format("Студент " + name + "; сила магии: " + magic + "; сила трансгрессии: " + transgression);
    }

}

