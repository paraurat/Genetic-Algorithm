package com.kleine.genetic.algorithm.gens;

import java.util.Arrays;
import java.util.List;

/**
 * A gene that can be evaluated against a trait.
 */
@FunctionalInterface
public interface Gene {

    /**
     * All available genes. Do not forget to register your genes here!
     */
    List<Gene> ALL_GENES = Arrays.asList(new FastGene(), new FastReactionGene(), new FlyingGene(), new HeavyGene(),
            new JumpsHighGene(), new LongTongueGene(), new PoisonGene(), new SlowGene(), new SmellsGoodGene(),
            new SpikeyTraitGene(), new WrithingGene());

    /**
     * Applies a trait on a gene and calculates the effect on the gene.
     *
     * @param trait the trait to evaluate
     * @return the positive or negative effect of this trait
     */
    float applyTrait(Trait trait);
}
