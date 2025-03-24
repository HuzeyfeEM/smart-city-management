# AkilliSehirSistemi

AkilliSehirSistemi is a smart city management system that simulates various components of a city, including energy sources, buildings, and vehicles.

## Project Structure

```
AkilliSehirSistemi.java
controllers/
    EnergyManagement.java
    TrafficManagement.java
    WaterManagement.java
models/
    building/
    enerjySource/
    interfaces/
    user/
    vehicle/
views/
    AdminDashBoard.form
    AdminDashBoard.java
    AdminGiris.form
    AdminGiris.java
    ArabaEkleme.form
    ArabaEkleme.java
    ArabaGuncelleme.form
    ArabaGuncelleme.java
    BinaEkleme.form
    BinaEkleme.java
    BinaGuncelleme.form
    BinaGuncelleme.java
    EnerjiKaynagiEkelme.form
    EnerjiKaynagiEkelme.java
    EnerjiKaynagiGuncelleme.form
    ...
```

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- An IDE such as IntelliJ IDEA or Eclipse

### Running the Project

1. Clone the repository:
    ```sh
    git clone https://github.com/HuzeyfeEM/smart-city-management
    ```
2. Open the project in your IDE.
3. Navigate to `AkilliSehirSistemi.java`.
4. Run the `main` method in `AkilliSehirSistemi.java`.

### Main Components

- **Energy Sources**: Various types of energy sources like fossil fuels, solar, nuclear, wind, and water.
- **Buildings**: Smart buildings and traditional buildings.
- **Vehicles**: Different types of vehicles including electric cars, cars, buses, and motorcycles.

### Example Usage

The `AkilliSehirSistemi` class initializes various components of the city and displays the home view.

```java
public static void main(String[] args) {
    Home home = new Home();
    home.setLocationRelativeTo(null);
    home.setVisible(true);
}
```

## Contributing

1. Fork the repository.
2. Create a new branch (`git checkout -b feature-branch`).
3. Make your changes.
4. Commit your changes (`git commit -m 'Add some feature'`).
5. Push to the branch (`git push origin feature-branch`).
6. Open a pull request.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
