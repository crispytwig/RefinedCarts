package com.crispytwig.arr.entity;

import de.mennomax.astikorcarts.AstikorCarts;
import de.mennomax.astikorcarts.entity.AnimalCartEntity;
import net.minecraft.world.entity.EntityType;
import software.bernie.geckolib.animatable.GeoEntity;
import software.bernie.geckolib.animatable.GeoReplacedEntity;
import software.bernie.geckolib.constant.DefaultAnimations;
import software.bernie.geckolib.core.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.core.animation.AnimatableManager;
import software.bernie.geckolib.core.animation.AnimationController;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.core.animation.RawAnimation;
import software.bernie.geckolib.core.object.PlayState;
import software.bernie.geckolib.util.GeckoLibUtil;

public class ReplacedAnimalCartEntity implements GeoReplacedEntity {
    protected static final RawAnimation MOVE = RawAnimation.begin().thenLoop("animation.animal_cart.move");

    private final AnimatableInstanceCache cache = GeckoLibUtil.createInstanceCache(this);


    @Override
    public EntityType<?> getReplacingEntityType() {
        return AstikorCarts.EntityTypes.ANIMAL_CART.get();
    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return cache;
    }
    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllers) {

        controllers.add(new AnimationController<>(this, "controller", 2, this::animController));
    }

    protected <E extends ReplacedAnimalCartEntity> PlayState animController(final AnimationState<E> event) {
        event.setControllerSpeed(event.getLimbSwingAmount());
        event.setAnimation(MOVE);
        return PlayState.CONTINUE;
    }
}
