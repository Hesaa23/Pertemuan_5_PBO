package tugas_pbo3;
public class Matematika implements InterfaceMtk {

    @Override
    public void pertambahan(int a, int b) {
        System.out.println("Pertambahan\t : " + (a + b));
    }

    @Override
    public void pengurangan(int a, int b) {
        System.out.println("Pengurangan\t : " + (a - b));
    
    }

    @Override
    public void perkalian(int a, int b) {
        System.out.println("Perkalian\t : " + (a * b));
    }

    @Override
    public void pembagian(int a, int b) {
        System.out.println("Pembagian\t : " + (a / b));
    }

}
