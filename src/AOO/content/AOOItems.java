package AOO.content;

import mindustry.type.Item;

public class AOOItems {
    public static Item quantumSyntheticGold, ionicAlloys, opticalMixture;

    public static void load() {
        quantumSyntheticGold = new Item("quantum-synthetic-gold"){{
            cost = 1f;
        }};

        ionicAlloys = new Item("ionic-alloys"){{
            cost = 1f;
        }};

        opticalMixture = new Item("optical-mixture"){{
            cost = 1f;
        }};
    }
}
