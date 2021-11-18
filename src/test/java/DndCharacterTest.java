import com.github.jarikkomarik.DndCharacter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DndCharacterTest {
    @Test
    void calculateModifier_shouldReturnNeg5_whenConstitutionIs0(){                                                      //testing calculateModifier()
        Assertions.assertEquals(6, new DndCharacter().calculateModifier(3));
    }

    @Test
    void calculateModifier_shouldReturnNeg1_whenConstitutionIs9(){
        Assertions.assertEquals(9,new DndCharacter().calculateModifier(9));
    }
    @Test
    void calculateModifier_shouldReturn0_whenConstitutionIs10(){
        Assertions.assertEquals(10,new DndCharacter().calculateModifier(10));
    }

    @Test
    void calculateModifier_shouldReturn3_whenConstitutionIs16(){
        Assertions.assertEquals(14,new DndCharacter().calculateModifier(18));
    }

    @Test
    void generateAbilityValue_shouldReturn3_when_1111(){                                                                //testing generateAbilityValue()
        Assertions.assertEquals(3,new DndCharacter().generateAbilityValue(1,1,1,1));
    }
    @Test
    void generateAbilityValue_shouldReturn18_when_6666(){
        Assertions.assertEquals(18,new DndCharacter().generateAbilityValue(6,6,6,6));
    }
    @Test
    void generateAbilityValue_shouldReturn14_when_8421(){
        Assertions.assertEquals(14,new DndCharacter().generateAbilityValue(8,4,2,1));
    }

    @Test
    void generateAbilityValue_shouldReturn16_when_4466(){
        Assertions.assertEquals(16,new DndCharacter().generateAbilityValue(4,4,6,6));
    }

    @Test
    void constructor_shouldProduceValuesForVariables(){                                                                 //testing constructor()
        DndCharacter testDndCharacter = new DndCharacter();

        Assertions.assertTrue(testDndCharacter.getStrength() > 2 && testDndCharacter.getStrength() < 19);

        Assertions.assertTrue(testDndCharacter.getDexterity() > 2 && testDndCharacter.getDexterity() < 19);

        Assertions.assertTrue(testDndCharacter.getConstitution() > 2 && testDndCharacter.getConstitution() < 19);

        Assertions.assertTrue(testDndCharacter.getIntelligence() > 2 && testDndCharacter.getIntelligence() < 19);

        Assertions.assertTrue(testDndCharacter.getWisdom() > 2 && testDndCharacter.getWisdom() < 19);

        Assertions.assertTrue(testDndCharacter.getCharisma() > 2 && testDndCharacter.getCharisma() < 19);

        Assertions.assertTrue(testDndCharacter.getHitPoint() > 5 && testDndCharacter.getHitPoint() < 15);
    }
}
