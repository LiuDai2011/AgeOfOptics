package AOO.content;

import mindustry.content.Fx;
import mindustry.content.Items;
import mindustry.type.Category;
import mindustry.type.ItemStack;
import mindustry.world.Block;
import mindustry.world.blocks.production.GenericCrafter;

import static mindustry.type.ItemStack.with;

public class AOOBlocks {
    public static Block T1OpticalExtractor, T1OpticalCorrectionMachine;

    public static void load() {
        T1OpticalExtractor = new GenericCrafter("T1-optical-extractor"){{
            requirements(Category.crafting, with(AOOItems.quantumSyntheticGold, 1, AOOItems.ionicAlloys, 1, Items
                    .phaseFabric, 1, Items.surgeAlloy, 1, Items.copper, 1, Items.silicon, 1));

            craftEffect = Fx.pulverizeMedium;
            outputItem = new ItemStack(AOOItems.opticalMixture, 1);
            craftTime = 1f;
            itemCapacity = 20;
            size = 1;
            hasItems = true;
            hasPower = true;

            consumePower(50f);
            consumeItems(with(AOOItems.quantumSyntheticGold, 1, AOOItems.ionicAlloys, 1, Items.surgeAlloy, 1, Items.thorium, 1));
        }};

        T1OpticalCorrectionMachine = new GenericCrafter("T1-optical-correction-machine"){{
            requirements(Category.crafting, with(AOOItems.quantumSyntheticGold, 1, AOOItems.ionicAlloys, 1, Items
                    .phaseFabric, 1, Items.surgeAlloy, 1, Items.copper, 1, Items.silicon, 1));

            craftEffect = Fx.pulverizeMedium;
            outputItem = new ItemStack(AOOItems.opticalMixture, 1);
            craftTime = 1f;
            itemCapacity = 20;
            size = 2;
            hasItems = true;
            hasPower = true;

            consumePower(50f);
            consumeItems(with(AOOItems.quantumSyntheticGold, 1, AOOItems.ionicAlloys, 1, Items.surgeAlloy, 1, Items.thorium, 1));
        }};
    }
}
