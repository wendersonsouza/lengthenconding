package wenderson.ozorio.souza;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Length Encoder Test")
class LengthEncoderTest {

    @Test
    @DisplayName("An encoded text will be successfully returned")
    void givenText_returnEncondedText() throws Exception{
        String input = "aaaabbbccc";
        Assertions.assertEquals(LengthEncoder.encode(input), "a4b3c3"); ;
    }


}