package Java_8.OOP.Nested_Inner_Classes.BuilderPattern;

public class Computer {
    private String ssd;
    private String ram;

    private boolean isGraphicCardEnabled;
    private boolean isBluetoothEnabled;

    public String getSsd() {
        return ssd;
    }

    public void setSsd(String ssd) {
        this.ssd = ssd;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public boolean isGraphicCardEnabled() {
        return isGraphicCardEnabled;
    }

    public void setGraphicCardEnabled(boolean graphicCardEnabled) {
        isGraphicCardEnabled = graphicCardEnabled;
    }

    public boolean isBluetoothEnabled() {
        return isBluetoothEnabled;
    }

    public void setBluetoothEnabled(boolean bluetoothEnabled) {
        isBluetoothEnabled = bluetoothEnabled;
    }

    @Override
    public String toString() {
        return "Computer details -> " + "ssd=" + ssd + " ram=" + ram +
                " isGraphicCardEnabled=" + isGraphicCardEnabled +
                ", isBluetoothEnabled=" + isBluetoothEnabled;
    }

    private Computer(ComputerBuilder cb) {
        this.ssd = cb.ssd;
        this.ram = cb.ram;
        this.isGraphicCardEnabled = cb.isGraphicCardEnabled;
        this.isBluetoothEnabled = cb.isBluetoothEnabled;
    }

    public static class ComputerBuilder{
        private String ssd;
        private String ram;

        private boolean isGraphicCardEnabled;
        private boolean isBluetoothEnabled;

        public ComputerBuilder(String ssd, String ram) {
            this.ssd = ssd;
            this.ram = ram;
        }

        public ComputerBuilder isBluetoothEnabled(boolean isBluetoothEnabled) {
            this.isBluetoothEnabled=isBluetoothEnabled;
            return this;
        }

        public ComputerBuilder isGraphicCardEnabled(boolean isGraphicCardEnabled) {
            this.isGraphicCardEnabled=isGraphicCardEnabled;
            return this;
        }

        public Computer build(){
            return new Computer(this);
        }
    }
}
class TestBuilderPattern{
    public static void main(String[] args) {
        Computer cb=new Computer.ComputerBuilder("512","16")
                .isGraphicCardEnabled(false).isBluetoothEnabled(true).build();
        System.out.println(cb);

        Computer cb2=new Computer.ComputerBuilder("1TB","12")
                .isGraphicCardEnabled(true).isBluetoothEnabled(true).build();
        System.out.println(cb2);
    }
}
