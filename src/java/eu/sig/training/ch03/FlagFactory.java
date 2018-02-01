package eu.sig.training.ch03;

import java.awt.Color;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlagFactory {
	
	static Map<Nationality, List<Color>> flags = new HashMap<>();
	
	{
        flags.put(Nationality.DUTCH, Arrays.asList(Color.RED, Color.WHITE, Color.BLUE));
        flags.put(Nationality.GERMAN, Arrays.asList(Color.BLACK, Color.RED, Color.YELLOW));
        flags.put(Nationality.BELGIAN, Arrays.asList(Color.BLACK, Color.YELLOW, Color.RED));
        flags.put(Nationality.FRENCH, Arrays.asList(Color.BLUE, Color.WHITE, Color.RED));
        flags.put(Nationality.ITALIAN, Arrays.asList(Color.GREEN, Color.WHITE, Color.RED));
        flags.put(Nationality.ROMANIA, Arrays.asList(Color.BLUE, Color.YELLOW, Color.RED));
        flags.put(Nationality.IRELAND, Arrays.asList(Color.GREEN, Color.WHITE, Color.ORANGE));
        flags.put(Nationality.HUNGARIAN, Arrays.asList(Color.RED, Color.WHITE, Color.GREEN));
        flags.put(Nationality.BULGARIAN, Arrays.asList(Color.WHITE, Color.GREEN, Color.RED));
        flags.put(Nationality.RUSSIA, Arrays.asList(Color.WHITE, Color.BLUE, Color.RED));
        flags.put(Nationality.UNCLASSIFIED, Arrays.asList(Color.GRAY));
	}

    // tag::getFlag[]
    public List<Color> getFlagColors(Nationality nationality) {
        List<Color> result;
        result = flags.get( nationality );
        
        if ( result == null ) {
            result = flags.get(Nationality.UNCLASSIFIED);
        }
        return result;
    }
    // end::getFlag[]
}