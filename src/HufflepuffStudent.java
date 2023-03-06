public class HufflepuffStudent extends hogwarts {

    private int diligence;
    private int loyalty;
    private int honesty;

    public HufflepuffStudent(String name, int magic, int transgression, int diligence, int loyalty, int honesty) {
        super(name, magic, transgression);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getDiligence() {
        return diligence;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    private int ability() {
        return diligence + loyalty + honesty;
    }

    public void compareHufflepuff(HufflepuffStudent hufflepuffStudent) {
        int ability1 = ability();
        int ability2 = hufflepuffStudent.ability();
        if (ability1 > ability2) {
            System.out.println("Пуффендуец " + getName() +" лучше, чем пуффендуец" +hufflepuffStudent.getName() + " счет :" + ability1 +":"+ ability2);
        } else if (ability2 > ability1) {
            System.out.println("Пуффендуец " +hufflepuffStudent.getName()  +" лучше, чем пуффендуец" +getName() + " счет :" + ability1 +":"+ ability2);
        } else {
            System.out.println("Пуффендуец " + hufflepuffStudent.getName() + " такой же, как пуффендуец"+ getName() + "счет :"+ ability1+":"+ability2);
        }
    }

    @Override
    public String toString() {
        return String.format(super.toString() +" трудолюбие: " +diligence+"; верность:"+ loyalty+ "; честность: "+honesty);
    }

}