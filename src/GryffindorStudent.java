public class GryffindorStudent extends hogwarts {

    private int nobility;
    private int honor;
    private int bravery;

    public GryffindorStudent(String name, int magic, int transgression, int nobility, int honor, int bravery) {
        super(name, magic, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public void compareGriffindor(GryffindorStudent gryffindorStudent) {
        int ability1 = ability();
        int ability2 = gryffindorStudent.ability();
        if (ability1 > ability2) {
            System.out.println("Гриффиндорец " + gryffindorStudent.getName()+ " лучше, чем гриффиндорец " + getName() + " счет " +  ability1 +":" +ability2);

        } else if (ability2 > ability1) {
            System.out.println("Гриффиндорец " +getName() + " лучше, чем гриффиндорец " + gryffindorStudent.getName() + " счет " +  ability1 +":" +ability2);
        } else {
            System.out.println("Гриффиндорец " +getName() + " такой же, как гриффиндорец " + gryffindorStudent.getName() + " счет " +  ability1 +":" +ability2);

        }
    }

    private int ability() {
        return nobility + honor + bravery;
    }

    @Override
    public String toString() {
        return String.format(super.toString()+"; благородство:" + nobility + "; честь: " + honor + "; храбрость: " + bravery);
    }

}