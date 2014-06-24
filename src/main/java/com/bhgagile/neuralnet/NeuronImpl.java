 /*************************************************************************
 *  2014 BHGAGILE
 *  All Rights Reserved.
 *
 * NOTICE:  All information contained herein is, and remains
 * the property of BHGAGILE.
 */
package com.bhgagile.neuralnet;

import java.util.List;

/**
 * @author Barnaby Golden
 *
 */
public final class NeuronImpl extends AbstractNeuron<Float, Float> {

    /**
     * Constructor sets the processor.
     * @param processor processor
     */
    public NeuronImpl(final Processor<Float, Float> processor) {
        super(processor);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    Output<Float> process(final List<Output<Float>> outputs) {

        return getProcessor().process(outputs);
    }

}
