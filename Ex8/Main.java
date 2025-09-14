public class Main {
    public static void main(String[] args) {

        Carro carro = new Carro();
        carro.setMarca("Honda");
        carro.setModelo("Civic");
        carro.setAno(2020);
        carro.setValorBase(80000.0);
        carro.setQtdPortas(4);
        
        Moto moto = new Moto();
        moto.setMarca("Yamaha");
        moto.setModelo("MT-07");
        moto.setAno(2022);
        moto.setValorBase(45000.0);
        moto.setCilindradas(689);
        
        System.out.println("Carro: " + carro.getMarca() + " " + carro.getModelo() + " (" + carro.getAno() + ")");
        System.out.println("Valor Base: R$ " + carro.getValorBase());
        System.out.println("Valor de Revenda: R$ " + String.format("%.2f", carro.calcularValorRevenda()));
        System.out.println();
        
        System.out.println("Moto: " + moto.getMarca() + " " + moto.getModelo() + " (" + moto.getAno() + ")");
        System.out.println("Valor Base: R$ " + moto.getValorBase());
        System.out.println("Valor de Revenda: R$ " + String.format("%.2f", moto.calcularValorRevenda()));
    }
}