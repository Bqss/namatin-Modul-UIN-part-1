package Bab5;

public class sa {
    public static void main(String[] args) {
        String data[][] = {
                {"ABDUL", "Kediri", "085646668991"},
                {"KUSNO", "Trenggalek", "085646668992"},
                {"PONIRAN", "Bojonegoro", "085646668999"}
        };

        System.out.println("------------------------------------------------------------------");
        System.out.println("   Nama\t\t\t    Alamat\t\t   Telepon");
        System.out.println("------------------------------------------------------------------");
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print("|  "+data[i][j]+"\t|\t");
            }
            System.out.println();
        }
    }
}
