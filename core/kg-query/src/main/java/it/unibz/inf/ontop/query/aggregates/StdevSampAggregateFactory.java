package it.unibz.inf.ontop.query.aggregates;

import it.unibz.inf.ontop.model.vocabulary.AGG;

public class StdevSampAggregateFactory extends StdevAggregateFactory {

    @Override
    public String getIri() {
        return AGG.STDEV_SAMP.getIRIString();
    }
}
