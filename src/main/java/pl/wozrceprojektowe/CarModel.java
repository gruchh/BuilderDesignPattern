package pl.wozrceprojektowe;

public enum CarModel {

    A3(CarBrand.AUDI),
    A4(CarBrand.AUDI),
    A6(CarBrand.AUDI),
    A8(CarBrand.AUDI),
    Q3(CarBrand.AUDI),
    Q5(CarBrand.AUDI),
    Q7(CarBrand.AUDI),
    Q8(CarBrand.AUDI),
    TT(CarBrand.AUDI),
    R8(CarBrand.AUDI),

    ABIA(CarBrand.SKODA),
    OCTAVIA(CarBrand.SKODA),
    SUPERB(CarBrand.SKODA),
    SCALA(CarBrand.SKODA),
    KAMIQ(CarBrand.SKODA),
    KAROQ(CarBrand.SKODA),
    KODIAQ(CarBrand.SKODA),
    CITIGO(CarBrand.SKODA),
    ENYAQ(CarBrand.SKODA),

    IBIZA(CarBrand.SEAT),
    LEON(CarBrand.SEAT),
    ARONA(CarBrand.SEAT),
    ATECA(CarBrand.SEAT),
    TARRACO(CarBrand.SEAT),
    MII(CarBrand.SEAT),
    ALHAMBRA(CarBrand.SEAT),
    TOLEDO(CarBrand.SEAT),
    CUPRA_FORMENTOR(CarBrand.SEAT),

    CIVIC(CarBrand.HONDA),
    ACCORD(CarBrand.HONDA),
    CR_V(CarBrand.HONDA),
    HR_V(CarBrand.HONDA),
    JAZZ(CarBrand.HONDA),
    INSIGHT(CarBrand.HONDA),
    PILOT(CarBrand.HONDA),
    RIDGELINE(CarBrand.HONDA),
    ODYSSEY(CarBrand.HONDA),
    NSX(CarBrand.HONDA),

    Golf(CarBrand.VOLKSWAGEN),
    Passat(CarBrand.VOLKSWAGEN),
    Polo(CarBrand.VOLKSWAGEN),
    Tiguan(CarBrand.VOLKSWAGEN),
    T_Roc(CarBrand.VOLKSWAGEN),
    Arteon(CarBrand.VOLKSWAGEN),
    Touareg(CarBrand.VOLKSWAGEN),
    Sharan(CarBrand.VOLKSWAGEN),
    Beetle(CarBrand.VOLKSWAGEN),
    Jetta(CarBrand.VOLKSWAGEN),
    Amarok(CarBrand.VOLKSWAGEN),
    Caddy(CarBrand.VOLKSWAGEN),
    T_Cross(CarBrand.VOLKSWAGEN),
    Taigo(CarBrand.VOLKSWAGEN),
    Touran(CarBrand.VOLKSWAGEN);


    private final CarBrand carBrand;

    CarModel(CarBrand carBrand) {
        this.carBrand = carBrand;
    }

    public CarBrand getCarBrand() {
        return carBrand;
    }
}
