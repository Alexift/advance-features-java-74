package org.example.oop;


class Laptop {
    private String modelName;
    private int modelNumber;
    private Double price;
    private CPU cpu;
    private RAM ram;
    private GPU gpu;

    public Laptop(String modelName, int modelNumber, Double price, CPU cpu, RAM ram, GPU gpu) {
        this.modelName = modelName;
        this.modelNumber = modelNumber;
        this.price = price;
        this.cpu = cpu;
        this.ram = ram;
        this.gpu = gpu;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(int modelNumber) {
        this.modelNumber = modelNumber;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public RAM getRam() {
        return ram;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }

    public GPU getGpu() {
        return gpu;
    }

    public void setGpu(GPU gpu) {
        this.gpu = gpu;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "modelName='" + modelName + '\'' +
                ", modelNumber=" + modelNumber +
                ", price=" + price +
                ", cpu=" + cpu +
                ", ram=" + ram +
                ", gpu=" + gpu +
                '}';
    }
}

class CPU {
    private String model;
    private int cores;
    private int threads;

    public CPU(String model, int cores, int threads) {
        this.model = model;
        this.cores = cores;
        this.threads = threads;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCores() {
        return cores;
    }

    public void setCores(int cores) {
        this.cores = cores;
    }

    public int getThreads() {
        return threads;
    }

    public void setThreads(int threads) {
        this.threads = threads;
    }
}

class RAM {
    private String model;
    private int capacity;
    private String type;

    public RAM(String model, int capacity, String type) {
        this.model = model;
        this.capacity = capacity;
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "RAM{" +
                "model='" + model + '\'' +
                ", capacity=" + capacity +
                ", type='" + type + '\'' +
                '}';
    }
}

class GPU {
    private String model;
    private int memorySize;
    private String memoryType;

    public GPU(String model, int memorySize, String memoryType) {
        this.model = model;
        this.memorySize = memorySize;
        this.memoryType = memoryType;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(int memorySize) {
        this.memorySize = memorySize;
    }

    public String getMemoryType() {
        return memoryType;
    }

    public void setMemoryType(String memoryType) {
        this.memoryType = memoryType;
    }

    @Override
    public String toString() {
        return "GPU{" +
                "model='" + model + '\'' +
                ", memorySize=" + memorySize +
                ", memoryType='" + memoryType + '\'' +
                '}';
    }
}


public class CompositionPrincilple {
    public static void main(String[] args) {
        // initialiare babeasca
        CPU cpu1 = new CPU("Intel" , 8 , 16);
        RAM ram1 = new RAM("ddr 5" ,16 , "DDR");
        GPU gpu1 = new GPU("Nvidia",32,"Gddr5");
        Laptop laptop1 = new Laptop(
                "MSI",
                23,
                233.3,
                cpu1,
                ram1,
                gpu1
        );
        System.out.println(laptop1);


        // initializare tinereasca

        Laptop laptop2 = new Laptop(
                "MSiI",
                2323,
                299.3,
                 new CPU("Intel" , 8 , 16),
                 new RAM("ddr 5" ,16 , "DDR"),
                 new GPU("Nvidia",32,"Gddr5")
        );
        System.out.println(laptop2);

    }
}
