 /*************************************************************************
 *  2014 BHGAGILE
 *  All Rights Reserved.
 *
 * NOTICE:  All information contained herein is, and remains
 * the property of BHGAGILE.
 */
package com.bhgagile.neuralnet;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Barnaby Golden
 *
 * @param <I> Input type
 * @param <O> Output type
 */
public abstract class AbstractNeuron<I, O> implements Neuron {

    /**
     * Processor.
     */
    private final Processor<I, O> processor;
    /**
     * List of upstream neurons.
     */
    private final List<Neuron> upstreamNeurons;

    /**
     * Processor is required for construction.
     * @param processor processor
     */
    public AbstractNeuron(final Processor<I, O> processor) {

        this.processor = processor;

        upstreamNeurons = new ArrayList<Neuron>();
    }

    /**
     * Do processing and return output.
     * @param outputs the list of outputs fed in to the processor
     * @return output
     */
    abstract Output<O> process(List<Output<I>> outputs);

    /**
     * Get processor for neuron.
     * @return processor
     */
    public final Processor<I, O> getProcessor() {
        return processor;
    }


    /**
     * {@inheritDoc}
     */
    public final void addUpstreamNeuron(final Neuron neuron) {

        upstreamNeurons.add(neuron);
    }

}
