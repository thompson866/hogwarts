public class SlytherinStudent extends hogwarts {

    private int cunning;
    private int determination;
    private int ambition;
    private int ingenuity;
    private int thirstForPower;

    public SlytherinStudent(String name, int magic, int transgression, int cunning, int determination, int ambition, int ingenuity, int thirstForPower) {
        super(name, magic, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.ingenuity = ingenuity;
        this.thirstForPower = thirstForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getIngenuity() {
        return ingenuity;
    }

    public void setIngenuity(int ingenuity) {
        this.ingenuity = ingenuity;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    public void setThirstForPower(int thirstForPower) {
        this.thirstForPower = thirstForPower;
    }

    private int ability() {
        return cunning + determination + ambition + ingenuity + thirstForPower;
    }

    public void compareSlytherin(SlytherinStudent slytherinStudent) {
        int ability1 = ability();
        int ability2 = slytherinStudent.ability();
        if (ability1 > ability2) {
            System.out.println("Слизеринец " + getName() + " лучше, чем слизеринец " + slytherinStudent.getName() + " счет :" + ability1 + ":" + ability2);
        } else if (ability2 > ability1) {
            System.out.println("Слизеринец " + slytherinStudent.getName() + " лучше, чем слизеринец " + getName() + " счет :" + ability1 + ":" + ability2);
        } else {
            System.out.println("Слизеринец " + getName() + " такой же, как слизеринец " + slytherinStudent.getName() + " счет :" + ability1 + ":" + ability2);

            ;
        }
    }

    @Override
    public String toString() {
        return String.format(super.toString() + "; хитрость: " + cunning + "; решительность:" + determination + "; амбициозность:" + ambition + "; находчивость:" + ingenuity + "; жажда власти:" + thirstForPower);
    }

    public static class GriffindorStudent {
    }
}
