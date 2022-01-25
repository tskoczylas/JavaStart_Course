import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import static org.junit.jupiter.api.Assertions.*;

class UnitTest {


    @Test
    void MovedCordinetesShuldBeDoubleOfXandY() {
        //givving
        int x=2;
        int y=2;
        Coordinates coordinates=new Coordinates(x,y);
        Unit unit=new Unit(coordinates,20,20);

        //when
        Coordinates move = unit.move(x, y);

        //then
        assertThat(move,is(equalTo(new Coordinates(x+x,y+y))));

        }



    @Test
    void WhenAddindCargoToUnitUseingAddCargoMethodCargoShouldBeAddedToUnitObject() {
        //given
        int phonesWeight = 40;
        Unit unit = new Unit(new Coordinates(2,3), 2, 80);
        Cargo phonesPackageCargo = new Cargo("phones",phonesWeight);
        //when
        unit.loadCargo(phonesPackageCargo);
        //then
       assertThat(unit.getLoad(),is(equalTo(phonesWeight)));
    }
    @Test
    void WhenAddindOverweightCargoToAddCargoMethodCargoShouldBeThrownIllegalStateException() {
        //given
        int addingOverWeight=120;
        Unit overWeightUnit = new Unit(new Coordinates(2,3), 2, 80);

        Cargo overWeightCargo = new Cargo("phones",addingOverWeight);

        //when
        //then
        assertThrows(IllegalStateException.class,()->overWeightUnit.loadCargo(overWeightCargo));
    }


    @Test
    void WhenUnloadCargoFromUnitUssingUnLoadCargoMethodCargoSguldBeRemove() {
        //given
        int phonesWeight = 40;
        Unit unit = new Unit(new Coordinates(2,3), 2, 80);
        Cargo phonesPackageCargo = new Cargo("phones",phonesWeight);
        //when
        unit.loadCargo(phonesPackageCargo);
        unit.unloadCargo(phonesPackageCargo);
        //then
        assertThat(unit.getLoad(),is(equalTo(0)));

    }

    @Test
    void unloadAllCargo() {
        //given
        int phonesWeight = 40;
        Unit unit = new Unit(new Coordinates(2,3), 2, 150);
        Cargo phonesPackageCargo = new Cargo("phones",phonesWeight);
        Cargo phonesPackageCargo1 = new Cargo("phones",phonesWeight);
        Cargo phonesPackageCargo2 = new Cargo("phones",phonesWeight);

        unit.loadCargo(phonesPackageCargo);
        unit.loadCargo(phonesPackageCargo1);
        unit.loadCargo(phonesPackageCargo2);

        //when
       unit.unloadAllCargo();

        //then
        assertThat(unit.getLoad(),is(equalTo(0)));


    }

    @Test
    void FuelShuldBeMaxFuelAfterCreatingNewUnitObject() {
        //given
        int maxFuel=2;
        Unit unit = new Unit(new Coordinates(2,3),2,3);

        //when
        //then
        assertThat(unit.getFuel(),is( maxFuel));


    }

    @Test
    void LoadShuldBeZeroAfterCreatingNewUnitObject() {
        //given
        Unit unit = new Unit(new Coordinates(2,3),2,3);

        //when
        //then
        assertThat(unit.getLoad(),is(0));

    }
}