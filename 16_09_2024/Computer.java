import java.util.Random;

public class Computer {
    String brand = "Unknown"; 
    String model = "Unknown"; 
    String processor = "Unknown"; 
    String RAM = "Unknown";
    
    String[] info = {
        "Brand - refers to the manufacturer or company that produces the computer or its components. Brands often signify quality, reliability, and customer support.",
        "Model - refers to a specific product or configuration produced by a brand. It indicates the particular version or series of a computer, which often includes details about its design, features, and performance specifications.",
        "Processor - or Central Processing Unit (CPU), is the primary component of a computer that performs most of the processing tasks. It executes instructions from programs and processes data. The performance of a computer is significantly influenced by its processor.",
        "RAM (Random Access Memory) - is a type of volatile memory used by the computer to store data that is actively being used or processed. It allows for quick read and write access to data, which improves overall system performance. RAM is temporary storage, and its contents are lost when the computer is turned off.",
        "Hard Drive - or Hard Disk Drive (HDD), is a non-volatile storage device used to store and retrieve digital information. It uses magnetic storage to record data on rotating disks and is commonly used for long-term data storage.",
        "Solid State Drive (SSD) - is a type of non-volatile storage device that uses flash memory to store data. Unlike HDDs, SSDs have no moving parts and provide faster data access speeds, higher reliability, and lower power consumption.",
        "Graphics Card - or GPU (Graphics Processing Unit), is a component responsible for rendering images, videos, and animations to be displayed on the monitor. It processes and accelerates graphics-related tasks and is crucial for gaming, video editing, and graphical applications.",
        "Motherboard - is the main circuit board of a computer that connects and allows communication between various components such as the CPU, RAM, storage devices, and peripheral devices. It houses the computer's essential circuitry and connectors.",
        "Power Supply Unit (PSU) - is a component that converts electrical power from an outlet into usable power for the computer's internal components. It supplies the necessary voltages and currents to ensure stable operation of the computer.",
        "Operating System (OS) - is system software that manages computer hardware and software resources and provides common services for computer programs. Examples include Windows, macOS, and Linux. The OS provides the user interface and coordinates the functions of the computer."
    };

    public Computer(String brand, String model, String processor, String RAM) {
        this.brand = brand;
        this.model = model;
        this.processor = processor;
        this.RAM = RAM;
    }

    public void displayInfo() {
        System.out.println("BRAND: " + brand);
        System.out.println("MODEL: " + model);
        System.out.println("PROCESSOR: " + processor);
        System.out.println("RAM: " + RAM + "\n");
    }

    public String getRandomElement() {
        Random randomGenerator = new Random();
        int index = randomGenerator.nextInt(info.length);
        return info[index];
    }

    public void getRandomFact() {
        String randomElement = getRandomElement();
        System.out.println("Random fact:\n" + randomElement + "\n\n");
    }
    
    public static void main(String[] args) {
        Computer sample1 = new Computer("Dell", "XPS 13", "Intel Core i7", "16 GB");
        Computer sample2 = new Computer("Apple", "MacBook Pro", "Apple M1", "32 GB");
        Computer sample3 = new Computer("Unknown", "Unknown", "Unknown", "Unknown");

        sample1.displayInfo();
        sample1.getRandomFact();
        
        sample2.displayInfo();
        sample2.getRandomFact();
        
        sample3.displayInfo();
        sample3.getRandomFact();
    } 
}

// If i try to run it on different file i have no idea how to compile it


