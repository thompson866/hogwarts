import java.util.Random;

public class Main {

    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        GryffindorStudent harry = generateGryffindorStudent("Гарри Поттер");
        GryffindorStudent ron = generateGryffindorStudent("Рон Уизли");
        GryffindorStudent germiona = generateGryffindorStudent("Гермиона Грейнджер");
        SlytherinStudent draco = generateSlytherinStudent("Драко Малфой");
        SlytherinStudent grekham = generateSlytherinStudent("Грэхэм Монтегю");
        SlytherinStudent gregory = generateSlytherinStudent("Грегори Гойл");
        RavenclawStudent chou = generateRavenclawStudent("Чжоу Чанг");
        RavenclawStudent padma = generateRavenclawStudent("Падма Патил");
        RavenclawStudent marcus = generateRavenclawStudent("Маркус Белби");
        HufflepuffStudent cedric = generateHufflepuffStudent("Седрик Диггори");
        HufflepuffStudent zahariya = generateHufflepuffStudent("Захария Смит");
        HufflepuffStudent justin = generateHufflepuffStudent(" Джастин Финч-Флетчли");



        harry.print();
        ron.print();
        germiona.print();
        chou.print();
        padma.print();
        marcus.print();
        draco.print();
        grekham.print();
        gregory.print();
        cedric.print();
        zahariya.print();
        justin.print();


        harry.compareGriffindor(germiona);
        germiona.compareHogwarts(chou);
    }

    private static GryffindorStudent generateGryffindorStudent(String name) {
        return new GryffindorStudent(
                name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    }

    private static RavenclawStudent generateRavenclawStudent(String name) {
        return new RavenclawStudent(
                name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),

                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    }

    private static HufflepuffStudent generateHufflepuffStudent(String name) {
        return new HufflepuffStudent(
                name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    }

    private static SlytherinStudent generateSlytherinStudent(String name) {
        return new SlytherinStudent(
                name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    }

}