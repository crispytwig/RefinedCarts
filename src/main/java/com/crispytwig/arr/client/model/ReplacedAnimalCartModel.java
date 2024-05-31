package com.crispytwig.arr.client.model;

import com.crispytwig.arr.AstikorReduxRedux;
import com.crispytwig.arr.entity.ReplacedAnimalCartEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.DefaultedEntityGeoModel;

public class ReplacedAnimalCartModel extends DefaultedEntityGeoModel<ReplacedAnimalCartEntity> {
    public ReplacedAnimalCartModel() {
        super(new ResourceLocation(AstikorReduxRedux.MOD_ID, "animal_cart"));
    }
}
