class Hund
{
    String name;

    Hund() {
        String[] namen = {
                "Bello", "Spike", "Doggy", "Wuffi", "Lassy", "Fips", "Rocky"
        };
        name = namen[new java.util.Random().nextInt(namen.length)];

    }

    void bellen() {
        System.out.println("Wuff, ich bin " + name);
    }

    String getName() {
        return name;
    }
}